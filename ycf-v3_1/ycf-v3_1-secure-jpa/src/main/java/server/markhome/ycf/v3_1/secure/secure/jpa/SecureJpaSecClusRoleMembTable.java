
// Description: Java 25 DbIO implementation for SecClusRoleMemb.

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
 *	SecureJpaSecClusRoleMembTable database implementation for SecClusRoleMemb
 */
public class SecureJpaSecClusRoleMembTable implements ISecureSecClusRoleMembTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecClusRoleMembTable(ISecureSchema schema) {
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

	protected boolean canCreateSecClusRoleMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), "createsecclusrolememb");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecClusRoleMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), "readsecclusrolememb");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecClusRoleMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), "updatesecclusrolememb");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecClusRoleMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), "deletesecclusrolememb");
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
	public ISecureSecClusRoleMemb createSecClusRoleMemb( ISecureAuthorization Authorization,
		ISecureSecClusRoleMemb rec )
	{
		final String S_ProcName = "createSecClusRoleMemb";
		boolean permissionGranted = canCreateSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecClusRoleMemb", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecClusRoleMemb) {
			SecureJpaSecClusRoleMemb jparec = (SecureJpaSecClusRoleMemb)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecClusRoleMemb retval = schema.getJpaHooksSchema().getSecClusRoleMembService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecClusRoleMemb", "rec", rec, "SecureJpaSecClusRoleMemb");
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
	public ISecureSecClusRoleMemb updateSecClusRoleMemb( ISecureAuthorization Authorization,
		ISecureSecClusRoleMemb rec )
	{
		final String S_ProcName = "updateSecClusRoleMemb";
		boolean permissionGranted = canUpdateSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecClusRoleMemb", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecClusRoleMemb) {
			SecureJpaSecClusRoleMemb jparec = (SecureJpaSecClusRoleMemb)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecClusRoleMemb retval = schema.getJpaHooksSchema().getSecClusRoleMembService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecClusRoleMemb", "rec", rec, "SecureJpaSecClusRoleMemb");
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
	public void deleteSecClusRoleMemb( ISecureAuthorization Authorization,
		ISecureSecClusRoleMemb rec )
	{
		final String S_ProcName = "deleteSecClusRoleMemb";
		boolean permissionGranted = canDeleteSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecClusRoleMemb) {
			SecureJpaSecClusRoleMemb jparec = (SecureJpaSecClusRoleMemb)rec;
			schema.getJpaHooksSchema().getSecClusRoleMembService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecClusRoleMemb", "rec", rec, "SecureJpaSecClusRoleMemb");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecClusRoleMemb");
	}

	/**
	 *	Delete the SecClusRoleMemb instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecClusRoleMembByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId,
		String argLoginId )
	{
		final String S_ProcName = "deleteSecClusRoleMembByIdIdx";
		boolean permissionGranted = canDeleteSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleMembService().deleteByIdIdx(argSecClusRoleId,
		argLoginId);
	}

	/**
	 *	Delete the SecClusRoleMemb instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecClusRoleMembByIdIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleMembPKey argKey )
	{
		final String S_ProcName = "deleteSecClusRoleMembByIdIdx";
		boolean permissionGranted = canDeleteSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleMembService().deleteByIdIdx(argKey.getRequiredSecClusRoleId(),
			argKey.getRequiredLoginId());
	}

	/**
	 *	Delete the SecClusRoleMemb instances identified by the key ClusRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecClusRoleMembByClusRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId )
	{
		final String S_ProcName = "deleteSecClusRoleMembByClusRoleIdx";
		boolean permissionGranted = canDeleteSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleMembService().deleteByClusRoleIdx(argSecClusRoleId);
	}


	/**
	 *	Delete the SecClusRoleMemb instances identified by the key ClusRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecClusRoleMembByClusRoleIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleMembByClusRoleIdxKey argKey )
	{
		final String S_ProcName = "deleteSecClusRoleMembByClusRoleIdx";
		boolean permissionGranted = canDeleteSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleMembService().deleteByClusRoleIdx(argKey.getRequiredSecClusRoleId());
	}

	/**
	 *	Delete the SecClusRoleMemb instances identified by the key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecClusRoleMembByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "deleteSecClusRoleMembByLoginIdx";
		boolean permissionGranted = canDeleteSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleMembService().deleteByLoginIdx(argLoginId);
	}


	/**
	 *	Delete the SecClusRoleMemb instances identified by the key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecClusRoleMembByLoginIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleMembByLoginIdxKey argKey )
	{
		final String S_ProcName = "deleteSecClusRoleMembByLoginIdx";
		boolean permissionGranted = canDeleteSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusRoleMembService().deleteByLoginIdx(argKey.getRequiredLoginId());
	}


	/**
	 *	Read the derived SecClusRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRoleMemb instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusRoleMemb readDerived( ISecureAuthorization Authorization,
		ISecureSecClusRoleMembPKey PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecClusRoleMemb retval = schema.getJpaHooksSchema().getSecClusRoleMembService().find(PKey);
		return(retval);
	}

	/**
	 *	Read the derived SecClusRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusRoleMemb readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId,
		String argLoginId )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecClusRoleMemb retval = schema.getJpaHooksSchema().getSecClusRoleMembService().find(argSecClusRoleId,
		argLoginId);
		return(retval);
	}

	/**
	 *	Lock the derived SecClusRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusRoleMemb lockDerived( ISecureAuthorization Authorization,
		ISecureSecClusRoleMembPKey PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecClusRoleMemb retval = schema.getJpaHooksSchema().getSecClusRoleMembService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecClusRoleMemb instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecClusRoleMemb[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecClusRoleMemb> retlist = schema.getJpaHooksSchema().getSecClusRoleMembService().findAll();
		ISecureSecClusRoleMemb[] retset = new ISecureSecClusRoleMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecClusRoleMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecClusRoleMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusRoleMemb readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId,
		String argLoginId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecClusRoleMemb retval = schema.getJpaHooksSchema().getSecClusRoleMembService().find(argSecClusRoleId,
		argLoginId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureCluster cluster = retval.getRequiredContainerRole().getRequiredOwnerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), effClusterId, "readsecclusrolememb")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived SecClusRoleMemb record instances identified by the duplicate key ClusRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecClusRoleMemb[] readDerivedByClusRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId )
	{
		final String S_ProcName = "readDerivedByClusRoleIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecClusRoleMemb> retlist = schema.getJpaHooksSchema().getSecClusRoleMembService().findByClusRoleIdx(argSecClusRoleId);
		ISecureSecClusRoleMemb[] retset = new ISecureSecClusRoleMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecClusRoleMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecClusRoleMemb record instances identified by the duplicate key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecClusRoleMemb[] readDerivedByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "readDerivedByLoginIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecClusRoleMemb> retlist = schema.getJpaHooksSchema().getSecClusRoleMembService().findByLoginIdx(argLoginId);
		ISecureSecClusRoleMemb[] retset = new ISecureSecClusRoleMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecClusRoleMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SecClusRoleMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRoleMemb readRec( ISecureAuthorization Authorization,
		ISecureSecClusRoleMembPKey PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Read the specific SecClusRoleMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRoleMemb readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId,
		String argLoginId )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec-args");
	}

	/**
	 *	Lock the specific SecClusRoleMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRoleMemb lockRec( ISecureAuthorization Authorization,
		ISecureSecClusRoleMembPKey PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecClusRoleMemb record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecClusRoleMemb instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecClusRoleMemb[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecClusRoleMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRoleMemb readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId,
		String argLoginId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific SecClusRoleMemb record instances identified by the duplicate key ClusRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRoleMemb[] readRecByClusRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusRoleId )
	{
		final String S_ProcName = "readRecByClusRoleIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByClusRoleIdx");
	}

	/**
	 *	Read an array of the specific SecClusRoleMemb record instances identified by the duplicate key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusRoleMemb[] readRecByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "readRecByLoginIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusRoleMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusrolememb", ISecureSchema.SCHEMA_NAME, ISecureSecClusRoleMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByLoginIdx");
	}
}
