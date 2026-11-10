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

public interface IYCFBamTZTimestampTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZTimestampType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTZTimestampTypeObj newInstance();

	/**
	 *	Instantiate a new TZTimestampType edition of the specified TZTimestampType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTZTimestampTypeEditObj newEditInstance( IYCFBamTZTimestampTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimestampTypeObj realiseTZTimestampType( IYCFBamTZTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimestampTypeObj createTZTimestampType( IYCFBamTZTimestampTypeObj Obj );

	/**
	 *	Read a TZTimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZTimestampTypeObj readTZTimestampType( YCFBamValuePKey pkey );

	/**
	 *	Read a TZTimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZTimestampTypeObj readTZTimestampType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTZTimestampTypeObj readCachedTZTimestampType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTZTimestampType( IYCFBamTZTimestampTypeObj obj );

	void deepDisposeTZTimestampType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimestampTypeObj lockTZTimestampType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZTimestampType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readAllTZTimestampType();

	/**
	 *	Return a sorted map of all the TZTimestampType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readAllTZTimestampType( boolean forceRead );

	List<IYCFBamTZTimestampTypeObj> readCachedAllTZTimestampType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimestampTypeObj readTZTimestampTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimestampTypeObj readTZTimestampTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimestampTypeObj readTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimestampTypeObj readTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamTZTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamTZTimestampTypeObj readCachedTZTimestampTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamTZTimestampTypeObj readCachedTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByValTentIdx( long TenantId );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTZTimestampTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZTimestampTypeByValTentIdx( long TenantId );

	void deepDisposeTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimestampTypeObj updateTZTimestampType( IYCFBamTZTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimestampType( IYCFBamTZTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamTZTimestampTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimestampTypeObj refreshed cache instance.
	 */
	IYCFBamTZTimestampTypeObj moveUpTZTimestampType( IYCFBamTZTimestampTypeObj Obj );

	/**
	 *	Move the YCFBamTZTimestampTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimestampTypeObj refreshed cache instance.
	 */
	IYCFBamTZTimestampTypeObj moveDownTZTimestampType( IYCFBamTZTimestampTypeObj Obj );
}
