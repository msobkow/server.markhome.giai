
// Description: Java 25 DbIO implementation for SecSysGrpInc.

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
 *	SecureJpaSecSysGrpIncTable database implementation for SecSysGrpInc
 */
public class SecureJpaSecSysGrpIncTable implements ISecureSecSysGrpIncTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecSysGrpIncTable(ISecureSchema schema) {
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

	protected boolean canCreateSecSysGrpInc(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createsecsysgrpinc");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecSysGrpInc(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readsecsysgrpinc");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecSysGrpInc(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatesecsysgrpinc");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecSysGrpInc(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletesecsysgrpinc");
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
	public ISecureSecSysGrpInc createSecSysGrpInc( ISecureAuthorization Authorization,
		ISecureSecSysGrpInc rec )
	{
		final String S_ProcName = "createSecSysGrpInc";
		boolean permissionGranted = canCreateSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecSysGrpInc", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecSysGrpInc) {
			SecureJpaSecSysGrpInc jparec = (SecureJpaSecSysGrpInc)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecSysGrpInc retval = schema.getJpaHooksSchema().getSecSysGrpIncService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecSysGrpInc", "rec", rec, "SecureJpaSecSysGrpInc");
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
	public ISecureSecSysGrpInc updateSecSysGrpInc( ISecureAuthorization Authorization,
		ISecureSecSysGrpInc rec )
	{
		final String S_ProcName = "updateSecSysGrpInc";
		boolean permissionGranted = canUpdateSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecSysGrpInc", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecSysGrpInc) {
			SecureJpaSecSysGrpInc jparec = (SecureJpaSecSysGrpInc)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecSysGrpInc retval = schema.getJpaHooksSchema().getSecSysGrpIncService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecSysGrpInc", "rec", rec, "SecureJpaSecSysGrpInc");
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
	public void deleteSecSysGrpInc( ISecureAuthorization Authorization,
		ISecureSecSysGrpInc rec )
	{
		final String S_ProcName = "deleteSecSysGrpInc";
		boolean permissionGranted = canDeleteSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecSysGrpInc) {
			SecureJpaSecSysGrpInc jparec = (SecureJpaSecSysGrpInc)rec;
			schema.getJpaHooksSchema().getSecSysGrpIncService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecSysGrpInc", "rec", rec, "SecureJpaSecSysGrpInc");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecSysGrpInc");
	}

	/**
	 *	Delete the SecSysGrpInc instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysGrpIncByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argInclName )
	{
		final String S_ProcName = "deleteSecSysGrpIncByIdIdx";
		boolean permissionGranted = canDeleteSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpIncService().deleteByIdIdx(argSecSysGrpId,
		argInclName);
	}

	/**
	 *	Delete the SecSysGrpInc instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecSysGrpIncByIdIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey argKey )
	{
		final String S_ProcName = "deleteSecSysGrpIncByIdIdx";
		boolean permissionGranted = canDeleteSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpIncService().deleteByIdIdx(argKey.getRequiredSecSysGrpId(),
			argKey.getRequiredInclName());
	}

	/**
	 *	Delete the SecSysGrpInc instances identified by the key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysGrpIncBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId )
	{
		final String S_ProcName = "deleteSecSysGrpIncBySysGrpIdx";
		boolean permissionGranted = canDeleteSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpIncService().deleteBySysGrpIdx(argSecSysGrpId);
	}


	/**
	 *	Delete the SecSysGrpInc instances identified by the key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecSysGrpIncBySysGrpIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncBySysGrpIdxKey argKey )
	{
		final String S_ProcName = "deleteSecSysGrpIncBySysGrpIdx";
		boolean permissionGranted = canDeleteSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpIncService().deleteBySysGrpIdx(argKey.getRequiredSecSysGrpId());
	}

	/**
	 *	Delete the SecSysGrpInc instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysGrpIncByNameIdx( ISecureAuthorization Authorization,
		String argInclName )
	{
		final String S_ProcName = "deleteSecSysGrpIncByNameIdx";
		boolean permissionGranted = canDeleteSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpIncService().deleteByNameIdx(argInclName);
	}


	/**
	 *	Delete the SecSysGrpInc instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecSysGrpIncByNameIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncByNameIdxKey argKey )
	{
		final String S_ProcName = "deleteSecSysGrpIncByNameIdx";
		boolean permissionGranted = canDeleteSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpIncService().deleteByNameIdx(argKey.getRequiredInclName());
	}


	/**
	 *	Read the derived SecSysGrpInc record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrpInc readDerived( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysGrpInc retval = schema.getJpaHooksSchema().getSecSysGrpIncService().find(PKey);
		return(retval);
	}

	/**
	 *	Read the derived SecSysGrpInc record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrpInc readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argInclName )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysGrpInc retval = schema.getJpaHooksSchema().getSecSysGrpIncService().find(argSecSysGrpId,
		argInclName);
		return(retval);
	}

	/**
	 *	Lock the derived SecSysGrpInc record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrpInc lockDerived( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysGrpInc retval = schema.getJpaHooksSchema().getSecSysGrpIncService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecSysGrpInc instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysGrpInc[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecSysGrpInc> retlist = schema.getJpaHooksSchema().getSecSysGrpIncService().findAll();
		ISecureSecSysGrpInc[] retset = new ISecureSecSysGrpInc[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysGrpInc cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecSysGrpInc record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrpInc readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argInclName )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecSysGrpInc retval = schema.getJpaHooksSchema().getSecSysGrpIncService().find(argSecSysGrpId,
		argInclName);
		return(retval);
	}

	/**
	 *	Read an array of the derived SecSysGrpInc record instances identified by the duplicate key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysGrpInc[] readDerivedBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId )
	{
		final String S_ProcName = "readDerivedBySysGrpIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecSysGrpInc> retlist = schema.getJpaHooksSchema().getSecSysGrpIncService().findBySysGrpIdx(argSecSysGrpId);
		ISecureSecSysGrpInc[] retset = new ISecureSecSysGrpInc[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysGrpInc cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecSysGrpInc record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysGrpInc[] readDerivedByNameIdx( ISecureAuthorization Authorization,
		String argInclName )
	{
		final String S_ProcName = "readDerivedByNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecSysGrpInc> retlist = schema.getJpaHooksSchema().getSecSysGrpIncService().findByNameIdx(argInclName);
		ISecureSecSysGrpInc[] retset = new ISecureSecSysGrpInc[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysGrpInc cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SecSysGrpInc record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpInc readRec( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Read the specific SecSysGrpInc record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpInc readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argInclName )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec-args");
	}

	/**
	 *	Lock the specific SecSysGrpInc record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpInc lockRec( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecSysGrpInc record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSysGrpInc instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecSysGrpInc[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecSysGrpInc record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpInc readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argInclName )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific SecSysGrpInc record instances identified by the duplicate key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpInc[] readRecBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId )
	{
		final String S_ProcName = "readRecBySysGrpIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySysGrpIdx");
	}

	/**
	 *	Read an array of the specific SecSysGrpInc record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrpInc[] readRecByNameIdx( ISecureAuthorization Authorization,
		String argInclName )
	{
		final String S_ProcName = "readRecByNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrpInc(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrpinc", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpIncTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByNameIdx");
	}
}
