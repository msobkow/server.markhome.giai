// Description: Java 25 JPA implementation of a ISOTZone by OffsetIdx index key object.

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

package server.markhome.ycf.v3_1.secure.secure.jpa;

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
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

public class SecureJpaISOTZoneByOffsetIdxKey
	implements ISecureISOTZoneByOffsetIdxKey, Comparable<Object>, Serializable
{
	protected short requiredTZHourOffset;
	protected short requiredTZMinOffset;
	public SecureJpaISOTZoneByOffsetIdxKey() {
		requiredTZHourOffset = ISecurePubISOTZone.TZHOUROFFSET_INIT_VALUE;
		requiredTZMinOffset = ISecurePubISOTZone.TZMINOFFSET_INIT_VALUE;
	}

	@Override
	public short getRequiredTZHourOffset() {
		return(requiredTZHourOffset);
	}

	@Override
	public void setRequiredTZHourOffset( short value ) {
		if( value < ISecurePubISOTZone.TZHOUROFFSET_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredTZHourOffset",
				1,
				"value",
				value,
				ISecurePubISOTZone.TZHOUROFFSET_MIN_VALUE );
		}
		if( value > ISecurePubISOTZone.TZHOUROFFSET_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredTZHourOffset",
				1,
				"value",
				value,
				ISecurePubISOTZone.TZHOUROFFSET_MAX_VALUE );
		}
		requiredTZHourOffset = value;
	}

	@Override
	public short getRequiredTZMinOffset() {
		return(requiredTZMinOffset);
	}

	@Override
	public void setRequiredTZMinOffset( short value ) {
		if( value < ISecurePubISOTZone.TZMINOFFSET_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredTZMinOffset",
				1,
				"value",
				value,
				ISecurePubISOTZone.TZMINOFFSET_MIN_VALUE );
		}
		if( value > ISecurePubISOTZone.TZMINOFFSET_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredTZMinOffset",
				1,
				"value",
				value,
				ISecurePubISOTZone.TZMINOFFSET_MAX_VALUE );
		}
		requiredTZMinOffset = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureISOTZoneByOffsetIdxKey) {
			ISecureISOTZoneByOffsetIdxKey rhs = (ISecureISOTZoneByOffsetIdxKey)obj;
			if( getRequiredTZHourOffset() != rhs.getRequiredTZHourOffset() ) {
				return( false );
			}
			if( getRequiredTZMinOffset() != rhs.getRequiredTZMinOffset() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureISOTZone) {
			ISecureISOTZone rhs = (ISecureISOTZone)obj;
			if( getRequiredTZHourOffset() != rhs.getRequiredTZHourOffset() ) {
				return( false );
			}
			if( getRequiredTZMinOffset() != rhs.getRequiredTZMinOffset() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureISOTZoneH) {
			ISecureISOTZoneH rhs = (ISecureISOTZoneH)obj;
			if( getRequiredTZHourOffset() != rhs.getRequiredTZHourOffset() ) {
				return( false );
			}
			if( getRequiredTZMinOffset() != rhs.getRequiredTZMinOffset() ) {
				return( false );
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
		hashCode = ( hashCode * 0x10000 ) + getRequiredTZHourOffset();
		hashCode = ( hashCode * 0x10000 ) + getRequiredTZMinOffset();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureISOTZoneByOffsetIdxKey) {
			ISecureISOTZoneByOffsetIdxKey rhs = (ISecureISOTZoneByOffsetIdxKey)obj;
			if( getRequiredTZHourOffset() < rhs.getRequiredTZHourOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZHourOffset() > rhs.getRequiredTZHourOffset() ) {
				return( 1 );
			}
			if( getRequiredTZMinOffset() < rhs.getRequiredTZMinOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZMinOffset() > rhs.getRequiredTZMinOffset() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureISOTZone) {
			ISecureISOTZone rhs = (ISecureISOTZone)obj;
			if( getRequiredTZHourOffset() < rhs.getRequiredTZHourOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZHourOffset() > rhs.getRequiredTZHourOffset() ) {
				return( 1 );
			}
			if( getRequiredTZMinOffset() < rhs.getRequiredTZMinOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZMinOffset() > rhs.getRequiredTZMinOffset() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureISOTZoneH) {
			ISecureISOTZoneH rhs = (ISecureISOTZoneH)obj;
			if( getRequiredTZHourOffset() < rhs.getRequiredTZHourOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZHourOffset() > rhs.getRequiredTZHourOffset() ) {
				return( 1 );
			}
			if( getRequiredTZMinOffset() < rhs.getRequiredTZMinOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZMinOffset() > rhs.getRequiredTZMinOffset() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFUnsupportedClassException(getClass(),
				"compareTo",
				"obj",
				obj,
				"ISecureISOTZoneByOffsetIdxKey, ISecureISOTZone, ISecureISOTZoneH");
		}
	}

	public String getXmlAttrFragment() {
		String ret = "" 
			+ " RequiredTZHourOffset=" + "\"" + Short.toString( getRequiredTZHourOffset() ) + "\""
			+ " RequiredTZMinOffset=" + "\"" + Short.toString( getRequiredTZMinOffset() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureISOTZoneByOffsetIdxKey" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
