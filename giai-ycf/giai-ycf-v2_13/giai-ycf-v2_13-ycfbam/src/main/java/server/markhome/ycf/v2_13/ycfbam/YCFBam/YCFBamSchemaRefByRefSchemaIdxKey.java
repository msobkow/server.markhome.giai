// Description: Java 11 implementation of a SchemaRef by RefSchemaIdx index key object.

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

public class CFBamSchemaRefByRefSchemaIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalRefSchemaTenantId;
	protected Long optionalRefSchemaId;
	public CFBamSchemaRefByRefSchemaIdxKey() {
		optionalRefSchemaTenantId = null;
		optionalRefSchemaId = null;
	}

	public Long getOptionalRefSchemaTenantId() {
		return( optionalRefSchemaTenantId );
	}

	public void setOptionalRefSchemaTenantId( Long value ) {
		if( value == null ) {
			optionalRefSchemaTenantId = null;
		}
		else if( value < CFBamSchemaRefBuff.REFSCHEMATENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalRefSchemaTenantId",
				1,
				"value",
				value,
				CFBamSchemaRefBuff.REFSCHEMATENANTID_MIN_VALUE );
		}
		else {
			optionalRefSchemaTenantId = value;
		}
	}

	public Long getOptionalRefSchemaId() {
		return( optionalRefSchemaId );
	}

	public void setOptionalRefSchemaId( Long value ) {
		if( value == null ) {
			optionalRefSchemaId = null;
		}
		else if( value < CFBamSchemaRefBuff.REFSCHEMAID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalRefSchemaId",
				1,
				"value",
				value,
				CFBamSchemaRefBuff.REFSCHEMAID_MIN_VALUE );
		}
		else {
			optionalRefSchemaId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamSchemaRefByRefSchemaIdxKey ) {
			CFBamSchemaRefByRefSchemaIdxKey rhs = (CFBamSchemaRefByRefSchemaIdxKey)obj;
			if( getOptionalRefSchemaTenantId() != null ) {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					if( ! getOptionalRefSchemaTenantId().equals( rhs.getOptionalRefSchemaTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamSchemaRefBuff ) {
			CFBamSchemaRefBuff rhs = (CFBamSchemaRefBuff)obj;
			if( getOptionalRefSchemaTenantId() != null ) {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					if( ! getOptionalRefSchemaTenantId().equals( rhs.getOptionalRefSchemaTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
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
		if( getOptionalRefSchemaTenantId() != null ) {
			hashCode = hashCode + getOptionalRefSchemaTenantId().hashCode();
		}
		if( getOptionalRefSchemaId() != null ) {
			hashCode = hashCode + getOptionalRefSchemaId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamSchemaRefByRefSchemaIdxKey ) {
			CFBamSchemaRefByRefSchemaIdxKey rhs = (CFBamSchemaRefByRefSchemaIdxKey)obj;
			if( getOptionalRefSchemaTenantId() != null ) {
				Long lhsRefSchemaTenantId = getOptionalRefSchemaTenantId();
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					Long rhsRefSchemaTenantId = rhs.getOptionalRefSchemaTenantId();
					int cmp = lhsRefSchemaTenantId.compareTo( rhsRefSchemaTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				Long lhsRefSchemaId = getOptionalRefSchemaId();
				if( rhs.getOptionalRefSchemaId() != null ) {
					Long rhsRefSchemaId = rhs.getOptionalRefSchemaId();
					int cmp = lhsRefSchemaId.compareTo( rhsRefSchemaId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamSchemaRefBuff ) {
			CFBamSchemaRefBuff rhs = (CFBamSchemaRefBuff)obj;
			if( getOptionalRefSchemaTenantId() != null ) {
				Long lhsRefSchemaTenantId = getOptionalRefSchemaTenantId();
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					Long rhsRefSchemaTenantId = rhs.getOptionalRefSchemaTenantId();
					int cmp = lhsRefSchemaTenantId.compareTo( rhsRefSchemaTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				Long lhsRefSchemaId = getOptionalRefSchemaId();
				if( rhs.getOptionalRefSchemaId() != null ) {
					Long rhsRefSchemaId = rhs.getOptionalRefSchemaId();
					int cmp = lhsRefSchemaId.compareTo( rhsRefSchemaId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
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
		String ret = "<CFBamSchemaRefByRefSchemaIdx"
			+ " OptionalRefSchemaTenantId=" + ( ( getOptionalRefSchemaTenantId() == null ) ? "null" : "\"" + getOptionalRefSchemaTenantId().toString() + "\"" )
			+ " OptionalRefSchemaId=" + ( ( getOptionalRefSchemaId() == null ) ? "null" : "\"" + getOptionalRefSchemaId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
