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

public interface ICFBamFloatColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new FloatCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamFloatColObj newInstance();

	/**
	 *	Instantiate a new FloatCol edition of the specified FloatCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamFloatColEditObj newEditInstance( ICFBamFloatColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatColObj realiseFloatCol( ICFBamFloatColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatColObj createFloatCol( ICFBamFloatColObj Obj );

	/**
	 *	Read a FloatCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamFloatColObj readFloatCol( CFBamValuePKey pkey );

	/**
	 *	Read a FloatCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamFloatColObj readFloatCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamFloatColObj readCachedFloatCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeFloatCol( ICFBamFloatColObj obj );

	void deepDisposeFloatCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatColObj lockFloatCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the FloatCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamFloatColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamFloatColObj> readAllFloatCol();

	/**
	 *	Return a sorted map of all the FloatCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamFloatColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamFloatColObj> readAllFloatCol( boolean forceRead );

	List<ICFBamFloatColObj> readCachedAllFloatCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatColObj readFloatColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatColObj readFloatColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatColObj readFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatColObj readFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamFloatColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatColObj> readFloatColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamFloatColObj readCachedFloatColByIdIdx( long TenantId,
		long Id );

	ICFBamFloatColObj readCachedFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamFloatColObj> readCachedFloatColByValTentIdx( long TenantId );

	List<ICFBamFloatColObj> readCachedFloatColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamFloatColObj> readCachedFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamFloatColObj> readCachedFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamFloatColObj> readCachedFloatColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamFloatColObj> readCachedFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamFloatColObj> readCachedFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamFloatColObj> readCachedFloatColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamFloatColObj> readCachedFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamFloatColObj> readCachedFloatColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeFloatColByIdIdx( long TenantId,
		long Id );

	void deepDisposeFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeFloatColByValTentIdx( long TenantId );

	void deepDisposeFloatColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeFloatColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeFloatColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatColObj updateFloatCol( ICFBamFloatColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatCol( ICFBamFloatColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamFloatColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamFloatColObj refreshed cache instance.
	 */
	ICFBamFloatColObj moveUpFloatCol( ICFBamFloatColObj Obj );

	/**
	 *	Move the CFBamFloatColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamFloatColObj refreshed cache instance.
	 */
	ICFBamFloatColObj moveDownFloatCol( ICFBamFloatColObj Obj );
}
