// Description: Java 11 implementation of a RoleDef buffer object.

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

public class YCFBamRoleDefBuff
{
	public final static String CLASS_CODE = "a88d";
	public final static String S_INIT_CREATEDBY = "654dbba0-eda7-11e1-aff1-0800200c9a66";
	public final static UUID INIT_CREATEDBY = UUID.fromString( S_INIT_CREATEDBY );
	public final static String S_INIT_UPDATEDBY = "654dbba0-eda7-11e1-aff1-0800200c9a66";
	public final static UUID INIT_UPDATEDBY = UUID.fromString( S_INIT_UPDATEDBY );
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long SCOPEID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long DEFSCHEMATENANTID_INIT_VALUE = 0L;
	public static final long DEFSCHEMAID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final String ENABLES_INIT_VALUE = new String( "" );
	public static final String INCLUDES_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long SCOPEID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long DEFSCHEMATENANTID_MIN_VALUE = 0L;
	public static final long DEFSCHEMAID_MIN_VALUE = 0L;
	protected UUID createdByUserId = YCFBamRoleDefBuff.INIT_CREATEDBY;
	protected Calendar createdAt = Calendar.getInstance();
	protected UUID updatedByUserId = YCFBamRoleDefBuff.INIT_UPDATEDBY;
	protected Calendar updatedAt = Calendar.getInstance();
	protected long requiredTenantId;
	protected long requiredScopeId;
	protected long requiredId;
	protected Long optionalDefSchemaTenantId;
	protected Long optionalDefSchemaId;
	protected String requiredName;
	protected String requiredEnables;
	protected String requiredIncludes;
	protected int requiredRevision;
	public YCFBamRoleDefBuff() {
		requiredTenantId = YCFBamRoleDefBuff.TENANTID_INIT_VALUE;
		requiredScopeId = YCFBamRoleDefBuff.SCOPEID_INIT_VALUE;
		requiredId = YCFBamRoleDefBuff.ID_INIT_VALUE;
		optionalDefSchemaTenantId = null;
		optionalDefSchemaId = null;
		requiredName = new String( YCFBamRoleDefBuff.NAME_INIT_VALUE );
		requiredEnables = new String( YCFBamRoleDefBuff.ENABLES_INIT_VALUE );
		requiredIncludes = new String( YCFBamRoleDefBuff.INCLUDES_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public UUID getCreatedByUserId() {
		return( createdByUserId );
	}

	public void setCreatedByUserId( UUID value ) {
		createdByUserId = value;
	}

	public Calendar getCreatedAt() {
		return( createdAt );
	}

	public void setCreatedAt( Calendar value ) {
		createdAt = value;
	}

	public UUID getUpdatedByUserId() {
		return( updatedByUserId );
	}

	public void setUpdatedByUserId( UUID value ) {
		updatedByUserId = value;
	}

	public Calendar getUpdatedAt() {
		return( updatedAt );
	}

	public void setUpdatedAt( Calendar value ) {
		updatedAt = value;
	}
	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFBamRoleDefBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFBamRoleDefBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredScopeId() {
		return( requiredScopeId );
	}

	public void setRequiredScopeId( long value ) {
		if( value < YCFBamRoleDefBuff.SCOPEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredScopeId",
				1,
				"value",
				value,
				YCFBamRoleDefBuff.SCOPEID_MIN_VALUE );
		}
		requiredScopeId = value;
	}

	public long getRequiredId() {
		return( requiredId );
	}

	public void setRequiredId( long value ) {
		if( value < YCFBamRoleDefBuff.ID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredId",
				1,
				"value",
				value,
				YCFBamRoleDefBuff.ID_MIN_VALUE );
		}
		requiredId = value;
	}

	public Long getOptionalDefSchemaTenantId() {
		return( optionalDefSchemaTenantId );
	}

