// Description: Java 11 implementation of a DoubleDef buffer object.

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

public class YCFBamDoubleDefBuff
	extends YCFBamAtomBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a81f";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final double INITVALUE_MIN_VALUE = -2.225E307;
	public static final double MINVALUE_MIN_VALUE = -2.225E307;
	public static final double MAXVALUE_MIN_VALUE = -2.225E307;
	public static final double INITVALUE_MAX_VALUE = 2.225E307;
	public static final double MINVALUE_MAX_VALUE = 2.225E307;
	public static final double MAXVALUE_MAX_VALUE = 2.225E307;
	protected Double optionalInitValue;
	protected Double optionalMinValue;
	protected Double optionalMaxValue;
	public YCFBamDoubleDefBuff() {
		super();
		optionalInitValue = null;
		optionalMinValue = null;
		optionalMaxValue = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public Double getOptionalInitValue() {
		return( optionalInitValue );
	}

	public void setOptionalInitValue( Double value ) {
		if( value == null ) {
			optionalInitValue = null;
		}
		else if( value < YCFBamDoubleDefBuff.INITVALUE_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalInitValue",
				1,
				"value",
				value,
				YCFBamDoubleDefBuff.INITVALUE_MIN_VALUE );
		}
		else if( value > YCFBamDoubleDefBuff.INITVALUE_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalInitValue",
				1,
				"value",
				value,
				YCFBamDoubleDefBuff.INITVALUE_MAX_VALUE );
		}
		else {
			optionalInitValue = value;
		}
	}

	public Double getOptionalMinValue() {
		return( optionalMinValue );
	}

	public void setOptionalMinValue( Double value ) {
		if( value == null ) {
			optionalMinValue = null;
		}
		else if( value < YCFBamDoubleDefBuff.MINVALUE_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalMinValue",
				1,
				"value",
				value,
				YCFBamDoubleDefBuff.MINVALUE_MIN_VALUE );
		}
		else if( value > YCFBamDoubleDefBuff.MINVALUE_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalMinValue",
				1,
				"value",
				value,
				YCFBamDoubleDefBuff.MINVALUE_MAX_VALUE );
		}
		else {
			optionalMinValue = value;
		}
	}

	public Double getOptionalMaxValue() {
		return( optionalMaxValue );
	}

	public void setOptionalMaxValue( Double value ) {
		if( value == null ) {
			optionalMaxValue = null;
		}
		else if( value < YCFBamDoubleDefBuff.MAXVALUE_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalMaxValue",
				1,
				"value",
				value,
				YCFBamDoubleDefBuff.MAXVALUE_MIN_VALUE );
		}
		else if( value > YCFBamDoubleDefBuff.MAXVALUE_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalMaxValue",
				1,
				"value",
				value,
				YCFBamDoubleDefBuff.MAXVALUE_MAX_VALUE );
		}
		else {
			optionalMaxValue = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFBamDoubleDefBuff ) {
			YCFBamDoubleDefBuff rhs = (YCFBamDoubleDefBuff)obj;
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
		else if( obj instanceof YCFBamDoubleDefHBuff ) {
			YCFBamDoubleDefHBuff rhs = (YCFBamDoubleDefHBuff)obj;
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
		else if( obj instanceof YCFBamDoubleDefBuff ) {
			YCFBamDoubleDefBuff rhs = (YCFBamDoubleDefBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getOptionalInitValue() != null ) {
				Double lhsInitValue = getOptionalInitValue();
				if( rhs.getOptionalInitValue() != null ) {
					Double rhsInitValue = rhs.getOptionalInitValue();
					int cmp = lhsInitValue.compareTo( rhsInitValue );
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
				Double lhsMinValue = getOptionalMinValue();
				if( rhs.getOptionalMinValue() != null ) {
					Double rhsMinValue = rhs.getOptionalMinValue();
					int cmp = lhsMinValue.compareTo( rhsMinValue );
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
				Double lhsMaxValue = getOptionalMaxValue();
				if( rhs.getOptionalMaxValue() != null ) {
					Double rhsMaxValue = rhs.getOptionalMaxValue();
					int cmp = lhsMaxValue.compareTo( rhsMaxValue );
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
		else if( obj instanceof YCFBamDoubleDefHBuff ) {
			YCFBamDoubleDefHBuff rhs = (YCFBamDoubleDefHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getOptionalInitValue() != null ) {
				Double lhsInitValue = getOptionalInitValue();
				if( rhs.getOptionalInitValue() != null ) {
					Double rhsInitValue = rhs.getOptionalInitValue();
					int cmp = lhsInitValue.compareTo( rhsInitValue );
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
				Double lhsMinValue = getOptionalMinValue();
				if( rhs.getOptionalMinValue() != null ) {
					Double rhsMinValue = rhs.getOptionalMinValue();
					int cmp = lhsMinValue.compareTo( rhsMinValue );
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
				Double lhsMaxValue = getOptionalMaxValue();
				if( rhs.getOptionalMaxValue() != null ) {
					Double rhsMaxValue = rhs.getOptionalMaxValue();
					int cmp = lhsMaxValue.compareTo( rhsMaxValue );
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
		if( src instanceof YCFBamDoubleDefBuff ) {
			setDoubleDefBuff( (YCFBamDoubleDefBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamDoubleDefBuff" );
		}
	}

	public void setDoubleDefBuff( YCFBamDoubleDefBuff src ) {
		super.setAtomBuff( src );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalMinValue( src.getOptionalMinValue() );
		setOptionalMaxValue( src.getOptionalMaxValue() );
	}

	public void set( YCFBamValueHBuff src ) {
		if( src instanceof YCFBamDoubleDefHBuff ) {
			setDoubleDefBuff( (YCFBamDoubleDefHBuff)src );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"YCFBamDoubleDefHBuff" );
		}
	}

	public void setDoubleDefBuff( YCFBamDoubleDefHBuff src ) {
		super.setAtomBuff( src );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalMinValue( src.getOptionalMinValue() );
		setOptionalMaxValue( src.getOptionalMaxValue() );
	}
}
