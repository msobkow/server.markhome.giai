// Description: Java 11 implementation of a RuleCart buffer object.

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

public class YCFGenKbRuleCartBuff
{
	public final static String CLASS_CODE = "a925";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	protected long requiredTenantId;
	protected long requiredId;
	protected String requiredName;
	protected String optionalDescr;
	protected String optionalRevisionString;
	protected int requiredRevision;
	public YCFGenKbRuleCartBuff() {
		requiredTenantId = YCFGenKbRuleCartBuff.TENANTID_INIT_VALUE;
		requiredId = YCFGenKbRuleCartBuff.ID_INIT_VALUE;
		requiredName = new String( YCFGenKbRuleCartBuff.NAME_INIT_VALUE );
		optionalDescr = null;
		optionalRevisionString = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < YCFGenKbRuleCartBuff.TENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				YCFGenKbRuleCartBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredId() {
		return( requiredId );
	}

	public void setRequiredId( long value ) {
		if( value < YCFGenKbRuleCartBuff.ID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredId",
				1,
				"value",
				value,
				YCFGenKbRuleCartBuff.ID_MIN_VALUE );
		}
		requiredId = value;
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredName = value;
	}

	public String getOptionalDescr() {
		return( optionalDescr );
	}

	public void setOptionalDescr( String value ) {
		if( value == null ) {
			optionalDescr = null;
		}
		else if( value.length() > 255 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalDescr",
				1,
				"value.length()",
				value.length(),
				255 );
		}
		else {
			optionalDescr = value;
		}
	}

	public String getOptionalRevisionString() {
		return( optionalRevisionString );
	}

	public void setOptionalRevisionString( String value ) {
		if( value == null ) {
			optionalRevisionString = null;
		}
		else if( value.length() > 255 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalRevisionString",
				1,
				"value.length()",
				value.length(),
				255 );
		}
		else {
			optionalRevisionString = value;
		}
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
		else if( obj instanceof YCFGenKbRuleCartBuff ) {
			YCFGenKbRuleCartBuff rhs = (YCFGenKbRuleCartBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( getOptionalDescr() != null ) {
				if( rhs.getOptionalDescr() != null ) {
					if( ! getOptionalDescr().equals( rhs.getOptionalDescr() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDescr() != null ) {
					return( false );
				}
			}
			if( getOptionalRevisionString() != null ) {
				if( rhs.getOptionalRevisionString() != null ) {
					if( ! getOptionalRevisionString().equals( rhs.getOptionalRevisionString() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRevisionString() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbRuleCartPKey ) {
			YCFGenKbRuleCartPKey rhs = (YCFGenKbRuleCartPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbRuleCartByTenantIdxKey ) {
			YCFGenKbRuleCartByTenantIdxKey rhs = (YCFGenKbRuleCartByTenantIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFGenKbRuleCartByNameIdxKey ) {
			YCFGenKbRuleCartByNameIdxKey rhs = (YCFGenKbRuleCartByNameIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
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
		hashCode = hashCode + (int)( getRequiredId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalDescr() != null ) {
			hashCode = hashCode + getOptionalDescr().hashCode();
		}
		if( getOptionalRevisionString() != null ) {
			hashCode = hashCode + getOptionalRevisionString().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFGenKbRuleCartBuff ) {
			YCFGenKbRuleCartBuff rhs = (YCFGenKbRuleCartBuff)obj;
			int retval = 0;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalDescr() != null ) {
				if( rhs.getOptionalDescr() != null ) {
					int cmp = getOptionalDescr().compareTo( rhs.getOptionalDescr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescr() != null ) {
					return( -1 );
				}
			}
			if( getOptionalRevisionString() != null ) {
				if( rhs.getOptionalRevisionString() != null ) {
					int cmp = getOptionalRevisionString().compareTo( rhs.getOptionalRevisionString() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRevisionString() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbRuleCartPKey ) {
			YCFGenKbRuleCartPKey rhs = (YCFGenKbRuleCartPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFGenKbRuleCartByTenantIdxKey ) {
			YCFGenKbRuleCartByTenantIdxKey rhs = (YCFGenKbRuleCartByTenantIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof YCFGenKbRuleCartByNameIdxKey ) {
			YCFGenKbRuleCartByNameIdxKey rhs = (YCFGenKbRuleCartByNameIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
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

	public void set( YCFGenKbRuleCartBuff src ) {
		setRuleCartBuff( src );
	}

	public void setRuleCartBuff( YCFGenKbRuleCartBuff src ) {
		setRequiredTenantId( src.getRequiredTenantId() );
		setRequiredId( src.getRequiredId() );
		setRequiredName( src.getRequiredName() );
		setOptionalDescr( src.getOptionalDescr() );
		setOptionalRevisionString( src.getOptionalRevisionString() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
