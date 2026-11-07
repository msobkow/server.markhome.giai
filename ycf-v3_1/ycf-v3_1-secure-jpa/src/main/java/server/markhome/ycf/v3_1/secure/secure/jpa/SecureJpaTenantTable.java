
// Description: Java 25 DbIO implementation for Tenant.

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
 *	SecureJpaTenantTable database implementation for Tenant
 */
public class SecureJpaTenantTable implements ISecureTenantTable
{
	protected SecureJpaSchema schema;


	public SecureJpaTenantTable(ISecureSchema schema) {
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

	protected boolean canCreateTenant(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createtenant");
		}
		return( permissionGranted );
	}

	protected boolean canReadTenant(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readtenant");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateTenant(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatetenant");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteTenant(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletetenant");
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
	public ISecureTenant createTenant( ISecureAuthorization Authorization,
		ISecureTenant rec )
	{
		final String S_ProcName = "createTenant";
		boolean permissionGranted = canCreateTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createTenant", 1, "rec");
		}
		else if (rec instanceof SecureJpaTenant) {
			SecureJpaTenant jparec = (SecureJpaTenant)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaTenant retval = schema.getJpaHooksSchema().getTenantService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createTenant", "rec", rec, "SecureJpaTenant");
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
	public ISecureTenant updateTenant( ISecureAuthorization Authorization,
		ISecureTenant rec )
	{
		final String S_ProcName = "updateTenant";
		boolean permissionGranted = canUpdateTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateTenant", 1, "rec");
		}
		else if (rec instanceof SecureJpaTenant) {
			SecureJpaTenant jparec = (SecureJpaTenant)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaTenant retval = schema.getJpaHooksSchema().getTenantService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateTenant", "rec", rec, "SecureJpaTenant");
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
	public void deleteTenant( ISecureAuthorization Authorization,
		ISecureTenant rec )
	{
		final String S_ProcName = "deleteTenant";
		boolean permissionGranted = canDeleteTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaTenant) {
			SecureJpaTenant jparec = (SecureJpaTenant)rec;
			schema.getJpaHooksSchema().getTenantService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteTenant", "rec", rec, "SecureJpaTenant");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteTenant");
	}

	/**
	 *	Delete the Tenant instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteTenantByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteTenantByIdIdx";
		boolean permissionGranted = canDeleteTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTenantService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the Tenant instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTenantByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		final String S_ProcName = "deleteTenantByClusterIdx";
		boolean permissionGranted = canDeleteTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTenantService().deleteByClusterIdx(argClusterId);
	}


	/**
	 *	Delete the Tenant instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTenantByClusterIdx( ISecureAuthorization Authorization,
		ISecureTenantByClusterIdxKey argKey )
	{
		final String S_ProcName = "deleteTenantByClusterIdx";
		boolean permissionGranted = canDeleteTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTenantService().deleteByClusterIdx(argKey.getRequiredClusterId());
	}

	/**
	 *	Delete the Tenant instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	TenantName	The Tenant key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTenantByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId,
		String argTenantName )
	{
		final String S_ProcName = "deleteTenantByUNameIdx";
		boolean permissionGranted = canDeleteTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTenantService().deleteByUNameIdx(argClusterId,
		argTenantName);
	}


	/**
	 *	Delete the Tenant instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTenantByUNameIdx( ISecureAuthorization Authorization,
		ISecureTenantByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteTenantByUNameIdx";
		boolean permissionGranted = canDeleteTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTenantService().deleteByUNameIdx(argKey.getRequiredClusterId(),
			argKey.getRequiredTenantName());
	}


	/**
	 *	Read the derived Tenant record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Tenant instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTenant readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureTenant retval = schema.getJpaHooksSchema().getTenantService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived Tenant record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Tenant instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTenant lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureTenant retval = schema.getJpaHooksSchema().getTenantService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all Tenant instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureTenant[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaTenant> retlist = schema.getJpaHooksSchema().getTenantService().findAll();
		ISecureTenant[] retset = new ISecureTenant[retlist.size()];
		int idx = 0;
		for (SecureJpaTenant cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived Tenant record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTenant readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTenant(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureTenant retval = schema.getJpaHooksSchema().getTenantService().find(argId);
		return(retval);
	}

	/**
	 *	Read an array of the derived Tenant record instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureTenant[] readDerivedByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		final String S_ProcName = "readDerivedByClusterIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTenant(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaTenant> retlist = schema.getJpaHooksSchema().getTenantService().findByClusterIdx(argClusterId);
		ISecureTenant[] retset = new ISecureTenant[retlist.size()];
		int idx = 0;
		for (SecureJpaTenant cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived Tenant record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	TenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTenant readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId,
		String argTenantName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted && "system".equals(argTenantName)) {
			permissionGranted = true;
		}
		if (!permissionGranted) {
			permissionGranted = canReadTenant(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureTenant retval = schema.getJpaHooksSchema().getTenantService().findByUNameIdx(argClusterId,
		argTenantName);
		return(retval);
	}

	/**
	 *	Read the specific Tenant record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Tenant instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTenant readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific Tenant record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Tenant instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTenant lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific Tenant record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Tenant instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureTenant[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadTenant(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific Tenant record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTenant readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTenant(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific Tenant record instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTenant[] readRecByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		final String S_ProcName = "readRecByClusterIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTenant(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByClusterIdx");
	}

	/**
	 *	Read the specific Tenant record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	TenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTenant readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId,
		String argTenantName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted && "system".equals(argTenantName)) {
			permissionGranted = true;
		}
		if (!permissionGranted) {
			permissionGranted = canReadTenant(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtenant", ISecureSchema.SCHEMA_NAME, ISecureTenantTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}
}
