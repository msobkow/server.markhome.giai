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

public interface IYCFBamInt16TypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int16Type instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamInt16TypeObj newInstance();

	/**
	 *	Instantiate a new Int16Type edition of the specified Int16Type instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamInt16TypeEditObj newEditInstance( IYCFBamInt16TypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt16TypeObj realiseInt16Type( IYCFBamInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt16TypeObj createInt16Type( IYCFBamInt16TypeObj Obj );

	/**
	 *	Read a Int16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamInt16TypeObj readInt16Type( YCFBamValuePKey pkey );

	/**
	 *	Read a Int16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamInt16TypeObj readInt16Type( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamInt16TypeObj readCachedInt16Type( YCFBamValuePKey pkey );

	public void reallyDeepDisposeInt16Type( IYCFBamInt16TypeObj obj );

	void deepDisposeInt16Type( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt16TypeObj lockInt16Type( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int16Type-derived instances in the database.
	 *
	 *	@return	List of IYCFBamInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamInt16TypeObj> readAllInt16Type();

	/**
	 *	Return a sorted map of all the Int16Type-derived instances in the database.
	 *
	 *	@return	List of IYCFBamInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamInt16TypeObj> readAllInt16Type( boolean forceRead );

	List<IYCFBamInt16TypeObj> readCachedAllInt16Type();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt16TypeObj readInt16TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt16TypeObj readInt16TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt16TypeObj readInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt16TypeObj readInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16TypeObj> readInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamInt16TypeObj readCachedInt16TypeByIdIdx( long TenantId,
		long Id );

	IYCFBamInt16TypeObj readCachedInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeByValTentIdx( long TenantId );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamInt16TypeObj> readCachedInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeInt16TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt16TypeByValTentIdx( long TenantId );

	void deepDisposeInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt16TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt16TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt16TypeObj updateInt16Type( IYCFBamInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt16Type( IYCFBamInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamInt16TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamInt16TypeObj refreshed cache instance.
	 */
	IYCFBamInt16TypeObj moveUpInt16Type( IYCFBamInt16TypeObj Obj );

	/**
	 *	Move the YCFBamInt16TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamInt16TypeObj refreshed cache instance.
	 */
	IYCFBamInt16TypeObj moveDownInt16Type( IYCFBamInt16TypeObj Obj );
}
