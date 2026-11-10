// Description: Java 11 implementation of a ToolSet by Tool3Idx index key object.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
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
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

public class YCFGenKbToolSetByTool3IdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Short optionalToolId3;
	public YCFGenKbToolSetByTool3IdxKey() {
		optionalToolId3 = null;
	}

	public Short getOptionalToolId3() {
		return( optionalToolId3 );
	}

	public void setOptionalToolId3( Short value ) {
		if( value == null ) {
			optionalToolId3 = null;
		}
		else if( value < YCFGenKbToolSetBuff.TOOLID3_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalToolId3",
				1,
				"value",
				value,
				YCFGenKbToolSetBuff.TOOLID3_MIN_VALUE );
		}
		else if( value > YCFGenKbToolSetBuff.TOOLID3_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalToolId3",
				1,
				"value",
				value,
				YCFGenKbToolSetBuff.TOOLID3_MAX_VALUE );
		}
		else {
			optionalToolId3 = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbToolSetByTool3IdxKey ) {
			YCFGenKbToolSetByTool3IdxKey rhs = (YCFGenKbToolSetByTool3IdxKey)obj;
			if( getOptionalToolId3() != null ) {
				if( rhs.getOptionalToolId3() != null ) {
					if( ! getOptionalToolId3().equals( rhs.getOptionalToolId3() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId3() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbToolSetBuff ) {
			YCFGenKbToolSetBuff rhs = (YCFGenKbToolSetBuff)obj;
			if( getOptionalToolId3() != null ) {
				if( rhs.getOptionalToolId3() != null ) {
					if( ! getOptionalToolId3().equals( rhs.getOptionalToolId3() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId3() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getOptionalToolId3() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalToolId3();
		}
		else {
			hashCode = (hashCode * 0x10000 );
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFGenKbToolSetByTool3IdxKey ) {
			YCFGenKbToolSetByTool3IdxKey rhs = (YCFGenKbToolSetByTool3IdxKey)obj;
			if( getOptionalToolId3() != null ) {
				Short lhsToolId3 = getOptionalToolId3();
				if( rhs.getOptionalToolId3() != null ) {
					Short rhsToolId3 = rhs.getOptionalToolId3();
					int cmp = lhsToolId3.compareTo( rhsToolId3 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId3() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbToolSetBuff ) {
			YCFGenKbToolSetBuff rhs = (YCFGenKbToolSetBuff)obj;
			if( getOptionalToolId3() != null ) {
				Short lhsToolId3 = getOptionalToolId3();
				if( rhs.getOptionalToolId3() != null ) {
					Short rhsToolId3 = rhs.getOptionalToolId3();
					int cmp = lhsToolId3.compareTo( rhsToolId3 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId3() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<YCFGenKbToolSetByTool3Idx"
			+ " OptionalToolId3=" + ( ( getOptionalToolId3() == null ) ? "null" : "\"" + getOptionalToolId3().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
