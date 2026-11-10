// Description: Java 11 implementation of a Service by TypeIdx index key object.

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

public class YCFSecServiceByTypeIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected int requiredServiceTypeId;
	public YCFSecServiceByTypeIdxKey() {
		requiredServiceTypeId = YCFSecServiceBuff.SERVICETYPEID_INIT_VALUE;
	}

	public int getRequiredServiceTypeId() {
		return( requiredServiceTypeId );
	}

	public void setRequiredServiceTypeId( int value ) {
		if( value < YCFSecServiceBuff.SERVICETYPEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredServiceTypeId",
				1,
				"value",
				value,
				YCFSecServiceBuff.SERVICETYPEID_MIN_VALUE );
		}
		requiredServiceTypeId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecServiceByTypeIdxKey ) {
			YCFSecServiceByTypeIdxKey rhs = (YCFSecServiceByTypeIdxKey)obj;
			if( getRequiredServiceTypeId() != rhs.getRequiredServiceTypeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecServiceBuff ) {
			YCFSecServiceBuff rhs = (YCFSecServiceBuff)obj;
			if( getRequiredServiceTypeId() != rhs.getRequiredServiceTypeId() ) {
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
		hashCode = hashCode + getRequiredServiceTypeId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFSecServiceByTypeIdxKey ) {
			YCFSecServiceByTypeIdxKey rhs = (YCFSecServiceByTypeIdxKey)obj;
			if( getRequiredServiceTypeId() < rhs.getRequiredServiceTypeId() ) {
				return( -1 );
			}
			else if( getRequiredServiceTypeId() > rhs.getRequiredServiceTypeId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecServiceBuff ) {
			YCFSecServiceBuff rhs = (YCFSecServiceBuff)obj;
			if( getRequiredServiceTypeId() < rhs.getRequiredServiceTypeId() ) {
				return( -1 );
			}
			else if( getRequiredServiceTypeId() > rhs.getRequiredServiceTypeId() ) {
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
		String ret = "<YCFSecServiceByTypeIdx"
			+ " RequiredServiceTypeId=" + "\"" + Integer.toString( getRequiredServiceTypeId() ) + "\""
			+ "/>";
		return( ret );
	}
}
