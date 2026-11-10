// Description: Java 11 implementation of a ClearSubDep1 history buffer object.

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

public class YCFBamClearSubDep1HBuff
	extends YCFBamClearDepHBuff
	implements Comparable<Object>,
		Serializable
{
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long CLEARTOPDEPTENANTID_INIT_VALUE = 0L;
	public static final long CLEARTOPDEPID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long CLEARTOPDEPTENANTID_MIN_VALUE = 0L;
	public static final long CLEARTOPDEPID_MIN_VALUE = 0L;

	protected long requiredClearTopDepTenantId;
	protected long requiredClearTopDepId;
	protected String requiredName;
	public YCFBamClearSubDep1HBuff() {
		super();
		requiredClearTopDepTenantId = YCFBamClearSubDep1Buff.CLEARTOPDEPTENANTID_INIT_VALUE;
		requiredClearTopDepId = YCFBamClearSubDep1Buff.CLEARTOPDEPID_INIT_VALUE;
		requiredName = new String( YCFBamClearSubDep1Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( YCFBamClearSubDep1Buff.CLASS_CODE );
	}

	public long getRequiredClearTopDepTenantId() {
		return( requiredClearTopDepTenantId );
	}

	public void setRequiredClearTopDepTenantId( long value ) {
		if( value < YCFBamClearSubDep1Buff.CLEARTOPDEPTENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClearTopDepTenantId",
				1,
				"value",
				value,
				YCFBamClearSubDep1Buff.CLEARTOPDEPTENANTID_MIN_VALUE );
		}
		requiredClearTopDepTenantId = value;
	}

	public long getRequiredClearTopDepId() {
		return( requiredClearTopDepId );
	}

	public void setRequiredClearTopDepId( long value ) {
		if( value < YCFBamClearSubDep1Buff.CLEARTOPDEPID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClearTopDepId",
				1,
				"value",
				value,
				YCFBamClearSubDep1Buff.CLEARTOPDEPID_MIN_VALUE );
		}
		requiredClearTopDepId = value;
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
		else if( obj instanceof YCFBamClearSubDep1HBuff ) {
			YCFBamClearSubDep1HBuff rhs = (YCFBamClearSubDep1HBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamClearSubDep1Buff ) {
			YCFBamClearSubDep1Buff rhs = (YCFBamClearSubDep1Buff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamClearSubDep1ByClearTopDepIdxKey ) {
			YCFBamClearSubDep1ByClearTopDepIdxKey rhs = (YCFBamClearSubDep1ByClearTopDepIdxKey)obj;
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamClearSubDep1ByUNameIdxKey ) {
			YCFBamClearSubDep1ByUNameIdxKey rhs = (YCFBamClearSubDep1ByUNameIdxKey)obj;
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else {
			return( super.equals( obj ) );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + (int)( getRequiredClearTopDepTenantId() );
		hashCode = hashCode + (int)( getRequiredClearTopDepId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFBamClearSubDep1Buff ) {
			YCFBamClearSubDep1Buff rhs = (YCFBamClearSubDep1Buff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof YCFBamClearSubDep1ByClearTopDepIdxKey ) {
			YCFBamClearSubDep1ByClearTopDepIdxKey rhs = (YCFBamClearSubDep1ByClearTopDepIdxKey)obj;

			if( getRequiredClearTopDepTenantId() < rhs.getRequiredClearTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepTenantId() > rhs.getRequiredClearTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredClearTopDepId() < rhs.getRequiredClearTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepId() > rhs.getRequiredClearTopDepId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFBamClearSubDep1ByUNameIdxKey ) {
			YCFBamClearSubDep1ByUNameIdxKey rhs = (YCFBamClearSubDep1ByUNameIdxKey)obj;

			if( getRequiredClearTopDepTenantId() < rhs.getRequiredClearTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepTenantId() > rhs.getRequiredClearTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredClearTopDepId() < rhs.getRequiredClearTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepId() > rhs.getRequiredClearTopDepId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFBamClearSubDep1HBuff ) {
			YCFBamClearSubDep1HBuff rhs = (YCFBamClearSubDep1HBuff)obj;

			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			{
				long lhsAuditClusterId = getAuditClusterId();
				long rhsAuditClusterId = rhs.getAuditClusterId();
				if( lhsAuditClusterId < rhsAuditClusterId ) {
					return( -1 );
				}
				else if( lhsAuditClusterId > rhsAuditClusterId ) {
					return( 1 );
				}
			}
			{
				Calendar lhsAuditStamp = getAuditStamp();
				Calendar rhsAuditStamp = rhs.getAuditStamp();
				if( lhsAuditStamp == null ) {
					if( rhsAuditStamp != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditStamp == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditStamp.compareTo( rhsAuditStamp );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
				}
			}
			{
				short lhsAuditActionId = getAuditActionId();
				short rhsAuditActionId = rhs.getAuditActionId();
				if( lhsAuditActionId < rhsAuditActionId ) {
					return( -1 );
				}
				else if( lhsAuditActionId > rhsAuditActionId ) {
					return( 1 );
				}
			}
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
			{
				UUID lhsAuditSessionId = getAuditSessionId();
				UUID rhsAuditSessionId = rhs.getAuditSessionId();
				if( lhsAuditSessionId == null ) {
					if( rhsAuditSessionId != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditSessionId == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditSessionId.compareTo( rhsAuditSessionId );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
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
			if( getRequiredRelationId() < rhs.getRequiredRelationId() ) {
				return( -1 );
			}
			else if( getRequiredRelationId() > rhs.getRequiredRelationId() ) {
				return( 1 );
			}
			if( getOptionalDefSchemaTenantId() != null ) {
				Long lhsDefSchemaTenantId = getOptionalDefSchemaTenantId();
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					Long rhsDefSchemaTenantId = rhs.getOptionalDefSchemaTenantId();
					int cmp = lhsDefSchemaTenantId.compareTo( rhsDefSchemaTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				Long lhsDefSchemaId = getOptionalDefSchemaId();
				if( rhs.getOptionalDefSchemaId() != null ) {
					Long rhsDefSchemaId = rhs.getOptionalDefSchemaId();
					int cmp = lhsDefSchemaId.compareTo( rhsDefSchemaId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredClearTopDepTenantId() < rhs.getRequiredClearTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepTenantId() > rhs.getRequiredClearTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredClearTopDepId() < rhs.getRequiredClearTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepId() > rhs.getRequiredClearTopDepId() ) {
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
			return( super.compareTo( obj ) );
		}
	}

	public void set( YCFBamScopeBuff src ) {
		if( src instanceof YCFBamClearSubDep1Buff ) {
			setClearSubDep1Buff( (YCFBamClearSubDep1Buff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamClearSubDep1Buff" );
		}
	}

	public void setClearSubDep1Buff( YCFBamClearSubDep1Buff src ) {
		super.setClearDepBuff( src );
		setRequiredClearTopDepTenantId( src.getRequiredClearTopDepTenantId() );
		setRequiredClearTopDepId( src.getRequiredClearTopDepId() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( YCFBamScopeHBuff src ) {
		if( src instanceof YCFBamClearSubDep1HBuff ) {
			setClearSubDep1Buff( (YCFBamClearSubDep1HBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamClearSubDep1HBuff" );
		}
	}

	public void setClearSubDep1Buff( YCFBamClearSubDep1HBuff src ) {
		super.setClearDepBuff( src );
		setRequiredClearTopDepTenantId( src.getRequiredClearTopDepTenantId() );
		setRequiredClearTopDepId( src.getRequiredClearTopDepId() );
		setRequiredName( src.getRequiredName() );
	}
}
