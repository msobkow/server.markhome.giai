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

public interface ICFBamTimestampTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TimestampType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTimestampTypeObj newInstance();

	/**
	 *	Instantiate a new TimestampType edition of the specified TimestampType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTimestampTypeEditObj newEditInstance( ICFBamTimestampTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTimestampTypeObj realiseTimestampType( ICFBamTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTimestampTypeObj createTimestampType( ICFBamTimestampTypeObj Obj );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTimestampTypeObj readTimestampType( CFBamValuePKey pkey );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTimestampTypeObj readTimestampType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTimestampTypeObj readCachedTimestampType( CFBamValuePKey pkey );

	public void reallyDeepDisposeTimestampType( ICFBamTimestampTypeObj obj );

	void deepDisposeTimestampType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTimestampTypeObj lockTimestampType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of ICFBamTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTimestampTypeObj> readAllTimestampType();

	/**
	 *	Return a sorted map of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of ICFBamTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTimestampTypeObj> readAllTimestampType( boolean forceRead );

	List<ICFBamTimestampTypeObj> readCachedAllTimestampType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimestampTypeObj readTimestampTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimestampTypeObj readTimestampTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimestampTypeObj readTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimestampTypeObj readTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampTypeObj> readTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamTimestampTypeObj readCachedTimestampTypeByIdIdx( long TenantId,
		long Id );

	ICFBamTimestampTypeObj readCachedTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeByValTentIdx( long TenantId );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTimestampTypeObj> readCachedTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTimestampTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTimestampTypeByValTentIdx( long TenantId );

	void deepDisposeTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTimestampTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamTimestampTypeObj updateTimestampType( ICFBamTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampType( ICFBamTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamTimestampTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTimestampTypeObj refreshed cache instance.
	 */
	ICFBamTimestampTypeObj moveUpTimestampType( ICFBamTimestampTypeObj Obj );

	/**
	 *	Move the CFBamTimestampTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTimestampTypeObj refreshed cache instance.
	 */
	ICFBamTimestampTypeObj moveDownTimestampType( ICFBamTimestampTypeObj Obj );
}
