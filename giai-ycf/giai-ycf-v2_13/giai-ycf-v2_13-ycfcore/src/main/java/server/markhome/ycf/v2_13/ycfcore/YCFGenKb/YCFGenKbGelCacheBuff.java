// Description: Java 11 implementation of a GelCache buffer object.

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

public class YCFGenKbGelCacheBuff
{
	public final static String CLASS_CODE = "a915";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long GELCACHEID_INIT_VALUE = 0L;
	public static final String CACHENAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long GELCACHEID_MIN_VALUE = 0L;
	protected long requiredTenantId;
	protected long requiredGelCacheId;
	protected String requiredCacheName;
	protected int requiredRevision;
	public YCFGenKbGelCacheBuff() {
		requiredTenantId = YCFGenKbGelCacheBuff.TENANTID_INIT_VALUE;
		requiredGelCacheId = YCFGenKbGelCacheBuff.GELCACHEID_INIT_VALUE;
		requiredCacheName = new String( YCFGenKbGelCacheBuff.CACHENAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFGenKbGelCacheBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFGenKbGelCacheBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredGelCacheId() {
		return( requiredGelCacheId );
	}

	public void setRequiredGelCacheId( long value ) {
		if( value < YCFGenKbGelCacheBuff.GELCACHEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredGelCacheId",
				1,
				"value",
				value,
				YCFGenKbGelCacheBuff.GELCACHEID_MIN_VALUE );
		}
		requiredGelCacheId = value;
	}

	public String getRequiredCacheName() {
		return( requiredCacheName );
	}

	public void setRequiredCacheName( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredCacheName",
				1,
				"value" );
		}
		if( value.length() > 511 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredCacheName",
				1,
				"value.length()",
				value.length(),
				511 );
		}
		requiredCacheName = value;
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
		else if( obj instanceof YCFGenKbGelCacheBuff ) {
			YCFGenKbGelCacheBuff rhs = (YCFGenKbGelCacheBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( ! getRequiredCacheName().equals( rhs.getRequiredCacheName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelCachePKey ) {
			YCFGenKbGelCachePKey rhs = (YCFGenKbGelCachePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelCacheByTenantIdxKey ) {
			YCFGenKbGelCacheByTenantIdxKey rhs = (YCFGenKbGelCacheByTenantIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelCacheByAltIdxKey ) {
			YCFGenKbGelCacheByAltIdxKey rhs = (YCFGenKbGelCacheByAltIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( ! getRequiredCacheName().equals( rhs.getRequiredCacheName() ) ) {
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
		hashCode = hashCode + (int)( getRequiredTenantId() );
		hashCode = hashCode + (int)( getRequiredGelCacheId() );
		if( getRequiredCacheName() != null ) {
			hashCode = hashCode + getRequiredCacheName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFGenKbGelCacheBuff ) {
			YCFGenKbGelCacheBuff rhs = (YCFGenKbGelCacheBuff)obj;
			int retval = 0;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredGelCacheId() < rhs.getRequiredGelCacheId() ) {
				return( -1 );
			}
			else if( getRequiredGelCacheId() > rhs.getRequiredGelCacheId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredCacheName().compareTo( rhs.getRequiredCacheName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelCachePKey ) {
			YCFGenKbGelCachePKey rhs = (YCFGenKbGelCachePKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredGelCacheId() < rhs.getRequiredGelCacheId() ) {
				return( -1 );
			}
			else if( getRequiredGelCacheId() > rhs.getRequiredGelCacheId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelCacheByTenantIdxKey ) {
			YCFGenKbGelCacheByTenantIdxKey rhs = (YCFGenKbGelCacheByTenantIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelCacheByAltIdxKey ) {
			YCFGenKbGelCacheByAltIdxKey rhs = (YCFGenKbGelCacheByAltIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredCacheName().compareTo( rhs.getRequiredCacheName() );
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

	public void set( YCFGenKbGelCacheBuff src ) {
		setGelCacheBuff( src );
	}

	public void setGelCacheBuff( YCFGenKbGelCacheBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredGelCacheId( src.getRequiredGelCacheId() );
		setRequiredCacheName( src.getRequiredCacheName() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
