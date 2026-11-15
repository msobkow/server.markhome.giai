// Description: Java 25 JPA implementation of a SecClusGrpMemb entity definition object.

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
	name = "SecClusGrpMemb", schema = "Secure31",
	indexes = {
		@Index(name = "SecClusGrpMembIdIdx", columnList = "SecClusGrpId, login_id", unique = true),
		@Index(name = "SecClusGrpMembClusGrpIdx", columnList = "SecClusGrpId", unique = false),
		@Index(name = "SecClusGrpMembLoginIdx", columnList = "login_id", unique = false),
		@Index(name = "SecClusGrpMembClusGrpIdxGroup", columnList = "SecClusGrpIdGroup", unique = false),
		@Index(name = "SecClusGrpMembLoginIdxUser", columnList = "login_idUser", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecClusGrpMemb
	implements Comparable<Object>,
		ISecureSecClusGrpMemb,
		Serializable
{
	// Embedded id's are package-accessible so that the Repository can dereference the attributes of the primary key
	@AttributeOverrides({
		@AttributeOverride(name="SecClusGrpId", column = @Column( name="SecClusGrpId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="login_id", column = @Column( name="login_id", nullable=false, length=32 ) )
	})
	@EmbeddedId
	SecureJpaSecClusGrpMembPKey pkey = new SecureJpaSecClusGrpMembPKey();
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="SecClusGrpIdGroup", referencedColumnName="SecClusGrpId" )
	protected SecureJpaSecClusGrp requiredContainerGroup;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="login_idUser", referencedColumnName="login_id" )
	protected SecureJpaSecUser requiredParentUser;
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

	public BusModelJpaSecClusGrpMemb() {
		pkey = new SecureJpaSecClusGrpMembPKey();
	}

	@Override
	public int getClassCode() {
		return( ISecureSecClusGrpMemb.CLASS_CODE );
	}

	@Override
	public ISecureSecClusGrp getRequiredContainerGroup() {
		return(requiredContainerGroup);
	}

	@Override
	public void setRequiredContainerGroup(ISecureSecClusGrp argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerGroup", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecClusGrp) {
			requiredContainerGroup = (SecureJpaSecClusGrp)argObj;
			if (requiredContainerGroup != null) {
				getPKey().setRequiredSecClusGrpId(requiredContainerGroup.getRequiredSecClusGrpId());
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerGroup", "argObj", argObj, "SecureJpaSecClusGrp");
		}
	
	}

	@Override
	public void setRequiredContainerGroup(ISecureProtSecClusGrp argObj) {
		setRequiredContainerGroup(argObj.getRequiredSecClusGrpId());
	}

	@Override
	public void setRequiredContainerGroup(ICFKeyHash256 argSecClusGrpId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerGroup", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecClusGrpTable targetTable = targetBackingSchema.getTableSecClusGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerGroup", 0, "ISecureSchema.getBackingSecure().getTableSecClusGrp()");
		}
		ISecureSecClusGrp targetRec = targetTable.readDerivedByIdIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSecClusGrpId);
		setRequiredContainerGroup(targetRec);
	}

	@Override
	public ISecureSecUser getRequiredParentUser() {
		return(requiredParentUser);
	}

	@Override
	public void setRequiredParentUser(ISecureSecUser argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentUser", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecUser) {
			requiredParentUser = (SecureJpaSecUser)argObj;
			if (requiredParentUser != null) {
				getPKey().setRequiredLoginId(requiredParentUser.getRequiredLoginId());
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setParentUser", "argObj", argObj, "SecureJpaSecUser");
		}
	
	}

	@Override
	public void setRequiredParentUser(ISecureProtSecUser argObj) {
		setRequiredParentUser(argObj.getRequiredLoginId());
	}

	@Override
	public void setRequiredParentUser(ISecurePubSecUser argObj) {
		setRequiredParentUser(argObj.getRequiredLoginId());
	}

	@Override
	public void setRequiredParentUser(String argLoginId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentUser", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecUserTable targetTable = targetBackingSchema.getTableSecUser();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentUser", 0, "ISecureSchema.getBackingSecure().getTableSecUser()");
		}
		ISecureSecUser targetRec = targetTable.readDerivedByULoginIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argLoginId);
		setRequiredParentUser(targetRec);
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
	public ISecureSecClusGrpMembPKey getPKey() {
		return pkey;
	}

	@Override
	public void setPKey(ISecureSecClusGrpMembPKey pkey ) {
		if (pkey == null) {
			throw new CFNullArgumentException(getClass(), "setPKey", 1, "pkey");
		}
		else if (!(pkey instanceof SecureJpaSecClusGrpMembPKey)) {
			throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureJpaSecClusGrpMembPKey");
		}
		this.pkey = (SecureJpaSecClusGrpMembPKey)pkey;
	}

	@Override
	public ICFKeyHash256 getRequiredSecClusGrpId() {
		return( pkey.getRequiredSecClusGrpId() );
	}

	@Override
	public void setRequiredSecClusGrpId( ICFKeyHash256 requiredSecClusGrpId ) {
		pkey.setRequiredSecClusGrpId( requiredSecClusGrpId );
	}

	@Override
	public String getRequiredLoginId() {
		return( pkey.getRequiredLoginId() );
	}

	@Override
	public void setRequiredLoginId( String requiredLoginId ) {
		pkey.setRequiredLoginId( requiredLoginId );
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
		else if (obj instanceof ISecureSecClusGrpMemb) {
			ISecureSecClusGrpMemb rhs = (ISecureSecClusGrpMemb)obj;
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
			if( getRequiredSecClusGrpId() != null ) {
				if( rhs.getRequiredSecClusGrpId() != null ) {
					if( ! getRequiredSecClusGrpId().equals( rhs.getRequiredSecClusGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecClusGrpId() != null ) {
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
		else if (obj instanceof ISecureSecClusGrpMembH) {
			ISecureSecClusGrpMembH rhs = (ISecureSecClusGrpMembH)obj;
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
			if( getRequiredSecClusGrpId() != null ) {
				if( rhs.getRequiredSecClusGrpId() != null ) {
					if( ! getRequiredSecClusGrpId().equals( rhs.getRequiredSecClusGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecClusGrpId() != null ) {
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
		else if (obj instanceof ISecureSecClusGrpMembHPKey) {
			ISecureSecClusGrpMembHPKey rhs = (ISecureSecClusGrpMembHPKey)obj;
			if( getRequiredSecClusGrpId() != null ) {
				if( rhs.getRequiredSecClusGrpId() != null ) {
					if( ! getRequiredSecClusGrpId().equals( rhs.getRequiredSecClusGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecClusGrpId() != null ) {
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
		else if (obj instanceof ISecureSecClusGrpMembByClusGrpIdxKey) {
			ISecureSecClusGrpMembByClusGrpIdxKey rhs = (ISecureSecClusGrpMembByClusGrpIdxKey)obj;
			if( getRequiredSecClusGrpId() != null ) {
				if( rhs.getRequiredSecClusGrpId() != null ) {
					if( ! getRequiredSecClusGrpId().equals( rhs.getRequiredSecClusGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecClusGrpId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecClusGrpMembByLoginIdxKey) {
			ISecureSecClusGrpMembByLoginIdxKey rhs = (ISecureSecClusGrpMembByLoginIdxKey)obj;
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
		int hashCode = getPKey().hashCode();
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + getRequiredSecClusGrpId().hashCode();
		if( getRequiredLoginId() != null ) {
			hashCode = hashCode + getRequiredLoginId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSecClusGrpMemb) {
			ISecureSecClusGrpMemb rhs = (ISecureSecClusGrpMemb)obj;
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
		else if (obj instanceof ISecureSecClusGrpMembHPKey) {
			ISecureSecClusGrpMembHPKey rhs = (ISecureSecClusGrpMembHPKey)obj;
			if (getRequiredSecClusGrpId() != null) {
				if (rhs.getRequiredSecClusGrpId() != null) {
					cmp = getRequiredSecClusGrpId().compareTo( rhs.getRequiredSecClusGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecClusGrpId() != null) {
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
		else if( obj instanceof ISecureSecClusGrpMembH ) {
			ISecureSecClusGrpMembH rhs = (ISecureSecClusGrpMembH)obj;
			if (getRequiredSecClusGrpId() != null) {
				if (rhs.getRequiredSecClusGrpId() != null) {
					cmp = getRequiredSecClusGrpId().compareTo( rhs.getRequiredSecClusGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecClusGrpId() != null) {
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
		else if (obj instanceof ISecureSecClusGrpMembByClusGrpIdxKey) {
			ISecureSecClusGrpMembByClusGrpIdxKey rhs = (ISecureSecClusGrpMembByClusGrpIdxKey)obj;
			if (getRequiredSecClusGrpId() != null) {
				if (rhs.getRequiredSecClusGrpId() != null) {
					cmp = getRequiredSecClusGrpId().compareTo( rhs.getRequiredSecClusGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecClusGrpId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecClusGrpMembByLoginIdxKey) {
			ISecureSecClusGrpMembByLoginIdxKey rhs = (ISecureSecClusGrpMembByLoginIdxKey)obj;
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
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	@Override
	public void set( ISecureSecClusGrpMemb src ) {
		setSecClusGrpMemb( src );
	}

	@Override
	public void setSecClusGrpMemb( ISecureSecClusGrpMemb src ) {
		setRequiredContainerGroup(src.getRequiredContainerGroup());
		setRequiredParentUser(src.getRequiredParentUser());
		setRequiredSecClusGrpId(src.getRequiredSecClusGrpId());
		setRequiredLoginId(src.getRequiredLoginId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecureSecClusGrpMembH src ) {
		setSecClusGrpMemb( src );
	}

	@Override
	public void setSecClusGrpMemb( ISecureSecClusGrpMembH src ) {
		setRequiredContainerGroup(src.getRequiredSecClusGrpId());
		setRequiredParentUser(src.getRequiredLoginId());
		setRequiredSecClusGrpId(src.getRequiredSecClusGrpId());
		setRequiredLoginId(src.getRequiredLoginId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment() 
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecClusGrpId=" + "\"" + getRequiredSecClusGrpId().toString() + "\""
			+ " RequiredLoginId=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredLoginId() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSecClusGrpMemb" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
