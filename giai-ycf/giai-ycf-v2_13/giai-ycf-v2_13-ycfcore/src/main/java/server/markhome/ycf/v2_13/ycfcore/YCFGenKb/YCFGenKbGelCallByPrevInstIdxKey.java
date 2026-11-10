// Description: Java 11 implementation of a GelCall by PrevInstIdx index key object.

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

public class YCFGenKbGelCallByPrevInstIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalPrevInstTenantId;
	protected Long optionalPrevInstGelCacheId;
	protected Long optionalPrevInstGelInstId;
	public YCFGenKbGelCallByPrevInstIdxKey() {
		optionalPrevInstTenantId = null;
		optionalPrevInstGelCacheId = null;
		optionalPrevInstGelInstId = null;
	}

	public Long getOptionalPrevInstTenantId() {
		return( optionalPrevInstTenantId );
	}

	public void setOptionalPrevInstTenantId( Long value ) {
		if( value == null ) {
			optionalPrevInstTenantId = null;
		}
		else if( value < YCFGenKbGelCallBuff.PREVINSTTENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalPrevInstTenantId",
				1,
				"value",
				value,
				YCFGenKbGelCallBuff.PREVINSTTENANTID_MIN_VALUE );
		}
		else {
			optionalPrevInstTenantId = value;
		}
	}

	public Long getOptionalPrevInstGelCacheId() {
		return( optionalPrevInstGelCacheId );
	}

	public void setOptionalPrevInstGelCacheId( Long value ) {
		if( value == null ) {
			optionalPrevInstGelCacheId = null;
		}
		else if( value < YCFGenKbGelCallBuff.PREVINSTGELCACHEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalPrevInstGelCacheId",
				1,
				"value",
				value,
				YCFGenKbGelCallBuff.PREVINSTGELCACHEID_MIN_VALUE );
		}
		else {
			optionalPrevInstGelCacheId = value;
		}
	}

	public Long getOptionalPrevInstGelInstId() {
		return( optionalPrevInstGelInstId );
	}

	public void setOptionalPrevInstGelInstId( Long value ) {
		if( value == null ) {
			optionalPrevInstGelInstId = null;
		}
		else if( value < YCFGenKbGelCallBuff.PREVINSTGELINSTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalPrevInstGelInstId",
				1,
				"value",
				value,
				YCFGenKbGelCallBuff.PREVINSTGELINSTID_MIN_VALUE );
		}
		else {
			optionalPrevInstGelInstId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbGelCallByPrevInstIdxKey ) {
			YCFGenKbGelCallByPrevInstIdxKey rhs = (YCFGenKbGelCallByPrevInstIdxKey)obj;
			if( getOptionalPrevInstTenantId() != null ) {
				if( rhs.getOptionalPrevInstTenantId() != null ) {
					if( ! getOptionalPrevInstTenantId().equals( rhs.getOptionalPrevInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevInstGelCacheId() != null ) {
				if( rhs.getOptionalPrevInstGelCacheId() != null ) {
					if( ! getOptionalPrevInstGelCacheId().equals( rhs.getOptionalPrevInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevInstGelInstId() != null ) {
				if( rhs.getOptionalPrevInstGelInstId() != null ) {
					if( ! getOptionalPrevInstGelInstId().equals( rhs.getOptionalPrevInstGelInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevInstGelInstId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGelCallBuff ) {
			YCFGenKbGelCallBuff rhs = (YCFGenKbGelCallBuff)obj;
			if( getOptionalPrevInstTenantId() != null ) {
				if( rhs.getOptionalPrevInstTenantId() != null ) {
					if( ! getOptionalPrevInstTenantId().equals( rhs.getOptionalPrevInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevInstGelCacheId() != null ) {
				if( rhs.getOptionalPrevInstGelCacheId() != null ) {
					if( ! getOptionalPrevInstGelCacheId().equals( rhs.getOptionalPrevInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevInstGelInstId() != null ) {
				if( rhs.getOptionalPrevInstGelInstId() != null ) {
					if( ! getOptionalPrevInstGelInstId().equals( rhs.getOptionalPrevInstGelInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPrevInstGelInstId() != null ) {
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
		if( getOptionalPrevInstTenantId() != null ) {
			hashCode = hashCode + getOptionalPrevInstTenantId().hashCode();
		}
		if( getOptionalPrevInstGelCacheId() != null ) {
			hashCode = hashCode + getOptionalPrevInstGelCacheId().hashCode();
		}
		if( getOptionalPrevInstGelInstId() != null ) {
			hashCode = hashCode + getOptionalPrevInstGelInstId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFGenKbGelCallByPrevInstIdxKey ) {
			YCFGenKbGelCallByPrevInstIdxKey rhs = (YCFGenKbGelCallByPrevInstIdxKey)obj;
			if( getOptionalPrevInstTenantId() != null ) {
				Long lhsPrevInstTenantId = getOptionalPrevInstTenantId();
				if( rhs.getOptionalPrevInstTenantId() != null ) {
					Long rhsPrevInstTenantId = rhs.getOptionalPrevInstTenantId();
					int cmp = lhsPrevInstTenantId.compareTo( rhsPrevInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalPrevInstGelCacheId() != null ) {
				Long lhsPrevInstGelCacheId = getOptionalPrevInstGelCacheId();
				if( rhs.getOptionalPrevInstGelCacheId() != null ) {
					Long rhsPrevInstGelCacheId = rhs.getOptionalPrevInstGelCacheId();
					int cmp = lhsPrevInstGelCacheId.compareTo( rhsPrevInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalPrevInstGelInstId() != null ) {
				Long lhsPrevInstGelInstId = getOptionalPrevInstGelInstId();
				if( rhs.getOptionalPrevInstGelInstId() != null ) {
					Long rhsPrevInstGelInstId = rhs.getOptionalPrevInstGelInstId();
					int cmp = lhsPrevInstGelInstId.compareTo( rhsPrevInstGelInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevInstGelInstId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGelCallBuff ) {
			YCFGenKbGelCallBuff rhs = (YCFGenKbGelCallBuff)obj;
			if( getOptionalPrevInstTenantId() != null ) {
				Long lhsPrevInstTenantId = getOptionalPrevInstTenantId();
				if( rhs.getOptionalPrevInstTenantId() != null ) {
					Long rhsPrevInstTenantId = rhs.getOptionalPrevInstTenantId();
					int cmp = lhsPrevInstTenantId.compareTo( rhsPrevInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalPrevInstGelCacheId() != null ) {
				Long lhsPrevInstGelCacheId = getOptionalPrevInstGelCacheId();
				if( rhs.getOptionalPrevInstGelCacheId() != null ) {
					Long rhsPrevInstGelCacheId = rhs.getOptionalPrevInstGelCacheId();
					int cmp = lhsPrevInstGelCacheId.compareTo( rhsPrevInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalPrevInstGelInstId() != null ) {
				Long lhsPrevInstGelInstId = getOptionalPrevInstGelInstId();
				if( rhs.getOptionalPrevInstGelInstId() != null ) {
					Long rhsPrevInstGelInstId = rhs.getOptionalPrevInstGelInstId();
					int cmp = lhsPrevInstGelInstId.compareTo( rhsPrevInstGelInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevInstGelInstId() != null ) {
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
		String ret = "<YCFGenKbGelCallByPrevInstIdx"
			+ " OptionalPrevInstTenantId=" + ( ( getOptionalPrevInstTenantId() == null ) ? "null" : "\"" + getOptionalPrevInstTenantId().toString() + "\"" )
			+ " OptionalPrevInstGelCacheId=" + ( ( getOptionalPrevInstGelCacheId() == null ) ? "null" : "\"" + getOptionalPrevInstGelCacheId().toString() + "\"" )
			+ " OptionalPrevInstGelInstId=" + ( ( getOptionalPrevInstGelInstId() == null ) ? "null" : "\"" + getOptionalPrevInstGelInstId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
