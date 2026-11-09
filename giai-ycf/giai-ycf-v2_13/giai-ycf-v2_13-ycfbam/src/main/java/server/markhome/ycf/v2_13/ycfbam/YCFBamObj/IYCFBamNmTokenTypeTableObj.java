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

public interface ICFBamNmTokenTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NmTokenType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamNmTokenTypeObj newInstance();

	/**
	 *	Instantiate a new NmTokenType edition of the specified NmTokenType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamNmTokenTypeEditObj newEditInstance( ICFBamNmTokenTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokenTypeObj realiseNmTokenType( ICFBamNmTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokenTypeObj createNmTokenType( ICFBamNmTokenTypeObj Obj );

	/**
	 *	Read a NmTokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNmTokenTypeObj readNmTokenType( CFBamValuePKey pkey );

	/**
	 *	Read a NmTokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNmTokenTypeObj readNmTokenType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamNmTokenTypeObj readCachedNmTokenType( CFBamValuePKey pkey );

	public void reallyDeepDisposeNmTokenType( ICFBamNmTokenTypeObj obj );

	void deepDisposeNmTokenType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokenTypeObj lockNmTokenType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NmTokenType-derived instances in the database.
	 *
	 *	@return	List of ICFBamNmTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readAllNmTokenType();

	/**
	 *	Return a sorted map of all the NmTokenType-derived instances in the database.
	 *
	 *	@return	List of ICFBamNmTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readAllNmTokenType( boolean forceRead );

	List<ICFBamNmTokenTypeObj> readCachedAllNmTokenType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokenTypeObj readNmTokenTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokenTypeObj readNmTokenTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokenTypeObj readNmTokenTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokenTypeObj readNmTokenTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokenTypeObj> readNmTokenTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamNmTokenTypeObj readCachedNmTokenTypeByIdIdx( long TenantId,
		long Id );

	ICFBamNmTokenTypeObj readCachedNmTokenTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeByValTentIdx( long TenantId );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNmTokenTypeObj> readCachedNmTokenTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeNmTokenTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeNmTokenTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNmTokenTypeByValTentIdx( long TenantId );

	void deepDisposeNmTokenTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNmTokenTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNmTokenTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNmTokenTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNmTokenTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNmTokenTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNmTokenTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokenTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokenTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokenTypeObj updateNmTokenType( ICFBamNmTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokenType( ICFBamNmTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamNmTokenTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNmTokenTypeObj refreshed cache instance.
	 */
	ICFBamNmTokenTypeObj moveUpNmTokenType( ICFBamNmTokenTypeObj Obj );

	/**
	 *	Move the CFBamNmTokenTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNmTokenTypeObj refreshed cache instance.
	 */
	ICFBamNmTokenTypeObj moveDownNmTokenType( ICFBamNmTokenTypeObj Obj );
}
