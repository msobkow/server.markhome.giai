// Description: Java 11 implementation of a SysCluster buffer object.

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

public class YCFSecSysClusterBuff
{
	public final static String CLASS_CODE = "a014";
	public static final int SINGLETONID_INIT_VALUE = 1;
	public static final long CLUSTERID_INIT_VALUE = 0L;
	public static final int SINGLETONID_MIN_VALUE = 1;
	public static final long CLUSTERID_MIN_VALUE = 0L;
	public static final int SINGLETONID_MAX_VALUE = 1;
	protected int requiredSingletonId;
	protected long requiredClusterId;
	protected int requiredRevision;
	public YCFSecSysClusterBuff() {
		requiredSingletonId = YCFSecSysClusterBuff.SINGLETONID_INIT_VALUE;
		requiredClusterId = YCFSecSysClusterBuff.CLUSTERID_INIT_VALUE;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public int getRequiredSingletonId() {
		return( requiredSingletonId );
	}

	public void setRequiredSingletonId( int value ) {
		if( value < YCFSecSysClusterBuff.SINGLETONID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				YCFSecSysClusterBuff.SINGLETONID_MIN_VALUE );
		}
		if( value > YCFSecSysClusterBuff.SINGLETONID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				YCFSecSysClusterBuff.SINGLETONID_MAX_VALUE );
		}
		requiredSingletonId = value;
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < YCFSecSysClusterBuff.CLUSTERID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				YCFSecSysClusterBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public int getRequiredRevision() {
		return( requiredRevision );
	}

	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecSysClusterBuff ) {
			YCFSecSysClusterBuff rhs = (YCFSecSysClusterBuff)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSysClusterPKey ) {
			YCFSecSysClusterPKey rhs = (YCFSecSysClusterPKey)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSysClusterHBuff ) {
			YCFSecSysClusterHBuff rhs = (YCFSecSysClusterHBuff)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSysClusterHPKey ) {
			YCFSecSysClusterHPKey rhs = (YCFSecSysClusterHPKey)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSysClusterByClusterIdxKey ) {
			YCFSecSysClusterByClusterIdxKey rhs = (YCFSecSysClusterByClusterIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getRequiredSingletonId();
		hashCode = hashCode + (int)( getRequiredClusterId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecSysClusterBuff ) {
			YCFSecSysClusterBuff rhs = (YCFSecSysClusterBuff)obj;
			int retval = 0;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSysClusterPKey ) {
			YCFSecSysClusterPKey rhs = (YCFSecSysClusterPKey)obj;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSysClusterHPKey ) {
			YCFSecSysClusterHPKey rhs = (YCFSecSysClusterHPKey)obj;
			{
				int lhsRequiredRevision = getRequiredRevision();
				int rhsRequiredRevision = rhs.getRequiredRevision();
				if( lhsRequiredRevision < rhsRequiredRevision ) {
					return( -1 );
				}
				else if( lhsRequiredRevision > rhsRequiredRevision ) {
					return( 1 );
				}
			}
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSysClusterHBuff ) {
			YCFSecSysClusterHBuff rhs = (YCFSecSysClusterHBuff)obj;
			int retval = 0;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSysClusterByClusterIdxKey ) {
			YCFSecSysClusterByClusterIdxKey rhs = (YCFSecSysClusterByClusterIdxKey)obj;

			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public void set( YCFSecSysClusterBuff src ) {
		setSysClusterBuff( src );
	}

	public void setSysClusterBuff( YCFSecSysClusterBuff src ) {
		setRequiredSingletonId( src.getRequiredSingletonId() );
		setRequiredClusterId( src.getRequiredClusterId() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( YCFSecSysClusterHBuff src ) {
		setSysClusterBuff( src );
	}

	public void setSysClusterBuff( YCFSecSysClusterHBuff src ) {
		setRequiredSingletonId( src.getRequiredSingletonId() );
		setRequiredClusterId( src.getRequiredClusterId() );
	}
}
