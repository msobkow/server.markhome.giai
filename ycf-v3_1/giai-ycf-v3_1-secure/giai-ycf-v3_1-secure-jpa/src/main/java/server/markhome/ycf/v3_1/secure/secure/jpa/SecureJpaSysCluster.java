// Description: Java 25 JPA implementation of a SysCluster entity definition object.

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
	name = "sysclus", schema = "Secure31",
	indexes = {
		@Index(name = "SysClusterIdIdx", columnList = "sgltn_id", unique = true),
		@Index(name = "SysClusterClusterIdx", columnList = "sys_clus_id", unique = false),
		@Index(name = "SysClusterClusterIdxCluster", columnList = "sys_clus_idCluster", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSysCluster
	implements Comparable<Object>,
		ISecureSysCluster,
		Serializable
{
	@Id
	@Column( name="sgltn_id", nullable=false )
	protected int requiredSingletonId;
	protected int requiredRevision;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="sys_clus_idCluster", referencedColumnName="Id" )
	protected SecureJpaCluster requiredContainerCluster;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="sys_clus_id", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredClusterId;

	public BusModelJpaSysCluster() {
		requiredSingletonId = ISecurePubSysCluster.SINGLETONID_INIT_VALUE;
		requiredClusterId = CFDbKeyHash256.fromHex( ISecurePubSysCluster.CLUSTERID_INIT_VALUE.toString() );
	}

	@Override
	public int getClassCode() {
		return( ISecureSysCluster.CLASS_CODE );
	}

	@Override
	public ISecureCluster getRequiredContainerCluster() {
		return(requiredContainerCluster);
	}

	@Override
	public void setRequiredContainerCluster(ISecureCluster argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerCluster", 1, "argObj");
		}
		else if (argObj instanceof SecureJpaCluster) {
			requiredContainerCluster = (SecureJpaCluster)argObj;
			if (requiredContainerCluster != null) {
				requiredClusterId = requiredContainerCluster.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerCluster", "argObj", argObj, "SecureJpaCluster");
		}
	}

	@Override
	public void setRequiredContainerCluster(ISecureProtCluster argObj) {
		setRequiredContainerCluster(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerCluster(ISecurePubCluster argObj) {
		setRequiredContainerCluster(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerCluster(ICFKeyHash256 argClusterId) {
		ISecureSchema targetBackingSchema = ISecureSchema.getBackingSecure();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureClusterTable targetTable = targetBackingSchema.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure().getTableCluster()");
		}
		ISecureCluster targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argClusterId);
		setRequiredContainerCluster(targetRec);
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return getRequiredSingletonId();
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredSingletonId) {
		this.requiredSingletonId = requiredSingletonId;
	}

	@Override
	public int getRequiredSingletonId() {
		return(getPKey().getRequiredSingletonId());
	}

	@Override
	public void setRequiredSingletonId( int value ) {
		if( value < ISecurePubSysCluster.SINGLETONID_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				ISecurePubSysCluster.SINGLETONID_MIN_VALUE );
		}
		if( value > ISecurePubSysCluster.SINGLETONID_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				ISecurePubSysCluster.SINGLETONID_MAX_VALUE );
		}
		getPKey().setRequiredSingletonId(value);
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
	public ICFKeyHash256 getRequiredClusterId() {
		return(requiredClusterId);
	}

	public void setRequiredClusterId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredClusterId",
				1,
				"value" );
		}
		requiredClusterId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureSysCluster) {
			ISecureSysCluster rhs = (ISecureSysCluster)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != null ) {
				if( rhs.getRequiredClusterId() != null ) {
					if( ! getRequiredClusterId().equals( rhs.getRequiredClusterId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClusterId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSysClusterH) {
			ISecureSysClusterH rhs = (ISecureSysClusterH)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != null ) {
				if( rhs.getRequiredClusterId() != null ) {
					if( ! getRequiredClusterId().equals( rhs.getRequiredClusterId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClusterId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureSysClusterHPKey) {
			ISecureSysClusterHPKey rhs = (ISecureSysClusterHPKey)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureSysClusterByClusterIdxKey) {
			ISecureSysClusterByClusterIdxKey rhs = (ISecureSysClusterByClusterIdxKey)obj;
			if( getRequiredClusterId() != null ) {
				if( rhs.getRequiredClusterId() != null ) {
					if( ! getRequiredClusterId().equals( rhs.getRequiredClusterId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClusterId() != null ) {
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
		hashCode = hashCode + getRequiredSingletonId();
		hashCode = hashCode + getRequiredClusterId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureSysCluster) {
			ISecureSysCluster rhs = (ISecureSysCluster)obj;
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
			if (getRequiredClusterId() != null) {
				if (rhs.getRequiredClusterId() != null) {
					cmp = getRequiredClusterId().compareTo( rhs.getRequiredClusterId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClusterId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSysClusterHPKey) {
			ISecureSysClusterHPKey rhs = (ISecureSysClusterHPKey)obj;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureSysClusterH ) {
			ISecureSysClusterH rhs = (ISecureSysClusterH)obj;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			if (getRequiredClusterId() != null) {
				if (rhs.getRequiredClusterId() != null) {
					cmp = getRequiredClusterId().compareTo( rhs.getRequiredClusterId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClusterId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureSysClusterByClusterIdxKey) {
			ISecureSysClusterByClusterIdxKey rhs = (ISecureSysClusterByClusterIdxKey)obj;
			if (getRequiredClusterId() != null) {
				if (rhs.getRequiredClusterId() != null) {
					cmp = getRequiredClusterId().compareTo( rhs.getRequiredClusterId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClusterId() != null) {
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
	public void set( ISecureSysCluster src ) {
		setSysCluster( src );
	}

	@Override
	public void setSysCluster( ISecureSysCluster src ) {
		setRequiredSingletonId(src.getRequiredSingletonId());
		setRequiredRevision( src.getRequiredRevision() );
		setRequiredContainerCluster(src.getRequiredContainerCluster());
		setRequiredClusterId(src.getRequiredClusterId());
	}

	@Override
	public void set( ISecureSysClusterH src ) {
		setSysCluster( src );
	}

	@Override
	public void setSysCluster( ISecureSysClusterH src ) {
		setRequiredSingletonId(src.getRequiredSingletonId());
		setRequiredContainerCluster(src.getRequiredClusterId());
		setRequiredClusterId(src.getRequiredClusterId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredSingletonId=" + "\"" + Integer.toString( getRequiredSingletonId() ) + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSingletonId=" + "\"" + Integer.toString( getRequiredSingletonId() ) + "\""
			+ " RequiredClusterId=" + "\"" + getRequiredClusterId().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaSysCluster" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
