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

public interface ICFBamTextTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TextType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTextTypeObj newInstance();

	/**
	 *	Instantiate a new TextType edition of the specified TextType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTextTypeEditObj newEditInstance( ICFBamTextTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTextTypeObj realiseTextType( ICFBamTextTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTextTypeObj createTextType( ICFBamTextTypeObj Obj );

	/**
	 *	Read a TextType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTextTypeObj readTextType( CFBamValuePKey pkey );

	/**
	 *	Read a TextType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTextTypeObj readTextType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTextTypeObj readCachedTextType( CFBamValuePKey pkey );

	public void reallyDeepDisposeTextType( ICFBamTextTypeObj obj );

	void deepDisposeTextType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTextTypeObj lockTextType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TextType-derived instances in the database.
	 *
	 *	@return	List of ICFBamTextTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTextTypeObj> readAllTextType();

	/**
	 *	Return a sorted map of all the TextType-derived instances in the database.
	 *
	 *	@return	List of ICFBamTextTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTextTypeObj> readAllTextType( boolean forceRead );

	List<ICFBamTextTypeObj> readCachedAllTextType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTextTypeObj readTextTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTextTypeObj readTextTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTextTypeObj readTextTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTextTypeObj readTextTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamTextTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextTypeObj> readTextTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamTextTypeObj readCachedTextTypeByIdIdx( long TenantId,
		long Id );

	ICFBamTextTypeObj readCachedTextTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTextTypeObj> readCachedTextTypeByValTentIdx( long TenantId );

	List<ICFBamTextTypeObj> readCachedTextTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTextTypeObj> readCachedTextTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTextTypeObj> readCachedTextTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTextTypeObj> readCachedTextTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTextTypeObj> readCachedTextTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTextTypeObj> readCachedTextTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTextTypeObj> readCachedTextTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTextTypeObj> readCachedTextTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTextTypeObj> readCachedTextTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTextTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeTextTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTextTypeByValTentIdx( long TenantId );

	void deepDisposeTextTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTextTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTextTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTextTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTextTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTextTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTextTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTextTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTextTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamTextTypeObj updateTextType( ICFBamTextTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTextType( ICFBamTextTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamTextTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTextTypeObj refreshed cache instance.
	 */
	ICFBamTextTypeObj moveUpTextType( ICFBamTextTypeObj Obj );

	/**
	 *	Move the CFBamTextTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTextTypeObj refreshed cache instance.
	 */
	ICFBamTextTypeObj moveDownTextType( ICFBamTextTypeObj Obj );
}
