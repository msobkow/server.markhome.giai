// Description: Java 25 JPA implementation of a DelSubDep1 by DelTopDepIdx index key object.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.intnet.intnet.jpa;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

public class BusModelJpaDelSubDep1ByDelTopDepIdxKey
	implements IBusModelDelSubDep1ByDelTopDepIdxKey, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredDelTopDepId;
	public BusModelJpaDelSubDep1ByDelTopDepIdxKey() {
		requiredDelTopDepId = CFDbKeyHash256.fromHex( IBusModelPubDelSubDep1.DELTOPDEPID_INIT_VALUE.toString() );
	}

	@Override
	public ICFKeyHash256 getRequiredDelTopDepId() {
		return(requiredDelTopDepId);
	}

	public void setRequiredDelTopDepId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredDelTopDepId",
				1,
				"value" );
		}
		requiredDelTopDepId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof IBusModelDelSubDep1ByDelTopDepIdxKey) {
			IBusModelDelSubDep1ByDelTopDepIdxKey rhs = (IBusModelDelSubDep1ByDelTopDepIdxKey)obj;
			if( getRequiredDelTopDepId() != null ) {
				if( rhs.getRequiredDelTopDepId() != null ) {
					if( ! getRequiredDelTopDepId().equals( rhs.getRequiredDelTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredDelTopDepId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelDelSubDep1) {
			IBusModelDelSubDep1 rhs = (IBusModelDelSubDep1)obj;
			if( getRequiredDelTopDepId() != null ) {
				if( rhs.getRequiredDelTopDepId() != null ) {
					if( ! getRequiredDelTopDepId().equals( rhs.getRequiredDelTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredDelTopDepId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelDelSubDep1H) {
			IBusModelDelSubDep1H rhs = (IBusModelDelSubDep1H)obj;
			if( getRequiredDelTopDepId() != null ) {
				if( rhs.getRequiredDelTopDepId() != null ) {
					if( ! getRequiredDelTopDepId().equals( rhs.getRequiredDelTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredDelTopDepId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getRequiredDelTopDepId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof IBusModelDelSubDep1ByDelTopDepIdxKey) {
			IBusModelDelSubDep1ByDelTopDepIdxKey rhs = (IBusModelDelSubDep1ByDelTopDepIdxKey)obj;
			if (getRequiredDelTopDepId() != null) {
				if (rhs.getRequiredDelTopDepId() != null) {
					cmp = getRequiredDelTopDepId().compareTo( rhs.getRequiredDelTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredDelTopDepId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelDelSubDep1) {
			IBusModelDelSubDep1 rhs = (IBusModelDelSubDep1)obj;
			if (getRequiredDelTopDepId() != null) {
				if (rhs.getRequiredDelTopDepId() != null) {
					cmp = getRequiredDelTopDepId().compareTo( rhs.getRequiredDelTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredDelTopDepId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelDelSubDep1H) {
			IBusModelDelSubDep1H rhs = (IBusModelDelSubDep1H)obj;
			if (getRequiredDelTopDepId() != null) {
				if (rhs.getRequiredDelTopDepId() != null) {
					cmp = getRequiredDelTopDepId().compareTo( rhs.getRequiredDelTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredDelTopDepId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else {
			throw new CFUnsupportedClassException(getClass(),
				"compareTo",
				"obj",
				obj,
				"IBusModelDelSubDep1ByDelTopDepIdxKey, IBusModelDelSubDep1, IBusModelDelSubDep1H");
		}
	}

	public String getXmlAttrFragment() {
		String ret = "" 
			+ " RequiredDelTopDepId=" + "\"" + getRequiredDelTopDepId().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelDelSubDep1ByDelTopDepIdxKey" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
