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

public interface ICFBamInt32ColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int32Col instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamInt32ColObj newInstance();

	/**
	 *	Instantiate a new Int32Col edition of the specified Int32Col instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamInt32ColEditObj newEditInstance( ICFBamInt32ColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamInt32ColObj realiseInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamInt32ColObj createInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Read a Int32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt32ColObj readInt32Col( CFBamValuePKey pkey );

	/**
	 *	Read a Int32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt32ColObj readInt32Col( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamInt32ColObj readCachedInt32Col( CFBamValuePKey pkey );

	public void reallyDeepDisposeInt32Col( ICFBamInt32ColObj obj );

	void deepDisposeInt32Col( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamInt32ColObj lockInt32Col( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int32Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt32ColObj> readAllInt32Col();

	/**
	 *	Return a sorted map of all the Int32Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt32ColObj> readAllInt32Col( boolean forceRead );

	List<ICFBamInt32ColObj> readCachedAllInt32Col();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt32ColObj readInt32ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt32ColObj readInt32ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt32ColObj readInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt32ColObj readInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamInt32ColObj readCachedInt32ColByIdIdx( long TenantId,
		long Id );

	ICFBamInt32ColObj readCachedInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamInt32ColObj> readCachedInt32ColByValTentIdx( long TenantId );

	List<ICFBamInt32ColObj> readCachedInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamInt32ColObj> readCachedInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamInt32ColObj> readCachedInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamInt32ColObj> readCachedInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamInt32ColObj> readCachedInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamInt32ColObj> readCachedInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamInt32ColObj> readCachedInt32ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamInt32ColObj> readCachedInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamInt32ColObj> readCachedInt32ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeInt32ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt32ColByValTentIdx( long TenantId );

	void deepDisposeInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt32ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt32ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamInt32ColObj updateInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamInt32ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt32ColObj refreshed cache instance.
	 */
	ICFBamInt32ColObj moveUpInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Move the CFBamInt32ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt32ColObj refreshed cache instance.
	 */
	ICFBamInt32ColObj moveDownInt32Col( ICFBamInt32ColObj Obj );
}
