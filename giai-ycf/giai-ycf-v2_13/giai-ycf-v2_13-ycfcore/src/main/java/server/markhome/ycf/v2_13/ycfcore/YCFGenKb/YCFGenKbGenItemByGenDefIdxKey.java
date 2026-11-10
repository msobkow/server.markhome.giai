// Description: Java 11 implementation of a GenItem by GenDefIdx index key object.

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

public class YCFGenKbGenItemByGenDefIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected short requiredGenDefId;
	public YCFGenKbGenItemByGenDefIdxKey() {
		requiredGenDefId = YCFGenKbGenItemBuff.GENDEFID_INIT_VALUE;
	}

	public short getRequiredGenDefId() {
		return( requiredGenDefId );
	}

	public void setRequiredGenDefId( short value ) {
		if( value < YCFGenKbGenItemBuff.GENDEFID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredGenDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GENDEFID_MIN_VALUE );
		}
		if( value > YCFGenKbGenItemBuff.GENDEFID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredGenDefId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GENDEFID_MAX_VALUE );
		}
		requiredGenDefId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbGenItemByGenDefIdxKey ) {
			YCFGenKbGenItemByGenDefIdxKey rhs = (YCFGenKbGenItemByGenDefIdxKey)obj;
			if( getRequiredGenDefId() != rhs.getRequiredGenDefId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			if( getRequiredGenDefId() != rhs.getRequiredGenDefId() ) {
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
		hashCode = ( hashCode * 0x10000 ) + getRequiredGenDefId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFGenKbGenItemByGenDefIdxKey ) {
			YCFGenKbGenItemByGenDefIdxKey rhs = (YCFGenKbGenItemByGenDefIdxKey)obj;
			if( getRequiredGenDefId() < rhs.getRequiredGenDefId() ) {
				return( -1 );
			}
			else if( getRequiredGenDefId() > rhs.getRequiredGenDefId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			if( getRequiredGenDefId() < rhs.getRequiredGenDefId() ) {
				return( -1 );
			}
			else if( getRequiredGenDefId() > rhs.getRequiredGenDefId() ) {
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
		String ret = "<YCFGenKbGenItemByGenDefIdx"
			+ " RequiredGenDefId=" + "\"" + Short.toString( getRequiredGenDefId() ) + "\""
			+ "/>";
		return( ret );
	}
}
