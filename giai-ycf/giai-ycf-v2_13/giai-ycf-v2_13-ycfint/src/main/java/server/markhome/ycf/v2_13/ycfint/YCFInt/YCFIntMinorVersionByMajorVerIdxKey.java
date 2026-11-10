// Description: Java 11 implementation of a MinorVersion by MajorVerIdx index key object.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

package org.mssycf.mssycf.v2_13.ycfint.YCFInt;

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
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public class YCFIntMinorVersionByMajorVerIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	protected long requiredMajorVersionId;
	public YCFIntMinorVersionByMajorVerIdxKey() {
		requiredTenantId = YCFIntMinorVersionBuff.TENANTID_INIT_VALUE;
		requiredMajorVersionId = YCFIntMinorVersionBuff.MAJORVERSIONID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFIntMinorVersionBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFIntMinorVersionBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredMajorVersionId() {
		return( requiredMajorVersionId );
	}

	public void setRequiredMajorVersionId( long value ) {
		if( value < YCFIntMinorVersionBuff.MAJORVERSIONID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredMajorVersionId",
				1,
				"value",
				value,
				YCFIntMinorVersionBuff.MAJORVERSIONID_MIN_VALUE );
		}
		requiredMajorVersionId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFIntMinorVersionByMajorVerIdxKey ) {
			YCFIntMinorVersionByMajorVerIdxKey rhs = (YCFIntMinorVersionByMajorVerIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredMajorVersionId() != rhs.getRequiredMajorVersionId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFIntMinorVersionBuff ) {
			YCFIntMinorVersionBuff rhs = (YCFIntMinorVersionBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredMajorVersionId() != rhs.getRequiredMajorVersionId() ) {
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
		hashCode = hashCode + (int)( getRequiredMajorVersionId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFIntMinorVersionByMajorVerIdxKey ) {
			YCFIntMinorVersionByMajorVerIdxKey rhs = (YCFIntMinorVersionByMajorVerIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredMajorVersionId() < rhs.getRequiredMajorVersionId() ) {
				return( -1 );
			}
			else if( getRequiredMajorVersionId() > rhs.getRequiredMajorVersionId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFIntMinorVersionBuff ) {
			YCFIntMinorVersionBuff rhs = (YCFIntMinorVersionBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredMajorVersionId() < rhs.getRequiredMajorVersionId() ) {
				return( -1 );
			}
			else if( getRequiredMajorVersionId() > rhs.getRequiredMajorVersionId() ) {
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
		String ret = "<YCFIntMinorVersionByMajorVerIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredMajorVersionId=" + "\"" + Long.toString( getRequiredMajorVersionId() ) + "\""
			+ "/>";
		return( ret );
	}
}
