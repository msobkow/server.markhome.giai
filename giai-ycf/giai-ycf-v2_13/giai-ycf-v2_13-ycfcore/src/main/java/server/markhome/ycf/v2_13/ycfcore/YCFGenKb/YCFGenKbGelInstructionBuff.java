// Description: Java 11 implementation of a GelInstruction buffer object.

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

public class YCFGenKbGelInstructionBuff
{
	public final static String CLASS_CODE = "a916";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long GELCACHEID_INIT_VALUE = 0L;
	public static final long GELINSTID_INIT_VALUE = 0L;
	public static final long CHAININSTTENANTID_INIT_VALUE = 0L;
	public static final long CHAININSTGELCACHEID_INIT_VALUE = 0L;
	public static final long CHAININSTGELINSTID_INIT_VALUE = 0L;
	public static final String SOURCETEXT_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long GELCACHEID_MIN_VALUE = 0L;
	public static final long GELINSTID_MIN_VALUE = 0L;
	public static final long CHAININSTTENANTID_MIN_VALUE = 0L;
	public static final long CHAININSTGELCACHEID_MIN_VALUE = 0L;
	public static final long CHAININSTGELINSTID_MIN_VALUE = 0L;
	protected long requiredTenantId;
	protected long requiredGelCacheId;
	protected long requiredGelInstId;
	protected Long optionalChainInstTenantId;
	protected Long optionalChainInstGelCacheId;
	protected Long optionalChainInstGelInstId;
	protected String requiredSourceText;
	protected int requiredRevision;
	public YCFGenKbGelInstructionBuff() {
		requiredTenantId = YCFGenKbGelInstructionBuff.TENANTID_INIT_VALUE;
		requiredGelCacheId = YCFGenKbGelInstructionBuff.GELCACHEID_INIT_VALUE;
		requiredGelInstId = YCFGenKbGelInstructionBuff.GELINSTID_INIT_VALUE;
		optionalChainInstTenantId = null;
		optionalChainInstGelCacheId = null;
		optionalChainInstGelInstId = null;
		requiredSourceText = new String( YCFGenKbGelInstructionBuff.SOURCETEXT_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFGenKbGelInstructionBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFGenKbGelInstructionBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredGelCacheId() {
		return( requiredGelCacheId );
	}

	public void setRequiredGelCacheId( long value ) {
		if( value < YCFGenKbGelInstructionBuff.GELCACHEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredGelCacheId",
				1,
				"value",
				value,
				YCFGenKbGelInstructionBuff.GELCACHEID_MIN_VALUE );
		}
		requiredGelCacheId = value;
	}

	public long getRequiredGelInstId() {
		return( requiredGelInstId );
	}

	public void setRequiredGelInstId( long value ) {
		if( value < YCFGenKbGelInstructionBuff.GELINSTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredGelInstId",
				1,
				"value",
				value,
				YCFGenKbGelInstructionBuff.GELINSTID_MIN_VALUE );
		}
		requiredGelInstId = value;
	}

	public Long getOptionalChainInstTenantId() {
		return( optionalChainInstTenantId );
	}

