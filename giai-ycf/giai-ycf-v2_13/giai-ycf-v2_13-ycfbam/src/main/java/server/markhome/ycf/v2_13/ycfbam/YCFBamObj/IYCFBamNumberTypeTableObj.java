// Description: Java 11 Table Object interface for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
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
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamNumberTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NumberType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamNumberTypeObj newInstance();

	/**
	 *	Instantiate a new NumberType edition of the specified NumberType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamNumberTypeEditObj newEditInstance( IYCFBamNumberTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamNumberTypeObj realiseNumberType( IYCFBamNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamNumberTypeObj createNumberType( IYCFBamNumberTypeObj Obj );

	/**
	 *	Read a NumberType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNumberTypeObj readNumberType( YCFBamValuePKey pkey );

	/**
	 *	Read a NumberType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNumberTypeObj readNumberType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamNumberTypeObj readCachedNumberType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeNumberType( IYCFBamNumberTypeObj obj );

	void deepDisposeNumberType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamNumberTypeObj lockNumberType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NumberType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNumberTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNumberTypeObj> readAllNumberType();

	/**
	 *	Return a sorted map of all the NumberType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNumberTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNumberTypeObj> readAllNumberType( boolean forceRead );

	List<IYCFBamNumberTypeObj> readCachedAllNumberType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNumberTypeObj readNumberTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNumberTypeObj readNumberTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNumberTypeObj readNumberTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNumberTypeObj readNumberTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamNumberTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberTypeObj> readNumberTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamNumberTypeObj readCachedNumberTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamNumberTypeObj readCachedNumberTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeByValTentIdx( long TenantId );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNumberTypeObj> readCachedNumberTypeBySchemaIdx( long TenantId,
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

	void deepDisposeNumberTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNumberTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNumberTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamNumberTypeObj updateNumberType( IYCFBamNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberType( IYCFBamNumberTypeObj Obj );

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
	void deleteNumberTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
	 *	Move the YCFBamNumberTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNumberTypeObj refreshed cache instance.
	 */
	IYCFBamNumberTypeObj moveUpNumberType( IYCFBamNumberTypeObj Obj );

	/**
	 *	Move the YCFBamNumberTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNumberTypeObj refreshed cache instance.
	 */
	IYCFBamNumberTypeObj moveDownNumberType( IYCFBamNumberTypeObj Obj );
}
