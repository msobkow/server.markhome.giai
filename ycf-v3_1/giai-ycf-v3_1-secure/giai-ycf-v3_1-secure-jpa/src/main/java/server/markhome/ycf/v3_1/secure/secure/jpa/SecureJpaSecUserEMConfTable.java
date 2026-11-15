
// Description: Java 25 DbIO implementation for SecUserEMConf.

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
 *	SecureJpaSecUserEMConfTable database implementation for SecUserEMConf
 */
public class SecureJpaSecUserEMConfTable implements ISecureSecUserEMConfTable
{
	protected SecureJpaSchema schema;


	public SecureJpaSecUserEMConfTable(ISecureSchema schema) {
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

	protected boolean canCreateSecUserEMConf(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createsecuseremconf");
		}
		return( permissionGranted );
	}

	protected boolean canReadSecUserEMConf(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readsecuseremconf");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateSecUserEMConf(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatesecuseremconf");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteSecUserEMConf(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletesecuseremconf");
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
	public ISecureSecUserEMConf createSecUserEMConf( ISecureAuthorization Authorization,
		ISecureSecUserEMConf rec )
	{
		final String S_ProcName = "createSecUserEMConf";
		boolean permissionGranted = canCreateSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createSecUserEMConf", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecUserEMConf) {
			SecureJpaSecUserEMConf jparec = (SecureJpaSecUserEMConf)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecUserEMConf retval = schema.getJpaHooksSchema().getSecUserEMConfService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createSecUserEMConf", "rec", rec, "SecureJpaSecUserEMConf");
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
	public ISecureSecUserEMConf updateSecUserEMConf( ISecureAuthorization Authorization,
		ISecureSecUserEMConf rec )
	{
		final String S_ProcName = "updateSecUserEMConf";
		boolean permissionGranted = canUpdateSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateSecUserEMConf", 1, "rec");
		}
		else if (rec instanceof SecureJpaSecUserEMConf) {
			SecureJpaSecUserEMConf jparec = (SecureJpaSecUserEMConf)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaSecUserEMConf retval = schema.getJpaHooksSchema().getSecUserEMConfService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateSecUserEMConf", "rec", rec, "SecureJpaSecUserEMConf");
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
	public void deleteSecUserEMConf( ISecureAuthorization Authorization,
		ISecureSecUserEMConf rec )
	{
		final String S_ProcName = "deleteSecUserEMConf";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaSecUserEMConf) {
			SecureJpaSecUserEMConf jparec = (SecureJpaSecUserEMConf)rec;
			schema.getJpaHooksSchema().getSecUserEMConfService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteSecUserEMConf", "rec", rec, "SecureJpaSecUserEMConf");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteSecUserEMConf");
	}

	/**
	 *	Delete the SecUserEMConf instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteSecUserEMConfByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteSecUserEMConfByIdIdx";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserEMConfService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the SecUserEMConf instances identified by the key UUuid6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EMConfirmationUuid6	The SecUserEMConf key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserEMConfByUUuid6Idx( ISecureAuthorization Authorization,
		ICFUuid6 argEMConfirmationUuid6 )
	{
		final String S_ProcName = "deleteSecUserEMConfByUUuid6Idx";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserEMConfService().deleteByUUuid6Idx(argEMConfirmationUuid6);
	}


	/**
	 *	Delete the SecUserEMConf instances identified by the key UUuid6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserEMConfByUUuid6Idx( ISecureAuthorization Authorization,
		ISecureSecUserEMConfByUUuid6IdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserEMConfByUUuid6Idx";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserEMConfService().deleteByUUuid6Idx(argKey.getRequiredEMConfirmationUuid6());
	}

	/**
	 *	Delete the SecUserEMConf instances identified by the key ConfEMAddrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ConfirmEMailAddr	The SecUserEMConf key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserEMConfByConfEMAddrIdx( ISecureAuthorization Authorization,
		String argConfirmEMailAddr )
	{
		final String S_ProcName = "deleteSecUserEMConfByConfEMAddrIdx";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserEMConfService().deleteByConfEMAddrIdx(argConfirmEMailAddr);
	}


	/**
	 *	Delete the SecUserEMConf instances identified by the key ConfEMAddrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserEMConfByConfEMAddrIdx( ISecureAuthorization Authorization,
		ISecureSecUserEMConfByConfEMAddrIdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserEMConfByConfEMAddrIdx";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserEMConfService().deleteByConfEMAddrIdx(argKey.getRequiredConfirmEMailAddr());
	}

	/**
	 *	Delete the SecUserEMConf instances identified by the key SentStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EMailSentStamp	The SecUserEMConf key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserEMConfBySentStampIdx( ISecureAuthorization Authorization,
		LocalDateTime argEMailSentStamp )
	{
		final String S_ProcName = "deleteSecUserEMConfBySentStampIdx";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserEMConfService().deleteBySentStampIdx(argEMailSentStamp);
	}


	/**
	 *	Delete the SecUserEMConf instances identified by the key SentStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserEMConfBySentStampIdx( ISecureAuthorization Authorization,
		ISecureSecUserEMConfBySentStampIdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserEMConfBySentStampIdx";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserEMConfService().deleteBySentStampIdx(argKey.getRequiredEMailSentStamp());
	}

	/**
	 *	Delete the SecUserEMConf instances identified by the key NewAcctIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NewAccount	The SecUserEMConf key attribute of the instance generating the id.
	 */
	@Override
	public void deleteSecUserEMConfByNewAcctIdx( ISecureAuthorization Authorization,
		boolean argNewAccount )
	{
		final String S_ProcName = "deleteSecUserEMConfByNewAcctIdx";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserEMConfService().deleteByNewAcctIdx(argNewAccount);
	}


	/**
	 *	Delete the SecUserEMConf instances identified by the key NewAcctIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteSecUserEMConfByNewAcctIdx( ISecureAuthorization Authorization,
		ISecureSecUserEMConfByNewAcctIdxKey argKey )
	{
		final String S_ProcName = "deleteSecUserEMConfByNewAcctIdx";
		boolean permissionGranted = canDeleteSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getSecUserEMConfService().deleteByNewAcctIdx(argKey.getRequiredNewAccount());
	}


	/**
	 *	Read the derived SecUserEMConf record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserEMConf instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserEMConf readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecUserEMConf retval = schema.getJpaHooksSchema().getSecUserEMConfService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived SecUserEMConf record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserEMConf instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserEMConf lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureSecUserEMConf retval = schema.getJpaHooksSchema().getSecUserEMConfService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all SecUserEMConf instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecUserEMConf[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaSecUserEMConf> retlist = schema.getJpaHooksSchema().getSecUserEMConfService().findAll();
		ISecureSecUserEMConf[] retset = new ISecureSecUserEMConf[retlist.size()];
		int idx = 0;
		for (SecureJpaSecUserEMConf cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived SecUserEMConf record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserEMConf readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecUserEMConf retval = schema.getJpaHooksSchema().getSecUserEMConfService().find(argSecUserId);
		return(retval);
	}

	/**
	 *	Read the derived SecUserEMConf record instance identified by the unique key UUuid6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EMConfirmationUuid6	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureSecUserEMConf readDerivedByUUuid6Idx( ISecureAuthorization Authorization,
		ICFUuid6 argEMConfirmationUuid6 )
	{
		final String S_ProcName = "readDerivedByUUuid6Idx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureSecUserEMConf retval = schema.getJpaHooksSchema().getSecUserEMConfService().findByUUuid6Idx(argEMConfirmationUuid6);
		return(retval);
	}

	/**
	 *	Read an array of the derived SecUserEMConf record instances identified by the duplicate key ConfEMAddrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ConfirmEMailAddr	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecUserEMConf[] readDerivedByConfEMAddrIdx( ISecureAuthorization Authorization,
		String argConfirmEMailAddr )
	{
		final String S_ProcName = "readDerivedByConfEMAddrIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecUserEMConf> retlist = schema.getJpaHooksSchema().getSecUserEMConfService().findByConfEMAddrIdx(argConfirmEMailAddr);
		ISecureSecUserEMConf[] retset = new ISecureSecUserEMConf[retlist.size()];
		int idx = 0;
		for (SecureJpaSecUserEMConf cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecUserEMConf record instances identified by the duplicate key SentStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EMailSentStamp	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecUserEMConf[] readDerivedBySentStampIdx( ISecureAuthorization Authorization,
		LocalDateTime argEMailSentStamp )
	{
		final String S_ProcName = "readDerivedBySentStampIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecUserEMConf> retlist = schema.getJpaHooksSchema().getSecUserEMConfService().findBySentStampIdx(argEMailSentStamp);
		ISecureSecUserEMConf[] retset = new ISecureSecUserEMConf[retlist.size()];
		int idx = 0;
		for (SecureJpaSecUserEMConf cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived SecUserEMConf record instances identified by the duplicate key NewAcctIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NewAccount	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureSecUserEMConf[] readDerivedByNewAcctIdx( ISecureAuthorization Authorization,
		boolean argNewAccount )
	{
		final String S_ProcName = "readDerivedByNewAcctIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaSecUserEMConf> retlist = schema.getJpaHooksSchema().getSecUserEMConfService().findByNewAcctIdx(argNewAccount);
		ISecureSecUserEMConf[] retset = new ISecureSecUserEMConf[retlist.size()];
		int idx = 0;
		for (SecureJpaSecUserEMConf cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific SecUserEMConf record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserEMConf instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserEMConf readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific SecUserEMConf record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUserEMConf instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserEMConf lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatesecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific SecUserEMConf record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecUserEMConf instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureSecUserEMConf[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific SecUserEMConf record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserEMConf readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecUserId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific SecUserEMConf record instance identified by the unique key UUuid6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EMConfirmationUuid6	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserEMConf readRecByUUuid6Idx( ISecureAuthorization Authorization,
		ICFUuid6 argEMConfirmationUuid6 )
	{
		final String S_ProcName = "readRecByUUuid6Idx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUUuid6Idx");
	}

	/**
	 *	Read an array of the specific SecUserEMConf record instances identified by the duplicate key ConfEMAddrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ConfirmEMailAddr	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserEMConf[] readRecByConfEMAddrIdx( ISecureAuthorization Authorization,
		String argConfirmEMailAddr )
	{
		final String S_ProcName = "readRecByConfEMAddrIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByConfEMAddrIdx");
	}

	/**
	 *	Read an array of the specific SecUserEMConf record instances identified by the duplicate key SentStampIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EMailSentStamp	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserEMConf[] readRecBySentStampIdx( ISecureAuthorization Authorization,
		LocalDateTime argEMailSentStamp )
	{
		final String S_ProcName = "readRecBySentStampIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySentStampIdx");
	}

	/**
	 *	Read an array of the specific SecUserEMConf record instances identified by the duplicate key NewAcctIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NewAccount	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureSecUserEMConf[] readRecByNewAcctIdx( ISecureAuthorization Authorization,
		boolean argNewAccount )
	{
		final String S_ProcName = "readRecByNewAcctIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadSecUserEMConf(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readsecuseremconf", ISecureSchema.SCHEMA_NAME, ISecureSecUserEMConfTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByNewAcctIdx");
	}
}
