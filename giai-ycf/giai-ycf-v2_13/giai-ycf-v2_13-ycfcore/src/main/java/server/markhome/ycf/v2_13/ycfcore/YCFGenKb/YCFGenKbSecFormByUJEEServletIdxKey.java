// Description: Java 11 implementation of a SecForm by UJEEServletIdx index key object.

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

public class YCFGenKbSecFormByUJEEServletIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClusterId;
	protected int requiredSecAppId;
	protected String requiredJEEServletMapName;
	public YCFGenKbSecFormByUJEEServletIdxKey() {
		requiredClusterId = YCFGenKbSecFormBuff.CLUSTERID_INIT_VALUE;
		requiredSecAppId = YCFGenKbSecFormBuff.SECAPPID_INIT_VALUE;
		requiredJEEServletMapName = new String( YCFGenKbSecFormBuff.JEESERVLETMAPNAME_INIT_VALUE );
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < YCFGenKbSecFormBuff.CLUSTERID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				YCFGenKbSecFormBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public int getRequiredSecAppId() {
		return( requiredSecAppId );
	}

	public void setRequiredSecAppId( int value ) {
		if( value < YCFGenKbSecFormBuff.SECAPPID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredSecAppId",
				1,
				"value",
				value,
				YCFGenKbSecFormBuff.SECAPPID_MIN_VALUE );
		}
		requiredSecAppId = value;
	}

	public String getRequiredJEEServletMapName() {
		return( requiredJEEServletMapName );
	}

	public void setRequiredJEEServletMapName( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredJEEServletMapName",
				1,
				"value" );
		}
		if( value.length() > 192 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredJEEServletMapName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredJEEServletMapName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbSecFormByUJEEServletIdxKey ) {
			YCFGenKbSecFormByUJEEServletIdxKey rhs = (YCFGenKbSecFormByUJEEServletIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecAppId() != rhs.getRequiredSecAppId() ) {
				return( false );
			}
			if( ! getRequiredJEEServletMapName().equals( rhs.getRequiredJEEServletMapName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbSecFormBuff ) {
			YCFGenKbSecFormBuff rhs = (YCFGenKbSecFormBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecAppId() != rhs.getRequiredSecAppId() ) {
				return( false );
			}
			if( ! getRequiredJEEServletMapName().equals( rhs.getRequiredJEEServletMapName() ) ) {
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
		hashCode = hashCode + (int)( getRequiredClusterId() );
		hashCode = hashCode + getRequiredSecAppId();
		if( getRequiredJEEServletMapName() != null ) {
			hashCode = hashCode + getRequiredJEEServletMapName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFGenKbSecFormByUJEEServletIdxKey ) {
			YCFGenKbSecFormByUJEEServletIdxKey rhs = (YCFGenKbSecFormByUJEEServletIdxKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecAppId() < rhs.getRequiredSecAppId() ) {
				return( -1 );
			}
			else if( getRequiredSecAppId() > rhs.getRequiredSecAppId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredJEEServletMapName().compareTo( rhs.getRequiredJEEServletMapName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbSecFormBuff ) {
			YCFGenKbSecFormBuff rhs = (YCFGenKbSecFormBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecAppId() < rhs.getRequiredSecAppId() ) {
				return( -1 );
			}
			else if( getRequiredSecAppId() > rhs.getRequiredSecAppId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredJEEServletMapName().compareTo( rhs.getRequiredJEEServletMapName() );
				if( cmp != 0 ) {
					return( cmp );
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
		String ret = "<YCFGenKbSecFormByUJEEServletIdx"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredSecAppId=" + "\"" + Integer.toString( getRequiredSecAppId() ) + "\""
			+ " RequiredJEEServletMapName=" + "\"" + YCFGenKbSchema.xmlEncodeString( getRequiredJEEServletMapName() ) + "\""
			+ "/>";
		return( ret );
	}
}
