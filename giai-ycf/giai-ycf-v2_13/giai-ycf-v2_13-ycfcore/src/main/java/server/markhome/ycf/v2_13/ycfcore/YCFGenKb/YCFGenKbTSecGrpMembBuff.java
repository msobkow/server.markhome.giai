// Description: Java 11 implementation of a TSecGrpMemb buffer object.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

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

public class YCFGenKbTSecGrpMembBuff
{
	public final static String CLASS_CODE = "a913";
	public final static String S_INIT_CREATEDBY = "654dbba0-eda7-11e1-aff1-0800200c9a66";
	public final static UUID INIT_CREATEDBY = UUID.fromString( S_INIT_CREATEDBY );
	public final static String S_INIT_UPDATEDBY = "654dbba0-eda7-11e1-aff1-0800200c9a66";
	public final static UUID INIT_UPDATEDBY = UUID.fromString( S_INIT_UPDATEDBY );
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long TSECGRPMEMBID_INIT_VALUE = 0L;
	public static final int TSECGROUPID_INIT_VALUE = 0;
	public static final UUID SECUSERID_INIT_VALUE = UUID.fromString( "654dbba0-eda7-11e1-aff1-0800200c9a66" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long TSECGRPMEMBID_MIN_VALUE = 0L;
	public static final int TSECGROUPID_MIN_VALUE = 0;
	protected UUID createdByUserId = YCFGenKbTSecGrpMembBuff.INIT_CREATEDBY;
	protected Calendar createdAt = Calendar.getInstance();
	protected UUID updatedByUserId = YCFGenKbTSecGrpMembBuff.INIT_UPDATEDBY;
	protected Calendar updatedAt = Calendar.getInstance();
	protected long requiredTenantId;
	protected long requiredTSecGrpMembId;
	protected int requiredTSecGroupId;
	protected UUID requiredSecUserId;
	protected int requiredRevision;
	public YCFGenKbTSecGrpMembBuff() {
		requiredTenantId = YCFGenKbTSecGrpMembBuff.TENANTID_INIT_VALUE;
		requiredTSecGrpMembId = YCFGenKbTSecGrpMembBuff.TSECGRPMEMBID_INIT_VALUE;
		requiredTSecGroupId = YCFGenKbTSecGrpMembBuff.TSECGROUPID_INIT_VALUE;
		requiredSecUserId = UUID.fromString( YCFGenKbTSecGrpMembBuff.SECUSERID_INIT_VALUE.toString() );
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
		if( value < YCFGenKbTSecGrpMembBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFGenKbTSecGrpMembBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredTSecGrpMembId() {
		return( requiredTSecGrpMembId );
	}

	public void setRequiredTSecGrpMembId( long value ) {
		if( value < YCFGenKbTSecGrpMembBuff.TSECGRPMEMBID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTSecGrpMembId",
				1,
				"value",
				value,
				YCFGenKbTSecGrpMembBuff.TSECGRPMEMBID_MIN_VALUE );
		}
		requiredTSecGrpMembId = value;
	}

	public int getRequiredTSecGroupId() {
		return( requiredTSecGroupId );
	}

	public void setRequiredTSecGroupId( int value ) {
		if( value < YCFGenKbTSecGrpMembBuff.TSECGROUPID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTSecGroupId",
				1,
				"value",
				value,
				YCFGenKbTSecGrpMembBuff.TSECGROUPID_MIN_VALUE );
		}
		requiredTSecGroupId = value;
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
		else if( obj instanceof YCFGenKbTSecGrpMembBuff ) {
			YCFGenKbTSecGrpMembBuff rhs = (YCFGenKbTSecGrpMembBuff)obj;
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
			if( getRequiredTSecGrpMembId() != rhs.getRequiredTSecGrpMembId() ) {
				return( false );
			}
			if( getRequiredTSecGroupId() != rhs.getRequiredTSecGroupId() ) {
				return( false );
			}
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbTSecGrpMembPKey ) {
			YCFGenKbTSecGrpMembPKey rhs = (YCFGenKbTSecGrpMembPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpMembId() != rhs.getRequiredTSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbTSecGrpMembByTenantIdxKey ) {
			YCFGenKbTSecGrpMembByTenantIdxKey rhs = (YCFGenKbTSecGrpMembByTenantIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbTSecGrpMembByGroupIdxKey ) {
			YCFGenKbTSecGrpMembByGroupIdxKey rhs = (YCFGenKbTSecGrpMembByGroupIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGroupId() != rhs.getRequiredTSecGroupId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbTSecGrpMembByUserIdxKey ) {
			YCFGenKbTSecGrpMembByUserIdxKey rhs = (YCFGenKbTSecGrpMembByUserIdxKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbTSecGrpMembByUUserIdxKey ) {
			YCFGenKbTSecGrpMembByUUserIdxKey rhs = (YCFGenKbTSecGrpMembByUUserIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGroupId() != rhs.getRequiredTSecGroupId() ) {
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
		hashCode = hashCode + (int)( getRequiredTenantId() );
		hashCode = hashCode + (int)( getRequiredTSecGrpMembId() );
		hashCode = hashCode + getRequiredTSecGroupId();
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFGenKbTSecGrpMembBuff ) {
			YCFGenKbTSecGrpMembBuff rhs = (YCFGenKbTSecGrpMembBuff)obj;
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
			if( getRequiredTSecGrpMembId() < rhs.getRequiredTSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpMembId() > rhs.getRequiredTSecGrpMembId() ) {
				return( 1 );
			}
			if( getRequiredTSecGroupId() < rhs.getRequiredTSecGroupId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGroupId() > rhs.getRequiredTSecGroupId() ) {
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
		else if( obj instanceof YCFGenKbTSecGrpMembPKey ) {
			YCFGenKbTSecGrpMembPKey rhs = (YCFGenKbTSecGrpMembPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpMembId() < rhs.getRequiredTSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpMembId() > rhs.getRequiredTSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbTSecGrpMembByTenantIdxKey ) {
			YCFGenKbTSecGrpMembByTenantIdxKey rhs = (YCFGenKbTSecGrpMembByTenantIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbTSecGrpMembByGroupIdxKey ) {
			YCFGenKbTSecGrpMembByGroupIdxKey rhs = (YCFGenKbTSecGrpMembByGroupIdxKey)obj;

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
		else if( obj instanceof YCFGenKbTSecGrpMembByUserIdxKey ) {
			YCFGenKbTSecGrpMembByUserIdxKey rhs = (YCFGenKbTSecGrpMembByUserIdxKey)obj;

			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbTSecGrpMembByUUserIdxKey ) {
			YCFGenKbTSecGrpMembByUUserIdxKey rhs = (YCFGenKbTSecGrpMembByUUserIdxKey)obj;

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

	public void set( YCFGenKbTSecGrpMembBuff src ) {
		setTSecGrpMembBuff( src );
	}

	public void setTSecGrpMembBuff( YCFGenKbTSecGrpMembBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredTSecGrpMembId( src.getRequiredTSecGrpMembId() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredTSecGroupId( src.getRequiredTSecGroupId() );
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
