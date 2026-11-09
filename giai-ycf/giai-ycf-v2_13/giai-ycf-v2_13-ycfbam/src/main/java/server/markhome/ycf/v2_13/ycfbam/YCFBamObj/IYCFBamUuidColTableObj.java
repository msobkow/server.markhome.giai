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

public interface ICFBamUuidColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UuidCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamUuidColObj newInstance();

	/**
	 *	Instantiate a new UuidCol edition of the specified UuidCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamUuidColEditObj newEditInstance( ICFBamUuidColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidColObj realiseUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidColObj createUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuidColObj readUuidCol( CFBamValuePKey pkey );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamUuidColObj readUuidCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamUuidColObj readCachedUuidCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeUuidCol( ICFBamUuidColObj obj );

	void deepDisposeUuidCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidColObj lockUuidCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuidColObj> readAllUuidCol();

	/**
	 *	Return a sorted map of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamUuidColObj> readAllUuidCol( boolean forceRead );

	List<ICFBamUuidColObj> readCachedAllUuidCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidColObj readUuidColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidColObj readUuidColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidColObj readUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamUuidColObj readUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamUuidColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamUuidColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamUuidColObj> readUuidColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamUuidColObj readCachedUuidColByIdIdx( long TenantId,
		long Id );

	ICFBamUuidColObj readCachedUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamUuidColObj> readCachedUuidColByValTentIdx( long TenantId );

	List<ICFBamUuidColObj> readCachedUuidColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamUuidColObj> readCachedUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamUuidColObj> readCachedUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamUuidColObj> readCachedUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamUuidColObj> readCachedUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamUuidColObj> readCachedUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamUuidColObj> readCachedUuidColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamUuidColObj> readCachedUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamUuidColObj> readCachedUuidColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeUuidColByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuidColByValTentIdx( long TenantId );

	void deepDisposeUuidColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuidColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamUuidColObj updateUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamUuidColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuidColObj refreshed cache instance.
	 */
	ICFBamUuidColObj moveUpUuidCol( ICFBamUuidColObj Obj );

	/**
	 *	Move the CFBamUuidColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamUuidColObj refreshed cache instance.
	 */
	ICFBamUuidColObj moveDownUuidCol( ICFBamUuidColObj Obj );
}
