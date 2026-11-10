// Description: Java 11 implementation of a URLProtocol primary key object.

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
import org.apache.commons.codec.binary.Base64;

/*
 *	YCFIntURLProtocolPKey Primary Key for URLProtocol

 *		requiredURLProtocolId	Required object attribute URLProtocolId. */
public class YCFIntURLProtocolPKey
	implements Comparable<Object>,
		Serializable
{

	protected int requiredURLProtocolId;
	public YCFIntURLProtocolPKey() {
		requiredURLProtocolId = YCFIntURLProtocolBuff.URLPROTOCOLID_INIT_VALUE;
	}

	public int getRequiredURLProtocolId() {
		return( requiredURLProtocolId );
	}

	public void setRequiredURLProtocolId( int value ) {
		if( value < YCFIntURLProtocolBuff.URLPROTOCOLID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredURLProtocolId",
				1,
				"value",
				value,
				YCFIntURLProtocolBuff.URLPROTOCOLID_MIN_VALUE );
		}
		requiredURLProtocolId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFIntURLProtocolHPKey ) {
			YCFIntURLProtocolHPKey rhs = (YCFIntURLProtocolHPKey)obj;
			if( getRequiredURLProtocolId() != rhs.getRequiredURLProtocolId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFIntURLProtocolPKey ) {
			YCFIntURLProtocolPKey rhs = (YCFIntURLProtocolPKey)obj;
			if( getRequiredURLProtocolId() != rhs.getRequiredURLProtocolId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFIntURLProtocolHBuff ) {
			YCFIntURLProtocolHBuff rhs = (YCFIntURLProtocolHBuff)obj;
			if( getRequiredURLProtocolId() != rhs.getRequiredURLProtocolId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFIntURLProtocolBuff ) {
			YCFIntURLProtocolBuff rhs = (YCFIntURLProtocolBuff)obj;
			if( getRequiredURLProtocolId() != rhs.getRequiredURLProtocolId() ) {
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
		hashCode = hashCode + getRequiredURLProtocolId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFIntURLProtocolHPKey ) {
			YCFIntURLProtocolHPKey rhs = (YCFIntURLProtocolHPKey)obj;
			if( getRequiredURLProtocolId() < rhs.getRequiredURLProtocolId() ) {
				return( -1 );
			}
			else if( getRequiredURLProtocolId() > rhs.getRequiredURLProtocolId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFIntURLProtocolPKey ) {
			YCFIntURLProtocolPKey rhs = (YCFIntURLProtocolPKey)obj;
			if( getRequiredURLProtocolId() < rhs.getRequiredURLProtocolId() ) {
				return( -1 );
			}
			else if( getRequiredURLProtocolId() > rhs.getRequiredURLProtocolId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFIntURLProtocolBuff ) {
			YCFIntURLProtocolBuff rhs = (YCFIntURLProtocolBuff)obj;
			if( getRequiredURLProtocolId() < rhs.getRequiredURLProtocolId() ) {
				return( -1 );
			}
			else if( getRequiredURLProtocolId() > rhs.getRequiredURLProtocolId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFIntURLProtocolHBuff ) {
			YCFIntURLProtocolHBuff rhs = (YCFIntURLProtocolHBuff)obj;
			if( getRequiredURLProtocolId() < rhs.getRequiredURLProtocolId() ) {
				return( -1 );
			}
			else if( getRequiredURLProtocolId() > rhs.getRequiredURLProtocolId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"YCFIntURLProtocolPKey, YCFIntURLProtocolBuff" );
		}
	}

	public String toString() {
		String ret = "<YCFIntURLProtocolPKey"
			+ " RequiredURLProtocolId=" + "\"" + Integer.toString( getRequiredURLProtocolId() ) + "\""
			+ "/>";
		return( ret );
	}
}
