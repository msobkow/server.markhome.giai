
// Description: Java 25 DbIO implementation for URLProtocol.

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
 *	IntNetJpaURLProtocolTable database implementation for URLProtocol
 */
public class IntNetJpaURLProtocolTable implements IIntNetURLProtocolTable
{
	protected IntNetJpaSchema schema;


	public IntNetJpaURLProtocolTable(IIntNetSchema schema) {
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

	protected boolean canCreateURLProtocol(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createurlprotocol");
		}
		return( permissionGranted );
	}

	protected boolean canReadURLProtocol(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "readurlprotocol");
		}
		return( permissionGranted );
	}

	protected boolean canUpdateURLProtocol(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updateurlprotocol");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteURLProtocol(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deleteurlprotocol");
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
	public IIntNetURLProtocol createURLProtocol( ISecureAuthorization Authorization,
		IIntNetURLProtocol rec )
	{
		final String S_ProcName = "createURLProtocol";
		boolean permissionGranted = canCreateURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createURLProtocol", 1, "rec");
		}
		else if (rec instanceof IntNetJpaURLProtocol) {
			IntNetJpaURLProtocol jparec = (IntNetJpaURLProtocol)rec;
			jparec.setCreatedAt(LocalDateTime.now());
			jparec.setUpdatedAt(jparec.getCreatedAt());
			jparec.setCreatedByUserId(Authorization.getSecUserId());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			IntNetJpaURLProtocol retval = schema.getJpaHooksSchema().getURLProtocolService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createURLProtocol", "rec", rec, "IntNetJpaURLProtocol");
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
	public IIntNetURLProtocol updateURLProtocol( ISecureAuthorization Authorization,
		IIntNetURLProtocol rec )
	{
		final String S_ProcName = "updateURLProtocol";
		boolean permissionGranted = canUpdateURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateURLProtocol", 1, "rec");
		}
		else if (rec instanceof IntNetJpaURLProtocol) {
			IntNetJpaURLProtocol jparec = (IntNetJpaURLProtocol)rec;
			jparec.setUpdatedAt(LocalDateTime.now());
			jparec.setUpdatedByUserId(Authorization.getSecUserId());
			IntNetJpaURLProtocol retval = schema.getJpaHooksSchema().getURLProtocolService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateURLProtocol", "rec", rec, "IntNetJpaURLProtocol");
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
	public void deleteURLProtocol( ISecureAuthorization Authorization,
		IIntNetURLProtocol rec )
	{
		final String S_ProcName = "deleteURLProtocol";
		boolean permissionGranted = canDeleteURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof IntNetJpaURLProtocol) {
			IntNetJpaURLProtocol jparec = (IntNetJpaURLProtocol)rec;
			schema.getJpaHooksSchema().getURLProtocolService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteURLProtocol", "rec", rec, "IntNetJpaURLProtocol");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteURLProtocol");
	}

	/**
	 *	Delete the URLProtocol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteURLProtocolByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteURLProtocolByIdIdx";
		boolean permissionGranted = canDeleteURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getURLProtocolService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the URLProtocol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 */
	@Override
	public void deleteURLProtocolByUNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "deleteURLProtocolByUNameIdx";
		boolean permissionGranted = canDeleteURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getURLProtocolService().deleteByUNameIdx(argName);
	}


	/**
	 *	Delete the URLProtocol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteURLProtocolByUNameIdx( ISecureAuthorization Authorization,
		IIntNetURLProtocolByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteURLProtocolByUNameIdx";
		boolean permissionGranted = canDeleteURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getURLProtocolService().deleteByUNameIdx(argKey.getRequiredName());
	}

	/**
	 *	Delete the URLProtocol instances identified by the key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 */
	@Override
	public void deleteURLProtocolByIsSecureIdx( ISecureAuthorization Authorization,
		boolean argIsSecure )
	{
		final String S_ProcName = "deleteURLProtocolByIsSecureIdx";
		boolean permissionGranted = canDeleteURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getURLProtocolService().deleteByIsSecureIdx(argIsSecure);
	}


	/**
	 *	Delete the URLProtocol instances identified by the key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteURLProtocolByIsSecureIdx( ISecureAuthorization Authorization,
		IIntNetURLProtocolByIsSecureIdxKey argKey )
	{
		final String S_ProcName = "deleteURLProtocolByIsSecureIdx";
		boolean permissionGranted = canDeleteURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deleteurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getURLProtocolService().deleteByIsSecureIdx(argKey.getRequiredIsSecure());
	}


	/**
	 *	Read the derived URLProtocol record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetURLProtocol readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IIntNetURLProtocol retval = schema.getJpaHooksSchema().getURLProtocolService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived URLProtocol record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetURLProtocol lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		IIntNetURLProtocol retval = schema.getJpaHooksSchema().getURLProtocolService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all URLProtocol instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public IIntNetURLProtocol[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<IntNetJpaURLProtocol> retlist = schema.getJpaHooksSchema().getURLProtocolService().findAll();
		IIntNetURLProtocol[] retset = new IIntNetURLProtocol[retlist.size()];
		int idx = 0;
		for (IntNetJpaURLProtocol cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived URLProtocol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetURLProtocol readDerivedByIdIdx( ISecureAuthorization Authorization,
		int argURLProtocolId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IIntNetURLProtocol retval = schema.getJpaHooksSchema().getURLProtocolService().find(argURLProtocolId);
		return(retval);
	}

	/**
	 *	Read the derived URLProtocol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public IIntNetURLProtocol readDerivedByUNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "readDerivedByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		IIntNetURLProtocol retval = schema.getJpaHooksSchema().getURLProtocolService().findByUNameIdx(argName);
		return(retval);
	}

	/**
	 *	Read an array of the derived URLProtocol record instances identified by the duplicate key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public IIntNetURLProtocol[] readDerivedByIsSecureIdx( ISecureAuthorization Authorization,
		boolean argIsSecure )
	{
		final String S_ProcName = "readDerivedByIsSecureIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<IntNetJpaURLProtocol> retlist = schema.getJpaHooksSchema().getURLProtocolService().findByIsSecureIdx(argIsSecure);
		IIntNetURLProtocol[] retset = new IIntNetURLProtocol[retlist.size()];
		int idx = 0;
		for (IntNetJpaURLProtocol cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the specific URLProtocol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetURLProtocol readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific URLProtocol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetURLProtocol lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updateurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific URLProtocol record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific URLProtocol instances in the database accessible for the Authorization.
	 */
	@Override
	public IIntNetURLProtocol[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific URLProtocol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetURLProtocol readRecByIdIdx( ISecureAuthorization Authorization,
		int argURLProtocolId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific URLProtocol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetURLProtocol readRecByUNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		final String S_ProcName = "readRecByUNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByUNameIdx");
	}

	/**
	 *	Read an array of the specific URLProtocol record instances identified by the duplicate key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public IIntNetURLProtocol[] readRecByIsSecureIdx( ISecureAuthorization Authorization,
		boolean argIsSecure )
	{
		final String S_ProcName = "readRecByIsSecureIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadURLProtocol(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readurlprotocol", IIntNetSchema.SCHEMA_NAME, IIntNetURLProtocolTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIsSecureIdx");
	}
}
