
// Description: Java 25 DbIO implementation for Int16Def.

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

package server.markhome.ycf.v3_1.busmodel.busmodel.jpa;

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
import server.markhome.ycf.v3_1.busmodel.busmodel.jpa.BusModelJpaHooksSchema;

/*
 *	BusModelJpaInt16DefTable database implementation for Int16Def
 */
public class BusModelJpaInt16DefTable implements IBusModelInt16DefTable
{
	protected BusModelJpaSchema schema;


	public BusModelJpaInt16DefTable(IBusModelSchema schema) {
		if( schema == null ) {
			throw new CFNullArgumentException(getClass(), "constructor", 1, "schema" );
		}
		if (schema instanceof BusModelJpaSchema) {
			this.schema = (BusModelJpaSchema)schema;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "constructor", "schema", schema, "BusModelJpaSchema");
		}
	}

	protected boolean canCreateInt16Def(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "createint16def");
		}
		return( permissionGranted );
	}

	protected boolean canReadInt16Def(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "readint16def");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateInt16Def(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "updateint16def");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteInt16Def(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "deleteint16def");
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
	public IBusModelInt16Def createInt16Def( ISecureAuthorization Authorization,
		IBusModelInt16Def rec )
	{
		final String S_ProcName = "createInt16Def";
		boolean permissionGranted = canCreateInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createInt16Def", 1, "rec");
		}
		else if (rec instanceof BusModelJpaInt16Def) {
			BusModelJpaInt16Def jparec = (BusModelJpaInt16Def)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaInt16Def retval = schema.getJpaHooksSchema().getInt16DefService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createInt16Def", "rec", rec, "BusModelJpaInt16Def");
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
	public IBusModelInt16Def updateInt16Def( ISecureAuthorization Authorization,
		IBusModelInt16Def rec )
	{
		final String S_ProcName = "updateInt16Def";
		boolean permissionGranted = canUpdateInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateInt16Def", 1, "rec");
		}
		else if (rec instanceof BusModelJpaInt16Def) {
			BusModelJpaInt16Def jparec = (BusModelJpaInt16Def)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaInt16Def retval = schema.getJpaHooksSchema().getInt16DefService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateInt16Def", "rec", rec, "BusModelJpaInt16Def");
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
	public void deleteInt16Def( ISecureAuthorization Authorization,
		IBusModelInt16Def rec )
	{
		final String S_ProcName = "deleteInt16Def";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof BusModelJpaInt16Def) {
			BusModelJpaInt16Def jparec = (BusModelJpaInt16Def)rec;
			schema.getJpaHooksSchema().getInt16DefService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteInt16Def", "rec", rec, "BusModelJpaInt16Def");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteInt16Def");
	}

	/**
	 *	Delete the Int16Def instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteInt16DefByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteInt16DefByIdIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the Int16Def instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int16Def key attribute of the instance generating the id.
	 */
	@Override
	public void deleteInt16DefByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName )
	{
		final String S_ProcName = "deleteInt16DefByUNameIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByUNameIdx(argScopeId,
		argName);
	}


	/**
	 *	Delete the Int16Def instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteInt16DefByUNameIdx( ISecureAuthorization Authorization,
		IBusModelValueByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteInt16DefByUNameIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByUNameIdx(argKey.getRequiredScopeId(),
			argKey.getRequiredName());
	}

	/**
	 *	Delete the Int16Def instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 */
	@Override
	public void deleteInt16DefByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId )
	{
		final String S_ProcName = "deleteInt16DefByScopeIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByScopeIdx(argScopeId);
	}


	/**
	 *	Delete the Int16Def instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteInt16DefByScopeIdx( ISecureAuthorization Authorization,
		IBusModelValueByScopeIdxKey argKey )
	{
		final String S_ProcName = "deleteInt16DefByScopeIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByScopeIdx(argKey.getRequiredScopeId());
	}

	/**
	 *	Delete the Int16Def instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Int16Def key attribute of the instance generating the id.
	 */
	@Override
	public void deleteInt16DefByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "deleteInt16DefByDefSchemaIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByDefSchemaIdx(argDefSchemaId);
	}


	/**
	 *	Delete the Int16Def instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteInt16DefByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelValueByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteInt16DefByDefSchemaIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByDefSchemaIdx(argKey.getOptionalDefSchemaId());
	}

	/**
	 *	Delete the Int16Def instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The Int16Def key attribute of the instance generating the id.
	 */
	@Override
	public void deleteInt16DefByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "deleteInt16DefByPrevIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByPrevIdx(argPrevId);
	}


	/**
	 *	Delete the Int16Def instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteInt16DefByPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByPrevIdxKey argKey )
	{
		final String S_ProcName = "deleteInt16DefByPrevIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByPrevIdx(argKey.getOptionalPrevId());
	}

	/**
	 *	Delete the Int16Def instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The Int16Def key attribute of the instance generating the id.
	 */
	@Override
	public void deleteInt16DefByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "deleteInt16DefByNextIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByNextIdx(argNextId);
	}


	/**
	 *	Delete the Int16Def instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteInt16DefByNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByNextIdxKey argKey )
	{
		final String S_ProcName = "deleteInt16DefByNextIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByNextIdx(argKey.getOptionalNextId());
	}

	/**
	 *	Delete the Int16Def instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int16Def key attribute of the instance generating the id.
	 */
	@Override
	public void deleteInt16DefByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "deleteInt16DefByContPrevIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByContPrevIdx(argScopeId,
		argPrevId);
	}


	/**
	 *	Delete the Int16Def instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteInt16DefByContPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByContPrevIdxKey argKey )
	{
		final String S_ProcName = "deleteInt16DefByContPrevIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByContPrevIdx(argKey.getRequiredScopeId(),
			argKey.getOptionalPrevId());
	}

	/**
	 *	Delete the Int16Def instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int16Def key attribute of the instance generating the id.
	 */
	@Override
	public void deleteInt16DefByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "deleteInt16DefByContNextIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByContNextIdx(argScopeId,
		argNextId);
	}


	/**
	 *	Delete the Int16Def instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteInt16DefByContNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByContNextIdxKey argKey )
	{
		final String S_ProcName = "deleteInt16DefByContNextIdx";
		boolean permissionGranted = canDeleteInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getInt16DefService().deleteByContNextIdx(argKey.getRequiredScopeId(),
			argKey.getOptionalNextId());
	}


	/**
	 *	Read the derived Int16Def record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int16Def instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelInt16Def readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelInt16Def retval = schema.getJpaHooksSchema().getInt16DefService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived Int16Def record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int16Def instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelInt16Def lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelInt16Def retval = schema.getJpaHooksSchema().getInt16DefService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all Int16Def instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelInt16Def[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<BusModelJpaInt16Def> retlist = schema.getJpaHooksSchema().getInt16DefService().findAll();
		IBusModelInt16Def[] retset = new IBusModelInt16Def[retlist.size()];
		int idx = 0;
		for (BusModelJpaInt16Def cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived Int16Def record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelInt16Def readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelInt16Def retval = schema.getJpaHooksSchema().getInt16DefService().find(argId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredContainerScope().getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readint16def")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the derived Int16Def record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelInt16Def readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelInt16Def retval = schema.getJpaHooksSchema().getInt16DefService().findByUNameIdx(argScopeId,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredContainerScope().getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readint16def")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived Int16Def record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelInt16Def[] readDerivedByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId )
	{
		final String S_ProcName = "readDerivedByScopeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaInt16Def> retlist = schema.getJpaHooksSchema().getInt16DefService().findByScopeIdx(argScopeId);
		IBusModelInt16Def[] retset = new IBusModelInt16Def[retlist.size()];
		int idx = 0;
		for (BusModelJpaInt16Def cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived Int16Def record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelInt16Def[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readDerivedByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaInt16Def> retlist = schema.getJpaHooksSchema().getInt16DefService().findByDefSchemaIdx(argDefSchemaId);
		IBusModelInt16Def[] retset = new IBusModelInt16Def[retlist.size()];
		int idx = 0;
		for (BusModelJpaInt16Def cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived Int16Def record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelInt16Def[] readDerivedByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "readDerivedByPrevIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaInt16Def> retlist = schema.getJpaHooksSchema().getInt16DefService().findByPrevIdx(argPrevId);
		IBusModelInt16Def[] retset = new IBusModelInt16Def[retlist.size()];
		int idx = 0;
		for (BusModelJpaInt16Def cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived Int16Def record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelInt16Def[] readDerivedByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "readDerivedByNextIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaInt16Def> retlist = schema.getJpaHooksSchema().getInt16DefService().findByNextIdx(argNextId);
		IBusModelInt16Def[] retset = new IBusModelInt16Def[retlist.size()];
		int idx = 0;
		for (BusModelJpaInt16Def cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived Int16Def record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelInt16Def[] readDerivedByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "readDerivedByContPrevIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaInt16Def> retlist = schema.getJpaHooksSchema().getInt16DefService().findByContPrevIdx(argScopeId,
		argPrevId);
		IBusModelInt16Def[] retset = new IBusModelInt16Def[retlist.size()];
		int idx = 0;
		for (BusModelJpaInt16Def cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived Int16Def record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelInt16Def[] readDerivedByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "readDerivedByContNextIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaInt16Def> retlist = schema.getJpaHooksSchema().getInt16DefService().findByContNextIdx(argScopeId,
		argNextId);
		IBusModelInt16Def[] retset = new IBusModelInt16Def[retlist.size()];
		int idx = 0;
		for (BusModelJpaInt16Def cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific Int16Def record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int16Def instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific Int16Def record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Int16Def instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific Int16Def record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Int16Def instances in the database accessible for the Authorization.
	 */
	@Override
	public IBusModelInt16Def[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific Int16Def record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific Int16Def record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}

	/**
	 *	Read an array of the specific Int16Def record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def[] readRecByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId )
	{
		final String S_ProcName = "readRecByScopeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByScopeIdx");
	}

	/**
	 *	Read an array of the specific Int16Def record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readRecByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDefSchemaIdx");
	}

	/**
	 *	Read an array of the specific Int16Def record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def[] readRecByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "readRecByPrevIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByPrevIdx");
	}

	/**
	 *	Read an array of the specific Int16Def record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def[] readRecByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "readRecByNextIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByNextIdx");
	}

	/**
	 *	Read an array of the specific Int16Def record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def[] readRecByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "readRecByContPrevIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByContPrevIdx");
	}

	/**
	 *	Read an array of the specific Int16Def record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelInt16Def[] readRecByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "readRecByContNextIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadInt16Def(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByContNextIdx");
	}

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	@Override
	public IBusModelInt16Def moveRecUp( ISecureAuthorization Authorization,
		ICFKeyHash256 argId,
		int revision )
	{
		final String S_ProcName = "moveRecUp";
		boolean permissionGranted = canUpdateInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "moveRecUp");
	}

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	@Override
	public IBusModelInt16Def moveRecDown( ISecureAuthorization Authorization,
		ICFKeyHash256 argId,
		int revision )
	{
		final String S_ProcName = "moveRecDown";
		boolean permissionGranted = canUpdateInt16Def(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateint16def", IBusModelSchema.SCHEMA_NAME, IBusModelInt16DefTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "moveRecDown");
	}
}
