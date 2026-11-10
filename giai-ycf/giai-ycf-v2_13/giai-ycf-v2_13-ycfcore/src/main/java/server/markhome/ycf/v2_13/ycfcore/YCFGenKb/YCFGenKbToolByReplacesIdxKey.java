// Description: Java 11 implementation of a Tool by ReplacesIdx index key object.

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

public class YCFGenKbToolByReplacesIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Short optionalReplacesId;
	public YCFGenKbToolByReplacesIdxKey() {
		optionalReplacesId = null;
	}

	public Short getOptionalReplacesId() {
		return( optionalReplacesId );
	}

	public void setOptionalReplacesId( Short value ) {
		if( value == null ) {
			optionalReplacesId = null;
		}
		else if( value < YCFGenKbToolBuff.REPLACESID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalReplacesId",
				1,
				"value",
				value,
				YCFGenKbToolBuff.REPLACESID_MIN_VALUE );
		}
		else if( value > YCFGenKbToolBuff.REPLACESID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalReplacesId",
				1,
				"value",
				value,
				YCFGenKbToolBuff.REPLACESID_MAX_VALUE );
		}
		else {
			optionalReplacesId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbToolByReplacesIdxKey ) {
			YCFGenKbToolByReplacesIdxKey rhs = (YCFGenKbToolByReplacesIdxKey)obj;
			if( getOptionalReplacesId() != null ) {
				if( rhs.getOptionalReplacesId() != null ) {
					if( ! getOptionalReplacesId().equals( rhs.getOptionalReplacesId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalReplacesId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbToolBuff ) {
			YCFGenKbToolBuff rhs = (YCFGenKbToolBuff)obj;
			if( getOptionalReplacesId() != null ) {
				if( rhs.getOptionalReplacesId() != null ) {
					if( ! getOptionalReplacesId().equals( rhs.getOptionalReplacesId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalReplacesId() != null ) {
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
		if( getOptionalReplacesId() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalReplacesId();
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
		else if( obj instanceof YCFGenKbToolByReplacesIdxKey ) {
			YCFGenKbToolByReplacesIdxKey rhs = (YCFGenKbToolByReplacesIdxKey)obj;
			if( getOptionalReplacesId() != null ) {
				Short lhsReplacesId = getOptionalReplacesId();
				if( rhs.getOptionalReplacesId() != null ) {
					Short rhsReplacesId = rhs.getOptionalReplacesId();
					int cmp = lhsReplacesId.compareTo( rhsReplacesId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalReplacesId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbToolBuff ) {
			YCFGenKbToolBuff rhs = (YCFGenKbToolBuff)obj;
			if( getOptionalReplacesId() != null ) {
				Short lhsReplacesId = getOptionalReplacesId();
				if( rhs.getOptionalReplacesId() != null ) {
					Short rhsReplacesId = rhs.getOptionalReplacesId();
					int cmp = lhsReplacesId.compareTo( rhsReplacesId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalReplacesId() != null ) {
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
		String ret = "<YCFGenKbToolByReplacesIdx"
			+ " OptionalReplacesId=" + ( ( getOptionalReplacesId() == null ) ? "null" : "\"" + getOptionalReplacesId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
