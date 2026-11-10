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

public interface IYCFBamTZDateTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZDateType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTZDateTypeObj newInstance();

	/**
	 *	Instantiate a new TZDateType edition of the specified TZDateType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTZDateTypeEditObj newEditInstance( IYCFBamTZDateTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZDateTypeObj realiseTZDateType( IYCFBamTZDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZDateTypeObj createTZDateType( IYCFBamTZDateTypeObj Obj );

	/**
	 *	Read a TZDateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZDateTypeObj readTZDateType( YCFBamValuePKey pkey );

	/**
	 *	Read a TZDateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZDateTypeObj readTZDateType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTZDateTypeObj readCachedTZDateType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTZDateType( IYCFBamTZDateTypeObj obj );

	void deepDisposeTZDateType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZDateTypeObj lockTZDateType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZDateType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readAllTZDateType();

	/**
	 *	Return a sorted map of all the TZDateType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readAllTZDateType( boolean forceRead );

	List<IYCFBamTZDateTypeObj> readCachedAllTZDateType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZDateTypeObj readTZDateTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZDateTypeObj readTZDateTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZDateTypeObj readTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZDateTypeObj readTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamTZDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateTypeObj> readTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamTZDateTypeObj readCachedTZDateTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamTZDateTypeObj readCachedTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeByValTentIdx( long TenantId );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZDateTypeObj> readCachedTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTZDateTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZDateTypeByValTentIdx( long TenantId );

	void deepDisposeTZDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZDateTypeObj updateTZDateType( IYCFBamTZDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZDateType( IYCFBamTZDateTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamTZDateTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZDateTypeObj refreshed cache instance.
	 */
	IYCFBamTZDateTypeObj moveUpTZDateType( IYCFBamTZDateTypeObj Obj );

	/**
	 *	Move the YCFBamTZDateTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZDateTypeObj refreshed cache instance.
	 */
	IYCFBamTZDateTypeObj moveDownTZDateType( IYCFBamTZDateTypeObj Obj );
}
