
// Description: Java 25 DbIO implementation for SecTentRoleMemb.

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
import server.markhome.ycf.v3_1.secure.secure.jpa.SecureJpaHooksSchema;

/*
 *	SecureJpaSecTentRoleMembTable database implementation for SecTentRoleMemb
 */
public class SecureJpaSecTentRoleMembTable implements ISecureSecTentRoleMembTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecTentRoleMembTable(ISecureSchema schema) {
		if( schema == null ) {
			throw new CFNullArgumentException(getClass(), "constructor", 1, "schema" );
		}
		if (schema instanceof SecureJpaSchema) {
			this.schema = (SecureJpaSchema)schema;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "constructor", "schema", schema, "SecureJpaSchema");
		}
	}

	protected boolean canCreateSecTentRoleMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "createsectentrolememb");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecTentRoleMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "readsectentrolememb");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecTentRoleMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "updatesectentrolememb");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecTentRoleMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "deletesectentrolememb");
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
	public ISecureSecTentRoleMemb createSecTentRoleMemb( ISecureAuthorization Authorization,
		ISecureSecTentRoleMemb rec )
	{
		final String S_ProcName = "createSecTentRoleMemb";
		boolean permissionGranted = canCreateSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecTentRoleMemb", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecTentRoleMemb) {
			SecureJpaSecTentRoleMemb jparec = (SecureJpaSecTentRoleMemb)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecTentRoleMemb retval = schema.getJpaHooksSchema().getSecTentRoleMembService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecTentRoleMemb", "rec", rec, "SecureJpaSecTentRoleMemb");
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
	public ISecureSecTentRoleMemb updateSecTentRoleMemb( ISecureAuthorization Authorization,
		ISecureSecTentRoleMemb rec )
	{
		final String S_ProcName = "updateSecTentRoleMemb";
		boolean permissionGranted = canUpdateSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecTentRoleMemb", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecTentRoleMemb) {
			SecureJpaSecTentRoleMemb jparec = (SecureJpaSecTentRoleMemb)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecTentRoleMemb retval = schema.getJpaHooksSchema().getSecTentRoleMembService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecTentRoleMemb", "rec", rec, "SecureJpaSecTentRoleMemb");
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
	public void deleteSecTentRoleMemb( ISecureAuthorization Authorization,
		ISecureSecTentRoleMemb rec )
	{
		final String S_ProcName = "deleteSecTentRoleMemb";
		boolean permissionGranted = canDeleteSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecTentRoleMemb) {
			SecureJpaSecTentRoleMemb jparec = (SecureJpaSecTentRoleMemb)rec;
			schema.getJpaHooksSchema().getSecTentRoleMembService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecTentRoleMemb", "rec", rec, "SecureJpaSecTentRoleMemb");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecTentRoleMemb");
	}

	/**
	 *	Delete the SecTentRoleMemb instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecTentRoleMembByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId,
		String argLoginId )
	{
		final String S_ProcName = "deleteSecTentRoleMembByIdIdx";
		boolean permissionGranted = canDeleteSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecTentRoleMembService().deleteByIdIdx(argSecTentRoleId,
		argLoginId);
	}

	/**
	 *	Delete the SecTentRoleMemb instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecTentRoleMembByIdIdx( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey argKey )
	{
		final String S_ProcName = "deleteSecTentRoleMembByIdIdx";
		boolean permissionGranted = canDeleteSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecTentRoleMembService().deleteByIdIdx(argKey.getRequiredSecTentRoleId(),
			argKey.getRequiredLoginId());
	}

	/**
	 *	Delete the SecTentRoleMemb instances identified by the key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecTentRoleMembByTentRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId )
	{
		final String S_ProcName = "deleteSecTentRoleMembByTentRoleIdx";
		boolean permissionGranted = canDeleteSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecTentRoleMembService().deleteByTentRoleIdx(argSecTentRoleId);
	}


	/**
	 *	Delete the SecTentRoleMemb instances identified by the key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecTentRoleMembByTentRoleIdx( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembByTentRoleIdxKey argKey )
	{
		final String S_ProcName = "deleteSecTentRoleMembByTentRoleIdx";
		boolean permissionGranted = canDeleteSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecTentRoleMembService().deleteByTentRoleIdx(argKey.getRequiredSecTentRoleId());
	}

	/**
	 *	Delete the SecTentRoleMemb instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecTentRoleMembByUserIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "deleteSecTentRoleMembByUserIdx";
		boolean permissionGranted = canDeleteSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecTentRoleMembService().deleteByUserIdx(argLoginId);
	}


	/**
	 *	Delete the SecTentRoleMemb instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecTentRoleMembByUserIdx( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembByUserIdxKey argKey )
	{
		final String S_ProcName = "deleteSecTentRoleMembByUserIdx";
		boolean permissionGranted = canDeleteSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecTentRoleMembService().deleteByUserIdx(argKey.getRequiredLoginId());
	}


	/**
	 *	Read the derived SecTentRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecTentRoleMemb readDerived( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecTentRoleMemb retval = schema.getJpaHooksSchema().getSecTentRoleMembService().find(PKey);
		return(retval);
	}

	/**
	 *	Read the derived SecTentRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecTentRoleMemb readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId,
		String argLoginId )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecTentRoleMemb retval = schema.getJpaHooksSchema().getSecTentRoleMembService().find(argSecTentRoleId,
		argLoginId);
		return(retval);
	}

	/**
	 *	Lock the derived SecTentRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecTentRoleMemb lockDerived( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecTentRoleMemb retval = schema.getJpaHooksSchema().getSecTentRoleMembService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecTentRoleMemb instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecTentRoleMemb[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecTentRoleMemb> retlist = schema.getJpaHooksSchema().getSecTentRoleMembService().findAll();
		ISecureSecTentRoleMemb[] retset = new ISecureSecTentRoleMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecTentRoleMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecTentRoleMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecTentRoleMemb readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId,
		String argLoginId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecTentRoleMemb retval = schema.getJpaHooksSchema().getSecTentRoleMembService().find(argSecTentRoleId,
		argLoginId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredContainerRole().getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readsectentrolememb")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived SecTentRoleMemb record instances identified by the duplicate key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecTentRoleMemb[] readDerivedByTentRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId )
	{
		final String S_ProcName = "readDerivedByTentRoleIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecTentRoleMemb> retlist = schema.getJpaHooksSchema().getSecTentRoleMembService().findByTentRoleIdx(argSecTentRoleId);
		ISecureSecTentRoleMemb[] retset = new ISecureSecTentRoleMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecTentRoleMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecTentRoleMemb record instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecTentRoleMemb[] readDerivedByUserIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "readDerivedByUserIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecTentRoleMemb> retlist = schema.getJpaHooksSchema().getSecTentRoleMembService().findByUserIdx(argLoginId);
		ISecureSecTentRoleMemb[] retset = new ISecureSecTentRoleMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecTentRoleMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SecTentRoleMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecTentRoleMemb readRec( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Read the specific SecTentRoleMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecTentRoleMemb readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId,
		String argLoginId )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec-args");
	}

	/**
	 *	Lock the specific SecTentRoleMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecTentRoleMemb lockRec( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecTentRoleMemb record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecTentRoleMemb instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecTentRoleMemb[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecTentRoleMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecTentRoleMemb readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId,
		String argLoginId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific SecTentRoleMemb record instances identified by the duplicate key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecTentRoleMemb[] readRecByTentRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId )
	{
		final String S_ProcName = "readRecByTentRoleIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByTentRoleIdx");
	}

	/**
	 *	Read an array of the specific SecTentRoleMemb record instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecTentRoleMemb[] readRecByUserIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "readRecByUserIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecTentRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsectentrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecTentRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUserIdx");
	}
}
