// Description: Java 11 implementation of a PopSubDep3 history buffer object.

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

public class CFBamPopSubDep3HBuff
	extends CFBamPopDepHBuff
	implements Comparable<Object>,
		Serializable
{
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
	public CFBamPopSubDep3HBuff() {
		super();
		requiredPopSubDep2TenantId = CFBamPopSubDep3Buff.POPSUBDEP2TENANTID_INIT_VALUE;
		requiredPopSubDep2Id = CFBamPopSubDep3Buff.POPSUBDEP2ID_INIT_VALUE;
		requiredName = new String( CFBamPopSubDep3Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CFBamPopSubDep3Buff.CLASS_CODE );
	}

	public long getRequiredPopSubDep2TenantId() {
		return( requiredPopSubDep2TenantId );
	}

	public void setRequiredPopSubDep2TenantId( long value ) {
		if( value < CFBamPopSubDep3Buff.POPSUBDEP2TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredPopSubDep2TenantId",
				1,
				"value",
				value,
				CFBamPopSubDep3Buff.POPSUBDEP2TENANTID_MIN_VALUE );
		}
		requiredPopSubDep2TenantId = value;
	}

	public long getRequiredPopSubDep2Id() {
		return( requiredPopSubDep2Id );
	}

	public void setRequiredPopSubDep2Id( long value ) {
		if( value < CFBamPopSubDep3Buff.POPSUBDEP2ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredPopSubDep2Id",
				1,
				"value",
				value,
				CFBamPopSubDep3Buff.POPSUBDEP2ID_MIN_VALUE );
		}
		requiredPopSubDep2Id = value;
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
		else if( obj instanceof CFBamPopSubDep3HBuff ) {
			CFBamPopSubDep3HBuff rhs = (CFBamPopSubDep3HBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
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
		else if( obj instanceof CFBamPopSubDep3Buff ) {
			CFBamPopSubDep3Buff rhs = (CFBamPopSubDep3Buff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
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
		else if( obj instanceof CFBamPopSubDep3ByPopSubDep2IdxKey ) {
			CFBamPopSubDep3ByPopSubDep2IdxKey rhs = (CFBamPopSubDep3ByPopSubDep2IdxKey)obj;
			if( getRequiredPopSubDep2TenantId() != rhs.getRequiredPopSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep2Id() != rhs.getRequiredPopSubDep2Id() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopSubDep3ByUNameIdxKey ) {
			CFBamPopSubDep3ByUNameIdxKey rhs = (CFBamPopSubDep3ByUNameIdxKey)obj;
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
			return( super.equals( obj ) );
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
		else if( obj instanceof CFBamPopSubDep3Buff ) {
			CFBamPopSubDep3Buff rhs = (CFBamPopSubDep3Buff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamPopSubDep3ByPopSubDep2IdxKey ) {
			CFBamPopSubDep3ByPopSubDep2IdxKey rhs = (CFBamPopSubDep3ByPopSubDep2IdxKey)obj;

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
		else if( obj instanceof CFBamPopSubDep3ByUNameIdxKey ) {
			CFBamPopSubDep3ByUNameIdxKey rhs = (CFBamPopSubDep3ByUNameIdxKey)obj;

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
		else if( obj instanceof CFBamPopSubDep3HBuff ) {
			CFBamPopSubDep3HBuff rhs = (CFBamPopSubDep3HBuff)obj;

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
			if( getRequiredRelationTenantId() < rhs.getRequiredRelationTenantId() ) {
				return( -1 );
			}
			else if( getRequiredRelationTenantId() > rhs.getRequiredRelationTenantId() ) {
				return( 1 );
			}
			if( getRequiredRelationId() < rhs.getRequiredRelationId() ) {
				return( -1 );
			}
			else if( getRequiredRelationId() > rhs.getRequiredRelationId() ) {
				return( 1 );
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
		else {
			return( super.compareTo( obj ) );
		}
	}

	public void set( CFBamScopeBuff src ) {
		if( src instanceof CFBamPopSubDep3Buff ) {
			setPopSubDep3Buff( (CFBamPopSubDep3Buff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopSubDep3Buff" );
		}
	}

	public void setPopSubDep3Buff( CFBamPopSubDep3Buff src ) {
		super.setPopDepBuff( src );
		setRequiredPopSubDep2TenantId( src.getRequiredPopSubDep2TenantId() );
		setRequiredPopSubDep2Id( src.getRequiredPopSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( CFBamScopeHBuff src ) {
		if( src instanceof CFBamPopSubDep3HBuff ) {
			setPopSubDep3Buff( (CFBamPopSubDep3HBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopSubDep3HBuff" );
		}
	}

	public void setPopSubDep3Buff( CFBamPopSubDep3HBuff src ) {
		super.setPopDepBuff( src );
		setRequiredPopSubDep2TenantId( src.getRequiredPopSubDep2TenantId() );
		setRequiredPopSubDep2Id( src.getRequiredPopSubDep2Id() );
		setRequiredName( src.getRequiredName() );
	}
}
