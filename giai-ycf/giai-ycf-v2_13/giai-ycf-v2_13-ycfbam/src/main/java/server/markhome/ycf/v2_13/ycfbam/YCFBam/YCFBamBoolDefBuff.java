// Description: Java 11 implementation of a BoolDef buffer object.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

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
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFBamBoolDefBuff
	extends YCFBamAtomBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a810";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	protected Boolean optionalInitValue;
	protected String optionalFalseString;
	protected String optionalTrueString;
	protected String optionalNullString;
	public YCFBamBoolDefBuff() {
		super();
		optionalInitValue = null;
		optionalFalseString = null;
		optionalTrueString = null;
		optionalNullString = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public Boolean getOptionalInitValue() {
		return( optionalInitValue );
	}

	public void setOptionalInitValue( Boolean value ) {
		optionalInitValue = value;
	}

	public String getOptionalFalseString() {
		return( optionalFalseString );
	}

	public void setOptionalFalseString( String value ) {
		if( value == null ) {
			optionalFalseString = null;
		}
		else if( value.length() > 32 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalFalseString",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		else {
			optionalFalseString = value;
		}
	}

	public String getOptionalTrueString() {
		return( optionalTrueString );
	}

	public void setOptionalTrueString( String value ) {
		if( value == null ) {
			optionalTrueString = null;
		}
		else if( value.length() > 32 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalTrueString",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		else {
			optionalTrueString = value;
		}
	}

	public String getOptionalNullString() {
		return( optionalNullString );
	}

	public void setOptionalNullString( String value ) {
		if( value == null ) {
			optionalNullString = null;
		}
		else if( value.length() > 32 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalNullString",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		else {
			optionalNullString = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFBamBoolDefBuff ) {
			YCFBamBoolDefBuff rhs = (YCFBamBoolDefBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalInitValue() != null ) {
				if( rhs.getOptionalInitValue() != null ) {
					if( ! getOptionalInitValue().equals( rhs.getOptionalInitValue() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalInitValue() != null ) {
					return( false );
				}
			}
			if( getOptionalFalseString() != null ) {
				if( rhs.getOptionalFalseString() != null ) {
					if( ! getOptionalFalseString().equals( rhs.getOptionalFalseString() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFalseString() != null ) {
					return( false );
				}
			}
			if( getOptionalTrueString() != null ) {
				if( rhs.getOptionalTrueString() != null ) {
					if( ! getOptionalTrueString().equals( rhs.getOptionalTrueString() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalTrueString() != null ) {
					return( false );
				}
			}
			if( getOptionalNullString() != null ) {
				if( rhs.getOptionalNullString() != null ) {
					if( ! getOptionalNullString().equals( rhs.getOptionalNullString() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNullString() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFBamValuePKey ) {
			YCFBamValuePKey rhs = (YCFBamValuePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFBamBoolDefHBuff ) {
			YCFBamBoolDefHBuff rhs = (YCFBamBoolDefHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalInitValue() != null ) {
				if( rhs.getOptionalInitValue() != null ) {
					if( ! getOptionalInitValue().equals( rhs.getOptionalInitValue() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalInitValue() != null ) {
					return( false );
				}
			}
			if( getOptionalFalseString() != null ) {
				if( rhs.getOptionalFalseString() != null ) {
					if( ! getOptionalFalseString().equals( rhs.getOptionalFalseString() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFalseString() != null ) {
					return( false );
				}
			}
			if( getOptionalTrueString() != null ) {
				if( rhs.getOptionalTrueString() != null ) {
					if( ! getOptionalTrueString().equals( rhs.getOptionalTrueString() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalTrueString() != null ) {
					return( false );
				}
			}
			if( getOptionalNullString() != null ) {
				if( rhs.getOptionalNullString() != null ) {
					if( ! getOptionalNullString().equals( rhs.getOptionalNullString() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNullString() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFBamValueHPKey ) {
			YCFBamValueHPKey rhs = (YCFBamValueHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
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
		if( getOptionalInitValue() != null ) {
			if( getOptionalInitValue() ) {
				hashCode = ( hashCode * 4 ) + 1;
			}
			else {
				hashCode = hashCode * 4;
			}
		}
		else {
			hashCode = (hashCode * 4 ) + 3;
		}
		if( getOptionalFalseString() != null ) {
			hashCode = hashCode + getOptionalFalseString().hashCode();
		}
		if( getOptionalTrueString() != null ) {
			hashCode = hashCode + getOptionalTrueString().hashCode();
		}
		if( getOptionalNullString() != null ) {
			hashCode = hashCode + getOptionalNullString().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFBamBoolDefBuff ) {
			YCFBamBoolDefBuff rhs = (YCFBamBoolDefBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getOptionalInitValue() != null ) {
				Boolean lhsInitValue = getOptionalInitValue();
				if( rhs.getOptionalInitValue() ) {
					Boolean rhsInitValue = rhs.getOptionalInitValue();
					if( lhsInitValue ) {
						if( ! rhsInitValue ) {
							return( 1 );
						}
					}
					else {
						if( rhsInitValue ) {
							return( -1 );
						}
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalInitValue() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFalseString() != null ) {
				if( rhs.getOptionalFalseString() != null ) {
					int cmp = getOptionalFalseString().compareTo( rhs.getOptionalFalseString() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFalseString() != null ) {
					return( -1 );
				}
			}
			if( getOptionalTrueString() != null ) {
				if( rhs.getOptionalTrueString() != null ) {
					int cmp = getOptionalTrueString().compareTo( rhs.getOptionalTrueString() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalTrueString() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNullString() != null ) {
				if( rhs.getOptionalNullString() != null ) {
					int cmp = getOptionalNullString().compareTo( rhs.getOptionalNullString() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNullString() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFBamValuePKey ) {
			YCFBamValuePKey rhs = (YCFBamValuePKey)obj;
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
		else if( obj instanceof YCFBamValueHPKey ) {
			YCFBamValueHPKey rhs = (YCFBamValueHPKey)obj;
			{
				int lhsRequiredRevision = getRequiredRevision();
				int rhsRequiredRevision = rhs.getRequiredRevision();
				if( lhsRequiredRevision < rhsRequiredRevision ) {
					return( -1 );
				}
				else if( lhsRequiredRevision > rhsRequiredRevision ) {
					return( 1 );
				}
			}
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
		else if( obj instanceof YCFBamBoolDefHBuff ) {
			YCFBamBoolDefHBuff rhs = (YCFBamBoolDefHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getOptionalInitValue() != null ) {
				Boolean lhsInitValue = getOptionalInitValue();
				if( rhs.getOptionalInitValue() ) {
					Boolean rhsInitValue = rhs.getOptionalInitValue();
					if( lhsInitValue ) {
						if( ! rhsInitValue ) {
							return( 1 );
						}
					}
					else {
						if( rhsInitValue ) {
							return( -1 );
						}
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalInitValue() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFalseString() != null ) {
				if( rhs.getOptionalFalseString() != null ) {
					int cmp = getOptionalFalseString().compareTo( rhs.getOptionalFalseString() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFalseString() != null ) {
					return( -1 );
				}
			}
			if( getOptionalTrueString() != null ) {
				if( rhs.getOptionalTrueString() != null ) {
					int cmp = getOptionalTrueString().compareTo( rhs.getOptionalTrueString() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalTrueString() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNullString() != null ) {
				if( rhs.getOptionalNullString() != null ) {
					int cmp = getOptionalNullString().compareTo( rhs.getOptionalNullString() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNullString() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( YCFBamValueBuff src ) {
		if( src instanceof YCFBamBoolDefBuff ) {
			setBoolDefBuff( (YCFBamBoolDefBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamBoolDefBuff" );
		}
	}

	public void setBoolDefBuff( YCFBamBoolDefBuff src ) {
		super.setAtomBuff( src );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalFalseString( src.getOptionalFalseString() );
		setOptionalTrueString( src.getOptionalTrueString() );
		setOptionalNullString( src.getOptionalNullString() );
	}

	public void set( YCFBamValueHBuff src ) {
		if( src instanceof YCFBamBoolDefHBuff ) {
			setBoolDefBuff( (YCFBamBoolDefHBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamBoolDefHBuff" );
		}
	}

	public void setBoolDefBuff( YCFBamBoolDefHBuff src ) {
		super.setAtomBuff( src );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalFalseString( src.getOptionalFalseString() );
		setOptionalTrueString( src.getOptionalTrueString() );
		setOptionalNullString( src.getOptionalNullString() );
	}
}
