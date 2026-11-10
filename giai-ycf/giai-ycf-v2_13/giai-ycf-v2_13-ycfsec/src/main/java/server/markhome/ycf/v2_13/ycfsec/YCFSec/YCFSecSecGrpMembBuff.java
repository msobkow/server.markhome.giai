// Description: Java 11 implementation of a SecGrpMemb buffer object.

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

public class YCFSecSecGrpMembBuff
{
	public final static String CLASS_CODE = "a00f";
	public final static String S_INIT_CREATEDBY = "654dbba0-eda7-11e1-aff1-0800200c9a66";
	public final static UUID INIT_CREATEDBY = UUID.fromString( S_INIT_CREATEDBY );
	public final static String S_INIT_UPDATEDBY = "654dbba0-eda7-11e1-aff1-0800200c9a66";
	public final static UUID INIT_UPDATEDBY = UUID.fromString( S_INIT_UPDATEDBY );
	public static final long CLUSTERID_INIT_VALUE = 0L;
	public static final long SECGRPMEMBID_INIT_VALUE = 0L;
	public static final int SECGROUPID_INIT_VALUE = 0;
	public static final UUID SECUSERID_INIT_VALUE = UUID.fromString( "654dbba0-eda7-11e1-aff1-0800200c9a66" );
	public static final long CLUSTERID_MIN_VALUE = 0L;
	public static final long SECGRPMEMBID_MIN_VALUE = 0L;
	public static final int SECGROUPID_MIN_VALUE = 0;
	protected UUID createdByUserId = YCFSecSecGrpMembBuff.INIT_CREATEDBY;
	protected Calendar createdAt = Calendar.getInstance();
	protected UUID updatedByUserId = YCFSecSecGrpMembBuff.INIT_UPDATEDBY;
	protected Calendar updatedAt = Calendar.getInstance();
	protected long requiredClusterId;
	protected long requiredSecGrpMembId;
	protected int requiredSecGroupId;
	protected UUID requiredSecUserId;
	protected int requiredRevision;
	public YCFSecSecGrpMembBuff() {
		requiredClusterId = YCFSecSecGrpMembBuff.CLUSTERID_INIT_VALUE;
		requiredSecGrpMembId = YCFSecSecGrpMembBuff.SECGRPMEMBID_INIT_VALUE;
		requiredSecGroupId = YCFSecSecGrpMembBuff.SECGROUPID_INIT_VALUE;
		requiredSecUserId = UUID.fromString( YCFSecSecGrpMembBuff.SECUSERID_INIT_VALUE.toString() );
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
	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < YCFSecSecGrpMembBuff.CLUSTERID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				YCFSecSecGrpMembBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public long getRequiredSecGrpMembId() {
		return( requiredSecGrpMembId );
	}

	public void setRequiredSecGrpMembId( long value ) {
		if( value < YCFSecSecGrpMembBuff.SECGRPMEMBID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredSecGrpMembId",
				1,
				"value",
				value,
				YCFSecSecGrpMembBuff.SECGRPMEMBID_MIN_VALUE );
		}
		requiredSecGrpMembId = value;
	}

	public int getRequiredSecGroupId() {
		return( requiredSecGroupId );
	}

