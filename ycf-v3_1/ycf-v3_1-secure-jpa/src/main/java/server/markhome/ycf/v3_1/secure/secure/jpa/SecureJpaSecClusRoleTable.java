
// Description: Java 25 DbIO implementation for SecClusRole.

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
 *	SecureJpaSecClusRoleTable database implementation for SecClusRole
 */
public class SecureJpaSecClusRoleTable implements ISecureSecClusRoleTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecClusRoleTable(ISecureSchema schema) {
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

	protected boolean canCreateSecClusRole(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), "createsecclusrole");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecClusRole(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), "readsecclusrole");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecClusRole(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), "updatesecclusrole");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecClusRole(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), "deletesecclusrole");
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
	public ISecureSecClusRole createSecClusRole( ISecureAuthorization Authorization,
		ISecureSecClusRole rec )
	{
		final String S_ProcName = "createSecClusRole";
		boolean permissionGranted = canCreateSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecClusRole", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecClusRole) {
			SecureJpaSecClusRole jparec = (SecureJpaSecClusRole)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecClusRole retval = schema.getJpaHooksSchema().getSecClusRoleService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecClusRole", "rec", rec, "SecureJpaSecClusRole");
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
	public ISecureSecClusRole updateSecClusRole( ISecureAuthorization Authorization,
		ISecureSecClusRole rec )
	{
		final String S_ProcName = "updateSecClusRole";
		boolean permissionGranted = canUpdateSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecClusRole", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecClusRole) {
			SecureJpaSecClusRole jparec = (SecureJpaSecClusRole)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecClusRole retval = schema.getJpaHooksSchema().getSecClusRoleService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecClusRole", "rec", rec, "SecureJpaSecClusRole");
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
	public void deleteSecClusRole( ISecureAuthorization Authorization,
		ISecureSecClusRole rec )
	{
		final String S_ProcName = "deleteSecClusRole";
		boolean permissionGranted = canDeleteSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecClusRole) {
			SecureJpaSecClusRole jparec = (SecureJpaSecClusRole)rec;
			schema.getJpaHooksSchema().getSecClusRoleService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecClusRole", "rec", rec, "SecureJpaSecClusRole");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecClusRole");
	}

	/**
	 *	Delete the SecClusRole instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecClusRoleByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteSecClusRoleByIdIdx";
		boolean permissionGranted = canDeleteSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the SecClusRole instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecClusRoleByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		final String S_ProcName = "deleteSecClusRoleByClusterIdx";
		boolean permissionGranted = canDeleteSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleService().deleteByClusterIdx(argClusterId);
	}


	/**
	 *	Delete the SecClusRole instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecClusRoleByClusterIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleByClusterIdxKey argKey )
	{
		final String S_ProcName = "deleteSecClusRoleByClusterIdx";
		boolean permissionGranted = canDeleteSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleService().deleteByClusterIdx(argKey.getRequiredClusterId());
	}

	/**
	 *	Delete the SecClusRole instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecClusRoleByNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "deleteSecClusRoleByNameIdx";
		boolean permissionGranted = canDeleteSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleService().deleteByNameIdx(argName);
	}


	/**
	 *	Delete the SecClusRole instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecClusRoleByNameIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleByNameIdxKey argKey )
	{
		final String S_ProcName = "deleteSecClusRoleByNameIdx";
		boolean permissionGranted = canDeleteSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleService().deleteByNameIdx(argKey.getRequiredName());
	}

	/**
	 *	Delete the SecClusRole instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecClusRoleByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId,
		String argName )
	{
		final String S_ProcName = "deleteSecClusRoleByUNameIdx";
		boolean permissionGranted = canDeleteSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleService().deleteByUNameIdx(argClusterId,
		argName);
	}


	/**
	 *	Delete the SecClusRole instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecClusRoleByUNameIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteSecClusRoleByUNameIdx";
		boolean permissionGranted = canDeleteSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleService().deleteByUNameIdx(argKey.getRequiredClusterId(),
			argKey.getRequiredName());
	}


	/**
	 *	Read the derived SecClusRole record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRole instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusRole readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecClusRole retval = schema.getJpaHooksSchema().getSecClusRoleService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived SecClusRole record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRole instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusRole lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecClusRole retval = schema.getJpaHooksSchema().getSecClusRoleService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecClusRole instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecClusRole[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecClusRole> retlist = schema.getJpaHooksSchema().getSecClusRoleService().findAll();
		ISecureSecClusRole[] retset = new ISecureSecClusRole[retlist.size()];
		int idx = 0;
		for (SecureJpaSecClusRole cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecClusRole record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusRole readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecClusRole retval = schema.getJpaHooksSchema().getSecClusRoleService().find(argSecClusRoleId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureCluster cluster = retval.getRequiredOwnerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), effClusterId, "readsecclusrole")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived SecClusRole record instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecClusRole[] readDerivedByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		final String S_ProcName = "readDerivedByClusterIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecClusRole> retlist = schema.getJpaHooksSchema().getSecClusRoleService().findByClusterIdx(argClusterId);
		ISecureSecClusRole[] retset = new ISecureSecClusRole[retlist.size()];
		int idx = 0;
		for (SecureJpaSecClusRole cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecClusRole record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecClusRole[] readDerivedByNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "readDerivedByNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecClusRole> retlist = schema.getJpaHooksSchema().getSecClusRoleService().findByNameIdx(argName);
		ISecureSecClusRole[] retset = new ISecureSecClusRole[retlist.size()];
		int idx = 0;
		for (SecureJpaSecClusRole cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecClusRole record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusRole readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecClusRole retval = schema.getJpaHooksSchema().getSecClusRoleService().findByUNameIdx(argClusterId,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureCluster cluster = retval.getRequiredOwnerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), effClusterId, "readsecclusrole")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the specific SecClusRole record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRole instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRole readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific SecClusRole record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRole instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRole lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecClusRole record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecClusRole instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecClusRole[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecClusRole record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRole readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific SecClusRole record instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRole[] readRecByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		final String S_ProcName = "readRecByClusterIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByClusterIdx");
	}

	/**
	 *	Read an array of the specific SecClusRole record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRole[] readRecByNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "readRecByNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByNameIdx");
	}

	/**
	 *	Read the specific SecClusRole record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRole readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRole(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrole", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}
}
