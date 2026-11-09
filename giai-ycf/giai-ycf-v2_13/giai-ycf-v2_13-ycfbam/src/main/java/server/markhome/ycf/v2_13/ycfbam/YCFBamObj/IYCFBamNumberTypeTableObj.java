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

public interface ICFBamNumberTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NumberType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamNumberTypeObj newInstance();

	/**
	 *	Instantiate a new NumberType edition of the specified NumberType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamNumberTypeEditObj newEditInstance( ICFBamNumberTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberTypeObj realiseNumberType( ICFBamNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberTypeObj createNumberType( ICFBamNumberTypeObj Obj );

	/**
	 *	Read a NumberType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNumberTypeObj readNumberType( CFBamValuePKey pkey );

	/**
	 *	Read a NumberType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNumberTypeObj readNumberType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamNumberTypeObj readCachedNumberType( CFBamValuePKey pkey );

	public void reallyDeepDisposeNumberType( ICFBamNumberTypeObj obj );

	void deepDisposeNumberType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberTypeObj lockNumberType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NumberType-derived instances in the database.
	 *
	 *	@return	List of ICFBamNumberTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNumberTypeObj> readAllNumberType();

	/**
	 *	Return a sorted map of all the NumberType-derived instances in the database.
	 *
	 *	@return	List of ICFBamNumberTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNumberTypeObj> readAllNumberType( boolean forceRead );

	List<ICFBamNumberTypeObj> readCachedAllNumberType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberTypeObj readNumberTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberTypeObj readNumberTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberTypeObj readNumberTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberTypeObj readNumberTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamNumberTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberTypeObj> readNumberTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamNumberTypeObj readCachedNumberTypeByIdIdx( long TenantId,
		long Id );

	ICFBamNumberTypeObj readCachedNumberTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamNumberTypeObj> readCachedNumberTypeByValTentIdx( long TenantId );

	List<ICFBamNumberTypeObj> readCachedNumberTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamNumberTypeObj> readCachedNumberTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamNumberTypeObj> readCachedNumberTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamNumberTypeObj> readCachedNumberTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamNumberTypeObj> readCachedNumberTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamNumberTypeObj> readCachedNumberTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamNumberTypeObj> readCachedNumberTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNumberTypeObj> readCachedNumberTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNumberTypeObj> readCachedNumberTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeNumberTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeNumberTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNumberTypeByValTentIdx( long TenantId );

	void deepDisposeNumberTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNumberTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNumberTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNumberTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNumberTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNumberTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNumberTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNumberTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNumberTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberTypeObj updateNumberType( ICFBamNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberType( ICFBamNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamNumberTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNumberTypeObj refreshed cache instance.
	 */
	ICFBamNumberTypeObj moveUpNumberType( ICFBamNumberTypeObj Obj );

	/**
	 *	Move the CFBamNumberTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNumberTypeObj refreshed cache instance.
	 */
	ICFBamNumberTypeObj moveDownNumberType( ICFBamNumberTypeObj Obj );
}
