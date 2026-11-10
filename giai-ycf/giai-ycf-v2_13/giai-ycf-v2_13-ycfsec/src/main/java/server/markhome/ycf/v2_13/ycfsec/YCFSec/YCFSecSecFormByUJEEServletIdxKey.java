// Description: Java 11 implementation of a SecForm by UJEEServletIdx index key object.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSec;

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

public class YCFSecSecFormByUJEEServletIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClusterId;
	protected int requiredSecAppId;
	protected String requiredJEEServletMapName;
	public YCFSecSecFormByUJEEServletIdxKey() {
		requiredClusterId = YCFSecSecFormBuff.CLUSTERID_INIT_VALUE;
		requiredSecAppId = YCFSecSecFormBuff.SECAPPID_INIT_VALUE;
		requiredJEEServletMapName = new String( YCFSecSecFormBuff.JEESERVLETMAPNAME_INIT_VALUE );
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < YCFSecSecFormBuff.CLUSTERID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				YCFSecSecFormBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public int getRequiredSecAppId() {
		return( requiredSecAppId );
	}

	public void setRequiredSecAppId( int value ) {
		if( value < YCFSecSecFormBuff.SECAPPID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredSecAppId",
				1,
				"value",
				value,
				YCFSecSecFormBuff.SECAPPID_MIN_VALUE );
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
		else if( obj instanceof YCFSecSecFormByUJEEServletIdxKey ) {
			YCFSecSecFormByUJEEServletIdxKey rhs = (YCFSecSecFormByUJEEServletIdxKey)obj;
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
		else if( obj instanceof YCFSecSecFormBuff ) {
			YCFSecSecFormBuff rhs = (YCFSecSecFormBuff)obj;
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
		else if( obj instanceof YCFSecSecFormByUJEEServletIdxKey ) {
			YCFSecSecFormByUJEEServletIdxKey rhs = (YCFSecSecFormByUJEEServletIdxKey)obj;
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
		else if( obj instanceof YCFSecSecFormBuff ) {
			YCFSecSecFormBuff rhs = (YCFSecSecFormBuff)obj;
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
		String ret = "<YCFSecSecFormByUJEEServletIdx"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredSecAppId=" + "\"" + Integer.toString( getRequiredSecAppId() ) + "\""
			+ " RequiredJEEServletMapName=" + "\"" + YCFSecSchema.xmlEncodeString( getRequiredJEEServletMapName() ) + "\""
			+ "/>";
		return( ret );
	}
}
