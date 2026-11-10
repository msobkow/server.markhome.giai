// Description: Java 11 implementation of a Cluster primary key object.

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
 *	YCFSecClusterPKey Primary Key for Cluster

 *		requiredId	Required object attribute Id. */
public class YCFSecClusterPKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredId;
	public YCFSecClusterPKey() {
		requiredId = YCFSecClusterBuff.ID_INIT_VALUE;
	}

	public long getRequiredId() {
		return( requiredId );
	}

	public void setRequiredId( long value ) {
		if( value < YCFSecClusterBuff.ID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredId",
				1,
				"value",
				value,
				YCFSecClusterBuff.ID_MIN_VALUE );
		}
		requiredId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecClusterHPKey ) {
			YCFSecClusterHPKey rhs = (YCFSecClusterHPKey)obj;
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecClusterPKey ) {
			YCFSecClusterPKey rhs = (YCFSecClusterPKey)obj;
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecClusterHBuff ) {
			YCFSecClusterHBuff rhs = (YCFSecClusterHBuff)obj;
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecClusterBuff ) {
			YCFSecClusterBuff rhs = (YCFSecClusterBuff)obj;
			if( getRequiredId() != rhs.getRequiredId() ) {
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
		hashCode = hashCode + (int)( getRequiredId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecClusterHPKey ) {
			YCFSecClusterHPKey rhs = (YCFSecClusterHPKey)obj;
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecClusterPKey ) {
			YCFSecClusterPKey rhs = (YCFSecClusterPKey)obj;
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecClusterBuff ) {
			YCFSecClusterBuff rhs = (YCFSecClusterBuff)obj;
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecClusterHBuff ) {
			YCFSecClusterHBuff rhs = (YCFSecClusterHBuff)obj;
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"YCFSecClusterPKey, YCFSecClusterBuff" );
		}
	}

	public String toString() {
		String ret = "<YCFSecClusterPKey"
			+ " RequiredId=" + "\"" + Long.toString( getRequiredId() ) + "\""
			+ "/>";
		return( ret );
	}
}
