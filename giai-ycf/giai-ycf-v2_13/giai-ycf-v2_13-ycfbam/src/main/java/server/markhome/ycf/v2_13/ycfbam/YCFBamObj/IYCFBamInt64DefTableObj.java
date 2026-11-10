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

public interface IYCFBamInt64DefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int64Def instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamInt64DefObj newInstance();

	/**
	 *	Instantiate a new Int64Def edition of the specified Int64Def instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamInt64DefEditObj newEditInstance( IYCFBamInt64DefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt64DefObj realiseInt64Def( IYCFBamInt64DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt64DefObj createInt64Def( IYCFBamInt64DefObj Obj );

	/**
	 *	Read a Int64Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamInt64DefObj readInt64Def( YCFBamValuePKey pkey );

	/**
	 *	Read a Int64Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamInt64DefObj readInt64Def( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamInt64DefObj readCachedInt64Def( YCFBamValuePKey pkey );

	public void reallyDeepDisposeInt64Def( IYCFBamInt64DefObj obj );

	void deepDisposeInt64Def( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt64DefObj lockInt64Def( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int64Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamInt64DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamInt64DefObj> readAllInt64Def();

	/**
	 *	Return a sorted map of all the Int64Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamInt64DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamInt64DefObj> readAllInt64Def( boolean forceRead );

	List<IYCFBamInt64DefObj> readCachedAllInt64Def();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt64DefObj readInt64DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt64DefObj readInt64DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt64DefObj readInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt64DefObj readInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamInt64DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamInt64DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamInt64DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamInt64DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamInt64DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamInt64DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamInt64DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamInt64DefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamInt64DefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64DefObj> readInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamInt64DefObj readCachedInt64DefByIdIdx( long TenantId,
		long Id );

	IYCFBamInt64DefObj readCachedInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamInt64DefObj> readCachedInt64DefByValTentIdx( long TenantId );

	List<IYCFBamInt64DefObj> readCachedInt64DefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamInt64DefObj> readCachedInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamInt64DefObj> readCachedInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamInt64DefObj> readCachedInt64DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamInt64DefObj> readCachedInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamInt64DefObj> readCachedInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamInt64DefObj> readCachedInt64DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamInt64DefObj> readCachedInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt64DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt64DefByValTentIdx( long TenantId );

	void deepDisposeInt64DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt64DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt64DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt64DefObj updateInt64Def( IYCFBamInt64DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt64Def( IYCFBamInt64DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Def key attribute of the instance generating the id.
	 */
	void deleteInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamInt64DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamInt64DefObj refreshed cache instance.
	 */
	IYCFBamInt64DefObj moveUpInt64Def( IYCFBamInt64DefObj Obj );

	/**
	 *	Move the YCFBamInt64DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamInt64DefObj refreshed cache instance.
	 */
	IYCFBamInt64DefObj moveDownInt64Def( IYCFBamInt64DefObj Obj );
}
