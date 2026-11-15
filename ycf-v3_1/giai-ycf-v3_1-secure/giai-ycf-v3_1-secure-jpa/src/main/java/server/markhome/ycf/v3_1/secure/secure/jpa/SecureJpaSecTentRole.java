// Description: Java 25 JPA implementation of a SecTentRole entity definition object.

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
	name = "SecTentRole", schema = "Secure31",
	indexes = {
		@Index(name = "SecTentRoleIdIdx", columnList = "SecTentRoleId", unique = true),
		@Index(name = "SecTentRoleTenantIdx", columnList = "TenantId", unique = false),
		@Index(name = "SecTentRoleNameIdx", columnList = "safe_name", unique = false),
		@Index(name = "SecTentRoleUNameIdx", columnList = "TenantId, safe_name", unique = true),
		@Index(name = "SecTentRoleTenantIdxTenant", columnList = "TenantIdTenant", unique = false),
		@Index(name = "SecTentRoleNameIdxSysRole", columnList = "safe_nameSysRole", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecTentRole
	implements Comparable<Object>,
		ISecureSecTentRole,
		Serializable
{
	@Id
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SecTentRoleId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredSecTentRoleId;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerRole")
	protected Set<SecureJpaSecTentRoleMemb> optionalChildrenMembByRole;
	protected int requiredRevision;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="TenantIdTenant", referencedColumnName="Id" )
	protected SecureJpaTenant requiredOwnerTenant;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="safe_nameSysRole", referencedColumnName="safe_name" )
	protected SecureJpaSecSysGrp requiredContainerSysRole;

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
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="TenantId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredTenantId;
	@Column( name="safe_name", nullable=false, length=64 )
	protected String requiredName;

	public BusModelJpaSecTentRole() {
		requiredSecTentRoleId = CFDbKeyHash256.fromHex( ISecureProtSecTentRole.SECTENTROLEID_INIT_VALUE.toString() );
		requiredTenantId = CFDbKeyHash256.fromHex( ISecureProtSecTentRole.TENANTID_INIT_VALUE.toString() );
		requiredName = ISecureProtSecTentRole.NAME_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( ISecureSecTentRole.CLASS_CODE );
	}

	@Override
	public List<ISecureSecTentRoleMemb> getOptionalChildrenMembByRole() {
		List<ISecureSecTentRoleMemb> retlist = (optionalChildrenMembByRole != null) ? new ArrayList<>(optionalChildrenMembByRole) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public ISecureTenant getRequiredOwnerTenant() {
		return(requiredOwnerTenant);
	}

	@Override
	public void setRequiredOwnerTenant(ISecureTenant argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setOwnerTenant", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaTenant) {
			requiredOwnerTenant = (SecureJpaTenant)argObj;
			if (requiredOwnerTenant != null) {
				requiredTenantId = requiredOwnerTenant.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOwnerTenant", "argObj", argObj, "SecureJpaTenant");
		}
	}

	@Override
	public void setRequiredOwnerTenant(ISecureProtTenant argObj) {
		setRequiredOwnerTenant(argObj.getRequiredId());
	}

	@Override
	public void setRequiredOwnerTenant(ISecurePubTenant argObj) {
		setRequiredOwnerTenant(argObj.getRequiredId());
	}

	@Override
	public void setRequiredOwnerTenant(ICFKeyHash256 argTenantId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureTenantTable targetTable = targetBackingSchema.getTableTenant();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant", 0, "ISecureSchema.getBackingSecure().getTableTenant()");
		}
		ISecureTenant targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTenantId);
		setRequiredOwnerTenant(targetRec);
	}

	@Override
	public ISecureSecSysGrp getRequiredContainerSysRole() {
		return(requiredContainerSysRole);
	}

	@Override
	public void setRequiredContainerSysRole(ISecureSecSysGrp argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSysRole", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaSecSysGrp) {
			requiredContainerSysRole = (SecureJpaSecSysGrp)argObj;
			if (requiredContainerSysRole != null) {
				requiredName = requiredContainerSysRole.getRequiredName();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerSysRole", "argObj", argObj, "SecureJpaSecSysGrp");
		}
	}

	@Override
	public void setRequiredContainerSysRole(ISecureProtSecSysGrp argObj) {
		setRequiredContainerSysRole(argObj.getRequiredName());
	}

	@Override
	public void setRequiredContainerSysRole(ISecurePubSecSysGrp argObj) {
		setRequiredContainerSysRole(argObj.getRequiredName());
	}

	@Override
	public void setRequiredContainerSysRole(String argName) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSchema.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureSecSysGrp targetRec = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argName);
		setRequiredContainerSysRole(targetRec);
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
	public $implCommaIJavaOptAtomType$ getPKey() {
		return getRequiredSecTentRoleId();
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredSecTentRoleId) {
		this.requiredSecTentRoleId = requiredSecTentRoleId;
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
	public int getRequiredRevision() {
		return( requiredRevision );
	}

	@Override
	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	@Override
	public ICFKeyHash256 getRequiredTenantId() {
		return(requiredTenantId);
	}

	public void setRequiredTenantId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTenantId",
				1,
				"value" );
		}
		requiredTenantId = value;
	}

	@Override
	public String getRequiredName() {
		return(requiredName);
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredName = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureSecTentRole) {
			ISecureSecTentRole rhs = (ISecureSecTentRole)obj;
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
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecTentRoleH) {
			ISecureSecTentRoleH rhs = (ISecureSecTentRoleH)obj;
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
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecTentRoleHPKey) {
			ISecureSecTentRoleHPKey rhs = (ISecureSecTentRoleHPKey)obj;
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
		else if (obj instanceof ISecureSecTentRoleByTenantIdxKey) {
			ISecureSecTentRoleByTenantIdxKey rhs = (ISecureSecTentRoleByTenantIdxKey)obj;
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecTentRoleByNameIdxKey) {
			ISecureSecTentRoleByNameIdxKey rhs = (ISecureSecTentRoleByNameIdxKey)obj;
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecTentRoleByUNameIdxKey) {
			ISecureSecTentRoleByUNameIdxKey rhs = (ISecureSecTentRoleByUNameIdxKey)obj;
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
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
		hashCode = hashCode + getRequiredSecTentRoleId().hashCode();
		hashCode = hashCode + getRequiredTenantId().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSecTentRole) {
			ISecureSecTentRole rhs = (ISecureSecTentRole)obj;
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
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecTentRoleHPKey) {
			ISecureSecTentRoleHPKey rhs = (ISecureSecTentRoleHPKey)obj;
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
			return( 0 );
		}
		else if( obj instanceof ISecureSecTentRoleH ) {
			ISecureSecTentRoleH rhs = (ISecureSecTentRoleH)obj;
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
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecTentRoleByTenantIdxKey) {
			ISecureSecTentRoleByTenantIdxKey rhs = (ISecureSecTentRoleByTenantIdxKey)obj;
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecTentRoleByNameIdxKey) {
			ISecureSecTentRoleByNameIdxKey rhs = (ISecureSecTentRoleByNameIdxKey)obj;
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecTentRoleByUNameIdxKey) {
			ISecureSecTentRoleByUNameIdxKey rhs = (ISecureSecTentRoleByUNameIdxKey)obj;
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
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
	public void set( ISecureSecTentRole src ) {
		setSecTentRole( src );
	}

	@Override
	public void setSecTentRole( ISecureSecTentRole src ) {
		setRequiredSecTentRoleId(src.getRequiredSecTentRoleId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setRequiredContainerSysRole(src.getRequiredContainerSysRole());
		setRequiredTenantId(src.getRequiredTenantId());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public void set( ISecureSecTentRoleH src ) {
		setSecTentRole( src );
	}

	@Override
	public void setSecTentRole( ISecureSecTentRoleH src ) {
		setRequiredSecTentRoleId(src.getRequiredSecTentRoleId());
		setRequiredOwnerTenant(src.getRequiredTenantId());
		setRequiredContainerSysRole(src.getRequiredName());
		setRequiredTenantId(src.getRequiredTenantId());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredSecTentRoleId=" + "\"" + getRequiredSecTentRoleId().toString() + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecTentRoleId=" + "\"" + getRequiredSecTentRoleId().toString() + "\""
			+ " RequiredTenantId=" + "\"" + getRequiredTenantId().toString() + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSecTentRole" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
