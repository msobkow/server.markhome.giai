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

public interface ICFBamBoolColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new BoolCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamBoolColObj newInstance();

	/**
	 *	Instantiate a new BoolCol edition of the specified BoolCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamBoolColEditObj newEditInstance( ICFBamBoolColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamBoolColObj realiseBoolCol( ICFBamBoolColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamBoolColObj createBoolCol( ICFBamBoolColObj Obj );

	/**
	 *	Read a BoolCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamBoolColObj readBoolCol( CFBamValuePKey pkey );

	/**
	 *	Read a BoolCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamBoolColObj readBoolCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamBoolColObj readCachedBoolCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeBoolCol( ICFBamBoolColObj obj );

	void deepDisposeBoolCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamBoolColObj lockBoolCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the BoolCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamBoolColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamBoolColObj> readAllBoolCol();

	/**
	 *	Return a sorted map of all the BoolCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamBoolColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamBoolColObj> readAllBoolCol( boolean forceRead );

	List<ICFBamBoolColObj> readCachedAllBoolCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamBoolColObj readBoolColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamBoolColObj readBoolColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamBoolColObj readBoolColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamBoolColObj readBoolColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamBoolColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBoolColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBoolColObj> readBoolColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamBoolColObj readCachedBoolColByIdIdx( long TenantId,
		long Id );

	ICFBamBoolColObj readCachedBoolColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamBoolColObj> readCachedBoolColByValTentIdx( long TenantId );

	List<ICFBamBoolColObj> readCachedBoolColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamBoolColObj> readCachedBoolColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamBoolColObj> readCachedBoolColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamBoolColObj> readCachedBoolColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamBoolColObj> readCachedBoolColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamBoolColObj> readCachedBoolColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamBoolColObj> readCachedBoolColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamBoolColObj> readCachedBoolColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamBoolColObj> readCachedBoolColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeBoolColByIdIdx( long TenantId,
		long Id );

	void deepDisposeBoolColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeBoolColByValTentIdx( long TenantId );

	void deepDisposeBoolColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeBoolColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeBoolColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeBoolColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeBoolColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeBoolColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeBoolColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBoolColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBoolColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamBoolColObj updateBoolCol( ICFBamBoolColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBoolCol( ICFBamBoolColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamBoolColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamBoolColObj refreshed cache instance.
	 */
	ICFBamBoolColObj moveUpBoolCol( ICFBamBoolColObj Obj );

	/**
	 *	Move the CFBamBoolColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamBoolColObj refreshed cache instance.
	 */
	ICFBamBoolColObj moveDownBoolCol( ICFBamBoolColObj Obj );
}
