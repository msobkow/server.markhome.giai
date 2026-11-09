// Description: Java 11 implementation of a PopSubDep1 buffer object.

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

public class CFBamPopSubDep1Buff
	extends CFBamPopDepBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a834";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long POPTOPDEPTENANTID_INIT_VALUE = 0L;
	public static final long POPTOPDEPID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long POPTOPDEPTENANTID_MIN_VALUE = 0L;
	public static final long POPTOPDEPID_MIN_VALUE = 0L;
	protected long requiredPopTopDepTenantId;
	protected long requiredPopTopDepId;
	protected String requiredName;
	public CFBamPopSubDep1Buff() {
		super();
		requiredPopTopDepTenantId = CFBamPopSubDep1Buff.POPTOPDEPTENANTID_INIT_VALUE;
		requiredPopTopDepId = CFBamPopSubDep1Buff.POPTOPDEPID_INIT_VALUE;
		requiredName = new String( CFBamPopSubDep1Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredPopTopDepTenantId() {
		return( requiredPopTopDepTenantId );
	}

	public void setRequiredPopTopDepTenantId( long value ) {
		if( value < CFBamPopSubDep1Buff.POPTOPDEPTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredPopTopDepTenantId",
				1,
				"value",
				value,
				CFBamPopSubDep1Buff.POPTOPDEPTENANTID_MIN_VALUE );
		}
		requiredPopTopDepTenantId = value;
	}

	public long getRequiredPopTopDepId() {
		return( requiredPopTopDepId );
	}

	public void setRequiredPopTopDepId( long value ) {
		if( value < CFBamPopSubDep1Buff.POPTOPDEPID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredPopTopDepId",
				1,
				"value",
				value,
				CFBamPopSubDep1Buff.POPTOPDEPID_MIN_VALUE );
		}
		requiredPopTopDepId = value;
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
		else if( obj instanceof CFBamPopSubDep1Buff ) {
			CFBamPopSubDep1Buff rhs = (CFBamPopSubDep1Buff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredPopTopDepTenantId() != rhs.getRequiredPopTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredPopTopDepId() != rhs.getRequiredPopTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamScopePKey ) {
			CFBamScopePKey rhs = (CFBamScopePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopSubDep1HBuff ) {
			CFBamPopSubDep1HBuff rhs = (CFBamPopSubDep1HBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredPopTopDepTenantId() != rhs.getRequiredPopTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredPopTopDepId() != rhs.getRequiredPopTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamScopeHPKey ) {
			CFBamScopeHPKey rhs = (CFBamScopeHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopSubDep1ByPopTopDepIdxKey ) {
			CFBamPopSubDep1ByPopTopDepIdxKey rhs = (CFBamPopSubDep1ByPopTopDepIdxKey)obj;
			if( getRequiredPopTopDepTenantId() != rhs.getRequiredPopTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredPopTopDepId() != rhs.getRequiredPopTopDepId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopSubDep1ByUNameIdxKey ) {
			CFBamPopSubDep1ByUNameIdxKey rhs = (CFBamPopSubDep1ByUNameIdxKey)obj;
			if( getRequiredPopTopDepTenantId() != rhs.getRequiredPopTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredPopTopDepId() != rhs.getRequiredPopTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
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
		int hashCode = super.hashCode();
		hashCode = hashCode + (int)( getRequiredPopTopDepTenantId() );
		hashCode = hashCode + (int)( getRequiredPopTopDepId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamPopSubDep1Buff ) {
			CFBamPopSubDep1Buff rhs = (CFBamPopSubDep1Buff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredPopTopDepTenantId() < rhs.getRequiredPopTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopTopDepTenantId() > rhs.getRequiredPopTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredPopTopDepId() < rhs.getRequiredPopTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredPopTopDepId() > rhs.getRequiredPopTopDepId() ) {
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
		else if( obj instanceof CFBamScopePKey ) {
			CFBamScopePKey rhs = (CFBamScopePKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamScopeHPKey ) {
			CFBamScopeHPKey rhs = (CFBamScopeHPKey)obj;
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
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamPopSubDep1HBuff ) {
			CFBamPopSubDep1HBuff rhs = (CFBamPopSubDep1HBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredPopTopDepTenantId() < rhs.getRequiredPopTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopTopDepTenantId() > rhs.getRequiredPopTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredPopTopDepId() < rhs.getRequiredPopTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredPopTopDepId() > rhs.getRequiredPopTopDepId() ) {
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
		else if( obj instanceof CFBamPopSubDep1ByPopTopDepIdxKey ) {
			CFBamPopSubDep1ByPopTopDepIdxKey rhs = (CFBamPopSubDep1ByPopTopDepIdxKey)obj;

			if( getRequiredPopTopDepTenantId() < rhs.getRequiredPopTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopTopDepTenantId() > rhs.getRequiredPopTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredPopTopDepId() < rhs.getRequiredPopTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredPopTopDepId() > rhs.getRequiredPopTopDepId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof CFBamPopSubDep1ByUNameIdxKey ) {
			CFBamPopSubDep1ByUNameIdxKey rhs = (CFBamPopSubDep1ByUNameIdxKey)obj;

			if( getRequiredPopTopDepTenantId() < rhs.getRequiredPopTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopTopDepTenantId() > rhs.getRequiredPopTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredPopTopDepId() < rhs.getRequiredPopTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredPopTopDepId() > rhs.getRequiredPopTopDepId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFBamScopeBuff src ) {
		if( src instanceof CFBamPopSubDep1Buff ) {
			setPopSubDep1Buff( (CFBamPopSubDep1Buff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopSubDep1Buff" );
		}
	}

	public void setPopSubDep1Buff( CFBamPopSubDep1Buff src ) {
		super.setPopDepBuff( src );
		setRequiredPopTopDepTenantId( src.getRequiredPopTopDepTenantId() );
		setRequiredPopTopDepId( src.getRequiredPopTopDepId() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( CFBamScopeHBuff src ) {
		if( src instanceof CFBamPopSubDep1HBuff ) {
			setPopSubDep1Buff( (CFBamPopSubDep1HBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopSubDep1HBuff" );
		}
	}

	public void setPopSubDep1Buff( CFBamPopSubDep1HBuff src ) {
		super.setPopDepBuff( src );
		setRequiredPopTopDepTenantId( src.getRequiredPopTopDepTenantId() );
		setRequiredPopTopDepId( src.getRequiredPopTopDepId() );
		setRequiredName( src.getRequiredName() );
	}
}
