// Description: Java 11 implementation of a DelSubDep1 by UNameIdx index key object.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBam;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;

public class CFBamDelSubDep1ByUNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredDelTopDepTenantId;
	protected long requiredDelTopDepId;
	protected String requiredName;
	public CFBamDelSubDep1ByUNameIdxKey() {
		requiredDelTopDepTenantId = CFBamDelSubDep1Buff.DELTOPDEPTENANTID_INIT_VALUE;
		requiredDelTopDepId = CFBamDelSubDep1Buff.DELTOPDEPID_INIT_VALUE;
		requiredName = new String( CFBamDelSubDep1Buff.NAME_INIT_VALUE );
	}

	public long getRequiredDelTopDepTenantId() {
		return( requiredDelTopDepTenantId );
	}

	public void setRequiredDelTopDepTenantId( long value ) {
		if( value < CFBamDelSubDep1Buff.DELTOPDEPTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelTopDepTenantId",
				1,
				"value",
				value,
				CFBamDelSubDep1Buff.DELTOPDEPTENANTID_MIN_VALUE );
		}
		requiredDelTopDepTenantId = value;
	}

	public long getRequiredDelTopDepId() {
		return( requiredDelTopDepId );
	}

	public void setRequiredDelTopDepId( long value ) {
		if( value < CFBamDelSubDep1Buff.DELTOPDEPID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelTopDepId",
				1,
				"value",
				value,
				CFBamDelSubDep1Buff.DELTOPDEPID_MIN_VALUE );
		}
		requiredDelTopDepId = value;
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 192 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamDelSubDep1ByUNameIdxKey ) {
			CFBamDelSubDep1ByUNameIdxKey rhs = (CFBamDelSubDep1ByUNameIdxKey)obj;
			if( getRequiredDelTopDepTenantId() != rhs.getRequiredDelTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredDelTopDepId() != rhs.getRequiredDelTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamDelSubDep1Buff ) {
			CFBamDelSubDep1Buff rhs = (CFBamDelSubDep1Buff)obj;
			if( getRequiredDelTopDepTenantId() != rhs.getRequiredDelTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredDelTopDepId() != rhs.getRequiredDelTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
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
		hashCode = hashCode + (int)( getRequiredDelTopDepTenantId() );
		hashCode = hashCode + (int)( getRequiredDelTopDepId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamDelSubDep1ByUNameIdxKey ) {
			CFBamDelSubDep1ByUNameIdxKey rhs = (CFBamDelSubDep1ByUNameIdxKey)obj;
			if( getRequiredDelTopDepTenantId() < rhs.getRequiredDelTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelTopDepTenantId() > rhs.getRequiredDelTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredDelTopDepId() < rhs.getRequiredDelTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredDelTopDepId() > rhs.getRequiredDelTopDepId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamDelSubDep1Buff ) {
			CFBamDelSubDep1Buff rhs = (CFBamDelSubDep1Buff)obj;
			if( getRequiredDelTopDepTenantId() < rhs.getRequiredDelTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelTopDepTenantId() > rhs.getRequiredDelTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredDelTopDepId() < rhs.getRequiredDelTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredDelTopDepId() > rhs.getRequiredDelTopDepId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFBamDelSubDep1ByUNameIdx"
			+ " RequiredDelTopDepTenantId=" + "\"" + Long.toString( getRequiredDelTopDepTenantId() ) + "\""
			+ " RequiredDelTopDepId=" + "\"" + Long.toString( getRequiredDelTopDepId() ) + "\""
			+ " RequiredName=" + "\"" + CFBamSchema.xmlEncodeString( getRequiredName() ) + "\""
			+ "/>";
		return( ret );
	}
}
