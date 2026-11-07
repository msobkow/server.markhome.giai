
// Description: Java 25 DbIO implementation for SecSysRoleEnables.

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
 *	SecureJpaSecSysRoleEnablesTable database implementation for SecSysRoleEnables
 */
public class SecureJpaSecSysRoleEnablesTable implements ISecureSecSysRoleEnablesTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecSysRoleEnablesTable(ISecureSchema schema) {
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

	protected boolean canCreateSecSysRoleEnables(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createsecsysroleenables");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecSysRoleEnables(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readsecsysroleenables");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecSysRoleEnables(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatesecsysroleenables");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecSysRoleEnables(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletesecsysroleenables");
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
	public ISecureSecSysRoleEnables createSecSysRoleEnables( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnables rec )
	{
		final String S_ProcName = "createSecSysRoleEnables";
		boolean permissionGranted = canCreateSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecSysRoleEnables", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecSysRoleEnables) {
			SecureJpaSecSysRoleEnables jparec = (SecureJpaSecSysRoleEnables)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecSysRoleEnables retval = schema.getJpaHooksSchema().getSecSysRoleEnablesService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecSysRoleEnables", "rec", rec, "SecureJpaSecSysRoleEnables");
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
	public ISecureSecSysRoleEnables updateSecSysRoleEnables( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnables rec )
	{
		final String S_ProcName = "updateSecSysRoleEnables";
		boolean permissionGranted = canUpdateSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecSysRoleEnables", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecSysRoleEnables) {
			SecureJpaSecSysRoleEnables jparec = (SecureJpaSecSysRoleEnables)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecSysRoleEnables retval = schema.getJpaHooksSchema().getSecSysRoleEnablesService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecSysRoleEnables", "rec", rec, "SecureJpaSecSysRoleEnables");
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
	public void deleteSecSysRoleEnables( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnables rec )
	{
		final String S_ProcName = "deleteSecSysRoleEnables";
		boolean permissionGranted = canDeleteSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecSysRoleEnables) {
			SecureJpaSecSysRoleEnables jparec = (SecureJpaSecSysRoleEnables)rec;
			schema.getJpaHooksSchema().getSecSysRoleEnablesService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecSysRoleEnables", "rec", rec, "SecureJpaSecSysRoleEnables");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecSysRoleEnables");
	}

	/**
	 *	Delete the SecSysRoleEnables instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysRoleEnablesByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId,
		String argEnableName )
	{
		final String S_ProcName = "deleteSecSysRoleEnablesByIdIdx";
		boolean permissionGranted = canDeleteSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysRoleEnablesService().deleteByIdIdx(argSecSysRoleId,
		argEnableName);
	}

	/**
	 *	Delete the SecSysRoleEnables instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecSysRoleEnablesByIdIdx( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnablesPKey argKey )
	{
		final String S_ProcName = "deleteSecSysRoleEnablesByIdIdx";
		boolean permissionGranted = canDeleteSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysRoleEnablesService().deleteByIdIdx(argKey.getRequiredSecSysRoleId(),
			argKey.getRequiredEnableName());
	}

	/**
	 *	Delete the SecSysRoleEnables instances identified by the key SysRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysRoleEnablesBySysRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId )
	{
		final String S_ProcName = "deleteSecSysRoleEnablesBySysRoleIdx";
		boolean permissionGranted = canDeleteSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysRoleEnablesService().deleteBySysRoleIdx(argSecSysRoleId);
	}


	/**
	 *	Delete the SecSysRoleEnables instances identified by the key SysRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecSysRoleEnablesBySysRoleIdx( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnablesBySysRoleIdxKey argKey )
	{
		final String S_ProcName = "deleteSecSysRoleEnablesBySysRoleIdx";
		boolean permissionGranted = canDeleteSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysRoleEnablesService().deleteBySysRoleIdx(argKey.getRequiredSecSysRoleId());
	}

	/**
	 *	Delete the SecSysRoleEnables instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysRoleEnablesByNameIdx( ISecureAuthorization Authorization,
		String argEnableName )
	{
		final String S_ProcName = "deleteSecSysRoleEnablesByNameIdx";
		boolean permissionGranted = canDeleteSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysRoleEnablesService().deleteByNameIdx(argEnableName);
	}


	/**
	 *	Delete the SecSysRoleEnables instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecSysRoleEnablesByNameIdx( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnablesByNameIdxKey argKey )
	{
		final String S_ProcName = "deleteSecSysRoleEnablesByNameIdx";
		boolean permissionGranted = canDeleteSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysRoleEnablesService().deleteByNameIdx(argKey.getRequiredEnableName());
	}


	/**
	 *	Read the derived SecSysRoleEnables record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysRoleEnables readDerived( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnablesPKey PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysRoleEnables retval = schema.getJpaHooksSchema().getSecSysRoleEnablesService().find(PKey);
		return(retval);
	}

	/**
	 *	Read the derived SecSysRoleEnables record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysRoleEnables readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId,
		String argEnableName )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysRoleEnables retval = schema.getJpaHooksSchema().getSecSysRoleEnablesService().find(argSecSysRoleId,
		argEnableName);
		return(retval);
	}

	/**
	 *	Lock the derived SecSysRoleEnables record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysRoleEnables lockDerived( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnablesPKey PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysRoleEnables retval = schema.getJpaHooksSchema().getSecSysRoleEnablesService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecSysRoleEnables instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysRoleEnables[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecSysRoleEnables> retlist = schema.getJpaHooksSchema().getSecSysRoleEnablesService().findAll();
		ISecureSecSysRoleEnables[] retset = new ISecureSecSysRoleEnables[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysRoleEnables cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecSysRoleEnables record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysRoleEnables readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId,
		String argEnableName )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecSysRoleEnables retval = schema.getJpaHooksSchema().getSecSysRoleEnablesService().find(argSecSysRoleId,
		argEnableName);
		return(retval);
	}

	/**
	 *	Read an array of the derived SecSysRoleEnables record instances identified by the duplicate key SysRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysRoleEnables[] readDerivedBySysRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId )
	{
		final String S_ProcName = "readDerivedBySysRoleIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecSysRoleEnables> retlist = schema.getJpaHooksSchema().getSecSysRoleEnablesService().findBySysRoleIdx(argSecSysRoleId);
		ISecureSecSysRoleEnables[] retset = new ISecureSecSysRoleEnables[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysRoleEnables cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecSysRoleEnables record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysRoleEnables[] readDerivedByNameIdx( ISecureAuthorization Authorization,
		String argEnableName )
	{
		final String S_ProcName = "readDerivedByNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecSysRoleEnables> retlist = schema.getJpaHooksSchema().getSecSysRoleEnablesService().findByNameIdx(argEnableName);
		ISecureSecSysRoleEnables[] retset = new ISecureSecSysRoleEnables[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysRoleEnables cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SecSysRoleEnables record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysRoleEnables readRec( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnablesPKey PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Read the specific SecSysRoleEnables record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysRoleEnables readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId,
		String argEnableName )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec-args");
	}

	/**
	 *	Lock the specific SecSysRoleEnables record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysRoleEnables lockRec( ISecureAuthorization Authorization,
		ISecureSecSysRoleEnablesPKey PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecSysRoleEnables record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSysRoleEnables instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecSysRoleEnables[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecSysRoleEnables record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysRoleEnables readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId,
		String argEnableName )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific SecSysRoleEnables record instances identified by the duplicate key SysRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysRoleEnables[] readRecBySysRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId )
	{
		final String S_ProcName = "readRecBySysRoleIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySysRoleIdx");
	}

	/**
	 *	Read an array of the specific SecSysRoleEnables record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysRoleEnables[] readRecByNameIdx( ISecureAuthorization Authorization,
		String argEnableName )
	{
		final String S_ProcName = "readRecByNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysRoleEnables(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysroleenables", ISecureSchema.SCHEMA_NAME, ISecureSecSysRoleEnablesTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByNameIdx");
	}
}
