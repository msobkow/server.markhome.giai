// Description: Java 11 implementation of a GenTrunc buffer object.

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

public class YCFGenKbGenTruncBuff
	extends YCFGenKbGenRuleBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a924";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long CARTRIDGEID_INIT_VALUE = 0L;
	public static final long ITEMID_INIT_VALUE = 0L;
	public static final int TRUNCATEAT_INIT_VALUE = 0;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long CARTRIDGEID_MIN_VALUE = 0L;
	public static final long ITEMID_MIN_VALUE = 0L;
	public static final int TRUNCATEAT_MIN_VALUE = 0;
	public static final long ITEMID_MAX_VALUE = 2147483647L;
	public static final int TRUNCATEAT_MAX_VALUE = 2147483647;
	protected int requiredTruncateAt;
	public YCFGenKbGenTruncBuff() {
		super();
		requiredTruncateAt = YCFGenKbGenTruncBuff.TRUNCATEAT_INIT_VALUE;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public int getRequiredTruncateAt() {
		return( requiredTruncateAt );
	}

	public void setRequiredTruncateAt( int value ) {
		if( value < YCFGenKbGenTruncBuff.TRUNCATEAT_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTruncateAt",
				1,
				"value",
				value,
				YCFGenKbGenTruncBuff.TRUNCATEAT_MIN_VALUE );
		}
		if( value > YCFGenKbGenTruncBuff.TRUNCATEAT_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredTruncateAt",
				1,
				"value",
				value,
				YCFGenKbGenTruncBuff.TRUNCATEAT_MAX_VALUE );
		}
		requiredTruncateAt = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFGenKbGenTruncBuff ) {
			YCFGenKbGenTruncBuff rhs = (YCFGenKbGenTruncBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredCartridgeId() != rhs.getRequiredCartridgeId() ) {
				return( false );
			}
			if( getRequiredItemId() != rhs.getRequiredItemId() ) {
				return( false );
			}
			if( getRequiredTruncateAt() != rhs.getRequiredTruncateAt() ) {
				return( false );
			}
			return( true );
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
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredTruncateAt();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFGenKbGenTruncBuff ) {
			YCFGenKbGenTruncBuff rhs = (YCFGenKbGenTruncBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredTruncateAt() < rhs.getRequiredTruncateAt() ) {
				return( -1 );
			}
			else if( getRequiredTruncateAt() > rhs.getRequiredTruncateAt() ) {
				return( 1 );
			}
			return( 0 );
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
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( YCFGenKbGenItemBuff src ) {
		if( src instanceof YCFGenKbGenTruncBuff ) {
			setGenTruncBuff( (YCFGenKbGenTruncBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFGenKbGenTruncBuff" );
		}
	}

	public void setGenTruncBuff( YCFGenKbGenTruncBuff src ) {
		super.setGenRuleBuff( src );
		setRequiredTruncateAt( src.getRequiredTruncateAt() );
	}
}
