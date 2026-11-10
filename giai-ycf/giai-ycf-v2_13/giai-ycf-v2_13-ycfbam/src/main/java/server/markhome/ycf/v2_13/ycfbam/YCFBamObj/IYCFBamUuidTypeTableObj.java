// Description: Java 11 Table Object interface for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamUuidTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UuidType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamUuidTypeObj newInstance();

	/**
	 *	Instantiate a new UuidType edition of the specified UuidType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamUuidTypeEditObj newEditInstance( IYCFBamUuidTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidTypeObj realiseUuidType( IYCFBamUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidTypeObj createUuidType( IYCFBamUuidTypeObj Obj );

	/**
	 *	Read a UuidType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuidTypeObj readUuidType( YCFBamValuePKey pkey );

	/**
	 *	Read a UuidType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuidTypeObj readUuidType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamUuidTypeObj readCachedUuidType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeUuidType( IYCFBamUuidTypeObj obj );

	void deepDisposeUuidType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidTypeObj lockUuidType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UuidType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuidTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuidTypeObj> readAllUuidType();

	/**
	 *	Return a sorted map of all the UuidType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuidTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuidTypeObj> readAllUuidType( boolean forceRead );

	List<IYCFBamUuidTypeObj> readCachedAllUuidType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidTypeObj readUuidTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidTypeObj readUuidTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidTypeObj readUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidTypeObj readUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidTypeObj> readUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamUuidTypeObj readCachedUuidTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamUuidTypeObj readCachedUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeByValTentIdx( long TenantId );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuidTypeObj> readCachedUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeUuidTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuidTypeByValTentIdx( long TenantId );

	void deepDisposeUuidTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuidTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuidTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidTypeObj updateUuidType( IYCFBamUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidType( IYCFBamUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamUuidTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuidTypeObj refreshed cache instance.
	 */
	IYCFBamUuidTypeObj moveUpUuidType( IYCFBamUuidTypeObj Obj );

	/**
	 *	Move the YCFBamUuidTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuidTypeObj refreshed cache instance.
	 */
	IYCFBamUuidTypeObj moveDownUuidType( IYCFBamUuidTypeObj Obj );
}
