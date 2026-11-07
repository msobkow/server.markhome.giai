
// Description: Java 25 DbIO implementation for SecSysGrpMemb.

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
 *	SecureJpaSecSysGrpMembTable database implementation for SecSysGrpMemb
 */
public class SecureJpaSecSysGrpMembTable implements ISecureSecSysGrpMembTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecSysGrpMembTable(ISecureSchema schema) {
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

	protected boolean canCreateSecSysGrpMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createsecsysgrpmemb");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecSysGrpMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readsecsysgrpmemb");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecSysGrpMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatesecsysgrpmemb");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecSysGrpMemb(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletesecsysgrpmemb");
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
	public ISecureSecSysGrpMemb createSecSysGrpMemb( ISecureAuthorization Authorization,
		ISecureSecSysGrpMemb rec )
	{
		final String S_ProcName = "createSecSysGrpMemb";
		boolean permissionGranted = canCreateSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecSysGrpMemb", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecSysGrpMemb) {
			SecureJpaSecSysGrpMemb jparec = (SecureJpaSecSysGrpMemb)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecSysGrpMemb retval = schema.getJpaHooksSchema().getSecSysGrpMembService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecSysGrpMemb", "rec", rec, "SecureJpaSecSysGrpMemb");
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
	public ISecureSecSysGrpMemb updateSecSysGrpMemb( ISecureAuthorization Authorization,
		ISecureSecSysGrpMemb rec )
	{
		final String S_ProcName = "updateSecSysGrpMemb";
		boolean permissionGranted = canUpdateSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecSysGrpMemb", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecSysGrpMemb) {
			SecureJpaSecSysGrpMemb jparec = (SecureJpaSecSysGrpMemb)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecSysGrpMemb retval = schema.getJpaHooksSchema().getSecSysGrpMembService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecSysGrpMemb", "rec", rec, "SecureJpaSecSysGrpMemb");
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
	public void deleteSecSysGrpMemb( ISecureAuthorization Authorization,
		ISecureSecSysGrpMemb rec )
	{
		final String S_ProcName = "deleteSecSysGrpMemb";
		boolean permissionGranted = canDeleteSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecSysGrpMemb) {
			SecureJpaSecSysGrpMemb jparec = (SecureJpaSecSysGrpMemb)rec;
			schema.getJpaHooksSchema().getSecSysGrpMembService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecSysGrpMemb", "rec", rec, "SecureJpaSecSysGrpMemb");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecSysGrpMemb");
	}

	/**
	 *	Delete the SecSysGrpMemb instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysGrpMembByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argLoginId )
	{
		final String S_ProcName = "deleteSecSysGrpMembByIdIdx";
		boolean permissionGranted = canDeleteSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpMembService().deleteByIdIdx(argSecSysGrpId,
		argLoginId);
	}

	/**
	 *	Delete the SecSysGrpMemb instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecSysGrpMembByIdIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey argKey )
	{
		final String S_ProcName = "deleteSecSysGrpMembByIdIdx";
		boolean permissionGranted = canDeleteSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpMembService().deleteByIdIdx(argKey.getRequiredSecSysGrpId(),
			argKey.getRequiredLoginId());
	}

	/**
	 *	Delete the SecSysGrpMemb instances identified by the key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysGrpMembBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId )
	{
		final String S_ProcName = "deleteSecSysGrpMembBySysGrpIdx";
		boolean permissionGranted = canDeleteSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpMembService().deleteBySysGrpIdx(argSecSysGrpId);
	}


	/**
	 *	Delete the SecSysGrpMemb instances identified by the key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecSysGrpMembBySysGrpIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembBySysGrpIdxKey argKey )
	{
		final String S_ProcName = "deleteSecSysGrpMembBySysGrpIdx";
		boolean permissionGranted = canDeleteSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpMembService().deleteBySysGrpIdx(argKey.getRequiredSecSysGrpId());
	}

	/**
	 *	Delete the SecSysGrpMemb instances identified by the key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysGrpMembByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "deleteSecSysGrpMembByLoginIdx";
		boolean permissionGranted = canDeleteSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpMembService().deleteByLoginIdx(argLoginId);
	}


	/**
	 *	Delete the SecSysGrpMemb instances identified by the key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecSysGrpMembByLoginIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembByLoginIdxKey argKey )
	{
		final String S_ProcName = "deleteSecSysGrpMembByLoginIdx";
		boolean permissionGranted = canDeleteSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpMembService().deleteByLoginIdx(argKey.getRequiredLoginId());
	}


	/**
	 *	Read the derived SecSysGrpMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrpMemb readDerived( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysGrpMemb retval = schema.getJpaHooksSchema().getSecSysGrpMembService().find(PKey);
		return(retval);
	}

	/**
	 *	Read the derived SecSysGrpMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrpMemb readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argLoginId )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysGrpMemb retval = schema.getJpaHooksSchema().getSecSysGrpMembService().find(argSecSysGrpId,
		argLoginId);
		return(retval);
	}

	/**
	 *	Lock the derived SecSysGrpMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrpMemb lockDerived( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysGrpMemb retval = schema.getJpaHooksSchema().getSecSysGrpMembService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecSysGrpMemb instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysGrpMemb[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecSysGrpMemb> retlist = schema.getJpaHooksSchema().getSecSysGrpMembService().findAll();
		ISecureSecSysGrpMemb[] retset = new ISecureSecSysGrpMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysGrpMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecSysGrpMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrpMemb readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argLoginId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecSysGrpMemb retval = schema.getJpaHooksSchema().getSecSysGrpMembService().find(argSecSysGrpId,
		argLoginId);
		return(retval);
	}

	/**
	 *	Read an array of the derived SecSysGrpMemb record instances identified by the duplicate key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysGrpMemb[] readDerivedBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId )
	{
		final String S_ProcName = "readDerivedBySysGrpIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecSysGrpMemb> retlist = schema.getJpaHooksSchema().getSecSysGrpMembService().findBySysGrpIdx(argSecSysGrpId);
		ISecureSecSysGrpMemb[] retset = new ISecureSecSysGrpMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysGrpMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecSysGrpMemb record instances identified by the duplicate key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysGrpMemb[] readDerivedByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "readDerivedByLoginIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecSysGrpMemb> retlist = schema.getJpaHooksSchema().getSecSysGrpMembService().findByLoginIdx(argLoginId);
		ISecureSecSysGrpMemb[] retset = new ISecureSecSysGrpMemb[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysGrpMemb cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SecSysGrpMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpMemb readRec( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Read the specific SecSysGrpMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpMemb readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argLoginId )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec-args");
	}

	/**
	 *	Lock the specific SecSysGrpMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpMemb lockRec( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecSysGrpMemb record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSysGrpMemb instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecSysGrpMemb[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecSysGrpMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpMemb readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argLoginId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific SecSysGrpMemb record instances identified by the duplicate key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpMemb[] readRecBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId )
	{
		final String S_ProcName = "readRecBySysGrpIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySysGrpIdx");
	}

	/**
	 *	Read an array of the specific SecSysGrpMemb record instances identified by the duplicate key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpMemb[] readRecByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		final String S_ProcName = "readRecByLoginIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpMemb(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpmemb", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpMembTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByLoginIdx");
	}
}
