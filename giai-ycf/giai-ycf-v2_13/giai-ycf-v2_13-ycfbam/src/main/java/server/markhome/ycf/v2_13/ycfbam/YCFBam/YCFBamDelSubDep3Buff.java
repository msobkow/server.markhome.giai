// Description: Java 11 implementation of a DelSubDep3 buffer object.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
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
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

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
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFBamDelSubDep3Buff
	extends YCFBamDelDepBuff
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
	public YCFBamDelSubDep3Buff() {
		super();
		requiredDelSubDep2TenantId = YCFBamDelSubDep3Buff.DELSUBDEP2TENANTID_INIT_VALUE;
		requiredDelSubDep2Id = YCFBamDelSubDep3Buff.DELSUBDEP2ID_INIT_VALUE;
		requiredName = new String( YCFBamDelSubDep3Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredDelSubDep2TenantId() {
		return( requiredDelSubDep2TenantId );
	}

	public void setRequiredDelSubDep2TenantId( long value ) {
		if( value < YCFBamDelSubDep3Buff.DELSUBDEP2TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredDelSubDep2TenantId",
				1,
				"value",
				value,
				YCFBamDelSubDep3Buff.DELSUBDEP2TENANTID_MIN_VALUE );
		}
		requiredDelSubDep2TenantId = value;
	}

	public long getRequiredDelSubDep2Id() {
		return( requiredDelSubDep2Id );
	}

	public void setRequiredDelSubDep2Id( long value ) {
		if( value < YCFBamDelSubDep3Buff.DELSUBDEP2ID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredDelSubDep2Id",
				1,
				"value",
				value,
				YCFBamDelSubDep3Buff.DELSUBDEP2ID_MIN_VALUE );
		}
		requiredDelSubDep2Id = value;
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 192 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
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
		else if( obj instanceof YCFBamDelSubDep3Buff ) {
			YCFBamDelSubDep3Buff rhs = (YCFBamDelSubDep3Buff)obj;
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
		else if( obj instanceof YCFBamScopePKey ) {
			YCFBamScopePKey rhs = (YCFBamScopePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamDelSubDep3HBuff ) {
			YCFBamDelSubDep3HBuff rhs = (YCFBamDelSubDep3HBuff)obj;
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
		else if( obj instanceof YCFBamScopeHPKey ) {
			YCFBamScopeHPKey rhs = (YCFBamScopeHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamDelSubDep3ByDelSubDep2IdxKey ) {
			YCFBamDelSubDep3ByDelSubDep2IdxKey rhs = (YCFBamDelSubDep3ByDelSubDep2IdxKey)obj;
			if( getRequiredDelSubDep2TenantId() != rhs.getRequiredDelSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredDelSubDep2Id() != rhs.getRequiredDelSubDep2Id() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamDelSubDep3ByUNameIdxKey ) {
			YCFBamDelSubDep3ByUNameIdxKey rhs = (YCFBamDelSubDep3ByUNameIdxKey)obj;
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
		else if( obj instanceof YCFBamDelSubDep3Buff ) {
			YCFBamDelSubDep3Buff rhs = (YCFBamDelSubDep3Buff)obj;
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
		else if( obj instanceof YCFBamScopePKey ) {
			YCFBamScopePKey rhs = (YCFBamScopePKey)obj;
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
		else if( obj instanceof YCFBamScopeHPKey ) {
			YCFBamScopeHPKey rhs = (YCFBamScopeHPKey)obj;
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
		else if( obj instanceof YCFBamDelSubDep3HBuff ) {
			YCFBamDelSubDep3HBuff rhs = (YCFBamDelSubDep3HBuff)obj;
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
		else if( obj instanceof YCFBamDelSubDep3ByDelSubDep2IdxKey ) {
			YCFBamDelSubDep3ByDelSubDep2IdxKey rhs = (YCFBamDelSubDep3ByDelSubDep2IdxKey)obj;

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
		else if( obj instanceof YCFBamDelSubDep3ByUNameIdxKey ) {
			YCFBamDelSubDep3ByUNameIdxKey rhs = (YCFBamDelSubDep3ByUNameIdxKey)obj;

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

	public void set( YCFBamScopeBuff src ) {
		if( src instanceof YCFBamDelSubDep3Buff ) {
			setDelSubDep3Buff( (YCFBamDelSubDep3Buff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamDelSubDep3Buff" );
		}
	}

	public void setDelSubDep3Buff( YCFBamDelSubDep3Buff src ) {
		super.setDelDepBuff( src );
		setRequiredDelSubDep2TenantId( src.getRequiredDelSubDep2TenantId() );
		setRequiredDelSubDep2Id( src.getRequiredDelSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( YCFBamScopeHBuff src ) {
		if( src instanceof YCFBamDelSubDep3HBuff ) {
			setDelSubDep3Buff( (YCFBamDelSubDep3HBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamDelSubDep3HBuff" );
		}
	}

	public void setDelSubDep3Buff( YCFBamDelSubDep3HBuff src ) {
		super.setDelDepBuff( src );
		setRequiredDelSubDep2TenantId( src.getRequiredDelSubDep2TenantId() );
		setRequiredDelSubDep2Id( src.getRequiredDelSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}
}
