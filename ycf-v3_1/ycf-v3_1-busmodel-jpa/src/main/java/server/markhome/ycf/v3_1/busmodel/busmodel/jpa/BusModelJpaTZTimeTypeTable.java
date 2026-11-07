
// Description: Java 25 DbIO implementation for TZTimeType.

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
 *	BusModelJpaTZTimeTypeTable database implementation for TZTimeType
 */
public class BusModelJpaTZTimeTypeTable implements IBusModelTZTimeTypeTable
{
	protected BusModelJpaSchema schema;


	public BusModelJpaTZTimeTypeTable(IBusModelSchema schema) {
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

	protected boolean canCreateTZTimeType(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "createtztimetype");
		}
		return( permissionGranted );
	}

	protected boolean canReadTZTimeType(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "readtztimetype");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateTZTimeType(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "updatetztimetype");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteTZTimeType(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "deletetztimetype");
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
	public IBusModelTZTimeType createTZTimeType( ISecureAuthorization Authorization,
		IBusModelTZTimeType rec )
	{
		final String S_ProcName = "createTZTimeType";
		boolean permissionGranted = canCreateTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createTZTimeType", 1, "rec");
		}
		else if (rec instanceof BusModelJpaTZTimeType) {
			BusModelJpaTZTimeType jparec = (BusModelJpaTZTimeType)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaTZTimeType retval = schema.getJpaHooksSchema().getTZTimeTypeService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createTZTimeType", "rec", rec, "BusModelJpaTZTimeType");
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
	public IBusModelTZTimeType updateTZTimeType( ISecureAuthorization Authorization,
		IBusModelTZTimeType rec )
	{
		final String S_ProcName = "updateTZTimeType";
		boolean permissionGranted = canUpdateTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateTZTimeType", 1, "rec");
		}
		else if (rec instanceof BusModelJpaTZTimeType) {
			BusModelJpaTZTimeType jparec = (BusModelJpaTZTimeType)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaTZTimeType retval = schema.getJpaHooksSchema().getTZTimeTypeService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateTZTimeType", "rec", rec, "BusModelJpaTZTimeType");
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
	public void deleteTZTimeType( ISecureAuthorization Authorization,
		IBusModelTZTimeType rec )
	{
		final String S_ProcName = "deleteTZTimeType";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof BusModelJpaTZTimeType) {
			BusModelJpaTZTimeType jparec = (BusModelJpaTZTimeType)rec;
			schema.getJpaHooksSchema().getTZTimeTypeService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteTZTimeType", "rec", rec, "BusModelJpaTZTimeType");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteTZTimeType");
	}

	/**
	 *	Delete the TZTimeType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TZTimeType key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTZTimeTypeBySchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSchemaDefId )
	{
		final String S_ProcName = "deleteTZTimeTypeBySchemaIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteBySchemaIdx(argSchemaDefId);
	}


	/**
	 *	Delete the TZTimeType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTZTimeTypeBySchemaIdx( ISecureAuthorization Authorization,
		IBusModelTZTimeTypeBySchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteTZTimeTypeBySchemaIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteBySchemaIdx(argKey.getRequiredSchemaDefId());
	}

	/**
	 *	Delete the TZTimeType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteTZTimeTypeByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteTZTimeTypeByIdIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the TZTimeType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeType key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTZTimeTypeByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName )
	{
		final String S_ProcName = "deleteTZTimeTypeByUNameIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByUNameIdx(argScopeId,
		argName);
	}


	/**
	 *	Delete the TZTimeType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTZTimeTypeByUNameIdx( ISecureAuthorization Authorization,
		IBusModelValueByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteTZTimeTypeByUNameIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByUNameIdx(argKey.getRequiredScopeId(),
			argKey.getRequiredName());
	}

	/**
	 *	Delete the TZTimeType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTZTimeTypeByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId )
	{
		final String S_ProcName = "deleteTZTimeTypeByScopeIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByScopeIdx(argScopeId);
	}


	/**
	 *	Delete the TZTimeType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTZTimeTypeByScopeIdx( ISecureAuthorization Authorization,
		IBusModelValueByScopeIdxKey argKey )
	{
		final String S_ProcName = "deleteTZTimeTypeByScopeIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByScopeIdx(argKey.getRequiredScopeId());
	}

	/**
	 *	Delete the TZTimeType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TZTimeType key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTZTimeTypeByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "deleteTZTimeTypeByDefSchemaIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByDefSchemaIdx(argDefSchemaId);
	}


	/**
	 *	Delete the TZTimeType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTZTimeTypeByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelValueByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteTZTimeTypeByDefSchemaIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByDefSchemaIdx(argKey.getOptionalDefSchemaId());
	}

	/**
	 *	Delete the TZTimeType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TZTimeType key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTZTimeTypeByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "deleteTZTimeTypeByPrevIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByPrevIdx(argPrevId);
	}


	/**
	 *	Delete the TZTimeType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTZTimeTypeByPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByPrevIdxKey argKey )
	{
		final String S_ProcName = "deleteTZTimeTypeByPrevIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByPrevIdx(argKey.getOptionalPrevId());
	}

	/**
	 *	Delete the TZTimeType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TZTimeType key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTZTimeTypeByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "deleteTZTimeTypeByNextIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByNextIdx(argNextId);
	}


	/**
	 *	Delete the TZTimeType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTZTimeTypeByNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByNextIdxKey argKey )
	{
		final String S_ProcName = "deleteTZTimeTypeByNextIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByNextIdx(argKey.getOptionalNextId());
	}

	/**
	 *	Delete the TZTimeType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeType key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTZTimeTypeByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "deleteTZTimeTypeByContPrevIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByContPrevIdx(argScopeId,
		argPrevId);
	}


	/**
	 *	Delete the TZTimeType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTZTimeTypeByContPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByContPrevIdxKey argKey )
	{
		final String S_ProcName = "deleteTZTimeTypeByContPrevIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByContPrevIdx(argKey.getRequiredScopeId(),
			argKey.getOptionalPrevId());
	}

	/**
	 *	Delete the TZTimeType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeType key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTZTimeTypeByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "deleteTZTimeTypeByContNextIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByContNextIdx(argScopeId,
		argNextId);
	}


	/**
	 *	Delete the TZTimeType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTZTimeTypeByContNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByContNextIdxKey argKey )
	{
		final String S_ProcName = "deleteTZTimeTypeByContNextIdx";
		boolean permissionGranted = canDeleteTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTZTimeTypeService().deleteByContNextIdx(argKey.getRequiredScopeId(),
			argKey.getOptionalNextId());
	}


	/**
	 *	Read the derived TZTimeType record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimeType instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelTZTimeType readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelTZTimeType retval = schema.getJpaHooksSchema().getTZTimeTypeService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived TZTimeType record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimeType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelTZTimeType lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelTZTimeType retval = schema.getJpaHooksSchema().getTZTimeTypeService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all TZTimeType instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelTZTimeType[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<BusModelJpaTZTimeType> retlist = schema.getJpaHooksSchema().getTZTimeTypeService().findAll();
		IBusModelTZTimeType[] retset = new IBusModelTZTimeType[retlist.size()];
		int idx = 0;
		for (BusModelJpaTZTimeType cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived TZTimeType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelTZTimeType readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelTZTimeType retval = schema.getJpaHooksSchema().getTZTimeTypeService().find(argId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredContainerSchemaDef().getRequiredOwnerCTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readtztimetype")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the derived TZTimeType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelTZTimeType readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelTZTimeType retval = schema.getJpaHooksSchema().getTZTimeTypeService().findByUNameIdx(argScopeId,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredContainerSchemaDef().getRequiredOwnerCTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readtztimetype")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived TZTimeType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelTZTimeType[] readDerivedByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId )
	{
		final String S_ProcName = "readDerivedByScopeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaTZTimeType> retlist = schema.getJpaHooksSchema().getTZTimeTypeService().findByScopeIdx(argScopeId);
		IBusModelTZTimeType[] retset = new IBusModelTZTimeType[retlist.size()];
		int idx = 0;
		for (BusModelJpaTZTimeType cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived TZTimeType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelTZTimeType[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readDerivedByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaTZTimeType> retlist = schema.getJpaHooksSchema().getTZTimeTypeService().findByDefSchemaIdx(argDefSchemaId);
		IBusModelTZTimeType[] retset = new IBusModelTZTimeType[retlist.size()];
		int idx = 0;
		for (BusModelJpaTZTimeType cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived TZTimeType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelTZTimeType[] readDerivedByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "readDerivedByPrevIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaTZTimeType> retlist = schema.getJpaHooksSchema().getTZTimeTypeService().findByPrevIdx(argPrevId);
		IBusModelTZTimeType[] retset = new IBusModelTZTimeType[retlist.size()];
		int idx = 0;
		for (BusModelJpaTZTimeType cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived TZTimeType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelTZTimeType[] readDerivedByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "readDerivedByNextIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaTZTimeType> retlist = schema.getJpaHooksSchema().getTZTimeTypeService().findByNextIdx(argNextId);
		IBusModelTZTimeType[] retset = new IBusModelTZTimeType[retlist.size()];
		int idx = 0;
		for (BusModelJpaTZTimeType cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived TZTimeType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelTZTimeType[] readDerivedByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "readDerivedByContPrevIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaTZTimeType> retlist = schema.getJpaHooksSchema().getTZTimeTypeService().findByContPrevIdx(argScopeId,
		argPrevId);
		IBusModelTZTimeType[] retset = new IBusModelTZTimeType[retlist.size()];
		int idx = 0;
		for (BusModelJpaTZTimeType cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived TZTimeType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelTZTimeType[] readDerivedByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "readDerivedByContNextIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaTZTimeType> retlist = schema.getJpaHooksSchema().getTZTimeTypeService().findByContNextIdx(argScopeId,
		argNextId);
		IBusModelTZTimeType[] retset = new IBusModelTZTimeType[retlist.size()];
		int idx = 0;
		for (BusModelJpaTZTimeType cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived TZTimeType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelTZTimeType[] readDerivedBySchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSchemaDefId )
	{
		final String S_ProcName = "readDerivedBySchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaTZTimeType> retlist = schema.getJpaHooksSchema().getTZTimeTypeService().findBySchemaIdx(argSchemaDefId);
		IBusModelTZTimeType[] retset = new IBusModelTZTimeType[retlist.size()];
		int idx = 0;
		for (BusModelJpaTZTimeType cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific TZTimeType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimeType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific TZTimeType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimeType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific TZTimeType record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TZTimeType instances in the database accessible for the Authorization.
	 */
	@Override
	public IBusModelTZTimeType[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific TZTimeType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific TZTimeType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}

	/**
	 *	Read an array of the specific TZTimeType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType[] readRecByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId )
	{
		final String S_ProcName = "readRecByScopeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByScopeIdx");
	}

	/**
	 *	Read an array of the specific TZTimeType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readRecByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDefSchemaIdx");
	}

	/**
	 *	Read an array of the specific TZTimeType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType[] readRecByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "readRecByPrevIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByPrevIdx");
	}

	/**
	 *	Read an array of the specific TZTimeType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType[] readRecByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "readRecByNextIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByNextIdx");
	}

	/**
	 *	Read an array of the specific TZTimeType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType[] readRecByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argPrevId )
	{
		final String S_ProcName = "readRecByContPrevIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByContPrevIdx");
	}

	/**
	 *	Read an array of the specific TZTimeType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType[] readRecByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argNextId )
	{
		final String S_ProcName = "readRecByContNextIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByContNextIdx");
	}

	/**
	 *	Read an array of the specific TZTimeType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelTZTimeType[] readRecBySchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSchemaDefId )
	{
		final String S_ProcName = "readRecBySchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTZTimeType(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySchemaIdx");
	}

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	@Override
	public IBusModelTZTimeType moveRecUp( ISecureAuthorization Authorization,
		ICFKeyHash256 argId,
		int revision )
	{
		final String S_ProcName = "moveRecUp";
		boolean permissionGranted = canUpdateTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "moveRecUp");
	}

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	@Override
	public IBusModelTZTimeType moveRecDown( ISecureAuthorization Authorization,
		ICFKeyHash256 argId,
		int revision )
	{
		final String S_ProcName = "moveRecDown";
		boolean permissionGranted = canUpdateTZTimeType(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetztimetype", IBusModelSchema.SCHEMA_NAME, IBusModelTZTimeTypeTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "moveRecDown");
	}
}
