// Description: Java 25 JPA implementation of a SecSysRoleEnables entity definition object.

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
	name = "SecSysRoleEnables", schema = "Secure31",
	indexes = {
		@Index(name = "SecSysRoleEnablesIdIdx", columnList = "SecSysRoleId, enable_name", unique = true),
		@Index(name = "SecSysRoleEnablesRoleIdx", columnList = "SecSysRoleId", unique = false),
		@Index(name = "SecSysRoleEnableNameIdx", columnList = "enable_name", unique = false),
		@Index(name = "SecSysRoleEnablesRoleIdxSysRole", columnList = "SecSysRoleIdSysRole", unique = false),
		@Index(name = "SecSysRoleEnableNameIdxEnableGroup", columnList = "enable_nameEnableGroup", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecSysRoleEnables
	implements Comparable<Object>,
		ISecureSecSysRoleEnables,
		Serializable
{
	// Embedded id's are package-accessible so that the Repository can dereference the attributes of the primary key
	@AttributeOverrides({
		@AttributeOverride(name="SecSysRoleId", column = @Column( name="SecSysRoleId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="enable_name", column = @Column( name="enable_name", nullable=false, length=64 ) )
	})
	@EmbeddedId
	SecureJpaSecSysRoleEnablesPKey pkey = new SecureJpaSecSysRoleEnablesPKey();
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="SecSysRoleIdSysRole", referencedColumnName="SecSysRoleId" )
	protected SecureJpaSecSysRole requiredContainerSysRole;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="enable_nameEnableGroup", referencedColumnName="safe_name" )
	protected SecureJpaSecSysGrp requiredParentEnableGroup;
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

	public BusModelJpaSecSysRoleEnables() {
		pkey = new SecureJpaSecSysRoleEnablesPKey();
	}

	@Override
	public int getClassCode() {
		return( ISecureSecSysRoleEnables.CLASS_CODE );
	}

	@Override
	public ISecureSecSysRole getRequiredContainerSysRole() {
		return(requiredContainerSysRole);
	}

	@Override
	public void setRequiredContainerSysRole(ISecureSecSysRole argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSysRole", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecSysRole) {
			requiredContainerSysRole = (SecureJpaSecSysRole)argObj;
			if (requiredContainerSysRole != null) {
				getPKey().setRequiredSecSysRoleId(requiredContainerSysRole.getRequiredSecSysRoleId());
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerSysRole", "argObj", argObj, "SecureJpaSecSysRole");
		}
	
	}

	@Override
	public void setRequiredContainerSysRole(ISecureProtSecSysRole argObj) {
		setRequiredContainerSysRole(argObj.getRequiredSecSysRoleId());
	}

	@Override
	public void setRequiredContainerSysRole(ISecurePubSecSysRole argObj) {
		setRequiredContainerSysRole(argObj.getRequiredSecSysRoleId());
	}

	@Override
	public void setRequiredContainerSysRole(ICFKeyHash256 argSecSysRoleId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysRoleTable targetTable = targetBackingSchema.getTableSecSysRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure().getTableSecSysRole()");
		}
		ISecureSecSysRole targetRec = targetTable.readDerivedByIdIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSecSysRoleId);
		setRequiredContainerSysRole(targetRec);
	}

	@Override
	public ISecureSecSysGrp getRequiredParentEnableGroup() {
		return(requiredParentEnableGroup);
	}

	@Override
	public void setRequiredParentEnableGroup(ISecureSecSysGrp argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentEnableGroup", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecSysGrp) {
			requiredParentEnableGroup = (SecureJpaSecSysGrp)argObj;
			if (requiredParentEnableGroup != null) {
				getPKey().setRequiredEnableName(requiredParentEnableGroup.getRequiredName());
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setParentEnableGroup", "argObj", argObj, "SecureJpaSecSysGrp");
		}
	
	}

	@Override
	public void setRequiredParentEnableGroup(ISecureProtSecSysGrp argObj) {
		setRequiredParentEnableGroup(argObj.getRequiredName());
	}

	@Override
	public void setRequiredParentEnableGroup(ISecurePubSecSysGrp argObj) {
		setRequiredParentEnableGroup(argObj.getRequiredName());
	}

	@Override
	public void setRequiredParentEnableGroup(String argEnableName) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentEnableGroup", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSchema.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentEnableGroup", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureSecSysGrp targetRec = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argEnableName);
		setRequiredParentEnableGroup(targetRec);
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
	public ISecureSecSysRoleEnablesPKey getPKey() {
		return pkey;
	}

	@Override
	public void setPKey(ISecureSecSysRoleEnablesPKey pkey ) {
		if (pkey == null) {
			throw new CFNullArgumentException(getClass(), "setPKey", 1, "pkey");
		}
		else if (!(pkey instanceof SecureJpaSecSysRoleEnablesPKey)) {
			throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureJpaSecSysRoleEnablesPKey");
		}
		this.pkey = (SecureJpaSecSysRoleEnablesPKey)pkey;
	}

	@Override
	public ICFKeyHash256 getRequiredSecSysRoleId() {
		return( pkey.getRequiredSecSysRoleId() );
	}

	@Override
	public void setRequiredSecSysRoleId( ICFKeyHash256 requiredSecSysRoleId ) {
		pkey.setRequiredSecSysRoleId( requiredSecSysRoleId );
	}

	@Override
	public String getRequiredEnableName() {
		return( pkey.getRequiredEnableName() );
	}

	@Override
	public void setRequiredEnableName( String requiredEnableName ) {
		pkey.setRequiredEnableName( requiredEnableName );
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
		else if (obj instanceof ISecureSecSysRoleEnables) {
			ISecureSecSysRoleEnables rhs = (ISecureSecSysRoleEnables)obj;
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
			if( getRequiredSecSysRoleId() != null ) {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					if( ! getRequiredSecSysRoleId().equals( rhs.getRequiredSecSysRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					return( false );
				}
			}
			if( getRequiredEnableName() != null ) {
				if( rhs.getRequiredEnableName() != null ) {
					if( ! getRequiredEnableName().equals( rhs.getRequiredEnableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnableName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysRoleEnablesH) {
			ISecureSecSysRoleEnablesH rhs = (ISecureSecSysRoleEnablesH)obj;
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
			if( getRequiredSecSysRoleId() != null ) {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					if( ! getRequiredSecSysRoleId().equals( rhs.getRequiredSecSysRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					return( false );
				}
			}
			if( getRequiredEnableName() != null ) {
				if( rhs.getRequiredEnableName() != null ) {
					if( ! getRequiredEnableName().equals( rhs.getRequiredEnableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnableName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysRoleEnablesHPKey) {
			ISecureSecSysRoleEnablesHPKey rhs = (ISecureSecSysRoleEnablesHPKey)obj;
			if( getRequiredSecSysRoleId() != null ) {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					if( ! getRequiredSecSysRoleId().equals( rhs.getRequiredSecSysRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					return( false );
				}
			}
			if( getRequiredEnableName() != null ) {
				if( rhs.getRequiredEnableName() != null ) {
					if( ! getRequiredEnableName().equals( rhs.getRequiredEnableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnableName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysRoleEnablesBySysRoleIdxKey) {
			ISecureSecSysRoleEnablesBySysRoleIdxKey rhs = (ISecureSecSysRoleEnablesBySysRoleIdxKey)obj;
			if( getRequiredSecSysRoleId() != null ) {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					if( ! getRequiredSecSysRoleId().equals( rhs.getRequiredSecSysRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysRoleEnablesByNameIdxKey) {
			ISecureSecSysRoleEnablesByNameIdxKey rhs = (ISecureSecSysRoleEnablesByNameIdxKey)obj;
			if( getRequiredEnableName() != null ) {
				if( rhs.getRequiredEnableName() != null ) {
					if( ! getRequiredEnableName().equals( rhs.getRequiredEnableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnableName() != null ) {
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
		hashCode = hashCode + getRequiredSecSysRoleId().hashCode();
		if( getRequiredEnableName() != null ) {
			hashCode = hashCode + getRequiredEnableName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSecSysRoleEnables) {
			ISecureSecSysRoleEnables rhs = (ISecureSecSysRoleEnables)obj;
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
		else if (obj instanceof ISecureSecSysRoleEnablesHPKey) {
			ISecureSecSysRoleEnablesHPKey rhs = (ISecureSecSysRoleEnablesHPKey)obj;
			if (getRequiredSecSysRoleId() != null) {
				if (rhs.getRequiredSecSysRoleId() != null) {
					cmp = getRequiredSecSysRoleId().compareTo( rhs.getRequiredSecSysRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysRoleId() != null) {
				return( -1 );
			}
			if (getRequiredEnableName() != null) {
				if (rhs.getRequiredEnableName() != null) {
					cmp = getRequiredEnableName().compareTo( rhs.getRequiredEnableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEnableName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureSecSysRoleEnablesH ) {
			ISecureSecSysRoleEnablesH rhs = (ISecureSecSysRoleEnablesH)obj;
			if (getRequiredSecSysRoleId() != null) {
				if (rhs.getRequiredSecSysRoleId() != null) {
					cmp = getRequiredSecSysRoleId().compareTo( rhs.getRequiredSecSysRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysRoleId() != null) {
				return( -1 );
			}
			if (getRequiredEnableName() != null) {
				if (rhs.getRequiredEnableName() != null) {
					cmp = getRequiredEnableName().compareTo( rhs.getRequiredEnableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEnableName() != null) {
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
		else if (obj instanceof ISecureSecSysRoleEnablesBySysRoleIdxKey) {
			ISecureSecSysRoleEnablesBySysRoleIdxKey rhs = (ISecureSecSysRoleEnablesBySysRoleIdxKey)obj;
			if (getRequiredSecSysRoleId() != null) {
				if (rhs.getRequiredSecSysRoleId() != null) {
					cmp = getRequiredSecSysRoleId().compareTo( rhs.getRequiredSecSysRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysRoleId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSysRoleEnablesByNameIdxKey) {
			ISecureSecSysRoleEnablesByNameIdxKey rhs = (ISecureSecSysRoleEnablesByNameIdxKey)obj;
			if (getRequiredEnableName() != null) {
				if (rhs.getRequiredEnableName() != null) {
					cmp = getRequiredEnableName().compareTo( rhs.getRequiredEnableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEnableName() != null) {
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
	public void set( ISecureSecSysRoleEnables src ) {
		setSecSysRoleEnables( src );
	}

	@Override
	public void setSecSysRoleEnables( ISecureSecSysRoleEnables src ) {
		setRequiredContainerSysRole(src.getRequiredContainerSysRole());
		setRequiredParentEnableGroup(src.getRequiredParentEnableGroup());
		setRequiredSecSysRoleId(src.getRequiredSecSysRoleId());
		setRequiredEnableName(src.getRequiredEnableName());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecureSecSysRoleEnablesH src ) {
		setSecSysRoleEnables( src );
	}

	@Override
	public void setSecSysRoleEnables( ISecureSecSysRoleEnablesH src ) {
		setRequiredContainerSysRole(src.getRequiredSecSysRoleId());
		setRequiredParentEnableGroup(src.getRequiredEnableName());
		setRequiredSecSysRoleId(src.getRequiredSecSysRoleId());
		setRequiredEnableName(src.getRequiredEnableName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment() 
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecSysRoleId=" + "\"" + getRequiredSecSysRoleId().toString() + "\""
			+ " RequiredEnableName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredEnableName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSecSysRoleEnables" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
