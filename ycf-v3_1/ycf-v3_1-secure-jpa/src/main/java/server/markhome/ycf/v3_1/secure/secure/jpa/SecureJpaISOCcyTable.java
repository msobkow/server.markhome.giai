
// Description: Java 25 DbIO implementation for ISOCcy.

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
 *	SecureJpaISOCcyTable database implementation for ISOCcy
 */
public class SecureJpaISOCcyTable implements ISecureISOCcyTable
{
	protected SecureJpaSchema schema;


	public SecureJpaISOCcyTable(ISecureSchema schema) {
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

	protected boolean canCreateISOCcy(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createisoccy");
		}
		return( permissionGranted );
	}

	protected boolean canReadISOCcy(String S_ProcName, ISecureAuthorization Authorization) {
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
		// SecScope Global means anyone can read the table any time
		permissionGranted = true;
		return( permissionGranted );
	}

	protected boolean canUpdateISOCcy(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updateisoccy");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteISOCcy(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deleteisoccy");
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
	public ISecureISOCcy createISOCcy( ISecureAuthorization Authorization,
		ISecureISOCcy rec )
	{
		final String S_ProcName = "createISOCcy";
		boolean permissionGranted = canCreateISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createISOCcy", 1, "rec");
		}
		else if (rec instanceof SecureJpaISOCcy) {
			SecureJpaISOCcy jparec = (SecureJpaISOCcy)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaISOCcy retval = schema.getJpaHooksSchema().getISOCcyService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createISOCcy", "rec", rec, "SecureJpaISOCcy");
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
	public ISecureISOCcy updateISOCcy( ISecureAuthorization Authorization,
		ISecureISOCcy rec )
	{
		final String S_ProcName = "updateISOCcy";
		boolean permissionGranted = canUpdateISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateISOCcy", 1, "rec");
		}
		else if (rec instanceof SecureJpaISOCcy) {
			SecureJpaISOCcy jparec = (SecureJpaISOCcy)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			SecureJpaISOCcy retval = schema.getJpaHooksSchema().getISOCcyService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateISOCcy", "rec", rec, "SecureJpaISOCcy");
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
	public void deleteISOCcy( ISecureAuthorization Authorization,
		ISecureISOCcy rec )
	{
		final String S_ProcName = "deleteISOCcy";
		boolean permissionGranted = canDeleteISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaISOCcy) {
			SecureJpaISOCcy jparec = (SecureJpaISOCcy)rec;
			schema.getJpaHooksSchema().getISOCcyService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteISOCcy", "rec", rec, "SecureJpaISOCcy");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteISOCcy");
	}

	/**
	 *	Delete the ISOCcy instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteISOCcyByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteISOCcyByIdIdx";
		boolean permissionGranted = canDeleteISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCcyService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the ISOCcy instances identified by the key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 */
	@Override
	public void deleteISOCcyByCcyCdIdx( ISecureAuthorization Authorization,
		String argISOCode )
	{
		final String S_ProcName = "deleteISOCcyByCcyCdIdx";
		boolean permissionGranted = canDeleteISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCcyService().deleteByCcyCdIdx(argISOCode);
	}


	/**
	 *	Delete the ISOCcy instances identified by the key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteISOCcyByCcyCdIdx( ISecureAuthorization Authorization,
		ISecureISOCcyByCcyCdIdxKey argKey )
	{
		final String S_ProcName = "deleteISOCcyByCcyCdIdx";
		boolean permissionGranted = canDeleteISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCcyService().deleteByCcyCdIdx(argKey.getRequiredISOCode());
	}

	/**
	 *	Delete the ISOCcy instances identified by the key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 */
	@Override
	public void deleteISOCcyByCcyNmIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "deleteISOCcyByCcyNmIdx";
		boolean permissionGranted = canDeleteISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCcyService().deleteByCcyNmIdx(argName);
	}


	/**
	 *	Delete the ISOCcy instances identified by the key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteISOCcyByCcyNmIdx( ISecureAuthorization Authorization,
		ISecureISOCcyByCcyNmIdxKey argKey )
	{
		final String S_ProcName = "deleteISOCcyByCcyNmIdx";
		boolean permissionGranted = canDeleteISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getISOCcyService().deleteByCcyNmIdx(argKey.getRequiredName());
	}


	/**
	 *	Read the derived ISOCcy record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCcy readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureISOCcy retval = schema.getJpaHooksSchema().getISOCcyService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived ISOCcy record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCcy lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureISOCcy retval = schema.getJpaHooksSchema().getISOCcyService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all ISOCcy instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureISOCcy[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaISOCcy> retlist = schema.getJpaHooksSchema().getISOCcyService().findAll();
		ISecureISOCcy[] retset = new ISecureISOCcy[retlist.size()];
		int idx = 0;
		for (SecureJpaISOCcy cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived ISOCcy record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCcy readDerivedByIdIdx( ISecureAuthorization Authorization,
		short argISOCcyId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureISOCcy retval = schema.getJpaHooksSchema().getISOCcyService().find(argISOCcyId);
		return(retval);
	}

	/**
	 *	Read the derived ISOCcy record instance identified by the unique key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCcy readDerivedByCcyCdIdx( ISecureAuthorization Authorization,
		String argISOCode )
	{
		final String S_ProcName = "readDerivedByCcyCdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureISOCcy retval = schema.getJpaHooksSchema().getISOCcyService().findByCcyCdIdx(argISOCode);
		return(retval);
	}

	/**
	 *	Read the derived ISOCcy record instance identified by the unique key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureISOCcy readDerivedByCcyNmIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "readDerivedByCcyNmIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureISOCcy retval = schema.getJpaHooksSchema().getISOCcyService().findByCcyNmIdx(argName);
		return(retval);
	}

	/**
	 *	Read the specific ISOCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCcy readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific ISOCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCcy lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific ISOCcy record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCcy instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureISOCcy[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific ISOCcy record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCcy readRecByIdIdx( ISecureAuthorization Authorization,
		short argISOCcyId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific ISOCcy record instance identified by the unique key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCcy readRecByCcyCdIdx( ISecureAuthorization Authorization,
		String argISOCode )
	{
		final String S_ProcName = "readRecByCcyCdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByCcyCdIdx");
	}

	/**
	 *	Read the specific ISOCcy record instance identified by the unique key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureISOCcy readRecByCcyNmIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "readRecByCcyNmIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadISOCcy(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readisoccy", ISecureSchema.SCHEMA_NAME, ISecureISOCcyTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByCcyNmIdx");
	}
}
