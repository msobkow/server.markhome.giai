// Description: Java 17 implJustProtementation of a SecTentGrp buffer

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

public class SecureProtBuffSecTentGrp
	implements ISecureProtSecTentGrp, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredSecTentGrpId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected ICFKeyHash256 requiredTenantId;
	protected String requiredName;

	public BusModelProtBuffSecTentGrp() {
		requiredSecTentGrpId = CFDbKeyHash256.fromHex( ISecureProtSecTentGrp.SECTENTGRPID_INIT_VALUE.toString() );
		requiredTenantId = CFDbKeyHash256.fromHex( ISecureProtSecTentGrp.TENANTID_INIT_VALUE.toString() );
		requiredName = ISecureProtSecTentGrp.NAME_INIT_VALUE;
	}

	@Override
	public ICFKeyHash256 getPKey() {
		return (requiredSecTentGrpId);
	}

	@Override
	public void setPKey(ICFKeyHash256 requiredSecTentGrpId) {
		if(requiredSecTentGrpId != null) {
			this.requiredSecTentGrpId = requiredSecTentGrpId;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredSecTentGrpId() {
		return(requiredSecTentGrpId);
	}

	public void setRequiredSecTentGrpId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecTentGrpId",
				1,
				"value" );
		}
		requiredSecTentGrpId = value;
	}

	@Override
	public List<ISecureProtSecTentGrpMemb> getOptionalChildrenMembByGrp(ICFKeyHash256 argSecTentGrpId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecTentGrpMembTable targetTable = targetBackingSecure.getTableSecTentGrpMemb();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureProtSchema.getBackingSecure().getTableSecTentGrpMemb()");
		}
		ISecureProtSecTentGrpMemb[] targetArr = targetTable.readDerivedByTentGrpIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecTentGrpId());
		if( targetArr != null ) {
			List<ISecureProtSecTentGrpMemb> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return(results);
		}
		else {
			List<ISecureProtSecTentGrpMemb> results = new ArrayList<>();
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
		return( ISecureProtSecTentGrp.CLASS_CODE );
	}

	@Override
	public ISecureProtTenant getRequiredOwnerTenant(ICFKeyHash256 argTenantId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerTenant", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtTenantTable targetTable = targetBackingSecure.getTableTenant();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerTenant", 0, "ISecureProtSchema.getBackingSecure().getTableTenant()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTenantId()));
	}

	@Override
	public void setRequiredOwnerTenant(ICFKeyHash256 argTenantId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant-args", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtTenantTable targetTable = targetBackingSecure.getTableTenant();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant", 0, "ISecureSchema.getBackingSecure().getTableTenant()");
		}
		ISecureProtTenant found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTenantId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant-args", 0, "found");
		}
		else if (found instanceof ISecureProtTenant) || (found instanceof ISecureProtTenant) || (found instanceof ISecurePubTenant)) {
			super.setRequiredOwnerTenant(argTenantId);
		requiredTenantId = argTenantId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredOwnerTenant-args", "found", found, "ISecureProtTenantISecureProtTenantISecurePubTenant");
		}
	}

	@Override
	public void setRequiredOwnerTenant(ISecureProtTenant argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setOwnerTenant", 1, "argObj");
		}
		else {
			setJustProtRequiredTenantId(argObj.getRequiredId());
		}
	}

	@Override
	public void setRequiredOwnerTenant(ISecurePubTenant argObj) {

	}

	@Override
	public ISecureProtSecSysGrp getRequiredContainerSysGrp(String argName) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysGrp", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysGrp", 0, "ISecureProtSchema.getBackingSecure().getTableSecSysGrp()");
		}
		return(targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName()));
	}

	@Override
	public void setRequiredContainerSysGrp(String argName) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysGrp-args", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysGrp", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureProtSecSysGrp found = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argName);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSysGrp-args", 0, "found");
		}
		else if (found instanceof ISecureProtSecSysGrp) || (found instanceof ISecureProtSecSysGrp) || (found instanceof ISecurePubSecSysGrp)) {
			super.setRequiredContainerSysGrp(argName);
		requiredName = argName;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerSysGrp-args", "found", found, "ISecureProtSecSysGrpISecureProtSecSysGrpISecurePubSecSysGrp");
		}
	}

	@Override
	public void setRequiredContainerSysGrp(ISecureProtSecSysGrp argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSysGrp", 1, "argObj");
		}
		else {
			setJustProtRequiredName(argObj.getRequiredName());
		}
	}

	@Override
	public void setRequiredContainerSysGrp(ISecurePubSecSysGrp argObj) {

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
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureProtSecTentGrp rhs ) {
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
			if( getRequiredSecTentGrpId() != null ) {
				if( rhs.getRequiredSecTentGrpId() != null ) {
					if( ! getRequiredSecTentGrpId().equals( rhs.getRequiredSecTentGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecTentGrpId() != null ) {
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
		else if( obj instanceof ISecureProtSecTentGrpH rhs ) {
			if( getRequiredSecTentGrpId() != null ) {
				if( rhs.getRequiredSecTentGrpId() != null ) {
					if( ! getRequiredSecTentGrpId().equals( rhs.getRequiredSecTentGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecTentGrpId() != null ) {
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
		else if( obj instanceof ISecureProtSecTentGrpHPKey ) {
			ISecureProtSecTentGrpHPKey rhs = (ISecureProtSecTentGrpHPKey)obj;
			if( getRequiredSecTentGrpId() != null ) {
				if( rhs.getRequiredSecTentGrpId() != null ) {
					if( ! getRequiredSecTentGrpId().equals( rhs.getRequiredSecTentGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecTentGrpId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtSecTentGrpByTenantIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecTentGrpByNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecTentGrpByUNameIdxKey rhs ) {
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
		int hashCode = 0;
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + getRequiredSecTentGrpId().hashCode();
		hashCode = hashCode + getRequiredTenantId().hashCode();
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
		else if( obj instanceof ISecureProtSecTentGrp rhs ) {
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
			if (getRequiredSecTentGrpId() != null) {
				if (rhs.getRequiredSecTentGrpId() != null) {
					cmp = getRequiredSecTentGrpId().compareTo( rhs.getRequiredSecTentGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecTentGrpId() != null) {
				return( -1 );
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
		else if( obj instanceof ISecureProtSecTentGrpHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredSecTentGrpId() != null) {
				if (rhs.getRequiredSecTentGrpId() != null) {
					cmp = getRequiredSecTentGrpId().compareTo( rhs.getRequiredSecTentGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecTentGrpId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtSecTentGrpH rhs ) {
			cmp = 0;
			if (getRequiredSecTentGrpId() != null) {
				if (rhs.getRequiredSecTentGrpId() != null) {
					cmp = getRequiredSecTentGrpId().compareTo( rhs.getRequiredSecTentGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecTentGrpId() != null) {
				return( -1 );
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
		else if( obj instanceof ISecureProtSecTentGrpByTenantIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtSecTentGrpByNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecTentGrpByUNameIdxKey rhs ) {
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
	public void set( ISecureProtSecTentGrp src ) {
		setJustProtSecTentGrp( src );
	}

	@Override
	public void setSecTentGrp( ISecureProtSecTentGrp src ) {
		setJustProtRequiredSecTentGrpId(src.getRequiredSecTentGrpId());
		setJustProtRequiredRevision( src.getRequiredRevision() );
		setJustProtCreatedByUserId( src.getCreatedByUserId() );
		setJustProtCreatedAt( src.getCreatedAt() );
		setJustProtUpdatedByUserId( src.getUpdatedByUserId() );
		setJustProtUpdatedAt( src.getUpdatedAt() );
		setJustProtRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setJustProtRequiredContainerSysGrp(src.getRequiredContainerSysGrp());
		setJustProtRequiredTenantId(src.getRequiredTenantId());
		setJustProtRequiredName(src.getRequiredName());
	}

	@Override
	public void set( ISecureProtSecTentGrpH src ) {
		setJustProtSecTentGrp( src );
	}

	@Override
	public void setSecTentGrp( ISecureProtSecTentGrpH src ) {
		setJustProtRequiredSecTentGrpId(src.getRequiredSecTentGrpId());
		setJustProtRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setJustProtRequiredContainerSysGrp(src.getRequiredContainerSysGrp());
		setJustProtRequiredTenantId(src.getRequiredTenantId());
		setJustProtRequiredName(src.getRequiredName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + getRequiredSecTentGrpId().toString() + "\"" + "\"" + getRequiredTenantId().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureProtBuffSecTentGrp" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
