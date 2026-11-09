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

public interface ICFBamTimeColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TimeCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTimeColObj newInstance();

	/**
	 *	Instantiate a new TimeCol edition of the specified TimeCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTimeColEditObj newEditInstance( ICFBamTimeColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTimeColObj realiseTimeCol( ICFBamTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTimeColObj createTimeCol( ICFBamTimeColObj Obj );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTimeColObj readTimeCol( CFBamValuePKey pkey );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTimeColObj readTimeCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTimeColObj readCachedTimeCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeTimeCol( ICFBamTimeColObj obj );

	void deepDisposeTimeCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTimeColObj lockTimeCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTimeColObj> readAllTimeCol();

	/**
	 *	Return a sorted map of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTimeColObj> readAllTimeCol( boolean forceRead );

	List<ICFBamTimeColObj> readCachedAllTimeCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimeColObj readTimeColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimeColObj readTimeColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimeColObj readTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimeColObj readTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeColObj> readTimeColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamTimeColObj readCachedTimeColByIdIdx( long TenantId,
		long Id );

	ICFBamTimeColObj readCachedTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTimeColObj> readCachedTimeColByValTentIdx( long TenantId );

	List<ICFBamTimeColObj> readCachedTimeColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTimeColObj> readCachedTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTimeColObj> readCachedTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTimeColObj> readCachedTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTimeColObj> readCachedTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTimeColObj> readCachedTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTimeColObj> readCachedTimeColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTimeColObj> readCachedTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTimeColObj> readCachedTimeColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTimeColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTimeColByValTentIdx( long TenantId );

	void deepDisposeTimeColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTimeColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamTimeColObj updateTimeCol( ICFBamTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeCol( ICFBamTimeColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamTimeColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTimeColObj refreshed cache instance.
	 */
	ICFBamTimeColObj moveUpTimeCol( ICFBamTimeColObj Obj );

	/**
	 *	Move the CFBamTimeColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTimeColObj refreshed cache instance.
	 */
	ICFBamTimeColObj moveDownTimeCol( ICFBamTimeColObj Obj );
}
