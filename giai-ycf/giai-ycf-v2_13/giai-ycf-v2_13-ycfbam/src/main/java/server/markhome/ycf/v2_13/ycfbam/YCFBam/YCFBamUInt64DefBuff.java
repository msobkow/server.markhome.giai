// Description: Java 11 implementation of a UInt64Def buffer object.

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

public class CFBamUInt64DefBuff
	extends CFBamAtomBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a868";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final BigDecimal INITVALUE_INIT_VALUE = CFLibBigDecimalUtil.parse( "CFBam.UInt64Def.InitValue", 19, 0, "0" );
	public static final BigDecimal MINVALUE_INIT_VALUE = CFLibBigDecimalUtil.parse( "CFBam.UInt64Def.MinValue", 19, 0, "0" );
	public static final BigDecimal MAXVALUE_INIT_VALUE = CFLibBigDecimalUtil.parse( "CFBam.UInt64Def.MaxValue", 19, 0, "0" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final BigDecimal INITVALUE_MIN_VALUE = CFLibBigDecimalUtil.parse( "CFBam.UInt64Def.InitValue", 19, 0, "0" );
	public static final BigDecimal MINVALUE_MIN_VALUE = CFLibBigDecimalUtil.parse( "CFBam.UInt64Def.MinValue", 19, 0, "0" );
	public static final BigDecimal MAXVALUE_MIN_VALUE = CFLibBigDecimalUtil.parse( "CFBam.UInt64Def.MaxValue", 19, 0, "0" );
	protected BigDecimal optionalInitValue;
	protected BigDecimal optionalMinValue;
	protected BigDecimal optionalMaxValue;
	public CFBamUInt64DefBuff() {
		super();
		optionalInitValue = null;
		optionalMinValue = null;
		optionalMaxValue = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public BigDecimal getOptionalInitValue() {
		return( optionalInitValue );
	}

	public void setOptionalInitValue( BigDecimal value ) {
		if( value == null ) {
			optionalInitValue = null;
		}
		else if( value.compareTo( CFBamUInt64DefBuff.INITVALUE_MIN_VALUE ) < 0 ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalInitValue",
				1,
				"value",
				value.toString(),
				CFBamUInt64DefBuff.INITVALUE_MIN_VALUE.toString() );
		}
		else {
			optionalInitValue = CFLibBigDecimalUtil.coerce( getClass().getName() + ".InitValue", 19, 0, value );
		}
	}

	public BigDecimal getOptionalMinValue() {
		return( optionalMinValue );
	}

	public void setOptionalMinValue( BigDecimal value ) {
		if( value == null ) {
			optionalMinValue = null;
		}
		else if( value.compareTo( CFBamUInt64DefBuff.MINVALUE_MIN_VALUE ) < 0 ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalMinValue",
				1,
				"value",
				value.toString(),
				CFBamUInt64DefBuff.MINVALUE_MIN_VALUE.toString() );
		}
		else {
			optionalMinValue = CFLibBigDecimalUtil.coerce( getClass().getName() + ".MinValue", 19, 0, value );
		}
	}

	public BigDecimal getOptionalMaxValue() {
		return( optionalMaxValue );
	}

	public void setOptionalMaxValue( BigDecimal value ) {
		if( value == null ) {
			optionalMaxValue = null;
		}
		else if( value.compareTo( CFBamUInt64DefBuff.MAXVALUE_MIN_VALUE ) < 0 ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalMaxValue",
				1,
				"value",
				value.toString(),
				CFBamUInt64DefBuff.MAXVALUE_MIN_VALUE.toString() );
		}
		else {
			optionalMaxValue = CFLibBigDecimalUtil.coerce( getClass().getName() + ".MaxValue", 19, 0, value );
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamUInt64DefBuff ) {
			CFBamUInt64DefBuff rhs = (CFBamUInt64DefBuff)obj;
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
		else if( obj instanceof CFBamUInt64DefHBuff ) {
			CFBamUInt64DefHBuff rhs = (CFBamUInt64DefHBuff)obj;
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
		else if( obj instanceof CFBamUInt64DefBuff ) {
			CFBamUInt64DefBuff rhs = (CFBamUInt64DefBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
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
		else if( obj instanceof CFBamUInt64DefHBuff ) {
			CFBamUInt64DefHBuff rhs = (CFBamUInt64DefHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
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
		if( src instanceof CFBamUInt64DefBuff ) {
			setUInt64DefBuff( (CFBamUInt64DefBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamUInt64DefBuff" );
		}
	}

	public void setUInt64DefBuff( CFBamUInt64DefBuff src ) {
		super.setAtomBuff( src );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalMinValue( src.getOptionalMinValue() );
		setOptionalMaxValue( src.getOptionalMaxValue() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamUInt64DefHBuff ) {
			setUInt64DefBuff( (CFBamUInt64DefHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamUInt64DefHBuff" );
		}
	}

	public void setUInt64DefBuff( CFBamUInt64DefHBuff src ) {
		super.setAtomBuff( src );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalMinValue( src.getOptionalMinValue() );
		setOptionalMaxValue( src.getOptionalMaxValue() );
	}
}
