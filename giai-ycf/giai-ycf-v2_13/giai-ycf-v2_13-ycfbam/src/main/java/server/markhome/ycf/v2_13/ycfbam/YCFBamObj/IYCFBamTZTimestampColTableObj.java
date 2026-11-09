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

public interface ICFBamTZTimestampColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZTimestampCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTZTimestampColObj newInstance();

	/**
	 *	Instantiate a new TZTimestampCol edition of the specified TZTimestampCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTZTimestampColEditObj newEditInstance( ICFBamTZTimestampColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimestampColObj realiseTZTimestampCol( ICFBamTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimestampColObj createTZTimestampCol( ICFBamTZTimestampColObj Obj );

	/**
	 *	Read a TZTimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZTimestampColObj readTZTimestampCol( CFBamValuePKey pkey );

	/**
	 *	Read a TZTimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZTimestampColObj readTZTimestampCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTZTimestampColObj readCachedTZTimestampCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeTZTimestampCol( ICFBamTZTimestampColObj obj );

	void deepDisposeTZTimestampCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimestampColObj lockTZTimestampCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZTimestampCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZTimestampColObj> readAllTZTimestampCol();

	/**
	 *	Return a sorted map of all the TZTimestampCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZTimestampColObj> readAllTZTimestampCol( boolean forceRead );

	List<ICFBamTZTimestampColObj> readCachedAllTZTimestampCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimestampColObj readTZTimestampColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimestampColObj readTZTimestampColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimestampColObj readTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimestampColObj readTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamTZTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimestampColObj> readTZTimestampColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamTZTimestampColObj readCachedTZTimestampColByIdIdx( long TenantId,
		long Id );

	ICFBamTZTimestampColObj readCachedTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByValTentIdx( long TenantId );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTZTimestampColObj> readCachedTZTimestampColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTZTimestampColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZTimestampColByValTentIdx( long TenantId );

	void deepDisposeTZTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimestampColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimestampColObj updateTZTimestampCol( ICFBamTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimestampCol( ICFBamTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamTZTimestampColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZTimestampColObj refreshed cache instance.
	 */
	ICFBamTZTimestampColObj moveUpTZTimestampCol( ICFBamTZTimestampColObj Obj );

	/**
	 *	Move the CFBamTZTimestampColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZTimestampColObj refreshed cache instance.
	 */
	ICFBamTZTimestampColObj moveDownTZTimestampCol( ICFBamTZTimestampColObj Obj );
}
