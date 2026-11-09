// Description: Java 11 implementation of a Id64Gen buffer object.

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

public class CFBamId64GenBuff
	extends CFBamInt64TypeBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a877";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long DISPENSERTENANTID_INIT_VALUE = 0L;
	public static final long DISPENSERID_INIT_VALUE = 0L;
	public static final short SLICE_INIT_VALUE = (short)0;
	public static final long BLOCKSIZE_INIT_VALUE = 1L;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long DISPENSERTENANTID_MIN_VALUE = 0L;
	public static final long DISPENSERID_MIN_VALUE = 0L;
	public static final short SLICE_MIN_VALUE = (short)0;
	public static final long BLOCKSIZE_MIN_VALUE = 1L;
	public static final short SLICE_MAX_VALUE = (short)32767;
	public static final long BLOCKSIZE_MAX_VALUE = 9223372036854775807L;
	protected Long optionalDispenserTenantId;
	protected Long optionalDispenserId;
	protected short requiredSlice;
	protected long requiredBlockSize;
	public CFBamId64GenBuff() {
		super();
		optionalDispenserTenantId = null;
		optionalDispenserId = null;
		requiredSlice = CFBamId64GenBuff.SLICE_INIT_VALUE;
		requiredBlockSize = CFBamId64GenBuff.BLOCKSIZE_INIT_VALUE;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public Long getOptionalDispenserTenantId() {
		return( optionalDispenserTenantId );
	}

	public void setOptionalDispenserTenantId( Long value ) {
		if( value == null ) {
			optionalDispenserTenantId = null;
		}
		else if( value < CFBamId64GenBuff.DISPENSERTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalDispenserTenantId",
				1,
				"value",
				value,
				CFBamId64GenBuff.DISPENSERTENANTID_MIN_VALUE );
		}
		else {
			optionalDispenserTenantId = value;
		}
	}

	public Long getOptionalDispenserId() {
		return( optionalDispenserId );
	}

	public void setOptionalDispenserId( Long value ) {
		if( value == null ) {
			optionalDispenserId = null;
		}
		else if( value < CFBamId64GenBuff.DISPENSERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalDispenserId",
				1,
				"value",
				value,
				CFBamId64GenBuff.DISPENSERID_MIN_VALUE );
		}
		else {
			optionalDispenserId = value;
		}
	}

	public short getRequiredSlice() {
		return( requiredSlice );
	}

	public void setRequiredSlice( short value ) {
		if( value < CFBamId64GenBuff.SLICE_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSlice",
				1,
				"value",
				value,
				CFBamId64GenBuff.SLICE_MIN_VALUE );
		}
		if( value > CFBamId64GenBuff.SLICE_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredSlice",
				1,
				"value",
				value,
				CFBamId64GenBuff.SLICE_MAX_VALUE );
		}
		requiredSlice = value;
	}

	public long getRequiredBlockSize() {
		return( requiredBlockSize );
	}

	public void setRequiredBlockSize( long value ) {
		if( value < CFBamId64GenBuff.BLOCKSIZE_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredBlockSize",
				1,
				"value",
				value,
				CFBamId64GenBuff.BLOCKSIZE_MIN_VALUE );
		}
		if( value > CFBamId64GenBuff.BLOCKSIZE_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredBlockSize",
				1,
				"value",
				value,
				CFBamId64GenBuff.BLOCKSIZE_MAX_VALUE );
		}
		requiredBlockSize = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamId64GenBuff ) {
			CFBamId64GenBuff rhs = (CFBamId64GenBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalDispenserTenantId() != null ) {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					if( ! getOptionalDispenserTenantId().equals( rhs.getOptionalDispenserTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDispenserId() != null ) {
				if( rhs.getOptionalDispenserId() != null ) {
					if( ! getOptionalDispenserId().equals( rhs.getOptionalDispenserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( false );
				}
			}
			if( getRequiredSlice() != rhs.getRequiredSlice() ) {
				return( false );
			}
			if( getRequiredBlockSize() != rhs.getRequiredBlockSize() ) {
				return( false );
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
		else if( obj instanceof CFBamId64GenHBuff ) {
			CFBamId64GenHBuff rhs = (CFBamId64GenHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalDispenserTenantId() != null ) {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					if( ! getOptionalDispenserTenantId().equals( rhs.getOptionalDispenserTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDispenserId() != null ) {
				if( rhs.getOptionalDispenserId() != null ) {
					if( ! getOptionalDispenserId().equals( rhs.getOptionalDispenserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( false );
				}
			}
			if( getRequiredSlice() != rhs.getRequiredSlice() ) {
				return( false );
			}
			if( getRequiredBlockSize() != rhs.getRequiredBlockSize() ) {
				return( false );
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
		else if( obj instanceof CFBamId64GenByDispIdxKey ) {
			CFBamId64GenByDispIdxKey rhs = (CFBamId64GenByDispIdxKey)obj;
			if( getOptionalDispenserTenantId() != null ) {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					if( ! getOptionalDispenserTenantId().equals( rhs.getOptionalDispenserTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDispenserId() != null ) {
				if( rhs.getOptionalDispenserId() != null ) {
					if( ! getOptionalDispenserId().equals( rhs.getOptionalDispenserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( false );
				}
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
		if( getOptionalDispenserTenantId() != null ) {
			hashCode = hashCode + getOptionalDispenserTenantId().hashCode();
		}
		if( getOptionalDispenserId() != null ) {
			hashCode = hashCode + getOptionalDispenserId().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredSlice();
		hashCode = hashCode + (int)( getRequiredBlockSize() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamId64GenBuff ) {
			CFBamId64GenBuff rhs = (CFBamId64GenBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getOptionalDispenserTenantId() != null ) {
				Long lhsDispenserTenantId = getOptionalDispenserTenantId();
				if( rhs.getOptionalDispenserTenantId() != null ) {
					Long rhsDispenserTenantId = rhs.getOptionalDispenserTenantId();
					int cmp = lhsDispenserTenantId.compareTo( rhsDispenserTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDispenserId() != null ) {
				Long lhsDispenserId = getOptionalDispenserId();
				if( rhs.getOptionalDispenserId() != null ) {
					Long rhsDispenserId = rhs.getOptionalDispenserId();
					int cmp = lhsDispenserId.compareTo( rhsDispenserId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredSlice() < rhs.getRequiredSlice() ) {
				return( -1 );
			}
			else if( getRequiredSlice() > rhs.getRequiredSlice() ) {
				return( 1 );
			}
			if( getRequiredBlockSize() < rhs.getRequiredBlockSize() ) {
				return( -1 );
			}
			else if( getRequiredBlockSize() > rhs.getRequiredBlockSize() ) {
				return( 1 );
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
		else if( obj instanceof CFBamId64GenHBuff ) {
			CFBamId64GenHBuff rhs = (CFBamId64GenHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getOptionalDispenserTenantId() != null ) {
				Long lhsDispenserTenantId = getOptionalDispenserTenantId();
				if( rhs.getOptionalDispenserTenantId() != null ) {
					Long rhsDispenserTenantId = rhs.getOptionalDispenserTenantId();
					int cmp = lhsDispenserTenantId.compareTo( rhsDispenserTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDispenserId() != null ) {
				Long lhsDispenserId = getOptionalDispenserId();
				if( rhs.getOptionalDispenserId() != null ) {
					Long rhsDispenserId = rhs.getOptionalDispenserId();
					int cmp = lhsDispenserId.compareTo( rhsDispenserId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredSlice() < rhs.getRequiredSlice() ) {
				return( -1 );
			}
			else if( getRequiredSlice() > rhs.getRequiredSlice() ) {
				return( 1 );
			}
			if( getRequiredBlockSize() < rhs.getRequiredBlockSize() ) {
				return( -1 );
			}
			else if( getRequiredBlockSize() > rhs.getRequiredBlockSize() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamId64GenByDispIdxKey ) {
			CFBamId64GenByDispIdxKey rhs = (CFBamId64GenByDispIdxKey)obj;

			if( getOptionalDispenserTenantId() != null ) {
				Long lhsDispenserTenantId = getOptionalDispenserTenantId();
				if( rhs.getOptionalDispenserTenantId() != null ) {
					Long rhsDispenserTenantId = rhs.getOptionalDispenserTenantId();
					int cmp = lhsDispenserTenantId.compareTo( rhsDispenserTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDispenserId() != null ) {
				Long lhsDispenserId = getOptionalDispenserId();
				if( rhs.getOptionalDispenserId() != null ) {
					Long rhsDispenserId = rhs.getOptionalDispenserId();
					int cmp = lhsDispenserId.compareTo( rhsDispenserId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFBamValueBuff src ) {
		if( src instanceof CFBamId64GenBuff ) {
			setId64GenBuff( (CFBamId64GenBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamId64GenBuff" );
		}
	}

	public void setId64GenBuff( CFBamId64GenBuff src ) {
		super.setInt64TypeBuff( src );
		setOptionalDispenserTenantId( src.getOptionalDispenserTenantId() );
		setOptionalDispenserId( src.getOptionalDispenserId() );
		setRequiredSlice( src.getRequiredSlice() );
		setRequiredBlockSize( src.getRequiredBlockSize() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamId64GenHBuff ) {
			setId64GenBuff( (CFBamId64GenHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamId64GenHBuff" );
		}
	}

	public void setId64GenBuff( CFBamId64GenHBuff src ) {
		super.setInt64TypeBuff( src );
		setOptionalDispenserTenantId( src.getOptionalDispenserTenantId() );
		setOptionalDispenserId( src.getOptionalDispenserId() );
		setRequiredSlice( src.getRequiredSlice() );
		setRequiredBlockSize( src.getRequiredBlockSize() );
	}
}
