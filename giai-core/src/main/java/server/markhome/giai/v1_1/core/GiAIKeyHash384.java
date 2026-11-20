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
public class GiAIKeyHash384 extends GiAIKeyHashBase<GiAIKeyHash384> implements IGiAIKeyHash384, Serializable {
  static final long serialVersionUID = 202608160344L;
  protected byte[] bytes;

  @Override
  @SuppressWarnings("unchecked")
  public int compareTo(IGiAIKeyHash384 o) {
    int result = compare((IGiAIKeyHash384) this, o);
    return result;
  }

  static public int compareOrdered(IGiAIKeyHash384 h1, IGiAIKeyHash384 h2) {
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

  public static GiAIKeyHash384 fromHex(String string) {
    byte[] b = sbytesFromHex(string);
    GiAIKeyHash384 h = new GiAIKeyHash384();
    h.bytes = b;
    return h;
  }

  public static Comparator<IGiAIKeyHash384> getComparator() {

    return new Comparator<IGiAIKeyHash384>() {
      @Override
      public int compare(IGiAIKeyHash384 a, IGiAIKeyHash384 b) {
        return compareOrdered(a, b);
      }
    };
  }

  public GiAIKeyHash384 getInstance() {
    super();
  }

  /**
   * This is the hex code of the underlying ID. THIS IS NOT A HASHING FUNCTION.
   */
  public GiAIKeyHash384 getInstance(String hexId) {
    super(hexId);
  }

  public GiAIKeyHash384 getInstance(byte[] anId) {
    super(anId);
  }

  public GiAIKeyHash384 getInstance(IGiAIKeyHash384 otherKey) {
	bytes = new byte[HASH_LENGTH];
	if(otherKey != null) {
		System.arraycopy(otherKey.getBytes(), 0, bytes, 0, HASH_LENGTH);
	}
  }

  public GiAIKeyHash384 getInstance(IGiAIKeyHash512 otherKey) {
    super();
    if (otherKey == null) {
      bytes = new byte[HASH_LENGTH];
      return;
    }
    byte[] _newId = new byte[HASH_LENGTH];
    System.arraycopy(otherKey.getBytes(), 0, _newId, 0, HASH_LENGTH);
    this.bytes = _newId;
  }

  public static GiAIKeyHash384 fromInt(int v) {
    GiAIKeyHash384 h = nullGet();
    h.bytes[3] = (byte) (v & 0xFF);
    h.bytes[2] = (byte) ((v >> 8) & 0xFF);
    h.bytes[1] = (byte) ((v >> 16) & 0xFF);
    h.bytes[0] = (byte) ((v >> 24) & 0xFF);
    return h;
  }

  public GiAIKeyHash384 getInstance(int notUsed) {
    super(notUsed);
  }

  public static final boolean isNull(GiAIKeyHash384 anId) {
    return anId == null || anId.isNull();
  }

  @Override
  public byte[] getBytes() {
    return bytes;
  }

  /**
   * Get a new hash object with the key set to all 0s
   */
  static public GiAIKeyHash384 nullGet getInstance() {
    GiAIKeyHash384 k = new GiAIKeyHash384(new byte[HASH_LENGTH]);
    return k;
  }

  static public String getNullString() {
    return "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
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

  public static GiAIKeyHash384 hash(String text) {
    if (text != null) {
      try {
        MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
        byte[] buf = text.getBytes("UTF-8");
        md.update(buf);

        return new GiAIKeyHash384(md.digest());
      }
      catch (Exception ex) {
      }
    }
    return new GiAIKeyHash384(0);
  }

  public static GiAIKeyHash384 hash(byte[] payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      md.update(payload);

      return new GiAIKeyHash384(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash384(0);
  }

  public static GiAIKeyHash384 hash(byte[]... payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (byte[] bs : payload) {
        md.update(bs);
      }

      return new GiAIKeyHash384(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash384(0);
  }

  public static GiAIKeyHash384 hash(IGiAIKeyHash384... payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (IGiAIKeyHash384 k : payload) {
        md.update(k.getBytes());
      }
      return new GiAIKeyHash384(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash384(0);
  }

  public static GiAIKeyHash384 hash(int[] payload) {
    try {
      MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
      for (int x : payload) {
        md.update((byte) ((x >>> 24) & 255));
        md.update((byte) ((x >>> 16) & 255));
        md.update((byte) ((x >>> 8) & 255));
        md.update((byte) (x & 255));
      }

      return new GiAIKeyHash384(md.digest());
    }
    catch (Exception ex) {
    }
    return new GiAIKeyHash384(0);
  }

  @Override
  public GiAIKeyHash384 deepClone getInstance() {
    return new GiAIKeyHash384(this);
  }

  static public GiAIKeyHash384 fromHexQuick getInstance(String string) {
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

  public static final GiAIKeyHash384[] toGiAIKeyHash384(String[] ids) {
    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return new GiAIKeyHash384[0];
    }
    GiAIKeyHash384[] r = new GiAIKeyHash384[ids.length];
    for (int i = 0; i < ids.length; i++) {
      r[i] = new GiAIKeyHash384(ids[i]);
    }
    return r;
  }

  public static final List<GiAIKeyHash384> toGiAIKeyHash384List(String[] ids) {

    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return Collections.emptyList();
    }
    List<GiAIKeyHash384> r = new ArrayList<GiAIKeyHash384>(ids.length);
    for (int i = 0; i < ids.length; i++) {
      r.add(new GiAIKeyHash384(ids[i]));
    }
    return r;

  }

  public static final Set<GiAIKeyHash384> toGiAIKeyHash384Set(String[] ids) {

    if (ids == null) {
      return null;
    }
    if (ids.length == 0) {
      return Collections.emptySet();
    }
    Set<GiAIKeyHash384> r = new HashSet<GiAIKeyHash384>(ids.length);
    for (int i = 0; i < ids.length; i++) {
      r.add(new GiAIKeyHash384(ids[i]));
    }
    return r;

  }
}
