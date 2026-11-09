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

public interface ICFBamDbKeyHash224GenTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash224Gen instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash224GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash224Gen edition of the specified DbKeyHash224Gen instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash224GenEditObj newEditInstance( ICFBamDbKeyHash224GenObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224GenObj realiseDbKeyHash224Gen( ICFBamDbKeyHash224GenObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224GenObj createDbKeyHash224Gen( ICFBamDbKeyHash224GenObj Obj );

	/**
	 *	Read a DbKeyHash224Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash224GenObj readDbKeyHash224Gen( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash224Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash224GenObj readDbKeyHash224Gen( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash224GenObj readCachedDbKeyHash224Gen( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash224Gen( ICFBamDbKeyHash224GenObj obj );

	void deepDisposeDbKeyHash224Gen( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224GenObj lockDbKeyHash224Gen( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash224Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash224GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readAllDbKeyHash224Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash224Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash224GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readAllDbKeyHash224Gen( boolean forceRead );

	List<ICFBamDbKeyHash224GenObj> readCachedAllDbKeyHash224Gen();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224GenObj readDbKeyHash224GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224GenObj readDbKeyHash224GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224GenObj readDbKeyHash224GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224GenObj readDbKeyHash224GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of CFBamDbKeyHash224GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224GenObj> readDbKeyHash224GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	ICFBamDbKeyHash224GenObj readCachedDbKeyHash224GenByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash224GenObj readCachedDbKeyHash224GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<ICFBamDbKeyHash224GenObj> readCachedDbKeyHash224GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeDbKeyHash224GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash224GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash224GenByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash224GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash224GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash224GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash224GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash224GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash224GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash224GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash224GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash224GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash224GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224GenObj updateDbKeyHash224Gen( ICFBamDbKeyHash224GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash224Gen( ICFBamDbKeyHash224GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the CFBamDbKeyHash224GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash224GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash224GenObj moveUpDbKeyHash224Gen( ICFBamDbKeyHash224GenObj Obj );

	/**
	 *	Move the CFBamDbKeyHash224GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash224GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash224GenObj moveDownDbKeyHash224Gen( ICFBamDbKeyHash224GenObj Obj );
}
