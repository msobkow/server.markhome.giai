/*
 *	server.markhome.giai - Guided Intelligence Architecture Implementation v1.1 Core Services
 *	
 *	Copyright (c) 2016-2027 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *	
 *	The core foundation library CFLib is Licensed under the GNU Library General Public License, Version 3.0 or later; all other modules are Licensed under
 *	the GNU General Public License, Version 3.0 or later, or under a Commercial License purchased from Mark Stephen Sobkow by contacting him at mark.sobkow@gmail.com
 *	and negotiating terms to cover your legal requirements for your product and tool development plans, arrange payment using Canadian legal currency transfer
 *	facilities, and receive your customized Commercial License granting permission to extend and enhance the GNU GPL 3.0 or later licensed code base.
 *	
 *	In the event that you purchase a Commercial Development License, your License will be terminated if your organization distributes the application source
 *	code externally, allows external users to access the resulting applications, or the organization is rebranded, merged, or restructured, or if you violate
 *	International or Canadian Legal Restrictions on Software Development and Deployment.
 *	
 *	In the event that you purchase a Commercial Distribution License, your License will be terminated if your oganization is rebranded, merged, or restructured.
 *	
 *	In the event that you purchase a Transferrable Commercial License, your License is only terminated if your organization develops or produces illegal software
 *	tools and technologies according to International Treaty Law, or Laws of the Country of Canada, in accordance with the legal restrictions on Canadian Application
 *	Source Code Development, Deployment, and Distribution.
 *	
 *	Any one of these Licenses comprises your organization's "License". You may not use these files nor derive variations of them except in compliance with the
 *	License or Commercial License applicable to the source code files in question.
 *	
 *	Samples of the Commercial License permission grants are available at the following URL.  You should also have received samples of the commercial licenses with
 *	this module of application code or configuration and driver data.
 *	
 *		https://msobkow.github.io/mark-stephen-sobkows-licenses/
 *		file:sample-giai-v1_1-ethical-development-license.txt
 *		file:sample-giai-v1_1-ethical-deployment-license.txt
 *		file:sample-giai-v1_1-ethical-distribution-license.txt
 *		file:sample-giai-v1_1-transferrable-ethical-license.txt
 *	
 *	but do not actually grant any permissions to your organization as they have not yet been negotiated for, paid for, or delivered to your organization; they are
 *	only examples of what permissions the Commercial Licenses grant.
 *	
 *	You may obtain a copy of the Open Source Licenses supported at:
 *	
 *	    http://gnu.org/
 *	
 *	Unless required by applicable law or agreed to in writing, software distributed under the Licenses is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *	either express or implied, unless required by International Law and Treaty Agreements with Canada as a Signatory as interpreted by the International Criminal Court, the Canadian
 *	Constition, the Canadian Charter of Rights, or Canadian Federal Law as interpreted by our Supreme Court of Canada.  See the Licenses for the specific language governing permissions
 *	and limitations under the Licenses.
 *	
 *	If you wish to modify and use this code without publishing your changes, or integrate it with proprietary code, please contact Mark Stephen
 *	Sobkow for a commercial license at mark.sobkow@gmail.com.
 *	
 *	SPDX-License-Identifier: LGPL-3.0-or-later
 *	SPDX-License-Identifier: GPL-3.0-or-later
 */

