// Description: Java 11 implementation of a Relation by NarrowedIdx index key object.

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

public class YCFBamRelationByNarrowedIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalNarrowedTenantId;
	protected Long optionalNarrowedId;
	public YCFBamRelationByNarrowedIdxKey() {
		optionalNarrowedTenantId = null;
		optionalNarrowedId = null;
	}

	public Long getOptionalNarrowedTenantId() {
		return( optionalNarrowedTenantId );
	}

	public void setOptionalNarrowedTenantId( Long value ) {
		if( value == null ) {
			optionalNarrowedTenantId = null;
		}
		else if( value < YCFBamRelationBuff.NARROWEDTENANTID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalNarrowedTenantId",
				1,
				"value",
				value,
				YCFBamRelationBuff.NARROWEDTENANTID_MIN_VALUE );
		}
		else {
			optionalNarrowedTenantId = value;
		}
	}

	public Long getOptionalNarrowedId() {
		return( optionalNarrowedId );
	}

	public void setOptionalNarrowedId( Long value ) {
		if( value == null ) {
			optionalNarrowedId = null;
		}
		else if( value < YCFBamRelationBuff.NARROWEDID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setOptionalNarrowedId",
				1,
				"value",
				value,
				YCFBamRelationBuff.NARROWEDID_MIN_VALUE );
		}
		else {
			optionalNarrowedId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFBamRelationByNarrowedIdxKey ) {
			YCFBamRelationByNarrowedIdxKey rhs = (YCFBamRelationByNarrowedIdxKey)obj;
			if( getOptionalNarrowedTenantId() != null ) {
				if( rhs.getOptionalNarrowedTenantId() != null ) {
					if( ! getOptionalNarrowedTenantId().equals( rhs.getOptionalNarrowedTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNarrowedTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalNarrowedId() != null ) {
				if( rhs.getOptionalNarrowedId() != null ) {
					if( ! getOptionalNarrowedId().equals( rhs.getOptionalNarrowedId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFBamRelationBuff ) {
			YCFBamRelationBuff rhs = (YCFBamRelationBuff)obj;
			if( getOptionalNarrowedTenantId() != null ) {
				if( rhs.getOptionalNarrowedTenantId() != null ) {
					if( ! getOptionalNarrowedTenantId().equals( rhs.getOptionalNarrowedTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNarrowedTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalNarrowedId() != null ) {
				if( rhs.getOptionalNarrowedId() != null ) {
					if( ! getOptionalNarrowedId().equals( rhs.getOptionalNarrowedId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
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
		if( getOptionalNarrowedTenantId() != null ) {
			hashCode = hashCode + getOptionalNarrowedTenantId().hashCode();
		}
		if( getOptionalNarrowedId() != null ) {
			hashCode = hashCode + getOptionalNarrowedId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof YCFBamRelationByNarrowedIdxKey ) {
			YCFBamRelationByNarrowedIdxKey rhs = (YCFBamRelationByNarrowedIdxKey)obj;
			if( getOptionalNarrowedTenantId() != null ) {
				Long lhsNarrowedTenantId = getOptionalNarrowedTenantId();
				if( rhs.getOptionalNarrowedTenantId() != null ) {
					Long rhsNarrowedTenantId = rhs.getOptionalNarrowedTenantId();
					int cmp = lhsNarrowedTenantId.compareTo( rhsNarrowedTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNarrowedTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNarrowedId() != null ) {
				Long lhsNarrowedId = getOptionalNarrowedId();
				if( rhs.getOptionalNarrowedId() != null ) {
					Long rhsNarrowedId = rhs.getOptionalNarrowedId();
					int cmp = lhsNarrowedId.compareTo( rhsNarrowedId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFBamRelationBuff ) {
			YCFBamRelationBuff rhs = (YCFBamRelationBuff)obj;
			if( getOptionalNarrowedTenantId() != null ) {
				Long lhsNarrowedTenantId = getOptionalNarrowedTenantId();
				if( rhs.getOptionalNarrowedTenantId() != null ) {
					Long rhsNarrowedTenantId = rhs.getOptionalNarrowedTenantId();
					int cmp = lhsNarrowedTenantId.compareTo( rhsNarrowedTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNarrowedTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNarrowedId() != null ) {
				Long lhsNarrowedId = getOptionalNarrowedId();
				if( rhs.getOptionalNarrowedId() != null ) {
					Long rhsNarrowedId = rhs.getOptionalNarrowedId();
					int cmp = lhsNarrowedId.compareTo( rhsNarrowedId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNarrowedId() != null ) {
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
		String ret = "<YCFBamRelationByNarrowedIdx"
			+ " OptionalNarrowedTenantId=" + ( ( getOptionalNarrowedTenantId() == null ) ? "null" : "\"" + getOptionalNarrowedTenantId().toString() + "\"" )
			+ " OptionalNarrowedId=" + ( ( getOptionalNarrowedId() == null ) ? "null" : "\"" + getOptionalNarrowedId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
