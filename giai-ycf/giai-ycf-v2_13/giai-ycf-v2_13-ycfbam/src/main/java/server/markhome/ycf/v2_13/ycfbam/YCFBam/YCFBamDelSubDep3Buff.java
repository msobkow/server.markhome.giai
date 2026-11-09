// Description: Java 11 implementation of a DelSubDep3 buffer object.

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

public class CFBamDelSubDep3Buff
	extends CFBamDelDepBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a81d";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long DELSUBDEP2TENANTID_INIT_VALUE = 0L;
	public static final long DELSUBDEP2ID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long DELSUBDEP2TENANTID_MIN_VALUE = 0L;
	public static final long DELSUBDEP2ID_MIN_VALUE = 0L;
	protected long requiredDelSubDep2TenantId;
	protected long requiredDelSubDep2Id;
	protected String requiredName;
	public CFBamDelSubDep3Buff() {
		super();
		requiredDelSubDep2TenantId = CFBamDelSubDep3Buff.DELSUBDEP2TENANTID_INIT_VALUE;
		requiredDelSubDep2Id = CFBamDelSubDep3Buff.DELSUBDEP2ID_INIT_VALUE;
		requiredName = new String( CFBamDelSubDep3Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredDelSubDep2TenantId() {
		return( requiredDelSubDep2TenantId );
	}

	public void setRequiredDelSubDep2TenantId( long value ) {
		if( value < CFBamDelSubDep3Buff.DELSUBDEP2TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelSubDep2TenantId",
				1,
				"value",
				value,
				CFBamDelSubDep3Buff.DELSUBDEP2TENANTID_MIN_VALUE );
		}
		requiredDelSubDep2TenantId = value;
	}

	public long getRequiredDelSubDep2Id() {
		return( requiredDelSubDep2Id );
	}

	public void setRequiredDelSubDep2Id( long value ) {
		if( value < CFBamDelSubDep3Buff.DELSUBDEP2ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelSubDep2Id",
				1,
				"value",
				value,
				CFBamDelSubDep3Buff.DELSUBDEP2ID_MIN_VALUE );
		}
		requiredDelSubDep2Id = value;
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
		else if( obj instanceof CFBamDelSubDep3Buff ) {
			CFBamDelSubDep3Buff rhs = (CFBamDelSubDep3Buff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredDelSubDep2TenantId() != rhs.getRequiredDelSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredDelSubDep2Id() != rhs.getRequiredDelSubDep2Id() ) {
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
		else if( obj instanceof CFBamDelSubDep3HBuff ) {
			CFBamDelSubDep3HBuff rhs = (CFBamDelSubDep3HBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredDelSubDep2TenantId() != rhs.getRequiredDelSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredDelSubDep2Id() != rhs.getRequiredDelSubDep2Id() ) {
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
		else if( obj instanceof CFBamDelSubDep3ByDelSubDep2IdxKey ) {
			CFBamDelSubDep3ByDelSubDep2IdxKey rhs = (CFBamDelSubDep3ByDelSubDep2IdxKey)obj;
			if( getRequiredDelSubDep2TenantId() != rhs.getRequiredDelSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredDelSubDep2Id() != rhs.getRequiredDelSubDep2Id() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamDelSubDep3ByUNameIdxKey ) {
			CFBamDelSubDep3ByUNameIdxKey rhs = (CFBamDelSubDep3ByUNameIdxKey)obj;
			if( getRequiredDelSubDep2TenantId() != rhs.getRequiredDelSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredDelSubDep2Id() != rhs.getRequiredDelSubDep2Id() ) {
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
		hashCode = hashCode + (int)( getRequiredDelSubDep2TenantId() );
		hashCode = hashCode + (int)( getRequiredDelSubDep2Id() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamDelSubDep3Buff ) {
			CFBamDelSubDep3Buff rhs = (CFBamDelSubDep3Buff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredDelSubDep2TenantId() < rhs.getRequiredDelSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2TenantId() > rhs.getRequiredDelSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredDelSubDep2Id() < rhs.getRequiredDelSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2Id() > rhs.getRequiredDelSubDep2Id() ) {
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
		else if( obj instanceof CFBamDelSubDep3HBuff ) {
			CFBamDelSubDep3HBuff rhs = (CFBamDelSubDep3HBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredDelSubDep2TenantId() < rhs.getRequiredDelSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2TenantId() > rhs.getRequiredDelSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredDelSubDep2Id() < rhs.getRequiredDelSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2Id() > rhs.getRequiredDelSubDep2Id() ) {
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
		else if( obj instanceof CFBamDelSubDep3ByDelSubDep2IdxKey ) {
			CFBamDelSubDep3ByDelSubDep2IdxKey rhs = (CFBamDelSubDep3ByDelSubDep2IdxKey)obj;

			if( getRequiredDelSubDep2TenantId() < rhs.getRequiredDelSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2TenantId() > rhs.getRequiredDelSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredDelSubDep2Id() < rhs.getRequiredDelSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2Id() > rhs.getRequiredDelSubDep2Id() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof CFBamDelSubDep3ByUNameIdxKey ) {
			CFBamDelSubDep3ByUNameIdxKey rhs = (CFBamDelSubDep3ByUNameIdxKey)obj;

			if( getRequiredDelSubDep2TenantId() < rhs.getRequiredDelSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2TenantId() > rhs.getRequiredDelSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredDelSubDep2Id() < rhs.getRequiredDelSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2Id() > rhs.getRequiredDelSubDep2Id() ) {
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
		if( src instanceof CFBamDelSubDep3Buff ) {
			setDelSubDep3Buff( (CFBamDelSubDep3Buff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamDelSubDep3Buff" );
		}
	}

	public void setDelSubDep3Buff( CFBamDelSubDep3Buff src ) {
		super.setDelDepBuff( src );
		setRequiredDelSubDep2TenantId( src.getRequiredDelSubDep2TenantId() );
		setRequiredDelSubDep2Id( src.getRequiredDelSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( CFBamScopeHBuff src ) {
		if( src instanceof CFBamDelSubDep3HBuff ) {
			setDelSubDep3Buff( (CFBamDelSubDep3HBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamDelSubDep3HBuff" );
		}
	}

	public void setDelSubDep3Buff( CFBamDelSubDep3HBuff src ) {
		super.setDelDepBuff( src );
		setRequiredDelSubDep2TenantId( src.getRequiredDelSubDep2TenantId() );
		setRequiredDelSubDep2Id( src.getRequiredDelSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}
}
