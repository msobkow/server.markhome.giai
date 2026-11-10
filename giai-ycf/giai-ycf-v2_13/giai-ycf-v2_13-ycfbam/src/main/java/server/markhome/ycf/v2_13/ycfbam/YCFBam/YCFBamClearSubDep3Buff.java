// Description: Java 11 implementation of a ClearSubDep3 buffer object.

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

public class YCFBamClearSubDep3Buff
	extends YCFBamClearDepBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a816";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long CLEARSUBDEP2TENANTID_INIT_VALUE = 0L;
	public static final long CLEARSUBDEP2ID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long CLEARSUBDEP2TENANTID_MIN_VALUE = 0L;
	public static final long CLEARSUBDEP2ID_MIN_VALUE = 0L;
	protected long requiredClearSubDep2TenantId;
	protected long requiredClearSubDep2Id;
	protected String requiredName;
	public YCFBamClearSubDep3Buff() {
		super();
		requiredClearSubDep2TenantId = YCFBamClearSubDep3Buff.CLEARSUBDEP2TENANTID_INIT_VALUE;
		requiredClearSubDep2Id = YCFBamClearSubDep3Buff.CLEARSUBDEP2ID_INIT_VALUE;
		requiredName = new String( YCFBamClearSubDep3Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredClearSubDep2TenantId() {
		return( requiredClearSubDep2TenantId );
	}

	public void setRequiredClearSubDep2TenantId( long value ) {
		if( value < YCFBamClearSubDep3Buff.CLEARSUBDEP2TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClearSubDep2TenantId",
				1,
				"value",
				value,
				YCFBamClearSubDep3Buff.CLEARSUBDEP2TENANTID_MIN_VALUE );
		}
		requiredClearSubDep2TenantId = value;
	}

	public long getRequiredClearSubDep2Id() {
		return( requiredClearSubDep2Id );
	}

	public void setRequiredClearSubDep2Id( long value ) {
		if( value < YCFBamClearSubDep3Buff.CLEARSUBDEP2ID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClearSubDep2Id",
				1,
				"value",
				value,
				YCFBamClearSubDep3Buff.CLEARSUBDEP2ID_MIN_VALUE );
		}
		requiredClearSubDep2Id = value;
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
		else if( obj instanceof YCFBamClearSubDep3Buff ) {
			YCFBamClearSubDep3Buff rhs = (YCFBamClearSubDep3Buff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredClearSubDep2TenantId() != rhs.getRequiredClearSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep2Id() != rhs.getRequiredClearSubDep2Id() ) {
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
		else if( obj instanceof YCFBamClearSubDep3HBuff ) {
			YCFBamClearSubDep3HBuff rhs = (YCFBamClearSubDep3HBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredClearSubDep2TenantId() != rhs.getRequiredClearSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep2Id() != rhs.getRequiredClearSubDep2Id() ) {
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
		else if( obj instanceof YCFBamClearSubDep3ByClearSubDep2IdxKey ) {
			YCFBamClearSubDep3ByClearSubDep2IdxKey rhs = (YCFBamClearSubDep3ByClearSubDep2IdxKey)obj;
			if( getRequiredClearSubDep2TenantId() != rhs.getRequiredClearSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep2Id() != rhs.getRequiredClearSubDep2Id() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamClearSubDep3ByUNameIdxKey ) {
			YCFBamClearSubDep3ByUNameIdxKey rhs = (YCFBamClearSubDep3ByUNameIdxKey)obj;
			if( getRequiredClearSubDep2TenantId() != rhs.getRequiredClearSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep2Id() != rhs.getRequiredClearSubDep2Id() ) {
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
		hashCode = hashCode + (int)( getRequiredClearSubDep2TenantId() );
		hashCode = hashCode + (int)( getRequiredClearSubDep2Id() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFBamClearSubDep3Buff ) {
			YCFBamClearSubDep3Buff rhs = (YCFBamClearSubDep3Buff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
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
		else if( obj instanceof YCFBamClearSubDep3HBuff ) {
			YCFBamClearSubDep3HBuff rhs = (YCFBamClearSubDep3HBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
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
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFBamClearSubDep3ByClearSubDep2IdxKey ) {
			YCFBamClearSubDep3ByClearSubDep2IdxKey rhs = (YCFBamClearSubDep3ByClearSubDep2IdxKey)obj;

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
			}			return( 0 );
		}
		else if( obj instanceof YCFBamClearSubDep3ByUNameIdxKey ) {
			YCFBamClearSubDep3ByUNameIdxKey rhs = (YCFBamClearSubDep3ByUNameIdxKey)obj;

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
		if( src instanceof YCFBamClearSubDep3Buff ) {
			setClearSubDep3Buff( (YCFBamClearSubDep3Buff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamClearSubDep3Buff" );
		}
	}

	public void setClearSubDep3Buff( YCFBamClearSubDep3Buff src ) {
		super.setClearDepBuff( src );
		setRequiredClearSubDep2TenantId( src.getRequiredClearSubDep2TenantId() );
		setRequiredClearSubDep2Id( src.getRequiredClearSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( YCFBamScopeHBuff src ) {
		if( src instanceof YCFBamClearSubDep3HBuff ) {
			setClearSubDep3Buff( (YCFBamClearSubDep3HBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamClearSubDep3HBuff" );
		}
	}

	public void setClearSubDep3Buff( YCFBamClearSubDep3HBuff src ) {
		super.setClearDepBuff( src );
		setRequiredClearSubDep2TenantId( src.getRequiredClearSubDep2TenantId() );
		setRequiredClearSubDep2Id( src.getRequiredClearSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}
}
