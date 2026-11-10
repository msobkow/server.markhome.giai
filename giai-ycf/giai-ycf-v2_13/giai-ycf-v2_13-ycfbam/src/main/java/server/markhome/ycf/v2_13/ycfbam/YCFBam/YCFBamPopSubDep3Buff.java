// Description: Java 11 implementation of a PopSubDep3 buffer object.

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

public class YCFBamPopSubDep3Buff
	extends YCFBamPopDepBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a836";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long POPSUBDEP2TENANTID_INIT_VALUE = 0L;
	public static final long POPSUBDEP2ID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long POPSUBDEP2TENANTID_MIN_VALUE = 0L;
	public static final long POPSUBDEP2ID_MIN_VALUE = 0L;
	protected long requiredPopSubDep2TenantId;
	protected long requiredPopSubDep2Id;
	protected String requiredName;
	public YCFBamPopSubDep3Buff() {
		super();
		requiredPopSubDep2TenantId = YCFBamPopSubDep3Buff.POPSUBDEP2TENANTID_INIT_VALUE;
		requiredPopSubDep2Id = YCFBamPopSubDep3Buff.POPSUBDEP2ID_INIT_VALUE;
		requiredName = new String( YCFBamPopSubDep3Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredPopSubDep2TenantId() {
		return( requiredPopSubDep2TenantId );
	}

	public void setRequiredPopSubDep2TenantId( long value ) {
		if( value < YCFBamPopSubDep3Buff.POPSUBDEP2TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredPopSubDep2TenantId",
				1,
				"value",
				value,
				YCFBamPopSubDep3Buff.POPSUBDEP2TENANTID_MIN_VALUE );
		}
		requiredPopSubDep2TenantId = value;
	}

	public long getRequiredPopSubDep2Id() {
		return( requiredPopSubDep2Id );
	}

	public void setRequiredPopSubDep2Id( long value ) {
		if( value < YCFBamPopSubDep3Buff.POPSUBDEP2ID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredPopSubDep2Id",
				1,
				"value",
				value,
				YCFBamPopSubDep3Buff.POPSUBDEP2ID_MIN_VALUE );
		}
		requiredPopSubDep2Id = value;
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
		else if( obj instanceof YCFBamPopSubDep3Buff ) {
			YCFBamPopSubDep3Buff rhs = (YCFBamPopSubDep3Buff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredPopSubDep2TenantId() != rhs.getRequiredPopSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep2Id() != rhs.getRequiredPopSubDep2Id() ) {
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
		else if( obj instanceof YCFBamPopSubDep3HBuff ) {
			YCFBamPopSubDep3HBuff rhs = (YCFBamPopSubDep3HBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredPopSubDep2TenantId() != rhs.getRequiredPopSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep2Id() != rhs.getRequiredPopSubDep2Id() ) {
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
		else if( obj instanceof YCFBamPopSubDep3ByPopSubDep2IdxKey ) {
			YCFBamPopSubDep3ByPopSubDep2IdxKey rhs = (YCFBamPopSubDep3ByPopSubDep2IdxKey)obj;
			if( getRequiredPopSubDep2TenantId() != rhs.getRequiredPopSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep2Id() != rhs.getRequiredPopSubDep2Id() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamPopSubDep3ByUNameIdxKey ) {
			YCFBamPopSubDep3ByUNameIdxKey rhs = (YCFBamPopSubDep3ByUNameIdxKey)obj;
			if( getRequiredPopSubDep2TenantId() != rhs.getRequiredPopSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep2Id() != rhs.getRequiredPopSubDep2Id() ) {
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
		hashCode = hashCode + (int)( getRequiredPopSubDep2TenantId() );
		hashCode = hashCode + (int)( getRequiredPopSubDep2Id() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFBamPopSubDep3Buff ) {
			YCFBamPopSubDep3Buff rhs = (YCFBamPopSubDep3Buff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredPopSubDep2TenantId() < rhs.getRequiredPopSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2TenantId() > rhs.getRequiredPopSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep2Id() < rhs.getRequiredPopSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2Id() > rhs.getRequiredPopSubDep2Id() ) {
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
		else if( obj instanceof YCFBamPopSubDep3HBuff ) {
			YCFBamPopSubDep3HBuff rhs = (YCFBamPopSubDep3HBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredPopSubDep2TenantId() < rhs.getRequiredPopSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2TenantId() > rhs.getRequiredPopSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep2Id() < rhs.getRequiredPopSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2Id() > rhs.getRequiredPopSubDep2Id() ) {
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
		else if( obj instanceof YCFBamPopSubDep3ByPopSubDep2IdxKey ) {
			YCFBamPopSubDep3ByPopSubDep2IdxKey rhs = (YCFBamPopSubDep3ByPopSubDep2IdxKey)obj;

			if( getRequiredPopSubDep2TenantId() < rhs.getRequiredPopSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2TenantId() > rhs.getRequiredPopSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep2Id() < rhs.getRequiredPopSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2Id() > rhs.getRequiredPopSubDep2Id() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFBamPopSubDep3ByUNameIdxKey ) {
			YCFBamPopSubDep3ByUNameIdxKey rhs = (YCFBamPopSubDep3ByUNameIdxKey)obj;

			if( getRequiredPopSubDep2TenantId() < rhs.getRequiredPopSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2TenantId() > rhs.getRequiredPopSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep2Id() < rhs.getRequiredPopSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2Id() > rhs.getRequiredPopSubDep2Id() ) {
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
		if( src instanceof YCFBamPopSubDep3Buff ) {
			setPopSubDep3Buff( (YCFBamPopSubDep3Buff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamPopSubDep3Buff" );
		}
	}

	public void setPopSubDep3Buff( YCFBamPopSubDep3Buff src ) {
		super.setPopDepBuff( src );
		setRequiredPopSubDep2TenantId( src.getRequiredPopSubDep2TenantId() );
		setRequiredPopSubDep2Id( src.getRequiredPopSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( YCFBamScopeHBuff src ) {
		if( src instanceof YCFBamPopSubDep3HBuff ) {
			setPopSubDep3Buff( (YCFBamPopSubDep3HBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamPopSubDep3HBuff" );
		}
	}

	public void setPopSubDep3Buff( YCFBamPopSubDep3HBuff src ) {
		super.setPopDepBuff( src );
		setRequiredPopSubDep2TenantId( src.getRequiredPopSubDep2TenantId() );
		setRequiredPopSubDep2Id( src.getRequiredPopSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}
}
