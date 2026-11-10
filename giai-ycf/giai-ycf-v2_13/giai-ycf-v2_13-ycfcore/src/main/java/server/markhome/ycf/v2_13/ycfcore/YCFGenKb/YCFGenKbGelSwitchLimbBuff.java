// Description: Java 11 implementation of a GelSwitchLimb buffer object.

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

public class YCFGenKbGelSwitchLimbBuff
{
	public final static String CLASS_CODE = "a91f";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long GELCACHEID_INIT_VALUE = 0L;
	public static final long GELINSTID_INIT_VALUE = 0L;
	public static final String LIMBNAME_INIT_VALUE = new String( "" );
	public static final String LIMBEXPANSION_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long GELCACHEID_MIN_VALUE = 0L;
	public static final long GELINSTID_MIN_VALUE = 0L;
	protected long requiredTenantId;
	protected long requiredGelCacheId;
	protected long requiredGelInstId;
	protected String requiredLimbName;
	protected String requiredLimbExpansion;
	protected int requiredRevision;
	public YCFGenKbGelSwitchLimbBuff() {
		requiredTenantId = YCFGenKbGelSwitchLimbBuff.TENANTID_INIT_VALUE;
		requiredGelCacheId = YCFGenKbGelSwitchLimbBuff.GELCACHEID_INIT_VALUE;
		requiredGelInstId = YCFGenKbGelSwitchLimbBuff.GELINSTID_INIT_VALUE;
		requiredLimbName = new String( YCFGenKbGelSwitchLimbBuff.LIMBNAME_INIT_VALUE );
		requiredLimbExpansion = new String( YCFGenKbGelSwitchLimbBuff.LIMBEXPANSION_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFGenKbGelSwitchLimbBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFGenKbGelSwitchLimbBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredGelCacheId() {
		return( requiredGelCacheId );
	}

	public void setRequiredGelCacheId( long value ) {
		if( value < YCFGenKbGelSwitchLimbBuff.GELCACHEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredGelCacheId",
				1,
				"value",
				value,
				YCFGenKbGelSwitchLimbBuff.GELCACHEID_MIN_VALUE );
		}
		requiredGelCacheId = value;
	}

	public long getRequiredGelInstId() {
		return( requiredGelInstId );
	}

	public void setRequiredGelInstId( long value ) {
		if( value < YCFGenKbGelSwitchLimbBuff.GELINSTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredGelInstId",
				1,
				"value",
				value,
				YCFGenKbGelSwitchLimbBuff.GELINSTID_MIN_VALUE );
		}
		requiredGelInstId = value;
	}

	public String getRequiredLimbName() {
		return( requiredLimbName );
	}

	public void setRequiredLimbName( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredLimbName",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredLimbName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredLimbName = value;
	}

	public String getRequiredLimbExpansion() {
		return( requiredLimbExpansion );
	}

	public void setRequiredLimbExpansion( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredLimbExpansion",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredLimbExpansion",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredLimbExpansion = value;
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
		else if( obj instanceof YCFGenKbGelSwitchLimbBuff ) {
			YCFGenKbGelSwitchLimbBuff rhs = (YCFGenKbGelSwitchLimbBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( getRequiredGelInstId() != rhs.getRequiredGelInstId() ) {
				return( false );
			}
			if( ! getRequiredLimbName().equals( rhs.getRequiredLimbName() ) ) {
				return( false );
			}
			if( ! getRequiredLimbExpansion().equals( rhs.getRequiredLimbExpansion() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelSwitchLimbPKey ) {
			YCFGenKbGelSwitchLimbPKey rhs = (YCFGenKbGelSwitchLimbPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( getRequiredGelInstId() != rhs.getRequiredGelInstId() ) {
				return( false );
			}
			if( ! getRequiredLimbName().equals( rhs.getRequiredLimbName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelSwitchLimbByTenantIdxKey ) {
			YCFGenKbGelSwitchLimbByTenantIdxKey rhs = (YCFGenKbGelSwitchLimbByTenantIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelSwitchLimbBySwitchIdxKey ) {
			YCFGenKbGelSwitchLimbBySwitchIdxKey rhs = (YCFGenKbGelSwitchLimbBySwitchIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( getRequiredGelInstId() != rhs.getRequiredGelInstId() ) {
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
		hashCode = hashCode + (int)( getRequiredGelInstId() );
		if( getRequiredLimbName() != null ) {
			hashCode = hashCode + getRequiredLimbName().hashCode();
		}
		if( getRequiredLimbExpansion() != null ) {
			hashCode = hashCode + getRequiredLimbExpansion().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFGenKbGelSwitchLimbBuff ) {
			YCFGenKbGelSwitchLimbBuff rhs = (YCFGenKbGelSwitchLimbBuff)obj;
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
			if( getRequiredGelInstId() < rhs.getRequiredGelInstId() ) {
				return( -1 );
			}
			else if( getRequiredGelInstId() > rhs.getRequiredGelInstId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredLimbName().compareTo( rhs.getRequiredLimbName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredLimbExpansion().compareTo( rhs.getRequiredLimbExpansion() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelSwitchLimbPKey ) {
			YCFGenKbGelSwitchLimbPKey rhs = (YCFGenKbGelSwitchLimbPKey)obj;
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
			if( getRequiredGelInstId() < rhs.getRequiredGelInstId() ) {
				return( -1 );
			}
			else if( getRequiredGelInstId() > rhs.getRequiredGelInstId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredLimbName().compareTo( rhs.getRequiredLimbName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelSwitchLimbByTenantIdxKey ) {
			YCFGenKbGelSwitchLimbByTenantIdxKey rhs = (YCFGenKbGelSwitchLimbByTenantIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelSwitchLimbBySwitchIdxKey ) {
			YCFGenKbGelSwitchLimbBySwitchIdxKey rhs = (YCFGenKbGelSwitchLimbBySwitchIdxKey)obj;

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
			if( getRequiredGelInstId() < rhs.getRequiredGelInstId() ) {
				return( -1 );
			}
			else if( getRequiredGelInstId() > rhs.getRequiredGelInstId() ) {
				return( 1 );
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

	public void set( YCFGenKbGelSwitchLimbBuff src ) {
		setGelSwitchLimbBuff( src );
	}

	public void setGelSwitchLimbBuff( YCFGenKbGelSwitchLimbBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredGelCacheId( src.getRequiredGelCacheId() );
		setRequiredGelInstId( src.getRequiredGelInstId() );
		setRequiredLimbName( src.getRequiredLimbName() );
		setRequiredLimbExpansion( src.getRequiredLimbExpansion() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
