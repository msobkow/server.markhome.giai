// Description: Java 11 implementation of a TSecGrpInc primary key object.

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
 *	YCFSecTSecGrpIncPKey Primary Key for TSecGrpInc

 *		requiredTenantId	Required object attribute TenantId.
 *		requiredTSecGrpIncId	Required object attribute TSecGrpIncId. */
public class YCFSecTSecGrpIncPKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredTenantId;
	protected long requiredTSecGrpIncId;
	public YCFSecTSecGrpIncPKey() {
		requiredTenantId = YCFSecTSecGrpIncBuff.TENANTID_INIT_VALUE;
		requiredTSecGrpIncId = YCFSecTSecGrpIncBuff.TSECGRPINCID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFSecTSecGrpIncBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFSecTSecGrpIncBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredTSecGrpIncId() {
		return( requiredTSecGrpIncId );
	}

	public void setRequiredTSecGrpIncId( long value ) {
		if( value < YCFSecTSecGrpIncBuff.TSECGRPINCID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTSecGrpIncId",
				1,
				"value",
				value,
				YCFSecTSecGrpIncBuff.TSECGRPINCID_MIN_VALUE );
		}
		requiredTSecGrpIncId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecTSecGrpIncHPKey ) {
			YCFSecTSecGrpIncHPKey rhs = (YCFSecTSecGrpIncHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecTSecGrpIncPKey ) {
			YCFSecTSecGrpIncPKey rhs = (YCFSecTSecGrpIncPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecTSecGrpIncHBuff ) {
			YCFSecTSecGrpIncHBuff rhs = (YCFSecTSecGrpIncHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecTSecGrpIncBuff ) {
			YCFSecTSecGrpIncBuff rhs = (YCFSecTSecGrpIncBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
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
		hashCode = hashCode + (int)( getRequiredTenantId() );
		hashCode = hashCode + (int)( getRequiredTSecGrpIncId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecTSecGrpIncHPKey ) {
			YCFSecTSecGrpIncHPKey rhs = (YCFSecTSecGrpIncHPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncPKey ) {
			YCFSecTSecGrpIncPKey rhs = (YCFSecTSecGrpIncPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncBuff ) {
			YCFSecTSecGrpIncBuff rhs = (YCFSecTSecGrpIncBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncHBuff ) {
			YCFSecTSecGrpIncHBuff rhs = (YCFSecTSecGrpIncHBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff" );
		}
	}

	public String toString() {
		String ret = "<YCFSecTSecGrpIncPKey"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredTSecGrpIncId=" + "\"" + Long.toString( getRequiredTSecGrpIncId() ) + "\""
			+ "/>";
		return( ret );
	}
}