	public void setRequiredSecGroupId( int value ) {
		if( value < YCFSecSecGrpMembBuff.SECGROUPID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredSecGroupId",
				1,
				"value",
				value,
				YCFSecSecGrpMembBuff.SECGROUPID_MIN_VALUE );
		}
		requiredSecGroupId = value;
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
		else if( obj instanceof YCFSecSecGrpMembBuff ) {
			YCFSecSecGrpMembBuff rhs = (YCFSecSecGrpMembBuff)obj;
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
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			if( getRequiredSecGroupId() != rhs.getRequiredSecGroupId() ) {
				return( false );
			}
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembPKey ) {
			YCFSecSecGrpMembPKey rhs = (YCFSecSecGrpMembPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembHBuff ) {
			YCFSecSecGrpMembHBuff rhs = (YCFSecSecGrpMembHBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			if( getRequiredSecGroupId() != rhs.getRequiredSecGroupId() ) {
				return( false );
			}
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembHPKey ) {
			YCFSecSecGrpMembHPKey rhs = (YCFSecSecGrpMembHPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembByClusterIdxKey ) {
			YCFSecSecGrpMembByClusterIdxKey rhs = (YCFSecSecGrpMembByClusterIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembByGroupIdxKey ) {
			YCFSecSecGrpMembByGroupIdxKey rhs = (YCFSecSecGrpMembByGroupIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGroupId() != rhs.getRequiredSecGroupId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembByUserIdxKey ) {
			YCFSecSecGrpMembByUserIdxKey rhs = (YCFSecSecGrpMembByUserIdxKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecGrpMembByUUserIdxKey ) {
			YCFSecSecGrpMembByUUserIdxKey rhs = (YCFSecSecGrpMembByUUserIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGroupId() != rhs.getRequiredSecGroupId() ) {
				return( false );
			}
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
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
		int hashCode = 0;
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + (int)( getRequiredClusterId() );
		hashCode = hashCode + (int)( getRequiredSecGrpMembId() );
		hashCode = hashCode + getRequiredSecGroupId();
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecSecGrpMembBuff ) {
			YCFSecSecGrpMembBuff rhs = (YCFSecSecGrpMembBuff)obj;
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
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			if( getRequiredSecGroupId() < rhs.getRequiredSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredSecGroupId() > rhs.getRequiredSecGroupId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembPKey ) {
			YCFSecSecGrpMembPKey rhs = (YCFSecSecGrpMembPKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembHPKey ) {
			YCFSecSecGrpMembHPKey rhs = (YCFSecSecGrpMembHPKey)obj;
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
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembHBuff ) {
			YCFSecSecGrpMembHBuff rhs = (YCFSecSecGrpMembHBuff)obj;
			int retval = 0;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			if( getRequiredSecGroupId() < rhs.getRequiredSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredSecGroupId() > rhs.getRequiredSecGroupId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembByClusterIdxKey ) {
			YCFSecSecGrpMembByClusterIdxKey rhs = (YCFSecSecGrpMembByClusterIdxKey)obj;

			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembByGroupIdxKey ) {
			YCFSecSecGrpMembByGroupIdxKey rhs = (YCFSecSecGrpMembByGroupIdxKey)obj;

			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGroupId() < rhs.getRequiredSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredSecGroupId() > rhs.getRequiredSecGroupId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembByUserIdxKey ) {
			YCFSecSecGrpMembByUserIdxKey rhs = (YCFSecSecGrpMembByUserIdxKey)obj;

			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecGrpMembByUUserIdxKey ) {
			YCFSecSecGrpMembByUUserIdxKey rhs = (YCFSecSecGrpMembByUUserIdxKey)obj;

			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGroupId() < rhs.getRequiredSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredSecGroupId() > rhs.getRequiredSecGroupId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
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

	public void set( YCFSecSecGrpMembBuff src ) {
		setSecGrpMembBuff( src );
	}

	public void setSecGrpMembBuff( YCFSecSecGrpMembBuff src ) {
		setRequiredClusterId( src.getRequiredClusterId() );
		setRequiredSecGrpMembId( src.getRequiredSecGrpMembId() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredSecGroupId( src.getRequiredSecGroupId() );
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( YCFSecSecGrpMembHBuff src ) {
		setSecGrpMembBuff( src );
	}

	public void setSecGrpMembBuff( YCFSecSecGrpMembHBuff src ) {
		setRequiredClusterId( src.getRequiredClusterId() );
		setRequiredSecGrpMembId( src.getRequiredSecGrpMembId() );
		setRequiredSecGroupId( src.getRequiredSecGroupId() );
		setRequiredSecUserId( src.getRequiredSecUserId() );
	}
}
