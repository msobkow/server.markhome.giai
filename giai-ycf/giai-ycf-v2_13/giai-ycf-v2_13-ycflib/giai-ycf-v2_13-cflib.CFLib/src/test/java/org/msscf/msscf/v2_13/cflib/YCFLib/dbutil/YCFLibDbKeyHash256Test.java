/*
 *	MSS Code Factory YCFLib 2.13 Common Application Functionality
 *
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow (mailto:mark.sobkow@gmail.com)
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycflib.YCFLib.dbutil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YCFLibDbKeyHash256Test {

    @Test
    void testGetHashAlgo() {
		assertEquals("SHA-256", YCFLibDbKeyHash256.HASH_ALGO);
		YCFLibDbKeyHash256 k = new YCFLibDbKeyHash256();
		assertEquals("SHA-256", k.getHashAlgo());
    }

    @Test
    void testGetHashLength() {
		assertEquals(32, YCFLibDbKeyHash256.HASH_LENGTH);
		YCFLibDbKeyHash256 k = new YCFLibDbKeyHash256();
		assertEquals(32, k.getHashLength());
    }

    @Test
    void testGetHashLengthString() {
		assertEquals(64, YCFLibDbKeyHash256.HASH_LENGTH_STRING);
		YCFLibDbKeyHash256 k = new YCFLibDbKeyHash256();
		assertEquals(64, k.getHashLengthString());
    }

    @Test
    void testGetBytes() {
		YCFLibDbKeyHash256 k = new YCFLibDbKeyHash256();
		byte[] bytes = k.getBytes();
		assertNull(bytes);
		YCFLibDbKeyHash256 k2 = YCFLibDbKeyHash256.nullGet();
		byte[] bytes2 = k2.getBytes();
		assertNotNull(bytes2);
    }

    @Test
    void testNullGet() {
		YCFLibDbKeyHash256 n = YCFLibDbKeyHash256.nullGet();
		byte[] bytes = n.getBytes();
		assertNotNull(bytes);
		assertEquals(32, bytes.length);
		for (int i = 0; i < bytes.length; i++) {
			assertEquals(0, bytes[i]);
		}
    }

	@Test
    void testCompareOrdered() {

		YCFLibDbKeyHash256 nullA = YCFLibDbKeyHash256.nullGet();
		YCFLibDbKeyHash256 nullB = YCFLibDbKeyHash256.nullGet();
		assertEquals(0, YCFLibDbKeyHash256.compareOrdered(nullA, nullB));

		byte[] bA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
		byte[] bB = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
		YCFLibDbKeyHash256 valA = new YCFLibDbKeyHash256(bA);
		assertEquals(0, YCFLibDbKeyHash256.compareOrdered(valA, valA));
		YCFLibDbKeyHash256 anotherA = new YCFLibDbKeyHash256(bA);
		assertEquals(0, YCFLibDbKeyHash256.compareOrdered(valA, anotherA));

		YCFLibDbKeyHash256 valB = new YCFLibDbKeyHash256(bB);
		assertTrue(YCFLibDbKeyHash256.compareOrdered(valA, valB) < 0);
		assertTrue(YCFLibDbKeyHash256.compareOrdered(valB, valA) > 0);

		YCFLibDbKeyHash256 notNull = new YCFLibDbKeyHash256(0);
		assertTrue(YCFLibDbKeyHash256.compareOrdered(nullA, notNull) != 0);
		assertTrue(YCFLibDbKeyHash256.compareOrdered(notNull, nullA) != 0);
    }
}
