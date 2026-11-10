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

public class YCFLibDbKeyHash160Test {

    @Test
    void testGetHashAlgo() {
		assertEquals("SHA-1", YCFLibDbKeyHash160.HASH_ALGO);
		YCFLibDbKeyHash160 k = new YCFLibDbKeyHash160();
		assertEquals("SHA-1", k.getHashAlgo());
    }

    @Test
    void testGetHashLength() {
		assertEquals(20, YCFLibDbKeyHash160.HASH_LENGTH);
		YCFLibDbKeyHash160 k = new YCFLibDbKeyHash160();
		assertEquals(20, k.getHashLength());
    }

    @Test
    void testGetHashLengthString() {
		assertEquals(40, YCFLibDbKeyHash160.HASH_LENGTH_STRING);
		YCFLibDbKeyHash160 k = new YCFLibDbKeyHash160();
		assertEquals(40, k.getHashLengthString());
    }

    @Test
    void testGetBytes() {
		YCFLibDbKeyHash160 k = new YCFLibDbKeyHash160();
		byte[] bytes = k.getBytes();
		assertNull(bytes);
		YCFLibDbKeyHash160 k2 = YCFLibDbKeyHash160.nullGet();
		byte[] bytes2 = k2.getBytes();
		assertNotNull(bytes2);
    }

    @Test
    void testNullGet() {
		YCFLibDbKeyHash160 n = YCFLibDbKeyHash160.nullGet();
		byte[] bytes = n.getBytes();
		assertNotNull(bytes);
		assertEquals(20, bytes.length);
		for (int i = 0; i < bytes.length; i++) {
			assertEquals(0, bytes[i]);
		}
    }

	@Test
    void testCompareOrdered() {

		YCFLibDbKeyHash160 nullA = YCFLibDbKeyHash160.nullGet();
		YCFLibDbKeyHash160 nullB = YCFLibDbKeyHash160.nullGet();
		assertEquals(0, YCFLibDbKeyHash160.compareOrdered(nullA, nullB));

		byte[] bA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		byte[] bB = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
		YCFLibDbKeyHash160 valA = new YCFLibDbKeyHash160(bA);
		assertEquals(0, YCFLibDbKeyHash160.compareOrdered(valA, valA));
		YCFLibDbKeyHash160 anotherA = new YCFLibDbKeyHash160(bA);
		assertEquals(0, YCFLibDbKeyHash160.compareOrdered(valA, anotherA));

		YCFLibDbKeyHash160 valB = new YCFLibDbKeyHash160(bB);
		assertTrue(YCFLibDbKeyHash160.compareOrdered(valA, valB) < 0);
		assertTrue(YCFLibDbKeyHash160.compareOrdered(valB, valA) > 0);

		YCFLibDbKeyHash160 notNull = new YCFLibDbKeyHash160(0);
		assertTrue(YCFLibDbKeyHash160.compareOrdered(nullA, notNull) != 0);
		assertTrue(YCFLibDbKeyHash160.compareOrdered(notNull, nullA) != 0);
    }
}
