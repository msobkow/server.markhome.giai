// Description: Java 25 JPA implementation of a ISOCtryLang entity definition object.

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

@Entity
@Table(
	name = "iso_cntrylng", schema = "Secure31",
	indexes = {
		@Index(name = "ISOCtryLangIdIdx", columnList = "ISOCtryId, ISOLangId", unique = true),
		@Index(name = "ISOCtryLangCtryIdx", columnList = "ISOCtryId", unique = false),
		@Index(name = "ISOCtryLangLangIdx", columnList = "ISOLangId", unique = false),
		@Index(name = "ISOCtryLangCtryIdxCtry", columnList = "ISOCtryIdCtry", unique = false),
		@Index(name = "ISOCtryLangLangIdxLang", columnList = "ISOLangIdLang", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaISOCtryLang
	implements Comparable<Object>,
		ISecureISOCtryLang,
		Serializable
{
	// Embedded id's are package-accessible so that the Repository can dereference the attributes of the primary key
	@AttributeOverrides({
		@AttributeOverride(name="ISOCtryId", column = @Column( name="ISOCtryId", nullable=false ) ),
		@AttributeOverride(name="ISOLangId", column = @Column( name="ISOLangId", nullable=false ) )
	})
	@EmbeddedId
	SecureJpaISOCtryLangPKey pkey = new SecureJpaISOCtryLangPKey();
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="ISOCtryIdCtry", referencedColumnName="ISOCtryId" )
	protected SecureJpaISOCtry requiredContainerCtry;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="ISOLangIdLang", referencedColumnName="ISOLangId" )
	protected SecureJpaISOLang requiredParentLang;
	protected int requiredRevision;


	@AttributeOverrides({
		@AttributeOverride( name="bytes", column = @Column( name="CreatedByUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);

	@AttributeOverrides({
		@AttributeOverride( name="bytes", column = @Column( name="CreatedBySessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);

	@Column(name="CreatedAt", nullable=false)
	protected LocalDateTime createdAt = LocalDateTime.now();

	@AttributeOverrides({
		@AttributeOverride( name="bytes", column= @Column( name="UpdatedByUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);

	@AttributeOverrides({
		@AttributeOverride( name="bytes", column= @Column( name="UpdatedBySessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);

	@Column(name="UpdatedAt", nullable=false)
	protected LocalDateTime updatedAt = LocalDateTime.now();

	public BusModelJpaISOCtryLang() {
		pkey = new SecureJpaISOCtryLangPKey();
	}

	@Override
	public int getClassCode() {
		return( ISecureISOCtryLang.CLASS_CODE );
	}

	@Override
	public ISecureISOCtry getRequiredContainerCtry() {
		return(requiredContainerCtry);
	}

	@Override
	public void setRequiredContainerCtry(ISecureISOCtry argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerCtry", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaISOCtry) {
			requiredContainerCtry = (SecureJpaISOCtry)argObj;
			if (requiredContainerCtry != null) {
				getPKey().setRequiredISOCtryId(requiredContainerCtry.getRequiredISOCtryId());
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerCtry", "argObj", argObj, "SecureJpaISOCtry");
		}
	
	}

	@Override
	public void setRequiredContainerCtry(ISecureProtISOCtry argObj) {
		setRequiredContainerCtry(argObj.getRequiredISOCtryId());
	}

	@Override
	public void setRequiredContainerCtry(ISecurePubISOCtry argObj) {
		setRequiredContainerCtry(argObj.getRequiredISOCtryId());
	}

	@Override
	public void setRequiredContainerCtry(short argISOCtryId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCtry", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureISOCtryTable targetTable = targetBackingSchema.getTableISOCtry();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCtry", 0, "ISecureSchema.getBackingSecure().getTableISOCtry()");
		}
		ISecureISOCtry targetRec = targetTable.readDerivedByIdIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argISOCtryId);
		setRequiredContainerCtry(targetRec);
	}

	@Override
	public ISecureISOLang getRequiredParentLang() {
		return(requiredParentLang);
	}

	@Override
	public void setRequiredParentLang(ISecureISOLang argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentLang", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaISOLang) {
			requiredParentLang = (SecureJpaISOLang)argObj;
			if (requiredParentLang != null) {
				getPKey().setRequiredISOLangId(requiredParentLang.getRequiredISOLangId());
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setParentLang", "argObj", argObj, "SecureJpaISOLang");
		}
	
	}

	@Override
	public void setRequiredParentLang(ISecureProtISOLang argObj) {
		setRequiredParentLang(argObj.getRequiredISOLangId());
	}

	@Override
	public void setRequiredParentLang(ISecurePubISOLang argObj) {
		setRequiredParentLang(argObj.getRequiredISOLangId());
	}

	@Override
	public void setRequiredParentLang(short argISOLangId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentLang", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureISOLangTable targetTable = targetBackingSchema.getTableISOLang();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentLang", 0, "ISecureSchema.getBackingSecure().getTableISOLang()");
		}
		ISecureISOLang targetRec = targetTable.readDerivedByIdIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argISOLangId);
		setRequiredParentLang(targetRec);
	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setCreatedByUserId( CFDbKeyHash256 value ) {
		if (value == null || value.isNull()) {
			throw new CFNullArgumentException(getClass(), "setCreatedByUserId", 1, "value");
		}
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setCreatedAt( LocalDateTime value ) {
		if (value == null) {
			throw new CFNullArgumentException(getClass(), "setCreatedAt", 1, "value");
		}
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setUpdatedByUserId( CFDbKeyHash256 value ) {
		if (value == null || value.isNull()) {
			throw new CFNullArgumentException(getClass(), "setUpdatedByUserId", 1, "value");
		}
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setUpdatedAt( LocalDateTime value ) {
		if (value == null) {
			throw new CFNullArgumentException(getClass(), "setUpdatedAt", 1, "value");
		}
		updatedAt = value;
	}

	@Override
	public ISecureISOCtryLangPKey getPKey() {
		return pkey;
	}

	@Override
	public void setPKey(ISecureISOCtryLangPKey pkey ) {
		if (pkey == null) {
			throw new CFNullArgumentException(getClass(), "setPKey", 1, "pkey");
		}
		else if (!(pkey instanceof SecureJpaISOCtryLangPKey)) {
			throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureJpaISOCtryLangPKey");
		}
		this.pkey = (SecureJpaISOCtryLangPKey)pkey;
	}

	@Override
	public short getRequiredISOCtryId() {
		return( pkey.getRequiredISOCtryId() );
	}

	@Override
	public void setRequiredISOCtryId( short requiredISOCtryId ) {
		pkey.setRequiredISOCtryId( requiredISOCtryId );
	}

	@Override
	public short getRequiredISOLangId() {
		return( pkey.getRequiredISOLangId() );
	}

	@Override
	public void setRequiredISOLangId( short requiredISOLangId ) {
		pkey.setRequiredISOLangId( requiredISOLangId );
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
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureISOCtryLang) {
			ISecureISOCtryLang rhs = (ISecureISOCtryLang)obj;
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
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureISOCtryLangH) {
			ISecureISOCtryLangH rhs = (ISecureISOCtryLangH)obj;
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
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureISOCtryLangHPKey) {
			ISecureISOCtryLangHPKey rhs = (ISecureISOCtryLangHPKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureISOCtryLangByCtryIdxKey) {
			ISecureISOCtryLangByCtryIdxKey rhs = (ISecureISOCtryLangByCtryIdxKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureISOCtryLangByLangIdxKey) {
			ISecureISOCtryLangByLangIdxKey rhs = (ISecureISOCtryLangByLangIdxKey)obj;
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
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
		int hashCode = getPKey().hashCode();
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = ( hashCode * 0x10000 ) + getRequiredISOCtryId();
		hashCode = ( hashCode * 0x10000 ) + getRequiredISOLangId();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureISOCtryLang) {
			ISecureISOCtryLang rhs = (ISecureISOCtryLang)obj;
			if (getPKey() == null) {
				if (rhs.getPKey() != null) {
					return( -1 );
				}
			}
			else {
				if (rhs.getPKey() == null) {
					return( 1 );
				}
				else {
					cmp = getPKey().compareTo(rhs.getPKey());
					if (cmp != 0) {
						return( cmp );
					}
				}
			}
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
			return( 0 );
		}
		else if (obj instanceof ISecureISOCtryLangHPKey) {
			ISecureISOCtryLangHPKey rhs = (ISecureISOCtryLangHPKey)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureISOCtryLangH ) {
			ISecureISOCtryLangH rhs = (ISecureISOCtryLangH)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
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
			return( 0 );
		}
		else if (obj instanceof ISecureISOCtryLangByCtryIdxKey) {
			ISecureISOCtryLangByCtryIdxKey rhs = (ISecureISOCtryLangByCtryIdxKey)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureISOCtryLangByLangIdxKey) {
			ISecureISOCtryLangByLangIdxKey rhs = (ISecureISOCtryLangByLangIdxKey)obj;
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
			return( 0 );
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
	public void set( ISecureISOCtryLang src ) {
		setISOCtryLang( src );
	}

	@Override
	public void setISOCtryLang( ISecureISOCtryLang src ) {
		setRequiredContainerCtry(src.getRequiredContainerCtry());
		setRequiredParentLang(src.getRequiredParentLang());
		setRequiredISOCtryId(src.getRequiredISOCtryId());
		setRequiredISOLangId(src.getRequiredISOLangId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecureISOCtryLangH src ) {
		setISOCtryLang( src );
	}

	@Override
	public void setISOCtryLang( ISecureISOCtryLangH src ) {
		setRequiredContainerCtry(src.getRequiredISOCtryId());
		setRequiredParentLang(src.getRequiredISOLangId());
		setRequiredISOCtryId(src.getRequiredISOCtryId());
		setRequiredISOLangId(src.getRequiredISOLangId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment() 
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredISOCtryId=" + "\"" + Short.toString( getRequiredISOCtryId() ) + "\""
			+ " RequiredISOLangId=" + "\"" + Short.toString( getRequiredISOLangId() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaISOCtryLang" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
