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

public interface ICFBamUuid6GenTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Uuid6Gen instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamUuid6GenObj newInstance();

	/**
	 *	Instantiate a new Uuid6Gen edition of the specified Uuid6Gen instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamUuid6GenEditObj newEditInstance( ICFBamUuid6GenObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamUuid6GenObj realiseUuid6Gen( ICFBamUuid6GenObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamUuid6GenObj createUuid6Gen( ICFBamUuid6GenObj Obj );

	/**
	 *	Read a Uuid6Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuid6GenObj readUuid6Gen( CFBamValuePKey pkey );

	/**
	 *	Read a Uuid6Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuid6GenObj readUuid6Gen( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamUuid6GenObj readCachedUuid6Gen( CFBamValuePKey pkey );

	public void reallyDeepDisposeUuid6Gen( ICFBamUuid6GenObj obj );

	void deepDisposeUuid6Gen( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamUuid6GenObj lockUuid6Gen( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Uuid6Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuid6GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuid6GenObj> readAllUuid6Gen();

	/**
	 *	Return a sorted map of all the Uuid6Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuid6GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuid6GenObj> readAllUuid6Gen( boolean forceRead );

	List<ICFBamUuid6GenObj> readCachedAllUuid6Gen();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuid6GenObj readUuid6GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuid6GenObj readUuid6GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuid6GenObj readUuid6GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuid6GenObj readUuid6GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamUuid6TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of CFBamUuid6GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuid6GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuid6GenObj> readUuid6GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	ICFBamUuid6GenObj readCachedUuid6GenByIdIdx( long TenantId,
		long Id );

	ICFBamUuid6GenObj readCachedUuid6GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByValTentIdx( long TenantId );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamUuid6GenObj> readCachedUuid6GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<ICFBamUuid6GenObj> readCachedUuid6GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeUuid6GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuid6GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuid6GenByValTentIdx( long TenantId );

	void deepDisposeUuid6GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuid6GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuid6GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuid6GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuid6GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuid6GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuid6GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuid6GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuid6GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeUuid6GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	ICFBamUuid6GenObj updateUuid6Gen( ICFBamUuid6GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuid6Gen( ICFBamUuid6GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the CFBamUuid6GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuid6GenObj refreshed cache instance.
	 */
	ICFBamUuid6GenObj moveUpUuid6Gen( ICFBamUuid6GenObj Obj );

	/**
	 *	Move the CFBamUuid6GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuid6GenObj refreshed cache instance.
	 */
	ICFBamUuid6GenObj moveDownUuid6Gen( ICFBamUuid6GenObj Obj );
}
