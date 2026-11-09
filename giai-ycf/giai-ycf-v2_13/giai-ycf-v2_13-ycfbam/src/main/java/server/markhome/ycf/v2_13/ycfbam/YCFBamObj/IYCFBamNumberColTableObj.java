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

public interface ICFBamNumberColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NumberCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamNumberColObj newInstance();

	/**
	 *	Instantiate a new NumberCol edition of the specified NumberCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamNumberColEditObj newEditInstance( ICFBamNumberColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberColObj realiseNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberColObj createNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Read a NumberCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNumberColObj readNumberCol( CFBamValuePKey pkey );

	/**
	 *	Read a NumberCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNumberColObj readNumberCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamNumberColObj readCachedNumberCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeNumberCol( ICFBamNumberColObj obj );

	void deepDisposeNumberCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberColObj lockNumberCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NumberCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamNumberColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNumberColObj> readAllNumberCol();

	/**
	 *	Return a sorted map of all the NumberCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamNumberColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNumberColObj> readAllNumberCol( boolean forceRead );

	List<ICFBamNumberColObj> readCachedAllNumberCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberColObj readNumberColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberColObj readNumberColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberColObj readNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberColObj readNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamNumberColObj readCachedNumberColByIdIdx( long TenantId,
		long Id );

	ICFBamNumberColObj readCachedNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamNumberColObj> readCachedNumberColByValTentIdx( long TenantId );

	List<ICFBamNumberColObj> readCachedNumberColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamNumberColObj> readCachedNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamNumberColObj> readCachedNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamNumberColObj> readCachedNumberColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamNumberColObj> readCachedNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamNumberColObj> readCachedNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamNumberColObj> readCachedNumberColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNumberColObj> readCachedNumberColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNumberColObj> readCachedNumberColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeNumberColByIdIdx( long TenantId,
		long Id );

	void deepDisposeNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNumberColByValTentIdx( long TenantId );

	void deepDisposeNumberColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNumberColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNumberColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNumberColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNumberColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberColObj updateNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamNumberColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNumberColObj refreshed cache instance.
	 */
	ICFBamNumberColObj moveUpNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Move the CFBamNumberColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNumberColObj refreshed cache instance.
	 */
	ICFBamNumberColObj moveDownNumberCol( ICFBamNumberColObj Obj );
}
