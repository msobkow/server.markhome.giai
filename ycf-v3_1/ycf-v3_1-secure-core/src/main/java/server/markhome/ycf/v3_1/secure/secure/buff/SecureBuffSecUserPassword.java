// Description: Java 25 implementation of a SecUserPassword buffer

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

public class SecureBuffSecUserPassword
	implements ISecureSecUserPassword, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredSecUserId;
	protected int requiredRevision;
	protected LocalDateTime requiredPWSetStamp;
	protected String requiredPasswordHash;

	public BusModelBuffSecUserPassword() {
		requiredSecUserId = CFDbKeyHash256.fromHex( ISecureSecUserPassword.SECUSERID_INIT_VALUE.toString() );
		requiredPWSetStamp = CFXmlUtil.parseTimestamp("2020-01-01T00:00:00");
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return (requiredSecUserId);
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredSecUserId) {
		if(requiredSecUserId != null) {
			this.requiredSecUserId = requiredSecUserId;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredSecUserId() {
		return(requiredSecUserId);
	}

	public void setRequiredSecUserId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecUserId",
				1,
				"value" );
		}
		requiredSecUserId = value;
	}

	@Override
	public ISecureSecUser getRequiredContainerUser() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerUser", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecUserTable targetTable = targetBackingSecure.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerUser", 0, "ISecureSchema.getBackingSecure().getTableSecUser()");
		}
		ISecureSecUser targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecUserId());
		return(targetRec);
	}

	@Override
	public ISecureSecUser getRequiredContainerUser() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerUser", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecUserTable targetTable = targetBackingSecure.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerUser", 0, "ISecureSchema.getBackingSecure().getTableSecUser()");
		}
		ISecureSecUser targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecUserId());
		return(targetRec);
	}

	@Override
	public ISecureSecUser getRequiredContainerUser() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerUser", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecUserTable targetTable = targetBackingSecure.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerUser", 0, "ISecureSchema.getBackingSecure().getTableSecUser()");
		}
		ISecurePubSecUser targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecUserId());
		return(targetRec);
	}

	@Override
	public void setRequiredContainerUser(ISecureSecUser argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerUser", 1, "argObj");
		}
		else {
			setRequiredSecUserId(argObj.getRequiredSecUserId());
		}
	}

	@Override
	public void setRequiredContainerUser(ISecureProtSecUser argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerUser", 1, "argObj");
		}
		else {
			setRequiredSecUserId(argObj.getRequiredSecUserId());
		}
	}

	@Override
	public void setRequiredContainerUser(ISecurePubSecUser argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerUser", 1, "argObj");
		}
		else {
			setRequiredSecUserId(argObj.getRequiredSecUserId());
		}
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
		return( ISecureSecUserPassword.CLASS_CODE );
	}

	@Override
	public LocalDateTime getRequiredPWSetStamp() {
		return(requiredPWSetStamp);
	}

	public void setRequiredPWSetStamp( LocalDateTime value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredPWSetStamp",
				1,
				"value" );
		}
		requiredPWSetStamp = value;
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
		else if( obj instanceof ISecureSecUserPassword rhs ) {
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
		else if( obj instanceof ISecureSecUserPasswordH rhs ) {
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
		else if( obj instanceof ISecureSecUserPasswordHPKey ) {
			ISecureSecUserPasswordHPKey rhs = (ISecureSecUserPasswordHPKey)obj;
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
		else if( obj instanceof ISecureSecUserPasswordBySetStampIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecUserPassword rhs ) {
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
		else if( obj instanceof ISecureSecUserPasswordHPKey rhs ) {
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
			return( 0 );
		}
		else if( obj instanceof ISecureSecUserPasswordH rhs ) {
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
		else if( obj instanceof ISecureSecUserPasswordBySetStampIdxKey rhs ) {
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
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	@Override
	public void set( ISecureSecUserPassword src ) {
		setSecUserPassword( src );
	}

	@Override
	public void setSecUserPassword( ISecureSecUserPassword src ) {
		setRequiredContainerUser(src.getRequiredContainerUser());
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredRevision( src.getRequiredRevision() );
		setRequiredPWSetStamp(src.getRequiredPWSetStamp());
		setRequiredPasswordHash(src.getRequiredPasswordHash());
	}

	@Override
	public void set( ISecureSecUserPasswordH src ) {
		setSecUserPassword( src );
	}

	@Override
	public void setSecUserPassword( ISecureSecUserPasswordH src ) {
		setRequiredContainerUser(src.getRequiredContainerUser());
		setRequiredSecUserId(src.getRequiredSecUserId());
		setRequiredPWSetStamp(src.getRequiredPWSetStamp());
		setRequiredPasswordHash(src.getRequiredPasswordHash());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " RequiredPWSetStamp=" + "\"" + getRequiredPWSetStamp().toString() + "\""
			+ " RequiredPasswordHash=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredPasswordHash() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureBuffSecUserPassword" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
