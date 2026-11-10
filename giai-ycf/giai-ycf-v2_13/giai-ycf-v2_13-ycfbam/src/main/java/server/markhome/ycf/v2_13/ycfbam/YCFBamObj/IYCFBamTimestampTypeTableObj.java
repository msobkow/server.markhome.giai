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

public interface IYCFBamTimestampTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TimestampType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTimestampTypeObj newInstance();

	/**
	 *	Instantiate a new TimestampType edition of the specified TimestampType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTimestampTypeEditObj newEditInstance( IYCFBamTimestampTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimestampTypeObj realiseTimestampType( IYCFBamTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimestampTypeObj createTimestampType( IYCFBamTimestampTypeObj Obj );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimestampTypeObj readTimestampType( YCFBamValuePKey pkey );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimestampTypeObj readTimestampType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTimestampTypeObj readCachedTimestampType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTimestampType( IYCFBamTimestampTypeObj obj );

	void deepDisposeTimestampType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimestampTypeObj lockTimestampType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readAllTimestampType();

	/**
	 *	Return a sorted map of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readAllTimestampType( boolean forceRead );

	List<IYCFBamTimestampTypeObj> readCachedAllTimestampType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimestampTypeObj readTimestampTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimestampTypeObj readTimestampTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimestampTypeObj readTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimestampTypeObj readTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampTypeObj> readTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamTimestampTypeObj readCachedTimestampTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamTimestampTypeObj readCachedTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeByValTentIdx( long TenantId );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTimestampTypeObj> readCachedTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTimestampTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTimestampTypeByValTentIdx( long TenantId );

	void deepDisposeTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimestampTypeObj updateTimestampType( IYCFBamTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampType( IYCFBamTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamTimestampTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimestampTypeObj refreshed cache instance.
	 */
	IYCFBamTimestampTypeObj moveUpTimestampType( IYCFBamTimestampTypeObj Obj );

	/**
	 *	Move the YCFBamTimestampTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimestampTypeObj refreshed cache instance.
	 */
	IYCFBamTimestampTypeObj moveDownTimestampType( IYCFBamTimestampTypeObj Obj );
}
