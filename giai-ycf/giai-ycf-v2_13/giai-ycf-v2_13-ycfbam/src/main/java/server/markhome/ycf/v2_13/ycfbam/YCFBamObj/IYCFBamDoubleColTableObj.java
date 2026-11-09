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

public interface ICFBamDoubleColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DoubleCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDoubleColObj newInstance();

	/**
	 *	Instantiate a new DoubleCol edition of the specified DoubleCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDoubleColEditObj newEditInstance( ICFBamDoubleColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleColObj realiseDoubleCol( ICFBamDoubleColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleColObj createDoubleCol( ICFBamDoubleColObj Obj );

	/**
	 *	Read a DoubleCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDoubleColObj readDoubleCol( CFBamValuePKey pkey );

	/**
	 *	Read a DoubleCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDoubleColObj readDoubleCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDoubleColObj readCachedDoubleCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeDoubleCol( ICFBamDoubleColObj obj );

	void deepDisposeDoubleCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleColObj lockDoubleCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DoubleCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamDoubleColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDoubleColObj> readAllDoubleCol();

	/**
	 *	Return a sorted map of all the DoubleCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamDoubleColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDoubleColObj> readAllDoubleCol( boolean forceRead );

	List<ICFBamDoubleColObj> readCachedAllDoubleCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleColObj readDoubleColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleColObj readDoubleColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleColObj readDoubleColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleColObj readDoubleColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamDoubleColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleColObj> readDoubleColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamDoubleColObj readCachedDoubleColByIdIdx( long TenantId,
		long Id );

	ICFBamDoubleColObj readCachedDoubleColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDoubleColObj> readCachedDoubleColByValTentIdx( long TenantId );

	List<ICFBamDoubleColObj> readCachedDoubleColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDoubleColObj> readCachedDoubleColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDoubleColObj> readCachedDoubleColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDoubleColObj> readCachedDoubleColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDoubleColObj> readCachedDoubleColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDoubleColObj> readCachedDoubleColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDoubleColObj> readCachedDoubleColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDoubleColObj> readCachedDoubleColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDoubleColObj> readCachedDoubleColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeDoubleColByIdIdx( long TenantId,
		long Id );

	void deepDisposeDoubleColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDoubleColByValTentIdx( long TenantId );

	void deepDisposeDoubleColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDoubleColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDoubleColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDoubleColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDoubleColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDoubleColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDoubleColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDoubleColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDoubleColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleColObj updateDoubleCol( ICFBamDoubleColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDoubleCol( ICFBamDoubleColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamDoubleColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDoubleColObj refreshed cache instance.
	 */
	ICFBamDoubleColObj moveUpDoubleCol( ICFBamDoubleColObj Obj );

	/**
	 *	Move the CFBamDoubleColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDoubleColObj refreshed cache instance.
	 */
	ICFBamDoubleColObj moveDownDoubleCol( ICFBamDoubleColObj Obj );
}
