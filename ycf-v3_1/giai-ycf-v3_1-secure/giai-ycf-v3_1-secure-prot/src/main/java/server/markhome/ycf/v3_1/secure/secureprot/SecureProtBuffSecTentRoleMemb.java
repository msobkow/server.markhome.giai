// Description: Java 17 implJustProtementation of a SecTentRoleMemb buffer

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

public class SecureProtBuffSecTentRoleMemb
	implements ISecureProtSecTentRoleMemb, Comparable<Object>, Serializable
{
	protected ISecureProtSecTentRoleMembPKey pkey = new SecureProtBuffSecTentRoleMembPKey();
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();

	public BusModelProtBuffSecTentRoleMemb() {
		pkey = new SecureProtBuffSecTentRoleMembPKey();
	}

	@Override
	public ISecureProtSecTentRoleMembPKey getPKey() {
		return(pkey);
	}

	@Override
	public void setPKey(ISecureProtSecTentRoleMembPKey pkey ) {
		if (pkey == null) {
			throw new CFNullArgumentException(getClass(), "setPKey", 1, "pkey");
		}
		else {
			this.pkey = pkey;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredSecTentRoleId() {
		return(getPKey().getRequiredSecTentRoleId());
	}

	public void setRequiredSecTentRoleId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecTentRoleId",
				1,
				"value" );
		}
		getPKey().setRequiredSecTentRoleId(value);
	}

	@Override
	public String getRequiredLoginId() {
		return(getPKey().getRequiredLoginId());
	}

	public void setRequiredLoginId( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredLoginId",
				1,
				"value" );
		}
		else if( value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredLoginId",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		getPKey().setRequiredLoginId(value);
	}

	@Override
	public ISecureProtSecTentRole getRequiredContainerRole(ICFKeyHash256 argSecTentRoleId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerRole", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecTentRoleTable targetTable = targetBackingSecure.getTableSecTentRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerRole", 0, "ISecureProtSchema.getBackingSecure().getTableSecTentRole()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecTentRoleId()));
	}

	@Override
	public void setRequiredContainerRole(ICFKeyHash256 argSecTentRoleId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerRole-args", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecTentRoleTable targetTable = targetBackingSecure.getTableSecTentRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerRole", 0, "ISecureSchema.getBackingSecure().getTableSecTentRole()");
		}
		ISecureProtSecTentRole found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSecTentRoleId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerRole-args", 0, "found");
		}
		else if (found instanceof ISecureProtSecTentRole) || (found instanceof ISecureProtSecTentRole)) {
			super.setRequiredContainerRole(argSecTentRoleId);
		requiredSecTentRoleId = argSecTentRoleId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerRole-args", "found", found, "ISecureProtSecTentRoleISecureProtSecTentRole");
		}
	}

	@Override
	public void setRequiredContainerRole(ISecureProtSecTentRole argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerRole", 1, "argObj");
		}
		else {
			setJustProtRequiredSecTentRoleId(argObj.getRequiredSecTentRoleId());
		}
	}

	@Override
	public ISecureProtSecUser getRequiredParentUser(String argLoginId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentUser", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecUserTable targetTable = targetBackingSecure.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentUser", 0, "ISecureProtSchema.getBackingSecure().getTableSecUser()");
		}
		return(targetTable.readDerivedByULoginIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredLoginId()));
	}

	@Override
	public void setRequiredParentUser(String argLoginId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentUser-args", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecUserTable targetTable = targetBackingSecure.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentUser", 0, "ISecureSchema.getBackingSecure().getTableSecUser()");
		}
		ISecureProtSecUser found = targetTable.readDerivedByULoginIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argLoginId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentUser-args", 0, "found");
		}
		else if (found instanceof ISecureProtSecUser) || (found instanceof ISecureProtSecUser) || (found instanceof ISecurePubSecUser)) {
			super.setRequiredParentUser(argLoginId);
		requiredLoginId = argLoginId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredParentUser-args", "found", found, "ISecureProtSecUserISecureProtSecUserISecurePubSecUser");
		}
	}

	@Override
	public void setRequiredParentUser(ISecureProtSecUser argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentUser", 1, "argObj");
		}
		else {
			setJustProtRequiredLoginId(argObj.getRequiredLoginId());
		}
	}

	@Override
	public void setRequiredParentUser(ISecurePubSecUser argObj) {

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
		return( ISecureProtSecTentRoleMemb.CLASS_CODE );
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureProtSecTentRoleMemb rhs ) {
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
			if( getRequiredSecTentRoleId() != null ) {
				if( rhs.getRequiredSecTentRoleId() != null ) {
					if( ! getRequiredSecTentRoleId().equals( rhs.getRequiredSecTentRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecTentRoleId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecTentRoleMembH rhs ) {
			if( getRequiredSecTentRoleId() != null ) {
				if( rhs.getRequiredSecTentRoleId() != null ) {
					if( ! getRequiredSecTentRoleId().equals( rhs.getRequiredSecTentRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecTentRoleId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecTentRoleMembHPKey ) {
			ISecureProtSecTentRoleMembHPKey rhs = (ISecureProtSecTentRoleMembHPKey)obj;
			if( getRequiredSecTentRoleId() != null ) {
				if( rhs.getRequiredSecTentRoleId() != null ) {
					if( ! getRequiredSecTentRoleId().equals( rhs.getRequiredSecTentRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecTentRoleId() != null ) {
					return( false );
				}
			}
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecTentRoleMembByTentRoleIdxKey rhs ) {
			if( getRequiredSecTentRoleId() != null ) {
				if( rhs.getRequiredSecTentRoleId() != null ) {
					if( ! getRequiredSecTentRoleId().equals( rhs.getRequiredSecTentRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecTentRoleId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecTentRoleMembByUserIdxKey rhs ) {
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
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
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + getRequiredSecTentRoleId().hashCode();
		if( getRequiredLoginId() != null ) {
			hashCode = hashCode + getRequiredLoginId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecureProtSecTentRoleMemb rhs ) {
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
			if (getRequiredSecTentRoleId() != null) {
				if (rhs.getRequiredSecTentRoleId() != null) {
					cmp = getRequiredSecTentRoleId().compareTo( rhs.getRequiredSecTentRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecTentRoleId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
 		}
		else if( obj instanceof ISecureProtSecTentRoleMembHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredSecTentRoleId() != null) {
				if (rhs.getRequiredSecTentRoleId() != null) {
					cmp = getRequiredSecTentRoleId().compareTo( rhs.getRequiredSecTentRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecTentRoleId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtSecTentRoleMembH rhs ) {
			cmp = 0;
			if (getRequiredSecTentRoleId() != null) {
				if (rhs.getRequiredSecTentRoleId() != null) {
					cmp = getRequiredSecTentRoleId().compareTo( rhs.getRequiredSecTentRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecTentRoleId() != null) {
				return( -1 );
			}
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtSecTentRoleMembByTentRoleIdxKey rhs ) {
			if (getRequiredSecTentRoleId() != null) {
				if (rhs.getRequiredSecTentRoleId() != null) {
					cmp = getRequiredSecTentRoleId().compareTo( rhs.getRequiredSecTentRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecTentRoleId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtSecTentRoleMembByUserIdxKey rhs ) {
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
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
	public void set( ISecureProtSecTentRoleMemb src ) {
		setJustProtSecTentRoleMemb( src );
	}

	@Override
	public void setSecTentRoleMemb( ISecureProtSecTentRoleMemb src ) {
		setJustProtRequiredContainerRole(src.getRequiredContainerRole());
		setJustProtRequiredParentUser(src.getRequiredParentUser());
		setJustProtRequiredSecTentRoleId(src.getRequiredSecTentRoleId());
		setJustProtRequiredLoginId(src.getRequiredLoginId());
		setJustProtRequiredRevision( src.getRequiredRevision() );
		setJustProtCreatedByUserId( src.getCreatedByUserId() );
		setJustProtCreatedAt( src.getCreatedAt() );
		setJustProtUpdatedByUserId( src.getUpdatedByUserId() );
		setJustProtUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecureProtSecTentRoleMembH src ) {
		setJustProtSecTentRoleMemb( src );
	}

	@Override
	public void setSecTentRoleMemb( ISecureProtSecTentRoleMembH src ) {
		setJustProtRequiredContainerRole(src.getRequiredContainerRole());
		setJustProtRequiredParentUser(src.getRequiredParentUser());
		setJustProtRequiredSecTentRoleId(src.getRequiredSecTentRoleId());
		setJustProtRequiredLoginId(src.getRequiredLoginId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + getRequiredSecTentRoleId().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredLoginId() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureProtBuffSecTentRoleMemb" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
