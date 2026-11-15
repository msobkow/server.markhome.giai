// Description: Java 25 implementation of a SecClusGrp buffer

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

public class SecureBuffSecClusGrp
	implements ISecureSecClusGrp, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredSecClusGrpId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected ICFKeyHash256 requiredClusterId;
	protected String requiredName;

	public BusModelBuffSecClusGrp() {
		requiredSecClusGrpId = CFDbKeyHash256.fromHex( ISecureProtSecClusGrp.SECCLUSGRPID_INIT_VALUE.toString() );
		requiredClusterId = CFDbKeyHash256.fromHex( ISecureProtSecClusGrp.CLUSTERID_INIT_VALUE.toString() );
		requiredName = ISecureProtSecClusGrp.NAME_INIT_VALUE;
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return (requiredSecClusGrpId);
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredSecClusGrpId) {
		if(requiredSecClusGrpId != null) {
			this.requiredSecClusGrpId = requiredSecClusGrpId;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredSecClusGrpId() {
		return(requiredSecClusGrpId);
	}

	public void setRequiredSecClusGrpId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecClusGrpId",
				1,
				"value" );
		}
		requiredSecClusGrpId = value;
	}

	@Override
	public List<ISecureSecClusGrpMemb> getOptionalChildrenMembByGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecClusGrpMembTable targetTable = targetBackingSecure.getTableSecClusGrpMemb();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureSchema.getBackingSecure().getTableSecClusGrpMemb()");
		}
		ISecureSecClusGrpMemb[] targetArr = targetTable.readDerivedByClusGrpIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecClusGrpId());
		if( targetArr != null ) {
			List<ISecureSecClusGrpMemb> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecClusGrpMemb> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecClusGrpMemb> getOptionalChildrenMembByGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecClusGrpMembTable targetTable = targetBackingSecure.getTableSecClusGrpMemb();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureSchema.getBackingSecure().getTableSecClusGrpMemb()");
		}
		ISecureSecClusGrpMemb[] targetArr = targetTable.readDerivedByClusGrpIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecClusGrpId());
		if( targetArr != null ) {
			List<ISecureSecClusGrpMemb> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecClusGrpMemb> results = new ArrayList<>();
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
		return( ISecureSecClusGrp.CLASS_CODE );
	}

	@Override
	public ISecureCluster getRequiredOwnerCluster() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerCluster", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerCluster", 0, "ISecureSchema.getBackingSecure().getTableCluster()");
		}
		ISecureCluster targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClusterId());
		return(targetRec);
	}

	@Override
	public ISecureCluster getRequiredOwnerCluster() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerCluster", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerCluster", 0, "ISecureSchema.getBackingSecure().getTableCluster()");
		}
		ISecureCluster targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClusterId());
		return(targetRec);
	}

	@Override
	public ISecureCluster getRequiredOwnerCluster() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerCluster", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerCluster", 0, "ISecureSchema.getBackingSecure().getTableCluster()");
		}
		ISecurePubCluster targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClusterId());
		return(targetRec);
	}

	@Override
	public void setRequiredOwnerCluster(ICFKeyHash256 argClusterId) {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerCluster-args", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerCluster", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureCluster found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argClusterId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerCluster-args", 0, "found");
		}
		else if ((found instanceof ISecureCluster) || (found instanceof ISecureProtCluster) || (found instanceof ISecurePubCluster)) {
		requiredClusterId = argClusterId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredOwnerCluster-args", "found", found, "ISecureClusterISecureProtClusterISecurePubCluster");
		}
	}

	@Override
	public void setRequiredOwnerCluster(ISecureCluster argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setOwnerCluster", 1, "argObj");
		}
		else {
			setRequiredClusterId(argObj.getRequiredId());
		}
	}

	@Override
	public ISecureSecSysGrp getRequiredContainerSysGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysGrp", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureSecSysGrp targetRec = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		return(targetRec);
	}

	@Override
	public ISecureSecSysGrp getRequiredContainerSysGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysGrp", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureSecSysGrp targetRec = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		return(targetRec);
	}

	@Override
	public ISecureSecSysGrp getRequiredContainerSysGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysGrp", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecurePubSecSysGrp targetRec = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		return(targetRec);
	}

	@Override
	public void setRequiredContainerSysGrp(String argName) {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysGrp-args", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrp found = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argName);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysGrp-args", 0, "found");
		}
		else if ((found instanceof ISecureSecSysGrp) || (found instanceof ISecureProtSecSysGrp) || (found instanceof ISecurePubSecSysGrp)) {
		requiredName = argName;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerSysGrp-args", "found", found, "ISecureSecSysGrpISecureProtSecSysGrpISecurePubSecSysGrp");
		}
	}

	@Override
	public void setRequiredContainerSysGrp(ISecureSecSysGrp argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSysGrp", 1, "argObj");
		}
		else {
			setRequiredName(argObj.getRequiredName());
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
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureSecClusGrp rhs ) {
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
		else if( obj instanceof ISecureSecClusGrpH rhs ) {
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
		else if( obj instanceof ISecureSecClusGrpHPKey ) {
			ISecureSecClusGrpHPKey rhs = (ISecureSecClusGrpHPKey)obj;
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
		else if( obj instanceof ISecureSecClusGrpByClusterIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecClusGrpByNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecClusGrpByUNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecClusGrp rhs ) {
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
		else if( obj instanceof ISecureProtSecClusGrpH rhs ) {
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
		else if( obj instanceof ISecureProtSecClusGrpHPKey rhs ) {
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
		else if( obj instanceof ISecureSecClusGrpByClusterIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecClusGrpByNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecClusGrpByUNameIdxKey rhs ) {
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
		int hashCode = 0;
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + getRequiredSecClusGrpId().hashCode();
		hashCode = hashCode + getRequiredClusterId().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecureSecClusGrp rhs ) {
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
		else if( obj instanceof ISecureSecClusGrpHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
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
		else if( obj instanceof ISecureSecClusGrpH rhs ) {
			cmp = 0;
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
		else if( obj instanceof ISecureSecClusGrpByClusterIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecClusGrpByNameIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureSecClusGrpByUNameIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtSecClusGrp rhs ) {
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
		else if( obj instanceof ISecureProtSecClusGrpHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
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
		else if( obj instanceof ISecureProtSecClusGrpH rhs ) {
			cmp = 0;
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
		else if( obj instanceof ISecureProtSecClusGrpByClusterIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecClusGrpByNameIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtSecClusGrpByUNameIdxKey rhs ) {
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
	public void set( ISecureSecClusGrp src ) {
		setSecClusGrp( src );
	}

	@Override
	public void setSecClusGrp( ISecureSecClusGrp src ) {
		setRequiredSecClusGrpId(src.getRequiredSecClusGrpId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredOwnerCluster(src.getRequiredOwnerCluster());
		setRequiredContainerSysGrp(src.getRequiredContainerSysGrp());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public void set( ISecureSecClusGrpH src ) {
		setSecClusGrp( src );
	}

	@Override
	public void setSecClusGrp( ISecureSecClusGrpH src ) {
		setRequiredSecClusGrpId(src.getRequiredSecClusGrpId());
		setRequiredOwnerCluster(src.getRequiredOwnerCluster());
		setRequiredContainerSysGrp(src.getRequiredContainerSysGrp());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public void set( ISecureProtSecClusGrp src ) {
		setSecClusGrp( src );
	}

	@Override
	public void setSecClusGrp( ISecureProtSecClusGrp src ) {
		setRequiredSecClusGrpId(src.getRequiredSecClusGrpId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredOwnerCluster(src.getRequiredOwnerCluster());
		setRequiredContainerSysGrp(src.getRequiredContainerSysGrp());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public void set( ISecureProtSecClusGrpH src ) {
		setSecClusGrp( src );
	}

	@Override
	public void setSecClusGrp( ISecureProtSecClusGrpH src ) {
		setRequiredSecClusGrpId(src.getRequiredSecClusGrpId());
		setRequiredOwnerCluster(src.getRequiredOwnerCluster());
		setRequiredContainerSysGrp(src.getRequiredContainerSysGrp());
		setRequiredClusterId(src.getRequiredClusterId());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredSecClusGrpId=" + "\"" + getRequiredSecClusGrpId().toString() + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSecClusGrpId=" + "\"" + getRequiredSecClusGrpId().toString() + "\""
			+ " RequiredClusterId=" + "\"" + getRequiredClusterId().toString() + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureBuffSecClusGrp" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
