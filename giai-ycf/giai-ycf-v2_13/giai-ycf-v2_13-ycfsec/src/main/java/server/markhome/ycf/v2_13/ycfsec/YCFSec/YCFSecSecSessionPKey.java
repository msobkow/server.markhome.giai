// Description: Java 11 implementation of a SecSession primary key object.

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
import org.apache.commons.codec.binary.Base64;

/*
 *	YCFSecSecSessionPKey Primary Key for SecSession

 *		requiredSecSessionId	Required object attribute SecSessionId. */
public class YCFSecSecSessionPKey
	implements Comparable<Object>,
		Serializable
{

	protected UUID requiredSecSessionId;
	public YCFSecSecSessionPKey() {
		requiredSecSessionId = UUID.fromString( YCFSecSecSessionBuff.SECSESSIONID_INIT_VALUE.toString() );
	}

	public UUID getRequiredSecSessionId() {
		return( requiredSecSessionId );
	}

	public void setRequiredSecSessionId( UUID value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredSecSessionId",
				1,
				"value" );
		}
		requiredSecSessionId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecSecSessionHPKey ) {
			YCFSecSecSessionHPKey rhs = (YCFSecSecSessionHPKey)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionPKey ) {
			YCFSecSecSessionPKey rhs = (YCFSecSecSessionPKey)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionHBuff ) {
			YCFSecSecSessionHBuff rhs = (YCFSecSecSessionHBuff)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionBuff ) {
			YCFSecSecSessionBuff rhs = (YCFSecSecSessionBuff)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
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
		hashCode = hashCode + getRequiredSecSessionId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecSecSessionHPKey ) {
			YCFSecSecSessionHPKey rhs = (YCFSecSecSessionHPKey)obj;
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionPKey ) {
			YCFSecSecSessionPKey rhs = (YCFSecSecSessionPKey)obj;
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionBuff ) {
			YCFSecSecSessionBuff rhs = (YCFSecSecSessionBuff)obj;
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionHBuff ) {
			YCFSecSecSessionHBuff rhs = (YCFSecSecSessionHBuff)obj;
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
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
				"YCFSecSecSessionPKey, YCFSecSecSessionBuff" );
		}
	}

	public String toString() {
		String ret = "<YCFSecSecSessionPKey"
			+ " RequiredSecSessionId=" + "\"" + getRequiredSecSessionId().toString() + "\""
			+ "/>";
		return( ret );
	}
}
