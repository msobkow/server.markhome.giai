// Description: Java 11 implementation of a SecGrpMemb primary key object.

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
 *	YCFSecSecGrpMembPKey Primary Key for SecGrpMemb

 *		requiredClusterId	Required object attribute ClusterId.
 *		requiredSecGrpMembId	Required object attribute SecGrpMembId. */
public class YCFSecSecGrpMembPKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredClusterId;
	protected long requiredSecGrpMembId;
	public YCFSecSecGrpMembPKey() {
		requiredClusterId = YCFSecSecGrpMembBuff.CLUSTERID_INIT_VALUE;
		requiredSecGrpMembId = YCFSecSecGrpMembBuff.SECGRPMEMBID_INIT_VALUE;
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < YCFSecSecGrpMembBuff.CLUSTERID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				YCFSecSecGrpMembBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public long getRequiredSecGrpMembId() {
		return( requiredSecGrpMembId );
	}

	public void setRequiredSecGrpMembId( long value ) {
		if( value < YCFSecSecGrpMembBuff.SECGRPMEMBID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredSecGrpMembId",
				1,
				"value",
				value,
				YCFSecSecGrpMembBuff.SECGRPMEMBID_MIN_VALUE );
		}
		requiredSecGrpMembId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecSecGrpMembHPKey ) {
			YCFSecSecGrpMembHPKey rhs = (YCFSecSecGrpMembHPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembPKey ) {
			YCFSecSecGrpMembPKey rhs = (YCFSecSecGrpMembPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembHBuff ) {
			YCFSecSecGrpMembHBuff rhs = (YCFSecSecGrpMembHBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembBuff ) {
			YCFSecSecGrpMembBuff rhs = (YCFSecSecGrpMembBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
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
		hashCode = hashCode + (int)( getRequiredSecGrpMembId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecSecGrpMembHPKey ) {
			YCFSecSecGrpMembHPKey rhs = (YCFSecSecGrpMembHPKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembPKey ) {
			YCFSecSecGrpMembPKey rhs = (YCFSecSecGrpMembPKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembBuff ) {
			YCFSecSecGrpMembBuff rhs = (YCFSecSecGrpMembBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembHBuff ) {
			YCFSecSecGrpMembHBuff rhs = (YCFSecSecGrpMembHBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff" );
		}
	}

	public String toString() {
		String ret = "<YCFSecSecGrpMembPKey"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredSecGrpMembId=" + "\"" + Long.toString( getRequiredSecGrpMembId() ) + "\""
			+ "/>";
		return( ret );
	}
}
