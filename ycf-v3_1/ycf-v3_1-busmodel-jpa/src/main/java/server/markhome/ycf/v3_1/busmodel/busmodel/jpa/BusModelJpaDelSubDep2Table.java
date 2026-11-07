
// Description: Java 25 DbIO implementation for DelSubDep2.

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
 *	BusModelJpaDelSubDep2Table database implementation for DelSubDep2
 */
public class BusModelJpaDelSubDep2Table implements IBusModelDelSubDep2Table
{
	protected BusModelJpaSchema schema;


	public BusModelJpaDelSubDep2Table(IBusModelSchema schema) {
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

	protected boolean canCreateDelSubDep2(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "createdelsubdep2");
		}
		return( permissionGranted );
	}

	protected boolean canReadDelSubDep2(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "readdelsubdep2");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateDelSubDep2(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "updatedelsubdep2");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteDelSubDep2(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "deletedelsubdep2");
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
	public IBusModelDelSubDep2 createDelSubDep2( ISecureAuthorization Authorization,
		IBusModelDelSubDep2 rec )
	{
		final String S_ProcName = "createDelSubDep2";
		boolean permissionGranted = canCreateDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createDelSubDep2", 1, "rec");
		}
		else if (rec instanceof BusModelJpaDelSubDep2) {
			BusModelJpaDelSubDep2 jparec = (BusModelJpaDelSubDep2)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaDelSubDep2 retval = schema.getJpaHooksSchema().getDelSubDep2Service().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createDelSubDep2", "rec", rec, "BusModelJpaDelSubDep2");
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
	public IBusModelDelSubDep2 updateDelSubDep2( ISecureAuthorization Authorization,
		IBusModelDelSubDep2 rec )
	{
		final String S_ProcName = "updateDelSubDep2";
		boolean permissionGranted = canUpdateDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateDelSubDep2", 1, "rec");
		}
		else if (rec instanceof BusModelJpaDelSubDep2) {
			BusModelJpaDelSubDep2 jparec = (BusModelJpaDelSubDep2)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			BusModelJpaDelSubDep2 retval = schema.getJpaHooksSchema().getDelSubDep2Service().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateDelSubDep2", "rec", rec, "BusModelJpaDelSubDep2");
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
	public void deleteDelSubDep2( ISecureAuthorization Authorization,
		IBusModelDelSubDep2 rec )
	{
		final String S_ProcName = "deleteDelSubDep2";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof BusModelJpaDelSubDep2) {
			BusModelJpaDelSubDep2 jparec = (BusModelJpaDelSubDep2)rec;
			schema.getJpaHooksSchema().getDelSubDep2Service().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteDelSubDep2", "rec", rec, "BusModelJpaDelSubDep2");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteDelSubDep2");
	}

	/**
	 *	Delete the DelSubDep2 instances identified by the key ContDelDep1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep2ByContDelDep1Idx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelSubDep1Id )
	{
		final String S_ProcName = "deleteDelSubDep2ByContDelDep1Idx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByContDelDep1Idx(argDelSubDep1Id);
	}


	/**
	 *	Delete the DelSubDep2 instances identified by the key ContDelDep1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep2ByContDelDep1Idx( ISecureAuthorization Authorization,
		IBusModelDelSubDep2ByContDelDep1IdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep2ByContDelDep1Idx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByContDelDep1Idx(argKey.getRequiredDelSubDep1Id());
	}

	/**
	 *	Delete the DelSubDep2 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep2 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep2ByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelSubDep1Id,
		String argName )
	{
		final String S_ProcName = "deleteDelSubDep2ByUNameIdx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByUNameIdx(argDelSubDep1Id,
		argName);
	}


	/**
	 *	Delete the DelSubDep2 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep2ByUNameIdx( ISecureAuthorization Authorization,
		IBusModelDelSubDep2ByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep2ByUNameIdx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByUNameIdx(argKey.getRequiredDelSubDep1Id(),
			argKey.getRequiredName());
	}

	/**
	 *	Delete the DelSubDep2 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DelSubDep2 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep2ByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "deleteDelSubDep2ByDefSchemaIdx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByDefSchemaIdx(argDefSchemaId);
	}


	/**
	 *	Delete the DelSubDep2 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep2ByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelDelDepByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep2ByDefSchemaIdx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByDefSchemaIdx(argKey.getOptionalDefSchemaId());
	}

	/**
	 *	Delete the DelSubDep2 instances identified by the key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The DelSubDep2 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep2ByDelDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId )
	{
		final String S_ProcName = "deleteDelSubDep2ByDelDepIdx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByDelDepIdx(argRelationId);
	}


	/**
	 *	Delete the DelSubDep2 instances identified by the key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep2ByDelDepIdx( ISecureAuthorization Authorization,
		IBusModelDelDepByDelDepIdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep2ByDelDepIdx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByDelDepIdx(argKey.getRequiredRelationId());
	}

	/**
	 *	Delete the DelSubDep2 instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteDelSubDep2ByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteDelSubDep2ByIdIdx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the DelSubDep2 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 */
	@Override
	public void deleteDelSubDep2ByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "deleteDelSubDep2ByTenantIdx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByTenantIdx(argTenantId);
	}


	/**
	 *	Delete the DelSubDep2 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteDelSubDep2ByTenantIdx( ISecureAuthorization Authorization,
		IBusModelScopeByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteDelSubDep2ByTenantIdx";
		boolean permissionGranted = canDeleteDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getDelSubDep2Service().deleteByTenantIdx(argKey.getRequiredTenantId());
	}


	/**
	 *	Read the derived DelSubDep2 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep2 instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelDelSubDep2 readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelDelSubDep2 retval = schema.getJpaHooksSchema().getDelSubDep2Service().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived DelSubDep2 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep2 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelDelSubDep2 lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IBusModelDelSubDep2 retval = schema.getJpaHooksSchema().getDelSubDep2Service().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all DelSubDep2 instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep2[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<BusModelJpaDelSubDep2> retlist = schema.getJpaHooksSchema().getDelSubDep2Service().findAll();
		IBusModelDelSubDep2[] retset = new IBusModelDelSubDep2[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep2 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived DelSubDep2 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelDelSubDep2 readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelDelSubDep2 retval = schema.getJpaHooksSchema().getDelSubDep2Service().find(argId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readdelsubdep2")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived DelSubDep2 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep2[] readDerivedByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readDerivedByTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaDelSubDep2> retlist = schema.getJpaHooksSchema().getDelSubDep2Service().findByTenantIdx(argTenantId);
		IBusModelDelSubDep2[] retset = new IBusModelDelSubDep2[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep2 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived DelSubDep2 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep2[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readDerivedByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaDelSubDep2> retlist = schema.getJpaHooksSchema().getDelSubDep2Service().findByDefSchemaIdx(argDefSchemaId);
		IBusModelDelSubDep2[] retset = new IBusModelDelSubDep2[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep2 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived DelSubDep2 record instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep2[] readDerivedByDelDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId )
	{
		final String S_ProcName = "readDerivedByDelDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaDelSubDep2> retlist = schema.getJpaHooksSchema().getDelSubDep2Service().findByDelDepIdx(argRelationId);
		IBusModelDelSubDep2[] retset = new IBusModelDelSubDep2[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep2 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived DelSubDep2 record instances identified by the duplicate key ContDelDep1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IBusModelDelSubDep2[] readDerivedByContDelDep1Idx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelSubDep1Id )
	{
		final String S_ProcName = "readDerivedByContDelDep1Idx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<BusModelJpaDelSubDep2> retlist = schema.getJpaHooksSchema().getDelSubDep2Service().findByContDelDep1Idx(argDelSubDep1Id);
		IBusModelDelSubDep2[] retset = new IBusModelDelSubDep2[retlist.size()];
		int idx = 0;
		for (BusModelJpaDelSubDep2 cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived DelSubDep2 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IBusModelDelSubDep2 readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelSubDep1Id,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IBusModelDelSubDep2 retval = schema.getJpaHooksSchema().getDelSubDep2Service().findByUNameIdx(argDelSubDep1Id,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readdelsubdep2")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the specific DelSubDep2 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep2 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep2 readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific DelSubDep2 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep2 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep2 lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatedelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific DelSubDep2 record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific DelSubDep2 instances in the database accessible for the Authorization.
	 */
	@Override
	public IBusModelDelSubDep2[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific DelSubDep2 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep2 readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific DelSubDep2 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep2[] readRecByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readRecByTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByTenantIdx");
	}

	/**
	 *	Read an array of the specific DelSubDep2 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep2[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId )
	{
		final String S_ProcName = "readRecByDefSchemaIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDefSchemaIdx");
	}

	/**
	 *	Read an array of the specific DelSubDep2 record instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep2[] readRecByDelDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId )
	{
		final String S_ProcName = "readRecByDelDepIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDelDepIdx");
	}

	/**
	 *	Read an array of the specific DelSubDep2 record instances identified by the duplicate key ContDelDep1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep2[] readRecByContDelDep1Idx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelSubDep1Id )
	{
		final String S_ProcName = "readRecByContDelDep1Idx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByContDelDep1Idx");
	}

	/**
	 *	Read the specific DelSubDep2 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IBusModelDelSubDep2 readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelSubDep1Id,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadDelSubDep2(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readdelsubdep2", IBusModelSchema.SCHEMA_NAME, IBusModelDelSubDep2Table.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}
}
