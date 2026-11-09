// Description: Java 11 implementation of a NumberDef buffer object.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBam;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;

public class CFBamNumberDefBuff
	extends CFBamAtomBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a830";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final short DIGITS_INIT_VALUE = (short)16;
	public static final short PRECIS_INIT_VALUE = (short)0;
	public static final BigDecimal INITVALUE_INIT_VALUE = CFLibBigDecimalUtil.parse( "CFBam.NumberDef.InitValue", 31, 5, "0" );
	public static final BigDecimal MINVALUE_INIT_VALUE = CFLibBigDecimalUtil.parse( "CFBam.NumberDef.MinValue", 31, 5, "0" );
	public static final BigDecimal MAXVALUE_INIT_VALUE = CFLibBigDecimalUtil.parse( "CFBam.NumberDef.MaxValue", 31, 5, "0" );
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
	public CFBamNumberDefBuff() {
		super();
		requiredDigits = CFBamNumberDefBuff.DIGITS_INIT_VALUE;
		requiredPrecis = CFBamNumberDefBuff.PRECIS_INIT_VALUE;
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
		if( value < CFBamNumberDefBuff.DIGITS_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDigits",
				1,
				"value",
				value,
				CFBamNumberDefBuff.DIGITS_MIN_VALUE );
		}
		if( value > CFBamNumberDefBuff.DIGITS_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredDigits",
				1,
				"value",
				value,
				CFBamNumberDefBuff.DIGITS_MAX_VALUE );
		}
		requiredDigits = value;
	}

	public short getRequiredPrecis() {
		return( requiredPrecis );
	}

	public void setRequiredPrecis( short value ) {
		if( value < CFBamNumberDefBuff.PRECIS_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredPrecis",
				1,
				"value",
				value,
				CFBamNumberDefBuff.PRECIS_MIN_VALUE );
		}
		if( value > CFBamNumberDefBuff.PRECIS_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredPrecis",
				1,
				"value",
				value,
				CFBamNumberDefBuff.PRECIS_MAX_VALUE );
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
			optionalInitValue = CFLibBigDecimalUtil.coerce( getClass().getName() + ".InitValue", 31, 5, value );
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
			optionalMinValue = CFLibBigDecimalUtil.coerce( getClass().getName() + ".MinValue", 31, 5, value );
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
			optionalMaxValue = CFLibBigDecimalUtil.coerce( getClass().getName() + ".MaxValue", 31, 5, value );
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamNumberDefBuff ) {
			CFBamNumberDefBuff rhs = (CFBamNumberDefBuff)obj;
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
		else if( obj instanceof CFBamValuePKey ) {
			CFBamValuePKey rhs = (CFBamValuePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamNumberDefHBuff ) {
			CFBamNumberDefHBuff rhs = (CFBamNumberDefHBuff)obj;
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
		else if( obj instanceof CFBamValueHPKey ) {
			CFBamValueHPKey rhs = (CFBamValueHPKey)obj;
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
		else if( obj instanceof CFBamNumberDefBuff ) {
			CFBamNumberDefBuff rhs = (CFBamNumberDefBuff)obj;
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
		else if( obj instanceof CFBamValuePKey ) {
			CFBamValuePKey rhs = (CFBamValuePKey)obj;
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
		else if( obj instanceof CFBamValueHPKey ) {
			CFBamValueHPKey rhs = (CFBamValueHPKey)obj;
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
		else if( obj instanceof CFBamNumberDefHBuff ) {
			CFBamNumberDefHBuff rhs = (CFBamNumberDefHBuff)obj;
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

	public void set( CFBamValueBuff src ) {
		if( src instanceof CFBamNumberDefBuff ) {
			setNumberDefBuff( (CFBamNumberDefBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamNumberDefBuff" );
		}
	}

	public void setNumberDefBuff( CFBamNumberDefBuff src ) {
		super.setAtomBuff( src );
		setRequiredDigits( src.getRequiredDigits() );
		setRequiredPrecis( src.getRequiredPrecis() );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalMinValue( src.getOptionalMinValue() );
		setOptionalMaxValue( src.getOptionalMaxValue() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamNumberDefHBuff ) {
			setNumberDefBuff( (CFBamNumberDefHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamNumberDefHBuff" );
		}
	}

	public void setNumberDefBuff( CFBamNumberDefHBuff src ) {
		super.setAtomBuff( src );
		setRequiredDigits( src.getRequiredDigits() );
		setRequiredPrecis( src.getRequiredPrecis() );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalMinValue( src.getOptionalMinValue() );
		setOptionalMaxValue( src.getOptionalMaxValue() );
	}
}