package server.markhome.giai.v1_1.core;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import java.util.*;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Base interface for IGiAI key hashes, which expects to be extended as specific implementation.
 *
 * This foundation class provides essential support for n-digit hashes, usually based on the sizes of commmon hash algorithms like SHA-256, SHA-512, etc. It
 * includes methods for byte manipulation, comparison, and static initialization of hash buffers. It is designed to be extended by specific hash
 * implementations, such as IGiAIKeyHash256 or IGiAIKeyHash512. It also provides a consistent way to handle the underlying byte arrays, ensuring that all
 * derived classes can be compared and manipulated uniformly. One issue is that the base class may provide the "gateway" for synchronization of the hash buffer
 * attributes, so the static class data defined here is used as the thread synchronization coordinator, rather than attributes of the specialization classes. To
 * be fair, whether is even an issue really depends on what the JDK and JVM fine-print processing rules say about such specific cases.
 *
 *	@since 2026
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIKeyHashBase {

	/**
	 *	The service singleton has to be thread-safe.
	 */
	@JSProperty
	static final IGiAIMtReference singleton = IGiAIMtReference.getService().getInstance(null);

	/**
	 *	Get the service singleton.
	 *
	 *	@return The service singleton.
	 */
	@JSExport
	public static IGiAIKeyHashBase getService() {
		IGiAIKeyHashBase ref = ((IGiAIKeyHashBase)(singleton.get()));
		if (ref == null) {
			ref = new GiAIKeyHashBase();
			singleton.set(null, ref);
			ref = ((IGiAIKeyHashBase)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	The lowercase hexadecimal digits are used for the string formats.
	 */
	static final String hexDigits = "0123456789abcdef";

	/**
	 *	The first field is a UUID6 at offset 0.
	 */
	static final int UUID6_INDEX = 0;

	/**
	 *	The Uuid6 type provides its size in bytes.
	 */
	static final int UUID6_LENGTH = IGiAIUuid6.TOTAL_BYTES;

	/**
	 *	The second field is the counter index, offset by the UUID6_LENGTH.
	 */
	static final int COUNTER_INDEX = 28;

	/**
	 *	The counter is a 64 bit signed integer, and increments sequentially.
	 */
	static final int COUNTER_LENGTH = 8;

	/**
	 *	The third field is a cluster code, offset by the UUID6_LENGTH and the COUNTER_LENGTH.
	 */
	static final int CLUSTERCODE_INDEX = 36;

	/**
	 *	Cluster codes are also 64-bit signed integers, generated by the GiAI security server when the connection is logged in.
	 */
	static final int CLUSTERCODE_LENGTH = 8;

	/**
	 *	The fourth field is a process id, offset by the UUID6_LENGTH, COUNTER_LENGTH, and CLUSTERCODE_LENGTH.
	 */
	static final int PID_INDEX = 44;

	/**
	 *	Process ids are also 64 bit integers on most modern platforms.
	 */
	static final int PID_LENGTH = 8;

	/**
	 *	The fifth field is a thread id, offset by the UUID6_LENGTH, COUNTER_LENGTH, CLUSTERCODE_LENGTH, and PID_LENGTH.
	 */
	static final int THREAD_INDEX = 52;

	/**
	 *	Thread ids are also usually 64 bit integers on most modern platforms.
	 */
	static final int THREAD_LENGTH = 8;

	/**
	 *	The total header bytes is the sum of the UUID6_LENGTH, COUNTER_LENGTH, CLUSTERCODE_LENGTH, PID_LENGTH, and THREAD_LENGTH.
	 */
	static final int HEADER_BYTES = 60;

	/**
	 *	We want a minimum of a 512-bit value to be hashed, so we'll add that to the header byte count for our total number of bytes for randomization buffers.
	 */
	static final int WANT_TOTAL_BYTES = ( 512 / 8 ) + HEADER_BYTES;

	/**
	 *	After the header bytes come some random bytes.
	 */
	static final int RANDBYTES_INDEX = HEADER_BYTES;

	/**
	 *	Only 8 random bytes are used currently.
	 */
	static final int RANDBYTES_LENGTH = WANT_TOTAL_BYTES - RANDBYTES_INDEX;

	/**
	 *	The total number of bytes is the number of bytes we decided we wanted.
	 */	
	static final int TOTAL_BYTES = WANT_TOTAL_BYTES;

	/**
	 *	We use the number of runtimer processors times an SMP scaling factor of 2 as the maximum number of running concurrent threads/digests required.
	 */
	static final int CONCURRENT_DIGESTS = Runtime.getRuntime().availableProcessors() * 2;

	/**
	 *	A set of CONCURRENT_DIGESTS byte arrays of TOTAL_BYTES size will be allocated when the static data is initialized. Access to these buffers is
	 *	synchronized, so they do not have to be made volatile values.
	 */
	static ByteBuffer[] hashBuffer = null;

	/**
	 *	The rotator is a volatile integer used to rotate through the concurrent digests.
	 */
	static volatile int rotator = 0;

	/**
	 *	The counter is a volatile integer that gets incremented and the value copied into the appropriate header field of the selected concurrent digest.
	 */
	static volatile long counter = 1;

	/**
	 *	IGiAIKeyHashBase getInstance()
	 *		Get an instance that provides the service method implementations.
	 *
	 *	@return IGiAIKeyHashBase The instance implementation.
	 */
	@JSExport
	public static IGiAIKeyHashBase getInstance() {
		return(new GiAIKeyHashBase());
	}

	/**
	 *	String nullString()
	 *		Get a null value string.
	 *
	 *	@return String The null value string.
	 */
	@JSExport
	public String nullString();

	/**
	 *	int getHashLength()
	 *		Get the length of the hash value.
	 *
	 *	@return The length of hashed values (size of the byte arrays.)
	 */
	@JSExport
  	public int getHashLength();

	/**
	 *	int getHashLengthString()
	 *		Get the length of the hash value string form.
	 *
	 *	@return The length of hashed value strings.
	 */
	@JSExport
  	public int getHashLengthString();

	/**
	 *	String getHashAlgo()
	 *		Get the name of the hash algorithm used.
	 *
	 *	@return The name of the hash algorithm used.
	 */
	@JSExport
  	public String getHashAlgo();

	/**
	 *	int compare(b)
	 *		Compare an instance.
	 *
	 *	@return less than zero if this is less than B, greater than zero if this is greater than B, otherwise zero.
	 */
	@JSExport
  	public int compare(IGiAIKeyHashBase b);

	/**
	 *	int compareOrdered(b)
	 *		Compare two instances.
	 *
	 *	@return less than zero if this is less than B, greater than zero if this is greater than B, otherwise zero.
	 */
	@JSExport
  	public int compareOrdered(IGiAIKeyHashBase b);

	/**
	 *	byte[] sbytesFromHex(s)
	 *		Calculate a hash byte array from a hexadecimal string.
	 *
	 *	@param s The string of hexadecimal characters, no more than getHashLengthString() characters long.
	 *
	 *	@return A byte array or null if the string s is null.
	 */
	@JSExport
  	public static byte[] sbytesFromHex(String s);

	/**
	 *	Comparator<IGiAIKeyHashBase> getComparator()
	 *		Get a Comparator instance for the keys.
	 *
	 *	@return A Comparator for the key instances.
	 */
	@JSExport
	public static Comparator<IGiAIKeyHashBase> getComparator();

	/**
	 *	byte[] getBytes()
	 *		Get the byte array for this key.
	 *
	 *	@return The byte array for this key.
	 */
	@JSExport
	public byte[] getBytes();

	/**
	 *	void setBytes(a)
	 *		Set the byte array for the key to a copy of the byte array a. If a is null, set the key data to zeroes.  We want the KeyHash to be immutable so this method shouldn't even exist, but it is necessary for JPA. This is the only code that should use this method.
	 *
	 *	@param a The byte array to use for the update.  If it is null, then the key data is set to zeroes.
	 */
	@JSExport
	public void setBytes(byte[] a);

	/**
	 *	void setBytes(a, o, l)
	 *		Set the byte array for the key to a copy of the byte array a starting at the offset o for the length l. If a is null, set the key data to zeroes.  We want the KeyHash to be immutable so this method shouldn't even exist, but it is necessary for JPA. This is the only code that should use this method.
	 *
	 *	@param a The byte array to use for the update.  If it is null, then the key data is set to zeroes.
	 *	@param o The offset into the array a
	 *	@param l The number of bytes to copy from array a
	 */
	@JSExport
	public void setBytes(byte[] a, int o, int l) {
		if(a == null) {
			setNull();
		}
		else {
			if(o < 0) {
				throw IGiAIArgumentUnderflowException.getInstance(GiAIKeyHash128.class, "setBytes", 2, "o", o, 0);
			}
			if(l < 0) {
				throw IGiAIArgumentUnderflowException.getInstance(GiAIKeyHash128.class, "setBytes", 3, "l", l, 0);
			}
			bytes = Arrays.clone(a, o, l);
		}
	}

	/**
	 *	boolean isNull()
	 *		Is this key null valued?
	 *
	 *	@return True if this key is null valued, otherwise false.
	 */
	@JSExport
  	public boolean isNull();
}
