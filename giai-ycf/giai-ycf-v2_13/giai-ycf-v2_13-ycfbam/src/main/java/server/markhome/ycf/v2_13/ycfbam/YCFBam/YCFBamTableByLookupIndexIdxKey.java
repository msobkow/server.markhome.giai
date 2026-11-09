// Description: Java 11 implementation of a Table by LookupIndexIdx index key object.

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

public class CFBamTableByLookupIndexIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalLookupIndexTenantId;
	protected Long optionalLookupIndexId;
	public CFBamTableByLookupIndexIdxKey() {
		optionalLookupIndexTenantId = null;
		optionalLookupIndexId = null;
	}

	public Long getOptionalLookupIndexTenantId() {
		return( optionalLookupIndexTenantId );
	}

	public void setOptionalLookupIndexTenantId( Long value ) {
		if( value == null ) {
			optionalLookupIndexTenantId = null;
		}
		else if( value < CFBamTableBuff.LOOKUPINDEXTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalLookupIndexTenantId",
				1,
				"value",
				value,
				CFBamTableBuff.LOOKUPINDEXTENANTID_MIN_VALUE );
		}
		else {
			optionalLookupIndexTenantId = value;
		}
	}

	public Long getOptionalLookupIndexId() {
		return( optionalLookupIndexId );
	}

	public void setOptionalLookupIndexId( Long value ) {
		if( value == null ) {
			optionalLookupIndexId = null;
		}
		else if( value < CFBamTableBuff.LOOKUPINDEXID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalLookupIndexId",
				1,
				"value",
				value,
				CFBamTableBuff.LOOKUPINDEXID_MIN_VALUE );
		}
		else {
			optionalLookupIndexId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamTableByLookupIndexIdxKey ) {
			CFBamTableByLookupIndexIdxKey rhs = (CFBamTableByLookupIndexIdxKey)obj;
			if( getOptionalLookupIndexTenantId() != null ) {
				if( rhs.getOptionalLookupIndexTenantId() != null ) {
					if( ! getOptionalLookupIndexTenantId().equals( rhs.getOptionalLookupIndexTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalLookupIndexTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalLookupIndexId() != null ) {
				if( rhs.getOptionalLookupIndexId() != null ) {
					if( ! getOptionalLookupIndexId().equals( rhs.getOptionalLookupIndexId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalLookupIndexId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamTableBuff ) {
			CFBamTableBuff rhs = (CFBamTableBuff)obj;
			if( getOptionalLookupIndexTenantId() != null ) {
				if( rhs.getOptionalLookupIndexTenantId() != null ) {
					if( ! getOptionalLookupIndexTenantId().equals( rhs.getOptionalLookupIndexTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalLookupIndexTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalLookupIndexId() != null ) {
				if( rhs.getOptionalLookupIndexId() != null ) {
					if( ! getOptionalLookupIndexId().equals( rhs.getOptionalLookupIndexId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalLookupIndexId() != null ) {
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
		if( getOptionalLookupIndexTenantId() != null ) {
			hashCode = hashCode + getOptionalLookupIndexTenantId().hashCode();
		}
		if( getOptionalLookupIndexId() != null ) {
			hashCode = hashCode + getOptionalLookupIndexId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamTableByLookupIndexIdxKey ) {
			CFBamTableByLookupIndexIdxKey rhs = (CFBamTableByLookupIndexIdxKey)obj;
			if( getOptionalLookupIndexTenantId() != null ) {
				Long lhsLookupIndexTenantId = getOptionalLookupIndexTenantId();
				if( rhs.getOptionalLookupIndexTenantId() != null ) {
					Long rhsLookupIndexTenantId = rhs.getOptionalLookupIndexTenantId();
					int cmp = lhsLookupIndexTenantId.compareTo( rhsLookupIndexTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLookupIndexTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalLookupIndexId() != null ) {
				Long lhsLookupIndexId = getOptionalLookupIndexId();
				if( rhs.getOptionalLookupIndexId() != null ) {
					Long rhsLookupIndexId = rhs.getOptionalLookupIndexId();
					int cmp = lhsLookupIndexId.compareTo( rhsLookupIndexId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLookupIndexId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamTableBuff ) {
			CFBamTableBuff rhs = (CFBamTableBuff)obj;
			if( getOptionalLookupIndexTenantId() != null ) {
				Long lhsLookupIndexTenantId = getOptionalLookupIndexTenantId();
				if( rhs.getOptionalLookupIndexTenantId() != null ) {
					Long rhsLookupIndexTenantId = rhs.getOptionalLookupIndexTenantId();
					int cmp = lhsLookupIndexTenantId.compareTo( rhsLookupIndexTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLookupIndexTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalLookupIndexId() != null ) {
				Long lhsLookupIndexId = getOptionalLookupIndexId();
				if( rhs.getOptionalLookupIndexId() != null ) {
					Long rhsLookupIndexId = rhs.getOptionalLookupIndexId();
					int cmp = lhsLookupIndexId.compareTo( rhsLookupIndexId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLookupIndexId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFBamTableByLookupIndexIdx"
			+ " OptionalLookupIndexTenantId=" + ( ( getOptionalLookupIndexTenantId() == null ) ? "null" : "\"" + getOptionalLookupIndexTenantId().toString() + "\"" )
			+ " OptionalLookupIndexId=" + ( ( getOptionalLookupIndexId() == null ) ? "null" : "\"" + getOptionalLookupIndexId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
