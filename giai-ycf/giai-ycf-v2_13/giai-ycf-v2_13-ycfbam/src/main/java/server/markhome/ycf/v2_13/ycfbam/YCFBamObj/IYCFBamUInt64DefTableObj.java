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

public interface ICFBamUInt64DefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UInt64Def instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamUInt64DefObj newInstance();

	/**
	 *	Instantiate a new UInt64Def edition of the specified UInt64Def instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamUInt64DefEditObj newEditInstance( ICFBamUInt64DefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt64DefObj realiseUInt64Def( ICFBamUInt64DefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt64DefObj createUInt64Def( ICFBamUInt64DefObj Obj );

	/**
	 *	Read a UInt64Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt64Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUInt64DefObj readUInt64Def( CFBamValuePKey pkey );

	/**
	 *	Read a UInt64Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt64Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUInt64DefObj readUInt64Def( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamUInt64DefObj readCachedUInt64Def( CFBamValuePKey pkey );

	public void reallyDeepDisposeUInt64Def( ICFBamUInt64DefObj obj );

	void deepDisposeUInt64Def( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt64DefObj lockUInt64Def( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UInt64Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamUInt64DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUInt64DefObj> readAllUInt64Def();

	/**
	 *	Return a sorted map of all the UInt64Def-derived instances in the database.
	 *
	 *	@return	List of ICFBamUInt64DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUInt64DefObj> readAllUInt64Def( boolean forceRead );

	List<ICFBamUInt64DefObj> readCachedAllUInt64Def();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt64DefObj readUInt64DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt64DefObj readUInt64DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt64DefObj readUInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUInt64DefObj readUInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamUInt64DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamUInt64DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamUInt64DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUInt64DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamUInt64DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUInt64DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamUInt64DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamUInt64DefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamUInt64DefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUInt64DefObj> readUInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamUInt64DefObj readCachedUInt64DefByIdIdx( long TenantId,
		long Id );

	ICFBamUInt64DefObj readCachedUInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamUInt64DefObj> readCachedUInt64DefByValTentIdx( long TenantId );

	List<ICFBamUInt64DefObj> readCachedUInt64DefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamUInt64DefObj> readCachedUInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamUInt64DefObj> readCachedUInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamUInt64DefObj> readCachedUInt64DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamUInt64DefObj> readCachedUInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamUInt64DefObj> readCachedUInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamUInt64DefObj> readCachedUInt64DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamUInt64DefObj> readCachedUInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUInt64DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeUInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUInt64DefByValTentIdx( long TenantId );

	void deepDisposeUInt64DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUInt64DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUInt64DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamUInt64DefObj updateUInt64Def( ICFBamUInt64DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt64Def( ICFBamUInt64DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamUInt64DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUInt64DefObj refreshed cache instance.
	 */
	ICFBamUInt64DefObj moveUpUInt64Def( ICFBamUInt64DefObj Obj );

	/**
	 *	Move the CFBamUInt64DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUInt64DefObj refreshed cache instance.
	 */
	ICFBamUInt64DefObj moveDownUInt64Def( ICFBamUInt64DefObj Obj );
}
