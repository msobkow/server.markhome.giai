// Description: Java 17 implJustProtementation of a SecClusRole buffer

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

public class SecureProtBuffSecClusRole
	implements ISecureProtSecClusRole, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredSecClusRoleId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected ICFKeyHash256 requiredClusterId;
	protected String requiredName;

	public BusModelProtBuffSecClusRole() {
		requiredSecClusRoleId = CFDbKeyHash256.fromHex( ISecureProtSecClusRole.SECCLUSROLEID_INIT_VALUE.toString() );
		requiredClusterId = CFDbKeyHash256.fromHex( ISecureProtSecClusRole.CLUSTERID_INIT_VALUE.toString() );
		requiredName = ISecureProtSecClusRole.NAME_INIT_VALUE;
	}

	@Override
	public ICFKeyHash256 getPKey() {
		return (requiredSecClusRoleId);
	}

	@Override
	public void setPKey(ICFKeyHash256 requiredSecClusRoleId) {
		if(requiredSecClusRoleId != null) {
			this.requiredSecClusRoleId = requiredSecClusRoleId;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredSecClusRoleId() {
		return(requiredSecClusRoleId);
	}

	public void setRequiredSecClusRoleId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecClusRoleId",
				1,
				"value" );
		}
		requiredSecClusRoleId = value;
	}

	@Override
	public List<ISecureProtSecClusRoleMemb> getOptionalChildrenMembByGrp(ICFKeyHash256 argSecClusRoleId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecClusRoleMembTable targetTable = targetBackingSecure.getTableSecClusRoleMemb();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureProtSchema.getBackingSecure().getTableSecClusRoleMemb()");
		}
		ISecureProtSecClusRoleMemb[] targetArr = targetTable.readDerivedByClusRoleIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecClusRoleId());
		if( targetArr != null ) {
			List<ISecureProtSecClusRoleMemb> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return(results);
		}
		else {
			List<ISecureProtSecClusRoleMemb> results = new ArrayList<>();
			return(results);
		}
	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setJustProtCreatedByUserId( CFDbKeyHash256 value ) {
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setJustProtCreatedAt( LocalDateTime value ) {
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setJustProtUpdatedByUserId( CFDbKeyHash256 value ) {
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setJustProtUpdatedAt( LocalDateTime value ) {
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
		return( ISecureProtSecClusRole.CLASS_CODE );
	}

	@Override
	public ISecureProtCluster getRequiredOwnerCluster(ICFKeyHash256 argClusterId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerCluster", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerCluster", 0, "ISecureProtSchema.getBackingSecure().getTableCluster()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClusterId()));
	}

	@Override
	public void setRequiredOwnerCluster(ICFKeyHash256 argClusterId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerCluster-args", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerCluster", 0, "ISecureSchema.getBackingSecure().getTableCluster()");
		}
		ISecureProtCluster found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argClusterId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerCluster-args", 0, "found");
		}
		else if (found instanceof ISecureProtCluster) || (found instanceof ISecureProtCluster) || (found instanceof ISecurePubCluster)) {
			super.setRequiredOwnerCluster(argClusterId);
		requiredClusterId = argClusterId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredOwnerCluster-args", "found", found, "ISecureProtClusterISecureProtClusterISecurePubCluster");
		}
	}

	@Override
	public void setRequiredOwnerCluster(ISecureProtCluster argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setOwnerCluster", 1, "argObj");
		}
		else {
			setJustProtRequiredClusterId(argObj.getRequiredId());
		}
	}

	@Override
	public void setRequiredOwnerCluster(ISecurePubCluster argObj) {

	}

	@Override
	public ISecureProtSecSysGrp getRequiredContainerSysRole(String argName) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysRole", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysRole", 0, "ISecureProtSchema.getBackingSecure().getTableSecSysGrp()");
		}
		return(targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName()));
	}

	@Override
	public void setRequiredContainerSysRole(String argName) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysRole-args", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureProtSecSysGrp found = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argName);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysRole-args", 0, "found");
		}
		else if (found instanceof ISecureProtSecSysGrp) || (found instanceof ISecureProtSecSysGrp) || (found instanceof ISecurePubSecSysGrp)) {
			super.setRequiredContainerSysRole(argName);
		requiredName = argName;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerSysRole-args", "found", found, "ISecureProtSecSysGrpISecureProtSecSysGrpISecurePubSecSysGrp");
		}
	}

	@Override
	public void setRequiredContainerSysRole(ISecureProtSecSysGrp argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSysRole", 1, "argObj");
		}
		else {
			setJustProtRequiredName(argObj.getRequiredName());
		}
	}

	@Override
	public void setRequiredContainerSysRole(ISecurePubSecSysGrp argObj) {

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
		else if( obj instanceof ISecureProtSecClusRole rhs ) {
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
			if( getRequiredSecClusRoleId() != null ) {
				if( rhs.getRequiredSecClusRoleId() != null ) {
					if( ! getRequiredSecClusRoleId().equals( rhs.getRequiredSecClusRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecClusRoleId() != null ) {
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
		else if( obj instanceof ISecureProtSecClusRoleH rhs ) {
			if( getRequiredSecClusRoleId() != null ) {
				if( rhs.getRequiredSecClusRoleId() != null ) {
					if( ! getRequiredSecClusRoleId().equals( rhs.getRequiredSecClusRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecClusRoleId() != null ) {
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
		else if( obj instanceof ISecureProtSecClusRoleHPKey ) {
			ISecureProtSecClusRoleHPKey rhs = (ISecureProtSecClusRoleHPKey)obj;
			if( getRequiredSecClusRoleId() != null ) {
				if( rhs.getRequiredSecClusRoleId() != null ) {
					if( ! getRequiredSecClusRoleId().equals( rhs.getRequiredSecClusRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecClusRoleId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecClusRoleByClusterIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecClusRoleByNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecClusRoleByUNameIdxKey rhs ) {
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
		hashCode = hashCode + getRequiredSecClusRoleId().hashCode();
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
		else if( obj instanceof ISecureProtSecClusRole rhs ) {
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
			if (getRequiredSecClusRoleId() != null) {
				if (rhs.getRequiredSecClusRoleId() != null) {
					cmp = getRequiredSecClusRoleId().compareTo( rhs.getRequiredSecClusRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecClusRoleId() != null) {
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
		else if( obj instanceof ISecureProtSecClusRoleHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredSecClusRoleId() != null) {
				if (rhs.getRequiredSecClusRoleId() != null) {
					cmp = getRequiredSecClusRoleId().compareTo( rhs.getRequiredSecClusRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecClusRoleId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtSecClusRoleH rhs ) {
			cmp = 0;
			if (getRequiredSecClusRoleId() != null) {
				if (rhs.getRequiredSecClusRoleId() != null) {
					cmp = getRequiredSecClusRoleId().compareTo( rhs.getRequiredSecClusRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecClusRoleId() != null) {
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
		else if( obj instanceof ISecureProtSecClusRoleByClusterIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecClusRoleByNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecClusRoleByUNameIdxKey rhs ) {
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
	public void set( ISecureProtSecClusRole src ) {
		setJustProtSecClusRole( src );
	}

	@Override
	public void setSecClusRole( ISecureProtSecClusRole src ) {
		setJustProtRequiredSecClusRoleId(src.getRequiredSecClusRoleId());
		setJustProtRequiredRevision( src.getRequiredRevision() );
		setJustProtCreatedByUserId( src.getCreatedByUserId() );
		setJustProtCreatedAt( src.getCreatedAt() );
		setJustProtUpdatedByUserId( src.getUpdatedByUserId() );
		setJustProtUpdatedAt( src.getUpdatedAt() );
		setJustProtRequiredOwnerCluster(src.getRequiredOwnerCluster());
		setJustProtRequiredContainerSysRole(src.getRequiredContainerSysRole());
		setJustProtRequiredClusterId(src.getRequiredClusterId());
		setJustProtRequiredName(src.getRequiredName());
	}

	@Override
	public void set( ISecureProtSecClusRoleH src ) {
		setJustProtSecClusRole( src );
	}

	@Override
	public void setSecClusRole( ISecureProtSecClusRoleH src ) {
		setJustProtRequiredSecClusRoleId(src.getRequiredSecClusRoleId());
		setJustProtRequiredOwnerCluster(src.getRequiredOwnerCluster());
		setJustProtRequiredContainerSysRole(src.getRequiredContainerSysRole());
		setJustProtRequiredClusterId(src.getRequiredClusterId());
		setJustProtRequiredName(src.getRequiredName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + getRequiredSecClusRoleId().toString() + "\"" + "\"" + getRequiredClusterId().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureProtBuffSecClusRole" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
