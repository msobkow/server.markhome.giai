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

public interface ICFBamDoubleDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DoubleDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDoubleDefObj newInstance();

	/**
	 *	Instantiate a new DoubleDef edition of the specified DoubleDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDoubleDefEditObj newEditInstance( ICFBamDoubleDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleDefObj realiseDoubleDef( ICFBamDoubleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleDefObj createDoubleDef( ICFBamDoubleDefObj Obj );

	/**
	 *	Read a DoubleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDoubleDefObj readDoubleDef( CFBamValuePKey pkey );

	/**
	 *	Read a DoubleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDoubleDefObj readDoubleDef( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDoubleDefObj readCachedDoubleDef( CFBamValuePKey pkey );

	public void reallyDeepDisposeDoubleDef( ICFBamDoubleDefObj obj );

	void deepDisposeDoubleDef( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleDefObj lockDoubleDef( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DoubleDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamDoubleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDoubleDefObj> readAllDoubleDef();

	/**
	 *	Return a sorted map of all the DoubleDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamDoubleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDoubleDefObj> readAllDoubleDef( boolean forceRead );

	List<ICFBamDoubleDefObj> readCachedAllDoubleDef();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleDefObj readDoubleDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleDefObj readDoubleDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleDefObj readDoubleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDoubleDefObj readDoubleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDoubleDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDoubleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDoubleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDoubleDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDoubleDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDoubleDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDoubleDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDoubleDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDoubleDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDoubleDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDoubleDefObj> readDoubleDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamDoubleDefObj readCachedDoubleDefByIdIdx( long TenantId,
		long Id );

	ICFBamDoubleDefObj readCachedDoubleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDoubleDefObj> readCachedDoubleDefByValTentIdx( long TenantId );

	List<ICFBamDoubleDefObj> readCachedDoubleDefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDoubleDefObj> readCachedDoubleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDoubleDefObj> readCachedDoubleDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDoubleDefObj> readCachedDoubleDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDoubleDefObj> readCachedDoubleDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDoubleDefObj> readCachedDoubleDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDoubleDefObj> readCachedDoubleDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDoubleDefObj> readCachedDoubleDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDoubleDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeDoubleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDoubleDefByValTentIdx( long TenantId );

	void deepDisposeDoubleDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDoubleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDoubleDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDoubleDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDoubleDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDoubleDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDoubleDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDoubleDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamDoubleDefObj updateDoubleDef( ICFBamDoubleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDoubleDef( ICFBamDoubleDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamDoubleDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDoubleDefObj refreshed cache instance.
	 */
	ICFBamDoubleDefObj moveUpDoubleDef( ICFBamDoubleDefObj Obj );

	/**
	 *	Move the CFBamDoubleDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDoubleDefObj refreshed cache instance.
	 */
	ICFBamDoubleDefObj moveDownDoubleDef( ICFBamDoubleDefObj Obj );
}
