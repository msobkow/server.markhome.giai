// Description: Java 25 implementation of a Tenant buffer

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

public class SecureBuffTenant
	implements ISecureTenant, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected ICFKeyHash256 requiredClusterId;
	protected String requiredTenantName;

	public BusModelBuffTenant() {
		requiredId = CFDbKeyHash256.fromHex( ISecurePubTenant.ID_INIT_VALUE.toString() );
		requiredClusterId = CFDbKeyHash256.fromHex( ISecurePubTenant.CLUSTERID_INIT_VALUE.toString() );
		requiredTenantName = ISecurePubTenant.TENANTNAME_INIT_VALUE;
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return (requiredId);
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredId) {
		if(requiredId != null) {
			this.requiredId = requiredId;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredId() {
		return(requiredId);
	}

	public void setRequiredId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredId",
				1,
				"value" );
		}
		requiredId = value;
	}

	@Override
	public List<ISecureSecTentGrp> getOptionalComponentsSecGroup() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsSecGroup", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecTentGrpTable targetTable = targetBackingSecure.getTableSecTentGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsSecGroup", 0, "ISecureSchema.getBackingSecure().getTableSecTentGrp()");
		}
		ISecureSecTentGrp[] targetArr = targetTable.readDerivedByTenantIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredId());
		if( targetArr != null ) {
			List<ISecureSecTentGrp> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecTentGrp> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecTentGrp> getOptionalComponentsSecGroup() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsSecGroup", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecTentGrpTable targetTable = targetBackingSecure.getTableSecTentGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsSecGroup", 0, "ISecureSchema.getBackingSecure().getTableSecTentGrp()");
		}
		ISecureSecTentGrp[] targetArr = targetTable.readDerivedByTenantIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredId());
		if( targetArr != null ) {
			List<ISecureSecTentGrp> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecTentGrp> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecTentRole> getOptionalComponentsSecRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsSecRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecTentRoleTable targetTable = targetBackingSecure.getTableSecTentRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsSecRole", 0, "ISecureSchema.getBackingSecure().getTableSecTentRole()");
		}
		ISecureSecTentRole[] targetArr = targetTable.readDerivedByTenantIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredId());
		if( targetArr != null ) {
			List<ISecureSecTentRole> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecTentRole> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecTentRole> getOptionalComponentsSecRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsSecRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecTentRoleTable targetTable = targetBackingSecure.getTableSecTentRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsSecRole", 0, "ISecureSchema.getBackingSecure().getTableSecTentRole()");
		}
		ISecureSecTentRole[] targetArr = targetTable.readDerivedByTenantIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredId());
		if( targetArr != null ) {
			List<ISecureSecTentRole> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecTentRole> results = new ArrayList<>();
			return( results );
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
		return( ISecureTenant.CLASS_CODE );
	}

	@Override
	public ISecureCluster getRequiredContainerCluster() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure().getTableCluster()");
		}
		ISecureCluster targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClusterId());
		return(targetRec);
	}

	@Override
	public ISecureCluster getRequiredContainerCluster() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure().getTableCluster()");
		}
		ISecureCluster targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClusterId());
		return(targetRec);
	}

	@Override
	public ISecureCluster getRequiredContainerCluster() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure().getTableCluster()");
		}
		ISecurePubCluster targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClusterId());
		return(targetRec);
	}

	@Override
	public void setRequiredContainerCluster(ICFKeyHash256 argClusterId) {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCluster-args", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureCluster found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argClusterId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCluster-args", 0, "found");
		}
		else if ((found instanceof ISecureCluster) || (found instanceof ISecureProtCluster) || (found instanceof ISecurePubCluster)) {
		requiredClusterId = argClusterId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerCluster-args", "found", found, "ISecureClusterISecureProtClusterISecurePubCluster");
		}
	}

	@Override
	public void setRequiredContainerCluster(ISecureCluster argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerCluster", 1, "argObj");
		}
		else {
			setRequiredClusterId(argObj.getRequiredId());
		}
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
	public String getRequiredTenantName() {
		return(requiredTenantName);
	}

	public void setRequiredTenantName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTenantName",
				1,
				"value" );
		}
		else if( value.length() > 192 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredTenantName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredTenantName = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureTenant rhs ) {
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
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
			if( getRequiredTenantName() != null ) {
				if( rhs.getRequiredTenantName() != null ) {
					if( ! getRequiredTenantName().equals( rhs.getRequiredTenantName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureTenantH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
			if( getRequiredTenantName() != null ) {
				if( rhs.getRequiredTenantName() != null ) {
					if( ! getRequiredTenantName().equals( rhs.getRequiredTenantName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureTenantHPKey ) {
			ISecureTenantHPKey rhs = (ISecureTenantHPKey)obj;
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureTenantByClusterIdxKey rhs ) {
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
		else if( obj instanceof ISecureTenantByUNameIdxKey rhs ) {
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
			if( getRequiredTenantName() != null ) {
				if( rhs.getRequiredTenantName() != null ) {
					if( ! getRequiredTenantName().equals( rhs.getRequiredTenantName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTenant rhs ) {
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
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
			if( getRequiredTenantName() != null ) {
				if( rhs.getRequiredTenantName() != null ) {
					if( ! getRequiredTenantName().equals( rhs.getRequiredTenantName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTenantH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
			if( getRequiredTenantName() != null ) {
				if( rhs.getRequiredTenantName() != null ) {
					if( ! getRequiredTenantName().equals( rhs.getRequiredTenantName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTenantHPKey rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureTenantByClusterIdxKey rhs ) {
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
		else if( obj instanceof ISecureTenantByUNameIdxKey rhs ) {
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
			if( getRequiredTenantName() != null ) {
				if( rhs.getRequiredTenantName() != null ) {
					if( ! getRequiredTenantName().equals( rhs.getRequiredTenantName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubTenant rhs ) {
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
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
			if( getRequiredTenantName() != null ) {
				if( rhs.getRequiredTenantName() != null ) {
					if( ! getRequiredTenantName().equals( rhs.getRequiredTenantName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubTenantH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
			if( getRequiredTenantName() != null ) {
				if( rhs.getRequiredTenantName() != null ) {
					if( ! getRequiredTenantName().equals( rhs.getRequiredTenantName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubTenantHPKey rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureTenantByClusterIdxKey rhs ) {
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
		else if( obj instanceof ISecureTenantByUNameIdxKey rhs ) {
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
			if( getRequiredTenantName() != null ) {
				if( rhs.getRequiredTenantName() != null ) {
					if( ! getRequiredTenantName().equals( rhs.getRequiredTenantName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantName() != null ) {
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
		hashCode = hashCode + getRequiredId().hashCode();
		hashCode = hashCode + getRequiredClusterId().hashCode();
		if( getRequiredTenantName() != null ) {
			hashCode = hashCode + getRequiredTenantName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecureTenant rhs ) {
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
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
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
			if (getRequiredTenantName() != null) {
				if (rhs.getRequiredTenantName() != null) {
					cmp = getRequiredTenantName().compareTo( rhs.getRequiredTenantName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureTenantHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureTenantH rhs ) {
			cmp = 0;
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
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
			if (getRequiredTenantName() != null) {
				if (rhs.getRequiredTenantName() != null) {
					cmp = getRequiredTenantName().compareTo( rhs.getRequiredTenantName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureTenantByClusterIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureTenantByUNameIdxKey rhs ) {
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
			if (getRequiredTenantName() != null) {
				if (rhs.getRequiredTenantName() != null) {
					cmp = getRequiredTenantName().compareTo( rhs.getRequiredTenantName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtTenant rhs ) {
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
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
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
			if (getRequiredTenantName() != null) {
				if (rhs.getRequiredTenantName() != null) {
					cmp = getRequiredTenantName().compareTo( rhs.getRequiredTenantName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantName() != null) {
				return( -1 );
			}
			return( 0 );
 		}
		else if( obj instanceof ISecureProtTenantHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtTenantH rhs ) {
			cmp = 0;
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
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
			if (getRequiredTenantName() != null) {
				if (rhs.getRequiredTenantName() != null) {
					cmp = getRequiredTenantName().compareTo( rhs.getRequiredTenantName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtTenantByClusterIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtTenantByUNameIdxKey rhs ) {
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
			if (getRequiredTenantName() != null) {
				if (rhs.getRequiredTenantName() != null) {
					cmp = getRequiredTenantName().compareTo( rhs.getRequiredTenantName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubTenant rhs ) {
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
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
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
			if (getRequiredTenantName() != null) {
				if (rhs.getRequiredTenantName() != null) {
					cmp = getRequiredTenantName().compareTo( rhs.getRequiredTenantName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubTenantHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubTenantH rhs ) {
			cmp = 0;
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
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
			if (getRequiredTenantName() != null) {
				if (rhs.getRequiredTenantName() != null) {
					cmp = getRequiredTenantName().compareTo( rhs.getRequiredTenantName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubTenantByClusterIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubTenantByUNameIdxKey rhs ) {
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
			if (getRequiredTenantName() != null) {
				if (rhs.getRequiredTenantName() != null) {
					cmp = getRequiredTenantName().compareTo( rhs.getRequiredTenantName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantName() != null) {
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
	public void set( ISecureTenant src ) {
		setTenant( src );
	}

	@Override
	public void setTenant( ISecureTenant src ) {
		setRequiredId(src.getRequiredId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredContainerCluster(src.getRequiredContainerCluster());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredTenantName(src.getRequiredTenantName());
	}

	@Override
	public void set( ISecureTenantH src ) {
		setTenant( src );
	}

	@Override
	public void setTenant( ISecureTenantH src ) {
		setRequiredId(src.getRequiredId());
		setRequiredContainerCluster(src.getRequiredContainerCluster());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredTenantName(src.getRequiredTenantName());
	}

	@Override
	public void set( ISecureProtTenant src ) {
		setTenant( src );
	}

	@Override
	public void setTenant( ISecureProtTenant src ) {
		setRequiredId(src.getRequiredId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredContainerCluster(src.getRequiredContainerCluster());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredTenantName(src.getRequiredTenantName());
	}

	@Override
	public void set( ISecureProtTenantH src ) {
		setTenant( src );
	}

	@Override
	public void setTenant( ISecureProtTenantH src ) {
		setRequiredId(src.getRequiredId());
		setRequiredContainerCluster(src.getRequiredContainerCluster());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredTenantName(src.getRequiredTenantName());
	}

	@Override
	public void set( ISecurePubTenant src ) {
		setTenant( src );
	}

	@Override
	public void setTenant( ISecurePubTenant src ) {
		setRequiredId(src.getRequiredId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredContainerCluster(src.getRequiredContainerCluster());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredTenantName(src.getRequiredTenantName());
	}

	@Override
	public void set( ISecurePubTenantH src ) {
		setTenant( src );
	}

	@Override
	public void setTenant( ISecurePubTenantH src ) {
		setRequiredId(src.getRequiredId());
		setRequiredContainerCluster(src.getRequiredContainerCluster());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredTenantName(src.getRequiredTenantName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredClusterId=" + "\"" + getRequiredClusterId().toString() + "\""
			+ " RequiredTenantName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredTenantName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureBuffTenant" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
