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

public interface ICFBamTimestampColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TimestampCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTimestampColObj newInstance();

	/**
	 *	Instantiate a new TimestampCol edition of the specified TimestampCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTimestampColEditObj newEditInstance( ICFBamTimestampColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTimestampColObj realiseTimestampCol( ICFBamTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTimestampColObj createTimestampCol( ICFBamTimestampColObj Obj );

	/**
	 *	Read a TimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTimestampColObj readTimestampCol( CFBamValuePKey pkey );

	/**
	 *	Read a TimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTimestampColObj readTimestampCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTimestampColObj readCachedTimestampCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeTimestampCol( ICFBamTimestampColObj obj );

	void deepDisposeTimestampCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTimestampColObj lockTimestampCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TimestampCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTimestampColObj> readAllTimestampCol();

	/**
	 *	Return a sorted map of all the TimestampCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTimestampColObj> readAllTimestampCol( boolean forceRead );

	List<ICFBamTimestampColObj> readCachedAllTimestampCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimestampColObj readTimestampColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimestampColObj readTimestampColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimestampColObj readTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimestampColObj readTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimestampColObj> readTimestampColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamTimestampColObj readCachedTimestampColByIdIdx( long TenantId,
		long Id );

	ICFBamTimestampColObj readCachedTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTimestampColObj> readCachedTimestampColByValTentIdx( long TenantId );

	List<ICFBamTimestampColObj> readCachedTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTimestampColObj> readCachedTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTimestampColObj> readCachedTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTimestampColObj> readCachedTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTimestampColObj> readCachedTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTimestampColObj> readCachedTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTimestampColObj> readCachedTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTimestampColObj> readCachedTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTimestampColObj> readCachedTimestampColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTimestampColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTimestampColByValTentIdx( long TenantId );

	void deepDisposeTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimestampColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamTimestampColObj updateTimestampCol( ICFBamTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampCol( ICFBamTimestampColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamTimestampColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTimestampColObj refreshed cache instance.
	 */
	ICFBamTimestampColObj moveUpTimestampCol( ICFBamTimestampColObj Obj );

	/**
	 *	Move the CFBamTimestampColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTimestampColObj refreshed cache instance.
	 */
	ICFBamTimestampColObj moveDownTimestampCol( ICFBamTimestampColObj Obj );
}
