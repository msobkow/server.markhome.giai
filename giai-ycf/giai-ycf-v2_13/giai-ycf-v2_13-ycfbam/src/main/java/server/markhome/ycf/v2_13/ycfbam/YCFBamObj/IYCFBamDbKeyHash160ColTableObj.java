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

public interface ICFBamDbKeyHash160ColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash160Col instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash160ColObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash160Col edition of the specified DbKeyHash160Col instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash160ColEditObj newEditInstance( ICFBamDbKeyHash160ColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160ColObj realiseDbKeyHash160Col( ICFBamDbKeyHash160ColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160ColObj createDbKeyHash160Col( ICFBamDbKeyHash160ColObj Obj );

	/**
	 *	Read a DbKeyHash160Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash160ColObj readDbKeyHash160Col( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash160Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash160ColObj readDbKeyHash160Col( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash160ColObj readCachedDbKeyHash160Col( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash160Col( ICFBamDbKeyHash160ColObj obj );

	void deepDisposeDbKeyHash160Col( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160ColObj lockDbKeyHash160Col( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash160Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash160ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readAllDbKeyHash160Col();

	/**
	 *	Return a sorted map of all the DbKeyHash160Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash160ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readAllDbKeyHash160Col( boolean forceRead );

	List<ICFBamDbKeyHash160ColObj> readCachedAllDbKeyHash160Col();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160ColObj readDbKeyHash160ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160ColObj readDbKeyHash160ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160ColObj readDbKeyHash160ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash160ColObj readDbKeyHash160ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamDbKeyHash160ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash160ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash160ColObj> readDbKeyHash160ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamDbKeyHash160ColObj readCachedDbKeyHash160ColByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash160ColObj readCachedDbKeyHash160ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash160ColObj> readCachedDbKeyHash160ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeDbKeyHash160ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash160ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash160ColByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash160ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash160ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash160ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash160ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash160ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash160ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash160ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash160ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash160ColObj updateDbKeyHash160Col( ICFBamDbKeyHash160ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash160Col( ICFBamDbKeyHash160ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash160Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash160Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamDbKeyHash160ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash160ColObj refreshed cache instance.
	 */
	ICFBamDbKeyHash160ColObj moveUpDbKeyHash160Col( ICFBamDbKeyHash160ColObj Obj );

	/**
	 *	Move the CFBamDbKeyHash160ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash160ColObj refreshed cache instance.
	 */
	ICFBamDbKeyHash160ColObj moveDownDbKeyHash160Col( ICFBamDbKeyHash160ColObj Obj );
}
