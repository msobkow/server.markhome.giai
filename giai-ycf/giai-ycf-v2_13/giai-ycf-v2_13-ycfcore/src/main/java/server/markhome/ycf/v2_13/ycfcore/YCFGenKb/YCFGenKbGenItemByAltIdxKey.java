// Description: Java 11 implementation of a GenItem by AltIdx index key object.

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

public class YCFGenKbGenItemByAltIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String requiredName;
	protected short requiredToolSetId;
	protected Short optionalScopeDefId;
	protected short requiredGenDefId;
	public YCFGenKbGenItemByAltIdxKey() {
		requiredName = new String( YCFGenKbGenItemBuff.NAME_INIT_VALUE );
		requiredToolSetId = YCFGenKbGenItemBuff.TOOLSETID_INIT_VALUE;
		optionalScopeDefId = null;
		requiredGenDefId = YCFGenKbGenItemBuff.GENDEFID_INIT_VALUE;
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredName = value;
	}

	public short getRequiredToolSetId() {
		return( requiredToolSetId );
	}

	public void setRequiredToolSetId( short value ) {
		if( value < YCFGenKbGenItemBuff.TOOLSETID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredToolSetId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.TOOLSETID_MIN_VALUE );
		}
		if( value > YCFGenKbGenItemBuff.TOOLSETID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredToolSetId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.TOOLSETID_MAX_VALUE );
		}
		requiredToolSetId = value;
	}

	public Short getOptionalScopeDefId() {
		return( optionalScopeDefId );
	}

	public void setOptionalScopeDefId( Short value ) {
		if( value == null ) {
			optionalScopeDefId = null;
		}
		else if( value < YCFGenKbGenItemBuff.SCOPEDEFID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalScopeDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.SCOPEDEFID_MIN_VALUE );
		}
		else if( value > YCFGenKbGenItemBuff.SCOPEDEFID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalScopeDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.SCOPEDEFID_MAX_VALUE );
		}
		else {
			optionalScopeDefId = value;
		}
	}

	public short getRequiredGenDefId() {
		return( requiredGenDefId );
	}

	public void setRequiredGenDefId( short value ) {
		if( value < YCFGenKbGenItemBuff.GENDEFID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredGenDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GENDEFID_MIN_VALUE );
		}
		if( value > YCFGenKbGenItemBuff.GENDEFID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredGenDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GENDEFID_MAX_VALUE );
		}
		requiredGenDefId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbGenItemByAltIdxKey ) {
			YCFGenKbGenItemByAltIdxKey rhs = (YCFGenKbGenItemByAltIdxKey)obj;
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( getRequiredToolSetId() != rhs.getRequiredToolSetId() ) {
				return( false );
			}
			if( getOptionalScopeDefId() != null ) {
				if( rhs.getOptionalScopeDefId() != null ) {
					if( ! getOptionalScopeDefId().equals( rhs.getOptionalScopeDefId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( false );
				}
			}
			if( getRequiredGenDefId() != rhs.getRequiredGenDefId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( getRequiredToolSetId() != rhs.getRequiredToolSetId() ) {
				return( false );
			}
			if( getOptionalScopeDefId() != null ) {
				if( rhs.getOptionalScopeDefId() != null ) {
					if( ! getOptionalScopeDefId().equals( rhs.getOptionalScopeDefId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( false );
				}
			}
			if( getRequiredGenDefId() != rhs.getRequiredGenDefId() ) {
				return( false );
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredToolSetId();
		if( getOptionalScopeDefId() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalScopeDefId();
		}
		else {
			hashCode = (hashCode * 0x10000 );
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredGenDefId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFGenKbGenItemByAltIdxKey ) {
			YCFGenKbGenItemByAltIdxKey rhs = (YCFGenKbGenItemByAltIdxKey)obj;
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getRequiredToolSetId() < rhs.getRequiredToolSetId() ) {
				return( -1 );
			}
			else if( getRequiredToolSetId() > rhs.getRequiredToolSetId() ) {
				return( 1 );
			}
			if( getOptionalScopeDefId() != null ) {
				Short lhsScopeDefId = getOptionalScopeDefId();
				if( rhs.getOptionalScopeDefId() != null ) {
					Short rhsScopeDefId = rhs.getOptionalScopeDefId();
					int cmp = lhsScopeDefId.compareTo( rhsScopeDefId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredGenDefId() < rhs.getRequiredGenDefId() ) {
				return( -1 );
			}
			else if( getRequiredGenDefId() > rhs.getRequiredGenDefId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getRequiredToolSetId() < rhs.getRequiredToolSetId() ) {
				return( -1 );
			}
			else if( getRequiredToolSetId() > rhs.getRequiredToolSetId() ) {
				return( 1 );
			}
			if( getOptionalScopeDefId() != null ) {
				Short lhsScopeDefId = getOptionalScopeDefId();
				if( rhs.getOptionalScopeDefId() != null ) {
					Short rhsScopeDefId = rhs.getOptionalScopeDefId();
					int cmp = lhsScopeDefId.compareTo( rhsScopeDefId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalScopeDefId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredGenDefId() < rhs.getRequiredGenDefId() ) {
				return( -1 );
			}
			else if( getRequiredGenDefId() > rhs.getRequiredGenDefId() ) {
				return( 1 );
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
		String ret = "<YCFGenKbGenItemByAltIdx"
			+ " RequiredName=" + "\"" + YCFGenKbSchema.xmlEncodeString( getRequiredName() ) + "\""
			+ " RequiredToolSetId=" + "\"" + Short.toString( getRequiredToolSetId() ) + "\""
			+ " OptionalScopeDefId=" + ( ( getOptionalScopeDefId() == null ) ? "null" : "\"" + getOptionalScopeDefId().toString() + "\"" )
			+ " RequiredGenDefId=" + "\"" + Short.toString( getRequiredGenDefId() ) + "\""
			+ "/>";
		return( ret );
	}
}