	public void setOptionalDefSchemaTenantId( Long value ) {
		if( value == null ) {
			optionalDefSchemaTenantId = null;
		}
		else if( value < YCFBamRoleDefBuff.DEFSCHEMATENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalDefSchemaTenantId",
				1,
				"value",
				value,
				YCFBamRoleDefBuff.DEFSCHEMATENANTID_MIN_VALUE );
		}
		else {
			optionalDefSchemaTenantId = value;
		}
	}

	public Long getOptionalDefSchemaId() {
		return( optionalDefSchemaId );
	}

	public void setOptionalDefSchemaId( Long value ) {
		if( value == null ) {
			optionalDefSchemaId = null;
		}
		else if( value < YCFBamRoleDefBuff.DEFSCHEMAID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalDefSchemaId",
				1,
				"value",
				value,
				YCFBamRoleDefBuff.DEFSCHEMAID_MIN_VALUE );
		}
		else {
			optionalDefSchemaId = value;
		}
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

	public String getRequiredEnables() {
		return( requiredEnables );
	}

	public void setRequiredEnables( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredEnables",
				1,
				"value" );
		}
		if( value.length() > 2000000 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredEnables",
				1,
				"value.length()",
				value.length(),
				2000000 );
		}
		requiredEnables = value;
	}

	public String getRequiredIncludes() {
		return( requiredIncludes );
	}

	public void setRequiredIncludes( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredIncludes",
				1,
				"value" );
		}
		if( value.length() > 2000000 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredIncludes",
				1,
				"value.length()",
				value.length(),
				2000000 );
		}
		requiredIncludes = value;
	}

	public int getRequiredRevision() {
		return( requiredRevision );
	}

	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFBamRoleDefBuff ) {
			YCFBamRoleDefBuff rhs = (YCFBamRoleDefBuff)obj;
			if( ! getCreatedByUserId().equals( rhs.getCreatedByUserId() ) ) {
				return( false );
			}
			if( ! getCreatedAt().equals( rhs.getCreatedAt() ) ) {
				return( false );
			}
			if( ! getUpdatedByUserId().equals( rhs.getUpdatedByUserId() ) ) {
				return( false );
			}
			if( ! getUpdatedAt().equals( rhs.getUpdatedAt() ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredScopeId() != rhs.getRequiredScopeId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalDefSchemaTenantId() != null ) {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					if( ! getOptionalDefSchemaTenantId().equals( rhs.getOptionalDefSchemaTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( ! getRequiredEnables().equals( rhs.getRequiredEnables() ) ) {
				return( false );
			}
			if( ! getRequiredIncludes().equals( rhs.getRequiredIncludes() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamRoleDefPKey ) {
			YCFBamRoleDefPKey rhs = (YCFBamRoleDefPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamRoleDefHBuff ) {
			YCFBamRoleDefHBuff rhs = (YCFBamRoleDefHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredScopeId() != rhs.getRequiredScopeId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalDefSchemaTenantId() != null ) {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					if( ! getOptionalDefSchemaTenantId().equals( rhs.getOptionalDefSchemaTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( ! getRequiredEnables().equals( rhs.getRequiredEnables() ) ) {
				return( false );
			}
			if( ! getRequiredIncludes().equals( rhs.getRequiredIncludes() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamRoleDefHPKey ) {
			YCFBamRoleDefHPKey rhs = (YCFBamRoleDefHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamRoleDefByUNameIdxKey ) {
			YCFBamRoleDefByUNameIdxKey rhs = (YCFBamRoleDefByUNameIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredScopeId() != rhs.getRequiredScopeId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamRoleDefByUDefIdxKey ) {
			YCFBamRoleDefByUDefIdxKey rhs = (YCFBamRoleDefByUDefIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredScopeId() != rhs.getRequiredScopeId() ) {
				return( false );
			}
			if( getOptionalDefSchemaTenantId() != null ) {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					if( ! getOptionalDefSchemaTenantId().equals( rhs.getOptionalDefSchemaTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamRoleDefByRoleDefTentIdxKey ) {
			YCFBamRoleDefByRoleDefTentIdxKey rhs = (YCFBamRoleDefByRoleDefTentIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamRoleDefByScopeIdxKey ) {
			YCFBamRoleDefByScopeIdxKey rhs = (YCFBamRoleDefByScopeIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredScopeId() != rhs.getRequiredScopeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamRoleDefByDefSchemaIdxKey ) {
			YCFBamRoleDefByDefSchemaIdxKey rhs = (YCFBamRoleDefByDefSchemaIdxKey)obj;
			if( getOptionalDefSchemaTenantId() != null ) {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					if( ! getOptionalDefSchemaTenantId().equals( rhs.getOptionalDefSchemaTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + (int)( getRequiredTenantId() );
		hashCode = hashCode + (int)( getRequiredScopeId() );
		hashCode = hashCode + (int)( getRequiredId() );
		if( getOptionalDefSchemaTenantId() != null ) {
			hashCode = hashCode + getOptionalDefSchemaTenantId().hashCode();
		}
		if( getOptionalDefSchemaId() != null ) {
			hashCode = hashCode + getOptionalDefSchemaId().hashCode();
		}
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getRequiredEnables() != null ) {
			hashCode = hashCode + getRequiredEnables().hashCode();
		}
		if( getRequiredIncludes() != null ) {
			hashCode = hashCode + getRequiredIncludes().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFBamRoleDefBuff ) {
			YCFBamRoleDefBuff rhs = (YCFBamRoleDefBuff)obj;
			int retval = 0;
			{
				int cmp = getCreatedByUserId().compareTo( rhs.getCreatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getCreatedAt().compareTo( rhs.getCreatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedByUserId().compareTo( rhs.getUpdatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedAt().compareTo( rhs.getUpdatedAt() );
				if( cmp != 0 ) {
					return( cmp );
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
			return( 0 );
		}
		else if( obj instanceof YCFBamRoleDefPKey ) {
			YCFBamRoleDefPKey rhs = (YCFBamRoleDefPKey)obj;
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
		else if( obj instanceof YCFBamRoleDefHPKey ) {
			YCFBamRoleDefHPKey rhs = (YCFBamRoleDefHPKey)obj;
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
		else if( obj instanceof YCFBamRoleDefHBuff ) {
			YCFBamRoleDefHBuff rhs = (YCFBamRoleDefHBuff)obj;
			int retval = 0;
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
			return( 0 );
		}
		else if( obj instanceof YCFBamRoleDefByUNameIdxKey ) {
			YCFBamRoleDefByUNameIdxKey rhs = (YCFBamRoleDefByUNameIdxKey)obj;

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
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFBamRoleDefByUDefIdxKey ) {
			YCFBamRoleDefByUDefIdxKey rhs = (YCFBamRoleDefByUDefIdxKey)obj;

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
			}			return( 0 );
		}
		else if( obj instanceof YCFBamRoleDefByRoleDefTentIdxKey ) {
			YCFBamRoleDefByRoleDefTentIdxKey rhs = (YCFBamRoleDefByRoleDefTentIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFBamRoleDefByScopeIdxKey ) {
			YCFBamRoleDefByScopeIdxKey rhs = (YCFBamRoleDefByScopeIdxKey)obj;

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
			}			return( 0 );
		}
		else if( obj instanceof YCFBamRoleDefByDefSchemaIdxKey ) {
			YCFBamRoleDefByDefSchemaIdxKey rhs = (YCFBamRoleDefByDefSchemaIdxKey)obj;

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
			}			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public void set( YCFBamRoleDefBuff src ) {
		setRoleDefBuff( src );
	}

	public void setRoleDefBuff( YCFBamRoleDefBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredId( src.getRequiredId() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredScopeId( src.getRequiredScopeId() );
		setOptionalDefSchemaTenantId( src.getOptionalDefSchemaTenantId() );
		setOptionalDefSchemaId( src.getOptionalDefSchemaId() );
		setRequiredName( src.getRequiredName() );
		setRequiredEnables( src.getRequiredEnables() );
		setRequiredIncludes( src.getRequiredIncludes() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( YCFBamRoleDefHBuff src ) {
		setRoleDefBuff( src );
	}

	public void setRoleDefBuff( YCFBamRoleDefHBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredId( src.getRequiredId() );
		setRequiredScopeId( src.getRequiredScopeId() );
		setOptionalDefSchemaTenantId( src.getOptionalDefSchemaTenantId() );
		setOptionalDefSchemaId( src.getOptionalDefSchemaId() );
		setRequiredName( src.getRequiredName() );
		setRequiredEnables( src.getRequiredEnables() );
		setRequiredIncludes( src.getRequiredIncludes() );
	}
}
