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

public interface IYCFBamDbKeyHash384DefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash384Def instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDbKeyHash384DefObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash384Def edition of the specified DbKeyHash384Def instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDbKeyHash384DefEditObj newEditInstance( IYCFBamDbKeyHash384DefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash384DefObj realiseDbKeyHash384Def( IYCFBamDbKeyHash384DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash384DefObj createDbKeyHash384Def( IYCFBamDbKeyHash384DefObj Obj );

	/**
	 *	Read a DbKeyHash384Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash384Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash384DefObj readDbKeyHash384Def( YCFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash384Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash384Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash384DefObj readDbKeyHash384Def( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDbKeyHash384DefObj readCachedDbKeyHash384Def( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash384Def( IYCFBamDbKeyHash384DefObj obj );

	void deepDisposeDbKeyHash384Def( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash384DefObj lockDbKeyHash384Def( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash384Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash384DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readAllDbKeyHash384Def();

	/**
	 *	Return a sorted map of all the DbKeyHash384Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash384DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readAllDbKeyHash384Def( boolean forceRead );

	List<IYCFBamDbKeyHash384DefObj> readCachedAllDbKeyHash384Def();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash384DefObj readDbKeyHash384DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash384DefObj readDbKeyHash384DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash384DefObj readDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash384DefObj readDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash384DefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash384DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash384DefObj> readDbKeyHash384DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamDbKeyHash384DefObj readCachedDbKeyHash384DefByIdIdx( long TenantId,
		long Id );

	IYCFBamDbKeyHash384DefObj readCachedDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByValTentIdx( long TenantId );

	List<IYCFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash384DefObj> readCachedDbKeyHash384DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash384DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash384DefByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash384DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash384DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash384DefObj updateDbKeyHash384Def( IYCFBamDbKeyHash384DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash384Def( IYCFBamDbKeyHash384DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamDbKeyHash384DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash384DefObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash384DefObj moveUpDbKeyHash384Def( IYCFBamDbKeyHash384DefObj Obj );

	/**
	 *	Move the YCFBamDbKeyHash384DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash384DefObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash384DefObj moveDownDbKeyHash384Def( IYCFBamDbKeyHash384DefObj Obj );
}
