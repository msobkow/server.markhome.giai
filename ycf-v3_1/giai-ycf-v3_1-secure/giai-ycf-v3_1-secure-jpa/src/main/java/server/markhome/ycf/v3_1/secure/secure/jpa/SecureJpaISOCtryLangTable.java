
// Description: Java 25 DbIO implementation for ISOCtryLang.

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
 *	SecureJpaISOCtryLangTable database implementation for ISOCtryLang
 */
public class SecureJpaISOCtryLangTable implements ISecureISOCtryLangTable
{
	protected SecureJpaSchema schema;


	public SecureJpaISOCtryLangTable(ISecureSchema schema) {
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

	protected boolean canCreateISOCtryLang(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createisoctrylang");
		}
		return( permissionGranted );
	}

	protected boolean canReadISOCtryLang(String S_ProcName, ISecureAuthorization Authorization) {
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

	protected boolean canUpdateISOCtryLang(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updateisoctrylang");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteISOCtryLang(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deleteisoctrylang");
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
	public ISecureISOCtryLang createISOCtryLang( ISecureAuthorization Authorization,
		ISecureISOCtryLang rec )
	{
		final String S_ProcName = "createISOCtryLang";
		boolean permissionGranted = canCreateISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createISOCtryLang", 1, "rec");
		}
		else if (rec instanceof SecureJpaISOCtryLang) {
			SecureJpaISOCtryLang jparec = (SecureJpaISOCtryLang)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaISOCtryLang retval = schema.getJpaHooksSchema().getISOCtryLangService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createISOCtryLang", "rec", rec, "SecureJpaISOCtryLang");
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
	public ISecureISOCtryLang updateISOCtryLang( ISecureAuthorization Authorization,
		ISecureISOCtryLang rec )
	{
		final String S_ProcName = "updateISOCtryLang";
		boolean permissionGranted = canUpdateISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateISOCtryLang", 1, "rec");
		}
		else if (rec instanceof SecureJpaISOCtryLang) {
			SecureJpaISOCtryLang jparec = (SecureJpaISOCtryLang)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaISOCtryLang retval = schema.getJpaHooksSchema().getISOCtryLangService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateISOCtryLang", "rec", rec, "SecureJpaISOCtryLang");
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
	public void deleteISOCtryLang( ISecureAuthorization Authorization,
		ISecureISOCtryLang rec )
	{
		final String S_ProcName = "deleteISOCtryLang";
		boolean permissionGranted = canDeleteISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaISOCtryLang) {
			SecureJpaISOCtryLang jparec = (SecureJpaISOCtryLang)rec;
			schema.getJpaHooksSchema().getISOCtryLangService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteISOCtryLang", "rec", rec, "SecureJpaISOCtryLang");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteISOCtryLang");
	}

	/**
	 *	Delete the ISOCtryLang instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	@Override
	public void deleteISOCtryLangByIdIdx( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOLangId )
	{
		final String S_ProcName = "deleteISOCtryLangByIdIdx";
		boolean permissionGranted = canDeleteISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryLangService().deleteByIdIdx(argISOCtryId,
		argISOLangId);
	}

	/**
	 *	Delete the ISOCtryLang instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteISOCtryLangByIdIdx( ISecureAuthorization Authorization,
		ISecureISOCtryLangPKey argKey )
	{
		final String S_ProcName = "deleteISOCtryLangByIdIdx";
		boolean permissionGranted = canDeleteISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryLangService().deleteByIdIdx(argKey.getRequiredISOCtryId(),
			argKey.getRequiredISOLangId());
	}

	/**
	 *	Delete the ISOCtryLang instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	@Override
	public void deleteISOCtryLangByCtryIdx( ISecureAuthorization Authorization,
		short argISOCtryId )
	{
		final String S_ProcName = "deleteISOCtryLangByCtryIdx";
		boolean permissionGranted = canDeleteISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryLangService().deleteByCtryIdx(argISOCtryId);
	}


	/**
	 *	Delete the ISOCtryLang instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteISOCtryLangByCtryIdx( ISecureAuthorization Authorization,
		ISecureISOCtryLangByCtryIdxKey argKey )
	{
		final String S_ProcName = "deleteISOCtryLangByCtryIdx";
		boolean permissionGranted = canDeleteISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryLangService().deleteByCtryIdx(argKey.getRequiredISOCtryId());
	}

	/**
	 *	Delete the ISOCtryLang instances identified by the key LangIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	@Override
	public void deleteISOCtryLangByLangIdx( ISecureAuthorization Authorization,
		short argISOLangId )
	{
		final String S_ProcName = "deleteISOCtryLangByLangIdx";
		boolean permissionGranted = canDeleteISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryLangService().deleteByLangIdx(argISOLangId);
	}


	/**
	 *	Delete the ISOCtryLang instances identified by the key LangIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteISOCtryLangByLangIdx( ISecureAuthorization Authorization,
		ISecureISOCtryLangByLangIdxKey argKey )
	{
		final String S_ProcName = "deleteISOCtryLangByLangIdx";
		boolean permissionGranted = canDeleteISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCtryLangService().deleteByLangIdx(argKey.getRequiredISOLangId());
	}


	/**
	 *	Read the derived ISOCtryLang record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryLang instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCtryLang readDerived( ISecureAuthorization Authorization,
		ISecureISOCtryLangPKey PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureISOCtryLang retval = schema.getJpaHooksSchema().getISOCtryLangService().find(PKey);
		return(retval);
	}

	/**
	 *	Read the derived ISOCtryLang record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCtryLang readDerived( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOLangId )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureISOCtryLang retval = schema.getJpaHooksSchema().getISOCtryLangService().find(argISOCtryId,
		argISOLangId);
		return(retval);
	}

	/**
	 *	Lock the derived ISOCtryLang record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryLang instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCtryLang lockDerived( ISecureAuthorization Authorization,
		ISecureISOCtryLangPKey PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureISOCtryLang retval = schema.getJpaHooksSchema().getISOCtryLangService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all ISOCtryLang instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureISOCtryLang[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaISOCtryLang> retlist = schema.getJpaHooksSchema().getISOCtryLangService().findAll();
		ISecureISOCtryLang[] retset = new ISecureISOCtryLang[retlist.size()];
		int idx = 0;
		for (SecureJpaISOCtryLang cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived ISOCtryLang record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCtryLang readDerivedByIdIdx( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOLangId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureISOCtryLang retval = schema.getJpaHooksSchema().getISOCtryLangService().find(argISOCtryId,
		argISOLangId);
		return(retval);
	}

	/**
	 *	Read an array of the derived ISOCtryLang record instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureISOCtryLang[] readDerivedByCtryIdx( ISecureAuthorization Authorization,
		short argISOCtryId )
	{
		final String S_ProcName = "readDerivedByCtryIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaISOCtryLang> retlist = schema.getJpaHooksSchema().getISOCtryLangService().findByCtryIdx(argISOCtryId);
		ISecureISOCtryLang[] retset = new ISecureISOCtryLang[retlist.size()];
		int idx = 0;
		for (SecureJpaISOCtryLang cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived ISOCtryLang record instances identified by the duplicate key LangIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureISOCtryLang[] readDerivedByLangIdx( ISecureAuthorization Authorization,
		short argISOLangId )
	{
		final String S_ProcName = "readDerivedByLangIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaISOCtryLang> retlist = schema.getJpaHooksSchema().getISOCtryLangService().findByLangIdx(argISOLangId);
		ISecureISOCtryLang[] retset = new ISecureISOCtryLang[retlist.size()];
		int idx = 0;
		for (SecureJpaISOCtryLang cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific ISOCtryLang record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryLang instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryLang readRec( ISecureAuthorization Authorization,
		ISecureISOCtryLangPKey PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Read the specific ISOCtryLang record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryLang instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryLang readRec( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOLangId )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec-args");
	}

	/**
	 *	Lock the specific ISOCtryLang record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryLang instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryLang lockRec( ISecureAuthorization Authorization,
		ISecureISOCtryLangPKey PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific ISOCtryLang record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCtryLang instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureISOCtryLang[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific ISOCtryLang record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryLang readRecByIdIdx( ISecureAuthorization Authorization,
		short argISOCtryId,
		short argISOLangId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific ISOCtryLang record instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryLang[] readRecByCtryIdx( ISecureAuthorization Authorization,
		short argISOCtryId )
	{
		final String S_ProcName = "readRecByCtryIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByCtryIdx");
	}

	/**
	 *	Read an array of the specific ISOCtryLang record instances identified by the duplicate key LangIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCtryLang[] readRecByLangIdx( ISecureAuthorization Authorization,
		short argISOLangId )
	{
		final String S_ProcName = "readRecByLangIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCtryLang(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoctrylang", ISecureSchema.SCHEMA_NAME, ISecureISOCtryLangTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByLangIdx");
	}
}
