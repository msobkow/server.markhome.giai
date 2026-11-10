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

public interface IYCFBamDbKeyHash224TypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash224Type instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDbKeyHash224TypeObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash224Type edition of the specified DbKeyHash224Type instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDbKeyHash224TypeEditObj newEditInstance( IYCFBamDbKeyHash224TypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash224TypeObj realiseDbKeyHash224Type( IYCFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash224TypeObj createDbKeyHash224Type( IYCFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Read a DbKeyHash224Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash224TypeObj readDbKeyHash224Type( YCFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash224Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash224TypeObj readDbKeyHash224Type( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDbKeyHash224TypeObj readCachedDbKeyHash224Type( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash224Type( IYCFBamDbKeyHash224TypeObj obj );

	void deepDisposeDbKeyHash224Type( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash224TypeObj lockDbKeyHash224Type( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash224Type-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash224TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readAllDbKeyHash224Type();

	/**
	 *	Return a sorted map of all the DbKeyHash224Type-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash224TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readAllDbKeyHash224Type( boolean forceRead );

	List<IYCFBamDbKeyHash224TypeObj> readCachedAllDbKeyHash224Type();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash224TypeObj readDbKeyHash224TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash224TypeObj readDbKeyHash224TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash224TypeObj readDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash224TypeObj readDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash224TypeObj> readDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamDbKeyHash224TypeObj readCachedDbKeyHash224TypeByIdIdx( long TenantId,
		long Id );

	IYCFBamDbKeyHash224TypeObj readCachedDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByValTentIdx( long TenantId );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash224TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash224TypeByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash224TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash224TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash224TypeObj updateDbKeyHash224Type( IYCFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash224Type( IYCFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamDbKeyHash224TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash224TypeObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash224TypeObj moveUpDbKeyHash224Type( IYCFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Move the YCFBamDbKeyHash224TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash224TypeObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash224TypeObj moveDownDbKeyHash224Type( IYCFBamDbKeyHash224TypeObj Obj );
}
