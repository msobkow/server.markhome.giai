// Description: Java 11 implementation of a SchemaRole history buffer object.

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

public class CFBamSchemaRoleHBuff
	extends CFBamRoleDefHBuff
	implements Comparable<Object>,
		Serializable
{
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long SCHEMADEFID_INIT_VALUE = 0L;
	public static final ICFBamSchema.RoleScopeEnum ROLESCOPE_INIT_VALUE = CFBamSchema.ordinalToRoleScopeEnum( 0 );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long SCHEMADEFID_MIN_VALUE = 0L;
	public static final ICFBamSchema.RoleScopeEnum ROLESCOPE_MIN_VALUE = ICFBamSchema.RoleScopeEnum.SysRole;
	public static final ICFBamSchema.RoleScopeEnum ROLESCOPE_MAX_VALUE = ICFBamSchema.RoleScopeEnum.TentRole;

	protected long requiredSchemaDefId;
	protected ICFBamSchema.RoleScopeEnum requiredRoleScope;
	public CFBamSchemaRoleHBuff() {
		super();
		requiredSchemaDefId = CFBamSchemaRoleBuff.SCHEMADEFID_INIT_VALUE;
		requiredRoleScope = CFBamSchemaRoleBuff.ROLESCOPE_INIT_VALUE;
	}

	public String getClassCode() {
		return( CFBamSchemaRoleBuff.CLASS_CODE );
	}

	public long getRequiredSchemaDefId() {
		return( requiredSchemaDefId );
	}

	public void setRequiredSchemaDefId( long value ) {
		if( value < CFBamSchemaRoleBuff.SCHEMADEFID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSchemaDefId",
				1,
				"value",
				value,
				CFBamSchemaRoleBuff.SCHEMADEFID_MIN_VALUE );
		}
		requiredSchemaDefId = value;
	}

	public ICFBamSchema.RoleScopeEnum getRequiredRoleScope() {
		return( requiredRoleScope );
	}

	public void setRequiredRoleScope( ICFBamSchema.RoleScopeEnum value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredRoleScope",
				1,
				"value" );
		}
		requiredRoleScope = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamSchemaRoleHBuff ) {
			CFBamSchemaRoleHBuff rhs = (CFBamSchemaRoleHBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredSchemaDefId() != rhs.getRequiredSchemaDefId() ) {
				return( false );
			}
			if( ! getRequiredRoleScope().equals( rhs.getRequiredRoleScope() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamSchemaRoleBuff ) {
			CFBamSchemaRoleBuff rhs = (CFBamSchemaRoleBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredSchemaDefId() != rhs.getRequiredSchemaDefId() ) {
				return( false );
			}
			if( ! getRequiredRoleScope().equals( rhs.getRequiredRoleScope() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamSchemaRoleBySchemaIdxKey ) {
			CFBamSchemaRoleBySchemaIdxKey rhs = (CFBamSchemaRoleBySchemaIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredSchemaDefId() != rhs.getRequiredSchemaDefId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamSchemaRoleByRoleScopeIdxKey ) {
			CFBamSchemaRoleByRoleScopeIdxKey rhs = (CFBamSchemaRoleByRoleScopeIdxKey)obj;
			if( ! getRequiredRoleScope().equals( rhs.getRequiredRoleScope() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamSchemaRoleBySchRoleScpIdxKey ) {
			CFBamSchemaRoleBySchRoleScpIdxKey rhs = (CFBamSchemaRoleBySchRoleScpIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredSchemaDefId() != rhs.getRequiredSchemaDefId() ) {
				return( false );
			}
			if( ! getRequiredRoleScope().equals( rhs.getRequiredRoleScope() ) ) {
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
		hashCode = hashCode + (int)( getRequiredSchemaDefId() );
		hashCode = ( hashCode * 0x10000 ) + getRequiredRoleScope().ordinal();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamSchemaRoleBuff ) {
			CFBamSchemaRoleBuff rhs = (CFBamSchemaRoleBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamSchemaRoleBySchemaIdxKey ) {
			CFBamSchemaRoleBySchemaIdxKey rhs = (CFBamSchemaRoleBySchemaIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredSchemaDefId() < rhs.getRequiredSchemaDefId() ) {
				return( -1 );
			}
			else if( getRequiredSchemaDefId() > rhs.getRequiredSchemaDefId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof CFBamSchemaRoleByRoleScopeIdxKey ) {
			CFBamSchemaRoleByRoleScopeIdxKey rhs = (CFBamSchemaRoleByRoleScopeIdxKey)obj;

			{
				int cmp = getRequiredRoleScope().compareTo( rhs.getRequiredRoleScope() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof CFBamSchemaRoleBySchRoleScpIdxKey ) {
			CFBamSchemaRoleBySchRoleScpIdxKey rhs = (CFBamSchemaRoleBySchRoleScpIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredSchemaDefId() < rhs.getRequiredSchemaDefId() ) {
				return( -1 );
			}
			else if( getRequiredSchemaDefId() > rhs.getRequiredSchemaDefId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredRoleScope().compareTo( rhs.getRequiredRoleScope() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof CFBamSchemaRoleHBuff ) {
			CFBamSchemaRoleHBuff rhs = (CFBamSchemaRoleHBuff)obj;

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
			if( getRequiredScopeId() < rhs.getRequiredScopeId() ) {
				return( -1 );
			}
			else if( getRequiredScopeId() > rhs.getRequiredScopeId() ) {
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
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredEnables().compareTo( rhs.getRequiredEnables() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredIncludes().compareTo( rhs.getRequiredIncludes() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getRequiredSchemaDefId() < rhs.getRequiredSchemaDefId() ) {
				return( -1 );
			}
			else if( getRequiredSchemaDefId() > rhs.getRequiredSchemaDefId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredRoleScope().compareTo( rhs.getRequiredRoleScope() );
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

	public void set( CFBamRoleDefBuff src ) {
		if( src instanceof CFBamSchemaRoleBuff ) {
			setSchemaRoleBuff( (CFBamSchemaRoleBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamSchemaRoleBuff" );
		}
	}

	public void setSchemaRoleBuff( CFBamSchemaRoleBuff src ) {
		super.setRoleDefBuff( src );
		setRequiredSchemaDefId( src.getRequiredSchemaDefId() );
		setRequiredRoleScope( src.getRequiredRoleScope() );
	}

	public void set( CFBamRoleDefHBuff src ) {
		if( src instanceof CFBamSchemaRoleHBuff ) {
			setSchemaRoleBuff( (CFBamSchemaRoleHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamSchemaRoleHBuff" );
		}
	}

	public void setSchemaRoleBuff( CFBamSchemaRoleHBuff src ) {
		super.setRoleDefBuff( src );
		setRequiredSchemaDefId( src.getRequiredSchemaDefId() );
		setRequiredRoleScope( src.getRequiredRoleScope() );
	}
}
