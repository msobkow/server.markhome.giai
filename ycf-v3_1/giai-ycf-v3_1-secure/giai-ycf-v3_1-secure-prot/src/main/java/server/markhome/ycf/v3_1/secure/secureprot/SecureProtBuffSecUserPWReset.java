// Description: Java 17 implJustProtementation of a SecUserPWReset buffer

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

public class SecureProtBuffSecUserPWReset
	implements ISecureProtSecUserPWReset, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredSecUserId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected String requiredSentToEMailAddr;
	protected ICFUuid6 requiredPasswordResetUuid6;
	protected boolean requiredNewAccount;

	public BusModelProtBuffSecUserPWReset() {
		requiredSecUserId = CFDbKeyHash256.fromHex( ISecureProtSecUserPWReset.SECUSERID_INIT_VALUE.toString() );
		requiredSentToEMailAddr = ISecureProtSecUserPWReset.SENTTOEMAILADDR_INIT_VALUE;
		requiredNewAccount = ISecureProtSecUserPWReset.NEWACCOUNT_INIT_VALUE;
	}

	@Override
	public ICFKeyHash256 getPKey() {
		return (requiredSecUserId);
	}

	@Override
	public void setPKey(ICFKeyHash256 requiredSecUserId) {
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
	public ISecureProtSecUser getRequiredContainerUser(ICFKeyHash256 argSecUserId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerUser", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecUserTable targetTable = targetBackingSecure.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerUser", 0, "ISecureProtSchema.getBackingSecure().getTableSecUser()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecUserId()));
	}

	@Override
	public void setRequiredContainerUser(ICFKeyHash256 argSecUserId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerUser-args", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecUserTable targetTable = targetBackingSecure.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerUser", 0, "ISecureSchema.getBackingSecure().getTableSecUser()");
		}
		ISecureProtSecUser found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSecUserId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerUser-args", 0, "found");
		}
		else if (found instanceof ISecureProtSecUser) || (found instanceof ISecureProtSecUser) || (found instanceof ISecurePubSecUser)) {
			super.setRequiredContainerUser(argSecUserId);
		requiredSecUserId = argSecUserId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerUser-args", "found", found, "ISecureProtSecUserISecureProtSecUserISecurePubSecUser");
		}
	}

	@Override
	public void setRequiredContainerUser(ISecureProtSecUser argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerUser", 1, "argObj");
		}
		else {
			setJustProtRequiredSecUserId(argObj.getRequiredSecUserId());
		}
	}

	@Override
	public void setRequiredContainerUser(ISecurePubSecUser argObj) {

	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setJustProtCreatedByUserId( CFDbKeyHash256 value ) {
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setJustProtCreatedAt( LocalDateTime value ) {
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setJustProtUpdatedByUserId( CFDbKeyHash256 value ) {
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setJustProtUpdatedAt( LocalDateTime value ) {
		updatedAt = value;
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
		return( ISecureProtSecUserPWReset.CLASS_CODE );
	}

	@Override
	public String getRequiredSentToEMailAddr() {
		return(requiredSentToEMailAddr);
	}

	public void setRequiredSentToEMailAddr( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSentToEMailAddr",
				1,
				"value" );
		}
		else if( value.length() > 512 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredSentToEMailAddr",
				1,
				"value.length()",
				value.length(),
				512 );
		}
		requiredSentToEMailAddr = value;
	}

	@Override
	public ICFUuid6 getRequiredPasswordResetUuid6() {
		return(requiredPasswordResetUuid6);
	}

	public void setRequiredPasswordResetUuid6( ICFUuid6 value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredPasswordResetUuid6",
				1,
				"value" );
		}
		requiredPasswordResetUuid6 = value;
	}

	@Override
	public boolean getRequiredNewAccount() {
		return(requiredNewAccount);
	}

	public void setRequiredNewAccount( boolean value ) {
		requiredNewAccount = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureProtSecUserPWReset rhs ) {
			if( ! getCreatedByUserId().equals( rhs.getCreatedByUserId() ) ) {
				return( false );
			}
			if( ! getCreatedAt().equals( rhs.getCreatedAt() ) ) {
				return( false );
			}
			if( ! getUpdatedByUserId().equals( rhs.getUpdatedByUserId() ) ) {
				return( false );
			}
			if( ! getUpdatedAt().equals( rhs.getUpdatedAt() ) ) {
				return( false );
			}
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
			if( getRequiredSentToEMailAddr() != null ) {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					if( ! getRequiredSentToEMailAddr().equals( rhs.getRequiredSentToEMailAddr() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					return( false );
				}
			}
			if( getRequiredPasswordResetUuid6() != null ) {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					if( ! getRequiredPasswordResetUuid6().equals( rhs.getRequiredPasswordResetUuid6() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					return( false );
				}
			}
			if( getRequiredNewAccount() != rhs.getRequiredNewAccount() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecUserPWResetH rhs ) {
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
			if( getRequiredSentToEMailAddr() != null ) {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					if( ! getRequiredSentToEMailAddr().equals( rhs.getRequiredSentToEMailAddr() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					return( false );
				}
			}
			if( getRequiredPasswordResetUuid6() != null ) {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					if( ! getRequiredPasswordResetUuid6().equals( rhs.getRequiredPasswordResetUuid6() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					return( false );
				}
			}
			if( getRequiredNewAccount() != rhs.getRequiredNewAccount() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecUserPWResetHPKey ) {
			ISecureProtSecUserPWResetHPKey rhs = (ISecureProtSecUserPWResetHPKey)obj;
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
		else if( obj instanceof ISecureProtSecUserPWResetByUUuid6IdxKey rhs ) {
			if( getRequiredPasswordResetUuid6() != null ) {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					if( ! getRequiredPasswordResetUuid6().equals( rhs.getRequiredPasswordResetUuid6() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecUserPWResetBySentEMAddrIdxKey rhs ) {
			if( getRequiredSentToEMailAddr() != null ) {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					if( ! getRequiredSentToEMailAddr().equals( rhs.getRequiredSentToEMailAddr() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecUserPWResetByNewAcctIdxKey rhs ) {
			if( getRequiredNewAccount() != rhs.getRequiredNewAccount() ) {
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
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getRequiredSentToEMailAddr() != null ) {
			hashCode = hashCode + getRequiredSentToEMailAddr().hashCode();
		}
		hashCode = hashCode + getRequiredPasswordResetUuid6().hashCode();
		if( getRequiredNewAccount() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecureProtSecUserPWReset rhs ) {
			cmp = 0;
			{
				cmp = getCreatedByUserId().compareTo( rhs.getCreatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getCreatedAt().compareTo( rhs.getCreatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedByUserId().compareTo( rhs.getUpdatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedAt().compareTo( rhs.getUpdatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}
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
			if (getRequiredSentToEMailAddr() != null) {
				if (rhs.getRequiredSentToEMailAddr() != null) {
					cmp = getRequiredSentToEMailAddr().compareTo( rhs.getRequiredSentToEMailAddr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSentToEMailAddr() != null) {
				return( -1 );
			}
			if (getRequiredPasswordResetUuid6() != null) {
				if (rhs.getRequiredPasswordResetUuid6() != null) {
					cmp = getRequiredPasswordResetUuid6().compareTo( rhs.getRequiredPasswordResetUuid6() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordResetUuid6() != null) {
				return( -1 );
			}
			if( getRequiredNewAccount() ) {
				if( ! rhs.getRequiredNewAccount() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredNewAccount() ) {
					return( -1 );
				}
			}
			return( 0 );
 		}
		else if( obj instanceof ISecureProtSecUserPWResetHPKey rhs ) {
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
		else if( obj instanceof ISecureProtSecUserPWResetH rhs ) {
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
			if (getRequiredSentToEMailAddr() != null) {
				if (rhs.getRequiredSentToEMailAddr() != null) {
					cmp = getRequiredSentToEMailAddr().compareTo( rhs.getRequiredSentToEMailAddr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSentToEMailAddr() != null) {
				return( -1 );
			}
			if (getRequiredPasswordResetUuid6() != null) {
				if (rhs.getRequiredPasswordResetUuid6() != null) {
					cmp = getRequiredPasswordResetUuid6().compareTo( rhs.getRequiredPasswordResetUuid6() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordResetUuid6() != null) {
				return( -1 );
			}
			if( getRequiredNewAccount() ) {
				if( ! rhs.getRequiredNewAccount() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredNewAccount() ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtSecUserPWResetByUUuid6IdxKey rhs ) {
			if (getRequiredPasswordResetUuid6() != null) {
				if (rhs.getRequiredPasswordResetUuid6() != null) {
					cmp = getRequiredPasswordResetUuid6().compareTo( rhs.getRequiredPasswordResetUuid6() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordResetUuid6() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtSecUserPWResetBySentEMAddrIdxKey rhs ) {
			if (getRequiredSentToEMailAddr() != null) {
				if (rhs.getRequiredSentToEMailAddr() != null) {
					cmp = getRequiredSentToEMailAddr().compareTo( rhs.getRequiredSentToEMailAddr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSentToEMailAddr() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtSecUserPWResetByNewAcctIdxKey rhs ) {
			if( getRequiredNewAccount() ) {
				if( ! rhs.getRequiredNewAccount() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredNewAccount() ) {
					return( -1 );
				}
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
	public void set( ISecureProtSecUserPWReset src ) {
		setJustProtSecUserPWReset( src );
	}

	@Override
	public void setSecUserPWReset( ISecureProtSecUserPWReset src ) {
		setJustProtRequiredContainerUser(src.getRequiredContainerUser());
		setJustProtRequiredSecUserId(src.getRequiredSecUserId());
		setJustProtRequiredRevision( src.getRequiredRevision() );
		setJustProtCreatedByUserId( src.getCreatedByUserId() );
		setJustProtCreatedAt( src.getCreatedAt() );
		setJustProtUpdatedByUserId( src.getUpdatedByUserId() );
		setJustProtUpdatedAt( src.getUpdatedAt() );
		setJustProtRequiredSentToEMailAddr(src.getRequiredSentToEMailAddr());
		setJustProtRequiredPasswordResetUuid6(src.getRequiredPasswordResetUuid6());
		setJustProtRequiredNewAccount(src.getRequiredNewAccount());
	}

	@Override
	public void set( ISecureProtSecUserPWResetH src ) {
		setJustProtSecUserPWReset( src );
	}

	@Override
	public void setSecUserPWReset( ISecureProtSecUserPWResetH src ) {
		setJustProtRequiredContainerUser(src.getRequiredContainerUser());
		setJustProtRequiredSecUserId(src.getRequiredSecUserId());
		setJustProtRequiredSentToEMailAddr(src.getRequiredSentToEMailAddr());
		setJustProtRequiredPasswordResetUuid6(src.getRequiredPasswordResetUuid6());
		setJustProtRequiredNewAccount(src.getRequiredNewAccount());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + getRequiredSecUserId().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredSentToEMailAddr() ) + "\"" + "\"" + getRequiredPasswordResetUuid6().toString() + "\"" + (( getRequiredNewAccount() ) ? "\"true\"" : "\"false\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureProtBuffSecUserPWReset" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
