// Description: Java 25 JPA implementation of a SecUserPWHistory by ReplacedStampIdx index key object.

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

public class SecureJpaSecUserPWHistoryByReplacedStampIdxKey
	implements ISecureSecUserPWHistoryByReplacedStampIdxKey, Comparable<Object>, Serializable
{
	protected LocalDateTime requiredPWReplacedStamp;
	public SecureJpaSecUserPWHistoryByReplacedStampIdxKey() {
		requiredPWReplacedStamp = CFXmlUtil.parseTimestamp("2020-01-01T00:00:00");
	}

	@Override
	public LocalDateTime getRequiredPWReplacedStamp() {
		return(requiredPWReplacedStamp);
	}

	public void setRequiredPWReplacedStamp( LocalDateTime value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredPWReplacedStamp",
				1,
				"value" );
		}
		requiredPWReplacedStamp = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureSecUserPWHistoryByReplacedStampIdxKey) {
			ISecureSecUserPWHistoryByReplacedStampIdxKey rhs = (ISecureSecUserPWHistoryByReplacedStampIdxKey)obj;
			if( getRequiredPWReplacedStamp() != null ) {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					if( ! getRequiredPWReplacedStamp().equals( rhs.getRequiredPWReplacedStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserPWHistory) {
			ISecureSecUserPWHistory rhs = (ISecureSecUserPWHistory)obj;
			if( getRequiredPWReplacedStamp() != null ) {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					if( ! getRequiredPWReplacedStamp().equals( rhs.getRequiredPWReplacedStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecUserPWHistoryH) {
			ISecureSecUserPWHistoryH rhs = (ISecureSecUserPWHistoryH)obj;
			if( getRequiredPWReplacedStamp() != null ) {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					if( ! getRequiredPWReplacedStamp().equals( rhs.getRequiredPWReplacedStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
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
		if( getRequiredPWReplacedStamp() != null ) {
			hashCode = hashCode + getRequiredPWReplacedStamp().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSecUserPWHistoryByReplacedStampIdxKey) {
			ISecureSecUserPWHistoryByReplacedStampIdxKey rhs = (ISecureSecUserPWHistoryByReplacedStampIdxKey)obj;
			if (getRequiredPWReplacedStamp() != null) {
				if (rhs.getRequiredPWReplacedStamp() != null) {
					cmp = getRequiredPWReplacedStamp().compareTo( rhs.getRequiredPWReplacedStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWReplacedStamp() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecUserPWHistory) {
			ISecureSecUserPWHistory rhs = (ISecureSecUserPWHistory)obj;
			if (getRequiredPWReplacedStamp() != null) {
				if (rhs.getRequiredPWReplacedStamp() != null) {
					cmp = getRequiredPWReplacedStamp().compareTo( rhs.getRequiredPWReplacedStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWReplacedStamp() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecUserPWHistoryH) {
			ISecureSecUserPWHistoryH rhs = (ISecureSecUserPWHistoryH)obj;
			if (getRequiredPWReplacedStamp() != null) {
				if (rhs.getRequiredPWReplacedStamp() != null) {
					cmp = getRequiredPWReplacedStamp().compareTo( rhs.getRequiredPWReplacedStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWReplacedStamp() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else {
			throw new CFUnsupportedClassException(getClass(),
				"compareTo",
				"obj",
				obj,
				"ISecureSecUserPWHistoryByReplacedStampIdxKey, ISecureSecUserPWHistory, ISecureSecUserPWHistoryH");
		}
	}

	public String getXmlAttrFragment() {
		String ret = "" 
			+ " RequiredPWReplacedStamp=" + "\"" + getRequiredPWReplacedStamp().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureSecUserPWHistoryByReplacedStampIdxKey" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
