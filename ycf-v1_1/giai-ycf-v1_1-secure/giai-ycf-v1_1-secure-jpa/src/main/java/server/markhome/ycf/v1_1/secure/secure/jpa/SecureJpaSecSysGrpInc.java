// Description: Java 25 JPA implementation of a SecSysGrpInc entity definition object.

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
	name = "SecSysGrpInc", schema = "Secure31",
	indexes = {
		@Index(name = "SecSysGrpIncIdIdx", columnList = "SecSysGrpId, inc_name", unique = true),
		@Index(name = "SecSysGrpIncSysGrpIdx", columnList = "SecSysGrpId", unique = false),
		@Index(name = "SecSysGrpIncNameIdx", columnList = "inc_name", unique = false),
		@Index(name = "SecSysGrpIncSysGrpIdxGroup", columnList = "SecSysGrpIdGroup", unique = false),
		@Index(name = "SecSysGrpIncNameIdxSubGroup", columnList = "inc_nameSubGroup", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecSysGrpInc
	implements Comparable<Object>,
		ISecureSecSysGrpInc,
		Serializable
{
	// Embedded id's are package-accessible so that the Repository can dereference the attributes of the primary key
	@AttributeOverrides({
		@AttributeOverride(name="SecSysGrpId", column = @Column( name="SecSysGrpId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="inc_name", column = @Column( name="inc_name", nullable=false, length=64 ) )
	})
	@EmbeddedId
	SecureJpaSecSysGrpIncPKey pkey = new SecureJpaSecSysGrpIncPKey();
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="SecSysGrpIdGroup", referencedColumnName="SecSysGrpId" )
	protected SecureJpaSecSysGrp requiredContainerGroup;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="inc_nameSubGroup", referencedColumnName="safe_name" )
	protected SecureJpaSecSysGrp requiredParentSubGroup;
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

	public BusModelJpaSecSysGrpInc() {
		pkey = new SecureJpaSecSysGrpIncPKey();
	}

	@Override
	public int getClassCode() {
		return( ISecureSecSysGrpInc.CLASS_CODE );
	}

	@Override
	public ISecureSecSysGrp getRequiredContainerGroup() {
		return(requiredContainerGroup);
	}

	@Override
	public void setRequiredContainerGroup(ISecureSecSysGrp argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerGroup", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecSysGrp) {
			requiredContainerGroup = (SecureJpaSecSysGrp)argObj;
			if (requiredContainerGroup != null) {
				getPKey().setRequiredSecSysGrpId(requiredContainerGroup.getRequiredSecSysGrpId());
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerGroup", "argObj", argObj, "SecureJpaSecSysGrp");
		}
	
	}

	@Override
	public void setRequiredContainerGroup(ISecureProtSecSysGrp argObj) {
		setRequiredContainerGroup(argObj.getRequiredSecSysGrpId());
	}

	@Override
	public void setRequiredContainerGroup(ISecurePubSecSysGrp argObj) {
		setRequiredContainerGroup(argObj.getRequiredSecSysGrpId());
	}

	@Override
	public void setRequiredContainerGroup(ICFKeyHash256 argSecSysGrpId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerGroup", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSchema.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerGroup", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureSecSysGrp targetRec = targetTable.readDerivedByIdIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSecSysGrpId);
		setRequiredContainerGroup(targetRec);
	}

	@Override
	public ISecureSecSysGrp getRequiredParentSubGroup() {
		return(requiredParentSubGroup);
	}

	@Override
	public void setRequiredParentSubGroup(ISecureSecSysGrp argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentSubGroup", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecSysGrp) {
			requiredParentSubGroup = (SecureJpaSecSysGrp)argObj;
			if (requiredParentSubGroup != null) {
				getPKey().setRequiredInclName(requiredParentSubGroup.getRequiredName());
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setParentSubGroup", "argObj", argObj, "SecureJpaSecSysGrp");
		}
	
	}

	@Override
	public void setRequiredParentSubGroup(ISecureProtSecSysGrp argObj) {
		setRequiredParentSubGroup(argObj.getRequiredName());
	}

	@Override
	public void setRequiredParentSubGroup(ISecurePubSecSysGrp argObj) {
		setRequiredParentSubGroup(argObj.getRequiredName());
	}

	@Override
	public void setRequiredParentSubGroup(String argInclName) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentSubGroup", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSchema.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentSubGroup", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureSecSysGrp targetRec = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argInclName);
		setRequiredParentSubGroup(targetRec);
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
	public ISecureSecSysGrpIncPKey getPKey() {
		return pkey;
	}

	@Override
	public void setPKey(ISecureSecSysGrpIncPKey pkey ) {
		if (pkey == null) {
			throw new CFNullArgumentException(getClass(), "setPKey", 1, "pkey");
		}
		else if (!(pkey instanceof SecureJpaSecSysGrpIncPKey)) {
			throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureJpaSecSysGrpIncPKey");
		}
		this.pkey = (SecureJpaSecSysGrpIncPKey)pkey;
	}

	@Override
	public ICFKeyHash256 getRequiredSecSysGrpId() {
		return( pkey.getRequiredSecSysGrpId() );
	}

	@Override
	public void setRequiredSecSysGrpId( ICFKeyHash256 requiredSecSysGrpId ) {
		pkey.setRequiredSecSysGrpId( requiredSecSysGrpId );
	}

	@Override
	public String getRequiredInclName() {
		return( pkey.getRequiredInclName() );
	}

	@Override
	public void setRequiredInclName( String requiredInclName ) {
		pkey.setRequiredInclName( requiredInclName );
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
		else if (obj instanceof ISecureSecSysGrpInc) {
			ISecureSecSysGrpInc rhs = (ISecureSecSysGrpInc)obj;
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
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredInclName() != null ) {
				if( rhs.getRequiredInclName() != null ) {
					if( ! getRequiredInclName().equals( rhs.getRequiredInclName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredInclName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpIncH) {
			ISecureSecSysGrpIncH rhs = (ISecureSecSysGrpIncH)obj;
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
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredInclName() != null ) {
				if( rhs.getRequiredInclName() != null ) {
					if( ! getRequiredInclName().equals( rhs.getRequiredInclName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredInclName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpIncHPKey) {
			ISecureSecSysGrpIncHPKey rhs = (ISecureSecSysGrpIncHPKey)obj;
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredInclName() != null ) {
				if( rhs.getRequiredInclName() != null ) {
					if( ! getRequiredInclName().equals( rhs.getRequiredInclName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredInclName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpIncBySysGrpIdxKey) {
			ISecureSecSysGrpIncBySysGrpIdxKey rhs = (ISecureSecSysGrpIncBySysGrpIdxKey)obj;
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpIncByNameIdxKey) {
			ISecureSecSysGrpIncByNameIdxKey rhs = (ISecureSecSysGrpIncByNameIdxKey)obj;
			if( getRequiredInclName() != null ) {
				if( rhs.getRequiredInclName() != null ) {
					if( ! getRequiredInclName().equals( rhs.getRequiredInclName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredInclName() != null ) {
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
		hashCode = hashCode + getRequiredSecSysGrpId().hashCode();
		if( getRequiredInclName() != null ) {
			hashCode = hashCode + getRequiredInclName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSecSysGrpInc) {
			ISecureSecSysGrpInc rhs = (ISecureSecSysGrpInc)obj;
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
		else if (obj instanceof ISecureSecSysGrpIncHPKey) {
			ISecureSecSysGrpIncHPKey rhs = (ISecureSecSysGrpIncHPKey)obj;
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredInclName() != null) {
				if (rhs.getRequiredInclName() != null) {
					cmp = getRequiredInclName().compareTo( rhs.getRequiredInclName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredInclName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureSecSysGrpIncH ) {
			ISecureSecSysGrpIncH rhs = (ISecureSecSysGrpIncH)obj;
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredInclName() != null) {
				if (rhs.getRequiredInclName() != null) {
					cmp = getRequiredInclName().compareTo( rhs.getRequiredInclName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredInclName() != null) {
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
		else if (obj instanceof ISecureSecSysGrpIncBySysGrpIdxKey) {
			ISecureSecSysGrpIncBySysGrpIdxKey rhs = (ISecureSecSysGrpIncBySysGrpIdxKey)obj;
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSysGrpIncByNameIdxKey) {
			ISecureSecSysGrpIncByNameIdxKey rhs = (ISecureSecSysGrpIncByNameIdxKey)obj;
			if (getRequiredInclName() != null) {
				if (rhs.getRequiredInclName() != null) {
					cmp = getRequiredInclName().compareTo( rhs.getRequiredInclName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredInclName() != null) {
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
	public void set( ISecureSecSysGrpInc src ) {
		setSecSysGrpInc( src );
	}

	@Override
	public void setSecSysGrpInc( ISecureSecSysGrpInc src ) {
		setRequiredContainerGroup(src.getRequiredContainerGroup());
		setRequiredParentSubGroup(src.getRequiredParentSubGroup());
		setRequiredSecSysGrpId(src.getRequiredSecSysGrpId());
		setRequiredInclName(src.getRequiredInclName());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
	}

	@Override
	public void set( ISecureSecSysGrpIncH src ) {
		setSecSysGrpInc( src );
	}

	@Override
	public void setSecSysGrpInc( ISecureSecSysGrpIncH src ) {
		setRequiredContainerGroup(src.getRequiredSecSysGrpId());
		setRequiredParentSubGroup(src.getRequiredInclName());
		setRequiredSecSysGrpId(src.getRequiredSecSysGrpId());
		setRequiredInclName(src.getRequiredInclName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment() 
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecSysGrpId=" + "\"" + getRequiredSecSysGrpId().toString() + "\""
			+ " RequiredInclName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredInclName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSecSysGrpInc" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
