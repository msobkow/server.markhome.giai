// Description: Java 11 implementation of a ClearTopDep history buffer object.

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

public class YCFBamClearTopDepHBuff
	extends YCFBamClearDepHBuff
	implements Comparable<Object>,
		Serializable
{
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long TABLETENANTID_INIT_VALUE = 0L;
	public static final long TABLEID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long PREVTENANTID_INIT_VALUE = 0L;
	public static final long PREVID_INIT_VALUE = 0L;
	public static final long NEXTTENANTID_INIT_VALUE = 0L;
	public static final long NEXTID_INIT_VALUE = 0L;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long TABLETENANTID_MIN_VALUE = 0L;
	public static final long TABLEID_MIN_VALUE = 0L;
	public static final long PREVTENANTID_MIN_VALUE = 0L;
	public static final long PREVID_MIN_VALUE = 0L;
	public static final long NEXTTENANTID_MIN_VALUE = 0L;
	public static final long NEXTID_MIN_VALUE = 0L;

	protected long requiredTableTenantId;
	protected long requiredTableId;
	protected String requiredName;
	protected Long optionalPrevTenantId;
	protected Long optionalPrevId;
	protected Long optionalNextTenantId;
	protected Long optionalNextId;
	public YCFBamClearTopDepHBuff() {
		super();
		requiredTableTenantId = YCFBamClearTopDepBuff.TABLETENANTID_INIT_VALUE;
		requiredTableId = YCFBamClearTopDepBuff.TABLEID_INIT_VALUE;
		requiredName = new String( YCFBamClearTopDepBuff.NAME_INIT_VALUE );
		optionalPrevTenantId = null;
		optionalPrevId = null;
		optionalNextTenantId = null;
		optionalNextId = null;
	}

	public String getClassCode() {
		return( YCFBamClearTopDepBuff.CLASS_CODE );
	}

	public long getRequiredTableTenantId() {
		return( requiredTableTenantId );
	}

	public void setRequiredTableTenantId( long value ) {
		if( value < YCFBamClearTopDepBuff.TABLETENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTableTenantId",
				1,
				"value",
				value,
				YCFBamClearTopDepBuff.TABLETENANTID_MIN_VALUE );
		}
		requiredTableTenantId = value;
	}

	public long getRequiredTableId() {
		return( requiredTableId );
	}

	public void setRequiredTableId( long value ) {
		if( value < YCFBamClearTopDepBuff.TABLEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTableId",
				1,
				"value",
				value,
				YCFBamClearTopDepBuff.TABLEID_MIN_VALUE );
		}
		requiredTableId = value;
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

	public Long getOptionalPrevTenantId() {
		return( optionalPrevTenantId );
	}

	public void setOptionalPrevTenantId( Long value ) {
		if( value == null ) {
			optionalPrevTenantId = null;
		}
		else if( value < YCFBamClearTopDepBuff.PREVTENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalPrevTenantId",
				1,
				"value",
				value,
				YCFBamClearTopDepBuff.PREVTENANTID_MIN_VALUE );
		}
		else {
			optionalPrevTenantId = value;
		}
	}

	public Long getOptionalPrevId() {
		return( optionalPrevId );
	}

	public void setOptionalPrevId( Long value ) {
		if( value == null ) {
			optionalPrevId = null;
		}
		else if( value < YCFBamClearTopDepBuff.PREVID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalPrevId",
				1,
				"value",
				value,
				YCFBamClearTopDepBuff.PREVID_MIN_VALUE );
		}
		else {
			optionalPrevId = value;
		}
	}

	public Long getOptionalNextTenantId() {
		return( optionalNextTenantId );
	}

	public void setOptionalNextTenantId( Long value ) {
		if( value == null ) {
			optionalNextTenantId = null;
		}
		else if( value < YCFBamClearTopDepBuff.NEXTTENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalNextTenantId",
				1,
				"value",
				value,
				YCFBamClearTopDepBuff.NEXTTENANTID_MIN_VALUE );
		}
		else {
			optionalNextTenantId = value;
		}
	}

	public Long getOptionalNextId() {
		return( optionalNextId );
	}

	public void setOptionalNextId( Long value ) {
		if( value == null ) {
			optionalNextId = null;
		}
		else if( value < YCFBamClearTopDepBuff.NEXTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalNextId",
				1,
				"value",
				value,
				YCFBamClearTopDepBuff.NEXTID_MIN_VALUE );
		}
		else {
			optionalNextId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFBamClearTopDepHBuff ) {
			YCFBamClearTopDepHBuff rhs = (YCFBamClearTopDepHBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredTableTenantId() != rhs.getRequiredTableTenantId() ) {
				return( false );
			}
			if( getRequiredTableId() != rhs.getRequiredTableId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( getOptionalPrevTenantId() != null ) {
				if( rhs.getOptionalPrevTenantId() != null ) {
					if( ! getOptionalPrevTenantId().equals( rhs.getOptionalPrevTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextTenantId() != null ) {
				if( rhs.getOptionalNextTenantId() != null ) {
					if( ! getOptionalNextTenantId().equals( rhs.getOptionalNextTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNextTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFBamClearTopDepBuff ) {
			YCFBamClearTopDepBuff rhs = (YCFBamClearTopDepBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredTableTenantId() != rhs.getRequiredTableTenantId() ) {
				return( false );
			}
			if( getRequiredTableId() != rhs.getRequiredTableId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( getOptionalPrevTenantId() != null ) {
				if( rhs.getOptionalPrevTenantId() != null ) {
					if( ! getOptionalPrevTenantId().equals( rhs.getOptionalPrevTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextTenantId() != null ) {
				if( rhs.getOptionalNextTenantId() != null ) {
					if( ! getOptionalNextTenantId().equals( rhs.getOptionalNextTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNextTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFBamClearTopDepByClrTopDepTblIdxKey ) {
			YCFBamClearTopDepByClrTopDepTblIdxKey rhs = (YCFBamClearTopDepByClrTopDepTblIdxKey)obj;
			if( getRequiredTableTenantId() != rhs.getRequiredTableTenantId() ) {
				return( false );
			}
			if( getRequiredTableId() != rhs.getRequiredTableId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamClearTopDepByUNameIdxKey ) {
			YCFBamClearTopDepByUNameIdxKey rhs = (YCFBamClearTopDepByUNameIdxKey)obj;
			if( getRequiredTableTenantId() != rhs.getRequiredTableTenantId() ) {
				return( false );
			}
			if( getRequiredTableId() != rhs.getRequiredTableId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamClearTopDepByPrevIdxKey ) {
			YCFBamClearTopDepByPrevIdxKey rhs = (YCFBamClearTopDepByPrevIdxKey)obj;
			if( getOptionalPrevTenantId() != null ) {
				if( rhs.getOptionalPrevTenantId() != null ) {
					if( ! getOptionalPrevTenantId().equals( rhs.getOptionalPrevTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFBamClearTopDepByNextIdxKey ) {
			YCFBamClearTopDepByNextIdxKey rhs = (YCFBamClearTopDepByNextIdxKey)obj;
			if( getOptionalNextTenantId() != null ) {
				if( rhs.getOptionalNextTenantId() != null ) {
					if( ! getOptionalNextTenantId().equals( rhs.getOptionalNextTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNextTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( super.equals( obj ) );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + (int)( getRequiredTableTenantId() );
		hashCode = hashCode + (int)( getRequiredTableId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalPrevTenantId() != null ) {
			hashCode = hashCode + getOptionalPrevTenantId().hashCode();
		}
		if( getOptionalPrevId() != null ) {
			hashCode = hashCode + getOptionalPrevId().hashCode();
		}
		if( getOptionalNextTenantId() != null ) {
			hashCode = hashCode + getOptionalNextTenantId().hashCode();
		}
		if( getOptionalNextId() != null ) {
			hashCode = hashCode + getOptionalNextId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFBamClearTopDepBuff ) {
			YCFBamClearTopDepBuff rhs = (YCFBamClearTopDepBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof YCFBamClearTopDepByClrTopDepTblIdxKey ) {
			YCFBamClearTopDepByClrTopDepTblIdxKey rhs = (YCFBamClearTopDepByClrTopDepTblIdxKey)obj;

			if( getRequiredTableTenantId() < rhs.getRequiredTableTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTableTenantId() > rhs.getRequiredTableTenantId() ) {
				return( 1 );
			}
			if( getRequiredTableId() < rhs.getRequiredTableId() ) {
				return( -1 );
			}
			else if( getRequiredTableId() > rhs.getRequiredTableId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFBamClearTopDepByUNameIdxKey ) {
			YCFBamClearTopDepByUNameIdxKey rhs = (YCFBamClearTopDepByUNameIdxKey)obj;

			if( getRequiredTableTenantId() < rhs.getRequiredTableTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTableTenantId() > rhs.getRequiredTableTenantId() ) {
				return( 1 );
			}
			if( getRequiredTableId() < rhs.getRequiredTableId() ) {
				return( -1 );
			}
			else if( getRequiredTableId() > rhs.getRequiredTableId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFBamClearTopDepByPrevIdxKey ) {
			YCFBamClearTopDepByPrevIdxKey rhs = (YCFBamClearTopDepByPrevIdxKey)obj;

			if( getOptionalPrevTenantId() != null ) {
				Long lhsPrevTenantId = getOptionalPrevTenantId();
				if( rhs.getOptionalPrevTenantId() != null ) {
					Long rhsPrevTenantId = rhs.getOptionalPrevTenantId();
					int cmp = lhsPrevTenantId.compareTo( rhsPrevTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalPrevId() != null ) {
				Long lhsPrevId = getOptionalPrevId();
				if( rhs.getOptionalPrevId() != null ) {
					Long rhsPrevId = rhs.getOptionalPrevId();
					int cmp = lhsPrevId.compareTo( rhsPrevId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFBamClearTopDepByNextIdxKey ) {
			YCFBamClearTopDepByNextIdxKey rhs = (YCFBamClearTopDepByNextIdxKey)obj;

			if( getOptionalNextTenantId() != null ) {
				Long lhsNextTenantId = getOptionalNextTenantId();
				if( rhs.getOptionalNextTenantId() != null ) {
					Long rhsNextTenantId = rhs.getOptionalNextTenantId();
					int cmp = lhsNextTenantId.compareTo( rhsNextTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextId() != null ) {
				Long lhsNextId = getOptionalNextId();
				if( rhs.getOptionalNextId() != null ) {
					Long rhsNextId = rhs.getOptionalNextId();
					int cmp = lhsNextId.compareTo( rhsNextId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFBamClearTopDepHBuff ) {
			YCFBamClearTopDepHBuff rhs = (YCFBamClearTopDepHBuff)obj;

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
			if( getRequiredTableTenantId() < rhs.getRequiredTableTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTableTenantId() > rhs.getRequiredTableTenantId() ) {
				return( 1 );
			}
			if( getRequiredTableId() < rhs.getRequiredTableId() ) {
				return( -1 );
			}
			else if( getRequiredTableId() > rhs.getRequiredTableId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalPrevTenantId() != null ) {
				Long lhsPrevTenantId = getOptionalPrevTenantId();
				if( rhs.getOptionalPrevTenantId() != null ) {
					Long rhsPrevTenantId = rhs.getOptionalPrevTenantId();
					int cmp = lhsPrevTenantId.compareTo( rhsPrevTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalPrevId() != null ) {
				Long lhsPrevId = getOptionalPrevId();
				if( rhs.getOptionalPrevId() != null ) {
					Long rhsPrevId = rhs.getOptionalPrevId();
					int cmp = lhsPrevId.compareTo( rhsPrevId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextTenantId() != null ) {
				Long lhsNextTenantId = getOptionalNextTenantId();
				if( rhs.getOptionalNextTenantId() != null ) {
					Long rhsNextTenantId = rhs.getOptionalNextTenantId();
					int cmp = lhsNextTenantId.compareTo( rhsNextTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextId() != null ) {
				Long lhsNextId = getOptionalNextId();
				if( rhs.getOptionalNextId() != null ) {
					Long rhsNextId = rhs.getOptionalNextId();
					int cmp = lhsNextId.compareTo( rhsNextId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			return( super.compareTo( obj ) );
		}
	}

	public void set( YCFBamScopeBuff src ) {
		if( src instanceof YCFBamClearTopDepBuff ) {
			setClearTopDepBuff( (YCFBamClearTopDepBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamClearTopDepBuff" );
		}
	}

	public void setClearTopDepBuff( YCFBamClearTopDepBuff src ) {
		super.setClearDepBuff( src );
		setRequiredTableTenantId( src.getRequiredTableTenantId() );
		setRequiredTableId( src.getRequiredTableId() );
		setRequiredName( src.getRequiredName() );
		setOptionalPrevTenantId( src.getOptionalPrevTenantId() );
		setOptionalPrevId( src.getOptionalPrevId() );
		setOptionalNextTenantId( src.getOptionalNextTenantId() );
		setOptionalNextId( src.getOptionalNextId() );
	}

	public void set( YCFBamScopeHBuff src ) {
		if( src instanceof YCFBamClearTopDepHBuff ) {
			setClearTopDepBuff( (YCFBamClearTopDepHBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamClearTopDepHBuff" );
		}
	}

	public void setClearTopDepBuff( YCFBamClearTopDepHBuff src ) {
		super.setClearDepBuff( src );
		setRequiredTableTenantId( src.getRequiredTableTenantId() );
		setRequiredTableId( src.getRequiredTableId() );
		setRequiredName( src.getRequiredName() );
		setOptionalPrevTenantId( src.getOptionalPrevTenantId() );
		setOptionalPrevId( src.getOptionalPrevId() );
		setOptionalNextTenantId( src.getOptionalNextTenantId() );
		setOptionalNextId( src.getOptionalNextId() );
	}
}
