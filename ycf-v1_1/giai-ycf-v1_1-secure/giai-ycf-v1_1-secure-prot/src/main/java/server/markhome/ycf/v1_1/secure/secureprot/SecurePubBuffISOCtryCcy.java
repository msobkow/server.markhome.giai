// Description: Java 17 implJustPubementation of a ISOCtryCcy buffer

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;

public class SecurePubBuffISOCtryCcy
	implements ISecurePubISOCtryCcy, Comparable<Object>, Serializable
{
	protected ISecurePubISOCtryCcyPKey pkey = new SecurePubBuffISOCtryCcyPKey();
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();

	public BusModelPubBuffISOCtryCcy() {
		pkey = new SecurePubBuffISOCtryCcyPKey();
	}

	@Override
	public ISecurePubISOCtryCcyPKey getPKey() {
		return(pkey);
	}

	@Override
	public void setPKey(ISecurePubISOCtryCcyPKey pkey ) {
		if (pkey == null) {
			throw new CFNullArgumentException(getClass(), "setPKey", 1, "pkey");
		}
		else {
			this.pkey = pkey;
		}
	}

	@Override
	public short getRequiredISOCtryId() {
		return(getPKey().getRequiredISOCtryId());
	}

	@Override
	public void setRequiredISOCtryId( short value ) {
		if( value < ISecurePubISOCtryCcy.ISOCTRYID_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredISOCtryId",
				1,
				"value",
				value,
				ISecurePubISOCtryCcy.ISOCTRYID_MIN_VALUE );
		}
		getPKey().setRequiredISOCtryId(value);
	}

	@Override
	public short getRequiredISOCcyId() {
		return(getPKey().getRequiredISOCcyId());
	}

	@Override
	public void setRequiredISOCcyId( short value ) {
		if( value < ISecurePubISOCtryCcy.ISOCCYID_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredISOCcyId",
				1,
				"value",
				value,
				ISecurePubISOCtryCcy.ISOCCYID_MIN_VALUE );
		}
		getPKey().setRequiredISOCcyId(value);
	}

	@Override
	public ISecurePubISOCtry getRequiredContainerCtry(short argISOCtryId) {
		ISecurePubSchema targetBackingSecure = ISecurePubSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCtry", 0, "ISecurePubSchema.getBackingSecure()");
		}
		ISecurePubISOCtryTable targetTable = targetBackingSecure.getTableISOCtry();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCtry", 0, "ISecurePubSchema.getBackingSecure().getTableISOCtry()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredISOCtryId()));
	}

	@Override
	public void setRequiredContainerCtry(short argISOCtryId) {
		ISecurePubSchema targetBackingSecure = ISecurePubSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCtry-args", 0, "ISecurePubSchema.getBackingSecure()");
		}
		ISecurePubISOCtryTable targetTable = targetBackingSecure.getTableISOCtry();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCtry", 0, "ISecureSchema.getBackingSecure().getTableISOCtry()");
		}
		ISecurePubISOCtry found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argISOCtryId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCtry-args", 0, "found");
		}
		else if (found instanceof ISecurePubISOCtry) || (found instanceof ISecurePubISOCtry)) {
			super.setRequiredContainerCtry(argISOCtryId);
		requiredISOCtryId = argISOCtryId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerCtry-args", "found", found, "ISecurePubISOCtryISecurePubISOCtry");
		}
	}

	@Override
	public void setRequiredContainerCtry(ISecurePubISOCtry argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerCtry", 1, "argObj");
		}
		else {
			setRequiredISOCtryId(argObj.getRequiredISOCtryId());
		}
	}

	@Override
	public ISecurePubISOCcy getRequiredParentCcy(short argISOCcyId) {
		ISecurePubSchema targetBackingSecure = ISecurePubSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentCcy", 0, "ISecurePubSchema.getBackingSecure()");
		}
		ISecurePubISOCcyTable targetTable = targetBackingSecure.getTableISOCcy();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentCcy", 0, "ISecurePubSchema.getBackingSecure().getTableISOCcy()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredISOCcyId()));
	}

	@Override
	public void setRequiredParentCcy(short argISOCcyId) {
		ISecurePubSchema targetBackingSecure = ISecurePubSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentCcy-args", 0, "ISecurePubSchema.getBackingSecure()");
		}
		ISecurePubISOCcyTable targetTable = targetBackingSecure.getTableISOCcy();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentCcy", 0, "ISecureSchema.getBackingSecure().getTableISOCcy()");
		}
		ISecurePubISOCcy found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argISOCcyId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentCcy-args", 0, "found");
		}
		else if (found instanceof ISecurePubISOCcy) || (found instanceof ISecurePubISOCcy)) {
			super.setRequiredParentCcy(argISOCcyId);
		requiredISOCcyId = argISOCcyId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredParentCcy-args", "found", found, "ISecurePubISOCcyISecurePubISOCcy");
		}
	}

	@Override
	public void setRequiredParentCcy(ISecurePubISOCcy argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentCcy", 1, "argObj");
		}
		else {
			setRequiredISOCcyId(argObj.getRequiredISOCcyId());
		}
	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setJustPubCreatedByUserId( CFDbKeyHash256 value ) {
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setJustPubCreatedAt( LocalDateTime value ) {
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setJustPubUpdatedByUserId( CFDbKeyHash256 value ) {
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setJustPubUpdatedAt( LocalDateTime value ) {
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
		return( ISecurePubISOCtryCcy.CLASS_CODE );
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecurePubISOCtryCcy rhs ) {
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
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOCtryCcyH rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOCtryCcyHPKey ) {
			ISecurePubISOCtryCcyHPKey rhs = (ISecurePubISOCtryCcyHPKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOCtryCcyByCtryIdxKey rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOCtryCcyByCcyIdxKey rhs ) {
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOCtryCcy rhs ) {
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
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOCtryCcyH rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOCtryCcyHPKey rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOCtryCcyByCtryIdxKey rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOCtryCcyByCcyIdxKey rhs ) {
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
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
		hashCode = ( hashCode * 0x10000 ) + getRequiredISOCtryId();
		hashCode = ( hashCode * 0x10000 ) + getRequiredISOCcyId();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecurePubISOCtryCcy rhs ) {
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
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
 		}
		else if( obj instanceof ISecurePubISOCtryCcyHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubISOCtryCcyH rhs ) {
			cmp = 0;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubISOCtryCcyByCtryIdxKey rhs ) {
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubISOCtryCcyByCcyIdxKey rhs ) {
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubISOCtryCcy rhs ) {
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
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubISOCtryCcyHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubISOCtryCcyH rhs ) {
			cmp = 0;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubISOCtryCcyByCtryIdxKey rhs ) {
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubISOCtryCcyByCcyIdxKey rhs ) {
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
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
	public void set( ISecurePubISOCtryCcy src ) {
		setJustPubISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecurePubISOCtryCcy src ) {
		setJustPubRequiredContainerCtry(src.getRequiredContainerCtry());
		setJustPubRequiredParentCcy(src.getRequiredParentCcy());
		setJustPubRequiredISOCtryId(src.getRequiredISOCtryId());
		setJustPubRequiredISOCcyId(src.getRequiredISOCcyId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubCreatedByUserId( src.getCreatedByUserId() );
		setJustPubCreatedAt( src.getCreatedAt() );
		setJustPubUpdatedByUserId( src.getUpdatedByUserId() );
		setJustPubUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecurePubISOCtryCcyH src ) {
		setJustPubISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecurePubISOCtryCcyH src ) {
		setJustPubRequiredContainerCtry(src.getRequiredContainerCtry());
		setJustPubRequiredParentCcy(src.getRequiredParentCcy());
		setJustPubRequiredISOCtryId(src.getRequiredISOCtryId());
		setJustPubRequiredISOCcyId(src.getRequiredISOCcyId());
	}

	@Override
	public void set( ISecurePubISOCtryCcy src ) {
		setJustPubISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecurePubISOCtryCcy src ) {
		setJustPubRequiredContainerCtry(src.getRequiredContainerCtry());
		setJustPubRequiredParentCcy(src.getRequiredParentCcy());
		setJustPubRequiredISOCtryId(src.getRequiredISOCtryId());
		setJustPubRequiredISOCcyId(src.getRequiredISOCcyId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubCreatedByUserId( src.getCreatedByUserId() );
		setJustPubCreatedAt( src.getCreatedAt() );
		setJustPubUpdatedByUserId( src.getUpdatedByUserId() );
		setJustPubUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecurePubISOCtryCcyH src ) {
		setJustPubISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecurePubISOCtryCcyH src ) {
		setJustPubRequiredContainerCtry(src.getRequiredContainerCtry());
		setJustPubRequiredParentCcy(src.getRequiredParentCcy());
		setJustPubRequiredISOCtryId(src.getRequiredISOCtryId());
		setJustPubRequiredISOCcyId(src.getRequiredISOCcyId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + Short.toString( getRequiredISOCtryId() ) + "\"" + "\"" + Short.toString( getRequiredISOCcyId() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecurePubBuffISOCtryCcy" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
