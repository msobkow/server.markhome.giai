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

public interface ICFBamStringColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new StringCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamStringColObj newInstance();

	/**
	 *	Instantiate a new StringCol edition of the specified StringCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamStringColEditObj newEditInstance( ICFBamStringColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamStringColObj realiseStringCol( ICFBamStringColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamStringColObj createStringCol( ICFBamStringColObj Obj );

	/**
	 *	Read a StringCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamStringColObj readStringCol( CFBamValuePKey pkey );

	/**
	 *	Read a StringCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamStringColObj readStringCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamStringColObj readCachedStringCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeStringCol( ICFBamStringColObj obj );

	void deepDisposeStringCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamStringColObj lockStringCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the StringCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamStringColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamStringColObj> readAllStringCol();

	/**
	 *	Return a sorted map of all the StringCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamStringColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamStringColObj> readAllStringCol( boolean forceRead );

	List<ICFBamStringColObj> readCachedAllStringCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringColObj readStringColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringColObj readStringColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringColObj readStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringColObj readStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamStringColObj readCachedStringColByIdIdx( long TenantId,
		long Id );

	ICFBamStringColObj readCachedStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamStringColObj> readCachedStringColByValTentIdx( long TenantId );

	List<ICFBamStringColObj> readCachedStringColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamStringColObj> readCachedStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamStringColObj> readCachedStringColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamStringColObj> readCachedStringColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamStringColObj> readCachedStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamStringColObj> readCachedStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamStringColObj> readCachedStringColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamStringColObj> readCachedStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamStringColObj> readCachedStringColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeStringColByIdIdx( long TenantId,
		long Id );

	void deepDisposeStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeStringColByValTentIdx( long TenantId );

	void deepDisposeStringColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeStringColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeStringColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeStringColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeStringColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamStringColObj updateStringCol( ICFBamStringColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteStringCol( ICFBamStringColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamStringColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamStringColObj refreshed cache instance.
	 */
	ICFBamStringColObj moveUpStringCol( ICFBamStringColObj Obj );

	/**
	 *	Move the CFBamStringColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamStringColObj refreshed cache instance.
	 */
	ICFBamStringColObj moveDownStringCol( ICFBamStringColObj Obj );
}
