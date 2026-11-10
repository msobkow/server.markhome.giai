// Description: Java 11 implementation of a SecGroupForm by UFormIdx index key object.

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

public class YCFSecSecGroupFormByUFormIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClusterId;
	protected int requiredSecGroupId;
	protected int requiredSecFormId;
	public YCFSecSecGroupFormByUFormIdxKey() {
		requiredClusterId = YCFSecSecGroupFormBuff.CLUSTERID_INIT_VALUE;
		requiredSecGroupId = YCFSecSecGroupFormBuff.SECGROUPID_INIT_VALUE;
		requiredSecFormId = YCFSecSecGroupFormBuff.SEYCFORMID_INIT_VALUE;
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < YCFSecSecGroupFormBuff.CLUSTERID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				YCFSecSecGroupFormBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public int getRequiredSecGroupId() {
		return( requiredSecGroupId );
	}

	public void setRequiredSecGroupId( int value ) {
		if( value < YCFSecSecGroupFormBuff.SECGROUPID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredSecGroupId",
				1,
				"value",
				value,
				YCFSecSecGroupFormBuff.SECGROUPID_MIN_VALUE );
		}
		requiredSecGroupId = value;
	}

	public int getRequiredSecFormId() {
		return( requiredSecFormId );
	}

	public void setRequiredSecFormId( int value ) {
		if( value < YCFSecSecGroupFormBuff.SEYCFORMID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredSecFormId",
				1,
				"value",
				value,
				YCFSecSecGroupFormBuff.SEYCFORMID_MIN_VALUE );
		}
		requiredSecFormId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecSecGroupFormByUFormIdxKey ) {
			YCFSecSecGroupFormByUFormIdxKey rhs = (YCFSecSecGroupFormByUFormIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGroupId() != rhs.getRequiredSecGroupId() ) {
				return( false );
			}
			if( getRequiredSecFormId() != rhs.getRequiredSecFormId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGroupFormBuff ) {
			YCFSecSecGroupFormBuff rhs = (YCFSecSecGroupFormBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGroupId() != rhs.getRequiredSecGroupId() ) {
				return( false );
			}
			if( getRequiredSecFormId() != rhs.getRequiredSecFormId() ) {
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
		hashCode = hashCode + getRequiredSecGroupId();
		hashCode = hashCode + getRequiredSecFormId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFSecSecGroupFormByUFormIdxKey ) {
			YCFSecSecGroupFormByUFormIdxKey rhs = (YCFSecSecGroupFormByUFormIdxKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGroupId() < rhs.getRequiredSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredSecGroupId() > rhs.getRequiredSecGroupId() ) {
				return( 1 );
			}
			if( getRequiredSecFormId() < rhs.getRequiredSecFormId() ) {
				return( -1 );
			}
			else if( getRequiredSecFormId() > rhs.getRequiredSecFormId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecGroupFormBuff ) {
			YCFSecSecGroupFormBuff rhs = (YCFSecSecGroupFormBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGroupId() < rhs.getRequiredSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredSecGroupId() > rhs.getRequiredSecGroupId() ) {
				return( 1 );
			}
			if( getRequiredSecFormId() < rhs.getRequiredSecFormId() ) {
				return( -1 );
			}
			else if( getRequiredSecFormId() > rhs.getRequiredSecFormId() ) {
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
		String ret = "<YCFSecSecGroupFormByUFormIdx"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredSecGroupId=" + "\"" + Integer.toString( getRequiredSecGroupId() ) + "\""
			+ " RequiredSecFormId=" + "\"" + Integer.toString( getRequiredSecFormId() ) + "\""
			+ "/>";
		return( ret );
	}
}
