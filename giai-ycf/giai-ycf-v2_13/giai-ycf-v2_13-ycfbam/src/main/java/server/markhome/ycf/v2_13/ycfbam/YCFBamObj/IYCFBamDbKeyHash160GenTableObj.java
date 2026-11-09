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

public interface ICFBamDbKeyHash160GenTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash160Gen instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash160GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash160Gen edition of the specified DbKeyHash160Gen instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash160GenEditObj newEditInstance( ICFBamDbKeyHash160GenObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160GenObj realiseDbKeyHash160Gen( ICFBamDbKeyHash160GenObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160GenObj createDbKeyHash160Gen( ICFBamDbKeyHash160GenObj Obj );

	/**
	 *	Read a DbKeyHash160Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash160GenObj readDbKeyHash160Gen( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash160Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash160GenObj readDbKeyHash160Gen( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash160GenObj readCachedDbKeyHash160Gen( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash160Gen( ICFBamDbKeyHash160GenObj obj );

	void deepDisposeDbKeyHash160Gen( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160GenObj lockDbKeyHash160Gen( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash160Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash160GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readAllDbKeyHash160Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash160Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash160GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readAllDbKeyHash160Gen( boolean forceRead );

	List<ICFBamDbKeyHash160GenObj> readCachedAllDbKeyHash160Gen();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160GenObj readDbKeyHash160GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160GenObj readDbKeyHash160GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160GenObj readDbKeyHash160GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160GenObj readDbKeyHash160GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash160TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of CFBamDbKeyHash160GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160GenObj> readDbKeyHash160GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	ICFBamDbKeyHash160GenObj readCachedDbKeyHash160GenByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash160GenObj readCachedDbKeyHash160GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<ICFBamDbKeyHash160GenObj> readCachedDbKeyHash160GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeDbKeyHash160GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash160GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash160GenByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash160GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash160GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash160GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash160GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash160GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash160GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash160GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash160GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160GenObj updateDbKeyHash160Gen( ICFBamDbKeyHash160GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash160Gen( ICFBamDbKeyHash160GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the CFBamDbKeyHash160GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash160GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash160GenObj moveUpDbKeyHash160Gen( ICFBamDbKeyHash160GenObj Obj );

	/**
	 *	Move the CFBamDbKeyHash160GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash160GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash160GenObj moveDownDbKeyHash160Gen( ICFBamDbKeyHash160GenObj Obj );
}
