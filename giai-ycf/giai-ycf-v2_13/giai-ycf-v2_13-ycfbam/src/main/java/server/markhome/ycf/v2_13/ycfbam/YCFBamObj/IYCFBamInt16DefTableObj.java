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

public interface ICFBamInt16DefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int16Def instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamInt16DefObj newInstance();

	/**
	 *	Instantiate a new Int16Def edition of the specified Int16Def instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamInt16DefEditObj newEditInstance( ICFBamInt16DefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamInt16DefObj realiseInt16Def( ICFBamInt16DefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamInt16DefObj createInt16Def( ICFBamInt16DefObj Obj );

	/**
	 *	Read a Int16Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt16DefObj readInt16Def( CFBamValuePKey pkey );

	/**
	 *	Read a Int16Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt16DefObj readInt16Def( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamInt16DefObj readCachedInt16Def( CFBamValuePKey pkey );

	public void reallyDeepDisposeInt16Def( ICFBamInt16DefObj obj );

	void deepDisposeInt16Def( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamInt16DefObj lockInt16Def( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int16Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt16DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt16DefObj> readAllInt16Def();

	/**
	 *	Return a sorted map of all the Int16Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt16DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt16DefObj> readAllInt16Def( boolean forceRead );

	List<ICFBamInt16DefObj> readCachedAllInt16Def();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt16DefObj readInt16DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt16DefObj readInt16DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt16DefObj readInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt16DefObj readInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamInt16DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamInt16DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamInt16DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt16DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt16DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt16DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt16DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamInt16DefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamInt16DefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt16DefObj> readInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamInt16DefObj readCachedInt16DefByIdIdx( long TenantId,
		long Id );

	ICFBamInt16DefObj readCachedInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamInt16DefObj> readCachedInt16DefByValTentIdx( long TenantId );

	List<ICFBamInt16DefObj> readCachedInt16DefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamInt16DefObj> readCachedInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamInt16DefObj> readCachedInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamInt16DefObj> readCachedInt16DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamInt16DefObj> readCachedInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamInt16DefObj> readCachedInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamInt16DefObj> readCachedInt16DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamInt16DefObj> readCachedInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt16DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt16DefByValTentIdx( long TenantId );

	void deepDisposeInt16DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt16DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt16DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamInt16DefObj updateInt16Def( ICFBamInt16DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt16Def( ICFBamInt16DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamInt16DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt16DefObj refreshed cache instance.
	 */
	ICFBamInt16DefObj moveUpInt16Def( ICFBamInt16DefObj Obj );

	/**
	 *	Move the CFBamInt16DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt16DefObj refreshed cache instance.
	 */
	ICFBamInt16DefObj moveDownInt16Def( ICFBamInt16DefObj Obj );
}
