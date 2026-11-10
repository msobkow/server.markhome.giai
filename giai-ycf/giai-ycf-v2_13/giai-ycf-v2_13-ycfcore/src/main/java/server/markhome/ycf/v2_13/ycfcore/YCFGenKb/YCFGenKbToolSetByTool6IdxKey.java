// Description: Java 11 implementation of a ToolSet by Tool6Idx index key object.

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

public class YCFGenKbToolSetByTool6IdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Short optionalToolId6;
	public YCFGenKbToolSetByTool6IdxKey() {
		optionalToolId6 = null;
	}

	public Short getOptionalToolId6() {
		return( optionalToolId6 );
	}

	public void setOptionalToolId6( Short value ) {
		if( value == null ) {
			optionalToolId6 = null;
		}
		else if( value < YCFGenKbToolSetBuff.TOOLID6_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalToolId6",
				1,
				"value",
				value,
				YCFGenKbToolSetBuff.TOOLID6_MIN_VALUE );
		}
		else if( value > YCFGenKbToolSetBuff.TOOLID6_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalToolId6",
				1,
				"value",
				value,
				YCFGenKbToolSetBuff.TOOLID6_MAX_VALUE );
		}
		else {
			optionalToolId6 = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbToolSetByTool6IdxKey ) {
			YCFGenKbToolSetByTool6IdxKey rhs = (YCFGenKbToolSetByTool6IdxKey)obj;
			if( getOptionalToolId6() != null ) {
				if( rhs.getOptionalToolId6() != null ) {
					if( ! getOptionalToolId6().equals( rhs.getOptionalToolId6() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId6() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbToolSetBuff ) {
			YCFGenKbToolSetBuff rhs = (YCFGenKbToolSetBuff)obj;
			if( getOptionalToolId6() != null ) {
				if( rhs.getOptionalToolId6() != null ) {
					if( ! getOptionalToolId6().equals( rhs.getOptionalToolId6() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId6() != null ) {
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
		if( getOptionalToolId6() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalToolId6();
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
		else if( obj instanceof YCFGenKbToolSetByTool6IdxKey ) {
			YCFGenKbToolSetByTool6IdxKey rhs = (YCFGenKbToolSetByTool6IdxKey)obj;
			if( getOptionalToolId6() != null ) {
				Short lhsToolId6 = getOptionalToolId6();
				if( rhs.getOptionalToolId6() != null ) {
					Short rhsToolId6 = rhs.getOptionalToolId6();
					int cmp = lhsToolId6.compareTo( rhsToolId6 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId6() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbToolSetBuff ) {
			YCFGenKbToolSetBuff rhs = (YCFGenKbToolSetBuff)obj;
			if( getOptionalToolId6() != null ) {
				Short lhsToolId6 = getOptionalToolId6();
				if( rhs.getOptionalToolId6() != null ) {
					Short rhsToolId6 = rhs.getOptionalToolId6();
					int cmp = lhsToolId6.compareTo( rhsToolId6 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId6() != null ) {
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
		String ret = "<YCFGenKbToolSetByTool6Idx"
			+ " OptionalToolId6=" + ( ( getOptionalToolId6() == null ) ? "null" : "\"" + getOptionalToolId6().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
