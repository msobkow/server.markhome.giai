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

public interface ICFBamInt64ColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int64Col instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamInt64ColObj newInstance();

	/**
	 *	Instantiate a new Int64Col edition of the specified Int64Col instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamInt64ColEditObj newEditInstance( ICFBamInt64ColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamInt64ColObj realiseInt64Col( ICFBamInt64ColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamInt64ColObj createInt64Col( ICFBamInt64ColObj Obj );

	/**
	 *	Read a Int64Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt64ColObj readInt64Col( CFBamValuePKey pkey );

	/**
	 *	Read a Int64Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt64ColObj readInt64Col( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamInt64ColObj readCachedInt64Col( CFBamValuePKey pkey );

	public void reallyDeepDisposeInt64Col( ICFBamInt64ColObj obj );

	void deepDisposeInt64Col( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamInt64ColObj lockInt64Col( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int64Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt64ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt64ColObj> readAllInt64Col();

	/**
	 *	Return a sorted map of all the Int64Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt64ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt64ColObj> readAllInt64Col( boolean forceRead );

	List<ICFBamInt64ColObj> readCachedAllInt64Col();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt64ColObj readInt64ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt64ColObj readInt64ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt64ColObj readInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt64ColObj readInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamInt64ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt64ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt64ColObj> readInt64ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamInt64ColObj readCachedInt64ColByIdIdx( long TenantId,
		long Id );

	ICFBamInt64ColObj readCachedInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamInt64ColObj> readCachedInt64ColByValTentIdx( long TenantId );

	List<ICFBamInt64ColObj> readCachedInt64ColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamInt64ColObj> readCachedInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamInt64ColObj> readCachedInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamInt64ColObj> readCachedInt64ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamInt64ColObj> readCachedInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamInt64ColObj> readCachedInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamInt64ColObj> readCachedInt64ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamInt64ColObj> readCachedInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamInt64ColObj> readCachedInt64ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeInt64ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt64ColByValTentIdx( long TenantId );

	void deepDisposeInt64ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt64ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt64ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt64ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamInt64ColObj updateInt64Col( ICFBamInt64ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt64Col( ICFBamInt64ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamInt64ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt64ColObj refreshed cache instance.
	 */
	ICFBamInt64ColObj moveUpInt64Col( ICFBamInt64ColObj Obj );

	/**
	 *	Move the CFBamInt64ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt64ColObj refreshed cache instance.
	 */
	ICFBamInt64ColObj moveDownInt64Col( ICFBamInt64ColObj Obj );
}
