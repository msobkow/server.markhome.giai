// Description: Java 11 implementation of a SecUser history buffer object.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSec;

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

public class YCFSecSecUserHBuff

	extends YCFSecHPKey	implements Comparable<Object>,
		Serializable
{
	public static final UUID SECUSERID_INIT_VALUE = UUID.fromString( "654dbba0-eda7-11e1-aff1-0800200c9a66" );
	public static final String LOGINID_INIT_VALUE = new String( "" );
	public static final String EMAILADDRESS_INIT_VALUE = new String( "" );
	public static final UUID DFLTDEVUSERID_INIT_VALUE = UUID.fromString( "654dbba0-eda7-11e1-aff1-0800200c9a66" );
	public static final String DFLTDEVNAME_INIT_VALUE = new String( "" );
	public static final String PASSWORDHASH_INIT_VALUE = new String( "" );

	protected UUID requiredSecUserId;
	protected String requiredLoginId;
	protected String requiredEMailAddress;
	protected UUID optionalEMailConfirmUuid;
	protected UUID optionalDfltDevUserId;
	protected String optionalDfltDevName;
	protected String requiredPasswordHash;
	protected UUID optionalPasswordResetUuid;
	public YCFSecSecUserHBuff() {
		super();
		requiredSecUserId = UUID.fromString( YCFSecSecUserBuff.SECUSERID_INIT_VALUE.toString() );
		requiredLoginId = new String( YCFSecSecUserBuff.LOGINID_INIT_VALUE );
		requiredEMailAddress = new String( YCFSecSecUserBuff.EMAILADDRESS_INIT_VALUE );
		optionalEMailConfirmUuid = null;
		optionalDfltDevUserId = null;
		optionalDfltDevName = null;
		requiredPasswordHash = new String( YCFSecSecUserBuff.PASSWORDHASH_INIT_VALUE );
		optionalPasswordResetUuid = null;
	}

	public String getClassCode() {
		return( YCFSecSecUserBuff.CLASS_CODE );
	}

	public UUID getRequiredSecUserId() {
		return( requiredSecUserId );
	}

	public void setRequiredSecUserId( UUID value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredSecUserId",
				1,
				"value" );
		}
		requiredSecUserId = value;
	}

	public String getRequiredLoginId() {
		return( requiredLoginId );
	}

	public void setRequiredLoginId( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredLoginId",
				1,
				"value" );
		}
		if( value.length() > 32 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredLoginId",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredLoginId = value;
	}

	public String getRequiredEMailAddress() {
		return( requiredEMailAddress );
	}

	public void setRequiredEMailAddress( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredEMailAddress",
				1,
				"value" );
		}
		if( value.length() > 192 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredEMailAddress",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredEMailAddress = value;
	}

	public UUID getOptionalEMailConfirmUuid() {
		return( optionalEMailConfirmUuid );
	}

	public void setOptionalEMailConfirmUuid( UUID value ) {
		if( value == null ) {
			optionalEMailConfirmUuid = null;
		}
		else {
			optionalEMailConfirmUuid = value;
		}
	}

	public UUID getOptionalDfltDevUserId() {
		return( optionalDfltDevUserId );
	}

	public void setOptionalDfltDevUserId( UUID value ) {
		if( value == null ) {
			optionalDfltDevUserId = null;
		}
		else {
			optionalDfltDevUserId = value;
		}
	}

	public String getOptionalDfltDevName() {
		return( optionalDfltDevName );
	}

	public void setOptionalDfltDevName( String value ) {
		if( value == null ) {
			optionalDfltDevName = null;
		}
		else if( value.length() > 127 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalDfltDevName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalDfltDevName = value;
		}
	}

	public String getRequiredPasswordHash() {
		return( requiredPasswordHash );
	}

	public void setRequiredPasswordHash( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredPasswordHash",
				1,
				"value" );
		}
		if( value.length() > 256 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredPasswordHash",
				1,
				"value.length()",
				value.length(),
				256 );
		}
		requiredPasswordHash = value;
	}

	public UUID getOptionalPasswordResetUuid() {
		return( optionalPasswordResetUuid );
	}

	public void setOptionalPasswordResetUuid( UUID value ) {
		if( value == null ) {
			optionalPasswordResetUuid = null;
		}
		else {
			optionalPasswordResetUuid = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecSecUserHBuff ) {
			YCFSecSecUserHBuff rhs = (YCFSecSecUserHBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
				return( false );
			}
			if( ! getRequiredEMailAddress().equals( rhs.getRequiredEMailAddress() ) ) {
				return( false );
			}
			if( getOptionalEMailConfirmUuid() != null ) {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					if( ! getOptionalEMailConfirmUuid().equals( rhs.getOptionalEMailConfirmUuid() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltDevUserId() != null ) {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					if( ! getOptionalDfltDevUserId().equals( rhs.getOptionalDfltDevUserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltDevName() != null ) {
				if( rhs.getOptionalDfltDevName() != null ) {
					if( ! getOptionalDfltDevName().equals( rhs.getOptionalDfltDevName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevName() != null ) {
					return( false );
				}
			}
			if( ! getRequiredPasswordHash().equals( rhs.getRequiredPasswordHash() ) ) {
				return( false );
			}
			if( getOptionalPasswordResetUuid() != null ) {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					if( ! getOptionalPasswordResetUuid().equals( rhs.getOptionalPasswordResetUuid() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecUserBuff ) {
			YCFSecSecUserBuff rhs = (YCFSecSecUserBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
				return( false );
			}
			if( ! getRequiredEMailAddress().equals( rhs.getRequiredEMailAddress() ) ) {
				return( false );
			}
			if( getOptionalEMailConfirmUuid() != null ) {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					if( ! getOptionalEMailConfirmUuid().equals( rhs.getOptionalEMailConfirmUuid() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltDevUserId() != null ) {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					if( ! getOptionalDfltDevUserId().equals( rhs.getOptionalDfltDevUserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltDevName() != null ) {
				if( rhs.getOptionalDfltDevName() != null ) {
					if( ! getOptionalDfltDevName().equals( rhs.getOptionalDfltDevName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevName() != null ) {
					return( false );
				}
			}
			if( ! getRequiredPasswordHash().equals( rhs.getRequiredPasswordHash() ) ) {
				return( false );
			}
			if( getOptionalPasswordResetUuid() != null ) {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					if( ! getOptionalPasswordResetUuid().equals( rhs.getOptionalPasswordResetUuid() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecUserByULoginIdxKey ) {
			YCFSecSecUserByULoginIdxKey rhs = (YCFSecSecUserByULoginIdxKey)obj;
			if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecUserByEMConfIdxKey ) {
			YCFSecSecUserByEMConfIdxKey rhs = (YCFSecSecUserByEMConfIdxKey)obj;
			if( getOptionalEMailConfirmUuid() != null ) {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					if( ! getOptionalEMailConfirmUuid().equals( rhs.getOptionalEMailConfirmUuid() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecUserByPwdResetIdxKey ) {
			YCFSecSecUserByPwdResetIdxKey rhs = (YCFSecSecUserByPwdResetIdxKey)obj;
			if( getOptionalPasswordResetUuid() != null ) {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					if( ! getOptionalPasswordResetUuid().equals( rhs.getOptionalPasswordResetUuid() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecUserByDefDevIdxKey ) {
			YCFSecSecUserByDefDevIdxKey rhs = (YCFSecSecUserByDefDevIdxKey)obj;
			if( getOptionalDfltDevUserId() != null ) {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					if( ! getOptionalDfltDevUserId().equals( rhs.getOptionalDfltDevUserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltDevName() != null ) {
				if( rhs.getOptionalDfltDevName() != null ) {
					if( ! getOptionalDfltDevName().equals( rhs.getOptionalDfltDevName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecUserHPKey ) {
			YCFSecSecUserHPKey rhs = (YCFSecSecUserHPKey)obj;
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
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecHPKey ) {
			YCFSecHPKey rhs = (YCFSecHPKey)obj;
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
		else if( obj instanceof YCFSecSecUserPKey ) {
			YCFSecSecUserPKey rhs = (YCFSecSecUserPKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
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
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getRequiredLoginId() != null ) {
			hashCode = hashCode + getRequiredLoginId().hashCode();
		}
		if( getRequiredEMailAddress() != null ) {
			hashCode = hashCode + getRequiredEMailAddress().hashCode();
		}
		if( getOptionalEMailConfirmUuid() != null ) {
			hashCode = hashCode + getOptionalEMailConfirmUuid().hashCode();
		}
		if( getOptionalDfltDevUserId() != null ) {
			hashCode = hashCode + getOptionalDfltDevUserId().hashCode();
		}
		if( getOptionalDfltDevName() != null ) {
			hashCode = hashCode + getOptionalDfltDevName().hashCode();
		}
		if( getRequiredPasswordHash() != null ) {
			hashCode = hashCode + getRequiredPasswordHash().hashCode();
		}
		if( getOptionalPasswordResetUuid() != null ) {
			hashCode = hashCode + getOptionalPasswordResetUuid().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecSecUserBuff ) {
			YCFSecSecUserBuff rhs = (YCFSecSecUserBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecUserByULoginIdxKey ) {
			YCFSecSecUserByULoginIdxKey rhs = (YCFSecSecUserByULoginIdxKey)obj;

			{
				int cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecUserByEMConfIdxKey ) {
			YCFSecSecUserByEMConfIdxKey rhs = (YCFSecSecUserByEMConfIdxKey)obj;

			if( getOptionalEMailConfirmUuid() != null ) {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					int cmp = getOptionalEMailConfirmUuid().compareTo( rhs.getOptionalEMailConfirmUuid() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecUserByPwdResetIdxKey ) {
			YCFSecSecUserByPwdResetIdxKey rhs = (YCFSecSecUserByPwdResetIdxKey)obj;

			if( getOptionalPasswordResetUuid() != null ) {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					int cmp = getOptionalPasswordResetUuid().compareTo( rhs.getOptionalPasswordResetUuid() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecUserByDefDevIdxKey ) {
			YCFSecSecUserByDefDevIdxKey rhs = (YCFSecSecUserByDefDevIdxKey)obj;

			if( getOptionalDfltDevUserId() != null ) {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					int cmp = getOptionalDfltDevUserId().compareTo( rhs.getOptionalDfltDevUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltDevName() != null ) {
				if( rhs.getOptionalDfltDevName() != null ) {
					int cmp = getOptionalDfltDevName().compareTo( rhs.getOptionalDfltDevName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltDevName() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecUserHBuff ) {
			YCFSecSecUserHBuff rhs = (YCFSecSecUserHBuff)obj;

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
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredEMailAddress().compareTo( rhs.getRequiredEMailAddress() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalEMailConfirmUuid() != null ) {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					int cmp = getOptionalEMailConfirmUuid().compareTo( rhs.getOptionalEMailConfirmUuid() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalEMailConfirmUuid() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltDevUserId() != null ) {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					int cmp = getOptionalDfltDevUserId().compareTo( rhs.getOptionalDfltDevUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltDevName() != null ) {
				if( rhs.getOptionalDfltDevName() != null ) {
					int cmp = getOptionalDfltDevName().compareTo( rhs.getOptionalDfltDevName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltDevName() != null ) {
					return( -1 );
				}
			}
			{
				int cmp = getRequiredPasswordHash().compareTo( rhs.getRequiredPasswordHash() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalPasswordResetUuid() != null ) {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					int cmp = getOptionalPasswordResetUuid().compareTo( rhs.getOptionalPasswordResetUuid() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecUserHPKey ) {
			YCFSecSecUserHPKey rhs = (YCFSecSecUserHPKey)obj;
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
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecUserPKey ) {
			YCFSecSecUserPKey rhs = (YCFSecSecUserPKey)obj;
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecHPKey ) {
			YCFSecHPKey rhs = (YCFSecHPKey)obj;
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

	public void set( YCFSecSecUserBuff src ) {
		setSecUserBuff( src );
	}

	public void setSecUserBuff( YCFSecSecUserBuff src ) {
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredLoginId( src.getRequiredLoginId() );
		setRequiredEMailAddress( src.getRequiredEMailAddress() );
		setOptionalEMailConfirmUuid( src.getOptionalEMailConfirmUuid() );
		setOptionalDfltDevUserId( src.getOptionalDfltDevUserId() );
		setOptionalDfltDevName( src.getOptionalDfltDevName() );
		setRequiredPasswordHash( src.getRequiredPasswordHash() );
		setOptionalPasswordResetUuid( src.getOptionalPasswordResetUuid() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( YCFSecSecUserHBuff src ) {
		setSecUserBuff( src );
	}

	public void setSecUserBuff( YCFSecSecUserHBuff src ) {
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredLoginId( src.getRequiredLoginId() );
		setRequiredEMailAddress( src.getRequiredEMailAddress() );
		setOptionalEMailConfirmUuid( src.getOptionalEMailConfirmUuid() );
		setOptionalDfltDevUserId( src.getOptionalDfltDevUserId() );
		setOptionalDfltDevName( src.getOptionalDfltDevName() );
		setRequiredPasswordHash( src.getRequiredPasswordHash() );
		setOptionalPasswordResetUuid( src.getOptionalPasswordResetUuid() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
