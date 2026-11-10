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

public interface IYCFBamDbKeyHash160DefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash160Def instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDbKeyHash160DefObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash160Def edition of the specified DbKeyHash160Def instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDbKeyHash160DefEditObj newEditInstance( IYCFBamDbKeyHash160DefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash160DefObj realiseDbKeyHash160Def( IYCFBamDbKeyHash160DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash160DefObj createDbKeyHash160Def( IYCFBamDbKeyHash160DefObj Obj );

	/**
	 *	Read a DbKeyHash160Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash160DefObj readDbKeyHash160Def( YCFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash160Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash160DefObj readDbKeyHash160Def( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDbKeyHash160DefObj readCachedDbKeyHash160Def( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash160Def( IYCFBamDbKeyHash160DefObj obj );

	void deepDisposeDbKeyHash160Def( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash160DefObj lockDbKeyHash160Def( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash160Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash160DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readAllDbKeyHash160Def();

	/**
	 *	Return a sorted map of all the DbKeyHash160Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash160DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readAllDbKeyHash160Def( boolean forceRead );

	List<IYCFBamDbKeyHash160DefObj> readCachedAllDbKeyHash160Def();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash160DefObj readDbKeyHash160DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash160DefObj readDbKeyHash160DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash160DefObj readDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash160DefObj readDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash160DefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash160DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash160DefObj> readDbKeyHash160DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamDbKeyHash160DefObj readCachedDbKeyHash160DefByIdIdx( long TenantId,
		long Id );

	IYCFBamDbKeyHash160DefObj readCachedDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByValTentIdx( long TenantId );

	List<IYCFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash160DefObj> readCachedDbKeyHash160DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash160DefByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash160DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash160DefObj updateDbKeyHash160Def( IYCFBamDbKeyHash160DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash160Def( IYCFBamDbKeyHash160DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamDbKeyHash160DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash160DefObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash160DefObj moveUpDbKeyHash160Def( IYCFBamDbKeyHash160DefObj Obj );

	/**
	 *	Move the YCFBamDbKeyHash160DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash160DefObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash160DefObj moveDownDbKeyHash160Def( IYCFBamDbKeyHash160DefObj Obj );
}
