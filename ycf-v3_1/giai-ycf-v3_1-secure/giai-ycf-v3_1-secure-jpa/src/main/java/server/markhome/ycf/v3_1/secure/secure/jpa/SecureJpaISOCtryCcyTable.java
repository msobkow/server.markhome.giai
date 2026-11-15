
// Description: Java 25 DbIO implementation for ISOCtryCcy.

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
 *	SecureJpaISOCtryCcyTable database implementation for ISOCtryCcy
 */
public class SecureJpaISOCtryCcyTable implements ISecureISOCtryCcyTable
{
	protected SecureJpaSchema schema;


	public SecureJpaISOCtryCcyTable(ISecureSchema schema) {
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

	protected boolean canCreateISOCtryCcy(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createisoctryccy");
		}
		return( permissionGranted );
	}

	protected boolean canReadISOCtryCcy(String S_ProcName, ISecureAuthorization Authorization) {
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
		// SecScope Global means anyone can read the table any time
		permissionGranted = true;
		return( permissionGranted );
	}

	protected boolean canUpdateISOCtryCcy(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updateisoctryccy");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteISOCtryCcy(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deleteisoctryccy");
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
	public ISecureISOCtryCcy createISOCtryCcy( ISecureAuthorization Authorization,
		ISecureISOCtryCcy rec )
	{
		final String S_ProcName = "createISOCtryCcy";
		boolean permissionGranted = canCreateISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createISOCtryCcy", 1, "rec");
		}
		else if (rec instanceof SecureJpaISOCtryCcy) {
			SecureJpaISOCtryCcy jparec = (SecureJpaISOCtryCcy)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaISOCtryCcy retval = schema.getJpaHooksSchema().getISOCtryCcyService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createISOCtryCcy", "rec", rec, "SecureJpaISOCtryCcy");
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
	public ISecureISOCtryCcy updateISOCtryCcy( ISecureAuthorization Authorization,
		ISecureISOCtryCcy rec )
	{
		final String S_ProcName = "updateISOCtryCcy";
		boolean permissionGranted = canUpdateISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateISOCtryCcy", 1, "rec");
		}
		else if (rec instanceof SecureJpaISOCtryCcy) {
			SecureJpaISOCtryCcy jparec = (SecureJpaISOCtryCcy)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaISOCtryCcy retval = schema.getJpaHooksSchema().getISOCtryCcyService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateISOCtryCcy", "rec", rec, "SecureJpaISOCtryCcy");
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
	public void deleteISOCtryCcy( ISecureAuthorization Authorization,
		ISecureISOCtryCcy rec )
	{
		final String S_ProcName = "deleteISOCtryCcy";
		boolean permissionGranted = canDeleteISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaISOCtryCcy) {
			SecureJpaISOCtryCcy jparec = (SecureJpaISOCtryCcy)rec;
			schema.getJpaHooksSchema().getISOCtryCcyService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteISOCtryCcy", "rec", rec, "SecureJpaISOCtryCcy");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteISOCtryCcy");
	}

	/**
	 *	Delete the ISOCtryCcy instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	@Override
	public void deleteISOCtryCcyByIdIdx( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOCcyId )
	{
		final String S_ProcName = "deleteISOCtryCcyByIdIdx";
		boolean permissionGranted = canDeleteISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryCcyService().deleteByIdIdx(argISOCtryId,
		argISOCcyId);
	}

	/**
	 *	Delete the ISOCtryCcy instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteISOCtryCcyByIdIdx( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey argKey )
	{
		final String S_ProcName = "deleteISOCtryCcyByIdIdx";
		boolean permissionGranted = canDeleteISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryCcyService().deleteByIdIdx(argKey.getRequiredISOCtryId(),
			argKey.getRequiredISOCcyId());
	}

	/**
	 *	Delete the ISOCtryCcy instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	@Override
	public void deleteISOCtryCcyByCtryIdx( ISecureAuthorization Authorization,
		short argISOCtryId )
	{
		final String S_ProcName = "deleteISOCtryCcyByCtryIdx";
		boolean permissionGranted = canDeleteISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryCcyService().deleteByCtryIdx(argISOCtryId);
	}


	/**
	 *	Delete the ISOCtryCcy instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteISOCtryCcyByCtryIdx( ISecureAuthorization Authorization,
		ISecureISOCtryCcyByCtryIdxKey argKey )
	{
		final String S_ProcName = "deleteISOCtryCcyByCtryIdx";
		boolean permissionGranted = canDeleteISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryCcyService().deleteByCtryIdx(argKey.getRequiredISOCtryId());
	}

	/**
	 *	Delete the ISOCtryCcy instances identified by the key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	@Override
	public void deleteISOCtryCcyByCcyIdx( ISecureAuthorization Authorization,
		short argISOCcyId )
	{
		final String S_ProcName = "deleteISOCtryCcyByCcyIdx";
		boolean permissionGranted = canDeleteISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryCcyService().deleteByCcyIdx(argISOCcyId);
	}


	/**
	 *	Delete the ISOCtryCcy instances identified by the key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteISOCtryCcyByCcyIdx( ISecureAuthorization Authorization,
		ISecureISOCtryCcyByCcyIdxKey argKey )
	{
		final String S_ProcName = "deleteISOCtryCcyByCcyIdx";
		boolean permissionGranted = canDeleteISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryCcyService().deleteByCcyIdx(argKey.getRequiredISOCcyId());
	}


	/**
	 *	Read the derived ISOCtryCcy record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCtryCcy readDerived( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureISOCtryCcy retval = schema.getJpaHooksSchema().getISOCtryCcyService().find(PKey);
		return(retval);
	}

	/**
	 *	Read the derived ISOCtryCcy record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCtryCcy readDerived( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOCcyId )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureISOCtryCcy retval = schema.getJpaHooksSchema().getISOCtryCcyService().find(argISOCtryId,
		argISOCcyId);
		return(retval);
	}

	/**
	 *	Lock the derived ISOCtryCcy record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCtryCcy lockDerived( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureISOCtryCcy retval = schema.getJpaHooksSchema().getISOCtryCcyService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all ISOCtryCcy instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureISOCtryCcy[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaISOCtryCcy> retlist = schema.getJpaHooksSchema().getISOCtryCcyService().findAll();
		ISecureISOCtryCcy[] retset = new ISecureISOCtryCcy[retlist.size()];
		int idx = 0;
		for (SecureJpaISOCtryCcy cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived ISOCtryCcy record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCtryCcy readDerivedByIdIdx( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOCcyId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureISOCtryCcy retval = schema.getJpaHooksSchema().getISOCtryCcyService().find(argISOCtryId,
		argISOCcyId);
		return(retval);
	}

	/**
	 *	Read an array of the derived ISOCtryCcy record instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureISOCtryCcy[] readDerivedByCtryIdx( ISecureAuthorization Authorization,
		short argISOCtryId )
	{
		final String S_ProcName = "readDerivedByCtryIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaISOCtryCcy> retlist = schema.getJpaHooksSchema().getISOCtryCcyService().findByCtryIdx(argISOCtryId);
		ISecureISOCtryCcy[] retset = new ISecureISOCtryCcy[retlist.size()];
		int idx = 0;
		for (SecureJpaISOCtryCcy cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived ISOCtryCcy record instances identified by the duplicate key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureISOCtryCcy[] readDerivedByCcyIdx( ISecureAuthorization Authorization,
		short argISOCcyId )
	{
		final String S_ProcName = "readDerivedByCcyIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaISOCtryCcy> retlist = schema.getJpaHooksSchema().getISOCtryCcyService().findByCcyIdx(argISOCcyId);
		ISecureISOCtryCcy[] retset = new ISecureISOCtryCcy[retlist.size()];
		int idx = 0;
		for (SecureJpaISOCtryCcy cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryCcy readRec( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Read the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryCcy readRec( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOCcyId )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec-args");
	}

	/**
	 *	Lock the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryCcy lockRec( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific ISOCtryCcy record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCtryCcy instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureISOCtryCcy[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific ISOCtryCcy record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryCcy readRecByIdIdx( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOCcyId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific ISOCtryCcy record instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryCcy[] readRecByCtryIdx( ISecureAuthorization Authorization,
		short argISOCtryId )
	{
		final String S_ProcName = "readRecByCtryIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByCtryIdx");
	}

	/**
	 *	Read an array of the specific ISOCtryCcy record instances identified by the duplicate key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryCcy[] readRecByCcyIdx( ISecureAuthorization Authorization,
		short argISOCcyId )
	{
		final String S_ProcName = "readRecByCcyIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctryccy", ISecureSchema.SCHEMA_NAME, ISecureISOCtryCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByCcyIdx");
	}
}
