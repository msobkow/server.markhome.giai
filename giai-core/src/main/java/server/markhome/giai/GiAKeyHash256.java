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
public class GiAIKeyHash256 extends GiAIKeyHashBase<GiAIKeyHash256> implements IGiAIKeyHash256, Serializable {
  static final long serialVersionUID = 202608160343L;
  protected byte[] bytes;

  @Override
  @SuppressWarnings("unchecked")
  public int compareTo(IGiAIKeyHash256 o) {
    int result = compare((IGiAIKeyHash256) this, o);
    return result;
  }

  static public int compareOrdered(IGiAIKeyHash256 h1, IGiAIKeyHash256 h2) {
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

  public static GiAIKeyHash256 fromHex(String string) {
    byte[] b = sbytesFromHex(string);
    GiAIKeyHash256 h = new GiAIKeyHash256();
    h.bytes = b;
    return h;
  }

  public static Comparator<IGiAIKeyHash256> getComparator() {

    return new Comparator<IGiAIKeyHash256>() {
      @Override
      public int compare(IGiAIKeyHash256 a, IGiAIKeyHash256 b) {
        return compareOrdered(a, b);
      }
    };
  }

  public GiAIKeyHash256() {
    super();
  }

  /**
   * This is the hex code of the underlying ID. THIS IS NOT A HASHING FUNCTION.
   */
  public GiAIKeyHash256(String hexId) {
    super(hexId);
  }

  public GiAIKeyHash256(byte[] anId) {
    super(anId);
  }

  public GiAIKeyHash256(IGiAIKeyHash256 otherKey) {
	bytes = new byte[HASH_LENGTH];
	if(otherKey != null) {
		System.arraycopy(otherKey.getBytes(), 0, bytes, 0, HASH_LENGTH);
	}
  }

  public GiAIKeyHash256(IGiAIKeyHash384 otherKey) {
    super();
    if (otherKey == null) {
      bytes = new byte[HASH_LENGTH];
      return;
    }
    byte[] _newId = new byte[HASH_LENGTH];
    System.arraycopy(otherKey.getBytes(), 0, _newId, 0, HASH_LENGTH);
    this.bytes = _newId;
  }

  public GiAIKeyHash256(IGiAIKeyHash512 otherKey) {
    super();
    if (otherKey == null) {
      bytes = new byte[HASH_LENGTH];
      return;
    }
    byte[] _newId = new byte[HASH_LENGTH];
    System.arraycopy(otherKey.getBytes(), 0, _newId, 0, HASH_LENGTH);
    this.bytes = _newId;
  }

  public static GiAIKeyHash256 fromInt(int v) {
    GiAIKeyHash256 h = nullGet();
    h.bytes[3] = (byte) (v & 0xFF);
    h.bytes[2] = (byte) ((v >> 8) & 0xFF);
    h.bytes[1] = (byte) ((v >> 16) & 0xFF);
    h.bytes[0] = (byte) ((v >> 24) & 0xFF);
    return h;
  }

  public GiAIKeyHash256(int notUsed) {
    super(notUsed);
  }

  public static final boolean isNull(GiAIKeyHash256 anId) {
    return anId == null || anId.isNull();
  }

  @Override
  public byte[] getBytes() {
    return bytes;
  }

  /**
   * Get a new hash object with the key set to all 0s
   */
  static public GiAIKeyHash256 nullGet() {
    GiAIKeyHash256 k = new GiAIKeyHash256(new byte[HASH_LENGTH]);
    return k;
  }

  static public String getNullString() {
    return "0000000000000000000000000000000000000000000000000000000000000000";
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

  public static GiAIKeyHash256 hash(String text) {
    if (text != null) {
      try {
        MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
        byte[] buf = text.getBytes("UTF-8");
        md.update(buf);

        return new GiAIKeyHash256(md.digest());
      }
      catch (Exception ex) {
      }
    }
    return new GiAIKeyHash256(0);
  }

  public static GiAIKeyHash256 hash(byte[] payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      md.update(payload);

      return new GiAIKeyHash256(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash256(0);
  }

  public static GiAIKeyHash256 hash(byte[]... payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (byte[] bs : payload) {
        md.update(bs);
      }

      return new GiAIKeyHash256(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash256(0);
  }

  public static GiAIKeyHash256 hash(IGiAIKeyHash256... payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (IGiAIKeyHash256 k : payload) {
        md.update(k.getBytes());
      }
      return new GiAIKeyHash256(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash256(0);
  }

  public static GiAIKeyHash256 hash(int[] payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (int x : payload) {
        md.update((byte) ((x >>> 24) & 255));
        md.update((byte) ((x >>> 16) & 255));
        md.update((byte) ((x >>> 8) & 255));
        md.update((byte) (x & 255));
      }

      return new GiAIKeyHash256(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash256(0);
  }

  @Override
  public GiAIKeyHash256 deepClone() {
    return new GiAIKeyHash256(this);
  }

  static public GiAIKeyHash256 fromHexQuick(String string) {
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

  public static final GiAIKeyHash256[] toGiAIKeyHash256(String[] ids) {
    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return new GiAIKeyHash256[0];
    }
    GiAIKeyHash256[] r = new GiAIKeyHash256[ids.length];
    for (int i = 0; i < ids.length; i++) {
      r[i] = new GiAIKeyHash256(ids[i]);
    }
    return r;
  }

  public static final List<GiAIKeyHash256> toGiAIKeyHash256List(String[] ids) {

    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return Collections.emptyList();
    }
    List<GiAIKeyHash256> r = new ArrayList<GiAIKeyHash256>(ids.length);
    for (int i = 0; i < ids.length; i++) {
      r.add(new GiAIKeyHash256(ids[i]));
    }
    return r;

  }

  public static final Set<GiAIKeyHash256> toGiAIKeyHash256Set(String[] ids) {

    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return Collections.emptySet();
    }
    Set<GiAIKeyHash256> r = new HashSet<GiAIKeyHash256>(ids.length);
    for (int i = 0; i < ids.length; i++) {
      r.add(new GiAIKeyHash256(ids[i]));
    }
    return r;

  }
}
