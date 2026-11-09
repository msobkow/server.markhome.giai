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

public interface ICFBamDbKeyHash224DefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash224Def instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash224DefObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash224Def edition of the specified DbKeyHash224Def instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash224DefEditObj newEditInstance( ICFBamDbKeyHash224DefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224DefObj realiseDbKeyHash224Def( ICFBamDbKeyHash224DefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224DefObj createDbKeyHash224Def( ICFBamDbKeyHash224DefObj Obj );

	/**
	 *	Read a DbKeyHash224Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash224DefObj readDbKeyHash224Def( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash224Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash224DefObj readDbKeyHash224Def( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash224DefObj readCachedDbKeyHash224Def( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash224Def( ICFBamDbKeyHash224DefObj obj );

	void deepDisposeDbKeyHash224Def( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224DefObj lockDbKeyHash224Def( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash224Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash224DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readAllDbKeyHash224Def();

	/**
	 *	Return a sorted map of all the DbKeyHash224Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash224DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readAllDbKeyHash224Def( boolean forceRead );

	List<ICFBamDbKeyHash224DefObj> readCachedAllDbKeyHash224Def();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224DefObj readDbKeyHash224DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224DefObj readDbKeyHash224DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224DefObj readDbKeyHash224DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224DefObj readDbKeyHash224DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash224DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash224DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash224DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash224DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash224DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash224DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash224DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash224DefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash224DefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224DefObj> readDbKeyHash224DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamDbKeyHash224DefObj readCachedDbKeyHash224DefByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash224DefObj readCachedDbKeyHash224DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash224DefObj> readCachedDbKeyHash224DefByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash224DefObj> readCachedDbKeyHash224DefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash224DefObj> readCachedDbKeyHash224DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash224DefObj> readCachedDbKeyHash224DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash224DefObj> readCachedDbKeyHash224DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash224DefObj> readCachedDbKeyHash224DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash224DefObj> readCachedDbKeyHash224DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash224DefObj> readCachedDbKeyHash224DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash224DefObj> readCachedDbKeyHash224DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash224DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash224DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash224DefByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash224DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash224DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash224DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash224DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash224DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash224DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash224DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash224DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224DefObj updateDbKeyHash224Def( ICFBamDbKeyHash224DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash224Def( ICFBamDbKeyHash224DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamDbKeyHash224DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash224DefObj refreshed cache instance.
	 */
	ICFBamDbKeyHash224DefObj moveUpDbKeyHash224Def( ICFBamDbKeyHash224DefObj Obj );

	/**
	 *	Move the CFBamDbKeyHash224DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash224DefObj refreshed cache instance.
	 */
	ICFBamDbKeyHash224DefObj moveDownDbKeyHash224Def( ICFBamDbKeyHash224DefObj Obj );
}
