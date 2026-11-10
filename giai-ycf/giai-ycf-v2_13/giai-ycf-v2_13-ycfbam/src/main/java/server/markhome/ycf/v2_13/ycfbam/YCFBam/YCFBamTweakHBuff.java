// Description: Java 11 implementation of a Tweak history buffer object.

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

public class YCFBamTweakHBuff

	extends YCFBamHPKey	implements Comparable<Object>,
		Serializable
{
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long SCOPEID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long DEFSCHEMATENANTID_INIT_VALUE = 0L;
	public static final long DEFSCHEMAID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public final static boolean REPLACESINHERITED_INIT_VALUE = false;
	public static final String TWEAKGELTEXT_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long SCOPEID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long DEFSCHEMATENANTID_MIN_VALUE = 0L;
	public static final long DEFSCHEMAID_MIN_VALUE = 0L;

	protected long requiredTenantId;
	protected long requiredScopeId;
	protected long requiredId;
	protected Long optionalDefSchemaTenantId;
	protected Long optionalDefSchemaId;
	protected String requiredName;
	protected boolean requiredReplacesInherited;
	protected String requiredTweakGelText;
	public YCFBamTweakHBuff() {
		super();
		requiredTenantId = YCFBamTweakBuff.TENANTID_INIT_VALUE;
		requiredScopeId = YCFBamTweakBuff.SCOPEID_INIT_VALUE;
		requiredId = YCFBamTweakBuff.ID_INIT_VALUE;
		optionalDefSchemaTenantId = null;
		optionalDefSchemaId = null;
		requiredName = new String( YCFBamTweakBuff.NAME_INIT_VALUE );
		requiredReplacesInherited = YCFBamTweakBuff.REPLACESINHERITED_INIT_VALUE;
		requiredTweakGelText = new String( YCFBamTweakBuff.TWEAKGELTEXT_INIT_VALUE );
	}

	public String getClassCode() {
		return( YCFBamTweakBuff.CLASS_CODE );
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFBamTweakBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFBamTweakBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredScopeId() {
		return( requiredScopeId );
	}

	public void setRequiredScopeId( long value ) {
		if( value < YCFBamTweakBuff.SCOPEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredScopeId",
				1,
				"value",
				value,
				YCFBamTweakBuff.SCOPEID_MIN_VALUE );
		}
		requiredScopeId = value;
	}

	public long getRequiredId() {
		return( requiredId );
	}

	public void setRequiredId( long value ) {
		if( value < YCFBamTweakBuff.ID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredId",
				1,
				"value",
				value,
				YCFBamTweakBuff.ID_MIN_VALUE );
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
		else if( value < YCFBamTweakBuff.DEFSCHEMATENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalDefSchemaTenantId",
				1,
				"value",
				value,
				YCFBamTweakBuff.DEFSCHEMATENANTID_MIN_VALUE );
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
		else if( value < YCFBamTweakBuff.DEFSCHEMAID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalDefSchemaId",
				1,
				"value",
				value,
				YCFBamTweakBuff.DEFSCHEMAID_MIN_VALUE );
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

	public boolean getRequiredReplacesInherited() {
		return( requiredReplacesInherited );
	}

	public void setRequiredReplacesInherited( boolean value ) {
		requiredReplacesInherited = value;
	}

	public String getRequiredTweakGelText() {
		return( requiredTweakGelText );
	}

	public void setRequiredTweakGelText( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredTweakGelText",
				1,
				"value" );
		}
		if( value.length() > 2000000 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredTweakGelText",
				1,
				"value.length()",
				value.length(),
				2000000 );
		}
		requiredTweakGelText = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFBamTweakHBuff ) {
			YCFBamTweakHBuff rhs = (YCFBamTweakHBuff)obj;
			if( ! super.equals( obj ) ) {
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
			if( getRequiredReplacesInherited() != rhs.getRequiredReplacesInherited() ) {
				return( false );
			}
			if( ! getRequiredTweakGelText().equals( rhs.getRequiredTweakGelText() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamTweakBuff ) {
			YCFBamTweakBuff rhs = (YCFBamTweakBuff)obj;
			if( ! super.equals( obj ) ) {
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
			if( getRequiredReplacesInherited() != rhs.getRequiredReplacesInherited() ) {
				return( false );
			}
			if( ! getRequiredTweakGelText().equals( rhs.getRequiredTweakGelText() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamTweakByUNameIdxKey ) {
			YCFBamTweakByUNameIdxKey rhs = (YCFBamTweakByUNameIdxKey)obj;
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
		else if( obj instanceof YCFBamTweakByUDefIdxKey ) {
			YCFBamTweakByUDefIdxKey rhs = (YCFBamTweakByUDefIdxKey)obj;
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
		else if( obj instanceof YCFBamTweakByValTentIdxKey ) {
			YCFBamTweakByValTentIdxKey rhs = (YCFBamTweakByValTentIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamTweakByScopeIdxKey ) {
			YCFBamTweakByScopeIdxKey rhs = (YCFBamTweakByScopeIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredScopeId() != rhs.getRequiredScopeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamTweakByDefSchemaIdxKey ) {
			YCFBamTweakByDefSchemaIdxKey rhs = (YCFBamTweakByDefSchemaIdxKey)obj;
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
		else if( obj instanceof YCFBamTweakHPKey ) {
			YCFBamTweakHPKey rhs = (YCFBamTweakHPKey)obj;
			{
				long lhsClusterId = getAuditClusterId();
				long rhsClusterId = rhs.getAuditClusterId();
				if( lhsClusterId != rhsClusterId ) {
					return( false );
				}
			}
			{
				Calendar lhsAuditStamp = getAuditStamp();
				Calendar rhsAuditStamp = rhs.getAuditStamp();
				if( lhsAuditStamp != null ) {
					if( rhsAuditStamp != null ) {
						if( ! lhsAuditStamp.equals( rhsAuditStamp ) ) {
							return( false );
						}
					}
					else {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			{
				short lhsActionId = getAuditActionId();
				short rhsActionId = rhs.getAuditActionId();
				if( lhsActionId != rhsActionId ) {
					return( false );
				}
			}
			{
				int lhsRevision = getRequiredRevision();
				int rhsRevision = rhs.getRequiredRevision();
				if( lhsRevision != rhsRevision ) {
					return( false );
				}
			}
			{
				UUID lhsAuditSessionId = getAuditSessionId();
				UUID rhsAuditSessionId = rhs.getAuditSessionId();
				if( lhsAuditSessionId != null ) {
					if( rhsAuditSessionId != null ) {
						if( ! lhsAuditSessionId.equals( rhsAuditSessionId ) ) {
							return( false );
						}
					}
					else {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamHPKey ) {
			YCFBamHPKey rhs = (YCFBamHPKey)obj;
			{
				long lhsClusterId = getAuditClusterId();
				long rhsClusterId = rhs.getAuditClusterId();
				if( lhsClusterId != rhsClusterId ) {
					return( false );
				}
			}
			{
				Calendar lhsAuditStamp = getAuditStamp();
				Calendar rhsAuditStamp = rhs.getAuditStamp();
				if( lhsAuditStamp != null ) {
					if( rhsAuditStamp != null ) {
						if( ! lhsAuditStamp.equals( rhsAuditStamp ) ) {
							return( false );
						}
					}
					else {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			{
				short lhsActionId = getAuditActionId();
				short rhsActionId = rhs.getAuditActionId();
				if( lhsActionId != rhsActionId ) {
					return( false );
				}
			}
			{
				int lhsRevision = getRequiredRevision();
				int rhsRevision = rhs.getRequiredRevision();
				if( lhsRevision != rhsRevision ) {
					return( false );
				}
			}
			{
				UUID lhsAuditSessionId = getAuditSessionId();
				UUID rhsAuditSessionId = rhs.getAuditSessionId();
				if( lhsAuditSessionId != null ) {
					if( rhsAuditSessionId != null ) {
						if( ! lhsAuditSessionId.equals( rhsAuditSessionId ) ) {
							return( false );
						}
					}
					else {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFBamTweakPKey ) {
			YCFBamTweakPKey rhs = (YCFBamTweakPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
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
		if( getRequiredReplacesInherited() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		if( getRequiredTweakGelText() != null ) {
			hashCode = hashCode + getRequiredTweakGelText().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFBamTweakBuff ) {
			YCFBamTweakBuff rhs = (YCFBamTweakBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof YCFBamTweakByUNameIdxKey ) {
			YCFBamTweakByUNameIdxKey rhs = (YCFBamTweakByUNameIdxKey)obj;

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
		else if( obj instanceof YCFBamTweakByUDefIdxKey ) {
			YCFBamTweakByUDefIdxKey rhs = (YCFBamTweakByUDefIdxKey)obj;

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
		else if( obj instanceof YCFBamTweakByValTentIdxKey ) {
			YCFBamTweakByValTentIdxKey rhs = (YCFBamTweakByValTentIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFBamTweakByScopeIdxKey ) {
			YCFBamTweakByScopeIdxKey rhs = (YCFBamTweakByScopeIdxKey)obj;

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
		else if( obj instanceof YCFBamTweakByDefSchemaIdxKey ) {
			YCFBamTweakByDefSchemaIdxKey rhs = (YCFBamTweakByDefSchemaIdxKey)obj;

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
		else if( obj instanceof YCFBamTweakHBuff ) {
			YCFBamTweakHBuff rhs = (YCFBamTweakHBuff)obj;

			int retval = 0;
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
			if( getRequiredReplacesInherited() ) {
				if( ! rhs.getRequiredReplacesInherited() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredReplacesInherited() ) {
					return( -1 );
				}
			}
			{
				int cmp = getRequiredTweakGelText().compareTo( rhs.getRequiredTweakGelText() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFBamTweakHPKey ) {
			YCFBamTweakHPKey rhs = (YCFBamTweakHPKey)obj;
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
			return( 0 );
		}
		else if( obj instanceof YCFBamTweakPKey ) {
			YCFBamTweakPKey rhs = (YCFBamTweakPKey)obj;
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
		else if( obj instanceof YCFBamHPKey ) {
			YCFBamHPKey rhs = (YCFBamHPKey)obj;
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
			return( 0 );
		}
		else {
			return( super.compareTo( obj ) );
		}
	}

	public void set( YCFBamTweakBuff src ) {
		setTweakBuff( src );
	}

	public void setTweakBuff( YCFBamTweakBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredId( src.getRequiredId() );
		setRequiredScopeId( src.getRequiredScopeId() );
		setOptionalDefSchemaTenantId( src.getOptionalDefSchemaTenantId() );
		setOptionalDefSchemaId( src.getOptionalDefSchemaId() );
		setRequiredName( src.getRequiredName() );
		setRequiredReplacesInherited( src.getRequiredReplacesInherited() );
		setRequiredTweakGelText( src.getRequiredTweakGelText() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( YCFBamTweakHBuff src ) {
		setTweakBuff( src );
	}

	public void setTweakBuff( YCFBamTweakHBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredId( src.getRequiredId() );
		setRequiredScopeId( src.getRequiredScopeId() );
		setOptionalDefSchemaTenantId( src.getOptionalDefSchemaTenantId() );
		setOptionalDefSchemaId( src.getOptionalDefSchemaId() );
		setRequiredName( src.getRequiredName() );
		setRequiredReplacesInherited( src.getRequiredReplacesInherited() );
		setRequiredTweakGelText( src.getRequiredTweakGelText() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
