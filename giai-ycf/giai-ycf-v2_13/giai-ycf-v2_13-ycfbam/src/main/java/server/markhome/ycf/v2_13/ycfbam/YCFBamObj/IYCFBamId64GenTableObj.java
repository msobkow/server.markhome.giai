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

public interface ICFBamId64GenTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Id64Gen instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamId64GenObj newInstance();

	/**
	 *	Instantiate a new Id64Gen edition of the specified Id64Gen instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamId64GenEditObj newEditInstance( ICFBamId64GenObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamId64GenObj realiseId64Gen( ICFBamId64GenObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamId64GenObj createId64Gen( ICFBamId64GenObj Obj );

	/**
	 *	Read a Id64Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id64Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamId64GenObj readId64Gen( CFBamValuePKey pkey );

	/**
	 *	Read a Id64Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id64Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamId64GenObj readId64Gen( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamId64GenObj readCachedId64Gen( CFBamValuePKey pkey );

	public void reallyDeepDisposeId64Gen( ICFBamId64GenObj obj );

	void deepDisposeId64Gen( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamId64GenObj lockId64Gen( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Id64Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamId64GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamId64GenObj> readAllId64Gen();

	/**
	 *	Return a sorted map of all the Id64Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamId64GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamId64GenObj> readAllId64Gen( boolean forceRead );

	List<ICFBamId64GenObj> readCachedAllId64Gen();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamId64GenObj readId64GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamId64GenObj readId64GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamId64GenObj readId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamId64GenObj readId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamInt64TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of CFBamId64GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamId64GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamId64GenObj> readId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	ICFBamId64GenObj readCachedId64GenByIdIdx( long TenantId,
		long Id );

	ICFBamId64GenObj readCachedId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamId64GenObj> readCachedId64GenByValTentIdx( long TenantId );

	List<ICFBamId64GenObj> readCachedId64GenByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamId64GenObj> readCachedId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamId64GenObj> readCachedId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamId64GenObj> readCachedId64GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamId64GenObj> readCachedId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamId64GenObj> readCachedId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamId64GenObj> readCachedId64GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamId64GenObj> readCachedId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamId64GenObj> readCachedId64GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<ICFBamId64GenObj> readCachedId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeId64GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeId64GenByValTentIdx( long TenantId );

	void deepDisposeId64GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeId64GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeId64GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeId64GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	ICFBamId64GenObj updateId64Gen( ICFBamId64GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteId64Gen( ICFBamId64GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the CFBamId64GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamId64GenObj refreshed cache instance.
	 */
	ICFBamId64GenObj moveUpId64Gen( ICFBamId64GenObj Obj );

	/**
	 *	Move the CFBamId64GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamId64GenObj refreshed cache instance.
	 */
	ICFBamId64GenObj moveDownId64Gen( ICFBamId64GenObj Obj );
}
