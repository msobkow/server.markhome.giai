
// Description: Java 25 DbIO implementation for SecSysGrp.

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
 *	SecureJpaSecSysGrpTable database implementation for SecSysGrp
 */
public class SecureJpaSecSysGrpTable implements ISecureSecSysGrpTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecSysGrpTable(ISecureSchema schema) {
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

	protected boolean canCreateSecSysGrp(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createsecsysgrp");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecSysGrp(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readsecsysgrp");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecSysGrp(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatesecsysgrp");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecSysGrp(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletesecsysgrp");
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
	public ISecureSecSysGrp createSecSysGrp( ISecureAuthorization Authorization,
		ISecureSecSysGrp rec )
	{
		final String S_ProcName = "createSecSysGrp";
		boolean permissionGranted = canCreateSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecSysGrp", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecSysGrp) {
			SecureJpaSecSysGrp jparec = (SecureJpaSecSysGrp)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecSysGrp retval = schema.getJpaHooksSchema().getSecSysGrpService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecSysGrp", "rec", rec, "SecureJpaSecSysGrp");
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
	public ISecureSecSysGrp updateSecSysGrp( ISecureAuthorization Authorization,
		ISecureSecSysGrp rec )
	{
		final String S_ProcName = "updateSecSysGrp";
		boolean permissionGranted = canUpdateSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecSysGrp", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecSysGrp) {
			SecureJpaSecSysGrp jparec = (SecureJpaSecSysGrp)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecSysGrp retval = schema.getJpaHooksSchema().getSecSysGrpService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecSysGrp", "rec", rec, "SecureJpaSecSysGrp");
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
	public void deleteSecSysGrp( ISecureAuthorization Authorization,
		ISecureSecSysGrp rec )
	{
		final String S_ProcName = "deleteSecSysGrp";
		boolean permissionGranted = canDeleteSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecSysGrp) {
			SecureJpaSecSysGrp jparec = (SecureJpaSecSysGrp)rec;
			schema.getJpaHooksSchema().getSecSysGrpService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecSysGrp", "rec", rec, "SecureJpaSecSysGrp");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecSysGrp");
	}

	/**
	 *	Delete the SecSysGrp instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecSysGrpByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteSecSysGrpByIdIdx";
		boolean permissionGranted = canDeleteSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the SecSysGrp instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysGrpByUNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "deleteSecSysGrpByUNameIdx";
		boolean permissionGranted = canDeleteSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpService().deleteByUNameIdx(argName);
	}


	/**
	 *	Delete the SecSysGrp instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecSysGrpByUNameIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteSecSysGrpByUNameIdx";
		boolean permissionGranted = canDeleteSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpService().deleteByUNameIdx(argKey.getRequiredName());
	}

	/**
	 *	Delete the SecSysGrp instances identified by the key SecLevelIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecSysGrpBySecLevelIdx( ISecureAuthorization Authorization,
		ISecurePubSchema.SecLevelEnum argSecLevel )
	{
		final String S_ProcName = "deleteSecSysGrpBySecLevelIdx";
		boolean permissionGranted = canDeleteSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpService().deleteBySecLevelIdx(argSecLevel);
	}


	/**
	 *	Delete the SecSysGrp instances identified by the key SecLevelIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecSysGrpBySecLevelIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpBySecLevelIdxKey argKey )
	{
		final String S_ProcName = "deleteSecSysGrpBySecLevelIdx";
		boolean permissionGranted = canDeleteSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecSysGrpService().deleteBySecLevelIdx(argKey.getRequiredSecLevel());
	}


	/**
	 *	Read the derived SecSysGrp record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrp instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrp readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysGrp retval = schema.getJpaHooksSchema().getSecSysGrpService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived SecSysGrp record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrp instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrp lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecSysGrp retval = schema.getJpaHooksSchema().getSecSysGrpService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecSysGrp instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysGrp[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecSysGrp> retlist = schema.getJpaHooksSchema().getSecSysGrpService().findAll();
		ISecureSecSysGrp[] retset = new ISecureSecSysGrp[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysGrp cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecSysGrp record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrp readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecSysGrp retval = schema.getJpaHooksSchema().getSecSysGrpService().find(argSecSysGrpId);
		return(retval);
	}

	/**
	 *	Read the derived SecSysGrp record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecSysGrp readDerivedByUNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecSysGrp retval = schema.getJpaHooksSchema().getSecSysGrpService().findByUNameIdx(argName);
		return(retval);
	}

	/**
	 *	Read an array of the derived SecSysGrp record instances identified by the duplicate key SecLevelIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecSysGrp[] readDerivedBySecLevelIdx( ISecureAuthorization Authorization,
		ISecurePubSchema.SecLevelEnum argSecLevel )
	{
		final String S_ProcName = "readDerivedBySecLevelIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecSysGrp> retlist = schema.getJpaHooksSchema().getSecSysGrpService().findBySecLevelIdx(argSecLevel);
		ISecureSecSysGrp[] retset = new ISecureSecSysGrp[retlist.size()];
		int idx = 0;
		for (SecureJpaSecSysGrp cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SecSysGrp record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrp instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrp readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific SecSysGrp record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrp instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrp lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecSysGrp record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSysGrp instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecSysGrp[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecSysGrp record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrp readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific SecSysGrp record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrp readRecByUNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}

	/**
	 *	Read an array of the specific SecSysGrp record instances identified by the duplicate key SecLevelIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecSysGrp[] readRecBySecLevelIdx( ISecureAuthorization Authorization,
		ISecurePubSchema.SecLevelEnum argSecLevel )
	{
		final String S_ProcName = "readRecBySecLevelIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecSysGrp(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecsysgrp", ISecureSchema.SCHEMA_NAME, ISecureSecSysGrpTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySecLevelIdx");
	}
}
