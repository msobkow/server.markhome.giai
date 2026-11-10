// Description: Java 11 implementation of a GelCall by SeqIdx index key object.

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

public class YCFGenKbGelCallBySeqIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalSeqInstTenantId;
	protected Long optionalSeqInstGelCacheId;
	protected Long optionalSeqInstId;
	public YCFGenKbGelCallBySeqIdxKey() {
		optionalSeqInstTenantId = null;
		optionalSeqInstGelCacheId = null;
		optionalSeqInstId = null;
	}

	public Long getOptionalSeqInstTenantId() {
		return( optionalSeqInstTenantId );
	}

	public void setOptionalSeqInstTenantId( Long value ) {
		if( value == null ) {
			optionalSeqInstTenantId = null;
		}
		else if( value < YCFGenKbGelCallBuff.SEQINSTTENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalSeqInstTenantId",
				1,
				"value",
				value,
				YCFGenKbGelCallBuff.SEQINSTTENANTID_MIN_VALUE );
		}
		else {
			optionalSeqInstTenantId = value;
		}
	}

	public Long getOptionalSeqInstGelCacheId() {
		return( optionalSeqInstGelCacheId );
	}

	public void setOptionalSeqInstGelCacheId( Long value ) {
		if( value == null ) {
			optionalSeqInstGelCacheId = null;
		}
		else if( value < YCFGenKbGelCallBuff.SEQINSTGELCACHEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalSeqInstGelCacheId",
				1,
				"value",
				value,
				YCFGenKbGelCallBuff.SEQINSTGELCACHEID_MIN_VALUE );
		}
		else {
			optionalSeqInstGelCacheId = value;
		}
	}

	public Long getOptionalSeqInstId() {
		return( optionalSeqInstId );
	}

	public void setOptionalSeqInstId( Long value ) {
		if( value == null ) {
			optionalSeqInstId = null;
		}
		else if( value < YCFGenKbGelCallBuff.SEQINSTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalSeqInstId",
				1,
				"value",
				value,
				YCFGenKbGelCallBuff.SEQINSTID_MIN_VALUE );
		}
		else {
			optionalSeqInstId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbGelCallBySeqIdxKey ) {
			YCFGenKbGelCallBySeqIdxKey rhs = (YCFGenKbGelCallBySeqIdxKey)obj;
			if( getOptionalSeqInstTenantId() != null ) {
				if( rhs.getOptionalSeqInstTenantId() != null ) {
					if( ! getOptionalSeqInstTenantId().equals( rhs.getOptionalSeqInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSeqInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalSeqInstGelCacheId() != null ) {
				if( rhs.getOptionalSeqInstGelCacheId() != null ) {
					if( ! getOptionalSeqInstGelCacheId().equals( rhs.getOptionalSeqInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSeqInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalSeqInstId() != null ) {
				if( rhs.getOptionalSeqInstId() != null ) {
					if( ! getOptionalSeqInstId().equals( rhs.getOptionalSeqInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSeqInstId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelCallBuff ) {
			YCFGenKbGelCallBuff rhs = (YCFGenKbGelCallBuff)obj;
			if( getOptionalSeqInstTenantId() != null ) {
				if( rhs.getOptionalSeqInstTenantId() != null ) {
					if( ! getOptionalSeqInstTenantId().equals( rhs.getOptionalSeqInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSeqInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalSeqInstGelCacheId() != null ) {
				if( rhs.getOptionalSeqInstGelCacheId() != null ) {
					if( ! getOptionalSeqInstGelCacheId().equals( rhs.getOptionalSeqInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSeqInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalSeqInstId() != null ) {
				if( rhs.getOptionalSeqInstId() != null ) {
					if( ! getOptionalSeqInstId().equals( rhs.getOptionalSeqInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSeqInstId() != null ) {
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
		if( getOptionalSeqInstTenantId() != null ) {
			hashCode = hashCode + getOptionalSeqInstTenantId().hashCode();
		}
		if( getOptionalSeqInstGelCacheId() != null ) {
			hashCode = hashCode + getOptionalSeqInstGelCacheId().hashCode();
		}
		if( getOptionalSeqInstId() != null ) {
			hashCode = hashCode + getOptionalSeqInstId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFGenKbGelCallBySeqIdxKey ) {
			YCFGenKbGelCallBySeqIdxKey rhs = (YCFGenKbGelCallBySeqIdxKey)obj;
			if( getOptionalSeqInstTenantId() != null ) {
				Long lhsSeqInstTenantId = getOptionalSeqInstTenantId();
				if( rhs.getOptionalSeqInstTenantId() != null ) {
					Long rhsSeqInstTenantId = rhs.getOptionalSeqInstTenantId();
					int cmp = lhsSeqInstTenantId.compareTo( rhsSeqInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSeqInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSeqInstGelCacheId() != null ) {
				Long lhsSeqInstGelCacheId = getOptionalSeqInstGelCacheId();
				if( rhs.getOptionalSeqInstGelCacheId() != null ) {
					Long rhsSeqInstGelCacheId = rhs.getOptionalSeqInstGelCacheId();
					int cmp = lhsSeqInstGelCacheId.compareTo( rhsSeqInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSeqInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSeqInstId() != null ) {
				Long lhsSeqInstId = getOptionalSeqInstId();
				if( rhs.getOptionalSeqInstId() != null ) {
					Long rhsSeqInstId = rhs.getOptionalSeqInstId();
					int cmp = lhsSeqInstId.compareTo( rhsSeqInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSeqInstId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelCallBuff ) {
			YCFGenKbGelCallBuff rhs = (YCFGenKbGelCallBuff)obj;
			if( getOptionalSeqInstTenantId() != null ) {
				Long lhsSeqInstTenantId = getOptionalSeqInstTenantId();
				if( rhs.getOptionalSeqInstTenantId() != null ) {
					Long rhsSeqInstTenantId = rhs.getOptionalSeqInstTenantId();
					int cmp = lhsSeqInstTenantId.compareTo( rhsSeqInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSeqInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSeqInstGelCacheId() != null ) {
				Long lhsSeqInstGelCacheId = getOptionalSeqInstGelCacheId();
				if( rhs.getOptionalSeqInstGelCacheId() != null ) {
					Long rhsSeqInstGelCacheId = rhs.getOptionalSeqInstGelCacheId();
					int cmp = lhsSeqInstGelCacheId.compareTo( rhsSeqInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSeqInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSeqInstId() != null ) {
				Long lhsSeqInstId = getOptionalSeqInstId();
				if( rhs.getOptionalSeqInstId() != null ) {
					Long rhsSeqInstId = rhs.getOptionalSeqInstId();
					int cmp = lhsSeqInstId.compareTo( rhsSeqInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSeqInstId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<YCFGenKbGelCallBySeqIdx"
			+ " OptionalSeqInstTenantId=" + ( ( getOptionalSeqInstTenantId() == null ) ? "null" : "\"" + getOptionalSeqInstTenantId().toString() + "\"" )
			+ " OptionalSeqInstGelCacheId=" + ( ( getOptionalSeqInstGelCacheId() == null ) ? "null" : "\"" + getOptionalSeqInstGelCacheId().toString() + "\"" )
			+ " OptionalSeqInstId=" + ( ( getOptionalSeqInstId() == null ) ? "null" : "\"" + getOptionalSeqInstId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
