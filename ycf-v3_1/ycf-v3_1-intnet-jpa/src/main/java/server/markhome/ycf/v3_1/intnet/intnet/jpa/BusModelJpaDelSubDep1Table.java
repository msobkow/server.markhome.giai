
// Description: Java 25 DbIO implementation for DelSubDep1.

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
 *	BusModelJpaDelSubDep1Table database implementation for DelSubDep1
 */
public class BusModelJpaDelSubDep1Table implements IBusModelDelSubDep1Table
{
	protected BusModelJpaSchema schema;


	public BusModelJpaDelSubDep1Table(IBusModelSchema schema) {
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

	protected boolean canCreateDelSubDep1(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "createdelsubdep1");
		}
		return( permissionGranted );
	}

	protected boolean canReadDelSubDep1(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "readdelsubdep1");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateDelSubDep1(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "updatedelsubdep1");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteDelSubDep1(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "deletedelsubdep1");
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
	public IBusModelDelSubDep1 createDelSubDep1( ISecureAuthorization Authorization,
		IBusModelDelSubDep1 rec )
	{
		final String S_ProcName = "createDelSubDep1";
		boolean permissionGranted = canCreateDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createDelSubDep1", 1, "rec");
		}
		else if (rec instanceof BusModelJpaDelSubDep1) {
			BusModelJpaDelSubDep1 jparec = (BusModelJpaDelSubDep1)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaDelSubDep1 retval = schema.getJpaHooksSchema().getDelSubDep1Service().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createDelSubDep1", "rec", rec, "BusModelJpaDelSubDep1");
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
	public IBusModelDelSubDep1 updateDelSubDep1( ISecureAuthorization Authorization,
		IBusModelDelSubDep1 rec )
	{
		final String S_ProcName = "updateDelSubDep1";
		boolean permissionGranted = canUpdateDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateDelSubDep1", 1, "rec");
		}
		else if (rec instanceof BusModelJpaDelSubDep1) {
			BusModelJpaDelSubDep1 jparec = (BusModelJpaDelSubDep1)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaDelSubDep1 retval = schema.getJpaHooksSchema().getDelSubDep1Service().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateDelSubDep1", "rec", rec, "BusModelJpaDelSubDep1");
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
	public void deleteDelSubDep1( ISecureAuthorization Authorization,
		IBusModelDelSubDep1 rec )
	{
		final String S_ProcName = "deleteDelSubDep1";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof BusModelJpaDelSubDep1) {
			BusModelJpaDelSubDep1 jparec = (BusModelJpaDelSubDep1)rec;
			schema.getJpaHooksSchema().getDelSubDep1Service().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteDelSubDep1", "rec", rec, "BusModelJpaDelSubDep1");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteDelSubDep1");
	}

	/**
	 *	Delete the DelSubDep1 instances identified by the key DelTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep1ByDelTopDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelTopDepId )
	{
		final String S_ProcName = "deleteDelSubDep1ByDelTopDepIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByDelTopDepIdx(argDelTopDepId);
	}


	/**
	 *	Delete the DelSubDep1 instances identified by the key DelTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep1ByDelTopDepIdx( ISecureAuthorization Authorization,
		IBusModelDelSubDep1ByDelTopDepIdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep1ByDelTopDepIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByDelTopDepIdx(argKey.getRequiredDelTopDepId());
	}

	/**
	 *	Delete the DelSubDep1 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep1ByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelTopDepId,
		String argName )
	{
		final String S_ProcName = "deleteDelSubDep1ByUNameIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByUNameIdx(argDelTopDepId,
		argName);
	}


	/**
	 *	Delete the DelSubDep1 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep1ByUNameIdx( ISecureAuthorization Authorization,
		IBusModelDelSubDep1ByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep1ByUNameIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByUNameIdx(argKey.getRequiredDelTopDepId(),
			argKey.getRequiredName());
	}

	/**
	 *	Delete the DelSubDep1 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep1ByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "deleteDelSubDep1ByDefSchemaIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByDefSchemaIdx(argDefSchemaId);
	}


	/**
	 *	Delete the DelSubDep1 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep1ByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelDelDepByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep1ByDefSchemaIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByDefSchemaIdx(argKey.getOptionalDefSchemaId());
	}

	/**
	 *	Delete the DelSubDep1 instances identified by the key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep1ByDelDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId )
	{
		final String S_ProcName = "deleteDelSubDep1ByDelDepIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByDelDepIdx(argRelationId);
	}


	/**
	 *	Delete the DelSubDep1 instances identified by the key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep1ByDelDepIdx( ISecureAuthorization Authorization,
		IBusModelDelDepByDelDepIdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep1ByDelDepIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByDelDepIdx(argKey.getRequiredRelationId());
	}

	/**
	 *	Delete the DelSubDep1 instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteDelSubDep1ByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteDelSubDep1ByIdIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the DelSubDep1 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep1ByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "deleteDelSubDep1ByTenantIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByTenantIdx(argTenantId);
	}


	/**
	 *	Delete the DelSubDep1 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep1ByTenantIdx( ISecureAuthorization Authorization,
		IBusModelScopeByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep1ByTenantIdx";
		boolean permissionGranted = canDeleteDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep1Service().deleteByTenantIdx(argKey.getRequiredTenantId());
	}


	/**
	 *	Read the derived DelSubDep1 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep1 instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelDelSubDep1 readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelDelSubDep1 retval = schema.getJpaHooksSchema().getDelSubDep1Service().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived DelSubDep1 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep1 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelDelSubDep1 lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelDelSubDep1 retval = schema.getJpaHooksSchema().getDelSubDep1Service().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all DelSubDep1 instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep1[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<BusModelJpaDelSubDep1> retlist = schema.getJpaHooksSchema().getDelSubDep1Service().findAll();
		IBusModelDelSubDep1[] retset = new IBusModelDelSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived DelSubDep1 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelDelSubDep1 readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelDelSubDep1 retval = schema.getJpaHooksSchema().getDelSubDep1Service().find(argId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readdelsubdep1")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived DelSubDep1 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep1[] readDerivedByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readDerivedByTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaDelSubDep1> retlist = schema.getJpaHooksSchema().getDelSubDep1Service().findByTenantIdx(argTenantId);
		IBusModelDelSubDep1[] retset = new IBusModelDelSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived DelSubDep1 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep1[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readDerivedByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaDelSubDep1> retlist = schema.getJpaHooksSchema().getDelSubDep1Service().findByDefSchemaIdx(argDefSchemaId);
		IBusModelDelSubDep1[] retset = new IBusModelDelSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived DelSubDep1 record instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep1[] readDerivedByDelDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId )
	{
		final String S_ProcName = "readDerivedByDelDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaDelSubDep1> retlist = schema.getJpaHooksSchema().getDelSubDep1Service().findByDelDepIdx(argRelationId);
		IBusModelDelSubDep1[] retset = new IBusModelDelSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived DelSubDep1 record instances identified by the duplicate key DelTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep1[] readDerivedByDelTopDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelTopDepId )
	{
		final String S_ProcName = "readDerivedByDelTopDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaDelSubDep1> retlist = schema.getJpaHooksSchema().getDelSubDep1Service().findByDelTopDepIdx(argDelTopDepId);
		IBusModelDelSubDep1[] retset = new IBusModelDelSubDep1[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep1 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived DelSubDep1 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelDelSubDep1 readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelTopDepId,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelDelSubDep1 retval = schema.getJpaHooksSchema().getDelSubDep1Service().findByUNameIdx(argDelTopDepId,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readdelsubdep1")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the specific DelSubDep1 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep1 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep1 readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific DelSubDep1 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep1 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep1 lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatedelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific DelSubDep1 record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific DelSubDep1 instances in the database accessible for the Authorization.
	 */
	@Override
	public IBusModelDelSubDep1[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific DelSubDep1 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep1 readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific DelSubDep1 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep1[] readRecByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readRecByTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByTenantIdx");
	}

	/**
	 *	Read an array of the specific DelSubDep1 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep1[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readRecByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDefSchemaIdx");
	}

	/**
	 *	Read an array of the specific DelSubDep1 record instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep1[] readRecByDelDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId )
	{
		final String S_ProcName = "readRecByDelDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDelDepIdx");
	}

	/**
	 *	Read an array of the specific DelSubDep1 record instances identified by the duplicate key DelTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep1[] readRecByDelTopDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelTopDepId )
	{
		final String S_ProcName = "readRecByDelTopDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDelTopDepIdx");
	}

	/**
	 *	Read the specific DelSubDep1 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep1 readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelTopDepId,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep1(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep1", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep1Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}
}
