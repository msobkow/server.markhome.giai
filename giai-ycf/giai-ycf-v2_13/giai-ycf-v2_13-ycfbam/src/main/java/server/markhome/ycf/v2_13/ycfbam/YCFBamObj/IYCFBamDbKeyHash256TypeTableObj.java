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

public interface ICFBamDbKeyHash256TypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash256Type instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash256TypeObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash256Type edition of the specified DbKeyHash256Type instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash256TypeEditObj newEditInstance( ICFBamDbKeyHash256TypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash256TypeObj realiseDbKeyHash256Type( ICFBamDbKeyHash256TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash256TypeObj createDbKeyHash256Type( ICFBamDbKeyHash256TypeObj Obj );

	/**
	 *	Read a DbKeyHash256Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash256TypeObj readDbKeyHash256Type( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash256Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash256TypeObj readDbKeyHash256Type( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash256TypeObj readCachedDbKeyHash256Type( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash256Type( ICFBamDbKeyHash256TypeObj obj );

	void deepDisposeDbKeyHash256Type( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash256TypeObj lockDbKeyHash256Type( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash256Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash256TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readAllDbKeyHash256Type();

	/**
	 *	Return a sorted map of all the DbKeyHash256Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash256TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readAllDbKeyHash256Type( boolean forceRead );

	List<ICFBamDbKeyHash256TypeObj> readCachedAllDbKeyHash256Type();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash256TypeObj readDbKeyHash256TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash256TypeObj readDbKeyHash256TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash256TypeObj readDbKeyHash256TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash256TypeObj readDbKeyHash256TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash256TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash256TypeObj> readDbKeyHash256TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamDbKeyHash256TypeObj readCachedDbKeyHash256TypeByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash256TypeObj readCachedDbKeyHash256TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash256TypeObj> readCachedDbKeyHash256TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash256TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash256TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash256TypeByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash256TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash256TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash256TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash256TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash256TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash256TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash256TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash256TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash256TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash256TypeObj updateDbKeyHash256Type( ICFBamDbKeyHash256TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash256Type( ICFBamDbKeyHash256TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash256Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamDbKeyHash256TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash256TypeObj refreshed cache instance.
	 */
	ICFBamDbKeyHash256TypeObj moveUpDbKeyHash256Type( ICFBamDbKeyHash256TypeObj Obj );

	/**
	 *	Move the CFBamDbKeyHash256TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash256TypeObj refreshed cache instance.
	 */
	ICFBamDbKeyHash256TypeObj moveDownDbKeyHash256Type( ICFBamDbKeyHash256TypeObj Obj );
}
