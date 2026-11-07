
// Description: Java 25 DbIO implementation for SysCluster.

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
 *	SecureJpaSysClusterTable database implementation for SysCluster
 */
public class SecureJpaSysClusterTable implements ISecureSysClusterTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSysClusterTable(ISecureSchema schema) {
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

	protected boolean canCreateSysCluster(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createsyscluster");
		}
		return( permissionGranted );
	}

	protected boolean canReadSysCluster(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readsyscluster");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSysCluster(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatesyscluster");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSysCluster(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletesyscluster");
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
	public ISecureSysCluster createSysCluster( ISecureAuthorization Authorization,
		ISecureSysCluster rec )
	{
		final String S_ProcName = "createSysCluster";
		boolean permissionGranted = canCreateSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSysCluster", 1, "rec");
		}
		else if (rec instanceof SecureJpaSysCluster) {
			SecureJpaSysCluster jparec = (SecureJpaSysCluster)rec;
			SecureJpaSysCluster retval = schema.getJpaHooksSchema().getSysClusterService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSysCluster", "rec", rec, "SecureJpaSysCluster");
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
	public ISecureSysCluster updateSysCluster( ISecureAuthorization Authorization,
		ISecureSysCluster rec )
	{
		final String S_ProcName = "updateSysCluster";
		boolean permissionGranted = canUpdateSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSysCluster", 1, "rec");
		}
		else if (rec instanceof SecureJpaSysCluster) {
			SecureJpaSysCluster jparec = (SecureJpaSysCluster)rec;
			SecureJpaSysCluster retval = schema.getJpaHooksSchema().getSysClusterService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSysCluster", "rec", rec, "SecureJpaSysCluster");
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
	public void deleteSysCluster( ISecureAuthorization Authorization,
		ISecureSysCluster rec )
	{
		final String S_ProcName = "deleteSysCluster";
		boolean permissionGranted = canDeleteSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSysCluster) {
			SecureJpaSysCluster jparec = (SecureJpaSysCluster)rec;
			schema.getJpaHooksSchema().getSysClusterService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSysCluster", "rec", rec, "SecureJpaSysCluster");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSysCluster");
	}

	/**
	 *	Delete the SysCluster instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSysClusterByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteSysClusterByIdIdx";
		boolean permissionGranted = canDeleteSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSysClusterService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the SysCluster instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SysCluster key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSysClusterByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		final String S_ProcName = "deleteSysClusterByClusterIdx";
		boolean permissionGranted = canDeleteSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSysClusterService().deleteByClusterIdx(argClusterId);
	}


	/**
	 *	Delete the SysCluster instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSysClusterByClusterIdx( ISecureAuthorization Authorization,
		ISecureSysClusterByClusterIdxKey argKey )
	{
		final String S_ProcName = "deleteSysClusterByClusterIdx";
		boolean permissionGranted = canDeleteSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSysClusterService().deleteByClusterIdx(argKey.getRequiredClusterId());
	}


	/**
	 *	Read the derived SysCluster record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SysCluster instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSysCluster readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSysCluster retval = schema.getJpaHooksSchema().getSysClusterService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived SysCluster record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SysCluster instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSysCluster lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSysCluster retval = schema.getJpaHooksSchema().getSysClusterService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SysCluster instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSysCluster[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSysCluster> retlist = schema.getJpaHooksSchema().getSysClusterService().findAll();
		ISecureSysCluster[] retset = new ISecureSysCluster[retlist.size()];
		int idx = 0;
		for (SecureJpaSysCluster cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SysCluster record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSysCluster readDerivedByIdIdx( ISecureAuthorization Authorization,
		int argSingletonId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSysCluster(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSysCluster retval = schema.getJpaHooksSchema().getSysClusterService().find(argSingletonId);
		return(retval);
	}

	/**
	 *	Read an array of the derived SysCluster record instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSysCluster[] readDerivedByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		final String S_ProcName = "readDerivedByClusterIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSysCluster(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSysCluster> retlist = schema.getJpaHooksSchema().getSysClusterService().findByClusterIdx(argClusterId);
		ISecureSysCluster[] retset = new ISecureSysCluster[retlist.size()];
		int idx = 0;
		for (SecureJpaSysCluster cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SysCluster record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SysCluster instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSysCluster readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific SysCluster record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SysCluster instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSysCluster lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SysCluster record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SysCluster instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSysCluster[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSysCluster(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SysCluster record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSysCluster readRecByIdIdx( ISecureAuthorization Authorization,
		int argSingletonId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSysCluster(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific SysCluster record instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSysCluster[] readRecByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		final String S_ProcName = "readRecByClusterIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSysCluster(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsyscluster", ISecureSchema.SCHEMA_NAME, ISecureSysClusterTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByClusterIdx");
	}
}
