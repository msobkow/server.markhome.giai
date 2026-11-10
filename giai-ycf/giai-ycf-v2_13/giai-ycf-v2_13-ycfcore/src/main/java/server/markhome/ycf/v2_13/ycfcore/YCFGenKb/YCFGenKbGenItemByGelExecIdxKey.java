// Description: Java 11 implementation of a GenItem by GelExecIdx index key object.

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

public class YCFGenKbGenItemByGelExecIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalGelExecutableTenantId;
	protected Long optionalGelExecutableGelCacheId;
	protected Long optionalGelExecutableId;
	public YCFGenKbGenItemByGelExecIdxKey() {
		optionalGelExecutableTenantId = null;
		optionalGelExecutableGelCacheId = null;
		optionalGelExecutableId = null;
	}

	public Long getOptionalGelExecutableTenantId() {
		return( optionalGelExecutableTenantId );
	}

	public void setOptionalGelExecutableTenantId( Long value ) {
		if( value == null ) {
			optionalGelExecutableTenantId = null;
		}
		else if( value < YCFGenKbGenItemBuff.GELEXECUTABLETENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalGelExecutableTenantId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GELEXECUTABLETENANTID_MIN_VALUE );
		}
		else {
			optionalGelExecutableTenantId = value;
		}
	}

	public Long getOptionalGelExecutableGelCacheId() {
		return( optionalGelExecutableGelCacheId );
	}

	public void setOptionalGelExecutableGelCacheId( Long value ) {
		if( value == null ) {
			optionalGelExecutableGelCacheId = null;
		}
		else if( value < YCFGenKbGenItemBuff.GELEXECUTABLEGELCACHEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalGelExecutableGelCacheId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GELEXECUTABLEGELCACHEID_MIN_VALUE );
		}
		else {
			optionalGelExecutableGelCacheId = value;
		}
	}

	public Long getOptionalGelExecutableId() {
		return( optionalGelExecutableId );
	}

	public void setOptionalGelExecutableId( Long value ) {
		if( value == null ) {
			optionalGelExecutableId = null;
		}
		else if( value < YCFGenKbGenItemBuff.GELEXECUTABLEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalGelExecutableId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.GELEXECUTABLEID_MIN_VALUE );
		}
		else {
			optionalGelExecutableId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbGenItemByGelExecIdxKey ) {
			YCFGenKbGenItemByGelExecIdxKey rhs = (YCFGenKbGenItemByGelExecIdxKey)obj;
			if( getOptionalGelExecutableTenantId() != null ) {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					if( ! getOptionalGelExecutableTenantId().equals( rhs.getOptionalGelExecutableTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					if( ! getOptionalGelExecutableGelCacheId().equals( rhs.getOptionalGelExecutableGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				if( rhs.getOptionalGelExecutableId() != null ) {
					if( ! getOptionalGelExecutableId().equals( rhs.getOptionalGelExecutableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			if( getOptionalGelExecutableTenantId() != null ) {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					if( ! getOptionalGelExecutableTenantId().equals( rhs.getOptionalGelExecutableTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					if( ! getOptionalGelExecutableGelCacheId().equals( rhs.getOptionalGelExecutableGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				if( rhs.getOptionalGelExecutableId() != null ) {
					if( ! getOptionalGelExecutableId().equals( rhs.getOptionalGelExecutableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
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
		if( getOptionalGelExecutableTenantId() != null ) {
			hashCode = hashCode + getOptionalGelExecutableTenantId().hashCode();
		}
		if( getOptionalGelExecutableGelCacheId() != null ) {
			hashCode = hashCode + getOptionalGelExecutableGelCacheId().hashCode();
		}
		if( getOptionalGelExecutableId() != null ) {
			hashCode = hashCode + getOptionalGelExecutableId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFGenKbGenItemByGelExecIdxKey ) {
			YCFGenKbGenItemByGelExecIdxKey rhs = (YCFGenKbGenItemByGelExecIdxKey)obj;
			if( getOptionalGelExecutableTenantId() != null ) {
				Long lhsGelExecutableTenantId = getOptionalGelExecutableTenantId();
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					Long rhsGelExecutableTenantId = rhs.getOptionalGelExecutableTenantId();
					int cmp = lhsGelExecutableTenantId.compareTo( rhsGelExecutableTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				Long lhsGelExecutableGelCacheId = getOptionalGelExecutableGelCacheId();
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					Long rhsGelExecutableGelCacheId = rhs.getOptionalGelExecutableGelCacheId();
					int cmp = lhsGelExecutableGelCacheId.compareTo( rhsGelExecutableGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				Long lhsGelExecutableId = getOptionalGelExecutableId();
				if( rhs.getOptionalGelExecutableId() != null ) {
					Long rhsGelExecutableId = rhs.getOptionalGelExecutableId();
					int cmp = lhsGelExecutableId.compareTo( rhsGelExecutableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			if( getOptionalGelExecutableTenantId() != null ) {
				Long lhsGelExecutableTenantId = getOptionalGelExecutableTenantId();
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					Long rhsGelExecutableTenantId = rhs.getOptionalGelExecutableTenantId();
					int cmp = lhsGelExecutableTenantId.compareTo( rhsGelExecutableTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				Long lhsGelExecutableGelCacheId = getOptionalGelExecutableGelCacheId();
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					Long rhsGelExecutableGelCacheId = rhs.getOptionalGelExecutableGelCacheId();
					int cmp = lhsGelExecutableGelCacheId.compareTo( rhsGelExecutableGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				Long lhsGelExecutableId = getOptionalGelExecutableId();
				if( rhs.getOptionalGelExecutableId() != null ) {
					Long rhsGelExecutableId = rhs.getOptionalGelExecutableId();
					int cmp = lhsGelExecutableId.compareTo( rhsGelExecutableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
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
		String ret = "<YCFGenKbGenItemByGelExecIdx"
			+ " OptionalGelExecutableTenantId=" + ( ( getOptionalGelExecutableTenantId() == null ) ? "null" : "\"" + getOptionalGelExecutableTenantId().toString() + "\"" )
			+ " OptionalGelExecutableGelCacheId=" + ( ( getOptionalGelExecutableGelCacheId() == null ) ? "null" : "\"" + getOptionalGelExecutableGelCacheId().toString() + "\"" )
			+ " OptionalGelExecutableId=" + ( ( getOptionalGelExecutableId() == null ) ? "null" : "\"" + getOptionalGelExecutableId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
