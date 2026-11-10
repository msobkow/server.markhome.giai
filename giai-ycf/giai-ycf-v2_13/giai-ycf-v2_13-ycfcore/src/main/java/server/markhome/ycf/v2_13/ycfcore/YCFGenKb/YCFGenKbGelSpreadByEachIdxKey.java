// Description: Java 11 implementation of a GelSpread by EachIdx index key object.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

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

public class YCFGenKbGelSpreadByEachIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String requiredExpandEach;
	public YCFGenKbGelSpreadByEachIdxKey() {
		requiredExpandEach = new String( YCFGenKbGelSpreadBuff.EXPANDEACH_INIT_VALUE );
	}

	public String getRequiredExpandEach() {
		return( requiredExpandEach );
	}

	public void setRequiredExpandEach( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredExpandEach",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredExpandEach",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredExpandEach = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbGelSpreadByEachIdxKey ) {
			YCFGenKbGelSpreadByEachIdxKey rhs = (YCFGenKbGelSpreadByEachIdxKey)obj;
			if( ! getRequiredExpandEach().equals( rhs.getRequiredExpandEach() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelSpreadBuff ) {
			YCFGenKbGelSpreadBuff rhs = (YCFGenKbGelSpreadBuff)obj;
			if( ! getRequiredExpandEach().equals( rhs.getRequiredExpandEach() ) ) {
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
		if( getRequiredExpandEach() != null ) {
			hashCode = hashCode + getRequiredExpandEach().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFGenKbGelSpreadByEachIdxKey ) {
			YCFGenKbGelSpreadByEachIdxKey rhs = (YCFGenKbGelSpreadByEachIdxKey)obj;
			{
				int cmp = getRequiredExpandEach().compareTo( rhs.getRequiredExpandEach() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelSpreadBuff ) {
			YCFGenKbGelSpreadBuff rhs = (YCFGenKbGelSpreadBuff)obj;
			{
				int cmp = getRequiredExpandEach().compareTo( rhs.getRequiredExpandEach() );
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
		String ret = "<YCFGenKbGelSpreadByEachIdx"
			+ " RequiredExpandEach=" + "\"" + YCFGenKbSchema.xmlEncodeString( getRequiredExpandEach() ) + "\""
			+ "/>";
		return( ret );
	}
}
