// Description: Java 11 implementation of a GenItem primary key object.

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
 *	YCFGenKbGenItemPKey Primary Key for GenItem

 *		classCode	Required class code.
 *		requiredTenantId	Required object attribute TenantId.
 *		requiredCartridgeId	Required object attribute CartridgeId.
 *		requiredItemId	Required object attribute ItemId. */
public class YCFGenKbGenItemPKey
	implements Comparable<Object>,
		Serializable
{
	protected String classCode;

	protected long requiredTenantId;
	protected long requiredCartridgeId;
	protected long requiredItemId;
	public YCFGenKbGenItemPKey() {
		requiredTenantId = YCFGenKbGenItemBuff.TENANTID_INIT_VALUE;
		requiredCartridgeId = YCFGenKbGenItemBuff.CARTRIDGEID_INIT_VALUE;
		requiredItemId = YCFGenKbGenItemBuff.ITEMID_INIT_VALUE;
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
		if( value < YCFGenKbGenItemBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredCartridgeId() {
		return( requiredCartridgeId );
	}

	public void setRequiredCartridgeId( long value ) {
		if( value < YCFGenKbGenItemBuff.CARTRIDGEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredCartridgeId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.CARTRIDGEID_MIN_VALUE );
		}
		requiredCartridgeId = value;
	}

	public long getRequiredItemId() {
		return( requiredItemId );
	}

	public void setRequiredItemId( long value ) {
		if( value < YCFGenKbGenItemBuff.ITEMID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredItemId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.ITEMID_MIN_VALUE );
		}
		if( value > YCFGenKbGenItemBuff.ITEMID_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredItemId",
				1,
				"value",
				value,
				YCFGenKbGenItemBuff.ITEMID_MAX_VALUE );
		}
		requiredItemId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbGenItemPKey ) {
			YCFGenKbGenItemPKey rhs = (YCFGenKbGenItemPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredCartridgeId() != rhs.getRequiredCartridgeId() ) {
				return( false );
			}
			if( getRequiredItemId() != rhs.getRequiredItemId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredCartridgeId() != rhs.getRequiredCartridgeId() ) {
				return( false );
			}
			if( getRequiredItemId() != rhs.getRequiredItemId() ) {
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
		hashCode = hashCode + (int)( getRequiredCartridgeId() );
		hashCode = hashCode + (int)( getRequiredItemId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFGenKbGenItemPKey ) {
			YCFGenKbGenItemPKey rhs = (YCFGenKbGenItemPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredCartridgeId() < rhs.getRequiredCartridgeId() ) {
				return( -1 );
			}
			else if( getRequiredCartridgeId() > rhs.getRequiredCartridgeId() ) {
				return( 1 );
			}
			if( getRequiredItemId() < rhs.getRequiredItemId() ) {
				return( -1 );
			}
			else if( getRequiredItemId() > rhs.getRequiredItemId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbGenItemBuff ) {
			YCFGenKbGenItemBuff rhs = (YCFGenKbGenItemBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredCartridgeId() < rhs.getRequiredCartridgeId() ) {
				return( -1 );
			}
			else if( getRequiredCartridgeId() > rhs.getRequiredCartridgeId() ) {
				return( 1 );
			}
			if( getRequiredItemId() < rhs.getRequiredItemId() ) {
				return( -1 );
			}
			else if( getRequiredItemId() > rhs.getRequiredItemId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"YCFGenKbGenItemPKey, YCFGenKbGenItemBuff" );
		}
	}

	public String toString() {
		String ret = "<YCFGenKbGenItemPKey"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredCartridgeId=" + "\"" + Long.toString( getRequiredCartridgeId() ) + "\""
			+ " RequiredItemId=" + "\"" + Long.toString( getRequiredItemId() ) + "\""
			+ "/>";
		return( ret );
	}
}
