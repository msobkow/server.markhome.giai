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

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * This variation on a UUID is based on supporting IPv6 as well as IPv4 host addresses for type 1 UUIDs.
 * <p>
 * The Uuid6 is a 28 byte value, represented as a 62 character string.  The string representation is
 * formatted as follows:
 * <blockquote><pre>
 * {@code
 * Uuid6                   = <time_stamp> "-"
 *                          <version_and_variant> "-"
 *                          <random> "-"
 *                          <node0> "-" <node1> "-" <node2> "-" <node3>
 * time_stamp             = 6*<hexOctet>
 * version_and_variant    = 2*<hexOctet>
 * random                 = 4*<hexOctet>
 * node0                  = 4*<hexOctet>
 * node1                  = 4*<hexOctet>
 * node2                  = 4*<hexOctet>
 * node3                  = 4*<hexOctet>
 * hexOctet               = <hexDigit><hexDigit>
 * hexDigit               =
 *       "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
 *       | "a" | "b" | "c" | "d" | "e" | "f"
 *       | "A" | "B" | "C" | "D" | "E" | "F"
 * }</pre></blockquote>
 *
 *	@since 2026
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIUuid6 extends IGiAIAnyObj {

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
	public static IGiAIUuid6 getService() {
		IGiAIUuid6 ref = ((IGiAIUuid6)(singleton.get()));
		if (ref == null) {
			ref = new GiAIUuid6();
			singleton.set(null, ref);
			ref = ((IGiAIUuid6)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	IGiAIUuid6 getInstance()
	 *		Get an instance that provides the service method implementations.
	 *
	 *	@return An instance that provides the service method implementations.
	 */
	@JSExport
	public IGiAIUuid6 getInstance();

	/**
	 *	IGiAIUuid6 getInstance(byte[] data)
	 *		Get an instance that provides the service method implementations with the specified object backing array.
	 *
	 *	@return An instance that provides the service method implementations.
	 */
	@JSExport
	public IGiAIUuid6 getInstance(byte[] data);

	/**
	 *	Get the byte array for the object.
	 *
	 *	@return The byte array form of the object.
	 */
	@JSExport
    public byte[] getBytes();

	/**
	 *	Generate a UUID6.
	 *
	 *	@return An instance that provides the service method implementations.
	 */
	@JSExport
	public static IGiAIUuid6 generateUuid6();

	/**
	 *	Generate a random UUID6.
	 *
	 *	@return An instance that provides the service method implementations.
	 */
	@JSExport
	public static IGiAIUuid6 randomUuid6();

    /**
     * Creates a {@code Uuid6} from the string standard representation as
     * described in the {@link #toString} method.
     *
     * @param  name
     *         A string that specifies a {@code Uuid6}
     *
     * @return  A {@code Uuid6} with the specified value
     *
     * @throws  IllegalArgumentException
     *          If name does not conform to the string representation as
     *          described in {@link #toString}
     *
     */
	@JSExport
    public static IGiAIUuid6 fromString(String name);

    /**
     * Static factory to retrieve a type 3 (name based) {@code UUID} based on
     * the specified byte array.
     *
     * @param  name
     *         A byte array to be used to construct a {@code UUID}
     *
     * @return  A {@code UUID} generated from the specified array
     */
	@JSExport
    public static IGiAIUuid6 nameUuid6FromBytes(byte[] name);

    /**
     * The version number associated with this {@code Uuid6}.  The version
     * number describes how this {@code Uuid6} was generated.
     *
     * The version number has the following meaning:
     * <ul>
     * <li>1    Time-based Uuid6
     * <li>2    DCE security Uuid6
     * <li>3    Name-based Uuid6
     * <li>4    Randomly generated Uuid6
     * </ul>
     *
     * @return  The version number of this {@code Uuid6}
     */
	@JSExport
    public int version();

    /**
     * The variant number associated with this {@code Uuid6}.  The variant
     * number describes the layout of the {@code Uuid6}.
     *
     * The variant number has the following meaning:
     * <ul>
     * <li>0    Reserved for NCS backward compatibility
     * <li>2    <a href="http://www.ietf.org/rfc/rfc4122.txt">IETF&nbsp;RFC&nbsp;4122</a>
     * (Leach-Salz), used by this class
     * <li>6    Reserved, Microsoft Corporation backward compatibility
     * <li>7    Reserved for future definition
     * </ul>
     *
     * @return  The variant number of this {@code Uuid6}
     *
     * @spec https://www.rfc-editor.org/info/rfc4122
     *      RFC 4122: A Universally Unique IDentifier (Uuid6) URN Namespace
     */
	@JSExport
    public int variant();

    /**
     * The timestamp value associated with this Uuid6.
     *
     * <p> The 60 bit timestamp value is constructed from the time_low,
     * time_mid, and time_hi fields of this {@code Uuid6}.  The resulting
     * timestamp is measured in 100-nanosecond units since midnight,
     * October 15, 1582 UTC.
     *
     * <p> The timestamp value is only meaningful in a time-based Uuid6, which
     * has version type 1.  If this {@code Uuid6} is not a time-based Uuid6 then
     * this method throws UnsupportedOperationException.
     *
     * @throws UnsupportedOperationException
     *         If this Uuid6 is not a version 1 Uuid6
     * @return The timestamp of this {@code Uuid6}.
     */
	@JSExport
    public long timestamp();

    /**
     * The clock random value associated with this Uuid6.
     *
     * <p> The 32 bit clock random value is constructed from the clock
     * randon field of this Uuid6.  The clock random field is used to
     * guarantee temporal uniqueness in a time-based Uuid6.
     *
     * <p> The {@code clockRandom} value is only meaningful in a time-based
     * Uuid6, which has version type 1.  If this Uuid6 is not a time-based Uuid6
     * then this method throws UnsupportedOperationException.
     *
     * @return  The clock random of this {@code Uuid6}
     *
     * @throws  UnsupportedOperationException
     *          If this Uuid6 is not a version 1 Uuid6
     */
	@JSExport
    public int clockRandom();

    /**
     * The node values associated with this Uuid6.
     */
	@JSExport
    public int node0();

	@JSExport
    public int node1();

	@JSExport
    public int node2();

	@JSExport 
    public int node3();

    /**
     * Returns a {@code String} object representing this {@code Uuid6}.
     *
     * <p> The Uuid6 string representation is as described by this BNF:
     * <blockquote><pre>
     * {@code
     * Uuid6                   = <time_stamp> "-"
     *                          <version_and_variant> "-"
     *                          <random> "-"
     *                          <node0> "-" <node1> "-" <node2> "-" <node3>
     * time_stamp             = 6*<hexOctet>
     * version_and_variant    = 2*<hexOctet>
     * random                 = 4*<hexOctet>
     * node0                  = 4*<hexOctet>
     * node1                  = 4*<hexOctet>
     * node2                  = 4*<hexOctet>
     * node3                  = 4*<hexOctet>
     * hexOctet               = <hexDigit><hexDigit>
     * hexDigit               =
     *       "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
     *       | "a" | "b" | "c" | "d" | "e" | "f"
     *       | "A" | "B" | "C" | "D" | "E" | "F"
     * }</pre></blockquote>
     *
     * @return  A string representation of this {@code Uuid6}
     */
    @Override
	@JSExport
    public String toString();

    /**
     * Returns a hash code for this {@code Uuid6}.
     *
     * @return  A hash code value for this {@code Uuid6}
     */
    @Override
	@JSExport
    public int hashCode();

    /**
     * Compares this object to the specified object.  The result is {@code
     * true} if and only if the argument is not {@code null}, is a {@code Uuid6}
     * object, has the same variant, and contains the same value, bit for bit,
     * as this {@code Uuid6}.
     *
     * @param  obj
     *         The object to be compared
     *
     * @return  {@code true} if the objects are the same; {@code false}
     *          otherwise
     */
    @Override
	@JSExport
    public boolean equals(Object obj);

    /**
     * Compares this Uuid6 with the specified Uuid6.
     *
     * <p> The first of two Uuid6s is greater than the second if the most
     * significant field in which the Uuid6s differ is greater for the first
     * Uuid6.
     *
     * @param  val
     *         {@code Uuid6} to which this {@code Uuid6} is to be compared
     *
     * @return  -1, 0 or 1 as this {@code Uuid6} is less than, equal to, or
     *          greater than {@code val}
     *
     */
    @Override
	@JSExport
    public int compareTo(IGiAIUuid6 val);
}
