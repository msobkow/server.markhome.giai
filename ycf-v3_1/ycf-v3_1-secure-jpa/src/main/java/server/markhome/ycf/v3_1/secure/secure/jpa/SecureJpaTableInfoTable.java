
// Description: Java 25 DbIO implementation for TableInfo.

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
 *	SecureJpaTableInfoTable database implementation for TableInfo
 */
public class SecureJpaTableInfoTable implements ISecureTableInfoTable
{
	protected SecureJpaSchema schema;


	public SecureJpaTableInfoTable(ISecureSchema schema) {
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

	protected boolean canCreateTableInfo(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "createtableinfo");
		}
		return( permissionGranted );
	}

	protected boolean canReadTableInfo(String S_ProcName, ISecureAuthorization Authorization) {
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

	protected boolean canUpdateTableInfo(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "updatetableinfo");
		}
		return( permissionGranted );
	}

	protected boolean canDeleteTableInfo(String S_ProcName, ISecureAuthorization Authorization) {
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
			permissionGranted = ISecureSchema.getSecurityService().isMemberOfSystemGroup(Authorization.getSecUserId(), "deletetableinfo");
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
	public ISecureTableInfo createTableInfo( ISecureAuthorization Authorization,
		ISecureTableInfo rec )
	{
		final String S_ProcName = "createTableInfo";
		boolean permissionGranted = canCreateTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "createtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "createTableInfo", 1, "rec");
		}
		else if (rec instanceof SecureJpaTableInfo) {
			SecureJpaTableInfo jparec = (SecureJpaTableInfo)rec;
			SecureJpaTableInfo retval = schema.getJpaHooksSchema().getTableInfoService().create(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "createTableInfo", "rec", rec, "SecureJpaTableInfo");
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
	public ISecureTableInfo updateTableInfo( ISecureAuthorization Authorization,
		ISecureTableInfo rec )
	{
		final String S_ProcName = "updateTableInfo";
		boolean permissionGranted = canUpdateTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			throw new CFNullArgumentException(getClass(), "updateTableInfo", 1, "rec");
		}
		else if (rec instanceof SecureJpaTableInfo) {
			SecureJpaTableInfo jparec = (SecureJpaTableInfo)rec;
			SecureJpaTableInfo retval = schema.getJpaHooksSchema().getTableInfoService().update(jparec);
		return(retval);
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "updateTableInfo", "rec", rec, "SecureJpaTableInfo");
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
	public void deleteTableInfo( ISecureAuthorization Authorization,
		ISecureTableInfo rec )
	{
		final String S_ProcName = "deleteTableInfo";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		if (rec == null) {
			return;
		}
		if (rec instanceof SecureJpaTableInfo) {
			SecureJpaTableInfo jparec = (SecureJpaTableInfo)rec;
			schema.getJpaHooksSchema().getTableInfoService().deleteByIdIdx(jparec.getPKey());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "deleteTableInfo", "rec", rec, "SecureJpaTableInfo");
		}

		throw new CFNotImplementedYetException(getClass(), "deleteTableInfo");
	}

	/**
	 *	Delete the TableInfo instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	@Override
	public void deleteTableInfoByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		final String S_ProcName = "deleteTableInfoByIdIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteByIdIdx(argKey);
	}

	/**
	 *	Delete the TableInfo instances identified by the key TableNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableName	The TableInfo key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTableInfoByTableNameIdx( ISecureAuthorization Authorization,
		String argTableName )
	{
		final String S_ProcName = "deleteTableInfoByTableNameIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteByTableNameIdx(argTableName);
	}


	/**
	 *	Delete the TableInfo instances identified by the key TableNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTableInfoByTableNameIdx( ISecureAuthorization Authorization,
		ISecureTableInfoByTableNameIdxKey argKey )
	{
		final String S_ProcName = "deleteTableInfoByTableNameIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteByTableNameIdx(argKey.getRequiredTableName());
	}

	/**
	 *	Delete the TableInfo instances identified by the key SuperNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SuperName	The TableInfo key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTableInfoBySuperNameIdx( ISecureAuthorization Authorization,
		String argSuperName )
	{
		final String S_ProcName = "deleteTableInfoBySuperNameIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteBySuperNameIdx(argSuperName);
	}


	/**
	 *	Delete the TableInfo instances identified by the key SuperNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTableInfoBySuperNameIdx( ISecureAuthorization Authorization,
		ISecureTableInfoBySuperNameIdxKey argKey )
	{
		final String S_ProcName = "deleteTableInfoBySuperNameIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteBySuperNameIdx(argKey.getOptionalSuperName());
	}

	/**
	 *	Delete the TableInfo instances identified by the key SchemaNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTableInfoBySchemaNameIdx( ISecureAuthorization Authorization,
		String argSchemaName )
	{
		final String S_ProcName = "deleteTableInfoBySchemaNameIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteBySchemaNameIdx(argSchemaName);
	}


	/**
	 *	Delete the TableInfo instances identified by the key SchemaNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTableInfoBySchemaNameIdx( ISecureAuthorization Authorization,
		ISecureTableInfoBySchemaNameIdxKey argKey )
	{
		final String S_ProcName = "deleteTableInfoBySchemaNameIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteBySchemaNameIdx(argKey.getRequiredSchemaName());
	}

	/**
	 *	Delete the TableInfo instances identified by the key SchemaBkCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@param	BackingClassCode	The TableInfo key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTableInfoBySchemaBkCodeIdx( ISecureAuthorization Authorization,
		String argSchemaName,
		int argBackingClassCode )
	{
		final String S_ProcName = "deleteTableInfoBySchemaBkCodeIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteBySchemaBkCodeIdx(argSchemaName,
		argBackingClassCode);
	}


	/**
	 *	Delete the TableInfo instances identified by the key SchemaBkCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTableInfoBySchemaBkCodeIdx( ISecureAuthorization Authorization,
		ISecureTableInfoBySchemaBkCodeIdxKey argKey )
	{
		final String S_ProcName = "deleteTableInfoBySchemaBkCodeIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteBySchemaBkCodeIdx(argKey.getRequiredSchemaName(),
			argKey.getRequiredBackingClassCode());
	}

	/**
	 *	Delete the TableInfo instances identified by the key SchemaRTCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RuntimeClassCode	The TableInfo key attribute of the instance generating the id.
	 */
	@Override
	public void deleteTableInfoBySchemaRTCodeIdx( ISecureAuthorization Authorization,
		int argRuntimeClassCode )
	{
		final String S_ProcName = "deleteTableInfoBySchemaRTCodeIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteBySchemaRTCodeIdx(argRuntimeClassCode);
	}


	/**
	 *	Delete the TableInfo instances identified by the key SchemaRTCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	@Override
	public void deleteTableInfoBySchemaRTCodeIdx( ISecureAuthorization Authorization,
		ISecureTableInfoBySchemaRTCodeIdxKey argKey )
	{
		final String S_ProcName = "deleteTableInfoBySchemaRTCodeIdx";
		boolean permissionGranted = canDeleteTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "deletetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		schema.getJpaHooksSchema().getTableInfoService().deleteBySchemaRTCodeIdx(argKey.getRequiredRuntimeClassCode());
	}


	/**
	 *	Read the derived TableInfo record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableInfo instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTableInfo readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readDerived";
		boolean permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureTableInfo retval = schema.getJpaHooksSchema().getTableInfoService().find(PKey);
		return(retval);
	}

	/**
	 *	Lock the derived TableInfo record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableInfo instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTableInfo lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockDerived";
		boolean permissionGranted = canUpdateTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		ISecureTableInfo retval = schema.getJpaHooksSchema().getTableInfoService().lockByIdIdx(PKey);
		return(retval);
	}

	/**
	 *	Read all TableInfo instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureTableInfo[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllDerived";
		boolean permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		List<SecureJpaTableInfo> retlist = schema.getJpaHooksSchema().getTableInfoService().findAll();
		ISecureTableInfo[] retset = new ISecureTableInfo[retlist.size()];
		int idx = 0;
		for (SecureJpaTableInfo cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived TableInfo record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableInfoId	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTableInfo readDerivedByIdIdx( ISecureAuthorization Authorization,
		int argTableInfoId )
	{
		final String S_ProcName = "readDerivedByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureTableInfo retval = schema.getJpaHooksSchema().getTableInfoService().find(argTableInfoId);
		return(retval);
	}

	/**
	 *	Read the derived TableInfo record instance identified by the unique key TableNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTableInfo readDerivedByTableNameIdx( ISecureAuthorization Authorization,
		String argTableName )
	{
		final String S_ProcName = "readDerivedByTableNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureTableInfo retval = schema.getJpaHooksSchema().getTableInfoService().findByTableNameIdx(argTableName);
		return(retval);
	}

	/**
	 *	Read an array of the derived TableInfo record instances identified by the duplicate key SuperNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SuperName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureTableInfo[] readDerivedBySuperNameIdx( ISecureAuthorization Authorization,
		String argSuperName )
	{
		final String S_ProcName = "readDerivedBySuperNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaTableInfo> retlist = schema.getJpaHooksSchema().getTableInfoService().findBySuperNameIdx(argSuperName);
		ISecureTableInfo[] retset = new ISecureTableInfo[retlist.size()];
		int idx = 0;
		for (SecureJpaTableInfo cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read an array of the derived TableInfo record instances identified by the duplicate key SchemaNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	@Override
	public ISecureTableInfo[] readDerivedBySchemaNameIdx( ISecureAuthorization Authorization,
		String argSchemaName )
	{
		final String S_ProcName = "readDerivedBySchemaNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		List<SecureJpaTableInfo> retlist = schema.getJpaHooksSchema().getTableInfoService().findBySchemaNameIdx(argSchemaName);
		ISecureTableInfo[] retset = new ISecureTableInfo[retlist.size()];
		int idx = 0;
		for (SecureJpaTableInfo cur: retlist) {
			retset[idx++] = cur;
		}
		return( retset );
	}

	/**
	 *	Read the derived TableInfo record instance identified by the unique key SchemaBkCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@param	BackingClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTableInfo readDerivedBySchemaBkCodeIdx( ISecureAuthorization Authorization,
		String argSchemaName,
		int argBackingClassCode )
	{
		final String S_ProcName = "readDerivedBySchemaBkCodeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureTableInfo retval = schema.getJpaHooksSchema().getTableInfoService().findBySchemaBkCodeIdx(argSchemaName,
		argBackingClassCode);
		return(retval);
	}

	/**
	 *	Read the derived TableInfo record instance identified by the unique key SchemaRTCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RuntimeClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	@Override
	public ISecureTableInfo readDerivedBySchemaRTCodeIdx( ISecureAuthorization Authorization,
		int argRuntimeClassCode )
	{
		final String S_ProcName = "readDerivedBySchemaRTCodeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		ISecureTableInfo retval = schema.getJpaHooksSchema().getTableInfoService().findBySchemaRTCodeIdx(argRuntimeClassCode);
		return(retval);
	}

	/**
	 *	Read the specific TableInfo record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableInfo instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTableInfo readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "readRec";
		boolean permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readRec");
	}

	/**
	 *	Lock the specific TableInfo record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableInfo instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTableInfo lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		boolean permissionGranted = canUpdateTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "updatetableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "lockRec");
	}

	/**
	 *	Read all the specific TableInfo record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TableInfo instances in the database accessible for the Authorization.
	 */
	@Override
	public ISecureTableInfo[] readAllRec( ISecureAuthorization Authorization ) {
		final String S_ProcName = "readAllRec";
		boolean permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}

		throw new CFNotImplementedYetException(getClass(), "readAllRec");
	}


	/**
	 *	Read the specific TableInfo record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableInfoId	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTableInfo readRecByIdIdx( ISecureAuthorization Authorization,
		int argTableInfoId )
	{
		final String S_ProcName = "readRecByIdIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByIdIdx");
	}

	/**
	 *	Read the specific TableInfo record instance identified by the unique key TableNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTableInfo readRecByTableNameIdx( ISecureAuthorization Authorization,
		String argTableName )
	{
		final String S_ProcName = "readRecByTableNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecByTableNameIdx");
	}

	/**
	 *	Read an array of the specific TableInfo record instances identified by the duplicate key SuperNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SuperName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTableInfo[] readRecBySuperNameIdx( ISecureAuthorization Authorization,
		String argSuperName )
	{
		final String S_ProcName = "readRecBySuperNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySuperNameIdx");
	}

	/**
	 *	Read an array of the specific TableInfo record instances identified by the duplicate key SchemaNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTableInfo[] readRecBySchemaNameIdx( ISecureAuthorization Authorization,
		String argSchemaName )
	{
		final String S_ProcName = "readRecBySchemaNameIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySchemaNameIdx");
	}

	/**
	 *	Read the specific TableInfo record instance identified by the unique key SchemaBkCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@param	BackingClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTableInfo readRecBySchemaBkCodeIdx( ISecureAuthorization Authorization,
		String argSchemaName,
		int argBackingClassCode )
	{
		final String S_ProcName = "readRecBySchemaBkCodeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySchemaBkCodeIdx");
	}

	/**
	 *	Read the specific TableInfo record instance identified by the unique key SchemaRTCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RuntimeClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	@Override
	public ISecureTableInfo readRecBySchemaRTCodeIdx( ISecureAuthorization Authorization,
		int argRuntimeClassCode )
	{
		final String S_ProcName = "readRecBySchemaRTCodeIdx";
		boolean permissionGranted = false;
		if (!permissionGranted) {
			permissionGranted = canReadTableInfo(S_ProcName, Authorization);
		}
		if (!permissionGranted) {
			throw new CFPermissionDeniedException(getClass(), S_ProcName, "readtableinfo", ISecureSchema.SCHEMA_NAME, ISecureTableInfoTable.TABLE_NAME, Authorization.getAuthUuid6().toString());//"Permission '%4$s' denied attempting to access %1$s.%2$s for user id %3$s"
		}
		throw new CFNotImplementedYetException(getClass(), "readRecBySchemaRTCodeIdx");
	}
}
