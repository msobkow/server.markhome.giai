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

public interface ICFBamDbKeyHash512ColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash512Col instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash512ColObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash512Col edition of the specified DbKeyHash512Col instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash512ColEditObj newEditInstance( ICFBamDbKeyHash512ColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512ColObj realiseDbKeyHash512Col( ICFBamDbKeyHash512ColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512ColObj createDbKeyHash512Col( ICFBamDbKeyHash512ColObj Obj );

	/**
	 *	Read a DbKeyHash512Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash512Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash512ColObj readDbKeyHash512Col( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash512Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash512Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash512ColObj readDbKeyHash512Col( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash512ColObj readCachedDbKeyHash512Col( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash512Col( ICFBamDbKeyHash512ColObj obj );

	void deepDisposeDbKeyHash512Col( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512ColObj lockDbKeyHash512Col( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash512Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash512ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readAllDbKeyHash512Col();

	/**
	 *	Return a sorted map of all the DbKeyHash512Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash512ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readAllDbKeyHash512Col( boolean forceRead );

	List<ICFBamDbKeyHash512ColObj> readCachedAllDbKeyHash512Col();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512ColObj readDbKeyHash512ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512ColObj readDbKeyHash512ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512ColObj readDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash512ColObj readDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash512ColObj> readDbKeyHash512ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamDbKeyHash512ColObj readCachedDbKeyHash512ColByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash512ColObj readCachedDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeDbKeyHash512ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash512ColByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash512ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash512ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash512ColObj updateDbKeyHash512Col( ICFBamDbKeyHash512ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash512Col( ICFBamDbKeyHash512ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamDbKeyHash512ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash512ColObj refreshed cache instance.
	 */
	ICFBamDbKeyHash512ColObj moveUpDbKeyHash512Col( ICFBamDbKeyHash512ColObj Obj );

	/**
	 *	Move the CFBamDbKeyHash512ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash512ColObj refreshed cache instance.
	 */
	ICFBamDbKeyHash512ColObj moveDownDbKeyHash512Col( ICFBamDbKeyHash512ColObj Obj );
}
