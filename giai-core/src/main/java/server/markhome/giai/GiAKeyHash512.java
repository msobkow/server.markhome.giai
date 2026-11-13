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
 *
 * @author msobkow
 */
public class GiAIKeyHash512 extends GiAIKeyHashBase<GiAIKeyHash512> implements IGiAIKeyHash512, Serializable {
  static final long serialVersionUID = 202608160345L;
  protected byte[] bytes;

  @Override
  @SuppressWarnings("unchecked")
  public int compareTo(IGiAIKeyHash512 o) {
    int result = compare((IGiAIKeyHash512) this, o);
    return result;
  }

  static public int compareOrdered(IGiAIKeyHash512 h1, IGiAIKeyHash512 h2) {
    if (h1 == null) {
      if (h2 == null) {
        return 0;
      }
      else {
        return -1;
      }
    }
    else {
      if (h2 == null) {
        return 1;
      }
      else {
        for (int i = 0; i < HASH_LENGTH; i++) {
          int v1 = h1.getBytes()[i] + 256;
          int v2 = h2.getBytes()[i] + 256;
          if (v1 < v2) return -1;
          if (v1 > v2) return 1;
        }
      }
    }
    return 0;
  }

  @Override
  public int getHashLength() {
    return HASH_LENGTH;
  }

  @Override
  public int getHashLengthString() {
    return HASH_LENGTH_STRING;
  }

  @Override
  public String getHashAlgo() {
    return HASH_ALGO;
  }

  static MessageDigest[] m = null;
  @Override
  protected MessageDigest[] getM() {
    return m;
  }

