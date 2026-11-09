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

public interface ICFBamDbKeyHash384GenTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash384Gen instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash384GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash384Gen edition of the specified DbKeyHash384Gen instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash384GenEditObj newEditInstance( ICFBamDbKeyHash384GenObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash384GenObj realiseDbKeyHash384Gen( ICFBamDbKeyHash384GenObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash384GenObj createDbKeyHash384Gen( ICFBamDbKeyHash384GenObj Obj );

	/**
	 *	Read a DbKeyHash384Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash384Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash384GenObj readDbKeyHash384Gen( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash384Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash384Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash384GenObj readDbKeyHash384Gen( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash384GenObj readCachedDbKeyHash384Gen( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash384Gen( ICFBamDbKeyHash384GenObj obj );

	void deepDisposeDbKeyHash384Gen( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash384GenObj lockDbKeyHash384Gen( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash384Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash384GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readAllDbKeyHash384Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash384Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash384GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readAllDbKeyHash384Gen( boolean forceRead );

	List<ICFBamDbKeyHash384GenObj> readCachedAllDbKeyHash384Gen();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash384GenObj readDbKeyHash384GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash384GenObj readDbKeyHash384GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash384GenObj readDbKeyHash384GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash384GenObj readDbKeyHash384GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash384TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of CFBamDbKeyHash384GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash384GenObj> readDbKeyHash384GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	ICFBamDbKeyHash384GenObj readCachedDbKeyHash384GenByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash384GenObj readCachedDbKeyHash384GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<ICFBamDbKeyHash384GenObj> readCachedDbKeyHash384GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeDbKeyHash384GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash384GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash384GenByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash384GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash384GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash384GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash384GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash384GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash384GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash384GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash384GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash384GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash384GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash384GenObj updateDbKeyHash384Gen( ICFBamDbKeyHash384GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash384Gen( ICFBamDbKeyHash384GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the CFBamDbKeyHash384GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash384GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash384GenObj moveUpDbKeyHash384Gen( ICFBamDbKeyHash384GenObj Obj );

	/**
	 *	Move the CFBamDbKeyHash384GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash384GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash384GenObj moveDownDbKeyHash384Gen( ICFBamDbKeyHash384GenObj Obj );
}
