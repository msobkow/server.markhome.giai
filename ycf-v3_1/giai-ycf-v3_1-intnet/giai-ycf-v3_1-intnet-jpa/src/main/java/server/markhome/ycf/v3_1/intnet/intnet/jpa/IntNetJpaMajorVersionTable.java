
// Description: Java 25 DbIO implementation for MajorVersion.

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
import server.markhome.ycf.v3_1.intnet.intnet.jpa.IntNetJpaHooksSchema;

/*
 *	IntNetJpaMajorVersionTable database implementation for MajorVersion
 */
public class IntNetJpaMajorVersionTable implements IIntNetMajorVersionTable
{
	protected IntNetJpaSchema schema;


	public IntNetJpaMajorVersionTable(IIntNetSchema schema) {
		if( schema == null ) {
			throw new CFNullArgumentException(getClass(), "constructor", 1, "schema" );
		}
		if (schema instanceof IntNetJpaSchema) {
			this.schema = (IntNetJpaSchema)schema;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "constructor", "schema", schema, "IntNetJpaSchema");
		}
	}

	protected boolean canCreateMajorVersion(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "createmajorversion");
		}
		return( permissionGranted );
	}

	protected boolean canReadMajorVersion(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "readmajorversion");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateMajorVersion(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "updatemajorversion");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteMajorVersion(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "deletemajorversion");
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
	public IIntNetMajorVersion createMajorVersion( ISecureAuthorization Authorization,
		IIntNetMajorVersion rec )
	{
		final String S_ProcName = "createMajorVersion";
		boolean permissionGranted = canCreateMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createMajorVersion", 1, "rec");
		}
		else if (rec instanceof IntNetJpaMajorVersion) {
			IntNetJpaMajorVersion jparec = (IntNetJpaMajorVersion)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			IntNetJpaMajorVersion retval = schema.getJpaHooksSchema().getMajorVersionService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createMajorVersion", "rec", rec, "IntNetJpaMajorVersion");
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
	public IIntNetMajorVersion updateMajorVersion( ISecureAuthorization Authorization,
		IIntNetMajorVersion rec )
	{
		final String S_ProcName = "updateMajorVersion";
		boolean permissionGranted = canUpdateMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateMajorVersion", 1, "rec");
		}
		else if (rec instanceof IntNetJpaMajorVersion) {
			IntNetJpaMajorVersion jparec = (IntNetJpaMajorVersion)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			IntNetJpaMajorVersion retval = schema.getJpaHooksSchema().getMajorVersionService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateMajorVersion", "rec", rec, "IntNetJpaMajorVersion");
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
	public void deleteMajorVersion( ISecureAuthorization Authorization,
		IIntNetMajorVersion rec )
	{
		final String S_ProcName = "deleteMajorVersion";
		boolean permissionGranted = canDeleteMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof IntNetJpaMajorVersion) {
			IntNetJpaMajorVersion jparec = (IntNetJpaMajorVersion)rec;
			schema.getJpaHooksSchema().getMajorVersionService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteMajorVersion", "rec", rec, "IntNetJpaMajorVersion");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteMajorVersion");
	}

	/**
	 *	Delete the MajorVersion instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteMajorVersionByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteMajorVersionByIdIdx";
		boolean permissionGranted = canDeleteMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getMajorVersionService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the MajorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 */
	@Override
	public void deleteMajorVersionByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "deleteMajorVersionByTenantIdx";
		boolean permissionGranted = canDeleteMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getMajorVersionService().deleteByTenantIdx(argTenantId);
	}


	/**
	 *	Delete the MajorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteMajorVersionByTenantIdx( ISecureAuthorization Authorization,
		IIntNetMajorVersionByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteMajorVersionByTenantIdx";
		boolean permissionGranted = canDeleteMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getMajorVersionService().deleteByTenantIdx(argKey.getRequiredTenantId());
	}

	/**
	 *	Delete the MajorVersion instances identified by the key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 */
	@Override
	public void deleteMajorVersionBySubProjectIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSubProjectId )
	{
		final String S_ProcName = "deleteMajorVersionBySubProjectIdx";
		boolean permissionGranted = canDeleteMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getMajorVersionService().deleteBySubProjectIdx(argSubProjectId);
	}


	/**
	 *	Delete the MajorVersion instances identified by the key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteMajorVersionBySubProjectIdx( ISecureAuthorization Authorization,
		IIntNetMajorVersionBySubProjectIdxKey argKey )
	{
		final String S_ProcName = "deleteMajorVersionBySubProjectIdx";
		boolean permissionGranted = canDeleteMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getMajorVersionService().deleteBySubProjectIdx(argKey.getRequiredSubProjectId());
	}

	/**
	 *	Delete the MajorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 */
	@Override
	public void deleteMajorVersionByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSubProjectId,
		String argName )
	{
		final String S_ProcName = "deleteMajorVersionByNameIdx";
		boolean permissionGranted = canDeleteMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getMajorVersionService().deleteByNameIdx(argSubProjectId,
		argName);
	}


	/**
	 *	Delete the MajorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteMajorVersionByNameIdx( ISecureAuthorization Authorization,
		IIntNetMajorVersionByNameIdxKey argKey )
	{
		final String S_ProcName = "deleteMajorVersionByNameIdx";
		boolean permissionGranted = canDeleteMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getMajorVersionService().deleteByNameIdx(argKey.getRequiredSubProjectId(),
			argKey.getRequiredName());
	}


	/**
	 *	Read the derived MajorVersion record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetMajorVersion readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IIntNetMajorVersion retval = schema.getJpaHooksSchema().getMajorVersionService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived MajorVersion record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetMajorVersion lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IIntNetMajorVersion retval = schema.getJpaHooksSchema().getMajorVersionService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all MajorVersion instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public IIntNetMajorVersion[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<IntNetJpaMajorVersion> retlist = schema.getJpaHooksSchema().getMajorVersionService().findAll();
		IIntNetMajorVersion[] retset = new IIntNetMajorVersion[retlist.size()];
		int idx = 0;
		for (IntNetJpaMajorVersion cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived MajorVersion record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetMajorVersion readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IIntNetMajorVersion retval = schema.getJpaHooksSchema().getMajorVersionService().find(argId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readmajorversion")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived MajorVersion record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IIntNetMajorVersion[] readDerivedByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readDerivedByTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<IntNetJpaMajorVersion> retlist = schema.getJpaHooksSchema().getMajorVersionService().findByTenantIdx(argTenantId);
		IIntNetMajorVersion[] retset = new IIntNetMajorVersion[retlist.size()];
		int idx = 0;
		for (IntNetJpaMajorVersion cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived MajorVersion record instances identified by the duplicate key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IIntNetMajorVersion[] readDerivedBySubProjectIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSubProjectId )
	{
		final String S_ProcName = "readDerivedBySubProjectIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<IntNetJpaMajorVersion> retlist = schema.getJpaHooksSchema().getMajorVersionService().findBySubProjectIdx(argSubProjectId);
		IIntNetMajorVersion[] retset = new IIntNetMajorVersion[retlist.size()];
		int idx = 0;
		for (IntNetJpaMajorVersion cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived MajorVersion record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetMajorVersion readDerivedByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSubProjectId,
		String argName )
	{
		final String S_ProcName = "readDerivedByNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IIntNetMajorVersion retval = schema.getJpaHooksSchema().getMajorVersionService().findByNameIdx(argSubProjectId,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readmajorversion")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the specific MajorVersion record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetMajorVersion readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific MajorVersion record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetMajorVersion lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatemajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific MajorVersion record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific MajorVersion instances in the database accessible for the Authorization.
	 */
	@Override
	public IIntNetMajorVersion[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific MajorVersion record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetMajorVersion readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific MajorVersion record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetMajorVersion[] readRecByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readRecByTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByTenantIdx");
	}

	/**
	 *	Read an array of the specific MajorVersion record instances identified by the duplicate key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetMajorVersion[] readRecBySubProjectIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSubProjectId )
	{
		final String S_ProcName = "readRecBySubProjectIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySubProjectIdx");
	}

	/**
	 *	Read the specific MajorVersion record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetMajorVersion readRecByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSubProjectId,
		String argName )
	{
		final String S_ProcName = "readRecByNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadMajorVersion(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readmajorversion", IIntNetSchema.SCHEMA_NAME, IIntNetMajorVersionTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByNameIdx");
	}
}
