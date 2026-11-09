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

public interface ICFBamDbKeyHash160TypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash160Type instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash160TypeObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash160Type edition of the specified DbKeyHash160Type instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash160TypeEditObj newEditInstance( ICFBamDbKeyHash160TypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160TypeObj realiseDbKeyHash160Type( ICFBamDbKeyHash160TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160TypeObj createDbKeyHash160Type( ICFBamDbKeyHash160TypeObj Obj );

	/**
	 *	Read a DbKeyHash160Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash160TypeObj readDbKeyHash160Type( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash160Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash160TypeObj readDbKeyHash160Type( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash160TypeObj readCachedDbKeyHash160Type( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash160Type( ICFBamDbKeyHash160TypeObj obj );

	void deepDisposeDbKeyHash160Type( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160TypeObj lockDbKeyHash160Type( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash160Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash160TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readAllDbKeyHash160Type();

	/**
	 *	Return a sorted map of all the DbKeyHash160Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash160TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readAllDbKeyHash160Type( boolean forceRead );

	List<ICFBamDbKeyHash160TypeObj> readCachedAllDbKeyHash160Type();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160TypeObj readDbKeyHash160TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160TypeObj readDbKeyHash160TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160TypeObj readDbKeyHash160TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160TypeObj readDbKeyHash160TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash160Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160TypeObj> readDbKeyHash160TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamDbKeyHash160TypeObj readCachedDbKeyHash160TypeByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash160TypeObj readCachedDbKeyHash160TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash160TypeObj> readCachedDbKeyHash160TypeBySchemaIdx( long TenantId,
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

	void deepDisposeDbKeyHash160TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160TypeObj updateDbKeyHash160Type( ICFBamDbKeyHash160TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash160Type( ICFBamDbKeyHash160TypeObj Obj );

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
	void deleteDbKeyHash160TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

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
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
	 *	Move the CFBamDbKeyHash160TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash160TypeObj refreshed cache instance.
	 */
	ICFBamDbKeyHash160TypeObj moveUpDbKeyHash160Type( ICFBamDbKeyHash160TypeObj Obj );

	/**
	 *	Move the CFBamDbKeyHash160TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash160TypeObj refreshed cache instance.
	 */
	ICFBamDbKeyHash160TypeObj moveDownDbKeyHash160Type( ICFBamDbKeyHash160TypeObj Obj );
}
