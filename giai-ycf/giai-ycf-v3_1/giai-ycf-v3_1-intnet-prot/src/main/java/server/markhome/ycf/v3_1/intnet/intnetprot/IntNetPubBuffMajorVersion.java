// Description: Java 17 implJustPubementation of a MajorVersion buffer

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

package server.markhome.ycf.v3_1.intnet.intnet.buff;

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
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public class IntNetPubBuffMajorVersion
	implements IIntNetPubMajorVersion, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(IIntNetPubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(IIntNetPubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(IIntNetPubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(IIntNetPubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected ICFKeyHash256 requiredTenantId;
	protected ICFKeyHash256 requiredSubProjectId;
	protected String requiredName;
	protected String optionalDescription;

	public BusModelPubBuffMajorVersion() {
		requiredId = CFDbKeyHash256.fromHex( IIntNetPubMajorVersion.ID_INIT_VALUE.toString() );
		requiredTenantId = CFDbKeyHash256.fromHex( IIntNetPubMajorVersion.TENANTID_INIT_VALUE.toString() );
		requiredSubProjectId = CFDbKeyHash256.fromHex( IIntNetPubMajorVersion.SUBPROJECTID_INIT_VALUE.toString() );
		requiredName = IIntNetPubMajorVersion.NAME_INIT_VALUE;
		optionalDescription = null;
	}

	@Override
	public ICFKeyHash256 getPKey() {
		return (requiredId);
	}

	@Override
	public void setPKey(ICFKeyHash256 requiredId) {
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
	public List<IIntNetPubMinorVersion> getOptionalComponentsMinorVer(ICFKeyHash256 argId) {
		IIntNetPubSchema targetBackingIntNet = IIntNetPubSchema.getBackingIntNet();
		if (targetBackingIntNet == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsMinorVer", 0, "IIntNetPubSchema.getBackingIntNet()");
		}
		IIntNetPubMinorVersionTable targetTable = targetBackingIntNet.getTableMinorVersion();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsMinorVer", 0, "IIntNetPubSchema.getBackingIntNet().getTableMinorVersion()");
		}
		IIntNetPubMinorVersion[] targetArr = targetTable.readDerivedByMajorVerIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredId());
		if( targetArr != null ) {
			List<IIntNetPubMinorVersion> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return(results);
		}
		else {
			List<IIntNetPubMinorVersion> results = new ArrayList<>();
			return(results);
		}
	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setJustPubCreatedByUserId( CFDbKeyHash256 value ) {
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setJustPubCreatedAt( LocalDateTime value ) {
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setJustPubUpdatedByUserId( CFDbKeyHash256 value ) {
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setJustPubUpdatedAt( LocalDateTime value ) {
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
		return( IIntNetPubMajorVersion.CLASS_CODE );
	}

	@Override
	public ISecurePubTenant getRequiredOwnerTenant(ICFKeyHash256 argTenantId) {
		ISecurePubSchema targetBackingSecure = ISecurePubSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerTenant", 0, "ISecurePubSchema.getBackingSecure()");
		}
		ISecurePubTenantTable targetTable = targetBackingSecure.getTableTenant();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerTenant", 0, "ISecurePubSchema.getBackingSecure().getTableTenant()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTenantId()));
	}

	@Override
	public void setRequiredOwnerTenant(ICFKeyHash256 argTenantId) {
		ISecurePubSchema targetBackingSecure = ISecurePubSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant-args", 0, "ISecurePubSchema.getBackingSecure()");
		}
		ISecurePubTenantTable targetTable = targetBackingSecure.getTableTenant();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant", 0, "ISecureSchema.getBackingSecure().getTableTenant()");
		}
		ISecurePubTenant found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTenantId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant-args", 0, "found");
		}
		else if (found instanceof ISecurePubTenant) || (found instanceof ISecurePubTenant)) {
			super.setRequiredOwnerTenant(argTenantId);
		requiredTenantId = argTenantId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredOwnerTenant-args", "found", found, "ISecurePubTenantISecurePubTenant");
		}
	}

	@Override
	public void setRequiredOwnerTenant(ISecurePubTenant argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setOwnerTenant", 1, "argObj");
		}
		else {
			setRequiredTenantId(argObj.getRequiredId());
		}
	}

	@Override
	public IIntNetPubSubProject getRequiredContainerParentSPrj(ICFKeyHash256 argSubProjectId) {
		IIntNetPubSchema targetBackingIntNet = IIntNetPubSchema.getBackingIntNet();
		if (targetBackingIntNet == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerParentSPrj", 0, "IIntNetPubSchema.getBackingIntNet()");
		}
		IIntNetPubSubProjectTable targetTable = targetBackingIntNet.getTableSubProject();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerParentSPrj", 0, "IIntNetPubSchema.getBackingIntNet().getTableSubProject()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSubProjectId()));
	}

	@Override
	public void setRequiredContainerParentSPrj(ICFKeyHash256 argSubProjectId) {
		IIntNetPubSchema targetBackingIntNet = IIntNetPubSchema.getBackingIntNet();
		if (targetBackingIntNet == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerParentSPrj-args", 0, "IIntNetPubSchema.getBackingIntNet()");
		}
		IIntNetPubSubProjectTable targetTable = targetBackingIntNet.getTableSubProject();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerParentSPrj", 0, "IIntNetSchema.getBackingIntNet().getTableSubProject()");
		}
		IIntNetPubSubProject found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSubProjectId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerParentSPrj-args", 0, "found");
		}
		else if (found instanceof IIntNetPubSubProject) || (found instanceof IIntNetPubSubProject)) {
			super.setRequiredContainerParentSPrj(argSubProjectId);
		requiredSubProjectId = argSubProjectId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerParentSPrj-args", "found", found, "IIntNetPubSubProjectIIntNetPubSubProject");
		}
	}

	@Override
	public void setRequiredContainerParentSPrj(IIntNetPubSubProject argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerParentSPrj", 1, "argObj");
		}
		else {
			setRequiredSubProjectId(argObj.getRequiredId());
		}
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
	public ICFKeyHash256 getRequiredSubProjectId() {
		return(requiredSubProjectId);
	}

	public void setRequiredSubProjectId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSubProjectId",
				1,
				"value" );
		}
		requiredSubProjectId = value;
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
	public String getOptionalDescription() {
		return(optionalDescription);
	}

	public void setOptionalDescription( String value ) {
		if( value != null && value.length() > 1024 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDescription",
				1,
				"value.length()",
				value.length(),
				1024 );
		}
		optionalDescription = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IIntNetPubMajorVersion rhs ) {
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
			if( getRequiredSubProjectId() != null ) {
				if( rhs.getRequiredSubProjectId() != null ) {
					if( ! getRequiredSubProjectId().equals( rhs.getRequiredSubProjectId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSubProjectId() != null ) {
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
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMajorVersionH rhs ) {
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
			if( getRequiredSubProjectId() != null ) {
				if( rhs.getRequiredSubProjectId() != null ) {
					if( ! getRequiredSubProjectId().equals( rhs.getRequiredSubProjectId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSubProjectId() != null ) {
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
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMajorVersionHPKey ) {
			IIntNetPubMajorVersionHPKey rhs = (IIntNetPubMajorVersionHPKey)obj;
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
		else if( obj instanceof IIntNetPubMajorVersionByTenantIdxKey rhs ) {
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
		else if( obj instanceof IIntNetPubMajorVersionBySubProjectIdxKey rhs ) {
			if( getRequiredSubProjectId() != null ) {
				if( rhs.getRequiredSubProjectId() != null ) {
					if( ! getRequiredSubProjectId().equals( rhs.getRequiredSubProjectId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSubProjectId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMajorVersionByNameIdxKey rhs ) {
			if( getRequiredSubProjectId() != null ) {
				if( rhs.getRequiredSubProjectId() != null ) {
					if( ! getRequiredSubProjectId().equals( rhs.getRequiredSubProjectId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSubProjectId() != null ) {
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
		else if( obj instanceof IIntNetPubMajorVersion rhs ) {
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
			if( getRequiredSubProjectId() != null ) {
				if( rhs.getRequiredSubProjectId() != null ) {
					if( ! getRequiredSubProjectId().equals( rhs.getRequiredSubProjectId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSubProjectId() != null ) {
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
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMajorVersionH rhs ) {
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
			if( getRequiredSubProjectId() != null ) {
				if( rhs.getRequiredSubProjectId() != null ) {
					if( ! getRequiredSubProjectId().equals( rhs.getRequiredSubProjectId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSubProjectId() != null ) {
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
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMajorVersionHPKey rhs ) {
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
		else if( obj instanceof IIntNetPubMajorVersionByTenantIdxKey rhs ) {
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
		else if( obj instanceof IIntNetPubMajorVersionBySubProjectIdxKey rhs ) {
			if( getRequiredSubProjectId() != null ) {
				if( rhs.getRequiredSubProjectId() != null ) {
					if( ! getRequiredSubProjectId().equals( rhs.getRequiredSubProjectId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSubProjectId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubMajorVersionByNameIdxKey rhs ) {
			if( getRequiredSubProjectId() != null ) {
				if( rhs.getRequiredSubProjectId() != null ) {
					if( ! getRequiredSubProjectId().equals( rhs.getRequiredSubProjectId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSubProjectId() != null ) {
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
		hashCode = hashCode + getRequiredId().hashCode();
		hashCode = hashCode + getRequiredTenantId().hashCode();
		hashCode = hashCode + getRequiredSubProjectId().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalDescription() != null ) {
			hashCode = hashCode + getOptionalDescription().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IIntNetPubMajorVersion rhs ) {
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
			if (getRequiredSubProjectId() != null) {
				if (rhs.getRequiredSubProjectId() != null) {
					cmp = getRequiredSubProjectId().compareTo( rhs.getRequiredSubProjectId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSubProjectId() != null) {
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
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			return( 0 );
 		}
		else if( obj instanceof IIntNetPubMajorVersionHPKey rhs ) {
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
		else if( obj instanceof IIntNetPubMajorVersionH rhs ) {
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
			if (getRequiredSubProjectId() != null) {
				if (rhs.getRequiredSubProjectId() != null) {
					cmp = getRequiredSubProjectId().compareTo( rhs.getRequiredSubProjectId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSubProjectId() != null) {
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
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubMajorVersionByTenantIdxKey rhs ) {
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
		else if( obj instanceof IIntNetPubMajorVersionBySubProjectIdxKey rhs ) {
			if (getRequiredSubProjectId() != null) {
				if (rhs.getRequiredSubProjectId() != null) {
					cmp = getRequiredSubProjectId().compareTo( rhs.getRequiredSubProjectId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSubProjectId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetPubMajorVersionByNameIdxKey rhs ) {
			if (getRequiredSubProjectId() != null) {
				if (rhs.getRequiredSubProjectId() != null) {
					cmp = getRequiredSubProjectId().compareTo( rhs.getRequiredSubProjectId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSubProjectId() != null) {
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
		else if( obj instanceof IIntNetPubMajorVersion rhs ) {
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
			if (getRequiredSubProjectId() != null) {
				if (rhs.getRequiredSubProjectId() != null) {
					cmp = getRequiredSubProjectId().compareTo( rhs.getRequiredSubProjectId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSubProjectId() != null) {
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
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubMajorVersionHPKey rhs ) {
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
		else if( obj instanceof IIntNetPubMajorVersionH rhs ) {
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
			if (getRequiredSubProjectId() != null) {
				if (rhs.getRequiredSubProjectId() != null) {
					cmp = getRequiredSubProjectId().compareTo( rhs.getRequiredSubProjectId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSubProjectId() != null) {
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
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubMajorVersionByTenantIdxKey rhs ) {
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
		else if( obj instanceof IIntNetPubMajorVersionBySubProjectIdxKey rhs ) {
			if (getRequiredSubProjectId() != null) {
				if (rhs.getRequiredSubProjectId() != null) {
					cmp = getRequiredSubProjectId().compareTo( rhs.getRequiredSubProjectId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSubProjectId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetPubMajorVersionByNameIdxKey rhs ) {
			if (getRequiredSubProjectId() != null) {
				if (rhs.getRequiredSubProjectId() != null) {
					cmp = getRequiredSubProjectId().compareTo( rhs.getRequiredSubProjectId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSubProjectId() != null) {
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
	public void set( IIntNetPubMajorVersion src ) {
		setJustPubMajorVersion( src );
	}

	@Override
	public void setMajorVersion( IIntNetPubMajorVersion src ) {
		setJustPubRequiredId(src.getRequiredId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubCreatedByUserId( src.getCreatedByUserId() );
		setJustPubCreatedAt( src.getCreatedAt() );
		setJustPubUpdatedByUserId( src.getUpdatedByUserId() );
		setJustPubUpdatedAt( src.getUpdatedAt() );
		setJustPubRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setJustPubRequiredContainerParentSPrj(src.getRequiredContainerParentSPrj());
		setJustPubRequiredTenantId(src.getRequiredTenantId());
		setJustPubRequiredSubProjectId(src.getRequiredSubProjectId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalDescription(src.getOptionalDescription());
	}

	@Override
	public void set( IIntNetPubMajorVersionH src ) {
		setJustPubMajorVersion( src );
	}

	@Override
	public void setMajorVersion( IIntNetPubMajorVersionH src ) {
		setJustPubRequiredId(src.getRequiredId());
		setJustPubRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setJustPubRequiredContainerParentSPrj(src.getRequiredContainerParentSPrj());
		setJustPubRequiredTenantId(src.getRequiredTenantId());
		setJustPubRequiredSubProjectId(src.getRequiredSubProjectId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalDescription(src.getOptionalDescription());
	}

	@Override
	public void set( IIntNetPubMajorVersion src ) {
		setJustPubMajorVersion( src );
	}

	@Override
	public void setMajorVersion( IIntNetPubMajorVersion src ) {
		setJustPubRequiredId(src.getRequiredId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubCreatedByUserId( src.getCreatedByUserId() );
		setJustPubCreatedAt( src.getCreatedAt() );
		setJustPubUpdatedByUserId( src.getUpdatedByUserId() );
		setJustPubUpdatedAt( src.getUpdatedAt() );
		setJustPubRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setJustPubRequiredContainerParentSPrj(src.getRequiredContainerParentSPrj());
		setJustPubRequiredTenantId(src.getRequiredTenantId());
		setJustPubRequiredSubProjectId(src.getRequiredSubProjectId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalDescription(src.getOptionalDescription());
	}

	@Override
	public void set( IIntNetPubMajorVersionH src ) {
		setJustPubMajorVersion( src );
	}

	@Override
	public void setMajorVersion( IIntNetPubMajorVersionH src ) {
		setJustPubRequiredId(src.getRequiredId());
		setJustPubRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setJustPubRequiredContainerParentSPrj(src.getRequiredContainerParentSPrj());
		setJustPubRequiredTenantId(src.getRequiredTenantId());
		setJustPubRequiredSubProjectId(src.getRequiredSubProjectId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalDescription(src.getOptionalDescription());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + getRequiredId().toString() + "\"" + "\"" + getRequiredTenantId().toString() + "\"" + "\"" + getRequiredSubProjectId().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"" + ( ( getOptionalDescription() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDescription() ) + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<IntNetPubBuffMajorVersion" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
