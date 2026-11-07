
// Description: Java 25 DbIO implementation for RoleDef.

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

package server.markhome.ycf.v3_1.intnet.intnet.jpa;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.BusModelJpaHooksSchema;

/*
 *	BusModelJpaRoleDefTable database implementation for RoleDef
 */
public class BusModelJpaRoleDefTable implements IBusModelRoleDefTable
{
	protected BusModelJpaSchema schema;


	public BusModelJpaRoleDefTable(IBusModelSchema schema) {
		if( schema == null ) {
			throw new CFNullArgumentException(getClass(), "constructor", 1, "schema" );
		}
		if (schema instanceof BusModelJpaSchema) {
			this.schema = (BusModelJpaSchema)schema;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "constructor", "schema", schema, "BusModelJpaSchema");
		}
	}

	protected boolean canCreateRoleDef(String S_ProcName, ISecureAuthorization Authorization) {
		if (Authorization == null) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "Authorization");
		}
		boolean permissionGranted = false;
		CFDbKeyHash256 authUserId = Authorization.getSecUserId();
		if ((!permissionGranted) && (authUserId == null || authUserId.isNull())) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "Authorization.getSecUserId()");
		}
		// Check for "system" user
		CFDbKeyHash256 systemId = ISecureSchema.getSystemId();
		if ((!permissionGranted) && (systemId != null && !systemId.isNull() && systemId.equals(authUserId))) {
			permissionGranted = true;
		}
		else if ((!permissionGranted) && (systemId == null || systemId.isNull())) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "ISecureSchema.getSystemId()");
		}
		if(!permissionGranted) {
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "createroledef");
		}
		return( permissionGranted );
	}

	protected boolean canReadRoleDef(String S_ProcName, ISecureAuthorization Authorization) {
		if (Authorization == null) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "Authorization");
		}
		boolean permissionGranted = false;
		CFDbKeyHash256 authUserId = Authorization.getSecUserId();
		if ((!permissionGranted) && (authUserId == null || authUserId.isNull())) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "Authorization.getSecUserId()");
		}
		// Check for "system" user
		CFDbKeyHash256 systemId = ISecureSchema.getSystemId();
		if ((!permissionGranted) && (systemId != null && !systemId.isNull() && systemId.equals(authUserId))) {
			permissionGranted = true;
		}
		else if ((!permissionGranted) && (systemId == null || systemId.isNull())) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "ISecureSchema.getSystemId()");
		}
		if(!permissionGranted) {
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "readroledef");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateRoleDef(String S_ProcName, ISecureAuthorization Authorization) {
		if (Authorization == null) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "Authorization");
		}
		boolean permissionGranted = false;
		CFDbKeyHash256 authUserId = Authorization.getSecUserId();
		if ((!permissionGranted) && (authUserId == null || authUserId.isNull())) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "Authorization.getSecUserId()");
		}
		// Check for "system" user
		CFDbKeyHash256 systemId = ISecureSchema.getSystemId();
		if ((!permissionGranted) && (systemId != null && !systemId.isNull() && systemId.equals(authUserId))) {
			permissionGranted = true;
		}
		else if ((!permissionGranted) && (systemId == null || systemId.isNull())) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "ISecureSchema.getSystemId()");
		}
		if(!permissionGranted) {
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "updateroledef");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteRoleDef(String S_ProcName, ISecureAuthorization Authorization) {
		if (Authorization == null) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "Authorization");
		}
		boolean permissionGranted = false;
		CFDbKeyHash256 authUserId = Authorization.getSecUserId();
		if ((!permissionGranted) && (authUserId == null || authUserId.isNull())) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "Authorization.getSecUserId()");
		}
		// Check for "system" user
		CFDbKeyHash256 systemId = ISecureSchema.getSystemId();
		if ((!permissionGranted) && (systemId != null && !systemId.isNull() && systemId.equals(authUserId))) {
			permissionGranted = true;
		}
		else if ((!permissionGranted) && (systemId == null || systemId.isNull())) {
			throw new CFNullArgumentException(getClass(), S_ProcName, 0, "ISecureSchema.getSystemId()");
		}
		if(!permissionGranted) {
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "deleteroledef");
		}
		return( permissionGranted );
	}

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	@Override
	public IBusModelRoleDef createRoleDef( ISecureAuthorization Authorization,
		IBusModelRoleDef rec )
	{
		final String S_ProcName = "createRoleDef";
		boolean permissionGranted = canCreateRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createRoleDef", 1, "rec");
		}
		else if (rec instanceof BusModelJpaRoleDef) {
			BusModelJpaRoleDef jparec = (BusModelJpaRoleDef)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaRoleDef retval = schema.getJpaHooksSchema().getRoleDefService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createRoleDef", "rec", rec, "BusModelJpaRoleDef");
		}
	}

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	@Override
	public IBusModelRoleDef updateRoleDef( ISecureAuthorization Authorization,
		IBusModelRoleDef rec )
	{
		final String S_ProcName = "updateRoleDef";
		boolean permissionGranted = canUpdateRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateRoleDef", 1, "rec");
		}
		else if (rec instanceof BusModelJpaRoleDef) {
			BusModelJpaRoleDef jparec = (BusModelJpaRoleDef)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaRoleDef retval = schema.getJpaHooksSchema().getRoleDefService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateRoleDef", "rec", rec, "BusModelJpaRoleDef");
		}
	}

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	@Override
	public void deleteRoleDef( ISecureAuthorization Authorization,
		IBusModelRoleDef rec )
	{
		final String S_ProcName = "deleteRoleDef";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof BusModelJpaRoleDef) {
			BusModelJpaRoleDef jparec = (BusModelJpaRoleDef)rec;
			schema.getJpaHooksSchema().getRoleDefService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteRoleDef", "rec", rec, "BusModelJpaRoleDef");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteRoleDef");
	}

	/**
	 *	Delete the RoleDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteRoleDefByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteRoleDefByIdIdx";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getRoleDefService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the RoleDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 */
	@Override
	public void deleteRoleDefByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName )
	{
		final String S_ProcName = "deleteRoleDefByUNameIdx";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getRoleDefService().deleteByUNameIdx(argScopeId,
		argName);
	}


	/**
	 *	Delete the RoleDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteRoleDefByUNameIdx( ISecureAuthorization Authorization,
		IBusModelRoleDefByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByUNameIdx";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getRoleDefService().deleteByUNameIdx(argKey.getRequiredScopeId(),
			argKey.getRequiredName());
	}

	/**
	 *	Delete the RoleDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 */
	@Override
	public void deleteRoleDefByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId )
	{
		final String S_ProcName = "deleteRoleDefByScopeIdx";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getRoleDefService().deleteByScopeIdx(argScopeId);
	}


	/**
	 *	Delete the RoleDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteRoleDefByScopeIdx( ISecureAuthorization Authorization,
		IBusModelRoleDefByScopeIdxKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByScopeIdx";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getRoleDefService().deleteByScopeIdx(argKey.getRequiredScopeId());
	}

	/**
	 *	Delete the RoleDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 */
	@Override
	public void deleteRoleDefByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "deleteRoleDefByDefSchemaIdx";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getRoleDefService().deleteByDefSchemaIdx(argDefSchemaId);
	}


	/**
	 *	Delete the RoleDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteRoleDefByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelRoleDefByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByDefSchemaIdx";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getRoleDefService().deleteByDefSchemaIdx(argKey.getOptionalDefSchemaId());
	}

	/**
	 *	Delete the RoleDef instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 */
	@Override
	public void deleteRoleDefByUDefIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argDefSchemaId,
		String argName )
	{
		final String S_ProcName = "deleteRoleDefByUDefIdx";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getRoleDefService().deleteByUDefIdx(argScopeId,
		argDefSchemaId,
		argName);
	}


	/**
	 *	Delete the RoleDef instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteRoleDefByUDefIdx( ISecureAuthorization Authorization,
		IBusModelRoleDefByUDefIdxKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByUDefIdx";
		boolean permissionGranted = canDeleteRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getRoleDefService().deleteByUDefIdx(argKey.getRequiredScopeId(),
			argKey.getOptionalDefSchemaId(),
			argKey.getRequiredName());
	}


	/**
	 *	Read the derived RoleDef record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RoleDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelRoleDef readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelRoleDef retval = schema.getJpaHooksSchema().getRoleDefService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived RoleDef record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RoleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelRoleDef lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelRoleDef retval = schema.getJpaHooksSchema().getRoleDefService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all RoleDef instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelRoleDef[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<BusModelJpaRoleDef> retlist = schema.getJpaHooksSchema().getRoleDefService().findAll();
		IBusModelRoleDef[] retset = new IBusModelRoleDef[retlist.size()];
		int idx = 0;
		for (BusModelJpaRoleDef cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived RoleDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelRoleDef readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelRoleDef retval = schema.getJpaHooksSchema().getRoleDefService().find(argId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredContainerScopeDef().getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readroledef")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the derived RoleDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelRoleDef readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelRoleDef retval = schema.getJpaHooksSchema().getRoleDefService().findByUNameIdx(argScopeId,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredContainerScopeDef().getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readroledef")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived RoleDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelRoleDef[] readDerivedByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId )
	{
		final String S_ProcName = "readDerivedByScopeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaRoleDef> retlist = schema.getJpaHooksSchema().getRoleDefService().findByScopeIdx(argScopeId);
		IBusModelRoleDef[] retset = new IBusModelRoleDef[retlist.size()];
		int idx = 0;
		for (BusModelJpaRoleDef cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived RoleDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelRoleDef[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readDerivedByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaRoleDef> retlist = schema.getJpaHooksSchema().getRoleDefService().findByDefSchemaIdx(argDefSchemaId);
		IBusModelRoleDef[] retset = new IBusModelRoleDef[retlist.size()];
		int idx = 0;
		for (BusModelJpaRoleDef cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived RoleDef record instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelRoleDef readDerivedByUDefIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argDefSchemaId,
		String argName )
	{
		final String S_ProcName = "readDerivedByUDefIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelRoleDef retval = schema.getJpaHooksSchema().getRoleDefService().findByUDefIdx(argScopeId,
		argDefSchemaId,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredContainerScopeDef().getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readroledef")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the specific RoleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RoleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelRoleDef readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific RoleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RoleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelRoleDef lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific RoleDef record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific RoleDef instances in the database accessible for the Authorization.
	 */
	@Override
	public IBusModelRoleDef[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific RoleDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelRoleDef readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific RoleDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelRoleDef readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}

	/**
	 *	Read an array of the specific RoleDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelRoleDef[] readRecByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId )
	{
		final String S_ProcName = "readRecByScopeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByScopeIdx");
	}

	/**
	 *	Read an array of the specific RoleDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelRoleDef[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readRecByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDefSchemaIdx");
	}

	/**
	 *	Read the specific RoleDef record instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelRoleDef readRecByUDefIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argDefSchemaId,
		String argName )
	{
		final String S_ProcName = "readRecByUDefIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadRoleDef(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readroledef", IBusModelSchema.SCHEMA_NAME, IBusModelRoleDefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUDefIdx");
	}
}
