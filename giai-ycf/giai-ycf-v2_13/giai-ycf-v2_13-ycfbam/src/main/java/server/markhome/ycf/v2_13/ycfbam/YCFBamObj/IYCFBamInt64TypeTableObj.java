// Description: Java 11 Table Object interface for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamInt64TypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int64Type instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamInt64TypeObj newInstance();

	/**
	 *	Instantiate a new Int64Type edition of the specified Int64Type instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamInt64TypeEditObj newEditInstance( ICFBamInt64TypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamInt64TypeObj realiseInt64Type( ICFBamInt64TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamInt64TypeObj createInt64Type( ICFBamInt64TypeObj Obj );

	/**
	 *	Read a Int64Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt64TypeObj readInt64Type( CFBamValuePKey pkey );

	/**
	 *	Read a Int64Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt64TypeObj readInt64Type( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamInt64TypeObj readCachedInt64Type( CFBamValuePKey pkey );

	public void reallyDeepDisposeInt64Type( ICFBamInt64TypeObj obj );

	void deepDisposeInt64Type( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamInt64TypeObj lockInt64Type( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int64Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt64TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt64TypeObj> readAllInt64Type();

	/**
	 *	Return a sorted map of all the Int64Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt64TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt64TypeObj> readAllInt64Type( boolean forceRead );

	List<ICFBamInt64TypeObj> readCachedAllInt64Type();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt64TypeObj readInt64TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt64TypeObj readInt64TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt64TypeObj readInt64TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt64TypeObj readInt64TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64TypeObj> readInt64TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamInt64TypeObj readCachedInt64TypeByIdIdx( long TenantId,
		long Id );

	ICFBamInt64TypeObj readCachedInt64TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamInt64TypeObj> readCachedInt64TypeByValTentIdx( long TenantId );

	List<ICFBamInt64TypeObj> readCachedInt64TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamInt64TypeObj> readCachedInt64TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamInt64TypeObj> readCachedInt64TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamInt64TypeObj> readCachedInt64TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamInt64TypeObj> readCachedInt64TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamInt64TypeObj> readCachedInt64TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamInt64TypeObj> readCachedInt64TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamInt64TypeObj> readCachedInt64TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamInt64TypeObj> readCachedInt64TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeInt64TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt64TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt64TypeByValTentIdx( long TenantId );

	void deepDisposeInt64TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt64TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt64TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt64TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt64TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt64TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt64TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt64TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt64TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamInt64TypeObj updateInt64Type( ICFBamInt64TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt64Type( ICFBamInt64TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamInt64TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt64TypeObj refreshed cache instance.
	 */
	ICFBamInt64TypeObj moveUpInt64Type( ICFBamInt64TypeObj Obj );

	/**
	 *	Move the CFBamInt64TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt64TypeObj refreshed cache instance.
	 */
	ICFBamInt64TypeObj moveDownInt64Type( ICFBamInt64TypeObj Obj );
}
