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

public interface ICFBamTZDateColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZDateCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTZDateColObj newInstance();

	/**
	 *	Instantiate a new TZDateCol edition of the specified TZDateCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTZDateColEditObj newEditInstance( ICFBamTZDateColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateColObj realiseTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateColObj createTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Read a TZDateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZDateColObj readTZDateCol( CFBamValuePKey pkey );

	/**
	 *	Read a TZDateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZDateColObj readTZDateCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTZDateColObj readCachedTZDateCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeTZDateCol( ICFBamTZDateColObj obj );

	void deepDisposeTZDateCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateColObj lockTZDateCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZDateCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZDateColObj> readAllTZDateCol();

	/**
	 *	Return a sorted map of all the TZDateCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZDateColObj> readAllTZDateCol( boolean forceRead );

	List<ICFBamTZDateColObj> readCachedAllTZDateCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateColObj readTZDateColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateColObj readTZDateColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateColObj readTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateColObj readTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamTZDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateColObj> readTZDateColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamTZDateColObj readCachedTZDateColByIdIdx( long TenantId,
		long Id );

	ICFBamTZDateColObj readCachedTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTZDateColObj> readCachedTZDateColByValTentIdx( long TenantId );

	List<ICFBamTZDateColObj> readCachedTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTZDateColObj> readCachedTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTZDateColObj> readCachedTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTZDateColObj> readCachedTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTZDateColObj> readCachedTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTZDateColObj> readCachedTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTZDateColObj> readCachedTZDateColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTZDateColObj> readCachedTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTZDateColObj> readCachedTZDateColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTZDateColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZDateColByValTentIdx( long TenantId );

	void deepDisposeTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZDateColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateColObj updateTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamTZDateColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZDateColObj refreshed cache instance.
	 */
	ICFBamTZDateColObj moveUpTZDateCol( ICFBamTZDateColObj Obj );

	/**
	 *	Move the CFBamTZDateColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZDateColObj refreshed cache instance.
	 */
	ICFBamTZDateColObj moveDownTZDateCol( ICFBamTZDateColObj Obj );
}
