// Description: Java 25 implementation of a SecSysGrp buffer

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

public class SecureBuffSecSysGrp
	implements ISecureSecSysGrp, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredSecSysGrpId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected String requiredName;
	protected ISecurePubSchema.SecLevelEnum requiredSecLevel;

	public BusModelBuffSecSysGrp() {
		requiredSecSysGrpId = CFDbKeyHash256.fromHex( ISecurePubSecSysGrp.SECSYSGRPID_INIT_VALUE.toString() );
		requiredName = ISecurePubSecSysGrp.NAME_INIT_VALUE;
		requiredSecLevel = ISecurePubSecSysGrp.SECLEVEL_INIT_VALUE;
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return (requiredSecSysGrpId);
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredSecSysGrpId) {
		if(requiredSecSysGrpId != null) {
			this.requiredSecSysGrpId = requiredSecSysGrpId;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredSecSysGrpId() {
		return(requiredSecSysGrpId);
	}

	public void setRequiredSecSysGrpId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecSysGrpId",
				1,
				"value" );
		}
		requiredSecSysGrpId = value;
	}

	@Override
	public List<ISecureSecSysGrpInc> getOptionalComponentsIncByGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsIncByGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpIncTable targetTable = targetBackingSecure.getTableSecSysGrpInc();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsIncByGrp", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrpInc()");
		}
		ISecureSecSysGrpInc[] targetArr = targetTable.readDerivedBySysGrpIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysGrpId());
		if( targetArr != null ) {
			List<ISecureSecSysGrpInc> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecSysGrpInc> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecSysGrpInc> getOptionalComponentsIncByGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsIncByGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpIncTable targetTable = targetBackingSecure.getTableSecSysGrpInc();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsIncByGrp", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrpInc()");
		}
		ISecureSecSysGrpInc[] targetArr = targetTable.readDerivedBySysGrpIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysGrpId());
		if( targetArr != null ) {
			List<ISecureSecSysGrpInc> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecSysGrpInc> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecSysGrpMemb> getOptionalChildrenMembByGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpMembTable targetTable = targetBackingSecure.getTableSecSysGrpMemb();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrpMemb()");
		}
		ISecureSecSysGrpMemb[] targetArr = targetTable.readDerivedBySysGrpIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysGrpId());
		if( targetArr != null ) {
			List<ISecureSecSysGrpMemb> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecSysGrpMemb> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecSysGrpMemb> getOptionalChildrenMembByGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpMembTable targetTable = targetBackingSecure.getTableSecSysGrpMemb();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenMembByGrp", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrpMemb()");
		}
		ISecureSecSysGrpMemb[] targetArr = targetTable.readDerivedBySysGrpIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysGrpId());
		if( targetArr != null ) {
			List<ISecureSecSysGrpMemb> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecSysGrpMemb> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public ISecureSecSysRole getOptionalComponentsImplSysRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplSysRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysRoleTable targetTable = targetBackingSecure.getTableSecSysRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplSysRole", 0, "ISecureSchema.getBackingSecure().getTableSecSysRole()");
		}
		ISecureSecSysRole targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysGrpId());
		return(targetRec);
	}

	@Override
	public ISecureSecSysRole getOptionalComponentsImplSysRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplSysRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysRoleTable targetTable = targetBackingSecure.getTableSecSysRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplSysRole", 0, "ISecureSchema.getBackingSecure().getTableSecSysRole()");
		}
		ISecureSecSysRole targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysGrpId());
		return(targetRec);
	}

	@Override
	public ISecureSecSysRole getOptionalComponentsImplSysRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplSysRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysRoleTable targetTable = targetBackingSecure.getTableSecSysRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplSysRole", 0, "ISecureSchema.getBackingSecure().getTableSecSysRole()");
		}
		ISecurePubSecSysRole targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSecSysGrpId());
		return(targetRec);
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
		return( ISecureSecSysGrp.CLASS_CODE );
	}

	@Override
	public List<ISecureSecClusGrp> getOptionalComponentsImplClusGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplClusGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecClusGrpTable targetTable = targetBackingSecure.getTableSecClusGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplClusGrp", 0, "ISecureSchema.getBackingSecure().getTableSecClusGrp()");
		}
		ISecureSecClusGrp[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		if( targetArr != null ) {
			List<ISecureSecClusGrp> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecClusGrp> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecClusGrp> getOptionalComponentsImplClusGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplClusGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecClusGrpTable targetTable = targetBackingSecure.getTableSecClusGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplClusGrp", 0, "ISecureSchema.getBackingSecure().getTableSecClusGrp()");
		}
		ISecureSecClusGrp[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		if( targetArr != null ) {
			List<ISecureSecClusGrp> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecClusGrp> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecTentGrp> getOptionalComponentsImplTentGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplTentGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecTentGrpTable targetTable = targetBackingSecure.getTableSecTentGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplTentGrp", 0, "ISecureSchema.getBackingSecure().getTableSecTentGrp()");
		}
		ISecureSecTentGrp[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
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
	public List<ISecureSecTentGrp> getOptionalComponentsImplTentGrp() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplTentGrp", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecTentGrpTable targetTable = targetBackingSecure.getTableSecTentGrp();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplTentGrp", 0, "ISecureSchema.getBackingSecure().getTableSecTentGrp()");
		}
		ISecureSecTentGrp[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
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
	public List<ISecureSecClusRole> getOptionalComponentsImplClusRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplClusRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecClusRoleTable targetTable = targetBackingSecure.getTableSecClusRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplClusRole", 0, "ISecureSchema.getBackingSecure().getTableSecClusRole()");
		}
		ISecureSecClusRole[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		if( targetArr != null ) {
			List<ISecureSecClusRole> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecClusRole> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecClusRole> getOptionalComponentsImplClusRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplClusRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecClusRoleTable targetTable = targetBackingSecure.getTableSecClusRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplClusRole", 0, "ISecureSchema.getBackingSecure().getTableSecClusRole()");
		}
		ISecureSecClusRole[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		if( targetArr != null ) {
			List<ISecureSecClusRole> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecClusRole> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecTentRole> getOptionalComponentsImplTentRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplTentRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecTentRoleTable targetTable = targetBackingSecure.getTableSecTentRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplTentRole", 0, "ISecureSchema.getBackingSecure().getTableSecTentRole()");
		}
		ISecureSecTentRole[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
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
	public List<ISecureSecTentRole> getOptionalComponentsImplTentRole() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplTentRole", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecTentRoleTable targetTable = targetBackingSecure.getTableSecTentRole();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsImplTentRole", 0, "ISecureSchema.getBackingSecure().getTableSecTentRole()");
		}
		ISecureSecTentRole[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
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
	public List<ISecureSecSysGrpInc> getOptionalChildrenSysGrpByName() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenSysGrpByName", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpIncTable targetTable = targetBackingSecure.getTableSecSysGrpInc();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenSysGrpByName", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrpInc()");
		}
		ISecureSecSysGrpInc[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		if( targetArr != null ) {
			List<ISecureSecSysGrpInc> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecSysGrpInc> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecSysGrpInc> getOptionalChildrenSysGrpByName() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenSysGrpByName", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysGrpIncTable targetTable = targetBackingSecure.getTableSecSysGrpInc();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenSysGrpByName", 0, "ISecureSchema.getBackingSecure().getTableSecSysGrpInc()");
		}
		ISecureSecSysGrpInc[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		if( targetArr != null ) {
			List<ISecureSecSysGrpInc> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecSysGrpInc> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecSysRoleEnables> getOptionalChildrenRoleByEnableName() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenRoleByEnableName", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysRoleEnablesTable targetTable = targetBackingSecure.getTableSecSysRoleEnables();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenRoleByEnableName", 0, "ISecureSchema.getBackingSecure().getTableSecSysRoleEnables()");
		}
		ISecureSecSysRoleEnables[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		if( targetArr != null ) {
			List<ISecureSecSysRoleEnables> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecSysRoleEnables> results = new ArrayList<>();
			return( results );
		}
	}

	@Override
	public List<ISecureSecSysRoleEnables> getOptionalChildrenRoleByEnableName() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenRoleByEnableName", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureSecSysRoleEnablesTable targetTable = targetBackingSecure.getTableSecSysRoleEnables();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenRoleByEnableName", 0, "ISecureSchema.getBackingSecure().getTableSecSysRoleEnables()");
		}
		ISecureSecSysRoleEnables[] targetArr = targetTable.readDerivedByNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredName());
		if( targetArr != null ) {
			List<ISecureSecSysRoleEnables> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ISecureSecSysRoleEnables> results = new ArrayList<>();
			return( results );
		}
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
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureSecSysGrp rhs ) {
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
		else if( obj instanceof ISecureSecSysGrpH rhs ) {
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
		else if( obj instanceof ISecureSecSysGrpHPKey ) {
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
		else if( obj instanceof ISecureSecSysGrpByUNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecSysGrpBySecLevelIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecSysGrp rhs ) {
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
		else if( obj instanceof ISecureProtSecSysGrpH rhs ) {
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
		else if( obj instanceof ISecureProtSecSysGrpHPKey rhs ) {
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
		else if( obj instanceof ISecureSecSysGrpByUNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecSysGrpBySecLevelIdxKey rhs ) {
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
		else if( obj instanceof ISecurePubSecSysGrp rhs ) {
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
		else if( obj instanceof ISecurePubSecSysGrpH rhs ) {
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
		else if( obj instanceof ISecurePubSecSysGrpHPKey rhs ) {
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
		else if( obj instanceof ISecureSecSysGrpByUNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecSysGrpBySecLevelIdxKey rhs ) {
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
		int hashCode = 0;
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
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecureSecSysGrp rhs ) {
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
		else if( obj instanceof ISecureSecSysGrpHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
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
		else if( obj instanceof ISecureSecSysGrpH rhs ) {
			cmp = 0;
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
		else if( obj instanceof ISecureSecSysGrpByUNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureSecSysGrpBySecLevelIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtSecSysGrp rhs ) {
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
		else if( obj instanceof ISecureProtSecSysGrpHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
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
		else if( obj instanceof ISecureProtSecSysGrpH rhs ) {
			cmp = 0;
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
		else if( obj instanceof ISecureProtSecSysGrpByUNameIdxKey rhs ) {
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
		else if( obj instanceof ISecureProtSecSysGrpBySecLevelIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubSecSysGrp rhs ) {
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
		else if( obj instanceof ISecurePubSecSysGrpHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
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
		else if( obj instanceof ISecurePubSecSysGrpH rhs ) {
			cmp = 0;
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
		else if( obj instanceof ISecurePubSecSysGrpByUNameIdxKey rhs ) {
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
		else if( obj instanceof ISecurePubSecSysGrpBySecLevelIdxKey rhs ) {
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
	public void set( ISecureProtSecSysGrp src ) {
		setSecSysGrp( src );
	}

	@Override
	public void setSecSysGrp( ISecureProtSecSysGrp src ) {
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
	public void set( ISecureProtSecSysGrpH src ) {
		setSecSysGrp( src );
	}

	@Override
	public void setSecSysGrp( ISecureProtSecSysGrpH src ) {
		setRequiredSecSysGrpId(src.getRequiredSecSysGrpId());
		setRequiredName(src.getRequiredName());
		setRequiredSecLevel(src.getRequiredSecLevel());
	}

	@Override
	public void set( ISecurePubSecSysGrp src ) {
		setSecSysGrp( src );
	}

	@Override
	public void setSecSysGrp( ISecurePubSecSysGrp src ) {
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
	public void set( ISecurePubSecSysGrpH src ) {
		setSecSysGrp( src );
	}

	@Override
	public void setSecSysGrp( ISecurePubSecSysGrpH src ) {
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
		String ret = "<SecureBuffSecSysGrp" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
