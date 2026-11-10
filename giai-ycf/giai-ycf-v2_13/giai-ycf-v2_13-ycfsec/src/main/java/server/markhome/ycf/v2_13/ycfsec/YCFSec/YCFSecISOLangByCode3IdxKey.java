// Description: Java 11 implementation of a ISOLang by Code3Idx index key object.

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

public class YCFSecISOLangByCode3IdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String requiredISO6392Code;
	public YCFSecISOLangByCode3IdxKey() {
		requiredISO6392Code = new String( YCFSecISOLangBuff.ISO6392CODE_INIT_VALUE );
	}

	public String getRequiredISO6392Code() {
		return( requiredISO6392Code );
	}

	public void setRequiredISO6392Code( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredISO6392Code",
				1,
				"value" );
		}
		if( value.length() > 3 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredISO6392Code",
				1,
				"value.length()",
				value.length(),
				3 );
		}
		requiredISO6392Code = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecISOLangByCode3IdxKey ) {
			YCFSecISOLangByCode3IdxKey rhs = (YCFSecISOLangByCode3IdxKey)obj;
			if( ! getRequiredISO6392Code().equals( rhs.getRequiredISO6392Code() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOLangBuff ) {
			YCFSecISOLangBuff rhs = (YCFSecISOLangBuff)obj;
			if( ! getRequiredISO6392Code().equals( rhs.getRequiredISO6392Code() ) ) {
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
		if( getRequiredISO6392Code() != null ) {
			hashCode = hashCode + getRequiredISO6392Code().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFSecISOLangByCode3IdxKey ) {
			YCFSecISOLangByCode3IdxKey rhs = (YCFSecISOLangByCode3IdxKey)obj;
			{
				int cmp = getRequiredISO6392Code().compareTo( rhs.getRequiredISO6392Code() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecISOLangBuff ) {
			YCFSecISOLangBuff rhs = (YCFSecISOLangBuff)obj;
			{
				int cmp = getRequiredISO6392Code().compareTo( rhs.getRequiredISO6392Code() );
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
		String ret = "<YCFSecISOLangByCode3Idx"
			+ " RequiredISO6392Code=" + "\"" + YCFSecSchema.xmlEncodeString( getRequiredISO6392Code() ) + "\""
			+ "/>";
		return( ret );
	}
}
