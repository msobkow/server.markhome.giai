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

public interface ICFBamFloatTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new FloatType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamFloatTypeObj newInstance();

	/**
	 *	Instantiate a new FloatType edition of the specified FloatType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamFloatTypeEditObj newEditInstance( ICFBamFloatTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatTypeObj realiseFloatType( ICFBamFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatTypeObj createFloatType( ICFBamFloatTypeObj Obj );

	/**
	 *	Read a FloatType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamFloatTypeObj readFloatType( CFBamValuePKey pkey );

	/**
	 *	Read a FloatType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamFloatTypeObj readFloatType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamFloatTypeObj readCachedFloatType( CFBamValuePKey pkey );

	public void reallyDeepDisposeFloatType( ICFBamFloatTypeObj obj );

	void deepDisposeFloatType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatTypeObj lockFloatType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the FloatType-derived instances in the database.
	 *
	 *	@return	List of ICFBamFloatTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamFloatTypeObj> readAllFloatType();

	/**
	 *	Return a sorted map of all the FloatType-derived instances in the database.
	 *
	 *	@return	List of ICFBamFloatTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamFloatTypeObj> readAllFloatType( boolean forceRead );

	List<ICFBamFloatTypeObj> readCachedAllFloatType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatTypeObj readFloatTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatTypeObj readFloatTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatTypeObj readFloatTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatTypeObj readFloatTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamFloatTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatTypeObj> readFloatTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamFloatTypeObj readCachedFloatTypeByIdIdx( long TenantId,
		long Id );

	ICFBamFloatTypeObj readCachedFloatTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamFloatTypeObj> readCachedFloatTypeByValTentIdx( long TenantId );

	List<ICFBamFloatTypeObj> readCachedFloatTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamFloatTypeObj> readCachedFloatTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamFloatTypeObj> readCachedFloatTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamFloatTypeObj> readCachedFloatTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamFloatTypeObj> readCachedFloatTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamFloatTypeObj> readCachedFloatTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamFloatTypeObj> readCachedFloatTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamFloatTypeObj> readCachedFloatTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamFloatTypeObj> readCachedFloatTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeFloatTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeFloatTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeFloatTypeByValTentIdx( long TenantId );

	void deepDisposeFloatTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeFloatTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeFloatTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeFloatTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeFloatTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeFloatTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeFloatTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatTypeObj updateFloatType( ICFBamFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatType( ICFBamFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamFloatTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamFloatTypeObj refreshed cache instance.
	 */
	ICFBamFloatTypeObj moveUpFloatType( ICFBamFloatTypeObj Obj );

	/**
	 *	Move the CFBamFloatTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamFloatTypeObj refreshed cache instance.
	 */
	ICFBamFloatTypeObj moveDownFloatType( ICFBamFloatTypeObj Obj );
}