  @Override
  public void initStatics() {
    if (m != null) {
      return;
    }
    super.initStatics();
    try {
      m = new MessageDigest[CONCURRENT_DIGESTS];
      for (int i = 0; i < CONCURRENT_DIGESTS; i++) {
        m[i] = MessageDigest.getInstance(HASH_ALGO);
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static byte[] sbytesFromHex(String string) {
    if (string == null) {
      // allowed
    }
    else if (string.length() > HASH_LENGTH * 2) {
      throw new IllegalArgumentException("string length is " + string.length() + ".  Must be <= " + HASH_LENGTH * 2 + ".  string is '" + string + "'.");
    }
    byte[] b = new byte[HASH_LENGTH];
    if (string == null) {
      return b;
    }

    int n = string.length();
    for (int i = 0; i < n - 1; i += 2) {
      b[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4) + Character.digit(string.charAt(i + 1), 16));
    }
    return b;
  }

  public static GiAIKeyHash512 fromHex(String string) {
    byte[] b = sbytesFromHex(string);
    GiAIKeyHash512 h = new GiAIKeyHash512();
    h.bytes = b;
    return h;
  }

  public static Comparator<IGiAIKeyHash512> getComparator() {

    return new Comparator<IGiAIKeyHash512>() {
      @Override
      public int compare(IGiAIKeyHash512 a, IGiAIKeyHash512 b) {
        return compareOrdered(a, b);
      }
    };
  }

  public GiAIKeyHash512() {
    super();
  }

  /**
   * This is the hex code of the underlying ID. THIS IS NOT A HASHING FUNCTION.
   */
  public GiAIKeyHash512(String hexId) {
    super(hexId);
  }

  public GiAIKeyHash512(byte[] anId) {
    super(anId);
  }

  public GiAIKeyHash512(IGiAIKeyHash512 otherKey) {
	bytes = new byte[HASH_LENGTH];
	if(otherKey != null) {
		System.arraycopy(otherKey.getBytes(), 0, bytes, 0, HASH_LENGTH);
	}
  }

  public static GiAIKeyHash512 fromInt(int v) {
    GiAIKeyHash512 h = nullGet();
    h.bytes[3] = (byte) (v & 0xFF);
    h.bytes[2] = (byte) ((v >> 8) & 0xFF);
    h.bytes[1] = (byte) ((v >> 16) & 0xFF);
    h.bytes[0] = (byte) ((v >> 24) & 0xFF);
    return h;
  }

  public GiAIKeyHash512(int notUsed) {
    super(notUsed);
  }

  public static final boolean isNull(GiAIKeyHash512 anId) {
    return anId == null || anId.isNull();
  }

  @Override
  public byte[] getBytes() {
    return bytes;
  }

  /**
   * Get a new hash object with the key set to all 0s
   */
  static public GiAIKeyHash512 nullGet() {
    GiAIKeyHash512 k = new GiAIKeyHash512(new byte[HASH_LENGTH]);
    return k;
  }

  static public String getNullString() {
    return "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
  }

  /**
   * We want KeyHashXX to be immutable so this method shouldn't even exist;
   * however it is necessary for JPA. This is the only time it should be used.
   *
   * @param newBytes to be copied from.
   */
  @Override
  public void setBytes(byte[] newBytes) {
    if (newBytes == null) {
      throw new NullPointerException("newBytes must not be null.");
    }
    if (newBytes.length != HASH_LENGTH) {
      throw new IllegalArgumentException("newBytes must be of length " + HASH_LENGTH + ".");
    }
    bytes = newBytes.clone();
  }

  /** Copy into existing key */
  @Override
  public void setBytes(byte[] newBytes, int offset,  int length) {
      System.arraycopy(newBytes, offset, bytes, 0, Math.min(HASH_LENGTH,length));
  }

  public static GiAIKeyHash512 hash(String text) {
    if (text != null) {
      try {
        MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
        byte[] buf = text.getBytes("UTF-8");
        md.update(buf);

        return new GiAIKeyHash512(md.digest());
      }
      catch (Exception ex) {
      }
    }
    return new GiAIKeyHash512(0);
  }

  public static GiAIKeyHash512 hash(byte[] payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      md.update(payload);

      return new GiAIKeyHash512(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash512(0);
  }

  public static GiAIKeyHash512 hash(byte[]... payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (byte[] bs : payload) {
        md.update(bs);
      }

      return new GiAIKeyHash512(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash512(0);
  }

  public static GiAIKeyHash512 hash(IGiAIKeyHash512... payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (IGiAIKeyHash512 k : payload) {
        md.update(k.getBytes());
      }
      return new GiAIKeyHash512(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash512(0);
  }

  public static GiAIKeyHash512 hash(int[] payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (int x : payload) {
        md.update((byte) ((x >>> 24) & 255));
        md.update((byte) ((x >>> 16) & 255));
        md.update((byte) ((x >>> 8) & 255));
        md.update((byte) (x & 255));
      }

      return new GiAIKeyHash512(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash512(0);
  }

  @Override
  public GiAIKeyHash512 deepClone() {
    return new GiAIKeyHash512(this);
  }

  static public GiAIKeyHash512 fromHexQuick(String string) {
    if (string == null) {
      return null;
    }
    if (string.length() != HASH_LENGTH * 2) {
      return null;
    }
    for (int i = 0; i < string.length(); i++) {
      try {
        if (Character.digit(string.charAt(i), 16) < 0) {
          return null;
        }
      }
      catch (Exception e) {
        return null;
      }

    }
    try {
      return fromHex(string);
    }
    catch (Exception e) {
      return null;
    }
  }

  public static final GiAIKeyHash512[] toGiAIKeyHash512(String[] ids) {
    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return new GiAIKeyHash512[0];
    }
    GiAIKeyHash512[] r = new GiAIKeyHash512[ids.length];
    for (int i = 0; i < ids.length; i++) {
      r[i] = new GiAIKeyHash512(ids[i]);
    }
    return r;
  }

  public static final List<GiAIKeyHash512> toGiAIKeyHash512List(String[] ids) {

    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return Collections.emptyList();
    }
    List<GiAIKeyHash512> r = new ArrayList<GiAIKeyHash512>(ids.length);
    for (int i = 0; i < ids.length; i++) {
      r.add(new GiAIKeyHash512(ids[i]));
    }
    return r;

  }

  public static final Set<GiAIKeyHash512> toGiAIKeyHash512Set(String[] ids) {

    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return Collections.emptySet();
    }
    Set<GiAIKeyHash512> r = new HashSet<GiAIKeyHash512>(ids.length);
    for (int i = 0; i < ids.length; i++) {
      r.add(new GiAIKeyHash512(ids[i]));
    }
    return r;

  }
}
