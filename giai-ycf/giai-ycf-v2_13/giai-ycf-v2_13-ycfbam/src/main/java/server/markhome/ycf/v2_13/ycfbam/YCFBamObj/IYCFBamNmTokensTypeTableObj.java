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

public interface ICFBamNmTokensTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NmTokensType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamNmTokensTypeObj newInstance();

	/**
	 *	Instantiate a new NmTokensType edition of the specified NmTokensType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamNmTokensTypeEditObj newEditInstance( ICFBamNmTokensTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokensTypeObj realiseNmTokensType( ICFBamNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokensTypeObj createNmTokensType( ICFBamNmTokensTypeObj Obj );

	/**
	 *	Read a NmTokensType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNmTokensTypeObj readNmTokensType( CFBamValuePKey pkey );

	/**
	 *	Read a NmTokensType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNmTokensTypeObj readNmTokensType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamNmTokensTypeObj readCachedNmTokensType( CFBamValuePKey pkey );

	public void reallyDeepDisposeNmTokensType( ICFBamNmTokensTypeObj obj );

	void deepDisposeNmTokensType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokensTypeObj lockNmTokensType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NmTokensType-derived instances in the database.
	 *
	 *	@return	List of ICFBamNmTokensTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readAllNmTokensType();

	/**
	 *	Return a sorted map of all the NmTokensType-derived instances in the database.
	 *
	 *	@return	List of ICFBamNmTokensTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readAllNmTokensType( boolean forceRead );

	List<ICFBamNmTokensTypeObj> readCachedAllNmTokensType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokensTypeObj readNmTokensTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokensTypeObj readNmTokensTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokensTypeObj readNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNmTokensTypeObj readNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNmTokensTypeObj> readNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamNmTokensTypeObj readCachedNmTokensTypeByIdIdx( long TenantId,
		long Id );

	ICFBamNmTokensTypeObj readCachedNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeByValTentIdx( long TenantId );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNmTokensTypeObj> readCachedNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeNmTokensTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNmTokensTypeByValTentIdx( long TenantId );

	void deepDisposeNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNmTokensTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamNmTokensTypeObj updateNmTokensType( ICFBamNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensType( ICFBamNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamNmTokensTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNmTokensTypeObj refreshed cache instance.
	 */
	ICFBamNmTokensTypeObj moveUpNmTokensType( ICFBamNmTokensTypeObj Obj );

	/**
	 *	Move the CFBamNmTokensTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNmTokensTypeObj refreshed cache instance.
	 */
	ICFBamNmTokensTypeObj moveDownNmTokensType( ICFBamNmTokensTypeObj Obj );
}
