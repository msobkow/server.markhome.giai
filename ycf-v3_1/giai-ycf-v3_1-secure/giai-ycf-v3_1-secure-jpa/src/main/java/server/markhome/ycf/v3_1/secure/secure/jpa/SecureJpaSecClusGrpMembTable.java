
// Description: Java 25 DbIO implementation for SecClusGrpMemb.

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
 *	SecureJpaSecClusGrpMembTable database implementation for SecClusGrpMemb
 */
public class SecureJpaSecClusGrpMembTable implements ISecureSecClusGrpMembTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecClusGrpMembTable(ISecureSchema schema) {
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

	protected boolean canCreateSecClusGrpMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), "createsecclusgrpmemb");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecClusGrpMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), "readsecclusgrpmemb");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecClusGrpMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), "updatesecclusgrpmemb");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecClusGrpMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), "deletesecclusgrpmemb");
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
	public ISecureSecClusGrpMemb createSecClusGrpMemb( ISecureAuthorization Authorization,
		ISecureSecClusGrpMemb rec )
	{
		final String S_ProcName = "createSecClusGrpMemb";
		boolean permissionGranted = canCreateSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecClusGrpMemb", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecClusGrpMemb) {
			SecureJpaSecClusGrpMemb jparec = (SecureJpaSecClusGrpMemb)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecClusGrpMemb retval = schema.getJpaHooksSchema().getSecClusGrpMembService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecClusGrpMemb", "rec", rec, "SecureJpaSecClusGrpMemb");
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
	public ISecureSecClusGrpMemb updateSecClusGrpMemb( ISecureAuthorization Authorization,
		ISecureSecClusGrpMemb rec )
	{
		final String S_ProcName = "updateSecClusGrpMemb";
		boolean permissionGranted = canUpdateSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecClusGrpMemb", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecClusGrpMemb) {
			SecureJpaSecClusGrpMemb jparec = (SecureJpaSecClusGrpMemb)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecClusGrpMemb retval = schema.getJpaHooksSchema().getSecClusGrpMembService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecClusGrpMemb", "rec", rec, "SecureJpaSecClusGrpMemb");
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
	public void deleteSecClusGrpMemb( ISecureAuthorization Authorization,
		ISecureSecClusGrpMemb rec )
	{
		final String S_ProcName = "deleteSecClusGrpMemb";
		boolean permissionGranted = canDeleteSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecClusGrpMemb) {
			SecureJpaSecClusGrpMemb jparec = (SecureJpaSecClusGrpMemb)rec;
			schema.getJpaHooksSchema().getSecClusGrpMembService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecClusGrpMemb", "rec", rec, "SecureJpaSecClusGrpMemb");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecClusGrpMemb");
	}

	/**
	 *	Delete the SecClusGrpMemb instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecClusGrpMembByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusGrpId,
		String argLoginId )
	{
		final String S_ProcName = "deleteSecClusGrpMembByIdIdx";
		boolean permissionGranted = canDeleteSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusGrpMembService().deleteByIdIdx(argSecClusGrpId,
		argLoginId);
	}

	/**
	 *	Delete the SecClusGrpMemb instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecClusGrpMembByIdIdx( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey argKey )
	{
		final String S_ProcName = "deleteSecClusGrpMembByIdIdx";
		boolean permissionGranted = canDeleteSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusGrpMembService().deleteByIdIdx(argKey.getRequiredSecClusGrpId(),
			argKey.getRequiredLoginId());
	}

	/**
	 *	Delete the SecClusGrpMemb instances identified by the key ClusGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecClusGrpMembByClusGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusGrpId )
	{
		final String S_ProcName = "deleteSecClusGrpMembByClusGrpIdx";
		boolean permissionGranted = canDeleteSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusGrpMembService().deleteByClusGrpIdx(argSecClusGrpId);
	}


	/**
	 *	Delete the SecClusGrpMemb instances identified by the key ClusGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecClusGrpMembByClusGrpIdx( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembByClusGrpIdxKey argKey )
	{
		final String S_ProcName = "deleteSecClusGrpMembByClusGrpIdx";
		boolean permissionGranted = canDeleteSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusGrpMembService().deleteByClusGrpIdx(argKey.getRequiredSecClusGrpId());
	}

	/**
	 *	Delete the SecClusGrpMemb instances identified by the key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecClusGrpMembByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "deleteSecClusGrpMembByLoginIdx";
		boolean permissionGranted = canDeleteSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusGrpMembService().deleteByLoginIdx(argLoginId);
	}


	/**
	 *	Delete the SecClusGrpMemb instances identified by the key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecClusGrpMembByLoginIdx( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembByLoginIdxKey argKey )
	{
		final String S_ProcName = "deleteSecClusGrpMembByLoginIdx";
		boolean permissionGranted = canDeleteSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecClusGrpMembService().deleteByLoginIdx(argKey.getRequiredLoginId());
	}


	/**
	 *	Read the derived SecClusGrpMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusGrpMemb instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusGrpMemb readDerived( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecClusGrpMemb retval = schema.getJpaHooksSchema().getSecClusGrpMembService().find(PKey);
		return(retval);
	}

	/**
	 *	Read the derived SecClusGrpMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusGrpMemb readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusGrpId,
		String argLoginId )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecClusGrpMemb retval = schema.getJpaHooksSchema().getSecClusGrpMembService().find(argSecClusGrpId,
		argLoginId);
		return(retval);
	}

	/**
	 *	Lock the derived SecClusGrpMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusGrpMemb lockDerived( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecClusGrpMemb retval = schema.getJpaHooksSchema().getSecClusGrpMembService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecClusGrpMemb instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecClusGrpMemb[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecClusGrpMemb> retlist = schema.getJpaHooksSchema().getSecClusGrpMembService().findAll();
		ISecureSecClusGrpMemb[] retset = new ISecureSecClusGrpMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecClusGrpMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecClusGrpMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecClusGrpMemb readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusGrpId,
		String argLoginId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecClusGrpMemb retval = schema.getJpaHooksSchema().getSecClusGrpMembService().find(argSecClusGrpId,
		argLoginId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureCluster cluster = retval.getRequiredContainerGroup().getRequiredOwnerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfClusterGroup(Authorization.getSecUserId(), effClusterId, "readsecclusgrpmemb")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived SecClusGrpMemb record instances identified by the duplicate key ClusGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecClusGrpMemb[] readDerivedByClusGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusGrpId )
	{
		final String S_ProcName = "readDerivedByClusGrpIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecClusGrpMemb> retlist = schema.getJpaHooksSchema().getSecClusGrpMembService().findByClusGrpIdx(argSecClusGrpId);
		ISecureSecClusGrpMemb[] retset = new ISecureSecClusGrpMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecClusGrpMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecClusGrpMemb record instances identified by the duplicate key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecClusGrpMemb[] readDerivedByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "readDerivedByLoginIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecClusGrpMemb> retlist = schema.getJpaHooksSchema().getSecClusGrpMembService().findByLoginIdx(argLoginId);
		ISecureSecClusGrpMemb[] retset = new ISecureSecClusGrpMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecClusGrpMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SecClusGrpMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusGrpMemb readRec( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Read the specific SecClusGrpMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusGrpMemb readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusGrpId,
		String argLoginId )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec-args");
	}

	/**
	 *	Lock the specific SecClusGrpMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusGrpMemb lockRec( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecClusGrpMemb record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecClusGrpMemb instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecClusGrpMemb[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecClusGrpMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusGrpMemb readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusGrpId,
		String argLoginId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific SecClusGrpMemb record instances identified by the duplicate key ClusGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusGrpMemb[] readRecByClusGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusGrpId )
	{
		final String S_ProcName = "readRecByClusGrpIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByClusGrpIdx");
	}

	/**
	 *	Read an array of the specific SecClusGrpMemb record instances identified by the duplicate key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecClusGrpMemb[] readRecByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "readRecByLoginIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecClusGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecclusgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecClusGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByLoginIdx");
	}
}