	public void setOptionalChainInstTenantId( Long value ) {
		if( value == null ) {
			optionalChainInstTenantId = null;
		}
		else if( value < YCFGenKbGelInstructionBuff.CHAININSTTENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalChainInstTenantId",
				1,
				"value",
				value,
				YCFGenKbGelInstructionBuff.CHAININSTTENANTID_MIN_VALUE );
		}
		else {
			optionalChainInstTenantId = value;
		}
	}

	public Long getOptionalChainInstGelCacheId() {
		return( optionalChainInstGelCacheId );
	}

	public void setOptionalChainInstGelCacheId( Long value ) {
		if( value == null ) {
			optionalChainInstGelCacheId = null;
		}
		else if( value < YCFGenKbGelInstructionBuff.CHAININSTGELCACHEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalChainInstGelCacheId",
				1,
				"value",
				value,
				YCFGenKbGelInstructionBuff.CHAININSTGELCACHEID_MIN_VALUE );
		}
		else {
			optionalChainInstGelCacheId = value;
		}
	}

	public Long getOptionalChainInstGelInstId() {
		return( optionalChainInstGelInstId );
	}

	public void setOptionalChainInstGelInstId( Long value ) {
		if( value == null ) {
			optionalChainInstGelInstId = null;
		}
		else if( value < YCFGenKbGelInstructionBuff.CHAININSTGELINSTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalChainInstGelInstId",
				1,
				"value",
				value,
				YCFGenKbGelInstructionBuff.CHAININSTGELINSTID_MIN_VALUE );
		}
		else {
			optionalChainInstGelInstId = value;
		}
	}

	public String getRequiredSourceText() {
		return( requiredSourceText );
	}

	public void setRequiredSourceText( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredSourceText",
				1,
				"value" );
		}
		if( value.length() > 2000000 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredSourceText",
				1,
				"value.length()",
				value.length(),
				2000000 );
		}
		requiredSourceText = value;
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
		else if( obj instanceof YCFGenKbGelInstructionBuff ) {
			YCFGenKbGelInstructionBuff rhs = (YCFGenKbGelInstructionBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( getRequiredGelInstId() != rhs.getRequiredGelInstId() ) {
				return( false );
			}
			if( getOptionalChainInstTenantId() != null ) {
				if( rhs.getOptionalChainInstTenantId() != null ) {
					if( ! getOptionalChainInstTenantId().equals( rhs.getOptionalChainInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalChainInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalChainInstGelCacheId() != null ) {
				if( rhs.getOptionalChainInstGelCacheId() != null ) {
					if( ! getOptionalChainInstGelCacheId().equals( rhs.getOptionalChainInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalChainInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalChainInstGelInstId() != null ) {
				if( rhs.getOptionalChainInstGelInstId() != null ) {
					if( ! getOptionalChainInstGelInstId().equals( rhs.getOptionalChainInstGelInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalChainInstGelInstId() != null ) {
					return( false );
				}
			}
			if( ! getRequiredSourceText().equals( rhs.getRequiredSourceText() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelInstructionPKey ) {
			YCFGenKbGelInstructionPKey rhs = (YCFGenKbGelInstructionPKey)obj;
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
		else if( obj instanceof YCFGenKbGelInstructionByTenantIdxKey ) {
			YCFGenKbGelInstructionByTenantIdxKey rhs = (YCFGenKbGelInstructionByTenantIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelInstructionByGelCacheIdxKey ) {
			YCFGenKbGelInstructionByGelCacheIdxKey rhs = (YCFGenKbGelInstructionByGelCacheIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelInstructionByChainIdxKey ) {
			YCFGenKbGelInstructionByChainIdxKey rhs = (YCFGenKbGelInstructionByChainIdxKey)obj;
			if( getOptionalChainInstTenantId() != null ) {
				if( rhs.getOptionalChainInstTenantId() != null ) {
					if( ! getOptionalChainInstTenantId().equals( rhs.getOptionalChainInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalChainInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalChainInstGelCacheId() != null ) {
				if( rhs.getOptionalChainInstGelCacheId() != null ) {
					if( ! getOptionalChainInstGelCacheId().equals( rhs.getOptionalChainInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalChainInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalChainInstGelInstId() != null ) {
				if( rhs.getOptionalChainInstGelInstId() != null ) {
					if( ! getOptionalChainInstGelInstId().equals( rhs.getOptionalChainInstGelInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalChainInstGelInstId() != null ) {
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
		hashCode = hashCode + (int)( getRequiredTenantId() );
		hashCode = hashCode + (int)( getRequiredGelCacheId() );
		hashCode = hashCode + (int)( getRequiredGelInstId() );
		if( getOptionalChainInstTenantId() != null ) {
			hashCode = hashCode + getOptionalChainInstTenantId().hashCode();
		}
		if( getOptionalChainInstGelCacheId() != null ) {
			hashCode = hashCode + getOptionalChainInstGelCacheId().hashCode();
		}
		if( getOptionalChainInstGelInstId() != null ) {
			hashCode = hashCode + getOptionalChainInstGelInstId().hashCode();
		}
		if( getRequiredSourceText() != null ) {
			hashCode = hashCode + getRequiredSourceText().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFGenKbGelInstructionBuff ) {
			YCFGenKbGelInstructionBuff rhs = (YCFGenKbGelInstructionBuff)obj;
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
			if( getOptionalChainInstTenantId() != null ) {
				Long lhsChainInstTenantId = getOptionalChainInstTenantId();
				if( rhs.getOptionalChainInstTenantId() != null ) {
					Long rhsChainInstTenantId = rhs.getOptionalChainInstTenantId();
					int cmp = lhsChainInstTenantId.compareTo( rhsChainInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalChainInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalChainInstGelCacheId() != null ) {
				Long lhsChainInstGelCacheId = getOptionalChainInstGelCacheId();
				if( rhs.getOptionalChainInstGelCacheId() != null ) {
					Long rhsChainInstGelCacheId = rhs.getOptionalChainInstGelCacheId();
					int cmp = lhsChainInstGelCacheId.compareTo( rhsChainInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalChainInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalChainInstGelInstId() != null ) {
				Long lhsChainInstGelInstId = getOptionalChainInstGelInstId();
				if( rhs.getOptionalChainInstGelInstId() != null ) {
					Long rhsChainInstGelInstId = rhs.getOptionalChainInstGelInstId();
					int cmp = lhsChainInstGelInstId.compareTo( rhsChainInstGelInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalChainInstGelInstId() != null ) {
					return( -1 );
				}
			}
			{
				int cmp = getRequiredSourceText().compareTo( rhs.getRequiredSourceText() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelInstructionPKey ) {
			YCFGenKbGelInstructionPKey rhs = (YCFGenKbGelInstructionPKey)obj;
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
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelInstructionByTenantIdxKey ) {
			YCFGenKbGelInstructionByTenantIdxKey rhs = (YCFGenKbGelInstructionByTenantIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelInstructionByGelCacheIdxKey ) {
			YCFGenKbGelInstructionByGelCacheIdxKey rhs = (YCFGenKbGelInstructionByGelCacheIdxKey)obj;

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
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelInstructionByChainIdxKey ) {
			YCFGenKbGelInstructionByChainIdxKey rhs = (YCFGenKbGelInstructionByChainIdxKey)obj;

			if( getOptionalChainInstTenantId() != null ) {
				Long lhsChainInstTenantId = getOptionalChainInstTenantId();
				if( rhs.getOptionalChainInstTenantId() != null ) {
					Long rhsChainInstTenantId = rhs.getOptionalChainInstTenantId();
					int cmp = lhsChainInstTenantId.compareTo( rhsChainInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalChainInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalChainInstGelCacheId() != null ) {
				Long lhsChainInstGelCacheId = getOptionalChainInstGelCacheId();
				if( rhs.getOptionalChainInstGelCacheId() != null ) {
					Long rhsChainInstGelCacheId = rhs.getOptionalChainInstGelCacheId();
					int cmp = lhsChainInstGelCacheId.compareTo( rhsChainInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalChainInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalChainInstGelInstId() != null ) {
				Long lhsChainInstGelInstId = getOptionalChainInstGelInstId();
				if( rhs.getOptionalChainInstGelInstId() != null ) {
					Long rhsChainInstGelInstId = rhs.getOptionalChainInstGelInstId();
					int cmp = lhsChainInstGelInstId.compareTo( rhsChainInstGelInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalChainInstGelInstId() != null ) {
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

	public void set( YCFGenKbGelInstructionBuff src ) {
		setGelInstructionBuff( src );
	}

	public void setGelInstructionBuff( YCFGenKbGelInstructionBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredGelCacheId( src.getRequiredGelCacheId() );
		setRequiredGelInstId( src.getRequiredGelInstId() );
		setOptionalChainInstTenantId( src.getOptionalChainInstTenantId() );
		setOptionalChainInstGelCacheId( src.getOptionalChainInstGelCacheId() );
		setOptionalChainInstGelInstId( src.getOptionalChainInstGelInstId() );
		setRequiredSourceText( src.getRequiredSourceText() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
