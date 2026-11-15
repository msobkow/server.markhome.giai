// Description: Java 25 implementation of a SecUserPWHistory buffer

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

package server.markhome.ycf.v3_1.secure.secure.buff;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;

public class SecureBuffSecUserPWHistory
	implements ISecureSecUserPWHistory, Comparable<Object>, Serializable
{
	protected ISecureSecUserPWHistoryPKey pkey = new SecureBuffSecUserPWHistoryPKey();
	protected int requiredRevision;
	protected LocalDateTime requiredPWReplacedStamp;
	protected String requiredPasswordHash;

	public BusModelBuffSecUserPWHistory() {
		pkey = new SecureBuffSecUserPWHistoryPKey();
		requiredPWReplacedStamp = CFXmlUtil.parseTimestamp("2020-01-01T00:00:00");
	}

	@Override
	public ISecureSecUserPWHistoryPKey getPKey() {
		return(pkey);
	}

	@Override
	public void setPKey(ISecureSecUserPWHistoryPKey pkey ) {
		if (pkey == null) {
			throw new CFNullArgumentException(getClass(), "setPKey", 1, "pkey");
		}
		else {
			this.pkey = pkey;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredSecUserId() {
		return(getPKey().getRequiredSecUserId());
	}

	public void setRequiredSecUserId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecUserId",
				1,
				"value" );
		}
		getPKey().setRequiredSecUserId(value);
	}

	@Override
	public LocalDateTime getRequiredPWSetStamp() {
		return(getPKey().getRequiredPWSetStamp());
	}

	public void setRequiredPWSetStamp( LocalDateTime value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredPWSetStamp",
				1,
				"value" );
		}
		getPKey().setRequiredPWSetStamp(value);
	}

	@Override
	public int getRequiredRevision() {
		return( requiredRevision );
	}

	@Override
	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	@Override
	public int getClassCode() {
		return( ISecureSecUserPWHistory.CLASS_CODE );
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
	public String getRequiredPasswordHash() {
		return(requiredPasswordHash);
	}

	public void setRequiredPasswordHash( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredPasswordHash",
				1,
				"value" );
		}
		else if( value.length() > 256 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredPasswordHash",
				1,
				"value.length()",
				value.length(),
				256 );
		}
		requiredPasswordHash = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureSecUserPWHistory rhs ) {
			if( getRequiredSecUserId() != null ) {
				if( rhs.getRequiredSecUserId() != null ) {
					if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecUserId() != null ) {
					return( false );
				}
			}
			if( getRequiredPWSetStamp() != null ) {
				if( rhs.getRequiredPWSetStamp() != null ) {
					if( ! getRequiredPWSetStamp().equals( rhs.getRequiredPWSetStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWSetStamp() != null ) {
					return( false );
				}
			}
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
			if( getRequiredPasswordHash() != null ) {
				if( rhs.getRequiredPasswordHash() != null ) {
					if( ! getRequiredPasswordHash().equals( rhs.getRequiredPasswordHash() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordHash() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureSecUserPWHistoryH rhs ) {
			if( getRequiredSecUserId() != null ) {
				if( rhs.getRequiredSecUserId() != null ) {
					if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecUserId() != null ) {
					return( false );
				}
			}
			if( getRequiredPWSetStamp() != null ) {
				if( rhs.getRequiredPWSetStamp() != null ) {
					if( ! getRequiredPWSetStamp().equals( rhs.getRequiredPWSetStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWSetStamp() != null ) {
					return( false );
				}
			}
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
			if( getRequiredPasswordHash() != null ) {
				if( rhs.getRequiredPasswordHash() != null ) {
					if( ! getRequiredPasswordHash().equals( rhs.getRequiredPasswordHash() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordHash() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureSecUserPWHistoryHPKey ) {
			ISecureSecUserPWHistoryHPKey rhs = (ISecureSecUserPWHistoryHPKey)obj;
			if( getRequiredSecUserId() != null ) {
				if( rhs.getRequiredSecUserId() != null ) {
					if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecUserId() != null ) {
					return( false );
				}
			}
			if( getRequiredPWSetStamp() != null ) {
				if( rhs.getRequiredPWSetStamp() != null ) {
					if( ! getRequiredPWSetStamp().equals( rhs.getRequiredPWSetStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWSetStamp() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureSecUserPWHistoryByUserIdxKey rhs ) {
			if( getRequiredSecUserId() != null ) {
				if( rhs.getRequiredSecUserId() != null ) {
					if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecUserId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureSecUserPWHistoryBySetStampIdxKey rhs ) {
			if( getRequiredPWSetStamp() != null ) {
				if( rhs.getRequiredPWSetStamp() != null ) {
					if( ! getRequiredPWSetStamp().equals( rhs.getRequiredPWSetStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWSetStamp() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureSecUserPWHistoryByReplacedStampIdxKey rhs ) {
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
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getRequiredPWSetStamp() != null ) {
			hashCode = hashCode + getRequiredPWSetStamp().hashCode();
		}
		if( getRequiredPWReplacedStamp() != null ) {
			hashCode = hashCode + getRequiredPWReplacedStamp().hashCode();
		}
		if( getRequiredPasswordHash() != null ) {
			hashCode = hashCode + getRequiredPasswordHash().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecureSecUserPWHistory rhs ) {
			cmp = 0;
			if (getRequiredSecUserId() != null) {
				if (rhs.getRequiredSecUserId() != null) {
					cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecUserId() != null) {
				return( -1 );
			}
			if (getRequiredPWSetStamp() != null) {
				if (rhs.getRequiredPWSetStamp() != null) {
					cmp = getRequiredPWSetStamp().compareTo( rhs.getRequiredPWSetStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWSetStamp() != null) {
				return( -1 );
			}
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
			if (getRequiredPasswordHash() != null) {
				if (rhs.getRequiredPasswordHash() != null) {
					cmp = getRequiredPasswordHash().compareTo( rhs.getRequiredPasswordHash() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordHash() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureSecUserPWHistoryHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredSecUserId() != null) {
				if (rhs.getRequiredSecUserId() != null) {
					cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecUserId() != null) {
				return( -1 );
			}
			if (getRequiredPWSetStamp() != null) {
				if (rhs.getRequiredPWSetStamp() != null) {
					cmp = getRequiredPWSetStamp().compareTo( rhs.getRequiredPWSetStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWSetStamp() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureSecUserPWHistoryH rhs ) {
			cmp = 0;
			if (getRequiredSecUserId() != null) {
				if (rhs.getRequiredSecUserId() != null) {
					cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecUserId() != null) {
				return( -1 );
			}
			if (getRequiredPWSetStamp() != null) {
				if (rhs.getRequiredPWSetStamp() != null) {
					cmp = getRequiredPWSetStamp().compareTo( rhs.getRequiredPWSetStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWSetStamp() != null) {
				return( -1 );
			}
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
			if (getRequiredPasswordHash() != null) {
				if (rhs.getRequiredPasswordHash() != null) {
					cmp = getRequiredPasswordHash().compareTo( rhs.getRequiredPasswordHash() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordHash() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureSecUserPWHistoryByUserIdxKey rhs ) {
			if (getRequiredSecUserId() != null) {
				if (rhs.getRequiredSecUserId() != null) {
					cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecUserId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureSecUserPWHistoryBySetStampIdxKey rhs ) {
			if (getRequiredPWSetStamp() != null) {
				if (rhs.getRequiredPWSetStamp() != null) {
					cmp = getRequiredPWSetStamp().compareTo( rhs.getRequiredPWSetStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWSetStamp() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureSecUserPWHistoryByReplacedStampIdxKey rhs ) {
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
			}			return( 0 );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	@Override
	public void set( ISecureSecUserPWHistory src ) {
		setSecUserPWHistory( src );
	}

	@Override
	public void setSecUserPWHistory( ISecureSecUserPWHistory src ) {
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredPWSetStamp(src.getRequiredPWSetStamp());
		setRequiredRevision( src.getRequiredRevision() );
		setRequiredPWReplacedStamp(src.getRequiredPWReplacedStamp());
		setRequiredPasswordHash(src.getRequiredPasswordHash());
	}

	@Override
	public void set( ISecureSecUserPWHistoryH src ) {
		setSecUserPWHistory( src );
	}

	@Override
	public void setSecUserPWHistory( ISecureSecUserPWHistoryH src ) {
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredPWSetStamp(src.getRequiredPWSetStamp());
		setRequiredPWReplacedStamp(src.getRequiredPWReplacedStamp());
		setRequiredPasswordHash(src.getRequiredPasswordHash());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment() 
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " RequiredPWSetStamp=" + "\"" + getRequiredPWSetStamp().toString() + "\""
			+ " RequiredPWReplacedStamp=" + "\"" + getRequiredPWReplacedStamp().toString() + "\""
			+ " RequiredPasswordHash=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredPasswordHash() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureBuffSecUserPWHistory" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
