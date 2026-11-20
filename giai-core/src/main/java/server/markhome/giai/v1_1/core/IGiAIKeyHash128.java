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

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *	IGiAIKeyHash128 implements a 128-bit key hash using a HASHALGO algorithm.
 *
 *	@since 2026
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIKeyHash128 extends IGiAIKeyHashBase<IGiAIKeyHash128> {

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
	public static IGiAIKeyHash128 getService() {
		IGiAIKeyHash128 ref = ((IGiAIKeyHash128)(singleton.get()));
		if (ref == null) {
			ref = new GiAIKeyHash128();
			singleton.set(null, ref);
			ref = ((IGiAIKeyHash128)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	IGiAIKeyHash128 getInstance()
	 *		Get an instance that provides the service method implementations.
	 *
	 *	@return IGiAIKeyHash128 The instance implementation.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance() {
		return(new GiAIKeyHash128());
	}

	/**
	 *	IGiAIKeyHash128 getInstance(i)
	 *		Get an instance that provides the service method implementations with a generated value.
	 *
	 *	@param Dummy integer parameter to indicate a key value should be generated.
	 *
	 *	@return IGiAIKeyHash128 The instance implementation with a generated value.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance(int i) {
		return(new GiAIKeyHash128(i));
	}

	/**
	 *	IGiAIKeyHash128 getInstance(s)
	 *		Get an instance that provides the service method implementations with a generated value.
	 *
	 *	@param s The string of hexadecimal characters, no more than getHashLengthString() characters long.
	 *
	 *	@return An instance which may be a null if the string s is null.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance(String s) {
		return(new GiAIKeyHash128(s));
	}

	/**
	 *	IGiAIKeyHash128 getInstance(a)
	 *		Get an instance using the specified byte array as an initializer for the hash data.
	 *
	 *	@param a The byte array to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the byte array a is null.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance(byte[] a) {
		return(new GiAIKeyHash128(a));
	}

	/**
	 *	IGiAIKeyHash128 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance(IGiAIKeyHash128 k) {
		return(new GiAIKeyHash128(k));
	}

	/**
	 *	IGiAIKeyHash128 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance(IGiAIKeyHash160 k) {
		return(new GiAIKeyHash128(k));
	}

	/**
	 *	IGiAIKeyHash128 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance(IGiAIKeyHash224 k) {
		return(new GiAIKeyHash128(k));
	}

	/**
	 *	IGiAIKeyHash128 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance(IGiAIKeyHash256 k) {
		return(new GiAIKeyHash128(k));
	}

	/**
	 *	IGiAIKeyHash128 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance(IGiAIKeyHash384 k) {
		return(new GiAIKeyHash128(k));
	}

	/**
	 *	IGiAIKeyHash128 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash128 getInstance(IGiAIKeyHash512 k) {
		return(new GiAIKeyHash128(k));
	}

	/**
	 *	IGiAIKeyHash128 fromInt(i)
	 *		Get an instance that uses the integer i to initialize the first 4 bytes of the key data.
	 *
	 *	@return IGiAIKeyHash128 An instance that uses the integer i to initialize the first 4 bytes of the key data.
	 */
	@JSExport
	public static IGiAIKeyHash128 fromInt(int i) {
		return(new GiAIKeyHash128(i));
	}

	/**
	 *	IGiAIKeyHash128 nullGet()
	 *		Get a null instance.
	 *
	 *	@return IGiAIKeyHash128 A null instance
	 */
	@JSExport
	public static IGiAIKeyHash128 nullGet() {
		return(new GiAIKeyHash128());
	}

	/**
	 *	String nullString()
	 *		Get a null value string.
	 *
	 *	@return String The null value string.
	 */
	@JSExport
	public String nullString() {
		return(NULL_STRING);
	}

	/**
	 *	int getHashLength()
	 *		Get the length of the hash value.
	 *
	 *	@return The length of hashed values (size of the byte arrays.)
	 */
	@JSExport
  	public int getHashLength() {
		return(HASH_LENGTH);
	}

	/**
	 *	int getHashLengthString()
	 *		Get the length of the hash value string form.
	 *
	 *	@return The length of hashed value strings.
	 */
	@JSExport
  	public int getHashLengthString() {
		return(HASH_LENGTH_STRING);
	}

	/**
	 *	String getHashAlgo()
	 *		Get the name of the hash algorithm used.
	 *
	 *	@return The name of the hash algorithm used.
	 */
	@JSExport
  	public String getHashAlgo() {
		return(HASH_ALGO);
	}

	/**
	 *	int compare()
	 *		Compare two instances.
	 *
	 *	@return less than zero if A is less than B, greater than zero if A is greater than B, otherwise zero.
	 */
	@JSExport
  	public static int compare(IGiAIKeyHash128 a, IGiAIKeyHash128 b) {
		if(a != null) {
			if(b != null) {
				return(a.compare(b));
			}
			else {
				return(1);
			}
		}
		else {
			if(b != null) {
				return(-1);
			}
			else {
				return(0);
			}
		}
	}

	/**
	 *	int compare(b)
	 *		Compare an instance.
	 *
	 *	@return less than zero if this is less than B, greater than zero if this is greater than B, otherwise zero.
	 */
	@JSExport
  	public int compare(IGiAIKeyHash128 b) {
		if(b != null) {
			return(Arrays.compare(a.getBytes(), b.getBytes()));
		}
		else {
			return(1);
		}
	}

	/**
	 *	int compareOrdered()
	 *		Compare two instances.
	 *
	 *	@return less than zero if A is less than B, greater than zero if A is greater than B, otherwise zero.
	 */
	@JSExport
  	public static int compareOrdered(IGiAIKeyHash128 a, IGiAIKeyHash128 b) {
		if(a != null) {
			if(b != null) {
				return(a.compareOrdered(b));
			}
			else {
				return(1);
			}
		}
		else {
			if(b != null) {
				return(-1);
			}
			else {
				return(0);
			}
		}
	}

	/**
	 *	int compareOrdered()
	 *		Compare two instances.
	 *
	 *	@return less than zero if this is less than B, greater than zero if this is greater than B, otherwise zero.
	 */
	@JSExport
  	public int compareOrdered(IGiAIKeyHash128 b);

	/**
	 *	void initStatics()
	 *		Initialize the statics.
	 */
	@JSExport
  	public static void initStatics();

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
	 *	IGiAIKeyHash128 fromHex(s)
	 *		Create an instance from a hexadecimal string.
	 *
	 *	@param s The string of hexadecimal characters, no more than getHashLengthString() characters long.
	 *
	 *	@return An instance or null.
	 */
	@JSExport
  	public static IGiAIKeyHash128 fromHex(String s);

	/**
	 *	Comparator<IGiAIKeyHash128> getComparator()
	 *		Get a Comparator instance for the keys.
	 *
	 *	@return A Comparator for the key instances.
	 */
	@JSExport
	public static Comparator<IGiAIKeyHash128> getComparator();

	/**
	 *	byte[] getBytes(k)
	 *		Get the byte array for key value k.
	 *
	 *	@param k The key value to be evaluated.
	 *
	 *	@return The byte array for key value k, or null if k is null.
	 */
	@JSExport
	public static byte[] getBytes(IGiAIKeyHash128 k) {
		if(k != null) {
			return(k.getBytes());
		}
		else {
			return(null);
		}
	}

	/**
	 *	byte[] getBytes()
	 *		Get the byte array for this key.
	 *
	 *	@return The byte array for this key.
	 */
	@JSExport
	public byte[] getBytes();

	/**
	 *	void setBytes(k, a)
	 *		Set the byte array for key value k to a copy of the byte array a. If a is null, set k's key data to zeroes.  We want the KeyHash to be immutable so this method shouldn't even exist, but it is necessary for JPA. This is the only code that should use this method.
	 *
	 *	@param k The key value to be updated.
	 *	@param a The byte array to use for the update.  If it is null, then k's key data is set to zeroes.
	 */
	@JSExport
	public static void setBytes(IGiAIKeyHash128 k, byte[] a) {
		if(k != null) {
			k.setBytes(a);
		}
		else {
			throw IGiAINullArgumentException.getInstance(GiAIKeyHash128.class, "setBytes", 1, "k");
		}
	}

	/**
	 *	void setBytes(a)
	 *		Set the byte array for the key to a copy of the byte array a. If a is null, set the key data to zeroes.  We want the KeyHash to be immutable so this method shouldn't even exist, but it is necessary for JPA. This is the only code that should use this method.
	 *
	 *	@param a The byte array to use for the update.  If it is null, then the key data is set to zeroes.
	 */
	@JSExport
	public void setBytes(byte[] a);

	/**
	 *	void setBytes(k, a, o, l)
	 *		Set the byte array for key value k to a copy of the byte array a starting at the offset o for the length l. If a is null, set k's key data to zeroes.  We want the KeyHash to be immutable so this method shouldn't even exist, but it is necessary for JPA. This is the only code that should use this method.
	 *
	 *	@param k The key value to be updated.
	 *	@param a The byte array to use for the update.  If it is null, then k's key data is set to zeroes.
	 *	@param o The offset into the array a
	 *	@param l The number of bytes to copy from array a
	 */
	@JSExport
	public static void setBytes(IGiAIKeyHash128 k, byte[] a, int o, int l) {
		if(k != null) {
			if(o < 0) {
				throw IGiAIArgumentUnderflowException.getInstance(GiAIKeyHash128.class, "setBytes", 2, "o", o, 0);
			}
			if(l < 0) {
				throw IGiAIArgumentUnderflowException.getInstance(GiAIKeyHash128.class, "setBytes", 3, "l", l, 0);
			}
			k.setBytes(a, o, l);
		}
		else {
			throw IGiAINullArgumentException.getInstance(GiAIKeyHash128.class, "setBytes", 1, "k");
		}
	}

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
	 *	boolean isNull(k)
	 *		Is the key k null valued?
	 *
	 *	@return True if k is null or null valued, otherwise false.
	 */
	@JSExport
  	public static boolean isNull(IGiAIKeyHash128 k) {
		if(k != null) {
			return(k.isNull());
		}
		else {
			return(true);
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

	/**
	 *	IGiAIKeyHash128 hash(s)
	 *		Create an instance by hashing the string s.
	 *
	 *	@param s The string to be hashed.
	 *
	 *	@return An instance or null if s is null.
	 */
	@JSExport
  	public static IGiAIKeyHash128 hash(String s);

	/**
	 *	IGiAIKeyHash128 hash(a)
	 *		Create an instance by hashing the byte array a.
	 *
	 *	@param a The byte array to be hashed.
	 *
	 *	@return An instance or null if a is null.
	 */
	@JSExport
  	public static IGiAIKeyHash128 hash(byte[] a);

	/**
	 *	IGiAIKeyHash128 hash(a...)
	 *		Create an instance by hashing the byte arrays a and ....
	 *
	 *	@param a... The byte arrays to be hashed.
	 *
	 *	@return An instance or null if a is null and no other arrays are specified.
	 */
	@JSExport
  	public static IGiAIKeyHash128 hash(byte[]... a);

	/**
	 *	IGiAIKeyHash128 hash(k...)
	 *		Create an instance by hashing the keys k and ....
	 *
	 *	@param k... The keys to be hashed.
	 *
	 *	@return An instance or null if k is null and no other keys are specified.
	 */
	@JSExport
  	public static IGiAIKeyHash128 hash(IGiAIKeyHash128... k);

	/**
	 *	IGiAIKeyHash128 hash(i...)
	 *		Create an instance by hashing the integers i and ....
	 *
	 *	@param k... The integers to be hashed.
	 *
	 *	@return An instance.
	 */
	@JSExport
  	public static IGiAIKeyHash128 hash(int... k);

	/**
	 *	IGiAIKeyHash128 hash(a...)
	 *		Create an instance by hashing the integer arrays a and ....
	 *
	 *	@param a... The integer arrays to be hashed.
	 *
	 *	@return An instance, or null if a is null and no other arrays are specified.
	 */
	@JSExport
  	public static IGiAIKeyHash128 hash(int[]... a);

	/**
	 *	IGiAIKeyHash128 deepClone(k)
	 *		Create an instance by deep cloning the key data for k.
	 *
	 *	@param k The key value to clone.
	 *
	 *	@return An instance, or null if k is null.
	 */
	@JSExport
  	public static IGiAIKeyHash128 deepClone(IGiAIKeyHash128 k) {
		return(new GiAIKeyHash128(k));
	}

	/**
	 *	IGiAIKeyHash128 deepClone()
	 *		Create an instance by deep cloning this key's data.
	 *
	 *	@return An instance cloned from this one.
	 */
	@JSExport
  	public IGiAIKeyHash128 deepClone();

	/**
	 *	IGiAIKeyHash128 fromHexQuick(s)
	 *		Create an instance by converting String s from hexadecimal.
	 *
	 *	@param s The hexadecimal string to convert.
	 *
	 *	@return An instance, or null if s is null.
	 */
	@JSExport
  	public static IGiAIKeyHash128 fromHexQuick(String s) {
		return(new GiAIKeyHash128(s));
	}

	/**
	 *	IGiAIKeyHash128[] toKeyHashes(a)
	 *		Create an array of instances from an array of hexadecimal strings.
	 *
	 *	@param a The array of hexadecimal strings to convert.
	 *
	 *	@return An array of instances, or null if a was null.
	 */
	@JSExport
  	public static IGiAIKeyHash128[] toKeyHashes(String[] a) {
		if(a == null) {
			return(null);
		}
		GiAIKeyHash128[] arr = new IGiAIKeyHash128[a.length()];
		int i = 0;
		for(String s: a) {
			if(s != null) {
				arr[i++] = new GiAIKeyHash128(s);
			}
			else {
				arr[i++] = null;
			}
		}
		return(arr);
	}

	/**
	 *	List<IGiAIKeyHash128> toKeyHashesList(a)
	 *		Create a list of instances from an array of hexadecimal strings.
	 *
	 *	@param a The array of hexadecimal strings to convert.
	 *
	 *	@return A list of instances, or null if a was null.
	 */
	@JSExport
  	public static List<IGiAIKeyHash128> toKeyHashesList(String[] a) {
		if(a == null) {
			return(null);
		}
		ArrayList<IGiAIKeyHash128> arr = new ArrayList<>(a.length());
		int i = 0;
		for(String s: a) {
			if(s != null) {
				arr.add(new GiAIKeyHash128(s));
			}
			else {
				arr.add(null);
			}
		}
		return(arr);
	}

	/**
	 *	Set<IGiAIKeyHash128> toKeyHashesSet(a)
	 *		Create a set of instances from an array of hexadecimal strings.
	 *
	 *	@param a The array of hexadecimal strings to convert.
	 *
	 *	@return A set of instances, or null if a was null.
	 */
	@JSExport
  	public static Set<IGiAIKeyHash128> toKeyHashesSet(String[] a) {
		if(a == null) {
			return(null);
		}
		HashSet<IGiAIKeyHash128> set = new HashSet<>(a.length());
		int i = 0;
		for(String s: a) {
			if(s != null) {
				set.add(new GiAIKeyHash128(s));
			}
			else {
				if(!set.contains(null)) {
					set.add(null);
				}
			}
		}
		return(set);
	}
}
