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

public interface IYCFBamTimeTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TimeType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTimeTypeObj newInstance();

	/**
	 *	Instantiate a new TimeType edition of the specified TimeType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTimeTypeEditObj newEditInstance( IYCFBamTimeTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeTypeObj realiseTimeType( IYCFBamTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeTypeObj createTimeType( IYCFBamTimeTypeObj Obj );

	/**
	 *	Read a TimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimeTypeObj readTimeType( YCFBamValuePKey pkey );

	/**
	 *	Read a TimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimeTypeObj readTimeType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTimeTypeObj readCachedTimeType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTimeType( IYCFBamTimeTypeObj obj );

	void deepDisposeTimeType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeTypeObj lockTimeType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TimeType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimeTypeObj> readAllTimeType();

	/**
	 *	Return a sorted map of all the TimeType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimeTypeObj> readAllTimeType( boolean forceRead );

	List<IYCFBamTimeTypeObj> readCachedAllTimeType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeTypeObj readTimeTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeTypeObj readTimeTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeTypeObj readTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeTypeObj readTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamTimeTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeTypeObj> readTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamTimeTypeObj readCachedTimeTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamTimeTypeObj readCachedTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeByValTentIdx( long TenantId );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTimeTypeObj> readCachedTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTimeTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTimeTypeByValTentIdx( long TenantId );

	void deepDisposeTimeTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTimeTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTimeTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeTypeObj updateTimeType( IYCFBamTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeType( IYCFBamTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamTimeTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimeTypeObj refreshed cache instance.
	 */
	IYCFBamTimeTypeObj moveUpTimeType( IYCFBamTimeTypeObj Obj );

	/**
	 *	Move the YCFBamTimeTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimeTypeObj refreshed cache instance.
	 */
	IYCFBamTimeTypeObj moveDownTimeType( IYCFBamTimeTypeObj Obj );
}
