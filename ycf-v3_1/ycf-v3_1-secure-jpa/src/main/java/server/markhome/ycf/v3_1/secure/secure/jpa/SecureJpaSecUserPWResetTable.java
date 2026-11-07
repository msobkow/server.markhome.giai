
// Description: Java 25 DbIO implementation for SecUserPWReset.

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
 *	SecureJpaSecUserPWResetTable database implementation for SecUserPWReset
 */
public class SecureJpaSecUserPWResetTable implements ISecureSecUserPWResetTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecUserPWResetTable(ISecureSchema schema) {
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

	protected boolean canCreateSecUserPWReset(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createsecuserpwreset");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecUserPWReset(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readsecuserpwreset");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecUserPWReset(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatesecuserpwreset");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecUserPWReset(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletesecuserpwreset");
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
	public ISecureSecUserPWReset createSecUserPWReset( ISecureAuthorization Authorization,
		ISecureSecUserPWReset rec )
	{
		final String S_ProcName = "createSecUserPWReset";
		boolean permissionGranted = canCreateSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecUserPWReset", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecUserPWReset) {
			SecureJpaSecUserPWReset jparec = (SecureJpaSecUserPWReset)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecUserPWReset retval = schema.getJpaHooksSchema().getSecUserPWResetService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecUserPWReset", "rec", rec, "SecureJpaSecUserPWReset");
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
	public ISecureSecUserPWReset updateSecUserPWReset( ISecureAuthorization Authorization,
		ISecureSecUserPWReset rec )
	{
		final String S_ProcName = "updateSecUserPWReset";
		boolean permissionGranted = canUpdateSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecUserPWReset", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecUserPWReset) {
			SecureJpaSecUserPWReset jparec = (SecureJpaSecUserPWReset)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecUserPWReset retval = schema.getJpaHooksSchema().getSecUserPWResetService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecUserPWReset", "rec", rec, "SecureJpaSecUserPWReset");
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
	public void deleteSecUserPWReset( ISecureAuthorization Authorization,
		ISecureSecUserPWReset rec )
	{
		final String S_ProcName = "deleteSecUserPWReset";
		boolean permissionGranted = canDeleteSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecUserPWReset) {
			SecureJpaSecUserPWReset jparec = (SecureJpaSecUserPWReset)rec;
			schema.getJpaHooksSchema().getSecUserPWResetService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecUserPWReset", "rec", rec, "SecureJpaSecUserPWReset");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecUserPWReset");
	}

	/**
	 *	Delete the SecUserPWReset instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecUserPWResetByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteSecUserPWResetByIdIdx";
		boolean permissionGranted = canDeleteSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWResetService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the SecUserPWReset instances identified by the key UUuid6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PasswordResetUuid6	The SecUserPWReset key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserPWResetByUUuid6Idx( ISecureAuthorization Authorization,
		ICFUuid6 argPasswordResetUuid6 )
	{
		final String S_ProcName = "deleteSecUserPWResetByUUuid6Idx";
		boolean permissionGranted = canDeleteSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWResetService().deleteByUUuid6Idx(argPasswordResetUuid6);
	}


	/**
	 *	Delete the SecUserPWReset instances identified by the key UUuid6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserPWResetByUUuid6Idx( ISecureAuthorization Authorization,
		ISecureSecUserPWResetByUUuid6IdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserPWResetByUUuid6Idx";
		boolean permissionGranted = canDeleteSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWResetService().deleteByUUuid6Idx(argKey.getRequiredPasswordResetUuid6());
	}

	/**
	 *	Delete the SecUserPWReset instances identified by the key SentEMAddrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SentToEMailAddr	The SecUserPWReset key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserPWResetBySentEMAddrIdx( ISecureAuthorization Authorization,
		String argSentToEMailAddr )
	{
		final String S_ProcName = "deleteSecUserPWResetBySentEMAddrIdx";
		boolean permissionGranted = canDeleteSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWResetService().deleteBySentEMAddrIdx(argSentToEMailAddr);
	}


	/**
	 *	Delete the SecUserPWReset instances identified by the key SentEMAddrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserPWResetBySentEMAddrIdx( ISecureAuthorization Authorization,
		ISecureSecUserPWResetBySentEMAddrIdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserPWResetBySentEMAddrIdx";
		boolean permissionGranted = canDeleteSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWResetService().deleteBySentEMAddrIdx(argKey.getRequiredSentToEMailAddr());
	}

	/**
	 *	Delete the SecUserPWReset instances identified by the key NewAcctIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NewAccount	The SecUserPWReset key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserPWResetByNewAcctIdx( ISecureAuthorization Authorization,
		boolean argNewAccount )
	{
		final String S_ProcName = "deleteSecUserPWResetByNewAcctIdx";
		boolean permissionGranted = canDeleteSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWResetService().deleteByNewAcctIdx(argNewAccount);
	}


	/**
	 *	Delete the SecUserPWReset instances identified by the key NewAcctIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserPWResetByNewAcctIdx( ISecureAuthorization Authorization,
		ISecureSecUserPWResetByNewAcctIdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserPWResetByNewAcctIdx";
		boolean permissionGranted = canDeleteSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserPWResetService().deleteByNewAcctIdx(argKey.getRequiredNewAccount());
	}


	/**
	 *	Read the derived SecUserPWReset record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserPWReset instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWReset readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecUserPWReset retval = schema.getJpaHooksSchema().getSecUserPWResetService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived SecUserPWReset record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserPWReset instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWReset lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecUserPWReset retval = schema.getJpaHooksSchema().getSecUserPWResetService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecUserPWReset instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecUserPWReset[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecUserPWReset> retlist = schema.getJpaHooksSchema().getSecUserPWResetService().findAll();
		ISecureSecUserPWReset[] retset = new ISecureSecUserPWReset[retlist.size()];
		int idx = 0;
		for (SecureJpaSecUserPWReset cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecUserPWReset record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWReset readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecUserPWReset retval = schema.getJpaHooksSchema().getSecUserPWResetService().find(argSecUserId);
		return(retval);
	}

	/**
	 *	Read the derived SecUserPWReset record instance identified by the unique key UUuid6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PasswordResetUuid6	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserPWReset readDerivedByUUuid6Idx( ISecureAuthorization Authorization,
		ICFUuid6 argPasswordResetUuid6 )
	{
		final String S_ProcName = "readDerivedByUUuid6Idx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecUserPWReset retval = schema.getJpaHooksSchema().getSecUserPWResetService().findByUUuid6Idx(argPasswordResetUuid6);
		return(retval);
	}

	/**
	 *	Read an array of the derived SecUserPWReset record instances identified by the duplicate key SentEMAddrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SentToEMailAddr	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecUserPWReset[] readDerivedBySentEMAddrIdx( ISecureAuthorization Authorization,
		String argSentToEMailAddr )
	{
		final String S_ProcName = "readDerivedBySentEMAddrIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecUserPWReset> retlist = schema.getJpaHooksSchema().getSecUserPWResetService().findBySentEMAddrIdx(argSentToEMailAddr);
		ISecureSecUserPWReset[] retset = new ISecureSecUserPWReset[retlist.size()];
		int idx = 0;
		for (SecureJpaSecUserPWReset cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecUserPWReset record instances identified by the duplicate key NewAcctIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NewAccount	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecUserPWReset[] readDerivedByNewAcctIdx( ISecureAuthorization Authorization,
		boolean argNewAccount )
	{
		final String S_ProcName = "readDerivedByNewAcctIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecUserPWReset> retlist = schema.getJpaHooksSchema().getSecUserPWResetService().findByNewAcctIdx(argNewAccount);
		ISecureSecUserPWReset[] retset = new ISecureSecUserPWReset[retlist.size()];
		int idx = 0;
		for (SecureJpaSecUserPWReset cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SecUserPWReset record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserPWReset instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWReset readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific SecUserPWReset record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserPWReset instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWReset lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecUserPWReset record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecUserPWReset instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecUserPWReset[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecUserPWReset record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWReset readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific SecUserPWReset record instance identified by the unique key UUuid6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PasswordResetUuid6	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWReset readRecByUUuid6Idx( ISecureAuthorization Authorization,
		ICFUuid6 argPasswordResetUuid6 )
	{
		final String S_ProcName = "readRecByUUuid6Idx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUUuid6Idx");
	}

	/**
	 *	Read an array of the specific SecUserPWReset record instances identified by the duplicate key SentEMAddrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SentToEMailAddr	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWReset[] readRecBySentEMAddrIdx( ISecureAuthorization Authorization,
		String argSentToEMailAddr )
	{
		final String S_ProcName = "readRecBySentEMAddrIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySentEMAddrIdx");
	}

	/**
	 *	Read an array of the specific SecUserPWReset record instances identified by the duplicate key NewAcctIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NewAccount	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserPWReset[] readRecByNewAcctIdx( ISecureAuthorization Authorization,
		boolean argNewAccount )
	{
		final String S_ProcName = "readRecByNewAcctIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserPWReset(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuserpwreset", ISecureSchema.SCHEMA_NAME, ISecureSecUserPWResetTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByNewAcctIdx");
	}
}
