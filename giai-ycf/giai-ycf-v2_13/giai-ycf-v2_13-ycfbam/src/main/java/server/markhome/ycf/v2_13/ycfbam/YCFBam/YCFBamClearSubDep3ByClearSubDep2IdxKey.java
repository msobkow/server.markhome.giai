// Description: Java 11 implementation of a ClearSubDep3 by ClearSubDep2Idx index key object.

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

public class CFBamClearSubDep3ByClearSubDep2IdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClearSubDep2TenantId;
	protected long requiredClearSubDep2Id;
	public CFBamClearSubDep3ByClearSubDep2IdxKey() {
		requiredClearSubDep2TenantId = CFBamClearSubDep3Buff.CLEARSUBDEP2TENANTID_INIT_VALUE;
		requiredClearSubDep2Id = CFBamClearSubDep3Buff.CLEARSUBDEP2ID_INIT_VALUE;
	}

	public long getRequiredClearSubDep2TenantId() {
		return( requiredClearSubDep2TenantId );
	}

	public void setRequiredClearSubDep2TenantId( long value ) {
		if( value < CFBamClearSubDep3Buff.CLEARSUBDEP2TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearSubDep2TenantId",
				1,
				"value",
				value,
				CFBamClearSubDep3Buff.CLEARSUBDEP2TENANTID_MIN_VALUE );
		}
		requiredClearSubDep2TenantId = value;
	}

	public long getRequiredClearSubDep2Id() {
		return( requiredClearSubDep2Id );
	}

	public void setRequiredClearSubDep2Id( long value ) {
		if( value < CFBamClearSubDep3Buff.CLEARSUBDEP2ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearSubDep2Id",
				1,
				"value",
				value,
				CFBamClearSubDep3Buff.CLEARSUBDEP2ID_MIN_VALUE );
		}
		requiredClearSubDep2Id = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamClearSubDep3ByClearSubDep2IdxKey ) {
			CFBamClearSubDep3ByClearSubDep2IdxKey rhs = (CFBamClearSubDep3ByClearSubDep2IdxKey)obj;
			if( getRequiredClearSubDep2TenantId() != rhs.getRequiredClearSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep2Id() != rhs.getRequiredClearSubDep2Id() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamClearSubDep3Buff ) {
			CFBamClearSubDep3Buff rhs = (CFBamClearSubDep3Buff)obj;
			if( getRequiredClearSubDep2TenantId() != rhs.getRequiredClearSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep2Id() != rhs.getRequiredClearSubDep2Id() ) {
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
		hashCode = hashCode + (int)( getRequiredClearSubDep2TenantId() );
		hashCode = hashCode + (int)( getRequiredClearSubDep2Id() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamClearSubDep3ByClearSubDep2IdxKey ) {
			CFBamClearSubDep3ByClearSubDep2IdxKey rhs = (CFBamClearSubDep3ByClearSubDep2IdxKey)obj;
			if( getRequiredClearSubDep2TenantId() < rhs.getRequiredClearSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep2TenantId() > rhs.getRequiredClearSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredClearSubDep2Id() < rhs.getRequiredClearSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep2Id() > rhs.getRequiredClearSubDep2Id() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamClearSubDep3Buff ) {
			CFBamClearSubDep3Buff rhs = (CFBamClearSubDep3Buff)obj;
			if( getRequiredClearSubDep2TenantId() < rhs.getRequiredClearSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep2TenantId() > rhs.getRequiredClearSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredClearSubDep2Id() < rhs.getRequiredClearSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep2Id() > rhs.getRequiredClearSubDep2Id() ) {
				return( 1 );
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
		String ret = "<CFBamClearSubDep3ByClearSubDep2Idx"
			+ " RequiredClearSubDep2TenantId=" + "\"" + Long.toString( getRequiredClearSubDep2TenantId() ) + "\""
			+ " RequiredClearSubDep2Id=" + "\"" + Long.toString( getRequiredClearSubDep2Id() ) + "\""
			+ "/>";
		return( ret );
	}
}
