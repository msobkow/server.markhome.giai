
// Description: Java 25 DbIO implementation for ClearSubDep1.

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

package server.markhome.ycf.v3_1.intnet.intnet.jpa;

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
import server.markhome.ycf.v3_1.intnet.intnet.jpa.BusModelJpaHooksSchema;

/*
 *	BusModelJpaClearSubDep1Table database implementation for ClearSubDep1
 */
public class BusModelJpaClearSubDep1Table implements IBusModelClearSubDep1Table
{
	protected BusModelJpaSchema schema;


	public BusModelJpaClearSubDep1Table(IBusModelSchema schema) {
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

	protected boolean canCreateClearSubDep1(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "createclearsubdep1");
		}
		return( permissionGranted );
	}

	protected boolean canReadClearSubDep1(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "readclearsubdep1");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateClearSubDep1(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "updateclearsubdep1");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteClearSubDep1(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "deleteclearsubdep1");
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
	public IBusModelClearSubDep1 createClearSubDep1( ISecureAuthorization Authorization,
		IBusModelClearSubDep1 rec )
	{
		final String S_ProcName = "createClearSubDep1";
		boolean permissionGranted = canCreateClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createClearSubDep1", 1, "rec");
		}
		else if (rec instanceof BusModelJpaClearSubDep1) {
			BusModelJpaClearSubDep1 jparec = (BusModelJpaClearSubDep1)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaClearSubDep1 retval = schema.getJpaHooksSchema().getClearSubDep1Service().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createClearSubDep1", "rec", rec, "BusModelJpaClearSubDep1");
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
	public IBusModelClearSubDep1 updateClearSubDep1( ISecureAuthorization Authorization,
		IBusModelClearSubDep1 rec )
	{
		final String S_ProcName = "updateClearSubDep1";
		boolean permissionGranted = canUpdateClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateClearSubDep1", 1, "rec");
		}
		else if (rec instanceof BusModelJpaClearSubDep1) {
			BusModelJpaClearSubDep1 jparec = (BusModelJpaClearSubDep1)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaClearSubDep1 retval = schema.getJpaHooksSchema().getClearSubDep1Service().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateClearSubDep1", "rec", rec, "BusModelJpaClearSubDep1");
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
	public void deleteClearSubDep1( ISecureAuthorization Authorization,
		IBusModelClearSubDep1 rec )
	{
		final String S_ProcName = "deleteClearSubDep1";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof BusModelJpaClearSubDep1) {
			BusModelJpaClearSubDep1 jparec = (BusModelJpaClearSubDep1)rec;
			schema.getJpaHooksSchema().getClearSubDep1Service().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteClearSubDep1", "rec", rec, "BusModelJpaClearSubDep1");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteClearSubDep1");
	}

	/**
	 *	Delete the ClearSubDep1 instances identified by the key ClearTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteClearSubDep1ByClearTopDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClearTopDepId )
	{
		final String S_ProcName = "deleteClearSubDep1ByClearTopDepIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByClearTopDepIdx(argClearTopDepId);
	}


	/**
	 *	Delete the ClearSubDep1 instances identified by the key ClearTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteClearSubDep1ByClearTopDepIdx( ISecureAuthorization Authorization,
		IBusModelClearSubDep1ByClearTopDepIdxKey argKey )
	{
		final String S_ProcName = "deleteClearSubDep1ByClearTopDepIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByClearTopDepIdx(argKey.getRequiredClearTopDepId());
	}

	/**
	 *	Delete the ClearSubDep1 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteClearSubDep1ByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClearTopDepId,
		String argName )
	{
		final String S_ProcName = "deleteClearSubDep1ByUNameIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByUNameIdx(argClearTopDepId,
		argName);
	}


	/**
	 *	Delete the ClearSubDep1 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteClearSubDep1ByUNameIdx( ISecureAuthorization Authorization,
		IBusModelClearSubDep1ByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteClearSubDep1ByUNameIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByUNameIdx(argKey.getRequiredClearTopDepId(),
			argKey.getRequiredName());
	}

	/**
	 *	Delete the ClearSubDep1 instances identified by the key ClearDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteClearSubDep1ByClearDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId )
	{
		final String S_ProcName = "deleteClearSubDep1ByClearDepIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByClearDepIdx(argRelationId);
	}


	/**
	 *	Delete the ClearSubDep1 instances identified by the key ClearDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteClearSubDep1ByClearDepIdx( ISecureAuthorization Authorization,
		IBusModelClearDepByClearDepIdxKey argKey )
	{
		final String S_ProcName = "deleteClearSubDep1ByClearDepIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByClearDepIdx(argKey.getRequiredRelationId());
	}

	/**
	 *	Delete the ClearSubDep1 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteClearSubDep1ByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "deleteClearSubDep1ByDefSchemaIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByDefSchemaIdx(argDefSchemaId);
	}


	/**
	 *	Delete the ClearSubDep1 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteClearSubDep1ByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelClearDepByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteClearSubDep1ByDefSchemaIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByDefSchemaIdx(argKey.getOptionalDefSchemaId());
	}

	/**
	 *	Delete the ClearSubDep1 instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteClearSubDep1ByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteClearSubDep1ByIdIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the ClearSubDep1 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteClearSubDep1ByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "deleteClearSubDep1ByTenantIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByTenantIdx(argTenantId);
	}


	/**
	 *	Delete the ClearSubDep1 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteClearSubDep1ByTenantIdx( ISecureAuthorization Authorization,
		IBusModelScopeByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteClearSubDep1ByTenantIdx";
		boolean permissionGranted = canDeleteClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getClearSubDep1Service().deleteByTenantIdx(argKey.getRequiredTenantId());
	}


	/**
	 *	Read the derived ClearSubDep1 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ClearSubDep1 instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelClearSubDep1 readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelClearSubDep1 retval = schema.getJpaHooksSchema().getClearSubDep1Service().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived ClearSubDep1 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ClearSubDep1 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelClearSubDep1 lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelClearSubDep1 retval = schema.getJpaHooksSchema().getClearSubDep1Service().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all ClearSubDep1 instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelClearSubDep1[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<BusModelJpaClearSubDep1> retlist = schema.getJpaHooksSchema().getClearSubDep1Service().findAll();
		IBusModelClearSubDep1[] retset = new IBusModelClearSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaClearSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived ClearSubDep1 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelClearSubDep1 readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelClearSubDep1 retval = schema.getJpaHooksSchema().getClearSubDep1Service().find(argId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readclearsubdep1")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived ClearSubDep1 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelClearSubDep1[] readDerivedByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readDerivedByTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaClearSubDep1> retlist = schema.getJpaHooksSchema().getClearSubDep1Service().findByTenantIdx(argTenantId);
		IBusModelClearSubDep1[] retset = new IBusModelClearSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaClearSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived ClearSubDep1 record instances identified by the duplicate key ClearDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelClearSubDep1[] readDerivedByClearDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId )
	{
		final String S_ProcName = "readDerivedByClearDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaClearSubDep1> retlist = schema.getJpaHooksSchema().getClearSubDep1Service().findByClearDepIdx(argRelationId);
		IBusModelClearSubDep1[] retset = new IBusModelClearSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaClearSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived ClearSubDep1 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelClearSubDep1[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readDerivedByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaClearSubDep1> retlist = schema.getJpaHooksSchema().getClearSubDep1Service().findByDefSchemaIdx(argDefSchemaId);
		IBusModelClearSubDep1[] retset = new IBusModelClearSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaClearSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived ClearSubDep1 record instances identified by the duplicate key ClearTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelClearSubDep1[] readDerivedByClearTopDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClearTopDepId )
	{
		final String S_ProcName = "readDerivedByClearTopDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaClearSubDep1> retlist = schema.getJpaHooksSchema().getClearSubDep1Service().findByClearTopDepIdx(argClearTopDepId);
		IBusModelClearSubDep1[] retset = new IBusModelClearSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaClearSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived ClearSubDep1 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelClearSubDep1 readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClearTopDepId,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelClearSubDep1 retval = schema.getJpaHooksSchema().getClearSubDep1Service().findByUNameIdx(argClearTopDepId,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readclearsubdep1")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the specific ClearSubDep1 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ClearSubDep1 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelClearSubDep1 readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific ClearSubDep1 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ClearSubDep1 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelClearSubDep1 lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific ClearSubDep1 record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ClearSubDep1 instances in the database accessible for the Authorization.
	 */
	@Override
	public IBusModelClearSubDep1[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific ClearSubDep1 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelClearSubDep1 readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific ClearSubDep1 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelClearSubDep1[] readRecByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readRecByTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByTenantIdx");
	}

	/**
	 *	Read an array of the specific ClearSubDep1 record instances identified by the duplicate key ClearDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelClearSubDep1[] readRecByClearDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId )
	{
		final String S_ProcName = "readRecByClearDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByClearDepIdx");
	}

	/**
	 *	Read an array of the specific ClearSubDep1 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelClearSubDep1[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readRecByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDefSchemaIdx");
	}

	/**
	 *	Read an array of the specific ClearSubDep1 record instances identified by the duplicate key ClearTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelClearSubDep1[] readRecByClearTopDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClearTopDepId )
	{
		final String S_ProcName = "readRecByClearTopDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByClearTopDepIdx");
	}

	/**
	 *	Read the specific ClearSubDep1 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelClearSubDep1 readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClearTopDepId,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadClearSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readclearsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelClearSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}
}
