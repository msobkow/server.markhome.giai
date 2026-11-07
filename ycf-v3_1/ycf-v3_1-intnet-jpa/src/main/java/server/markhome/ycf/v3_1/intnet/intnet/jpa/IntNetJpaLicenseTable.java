
// Description: Java 25 DbIO implementation for License.

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
 *	IntNetJpaLicenseTable database implementation for License
 */
public class IntNetJpaLicenseTable implements IIntNetLicenseTable
{
	protected IntNetJpaSchema schema;


	public IntNetJpaLicenseTable(IIntNetSchema schema) {
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

	protected boolean canCreateLicense(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "createlicense");
		}
		return( permissionGranted );
	}

	protected boolean canReadLicense(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), Authorization.getSecClusterId(), Authorization.getSecTenantId(), "readlicense");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateLicense(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "updatelicense");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteLicense(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), "deletelicense");
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
	public IIntNetLicense createLicense( ISecureAuthorization Authorization,
		IIntNetLicense rec )
	{
		final String S_ProcName = "createLicense";
		boolean permissionGranted = canCreateLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createLicense", 1, "rec");
		}
		else if (rec instanceof IntNetJpaLicense) {
			IntNetJpaLicense jparec = (IntNetJpaLicense)rec;
			IntNetJpaLicense retval = schema.getJpaHooksSchema().getLicenseService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createLicense", "rec", rec, "IntNetJpaLicense");
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
	public IIntNetLicense updateLicense( ISecureAuthorization Authorization,
		IIntNetLicense rec )
	{
		final String S_ProcName = "updateLicense";
		boolean permissionGranted = canUpdateLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateLicense", 1, "rec");
		}
		else if (rec instanceof IntNetJpaLicense) {
			IntNetJpaLicense jparec = (IntNetJpaLicense)rec;
			IntNetJpaLicense retval = schema.getJpaHooksSchema().getLicenseService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateLicense", "rec", rec, "IntNetJpaLicense");
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
	public void deleteLicense( ISecureAuthorization Authorization,
		IIntNetLicense rec )
	{
		final String S_ProcName = "deleteLicense";
		boolean permissionGranted = canDeleteLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof IntNetJpaLicense) {
			IntNetJpaLicense jparec = (IntNetJpaLicense)rec;
			schema.getJpaHooksSchema().getLicenseService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteLicense", "rec", rec, "IntNetJpaLicense");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteLicense");
	}

	/**
	 *	Delete the License instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteLicenseByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteLicenseByIdIdx";
		boolean permissionGranted = canDeleteLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getLicenseService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the License instances identified by the key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 */
	@Override
	public void deleteLicenseByLicnTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "deleteLicenseByLicnTenantIdx";
		boolean permissionGranted = canDeleteLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getLicenseService().deleteByLicnTenantIdx(argTenantId);
	}


	/**
	 *	Delete the License instances identified by the key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteLicenseByLicnTenantIdx( ISecureAuthorization Authorization,
		IIntNetLicenseByLicnTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteLicenseByLicnTenantIdx";
		boolean permissionGranted = canDeleteLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getLicenseService().deleteByLicnTenantIdx(argKey.getRequiredTenantId());
	}

	/**
	 *	Delete the License instances identified by the key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 */
	@Override
	public void deleteLicenseByDomainIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTopDomainId )
	{
		final String S_ProcName = "deleteLicenseByDomainIdx";
		boolean permissionGranted = canDeleteLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getLicenseService().deleteByDomainIdx(argTopDomainId);
	}


	/**
	 *	Delete the License instances identified by the key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteLicenseByDomainIdx( ISecureAuthorization Authorization,
		IIntNetLicenseByDomainIdxKey argKey )
	{
		final String S_ProcName = "deleteLicenseByDomainIdx";
		boolean permissionGranted = canDeleteLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getLicenseService().deleteByDomainIdx(argKey.getRequiredTopDomainId());
	}

	/**
	 *	Delete the License instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 */
	@Override
	public void deleteLicenseByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTopDomainId,
		String argName )
	{
		final String S_ProcName = "deleteLicenseByUNameIdx";
		boolean permissionGranted = canDeleteLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getLicenseService().deleteByUNameIdx(argTopDomainId,
		argName);
	}


	/**
	 *	Delete the License instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteLicenseByUNameIdx( ISecureAuthorization Authorization,
		IIntNetLicenseByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteLicenseByUNameIdx";
		boolean permissionGranted = canDeleteLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getLicenseService().deleteByUNameIdx(argKey.getRequiredTopDomainId(),
			argKey.getRequiredName());
	}


	/**
	 *	Read the derived License record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetLicense readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IIntNetLicense retval = schema.getJpaHooksSchema().getLicenseService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived License record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetLicense lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IIntNetLicense retval = schema.getJpaHooksSchema().getLicenseService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all License instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public IIntNetLicense[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<IntNetJpaLicense> retlist = schema.getJpaHooksSchema().getLicenseService().findAll();
		IIntNetLicense[] retset = new IIntNetLicense[retlist.size()];
		int idx = 0;
		for (IntNetJpaLicense cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived License record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetLicense readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadLicense(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IIntNetLicense retval = schema.getJpaHooksSchema().getLicenseService().find(argId);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readlicense")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read an array of the derived License record instances identified by the duplicate key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IIntNetLicense[] readDerivedByLicnTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readDerivedByLicnTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadLicense(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<IntNetJpaLicense> retlist = schema.getJpaHooksSchema().getLicenseService().findByLicnTenantIdx(argTenantId);
		IIntNetLicense[] retset = new IIntNetLicense[retlist.size()];
		int idx = 0;
		for (IntNetJpaLicense cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived License record instances identified by the duplicate key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IIntNetLicense[] readDerivedByDomainIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTopDomainId )
	{
		final String S_ProcName = "readDerivedByDomainIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadLicense(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<IntNetJpaLicense> retlist = schema.getJpaHooksSchema().getLicenseService().findByDomainIdx(argTopDomainId);
		IIntNetLicense[] retset = new IIntNetLicense[retlist.size()];
		int idx = 0;
		for (IntNetJpaLicense cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived License record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetLicense readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTopDomainId,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadLicense(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IIntNetLicense retval = schema.getJpaHooksSchema().getLicenseService().findByUNameIdx(argTopDomainId,
		argName);
		if(retval != null && !ISecureSchema.getSystemId().equals(Authorization.getSecUserId())) {
				ISecureTenant tenant = retval.getRequiredOwnerTenant();
				ISecureCluster cluster = tenant.getRequiredContainerCluster();
			CFDbKeyHash256 effClusterId = cluster.getRequiredId();
			CFDbKeyHash256 effTenantId = tenant.getRequiredId();
			if (!ISecureSchema.getSecurityService().isMemberOfTenantGroup(Authorization.getSecUserId(), effClusterId, effTenantId, "readlicense")) {
				retval = null;
			}
		}
		return(retval);
	}

	/**
	 *	Read the specific License record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetLicense readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific License record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetLicense lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatelicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific License record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific License instances in the database accessible for the Authorization.
	 */
	@Override
	public IIntNetLicense[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadLicense(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific License record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetLicense readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadLicense(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read an array of the specific License record instances identified by the duplicate key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetLicense[] readRecByLicnTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		final String S_ProcName = "readRecByLicnTenantIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadLicense(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByLicnTenantIdx");
	}

	/**
	 *	Read an array of the specific License record instances identified by the duplicate key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetLicense[] readRecByDomainIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTopDomainId )
	{
		final String S_ProcName = "readRecByDomainIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadLicense(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByDomainIdx");
	}

	/**
	 *	Read the specific License record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetLicense readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTopDomainId,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadLicense(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readlicense", IIntNetSchema.SCHEMA_NAME, IIntNetLicenseTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}
}
