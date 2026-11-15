// Description: Java 25 implementation of a ISOCtryCcy buffer

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

public class SecureBuffISOCtryCcy
	implements ISecureISOCtryCcy, Comparable<Object>, Serializable
{
	protected ISecureISOCtryCcyPKey pkey = new SecureBuffISOCtryCcyPKey();
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();

	public BusModelBuffISOCtryCcy() {
		pkey = new SecureBuffISOCtryCcyPKey();
	}

	@Override
	public ISecureISOCtryCcyPKey getPKey() {
		return(pkey);
	}

	@Override
	public void setPKey(ISecureISOCtryCcyPKey pkey ) {
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
	public ISecureISOCtry getRequiredContainerCtry() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCtry", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureISOCtryTable targetTable = targetBackingSecure.getTableISOCtry();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCtry", 0, "ISecureSchema.getBackingSecure().getTableISOCtry()");
		}
		ISecureISOCtry targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredISOCtryId());
		return(targetRec);
	}

	@Override
	public ISecureISOCtry getRequiredContainerCtry() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCtry", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureISOCtryTable targetTable = targetBackingSecure.getTableISOCtry();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCtry", 0, "ISecureSchema.getBackingSecure().getTableISOCtry()");
		}
		ISecureISOCtry targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredISOCtryId());
		return(targetRec);
	}

	@Override
	public ISecureISOCtry getRequiredContainerCtry() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCtry", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureISOCtryTable targetTable = targetBackingSecure.getTableISOCtry();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCtry", 0, "ISecureSchema.getBackingSecure().getTableISOCtry()");
		}
		ISecurePubISOCtry targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredISOCtryId());
		return(targetRec);
	}

	@Override
	public void setRequiredContainerCtry(ISecureISOCtry argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerCtry", 1, "argObj");
		}
		else {
			setRequiredISOCtryId(argObj.getRequiredISOCtryId());
		}
	}

	@Override
	public void setRequiredContainerCtry(ISecureProtISOCtry argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerCtry", 1, "argObj");
		}
		else {
			setRequiredISOCtryId(argObj.getRequiredISOCtryId());
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
	public ISecureISOCcy getRequiredParentCcy() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentCcy", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureISOCcyTable targetTable = targetBackingSecure.getTableISOCcy();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentCcy", 0, "ISecureSchema.getBackingSecure().getTableISOCcy()");
		}
		ISecureISOCcy targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredISOCcyId());
		return(targetRec);
	}

	@Override
	public ISecureISOCcy getRequiredParentCcy() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentCcy", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureISOCcyTable targetTable = targetBackingSecure.getTableISOCcy();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentCcy", 0, "ISecureSchema.getBackingSecure().getTableISOCcy()");
		}
		ISecureISOCcy targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredISOCcyId());
		return(targetRec);
	}

	@Override
	public ISecureISOCcy getRequiredParentCcy() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentCcy", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureISOCcyTable targetTable = targetBackingSecure.getTableISOCcy();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentCcy", 0, "ISecureSchema.getBackingSecure().getTableISOCcy()");
		}
		ISecurePubISOCcy targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredISOCcyId());
		return(targetRec);
	}

	@Override
	public void setRequiredParentCcy(ISecureISOCcy argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentCcy", 1, "argObj");
		}
		else {
			setRequiredISOCcyId(argObj.getRequiredISOCcyId());
		}
	}

	@Override
	public void setRequiredParentCcy(ISecureProtISOCcy argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentCcy", 1, "argObj");
		}
		else {
			setRequiredISOCcyId(argObj.getRequiredISOCcyId());
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
	public void setCreatedByUserId( CFDbKeyHash256 value ) {
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setCreatedAt( LocalDateTime value ) {
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setUpdatedByUserId( CFDbKeyHash256 value ) {
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setUpdatedAt( LocalDateTime value ) {
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
		return( ISecureISOCtryCcy.CLASS_CODE );
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureISOCtryCcy rhs ) {
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
		else if( obj instanceof ISecureISOCtryCcyH rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureISOCtryCcyHPKey ) {
			ISecureISOCtryCcyHPKey rhs = (ISecureISOCtryCcyHPKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureISOCtryCcyByCtryIdxKey rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureISOCtryCcyByCcyIdxKey rhs ) {
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtISOCtryCcy rhs ) {
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
		else if( obj instanceof ISecureProtISOCtryCcyH rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtISOCtryCcyHPKey rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureISOCtryCcyByCtryIdxKey rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureISOCtryCcyByCcyIdxKey rhs ) {
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
		else if( obj instanceof ISecureISOCtryCcyByCtryIdxKey rhs ) {
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureISOCtryCcyByCcyIdxKey rhs ) {
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
		else if( obj instanceof ISecureISOCtryCcy rhs ) {
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
		else if( obj instanceof ISecureISOCtryCcyHPKey rhs ) {
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
		else if( obj instanceof ISecureISOCtryCcyH rhs ) {
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
		else if( obj instanceof ISecureISOCtryCcyByCtryIdxKey rhs ) {
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureISOCtryCcyByCcyIdxKey rhs ) {
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtISOCtryCcy rhs ) {
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
		else if( obj instanceof ISecureProtISOCtryCcyHPKey rhs ) {
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
		else if( obj instanceof ISecureProtISOCtryCcyH rhs ) {
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
		else if( obj instanceof ISecureProtISOCtryCcyByCtryIdxKey rhs ) {
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtISOCtryCcyByCcyIdxKey rhs ) {
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
	public void set( ISecureISOCtryCcy src ) {
		setISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecureISOCtryCcy src ) {
		setRequiredContainerCtry(src.getRequiredContainerCtry());
		setRequiredParentCcy(src.getRequiredParentCcy());
		setRequiredISOCtryId(src.getRequiredISOCtryId());
		setRequiredISOCcyId(src.getRequiredISOCcyId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecureISOCtryCcyH src ) {
		setISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecureISOCtryCcyH src ) {
		setRequiredContainerCtry(src.getRequiredContainerCtry());
		setRequiredParentCcy(src.getRequiredParentCcy());
		setRequiredISOCtryId(src.getRequiredISOCtryId());
		setRequiredISOCcyId(src.getRequiredISOCcyId());
	}

	@Override
	public void set( ISecureProtISOCtryCcy src ) {
		setISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecureProtISOCtryCcy src ) {
		setRequiredContainerCtry(src.getRequiredContainerCtry());
		setRequiredParentCcy(src.getRequiredParentCcy());
		setRequiredISOCtryId(src.getRequiredISOCtryId());
		setRequiredISOCcyId(src.getRequiredISOCcyId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecureProtISOCtryCcyH src ) {
		setISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecureProtISOCtryCcyH src ) {
		setRequiredContainerCtry(src.getRequiredContainerCtry());
		setRequiredParentCcy(src.getRequiredParentCcy());
		setRequiredISOCtryId(src.getRequiredISOCtryId());
		setRequiredISOCcyId(src.getRequiredISOCcyId());
	}

	@Override
	public void set( ISecurePubISOCtryCcy src ) {
		setISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecurePubISOCtryCcy src ) {
		setRequiredContainerCtry(src.getRequiredContainerCtry());
		setRequiredParentCcy(src.getRequiredParentCcy());
		setRequiredISOCtryId(src.getRequiredISOCtryId());
		setRequiredISOCcyId(src.getRequiredISOCcyId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecurePubISOCtryCcyH src ) {
		setISOCtryCcy( src );
	}

	@Override
	public void setISOCtryCcy( ISecurePubISOCtryCcyH src ) {
		setRequiredContainerCtry(src.getRequiredContainerCtry());
		setRequiredParentCcy(src.getRequiredParentCcy());
		setRequiredISOCtryId(src.getRequiredISOCtryId());
		setRequiredISOCcyId(src.getRequiredISOCcyId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment() 
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredISOCtryId=" + "\"" + Short.toString( getRequiredISOCtryId() ) + "\""
			+ " RequiredISOCcyId=" + "\"" + Short.toString( getRequiredISOCcyId() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureBuffISOCtryCcy" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
