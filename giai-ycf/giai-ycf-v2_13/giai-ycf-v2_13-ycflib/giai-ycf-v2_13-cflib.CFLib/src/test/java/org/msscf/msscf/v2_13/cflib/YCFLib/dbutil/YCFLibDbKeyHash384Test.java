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

public class YCFLibDbKeyHash384Test {

    @Test
    void testGetHashAlgo() {
		assertEquals("SHA-384", YCFLibDbKeyHash384.HASH_ALGO);
		YCFLibDbKeyHash384 k = new YCFLibDbKeyHash384();
		assertEquals("SHA-384", k.getHashAlgo());
    }

    @Test
    void testGetHashLength() {
		assertEquals(48, YCFLibDbKeyHash384.HASH_LENGTH);
		YCFLibDbKeyHash384 k = new YCFLibDbKeyHash384();
		assertEquals(48, k.getHashLength());
    }

    @Test
    void testGetHashLengthString() {
		assertEquals(96, YCFLibDbKeyHash384.HASH_LENGTH_STRING);
		YCFLibDbKeyHash384 k = new YCFLibDbKeyHash384();
		assertEquals(96, k.getHashLengthString());
    }

    @Test
    void testGetBytes() {
		YCFLibDbKeyHash384 k = new YCFLibDbKeyHash384();
		byte[] bytes = k.getBytes();
		assertNull(bytes);
		YCFLibDbKeyHash384 k2 = YCFLibDbKeyHash384.nullGet();
		byte[] bytes2 = k2.getBytes();
		assertNotNull(bytes2);
    }

    @Test
    void testNullGet() {
		YCFLibDbKeyHash384 n = YCFLibDbKeyHash384.nullGet();
		byte[] bytes = n.getBytes();
		assertNotNull(bytes);
		assertEquals(48, bytes.length);
		for (int i = 0; i < bytes.length; i++) {
			assertEquals(0, bytes[i]);
		}
    }

	@Test
    void testCompareOrdered() {

		YCFLibDbKeyHash384 nullA = YCFLibDbKeyHash384.nullGet();
		YCFLibDbKeyHash384 nullB = YCFLibDbKeyHash384.nullGet();
		assertEquals(0, YCFLibDbKeyHash384.compareOrdered(nullA, nullB));

		byte[] bA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};
		byte[] bB = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49};
		YCFLibDbKeyHash384 valA = new YCFLibDbKeyHash384(bA);
		assertEquals(0, YCFLibDbKeyHash384.compareOrdered(valA, valA));
		YCFLibDbKeyHash384 anotherA = new YCFLibDbKeyHash384(bA);
		assertEquals(0, YCFLibDbKeyHash384.compareOrdered(valA, anotherA));

		YCFLibDbKeyHash384 valB = new YCFLibDbKeyHash384(bB);
		assertTrue(YCFLibDbKeyHash384.compareOrdered(valA, valB) < 0);
		assertTrue(YCFLibDbKeyHash384.compareOrdered(valB, valA) > 0);

		YCFLibDbKeyHash384 notNull = new YCFLibDbKeyHash384(0);
		assertTrue(YCFLibDbKeyHash384.compareOrdered(nullA, notNull) != 0);
		assertTrue(YCFLibDbKeyHash384.compareOrdered(notNull, nullA) != 0);
    }
}
