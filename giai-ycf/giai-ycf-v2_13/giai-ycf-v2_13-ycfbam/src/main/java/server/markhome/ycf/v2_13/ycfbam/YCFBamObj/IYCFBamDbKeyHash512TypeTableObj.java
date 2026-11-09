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

public interface ICFBamDbKeyHash512TypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash512Type instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash512TypeObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash512Type edition of the specified DbKeyHash512Type instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash512TypeEditObj newEditInstance( ICFBamDbKeyHash512TypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512TypeObj realiseDbKeyHash512Type( ICFBamDbKeyHash512TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512TypeObj createDbKeyHash512Type( ICFBamDbKeyHash512TypeObj Obj );

	/**
	 *	Read a DbKeyHash512Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash512Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash512TypeObj readDbKeyHash512Type( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash512Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash512Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash512TypeObj readDbKeyHash512Type( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash512TypeObj readCachedDbKeyHash512Type( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash512Type( ICFBamDbKeyHash512TypeObj obj );

	void deepDisposeDbKeyHash512Type( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512TypeObj lockDbKeyHash512Type( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash512Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash512TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readAllDbKeyHash512Type();

	/**
	 *	Return a sorted map of all the DbKeyHash512Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash512TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readAllDbKeyHash512Type( boolean forceRead );

	List<ICFBamDbKeyHash512TypeObj> readCachedAllDbKeyHash512Type();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512TypeObj readDbKeyHash512TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512TypeObj readDbKeyHash512TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512TypeObj readDbKeyHash512TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512TypeObj readDbKeyHash512TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512TypeObj> readDbKeyHash512TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamDbKeyHash512TypeObj readCachedDbKeyHash512TypeByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash512TypeObj readCachedDbKeyHash512TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash512TypeObj> readCachedDbKeyHash512TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash512TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash512TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash512TypeByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash512TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash512TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash512TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash512TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash512TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash512TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash512TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash512TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash512TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512TypeObj updateDbKeyHash512Type( ICFBamDbKeyHash512TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash512Type( ICFBamDbKeyHash512TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash512Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamDbKeyHash512TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash512TypeObj refreshed cache instance.
	 */
	ICFBamDbKeyHash512TypeObj moveUpDbKeyHash512Type( ICFBamDbKeyHash512TypeObj Obj );

	/**
	 *	Move the CFBamDbKeyHash512TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash512TypeObj refreshed cache instance.
	 */
	ICFBamDbKeyHash512TypeObj moveDownDbKeyHash512Type( ICFBamDbKeyHash512TypeObj Obj );
}
