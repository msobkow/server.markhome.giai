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

public interface ICFBamNmTokensColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NmTokensCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamNmTokensColObj newInstance();

	/**
	 *	Instantiate a new NmTokensCol edition of the specified NmTokensCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamNmTokensColEditObj newEditInstance( ICFBamNmTokensColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokensColObj realiseNmTokensCol( ICFBamNmTokensColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokensColObj createNmTokensCol( ICFBamNmTokensColObj Obj );

	/**
	 *	Read a NmTokensCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNmTokensColObj readNmTokensCol( CFBamValuePKey pkey );

	/**
	 *	Read a NmTokensCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNmTokensColObj readNmTokensCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamNmTokensColObj readCachedNmTokensCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeNmTokensCol( ICFBamNmTokensColObj obj );

	void deepDisposeNmTokensCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokensColObj lockNmTokensCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NmTokensCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamNmTokensColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNmTokensColObj> readAllNmTokensCol();

	/**
	 *	Return a sorted map of all the NmTokensCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamNmTokensColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNmTokensColObj> readAllNmTokensCol( boolean forceRead );

	List<ICFBamNmTokensColObj> readCachedAllNmTokensCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokensColObj readNmTokensColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokensColObj readNmTokensColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokensColObj readNmTokensColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokensColObj readNmTokensColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamNmTokensColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensColObj> readNmTokensColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamNmTokensColObj readCachedNmTokensColByIdIdx( long TenantId,
		long Id );

	ICFBamNmTokensColObj readCachedNmTokensColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByValTentIdx( long TenantId );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNmTokensColObj> readCachedNmTokensColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeNmTokensColByIdIdx( long TenantId,
		long Id );

	void deepDisposeNmTokensColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNmTokensColByValTentIdx( long TenantId );

	void deepDisposeNmTokensColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNmTokensColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNmTokensColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNmTokensColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNmTokensColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNmTokensColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNmTokensColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokensColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokensColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokensColObj updateNmTokensCol( ICFBamNmTokensColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensCol( ICFBamNmTokensColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamNmTokensColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNmTokensColObj refreshed cache instance.
	 */
	ICFBamNmTokensColObj moveUpNmTokensCol( ICFBamNmTokensColObj Obj );

	/**
	 *	Move the CFBamNmTokensColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNmTokensColObj refreshed cache instance.
	 */
	ICFBamNmTokensColObj moveDownNmTokensCol( ICFBamNmTokensColObj Obj );
}
