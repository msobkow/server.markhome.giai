
// Description: Java 25 DbIO implementation for SecUserPWHistory.

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
 *	SecureJpaSecUserPWHistoryTable database implementation for SecUserPWHistory
 */
public class SecureJpaSecUserPWHistoryTable implements ISecureSecUserPWHistoryTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecUserPWHistoryTable(ISecureSchema schema) {
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

	protected boolean canCreateSecUserPWHistory(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createsecuserpwhistory");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecUserPWHistory(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readsecuserpwhistory");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecUserPWHistory(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatesecuserpwhistory");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecUserPWHistory(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletesecuserpwhistory");
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
	public ISecureSecUserPWHistory createSecUserPWHistory( ISecureAuthorization Authorization,
		ISecureSecUserPWHistory rec )
	{
		final String S_ProcName = "createSecUserPWHistory";
		boolean permissionGranted = canCreateSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecUserPWHistory", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecUserPWHistory) {
			SecureJpaSecUserPWHistory jparec = (SecureJpaSecUserPWHistory)rec;
			SecureJpaSecUserPWHistory retval = schema.getJpaHooksSchema().getSecUserPWHistoryService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecUserPWHistory", "rec", rec, "SecureJpaSecUserPWHistory");
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
	public ISecureSecUserPWHistory updateSecUserPWHistory( ISecureAuthorization Authorization,
		ISecureSecUserPWHistory rec )
	{
		final String S_ProcName = "updateSecUserPWHistory";
		boolean permissionGranted = canUpdateSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecUserPWHistory", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecUserPWHistory) {
			SecureJpaSecUserPWHistory jparec = (SecureJpaSecUserPWHistory)rec;
			SecureJpaSecUserPWHistory retval = schema.getJpaHooksSchema().getSecUserPWHistoryService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecUserPWHistory", "rec", rec, "SecureJpaSecUserPWHistory");
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
	public void deleteSecUserPWHistory( ISecureAuthorization Authorization,
		ISecureSecUserPWHistory rec )
	{
		final String S_ProcName = "deleteSecUserPWHistory";
		boolean permissionGranted = canDeleteSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecUserPWHistory) {
			SecureJpaSecUserPWHistory jparec = (SecureJpaSecUserPWHistory)rec;
			schema.getJpaHooksSchema().getSecUserPWHistoryService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecUserPWHistory", "rec", rec, "SecureJpaSecUserPWHistory");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecUserPWHistory");
	}

	/**
	 *	Delete the SecUserPWHistory instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserPWHistoryByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId,
		LocalDateTime argPWSetStamp )
	{
		final String S_ProcName = "deleteSecUserPWHistoryByIdIdx";
		boolean permissionGranted = canDeleteSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWHistoryService().deleteByIdIdx(argSecUserId,
		argPWSetStamp);
	}

	/**
	 *	Delete the SecUserPWHistory instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecUserPWHistoryByIdIdx( ISecureAuthorization Authorization,
		ISecureSecUserPWHistoryPKey argKey )
	{
		final String S_ProcName = "deleteSecUserPWHistoryByIdIdx";
		boolean permissionGranted = canDeleteSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWHistoryService().deleteByIdIdx(argKey.getRequiredSecUserId(),
			argKey.getRequiredPWSetStamp());
	}

	/**
	 *	Delete the SecUserPWHistory instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserPWHistoryByUserIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId )
	{
		final String S_ProcName = "deleteSecUserPWHistoryByUserIdx";
		boolean permissionGranted = canDeleteSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWHistoryService().deleteByUserIdx(argSecUserId);
	}


	/**
	 *	Delete the SecUserPWHistory instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserPWHistoryByUserIdx( ISecureAuthorization Authorization,
		ISecureSecUserPWHistoryByUserIdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserPWHistoryByUserIdx";
		boolean permissionGranted = canDeleteSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWHistoryService().deleteByUserIdx(argKey.getRequiredSecUserId());
	}

	/**
	 *	Delete the SecUserPWHistory instances identified by the key SetStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserPWHistoryBySetStampIdx( ISecureAuthorization Authorization,
		LocalDateTime argPWSetStamp )
	{
		final String S_ProcName = "deleteSecUserPWHistoryBySetStampIdx";
		boolean permissionGranted = canDeleteSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWHistoryService().deleteBySetStampIdx(argPWSetStamp);
	}


	/**
	 *	Delete the SecUserPWHistory instances identified by the key SetStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserPWHistoryBySetStampIdx( ISecureAuthorization Authorization,
		ISecureSecUserPWHistoryBySetStampIdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserPWHistoryBySetStampIdx";
		boolean permissionGranted = canDeleteSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWHistoryService().deleteBySetStampIdx(argKey.getRequiredPWSetStamp());
	}

	/**
	 *	Delete the SecUserPWHistory instances identified by the key ReplacedStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PWReplacedStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserPWHistoryByReplacedStampIdx( ISecureAuthorization Authorization,
		LocalDateTime argPWReplacedStamp )
	{
		final String S_ProcName = "deleteSecUserPWHistoryByReplacedStampIdx";
		boolean permissionGranted = canDeleteSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWHistoryService().deleteByReplacedStampIdx(argPWReplacedStamp);
	}


	/**
	 *	Delete the SecUserPWHistory instances identified by the key ReplacedStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserPWHistoryByReplacedStampIdx( ISecureAuthorization Authorization,
		ISecureSecUserPWHistoryByReplacedStampIdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserPWHistoryByReplacedStampIdx";
		boolean permissionGranted = canDeleteSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWHistoryService().deleteByReplacedStampIdx(argKey.getRequiredPWReplacedStamp());
	}


	/**
	 *	Read the derived SecUserPWHistory record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserPWHistory instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWHistory readDerived( ISecureAuthorization Authorization,
		ISecureSecUserPWHistoryPKey PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecUserPWHistory retval = schema.getJpaHooksSchema().getSecUserPWHistoryService().find(PKey);
		return(retval);
	}

	/**
	 *	Read the derived SecUserPWHistory record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWHistory readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId,
		LocalDateTime argPWSetStamp )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecUserPWHistory retval = schema.getJpaHooksSchema().getSecUserPWHistoryService().find(argSecUserId,
		argPWSetStamp);
		return(retval);
	}

	/**
	 *	Lock the derived SecUserPWHistory record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserPWHistory instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWHistory lockDerived( ISecureAuthorization Authorization,
		ISecureSecUserPWHistoryPKey PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecUserPWHistory retval = schema.getJpaHooksSchema().getSecUserPWHistoryService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecUserPWHistory instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecUserPWHistory[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecUserPWHistory> retlist = schema.getJpaHooksSchema().getSecUserPWHistoryService().findAll();
		ISecureSecUserPWHistory[] retset = new ISecureSecUserPWHistory[retlist.size()];
		int idx = 0;
		for (SecureJpaSecUserPWHistory cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecUserPWHistory record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWHistory readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId,
		LocalDateTime argPWSetStamp )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecUserPWHistory retval = schema.getJpaHooksSchema().getSecUserPWHistoryService().find(argSecUserId,
		argPWSetStamp);
		return(retval);
	}

	/**
	 *	Read the derived SecUserPWHistory record instance identified by the unique key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWHistory readDerivedByUserIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId )
	{
		final String S_ProcName = "readDerivedByUserIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecUserPWHistory retval = schema.getJpaHooksSchema().getSecUserPWHistoryService().findByUserIdx(argSecUserId);
		return(retval);
	}

	/**
	 *	Read the derived SecUserPWHistory record instance identified by the unique key SetStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWHistory readDerivedBySetStampIdx( ISecureAuthorization Authorization,
		LocalDateTime argPWSetStamp )
	{
		final String S_ProcName = "readDerivedBySetStampIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecUserPWHistory retval = schema.getJpaHooksSchema().getSecUserPWHistoryService().findBySetStampIdx(argPWSetStamp);
		return(retval);
	}

	/**
	 *	Read the derived SecUserPWHistory record instance identified by the unique key ReplacedStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PWReplacedStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWHistory readDerivedByReplacedStampIdx( ISecureAuthorization Authorization,
		LocalDateTime argPWReplacedStamp )
	{
		final String S_ProcName = "readDerivedByReplacedStampIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecUserPWHistory retval = schema.getJpaHooksSchema().getSecUserPWHistoryService().findByReplacedStampIdx(argPWReplacedStamp);
		return(retval);
	}

	/**
	 *	Read the specific SecUserPWHistory record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserPWHistory instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWHistory readRec( ISecureAuthorization Authorization,
		ISecureSecUserPWHistoryPKey PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Read the specific SecUserPWHistory record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserPWHistory instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWHistory readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId,
		LocalDateTime argPWSetStamp )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec-args");
	}

	/**
	 *	Lock the specific SecUserPWHistory record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserPWHistory instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWHistory lockRec( ISecureAuthorization Authorization,
		ISecureSecUserPWHistoryPKey PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecUserPWHistory record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecUserPWHistory instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecUserPWHistory[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecUserPWHistory record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWHistory readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId,
		LocalDateTime argPWSetStamp )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific SecUserPWHistory record instance identified by the unique key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWHistory readRecByUserIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId )
	{
		final String S_ProcName = "readRecByUserIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUserIdx");
	}

	/**
	 *	Read the specific SecUserPWHistory record instance identified by the unique key SetStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWHistory readRecBySetStampIdx( ISecureAuthorization Authorization,
		LocalDateTime argPWSetStamp )
	{
		final String S_ProcName = "readRecBySetStampIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySetStampIdx");
	}

	/**
	 *	Read the specific SecUserPWHistory record instance identified by the unique key ReplacedStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PWReplacedStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWHistory readRecByReplacedStampIdx( ISecureAuthorization Authorization,
		LocalDateTime argPWReplacedStamp )
	{
		final String S_ProcName = "readRecByReplacedStampIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWHistory(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwhistory", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWHistoryTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByReplacedStampIdx");
	}
}
