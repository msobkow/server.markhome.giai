// Description: Java 25 JPA implementation of a SecSysGrp entity definition object.

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
	name = "SecSysGrp", schema = "Secure31",
	indexes = {
		@Index(name = "SecSysGrpIdIdx", columnList = "SecSysGrpId", unique = true),
		@Index(name = "SecSysGrpUNameIdx", columnList = "safe_name", unique = true),
		@Index(name = "SecSysGrpLevelIdx", columnList = "sec_level", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecSysGrp
	implements Comparable<Object>,
		ISecureSecSysGrp,
		Serializable
{
	@Id
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SecSysGrpId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredSecSysGrpId;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerGroup")
	protected Set<SecureJpaSecSysGrpInc> optionalComponentsIncByGrp;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerGroup")
	protected Set<SecureJpaSecSysGrpMemb> optionalChildrenMembByGrp;
	@OneToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="SecSysGrpId", referencedColumnName="SecSysRoleId" )
	protected SecureJpaSecSysRole optionalComponentsImplSysRole;
	protected int requiredRevision;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerSysGrp")
	protected Set<SecureJpaSecClusGrp> optionalComponentsImplClusGrp;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerSysGrp")
	protected Set<SecureJpaSecTentGrp> optionalComponentsImplTentGrp;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerSysRole")
	protected Set<SecureJpaSecClusRole> optionalComponentsImplClusRole;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerSysRole")
	protected Set<SecureJpaSecTentRole> optionalComponentsImplTentRole;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredParentSubGroup")
	protected Set<SecureJpaSecSysGrpInc> optionalChildrenSysGrpByName;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredParentEnableGroup")
	protected Set<SecureJpaSecSysRoleEnables> optionalChildrenRoleByEnableName;

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
	@Column( name="safe_name", nullable=false, length=64 )
	protected String requiredName;
	@Column( name="sec_level", nullable=false )
	protected ISecurePubSchema.SecLevelEnum requiredSecLevel;

	public BusModelJpaSecSysGrp() {
		requiredSecSysGrpId = CFDbKeyHash256.fromHex( ISecurePubSecSysGrp.SECSYSGRPID_INIT_VALUE.toString() );
		requiredName = ISecurePubSecSysGrp.NAME_INIT_VALUE;
		requiredSecLevel = ISecurePubSecSysGrp.SECLEVEL_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( ISecureSecSysGrp.CLASS_CODE );
	}

	@Override
	public List<ISecureSecSysGrpInc> getOptionalComponentsIncByGrp() {
		List<ISecureSecSysGrpInc> retlist = (optionalComponentsIncByGrp != null) ? new ArrayList<>(optionalComponentsIncByGrp) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<ISecureSecSysGrpMemb> getOptionalChildrenMembByGrp() {
		List<ISecureSecSysGrpMemb> retlist = (optionalChildrenMembByGrp != null) ? new ArrayList<>(optionalChildrenMembByGrp) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public ISecureSecSysRole getOptionalComponentsImplSysRole() {
		return(optionalComponentsImplSysRole);
	}

	@Override
	public List<ISecureSecClusGrp> getOptionalComponentsImplClusGrp() {
		List<ISecureSecClusGrp> retlist = (optionalComponentsImplClusGrp != null) ? new ArrayList<>(optionalComponentsImplClusGrp) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<ISecureSecTentGrp> getOptionalComponentsImplTentGrp() {
		List<ISecureSecTentGrp> retlist = (optionalComponentsImplTentGrp != null) ? new ArrayList<>(optionalComponentsImplTentGrp) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<ISecureSecClusRole> getOptionalComponentsImplClusRole() {
		List<ISecureSecClusRole> retlist = (optionalComponentsImplClusRole != null) ? new ArrayList<>(optionalComponentsImplClusRole) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<ISecureSecTentRole> getOptionalComponentsImplTentRole() {
		List<ISecureSecTentRole> retlist = (optionalComponentsImplTentRole != null) ? new ArrayList<>(optionalComponentsImplTentRole) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<ISecureSecSysGrpInc> getOptionalChildrenSysGrpByName() {
		List<ISecureSecSysGrpInc> retlist = (optionalChildrenSysGrpByName != null) ? new ArrayList<>(optionalChildrenSysGrpByName) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public List<ISecureSecSysRoleEnables> getOptionalChildrenRoleByEnableName() {
		List<ISecureSecSysRoleEnables> retlist = (optionalChildrenRoleByEnableName != null) ? new ArrayList<>(optionalChildrenRoleByEnableName) : new ArrayList<>();
		return( retlist );
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
		return getRequiredSecSysGrpId();
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredSecSysGrpId) {
		this.requiredSecSysGrpId = requiredSecSysGrpId;
	}

	@Override
	public ICFKeyHash256 getRequiredSecSysGrpId() {
		return(getPKey().getRequiredSecSysGrpId());
	}

	public void setRequiredSecSysGrpId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecSysGrpId",
				1,
				"value" );
		}
		getPKey().setRequiredSecSysGrpId(value);
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
	public ISecurePubSchema.SecLevelEnum getRequiredSecLevel() {
		return(requiredSecLevel);
	}

	public void setRequiredSecLevel( ISecurePubSchema.SecLevelEnum value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecLevel",
				1,
				"value" );
		}
		requiredSecLevel = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureSecSysGrp) {
			ISecureSecSysGrp rhs = (ISecureSecSysGrp)obj;
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
			if( getRequiredSecLevel() != null ) {
				if( rhs.getRequiredSecLevel() != null ) {
					if( ! getRequiredSecLevel().equals( rhs.getRequiredSecLevel() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecLevel() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpH) {
			ISecureSecSysGrpH rhs = (ISecureSecSysGrpH)obj;
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
			if( getRequiredSecLevel() != null ) {
				if( rhs.getRequiredSecLevel() != null ) {
					if( ! getRequiredSecLevel().equals( rhs.getRequiredSecLevel() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecLevel() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSecSysGrpHPKey) {
			ISecureSecSysGrpHPKey rhs = (ISecureSecSysGrpHPKey)obj;
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
		else if (obj instanceof ISecureSecSysGrpByUNameIdxKey) {
			ISecureSecSysGrpByUNameIdxKey rhs = (ISecureSecSysGrpByUNameIdxKey)obj;
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
		else if (obj instanceof ISecureSecSysGrpBySecLevelIdxKey) {
			ISecureSecSysGrpBySecLevelIdxKey rhs = (ISecureSecSysGrpBySecLevelIdxKey)obj;
			if( getRequiredSecLevel() != null ) {
				if( rhs.getRequiredSecLevel() != null ) {
					if( ! getRequiredSecLevel().equals( rhs.getRequiredSecLevel() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecLevel() != null ) {
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
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredSecLevel().ordinal();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSecSysGrp) {
			ISecureSecSysGrp rhs = (ISecureSecSysGrp)obj;
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
			if (getRequiredSecLevel() != null) {
				if (rhs.getRequiredSecLevel() != null) {
					cmp = getRequiredSecLevel().compareTo( rhs.getRequiredSecLevel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecLevel() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSysGrpHPKey) {
			ISecureSecSysGrpHPKey rhs = (ISecureSecSysGrpHPKey)obj;
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
		else if( obj instanceof ISecureSecSysGrpH ) {
			ISecureSecSysGrpH rhs = (ISecureSecSysGrpH)obj;
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
			if (getRequiredSecLevel() != null) {
				if (rhs.getRequiredSecLevel() != null) {
					cmp = getRequiredSecLevel().compareTo( rhs.getRequiredSecLevel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecLevel() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSecSysGrpByUNameIdxKey) {
			ISecureSecSysGrpByUNameIdxKey rhs = (ISecureSecSysGrpByUNameIdxKey)obj;
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
		else if (obj instanceof ISecureSecSysGrpBySecLevelIdxKey) {
			ISecureSecSysGrpBySecLevelIdxKey rhs = (ISecureSecSysGrpBySecLevelIdxKey)obj;
			if (getRequiredSecLevel() != null) {
				if (rhs.getRequiredSecLevel() != null) {
					cmp = getRequiredSecLevel().compareTo( rhs.getRequiredSecLevel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecLevel() != null) {
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
	public void set( ISecureSecSysGrp src ) {
		setSecSysGrp( src );
	}

	@Override
	public void setSecSysGrp( ISecureSecSysGrp src ) {
		setRequiredSecSysGrpId(src.getRequiredSecSysGrpId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredName(src.getRequiredName());
		setRequiredSecLevel(src.getRequiredSecLevel());
	}

	@Override
	public void set( ISecureSecSysGrpH src ) {
		setSecSysGrp( src );
	}

	@Override
	public void setSecSysGrp( ISecureSecSysGrpH src ) {
		setRequiredSecSysGrpId(src.getRequiredSecSysGrpId());
		setRequiredName(src.getRequiredName());
		setRequiredSecLevel(src.getRequiredSecLevel());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredSecSysGrpId=" + "\"" + getRequiredSecSysGrpId().toString() + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecSysGrpId=" + "\"" + getRequiredSecSysGrpId().toString() + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\""
			+ " RequiredSecLevel=" + "\"" + getRequiredSecLevel().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSecSysGrp" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
