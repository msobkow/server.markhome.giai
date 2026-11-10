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

public class YCFLibDbKeyHash224Test {

    @Test
    void testGetHashAlgo() {
		assertEquals("SHA-224", YCFLibDbKeyHash224.HASH_ALGO);
		YCFLibDbKeyHash224 k = new YCFLibDbKeyHash224();
		assertEquals("SHA-224", k.getHashAlgo());
    }

    @Test
    void testGetHashLength() {
		assertEquals(28, YCFLibDbKeyHash224.HASH_LENGTH);
		YCFLibDbKeyHash224 k = new YCFLibDbKeyHash224();
		assertEquals(28, k.getHashLength());
    }

    @Test
    void testGetHashLengthString() {
		assertEquals(56, YCFLibDbKeyHash224.HASH_LENGTH_STRING);
		YCFLibDbKeyHash224 k = new YCFLibDbKeyHash224();
		assertEquals(56, k.getHashLengthString());
    }

    @Test
    void testGetBytes() {
		YCFLibDbKeyHash224 k = new YCFLibDbKeyHash224();
		byte[] bytes = k.getBytes();
		assertNull(bytes);
		YCFLibDbKeyHash224 k2 = YCFLibDbKeyHash224.nullGet();
		byte[] bytes2 = k2.getBytes();
		assertNotNull(bytes2);
    }

    @Test
    void testNullGet() {
		YCFLibDbKeyHash224 n = YCFLibDbKeyHash224.nullGet();
		byte[] bytes = n.getBytes();
		assertNotNull(bytes);
		assertEquals(28, bytes.length);
		for (int i = 0; i < bytes.length; i++) {
			assertEquals(0, bytes[i]);
		}
    }

	@Test
    void testCompareOrdered() {

		YCFLibDbKeyHash224 nullA = YCFLibDbKeyHash224.nullGet();
		YCFLibDbKeyHash224 nullB = YCFLibDbKeyHash224.nullGet();
		assertEquals(0, YCFLibDbKeyHash224.compareOrdered(nullA, nullB));

		byte[] bA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
		byte[] bB = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
		YCFLibDbKeyHash224 valA = new YCFLibDbKeyHash224(bA);
		assertEquals(0, YCFLibDbKeyHash224.compareOrdered(valA, valA));
		YCFLibDbKeyHash224 anotherA = new YCFLibDbKeyHash224(bA);
		assertEquals(0, YCFLibDbKeyHash224.compareOrdered(valA, anotherA));

		YCFLibDbKeyHash224 valB = new YCFLibDbKeyHash224(bB);
		assertTrue(YCFLibDbKeyHash224.compareOrdered(valA, valB) < 0);
		assertTrue(YCFLibDbKeyHash224.compareOrdered(valB, valA) > 0);

		YCFLibDbKeyHash224 notNull = new YCFLibDbKeyHash224(0);
		assertTrue(YCFLibDbKeyHash224.compareOrdered(nullA, notNull) != 0);
		assertTrue(YCFLibDbKeyHash224.compareOrdered(notNull, nullA) != 0);
    }
}
