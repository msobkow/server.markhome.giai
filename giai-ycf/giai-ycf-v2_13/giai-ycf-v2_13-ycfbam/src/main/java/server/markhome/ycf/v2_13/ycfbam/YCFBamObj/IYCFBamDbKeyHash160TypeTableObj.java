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

public interface IYCFBamDbKeyHash160TypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash160Type instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDbKeyHash160TypeObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash160Type edition of the specified DbKeyHash160Type instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDbKeyHash160TypeEditObj newEditInstance( IYCFBamDbKeyHash160TypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash160TypeObj realiseDbKeyHash160Type( IYCFBamDbKeyHash160TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash160TypeObj createDbKeyHash160Type( IYCFBamDbKeyHash160TypeObj Obj );

	/**
	 *	Read a DbKeyHash160Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash160TypeObj readDbKeyHash160Type( YCFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash160Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash160TypeObj readDbKeyHash160Type( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDbKeyHash160TypeObj readCachedDbKeyHash160Type( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash160Type( IYCFBamDbKeyHash160TypeObj obj );

	void deepDisposeDbKeyHash160Type( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash160TypeObj lockDbKeyHash160Type( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash160Type-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash160TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readAllDbKeyHash160Type();

	/**
	 *	Return a sorted map of all the DbKeyHash160Type-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash160TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readAllDbKeyHash160Type( boolean forceRead );

	List<IYCFBamDbKeyHash160TypeObj> readCachedAllDbKeyHash160Type();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash160TypeObj readDbKeyHash160TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash160TypeObj readDbKeyHash160TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash160TypeObj readDbKeyHash160TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash160TypeObj readDbKeyHash160TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160TypeObj> readDbKeyHash160TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamDbKeyHash160TypeObj readCachedDbKeyHash160TypeByIdIdx( long TenantId,
		long Id );

	IYCFBamDbKeyHash160TypeObj readCachedDbKeyHash160TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByValTentIdx( long TenantId );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash160TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash160TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash160TypeByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash160TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash160TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash160TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash160TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash160TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash160TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash160TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash160TypeObj updateDbKeyHash160Type( IYCFBamDbKeyHash160TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash160Type( IYCFBamDbKeyHash160TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash160Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamDbKeyHash160TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash160TypeObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash160TypeObj moveUpDbKeyHash160Type( IYCFBamDbKeyHash160TypeObj Obj );

	/**
	 *	Move the YCFBamDbKeyHash160TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash160TypeObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash160TypeObj moveDownDbKeyHash160Type( IYCFBamDbKeyHash160TypeObj Obj );
}
