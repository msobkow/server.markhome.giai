// Description: Java 25 implementation of a SecSysRoleEnables buffer

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

public class SecureBuffSecSysRoleEnables
	implements ISecureSecSysRoleEnables, Comparable<Object>, Serializable
{
	protected ISecureSecSysRoleEnablesPKey pkey = new SecureBuffSecSysRoleEnablesPKey();
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();

	public BusModelBuffSecSysRoleEnables() {
		pkey = new SecureBuffSecSysRoleEnablesPKey();
	}

	@Override
	public ISecureSecSysRoleEnablesPKey getPKey() {
		return(pkey);
	}

	@Override
	public void setPKey(ISecureSecSysRoleEnablesPKey pkey ) {
		if (pkey == null) {
			throw new CFNullArgumentException(getClass(), "setPKey", 1, "pkey");
		}
		else {
			this.pkey = pkey;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredSecSysRoleId() {
		return(getPKey().getRequiredSecSysRoleId());
	}

	public void setRequiredSecSysRoleId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecSysRoleId",
				1,
				"value" );
		}
		getPKey().setRequiredSecSysRoleId(value);
	}

	@Override
	public String getRequiredEnableName() {
		return(getPKey().getRequiredEnableName());
	}

	public void setRequiredEnableName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredEnableName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredEnableName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		getPKey().setRequiredEnableName(value);
	}

	@Override
	public ISecureSecSysRole getRequiredContainerSysRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysRoleTable targetTable = targetBackingSecure.getTableSecSysRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure().getTableSecSysRole()");
		}
		ISecureSecSysRole targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysRoleId());
		return(targetRec);
	}

	@Override
	public ISecureSecSysRole getRequiredContainerSysRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysRoleTable targetTable = targetBackingSecure.getTableSecSysRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure().getTableSecSysRole()");
		}
		ISecureSecSysRole targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysRoleId());
		return(targetRec);
	}

	@Override
	public ISecureSecSysRole getRequiredContainerSysRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysRoleTable targetTable = targetBackingSecure.getTableSecSysRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSysRole", 0, "ISecureSchema.getBackingSecure().getTableSecSysRole()");
		}
		ISecurePubSecSysRole targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysRoleId());
		return(targetRec);
	}

	@Override
	public void setRequiredContainerSysRole(ISecureSecSysRole argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSysRole", 1, "argObj");
		}
		else {
			setRequiredSecSysRoleId(argObj.getRequiredSecSysRoleId());
		}
	}

	@Override
	public void setRequiredContainerSysRole(ISecureProtSecSysRole argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSysRole", 1, "argObj");
		}
		else {
			setRequiredSecSysRoleId(argObj.getRequiredSecSysRoleId());
		}
	}

	@Override
	public void setRequiredContainerSysRole(ISecurePubSecSysRole argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSysRole", 1, "argObj");
		}
		else {
			setRequiredSecSysRoleId(argObj.getRequiredSecSysRoleId());
		}
	}

	@Override
	public ISecureSecSysGrp getRequiredParentEnableGroup() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentEnableGroup", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentEnableGroup", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureSecSysGrp targetRec = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredEnableName());
		return(targetRec);
	}

	@Override
	public ISecureSecSysGrp getRequiredParentEnableGroup() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentEnableGroup", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentEnableGroup", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecureSecSysGrp targetRec = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredEnableName());
		return(targetRec);
	}

	@Override
	public ISecureSecSysGrp getRequiredParentEnableGroup() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentEnableGroup", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpTable targetTable = targetBackingSecure.getTableSecSysGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredParentEnableGroup", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrp()");
		}
		ISecurePubSecSysGrp targetRec = targetTable.readDerivedByUNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredEnableName());
		return(targetRec);
	}

	@Override
	public void setRequiredParentEnableGroup(ISecureSecSysGrp argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentEnableGroup", 1, "argObj");
		}
		else {
			setRequiredEnableName(argObj.getRequiredName());
		}
	}

	@Override
	public void setRequiredParentEnableGroup(ISecureProtSecSysGrp argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentEnableGroup", 1, "argObj");
		}
		else {
			setRequiredEnableName(argObj.getRequiredName());
		}
	}

	@Override
	public void setRequiredParentEnableGroup(ISecurePubSecSysGrp argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentEnableGroup", 1, "argObj");
		}
		else {
			setRequiredEnableName(argObj.getRequiredName());
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
		return( ISecureSecSysRoleEnables.CLASS_CODE );
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureSecSysRoleEnables rhs ) {
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
		else if( obj instanceof ISecureSecSysRoleEnablesH rhs ) {
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
		else if( obj instanceof ISecureSecSysRoleEnablesHPKey ) {
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
		else if( obj instanceof ISecureSecSysRoleEnablesBySysRoleIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecSysRoleEnablesByNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecSysRoleEnables rhs ) {
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
		else if( obj instanceof ISecureProtSecSysRoleEnablesH rhs ) {
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
		else if( obj instanceof ISecureProtSecSysRoleEnablesHPKey rhs ) {
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
		else if( obj instanceof ISecureSecSysRoleEnablesBySysRoleIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecSysRoleEnablesByNameIdxKey rhs ) {
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
		int hashCode = 0;
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
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecureSecSysRoleEnables rhs ) {
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
		else if( obj instanceof ISecureSecSysRoleEnablesHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
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
		else if( obj instanceof ISecureSecSysRoleEnablesH rhs ) {
			cmp = 0;
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
		else if( obj instanceof ISecureSecSysRoleEnablesBySysRoleIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureSecSysRoleEnablesByNameIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtSecSysRoleEnables rhs ) {
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
		else if( obj instanceof ISecureProtSecSysRoleEnablesHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
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
		else if( obj instanceof ISecureProtSecSysRoleEnablesH rhs ) {
			cmp = 0;
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
		else if( obj instanceof ISecureProtSecSysRoleEnablesBySysRoleIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtSecSysRoleEnablesByNameIdxKey rhs ) {
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
		setRequiredContainerSysRole(src.getRequiredContainerSysRole());
		setRequiredParentEnableGroup(src.getRequiredParentEnableGroup());
		setRequiredSecSysRoleId(src.getRequiredSecSysRoleId());
		setRequiredEnableName(src.getRequiredEnableName());
	}

	@Override
	public void set( ISecureProtSecSysRoleEnables src ) {
		setSecSysRoleEnables( src );
	}

	@Override
	public void setSecSysRoleEnables( ISecureProtSecSysRoleEnables src ) {
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
	public void set( ISecureProtSecSysRoleEnablesH src ) {
		setSecSysRoleEnables( src );
	}

	@Override
	public void setSecSysRoleEnables( ISecureProtSecSysRoleEnablesH src ) {
		setRequiredContainerSysRole(src.getRequiredContainerSysRole());
		setRequiredParentEnableGroup(src.getRequiredParentEnableGroup());
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
		String ret = "<SecureBuffSecSysRoleEnables" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
