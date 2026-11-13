/**
 *	server.markhome.giai-core - Guided Intelligence Architecture Implementation Core Services
 *
 *	Copyright 2026 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://apache.org
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	SPDX-License-Identifier: Apache-2.0
**/

package server.markhome.giai;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import java.util.*;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *	IGiAIKeyHash256 implements a 256-bit key hash using a HASHALGO algorithm.
 *
 *	@since 2026
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIKeyHash256 extends IGiAIKeyHashBase<IGiAIKeyHash256> {

	/**
	 *	The service singleton has to be thread-safe.
	 */
	static final IGiAIMtReference singleton = IGiAIMtReference.getService().getInstance();

	/**
	 *	Get the service singleton.
	 *
	 *	@return The service singleton.
	 */
	@JSExport
	public static IGiAIKeyHash256 getService() {
		IGiAIKeyHash256 ref = ((IGiAIKeyHash256)(singleton.get()));
		if (ref == null) {
			ref = new GiAIKeyHash256();
			singleton.set(null, ref);
			ref = ((IGiAIKeyHash256)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance()
	 *		Get an instance that provides the service method implementations.
	 *
	 *	@return IGiAIKeyHash256 The instance implementation.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance();

	/**
	 *	IGiAIKeyHash256 getInstance()
	 *		Get an instance that provides the service method implementations.
	 *
	 *	@return IGiAIKeyHash256 The instance implementation.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance();

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance(i)
	 *		Get an instance that provides the service method implementations with a generated value.
	 *
	 *	@param Dummy integer parameter to indicate a key value should be generated.
	 *
	 *	@return IGiAIKeyHash256 The instance implementation with a generated value.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance(int i);

	/**
	 *	IGiAIKeyHash256 getInstance(i)
	 *		Get an instance that provides the service method implementations with a generated value.
	 *
	 *	@param Dummy integer parameter to indicate a key value should be generated.
	 *
	 *	@return IGiAIKeyHash256 The instance implementation with a generated value.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(int i);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance(s)
	 *		Get an instance that provides the service method implementations with a generated value.
	 *
	 *	@param s The string of hexadecimal characters, no more than GiAIKeyHash256_getHashLengthString() characters long.
	 *
	 *	@return An instance which may be a null if the string s is null.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance(String s);

	/**
	 *	IGiAIKeyHash256 getInstance()
	 *		Get an instance that provides the service method implementations with a generated value.
	 *
	 *	@param s The string of hexadecimal characters, no more than GiAIKeyHash256_getHashLengthString() characters long.
	 *
	 *	@return An instance which may be a null if the string s is null.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(String s);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance(a)
	 *		Get an instance using the specified byte array as an initializer for the hash data.
	 *
	 *	@param a The byte array to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the byte array a is null.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance(byte[] a);

	/**
	 *	IGiAIKeyHash256 getInstance(a)
	 *		Get an instance using the specified byte array as an initializer for the hash data.
	 *
	 *	@param a The byte array to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the byte array a is null.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(byte[] a);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance(IGiAIKeyHash128 k);

	/**
	 *	IGiAIKeyHash256 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(IGiAIKeyHash128 k);

	/**
	 *	IGiAIKeyHash256 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(IGiAIKeyHash160 k);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance(IGiAIKeyHash160 k);

	/**
	 *	IGiAIKeyHash256 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(IGiAIKeyHash224 k);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance(IGiAIKeyHash224 k);

	/**
	 *	IGiAIKeyHash256 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(IGiAIKeyHash256 k);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance(IGiAIKeyHash256 k);

	/**
	 *	IGiAIKeyHash256 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(IGiAIKeyHash384 k);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance(IGiAIKeyHash384 k);

	/**
	 *	IGiAIKeyHash256 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(IGiAIKeyHash512 k);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_getInstance(IGiAIKeyHash512 k);

	/**
	 *	IGiAIKeyHash256 getInstance(k)
	 *		Get an instance using the specified key as an initializer for the hash data.
	 *
	 *	@param k The key to use to initialize the hash data.
	 *
	 *	@return An instance which may be a null if the key k is null.
	 */
	@JSExport
	public IGiAIKeyHash256 getInstance(IGiAIKeyHash256 k);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_fromInt(i)
	 *		Get an instance that uses the integer i to initialize the first 4 bytes of the key data.
	 *
	 *	@return IGiAIKeyHash256 An instance that uses the integer i to initialize the first 4 bytes of the key data.
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_fromInt(int i);

	/**
	 *	IGiAIKeyHash256 fromInt(i)
	 *		Get an instance that uses the integer i to initialize the first 4 bytes of the key data.
	 *
	 *	@return IGiAIKeyHash256 An instance that uses the integer i to initialize the first 4 bytes of the key data.
	 */
	@JSExport
	public IGiAIKeyHash256 fromInt(int i);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_nullGet()
	 *		Get a null instance.
	 *
	 *	@return IGiAIKeyHash256 A null instance
	 */
	@JSExport
	public static IGiAIKeyHash256 GiAIKeyHash256_nullGet();

	/**
	 *	IGiAIKeyHash256 nullGet()
	 *		Get a null instance.
	 *
	 *	@return IGiAIKeyHash256 A null instance.
	 */
	@JSExport
	public IGiAIKeyHash256 nullGet();

	/**
	 *	String GiAIKeyHash256_nullString()
	 *		Get a null value string.
	 *
	 *	@return String The null value string.
	 */
	@JSExport
	public static String GiAIKeyHash256_nullString();

	/**
	 *	String nullString()
	 *		Get the null value string.
	 *
	 *	@return  String the null value string.
	 */
	@JSExport
	public String nullString();

	/**
	 *	int GiAIKeyHash256_getHashLength()
	 *		Get the length of the hash value.
	 *
	 *	@return The length of hashed values (size of the byte arrays.)
	 */
	@JSExport
  	public static int GiAIKeyHash256_getHashLength();

	/**
	 *	int getHashLength()
	 *		Get the length of the hash value.
	 *
	 *	@return The length of hashed values (size of the byte arrays.)
	 */
	@JSExport
  	public int getHashLength();

	/**
	 *	int GiAIKeyHash256_getHashLengthString()
	 *		Get the length of the hash value string form.
	 *
	 *	@return The length of hashed value strings.
	 */
	@JSExport
  	public static int GiAIKeyHash256_getHashLengthString();

	/**
	 *	int getHashLengthString()
	 *		Get the length of the hash value string form.
	 *
	 *	@return The length of hashed value strings.
	 */
	@JSExport
  	public int getHashLengthString();

	/**
	 *	String GiAIKeyHash256_getHashAlgo()
	 *		Get the name of the hash algorithm used.
	 *
	 *	@return The name of the hash algorithm used.
	 */
	@JSExport
  	public static String GiAIKeyHash256_getHashAlgo();

	/**
	 *	String getHashAlgo()
	 *		Get the name of the hash algorithm used.
	 *
	 *	@return The name of the hash algorithm used.
	 */
	@JSExport
  	public String getHashAlgo();

	/**
	 *	int GiAIKeyHash256_compare()
	 *		Compare two instances.
	 *
	 *	@return less than zero if A is less than B, greater than zero if A is greater than B, otherwise zero.
	 */
	@JSExport
  	public static int GiAIKeyHash256_compare(IGiAIKeyHash256 a, IGiAIKeyHash256 b);

	/**
	 *	int compare(b)
	 *		Compare an instance.
	 *
	 *	@return less than zero if this is less than B, greater than zero if this is greater than B, otherwise zero.
	 */
	@JSExport
  	public int compare(IGiAIKeyHash256 b);

	/**
	 *	int GiAIKeyHash256_compareOrdered()
	 *		Compare two instances.
	 *
	 *	@return less than zero if A is less than B, greater than zero if A is greater than B, otherwise zero.
	 */
	@JSExport
  	public static int GiAIKeyHash256_compareOrdered(IGiAIKeyHash256 a, IGiAIKeyHash256 b);

	/**
	 *	int compareOrdered()
	 *		Compare two instances.
	 *
	 *	@return less than zero if this is less than B, greater than zero if this is greater than B, otherwise zero.
	 */
	@JSExport
  	public int compareOrdered(IGiAIKeyHash256 b);

	/**
	 *	void GiAIKeyHash256_initStatics()
	 *		Initialize the statics.
	 */
	@JSExport
  	public static void GiAIKeyHash256_initStatics();

	/**
	 *	byte[] GiAIKeyHash256_sbytesFromHex(s)
	 *		Calculate a hash byte array from a hexadecimal string.
	 *
	 *	@param s The string of hexadecimal characters, no more than GiAIKeyHash256_getHashLengthString() characters long.
	 *
	 *	@return A byte array or null if the string s is null.
	 */
	@JSExport
  	public static byte[] GiAIKeyHash256_sbytesFromHex(String s);

	/**
	 *	byte[] sbytesFromHex(s)
	 *		Calculate a hash byte array from a hexadecimal string.
	 *
	 *	@param s The string of hexadecimal characters, no more than GiAIKeyHash256_getHashLengthString() characters long.
	 *
	 *	@return A byte array or null if the string s is null.
	 */
	@JSExport
  	public byte[] sbytesFromHex(String s);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_fromHex(s)
	 *		Create an instance from a hexadecimal string.
	 *
	 *	@param s The string of hexadecimal characters, no more than GiAIKeyHash256_getHashLengthString() characters long.
	 *
	 *	@return An instance or null.
	 */
	@JSExport
  	public static IGiAIKeyHash256 GiAIKeyHash256_fromHex(String s);

	/**
	 *	IGiAIKeyHash256 fromHex(s)
	 *		Create an instance from a hexadecimal string.
	 *
	 *	@param s The string of hexadecimal characters, no more than GiAIKeyHash256_getHashLengthString() characters long.
	 *
	 *	@return An instance or null.
	 */
	@JSExport
  	public IGiAIKeyHash256 fromHex(String s);

	/**
	 *	Comparator<IGiAIKeyHash256> GiAIKeyHash256_getComparator()
	 *		Get a Comparator instance for the keys.
	 *
	 *	@return A Comparator for the key instances.
	 */
	@JSExport
	public static Comparator<IGiAIKeyHash256> GiAIKeyHash256_getComparator();

	/**
	 *	Comparator<IGiAIKeyHash256> getComparator()
	 *		Get a Comparator instance for the keys.
	 *
	 *	@return A Comparator for the key instances.
	 */
	@JSExport
	public Comparator<IGiAIKeyHash256> getComparator();

	/**
	 *	byte[] GiAIKeyHash256_getBytes(k)
	 *		Get the byte array for key value k.
	 *
	 *	@param k The key value to be evaluated.
	 *
	 *	@return The byte array for key value k, or null if k is null.
	 */
	@JSExport
	public static byte[] GiAIKeyHash256_getBytes(IGiAIKeyHash256 k);

	/**
	 *	byte[] getBytes()
	 *		Get the byte array for this key.
	 *
	 *	@return The byte array for this key.
	 */
	@JSExport
	public byte[] getBytes();

	/**
	 *	void GiAIKeyHash256_setBytes(k, a)
	 *		Set the byte array for key value k to a copy of the byte array a. If a is null, set k's key data to zeroes.  We want the KeyHash to be immutable so this method shouldn't even exist, but it is necessary for JPA. This is the only code that should use this method.
	 *
	 *	@param k The key value to be updated.
	 *	@param a The byte array to use for the update.  If it is null, then k's key data is set to zeroes.
	 */
	@JSExport
	public static void GiAIKeyHash256_setBytes(IGiAIKeyHash256 k, byte[] a);

	/**
	 *	void setBytes(a)
	 *		Set the byte array for the key to a copy of the byte array a. If a is null, set the key data to zeroes.  We want the KeyHash to be immutable so this method shouldn't even exist, but it is necessary for JPA. This is the only code that should use this method.
	 *
	 *	@param a The byte array to use for the update.  If it is null, then the key data is set to zeroes.
	 */
	@JSExport
	public void setBytes(byte[] a);

	/**
	 *	void GiAIKeyHash256_setBytes(k, a, o, l)
	 *		Set the byte array for key value k to a copy of the byte array a starting at the offset o for the length l. If a is null, set k's key data to zeroes.  We want the KeyHash to be immutable so this method shouldn't even exist, but it is necessary for JPA. This is the only code that should use this method.
	 *
	 *	@param k The key value to be updated.
	 *	@param a The byte array to use for the update.  If it is null, then k's key data is set to zeroes.
	 *	@param o The offset into the array a
	 *	@param l The number of bytes to copy from array a
	 */
	@JSExport
	public static void GiAIKeyHash256_setBytes(IGiAIKeyHash256 k, byte[] a, int o, int l);

	/**
	 *	void setBytes(a, o, l)
	 *		Set the byte array for the key to a copy of the byte array a starting at the offset o for the length l. If a is null, set the key data to zeroes.  We want the KeyHash to be immutable so this method shouldn't even exist, but it is necessary for JPA. This is the only code that should use this method.
	 *
	 *	@param a The byte array to use for the update.  If it is null, then the key data is set to zeroes.
	 *	@param o The offset into the array a
	 *	@param l The number of bytes to copy from array a
	 */
	@JSExport
	public void setBytes(byte[] a, int o, int l);

	/**
	 *	boolean GiAIKeyHash256_isNull(k)
	 *		Is the key k null valued?
	 *
	 *	@return True if k is null or null valued, otherwise false.
	 */
	@JSExport
  	public static boolean GiAIKeyHash256_isNull(IGiAIKeyHash256 k);

	/**
	 *	boolean isNull()
	 *		Is this key null valued?
	 *
	 *	@return True if this key is null valued, otherwise false.
	 */
	@JSExport
  	public boolean isNull();

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_hash(s)
	 *		Create an instance by hashing the string s.
	 *
	 *	@param s The string to be hashed.
	 *
	 *	@return An instance or null if s is null.
	 */
	@JSExport
  	public static IGiAIKeyHash256 GiAIKeyHash256_hash(String s);

	/**
	 *	IGiAIKeyHash256 hash(s)
	 *		Create an instance by hashing the string s.
	 *
	 *	@param s The string to be hashed.
	 *
	 *	@return An instance or null if s is null.
	 */
	@JSExport
  	public IGiAIKeyHash256 hash(String s);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_hash(a)
	 *		Create an instance by hashing the byte array a.
	 *
	 *	@param a The byte array to be hashed.
	 *
	 *	@return An instance or null if a is null.
	 */
	@JSExport
  	public static IGiAIKeyHash256 GiAIKeyHash256_hash(byte[] a);

	/**
	 *	IGiAIKeyHash256 hash(a)
	 *		Create an instance by hashing the byte array a.
	 *
	 *	@param a The byte array to be hashed.
	 *
	 *	@return An instance or null if a is null.
	 */
	@JSExport
  	public IGiAIKeyHash256 hash(byte[] a);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_hash(a...)
	 *		Create an instance by hashing the byte arrays a and ....
	 *
	 *	@param a... The byte arrays to be hashed.
	 *
	 *	@return An instance or null if a is null and no other arrays are specified.
	 */
	@JSExport
  	public static IGiAIKeyHash256 GiAIKeyHash256_hash(byte[]... a);

	/**
	 *	IGiAIKeyHash256 hash(a...)
	 *		Create an instance by hashing the byte arrays a and ....
	 *
	 *	@param a... The byte arrays to be hashed.
	 *
	 *	@return An instance or null if a is null and no other arrays are specified.
	 */
	@JSExport
  	public IGiAIKeyHash256 hash(byte[]... a);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_hash(k...)
	 *		Create an instance by hashing the keys k and ....
	 *
	 *	@param k... The keys to be hashed.
	 *
	 *	@return An instance or null if k is null and no other keys are specified.
	 */
	@JSExport
  	public static IGiAIKeyHash256 GiAIKeyHash256_hash(IGiAIKeyHash256... k);

	/**
	 *	IGiAIKeyHash256 hash(k...)
	 *		Create an instance by hashing the keys k and ....
	 *
	 *	@param k... The keys to be hashed.
	 *
	 *	@return An instance or null if k is null and no other keys are specified.
	 */
	@JSExport
  	public IGiAIKeyHash256 hash(IGiAIKeyHash256... k);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_hash(i...)
	 *		Create an instance by hashing the integers i and ....
	 *
	 *	@param k... The integers to be hashed.
	 *
	 *	@return An instance.
	 */
	@JSExport
  	public static IGiAIKeyHash256 GiAIKeyHash256_hash(int... k);

	/**
	 *	IGiAIKeyHash256 hash(i...)
	 *		Create an instance by hashing the integers i and ....
	 *
	 *	@param i... The integers to be hashed.
	 *
	 *	@return An instance.
	 */
	@JSExport
  	public IGiAIKeyHash256 hash(int... i);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_hash(a...)
	 *		Create an instance by hashing the integer arrays a and ....
	 *
	 *	@param a... The integer arrays to be hashed.
	 *
	 *	@return An instance, or null if a is null and no other arrays are specified.
	 */
	@JSExport
  	public static IGiAIKeyHash256 GiAIKeyHash256_hash(int[]... a);

	/**
	 *	IGiAIKeyHash256 hash(a...)
	 *		Create an instance by hashing the integer arrays a and ....
	 *
	 *	@param a... The integer arrays to be hashed.
	 *
	 *	@return An instance, or null if a is null and no other arrays are specified.
	 */
	@JSExport
  	public IGiAIKeyHash256 hash(int[]... a);

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_deepClone(k)
	 *		Create an instance by deep cloning the key data for k.
	 *
	 *	@param k The key value to clone.
	 *
	 *	@return An instance, or null if k is null.
	 */
	@JSExport
  	public static IGiAIKeyHash256 GiAIKeyHash256_deepClone(IGiAIKeyHash256 k);

	/**
	 *	IGiAIKeyHash256 deepClone()
	 *		Create an instance by deep cloning this key's data.
	 *
	 *	@return An instance cloned from this one.
	 */
	@JSExport
  	public IGiAIKeyHash256 deepClone();

	/**
	 *	IGiAIKeyHash256 GiAIKeyHash256_fromHexQuick(s)
	 *		Create an instance by converting String s from hexadecimal.
	 *
	 *	@param s The hexadecimal string to convert.
	 *
	 *	@return An instance, or null if s is null.
	 */
	@JSExport
  	public static IGiAIKeyHash256 GiAIKeyHash256_fromHexQuick(String s);

	/**
	 *	IGiAIKeyHash256 fromHexQuick(s)
	 *		Create an instance by converting String s from hexadecimal.
	 *
	 *	@param s The hexadecimal string to convert.
	 *
	 *	@return An instance, or null if s is null.
	 */
	@JSExport
  	public IGiAIKeyHash256 fromHexQuick(String s);

	/**
	 *	IGiAIKeyHash256[] GiAIKeyHash256_toKeyHashes(a)
	 *		Create an array of instances from an array of hexadecimal strings.
	 *
	 *	@param a The array of hexadecimal strings to convert.
	 *
	 *	@return An array of instances, or null if a was null.
	 */
	@JSExport
  	public static IGiAIKeyHash256[] GiAIKeyHash256_toKeyHashes(String[] a);

	/**
	 *	IGiAIKeyHash256[] toKeyHashes(a)
	 *		Create an array of instances from an array of hexadecimal strings.
	 *
	 *	@param a The array of hexadecimal strings to convert.
	 *
	 *	@return An array of instances, or null if a was null.
	 */
	@JSExport
  	public IGiAIKeyHash256[] toKeyHashes(String[] a);

	/**
	 *	List<IGiAIKeyHash256> GiAIKeyHash256_toKeyHashesList(a)
	 *		Create a list of instances from an array of hexadecimal strings.
	 *
	 *	@param a The array of hexadecimal strings to convert.
	 *
	 *	@return A list of instances, or null if a was null.
	 */
	@JSExport
  	public static List<IGiAIKeyHash256> GiAIKeyHash256_toKeyHashesList(String[] a);

	/**
	 *	List<IGiAIKeyHash256> toKeyHashesList(a)
	 *		Create a list of instances from an array of hexadecimal strings.
	 *
	 *	@param a The array of hexadecimal strings to convert.
	 *
	 *	@return A list of instances, or null if a was null.
	 */
	@JSExport
  	public List<IGiAIKeyHash256> toKeyHashesList(String[] a);

	/**
	 *	Set<IGiAIKeyHash256> GiAIKeyHash256_toKeyHashesSet(a)
	 *		Create a set of instances from an array of hexadecimal strings.
	 *
	 *	@param a The array of hexadecimal strings to convert.
	 *
	 *	@return A set of instances, or null if a was null.
	 */
	@JSExport
  	public static Set<IGiAIKeyHash256> GiAIKeyHash256_toKeyHashesSet(String[] a);

	/**
	 *	Set<IGiAIKeyHash256> toKeyHashesSet(a)
	 *		Create a set of instances from an array of hexadecimal strings.
	 *
	 *	@param a The array of hexadecimal strings to convert.
	 *
	 *	@return A set of instances, or null if a was null.
	 */
	@JSExport
  	public Set<IGiAIKeyHash256> toKeyHashesSet(String[] a);
}
