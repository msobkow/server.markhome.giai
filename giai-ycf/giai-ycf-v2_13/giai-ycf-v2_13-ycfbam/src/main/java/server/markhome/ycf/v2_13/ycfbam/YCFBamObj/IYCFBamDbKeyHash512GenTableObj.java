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

public interface ICFBamDbKeyHash512GenTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash512Gen instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash512GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash512Gen edition of the specified DbKeyHash512Gen instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash512GenEditObj newEditInstance( ICFBamDbKeyHash512GenObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512GenObj realiseDbKeyHash512Gen( ICFBamDbKeyHash512GenObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512GenObj createDbKeyHash512Gen( ICFBamDbKeyHash512GenObj Obj );

	/**
	 *	Read a DbKeyHash512Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash512Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash512GenObj readDbKeyHash512Gen( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash512Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash512Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash512GenObj readDbKeyHash512Gen( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash512GenObj readCachedDbKeyHash512Gen( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash512Gen( ICFBamDbKeyHash512GenObj obj );

	void deepDisposeDbKeyHash512Gen( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512GenObj lockDbKeyHash512Gen( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash512Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash512GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readAllDbKeyHash512Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash512Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash512GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readAllDbKeyHash512Gen( boolean forceRead );

	List<ICFBamDbKeyHash512GenObj> readCachedAllDbKeyHash512Gen();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512GenObj readDbKeyHash512GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512GenObj readDbKeyHash512GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512GenObj readDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512GenObj readDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash512TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of CFBamDbKeyHash512GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512GenObj> readDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	ICFBamDbKeyHash512GenObj readCachedDbKeyHash512GenByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash512GenObj readCachedDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<ICFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeDbKeyHash512GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash512GenByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash512GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512GenObj updateDbKeyHash512Gen( ICFBamDbKeyHash512GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash512Gen( ICFBamDbKeyHash512GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the CFBamDbKeyHash512GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash512GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash512GenObj moveUpDbKeyHash512Gen( ICFBamDbKeyHash512GenObj Obj );

	/**
	 *	Move the CFBamDbKeyHash512GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash512GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash512GenObj moveDownDbKeyHash512Gen( ICFBamDbKeyHash512GenObj Obj );
}
