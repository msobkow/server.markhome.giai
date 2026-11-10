// Description: Java 11 implementation of a GelInstruction primary key object.

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
import org.apache.commons.codec.binary.Base64;

/*
 *	YCFGenKbGelInstructionPKey Primary Key for GelInstruction

 *		classCode	Required class code.
 *		requiredTenantId	Required object attribute TenantId.
 *		requiredGelCacheId	Required object attribute GelCacheId.
 *		requiredGelInstId	Required object attribute GelInstId. */
public class YCFGenKbGelInstructionPKey
	implements Comparable<Object>,
		Serializable
{
	protected String classCode;

	protected long requiredTenantId;
	protected long requiredGelCacheId;
	protected long requiredGelInstId;
	public YCFGenKbGelInstructionPKey() {
		requiredTenantId = YCFGenKbGelInstructionBuff.TENANTID_INIT_VALUE;
		requiredGelCacheId = YCFGenKbGelInstructionBuff.GELCACHEID_INIT_VALUE;
		requiredGelInstId = YCFGenKbGelInstructionBuff.GELINSTID_INIT_VALUE;
	}

	public String getClassCode() {
		return( classCode );
	}

	public void setClassCode( String value ) {
		classCode = value;
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

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
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
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
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
		else if( obj instanceof YCFGenKbGelInstructionBuff ) {
			YCFGenKbGelInstructionBuff rhs = (YCFGenKbGelInstructionBuff)obj;
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
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff" );
		}
	}

	public String toString() {
		String ret = "<YCFGenKbGelInstructionPKey"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredGelCacheId=" + "\"" + Long.toString( getRequiredGelCacheId() ) + "\""
			+ " RequiredGelInstId=" + "\"" + Long.toString( getRequiredGelInstId() ) + "\""
			+ "/>";
		return( ret );
	}
}
