// Description: Java 11 implementation of a TSecGrpInc history buffer object.

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

public class YCFSecTSecGrpIncHBuff

	extends YCFSecHPKey	implements Comparable<Object>,
		Serializable
{
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long TSECGRPINCID_INIT_VALUE = 0L;
	public static final int TSECGROUPID_INIT_VALUE = 0;
	public static final int INCLUDEGROUPID_INIT_VALUE = 0;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long TSECGRPINCID_MIN_VALUE = 0L;
	public static final int TSECGROUPID_MIN_VALUE = 0;
	public static final int INCLUDEGROUPID_MIN_VALUE = 0;

	protected long requiredTenantId;
	protected long requiredTSecGrpIncId;
	protected int requiredTSecGroupId;
	protected int requiredIncludeGroupId;
	public YCFSecTSecGrpIncHBuff() {
		super();
		requiredTenantId = YCFSecTSecGrpIncBuff.TENANTID_INIT_VALUE;
		requiredTSecGrpIncId = YCFSecTSecGrpIncBuff.TSECGRPINCID_INIT_VALUE;
		requiredTSecGroupId = YCFSecTSecGrpIncBuff.TSECGROUPID_INIT_VALUE;
		requiredIncludeGroupId = YCFSecTSecGrpIncBuff.INCLUDEGROUPID_INIT_VALUE;
	}

	public String getClassCode() {
		return( YCFSecTSecGrpIncBuff.CLASS_CODE );
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFSecTSecGrpIncBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFSecTSecGrpIncBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredTSecGrpIncId() {
		return( requiredTSecGrpIncId );
	}

	public void setRequiredTSecGrpIncId( long value ) {
		if( value < YCFSecTSecGrpIncBuff.TSECGRPINCID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTSecGrpIncId",
				1,
				"value",
				value,
				YCFSecTSecGrpIncBuff.TSECGRPINCID_MIN_VALUE );
		}
		requiredTSecGrpIncId = value;
	}

	public int getRequiredTSecGroupId() {
		return( requiredTSecGroupId );
	}

	public void setRequiredTSecGroupId( int value ) {
		if( value < YCFSecTSecGrpIncBuff.TSECGROUPID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTSecGroupId",
				1,
				"value",
				value,
				YCFSecTSecGrpIncBuff.TSECGROUPID_MIN_VALUE );
		}
		requiredTSecGroupId = value;
	}

	public int getRequiredIncludeGroupId() {
		return( requiredIncludeGroupId );
	}

	public void setRequiredIncludeGroupId( int value ) {
		if( value < YCFSecTSecGrpIncBuff.INCLUDEGROUPID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredIncludeGroupId",
				1,
				"value",
				value,
				YCFSecTSecGrpIncBuff.INCLUDEGROUPID_MIN_VALUE );
		}
		requiredIncludeGroupId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecTSecGrpIncHBuff ) {
			YCFSecTSecGrpIncHBuff rhs = (YCFSecTSecGrpIncHBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
				return( false );
			}
			if( getRequiredTSecGroupId() != rhs.getRequiredTSecGroupId() ) {
				return( false );
			}
			if( getRequiredIncludeGroupId() != rhs.getRequiredIncludeGroupId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecTSecGrpIncBuff ) {
			YCFSecTSecGrpIncBuff rhs = (YCFSecTSecGrpIncBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
				return( false );
			}
			if( getRequiredTSecGroupId() != rhs.getRequiredTSecGroupId() ) {
				return( false );
			}
			if( getRequiredIncludeGroupId() != rhs.getRequiredIncludeGroupId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecTSecGrpIncByTenantIdxKey ) {
			YCFSecTSecGrpIncByTenantIdxKey rhs = (YCFSecTSecGrpIncByTenantIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecTSecGrpIncByGroupIdxKey ) {
			YCFSecTSecGrpIncByGroupIdxKey rhs = (YCFSecTSecGrpIncByGroupIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGroupId() != rhs.getRequiredTSecGroupId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecTSecGrpIncByIncludeIdxKey ) {
			YCFSecTSecGrpIncByIncludeIdxKey rhs = (YCFSecTSecGrpIncByIncludeIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredIncludeGroupId() != rhs.getRequiredIncludeGroupId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecTSecGrpIncByUIncludeIdxKey ) {
			YCFSecTSecGrpIncByUIncludeIdxKey rhs = (YCFSecTSecGrpIncByUIncludeIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGroupId() != rhs.getRequiredTSecGroupId() ) {
				return( false );
			}
			if( getRequiredIncludeGroupId() != rhs.getRequiredIncludeGroupId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecTSecGrpIncHPKey ) {
			YCFSecTSecGrpIncHPKey rhs = (YCFSecTSecGrpIncHPKey)obj;
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
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
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
		else if( obj instanceof YCFSecTSecGrpIncPKey ) {
			YCFSecTSecGrpIncPKey rhs = (YCFSecTSecGrpIncPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
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
		hashCode = hashCode + (int)( getRequiredTSecGrpIncId() );
		hashCode = hashCode + getRequiredTSecGroupId();
		hashCode = hashCode + getRequiredIncludeGroupId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecTSecGrpIncBuff ) {
			YCFSecTSecGrpIncBuff rhs = (YCFSecTSecGrpIncBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncByTenantIdxKey ) {
			YCFSecTSecGrpIncByTenantIdxKey rhs = (YCFSecTSecGrpIncByTenantIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncByGroupIdxKey ) {
			YCFSecTSecGrpIncByGroupIdxKey rhs = (YCFSecTSecGrpIncByGroupIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGroupId() < rhs.getRequiredTSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGroupId() > rhs.getRequiredTSecGroupId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncByIncludeIdxKey ) {
			YCFSecTSecGrpIncByIncludeIdxKey rhs = (YCFSecTSecGrpIncByIncludeIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredIncludeGroupId() < rhs.getRequiredIncludeGroupId() ) {
				return( -1 );
			}
			else if( getRequiredIncludeGroupId() > rhs.getRequiredIncludeGroupId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncByUIncludeIdxKey ) {
			YCFSecTSecGrpIncByUIncludeIdxKey rhs = (YCFSecTSecGrpIncByUIncludeIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGroupId() < rhs.getRequiredTSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGroupId() > rhs.getRequiredTSecGroupId() ) {
				return( 1 );
			}
			if( getRequiredIncludeGroupId() < rhs.getRequiredIncludeGroupId() ) {
				return( -1 );
			}
			else if( getRequiredIncludeGroupId() > rhs.getRequiredIncludeGroupId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncHBuff ) {
			YCFSecTSecGrpIncHBuff rhs = (YCFSecTSecGrpIncHBuff)obj;

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
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			if( getRequiredTSecGroupId() < rhs.getRequiredTSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGroupId() > rhs.getRequiredTSecGroupId() ) {
				return( 1 );
			}
			if( getRequiredIncludeGroupId() < rhs.getRequiredIncludeGroupId() ) {
				return( -1 );
			}
			else if( getRequiredIncludeGroupId() > rhs.getRequiredIncludeGroupId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncHPKey ) {
			YCFSecTSecGrpIncHPKey rhs = (YCFSecTSecGrpIncHPKey)obj;
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
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecTSecGrpIncPKey ) {
			YCFSecTSecGrpIncPKey rhs = (YCFSecTSecGrpIncPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
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

	public void set( YCFSecTSecGrpIncBuff src ) {
		setTSecGrpIncBuff( src );
	}

	public void setTSecGrpIncBuff( YCFSecTSecGrpIncBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredTSecGrpIncId( src.getRequiredTSecGrpIncId() );
		setRequiredTSecGroupId( src.getRequiredTSecGroupId() );
		setRequiredIncludeGroupId( src.getRequiredIncludeGroupId() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( YCFSecTSecGrpIncHBuff src ) {
		setTSecGrpIncBuff( src );
	}

	public void setTSecGrpIncBuff( YCFSecTSecGrpIncHBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredTSecGrpIncId( src.getRequiredTSecGrpIncId() );
		setRequiredTSecGroupId( src.getRequiredTSecGroupId() );
		setRequiredIncludeGroupId( src.getRequiredIncludeGroupId() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
