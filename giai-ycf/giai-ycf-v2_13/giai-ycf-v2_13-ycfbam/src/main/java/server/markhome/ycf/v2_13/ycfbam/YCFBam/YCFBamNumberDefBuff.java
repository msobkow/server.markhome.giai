// Description: Java 11 implementation of a NumberDef buffer object.

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

public class YCFBamNumberDefBuff
	extends YCFBamAtomBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a830";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final short DIGITS_INIT_VALUE = (short)16;
	public static final short PRECIS_INIT_VALUE = (short)0;
	public static final BigDecimal INITVALUE_INIT_VALUE = YCFLibBigDecimalUtil.parse( "YCFBam.NumberDef.InitValue", 31, 5, "0" );
	public static final BigDecimal MINVALUE_INIT_VALUE = YCFLibBigDecimalUtil.parse( "YCFBam.NumberDef.MinValue", 31, 5, "0" );
	public static final BigDecimal MAXVALUE_INIT_VALUE = YCFLibBigDecimalUtil.parse( "YCFBam.NumberDef.MaxValue", 31, 5, "0" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final short DIGITS_MIN_VALUE = (short)1;
	public static final short PRECIS_MIN_VALUE = (short)0;
	public static final short DIGITS_MAX_VALUE = (short)31;
	public static final short PRECIS_MAX_VALUE = (short)30;
	protected short requiredDigits;
	protected short requiredPrecis;
	protected BigDecimal optionalInitValue;
	protected BigDecimal optionalMinValue;
	protected BigDecimal optionalMaxValue;
	public YCFBamNumberDefBuff() {
		super();
		requiredDigits = YCFBamNumberDefBuff.DIGITS_INIT_VALUE;
		requiredPrecis = YCFBamNumberDefBuff.PRECIS_INIT_VALUE;
		optionalInitValue = null;
		optionalMinValue = null;
		optionalMaxValue = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public short getRequiredDigits() {
		return( requiredDigits );
	}

	public void setRequiredDigits( short value ) {
		if( value < YCFBamNumberDefBuff.DIGITS_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredDigits",
				1,
				"value",
				value,
				YCFBamNumberDefBuff.DIGITS_MIN_VALUE );
		}
		if( value > YCFBamNumberDefBuff.DIGITS_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredDigits",
				1,
				"value",
				value,
				YCFBamNumberDefBuff.DIGITS_MAX_VALUE );
		}
		requiredDigits = value;
	}

	public short getRequiredPrecis() {
		return( requiredPrecis );
	}

	public void setRequiredPrecis( short value ) {
		if( value < YCFBamNumberDefBuff.PRECIS_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredPrecis",
				1,
				"value",
				value,
				YCFBamNumberDefBuff.PRECIS_MIN_VALUE );
		}
		if( value > YCFBamNumberDefBuff.PRECIS_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredPrecis",
				1,
				"value",
				value,
				YCFBamNumberDefBuff.PRECIS_MAX_VALUE );
		}
		requiredPrecis = value;
	}

	public BigDecimal getOptionalInitValue() {
		return( optionalInitValue );
	}

	public void setOptionalInitValue( BigDecimal value ) {
		if( value == null ) {
			optionalInitValue = null;
		}
		else {
			optionalInitValue = YCFLibBigDecimalUtil.coerce( getClass().getName() + ".InitValue", 31, 5, value );
		}
	}

	public BigDecimal getOptionalMinValue() {
		return( optionalMinValue );
	}

	public void setOptionalMinValue( BigDecimal value ) {
		if( value == null ) {
			optionalMinValue = null;
		}
		else {
			optionalMinValue = YCFLibBigDecimalUtil.coerce( getClass().getName() + ".MinValue", 31, 5, value );
		}
	}

	public BigDecimal getOptionalMaxValue() {
		return( optionalMaxValue );
	}

	public void setOptionalMaxValue( BigDecimal value ) {
		if( value == null ) {
			optionalMaxValue = null;
		}
		else {
			optionalMaxValue = YCFLibBigDecimalUtil.coerce( getClass().getName() + ".MaxValue", 31, 5, value );
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFBamNumberDefBuff ) {
			YCFBamNumberDefBuff rhs = (YCFBamNumberDefBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredDigits() != rhs.getRequiredDigits() ) {
				return( false );
			}
			if( getRequiredPrecis() != rhs.getRequiredPrecis() ) {
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
			if( getOptionalMinValue() != null ) {
				if( rhs.getOptionalMinValue() != null ) {
					if( ! getOptionalMinValue().equals( rhs.getOptionalMinValue() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalMinValue() != null ) {
					return( false );
				}
			}
			if( getOptionalMaxValue() != null ) {
				if( rhs.getOptionalMaxValue() != null ) {
					if( ! getOptionalMaxValue().equals( rhs.getOptionalMaxValue() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalMaxValue() != null ) {
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
		else if( obj instanceof YCFBamNumberDefHBuff ) {
			YCFBamNumberDefHBuff rhs = (YCFBamNumberDefHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredDigits() != rhs.getRequiredDigits() ) {
				return( false );
			}
			if( getRequiredPrecis() != rhs.getRequiredPrecis() ) {
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
			if( getOptionalMinValue() != null ) {
				if( rhs.getOptionalMinValue() != null ) {
					if( ! getOptionalMinValue().equals( rhs.getOptionalMinValue() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalMinValue() != null ) {
					return( false );
				}
			}
			if( getOptionalMaxValue() != null ) {
				if( rhs.getOptionalMaxValue() != null ) {
					if( ! getOptionalMaxValue().equals( rhs.getOptionalMaxValue() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalMaxValue() != null ) {
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
		hashCode = ( hashCode * 0x10000 ) + getRequiredDigits();
		hashCode = ( hashCode * 0x10000 ) + getRequiredPrecis();
		if( getOptionalInitValue() != null ) {
			hashCode = hashCode + getOptionalInitValue().hashCode();
		}
		if( getOptionalMinValue() != null ) {
			hashCode = hashCode + getOptionalMinValue().hashCode();
		}
		if( getOptionalMaxValue() != null ) {
			hashCode = hashCode + getOptionalMaxValue().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFBamNumberDefBuff ) {
			YCFBamNumberDefBuff rhs = (YCFBamNumberDefBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredDigits() < rhs.getRequiredDigits() ) {
				return( -1 );
			}
			else if( getRequiredDigits() > rhs.getRequiredDigits() ) {
				return( 1 );
			}
			if( getRequiredPrecis() < rhs.getRequiredPrecis() ) {
				return( -1 );
			}
			else if( getRequiredPrecis() > rhs.getRequiredPrecis() ) {
				return( 1 );
			}
			if( getOptionalInitValue() != null ) {
				if( rhs.getOptionalInitValue() != null ) {
					int cmp = getOptionalInitValue().compareTo( rhs.getOptionalInitValue() );
					if( cmp != 0 ) {
						return( cmp );
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
			if( getOptionalMinValue() != null ) {
				if( rhs.getOptionalMinValue() != null ) {
					int cmp = getOptionalMinValue().compareTo( rhs.getOptionalMinValue() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalMinValue() != null ) {
					return( -1 );
				}
			}
			if( getOptionalMaxValue() != null ) {
				if( rhs.getOptionalMaxValue() != null ) {
					int cmp = getOptionalMaxValue().compareTo( rhs.getOptionalMaxValue() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalMaxValue() != null ) {
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
		else if( obj instanceof YCFBamNumberDefHBuff ) {
			YCFBamNumberDefHBuff rhs = (YCFBamNumberDefHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredDigits() < rhs.getRequiredDigits() ) {
				return( -1 );
			}
			else if( getRequiredDigits() > rhs.getRequiredDigits() ) {
				return( 1 );
			}
			if( getRequiredPrecis() < rhs.getRequiredPrecis() ) {
				return( -1 );
			}
			else if( getRequiredPrecis() > rhs.getRequiredPrecis() ) {
				return( 1 );
			}
			if( getOptionalInitValue() != null ) {
				if( rhs.getOptionalInitValue() != null ) {
					int cmp = getOptionalInitValue().compareTo( rhs.getOptionalInitValue() );
					if( cmp != 0 ) {
						return( cmp );
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
			if( getOptionalMinValue() != null ) {
				if( rhs.getOptionalMinValue() != null ) {
					int cmp = getOptionalMinValue().compareTo( rhs.getOptionalMinValue() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalMinValue() != null ) {
					return( -1 );
				}
			}
			if( getOptionalMaxValue() != null ) {
				if( rhs.getOptionalMaxValue() != null ) {
					int cmp = getOptionalMaxValue().compareTo( rhs.getOptionalMaxValue() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalMaxValue() != null ) {
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
		if( src instanceof YCFBamNumberDefBuff ) {
			setNumberDefBuff( (YCFBamNumberDefBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamNumberDefBuff" );
		}
	}

	public void setNumberDefBuff( YCFBamNumberDefBuff src ) {
		super.setAtomBuff( src );
		setRequiredDigits( src.getRequiredDigits() );
		setRequiredPrecis( src.getRequiredPrecis() );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalMinValue( src.getOptionalMinValue() );
		setOptionalMaxValue( src.getOptionalMaxValue() );
	}

	public void set( YCFBamValueHBuff src ) {
		if( src instanceof YCFBamNumberDefHBuff ) {
			setNumberDefBuff( (YCFBamNumberDefHBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamNumberDefHBuff" );
		}
	}

	public void setNumberDefBuff( YCFBamNumberDefHBuff src ) {
		super.setAtomBuff( src );
		setRequiredDigits( src.getRequiredDigits() );
		setRequiredPrecis( src.getRequiredPrecis() );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalMinValue( src.getOptionalMinValue() );
		setOptionalMaxValue( src.getOptionalMaxValue() );
	}
}
