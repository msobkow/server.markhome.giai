// Description: Java 11 implementation of a Param by ServerTypeIdx index key object.

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

public class YCFBamParamByServerTypeIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalTypeTenantId;
	protected Long optionalTypeId;
	public YCFBamParamByServerTypeIdxKey() {
		optionalTypeTenantId = null;
		optionalTypeId = null;
	}

	public Long getOptionalTypeTenantId() {
		return( optionalTypeTenantId );
	}

	public void setOptionalTypeTenantId( Long value ) {
		if( value == null ) {
			optionalTypeTenantId = null;
		}
		else if( value < YCFBamParamBuff.TYPETENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalTypeTenantId",
				1,
				"value",
				value,
				YCFBamParamBuff.TYPETENANTID_MIN_VALUE );
		}
		else {
			optionalTypeTenantId = value;
		}
	}

	public Long getOptionalTypeId() {
		return( optionalTypeId );
	}

	public void setOptionalTypeId( Long value ) {
		if( value == null ) {
			optionalTypeId = null;
		}
		else if( value < YCFBamParamBuff.TYPEID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalTypeId",
				1,
				"value",
				value,
				YCFBamParamBuff.TYPEID_MIN_VALUE );
		}
		else {
			optionalTypeId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFBamParamByServerTypeIdxKey ) {
			YCFBamParamByServerTypeIdxKey rhs = (YCFBamParamByServerTypeIdxKey)obj;
			if( getOptionalTypeTenantId() != null ) {
				if( rhs.getOptionalTypeTenantId() != null ) {
					if( ! getOptionalTypeTenantId().equals( rhs.getOptionalTypeTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalTypeTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalTypeId() != null ) {
				if( rhs.getOptionalTypeId() != null ) {
					if( ! getOptionalTypeId().equals( rhs.getOptionalTypeId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalTypeId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFBamParamBuff ) {
			YCFBamParamBuff rhs = (YCFBamParamBuff)obj;
			if( getOptionalTypeTenantId() != null ) {
				if( rhs.getOptionalTypeTenantId() != null ) {
					if( ! getOptionalTypeTenantId().equals( rhs.getOptionalTypeTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalTypeTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalTypeId() != null ) {
				if( rhs.getOptionalTypeId() != null ) {
					if( ! getOptionalTypeId().equals( rhs.getOptionalTypeId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalTypeId() != null ) {
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
		if( getOptionalTypeTenantId() != null ) {
			hashCode = hashCode + getOptionalTypeTenantId().hashCode();
		}
		if( getOptionalTypeId() != null ) {
			hashCode = hashCode + getOptionalTypeId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFBamParamByServerTypeIdxKey ) {
			YCFBamParamByServerTypeIdxKey rhs = (YCFBamParamByServerTypeIdxKey)obj;
			if( getOptionalTypeTenantId() != null ) {
				Long lhsTypeTenantId = getOptionalTypeTenantId();
				if( rhs.getOptionalTypeTenantId() != null ) {
					Long rhsTypeTenantId = rhs.getOptionalTypeTenantId();
					int cmp = lhsTypeTenantId.compareTo( rhsTypeTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalTypeTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalTypeId() != null ) {
				Long lhsTypeId = getOptionalTypeId();
				if( rhs.getOptionalTypeId() != null ) {
					Long rhsTypeId = rhs.getOptionalTypeId();
					int cmp = lhsTypeId.compareTo( rhsTypeId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalTypeId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFBamParamBuff ) {
			YCFBamParamBuff rhs = (YCFBamParamBuff)obj;
			if( getOptionalTypeTenantId() != null ) {
				Long lhsTypeTenantId = getOptionalTypeTenantId();
				if( rhs.getOptionalTypeTenantId() != null ) {
					Long rhsTypeTenantId = rhs.getOptionalTypeTenantId();
					int cmp = lhsTypeTenantId.compareTo( rhsTypeTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalTypeTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalTypeId() != null ) {
				Long lhsTypeId = getOptionalTypeId();
				if( rhs.getOptionalTypeId() != null ) {
					Long rhsTypeId = rhs.getOptionalTypeId();
					int cmp = lhsTypeId.compareTo( rhsTypeId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalTypeId() != null ) {
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
		String ret = "<YCFBamParamByServerTypeIdx"
			+ " OptionalTypeTenantId=" + ( ( getOptionalTypeTenantId() == null ) ? "null" : "\"" + getOptionalTypeTenantId().toString() + "\"" )
			+ " OptionalTypeId=" + ( ( getOptionalTypeId() == null ) ? "null" : "\"" + getOptionalTypeId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
