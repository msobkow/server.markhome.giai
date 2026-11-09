// Description: Java 11 implementation of a IndexTweak buffer object.

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

public class CFBamIndexTweakBuff
	extends CFBamTweakBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a80b";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long INDEXID_INIT_VALUE = 0L;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long INDEXID_MIN_VALUE = 0L;
	protected long requiredIndexId;
	public CFBamIndexTweakBuff() {
		super();
		requiredIndexId = CFBamIndexTweakBuff.INDEXID_INIT_VALUE;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredIndexId() {
		return( requiredIndexId );
	}

	public void setRequiredIndexId( long value ) {
		if( value < CFBamIndexTweakBuff.INDEXID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredIndexId",
				1,
				"value",
				value,
				CFBamIndexTweakBuff.INDEXID_MIN_VALUE );
		}
		requiredIndexId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamIndexTweakBuff ) {
			CFBamIndexTweakBuff rhs = (CFBamIndexTweakBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredIndexId() != rhs.getRequiredIndexId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamTweakPKey ) {
			CFBamTweakPKey rhs = (CFBamTweakPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamIndexTweakHBuff ) {
			CFBamIndexTweakHBuff rhs = (CFBamIndexTweakHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredIndexId() != rhs.getRequiredIndexId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamTweakHPKey ) {
			CFBamTweakHPKey rhs = (CFBamTweakHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamIndexTweakByIndexIdxKey ) {
			CFBamIndexTweakByIndexIdxKey rhs = (CFBamIndexTweakByIndexIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredIndexId() != rhs.getRequiredIndexId() ) {
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
		hashCode = hashCode + (int)( getRequiredIndexId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamIndexTweakBuff ) {
			CFBamIndexTweakBuff rhs = (CFBamIndexTweakBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredIndexId() < rhs.getRequiredIndexId() ) {
				return( -1 );
			}
			else if( getRequiredIndexId() > rhs.getRequiredIndexId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamTweakPKey ) {
			CFBamTweakPKey rhs = (CFBamTweakPKey)obj;
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
		else if( obj instanceof CFBamTweakHPKey ) {
			CFBamTweakHPKey rhs = (CFBamTweakHPKey)obj;
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
		else if( obj instanceof CFBamIndexTweakHBuff ) {
			CFBamIndexTweakHBuff rhs = (CFBamIndexTweakHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredIndexId() < rhs.getRequiredIndexId() ) {
				return( -1 );
			}
			else if( getRequiredIndexId() > rhs.getRequiredIndexId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamIndexTweakByIndexIdxKey ) {
			CFBamIndexTweakByIndexIdxKey rhs = (CFBamIndexTweakByIndexIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredIndexId() < rhs.getRequiredIndexId() ) {
				return( -1 );
			}
			else if( getRequiredIndexId() > rhs.getRequiredIndexId() ) {
				return( 1 );
			}			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFBamTweakBuff src ) {
		if( src instanceof CFBamIndexTweakBuff ) {
			setIndexTweakBuff( (CFBamIndexTweakBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamIndexTweakBuff" );
		}
	}

	public void setIndexTweakBuff( CFBamIndexTweakBuff src ) {
		super.setTweakBuff( src );
		setRequiredIndexId( src.getRequiredIndexId() );
	}

	public void set( CFBamTweakHBuff src ) {
		if( src instanceof CFBamIndexTweakHBuff ) {
			setIndexTweakBuff( (CFBamIndexTweakHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamIndexTweakHBuff" );
		}
	}

	public void setIndexTweakBuff( CFBamIndexTweakHBuff src ) {
		super.setTweakBuff( src );
		setRequiredIndexId( src.getRequiredIndexId() );
	}
}
