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

public interface IYCFBamFloatTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new FloatType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamFloatTypeObj newInstance();

	/**
	 *	Instantiate a new FloatType edition of the specified FloatType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamFloatTypeEditObj newEditInstance( IYCFBamFloatTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatTypeObj realiseFloatType( IYCFBamFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatTypeObj createFloatType( IYCFBamFloatTypeObj Obj );

	/**
	 *	Read a FloatType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamFloatTypeObj readFloatType( YCFBamValuePKey pkey );

	/**
	 *	Read a FloatType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamFloatTypeObj readFloatType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamFloatTypeObj readCachedFloatType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeFloatType( IYCFBamFloatTypeObj obj );

	void deepDisposeFloatType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatTypeObj lockFloatType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the FloatType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamFloatTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamFloatTypeObj> readAllFloatType();

	/**
	 *	Return a sorted map of all the FloatType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamFloatTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamFloatTypeObj> readAllFloatType( boolean forceRead );

	List<IYCFBamFloatTypeObj> readCachedAllFloatType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatTypeObj readFloatTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatTypeObj readFloatTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatTypeObj readFloatTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatTypeObj readFloatTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamFloatTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatTypeObj> readFloatTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamFloatTypeObj readCachedFloatTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamFloatTypeObj readCachedFloatTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeByValTentIdx( long TenantId );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamFloatTypeObj> readCachedFloatTypeBySchemaIdx( long TenantId,
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

	void deepDisposeFloatTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatTypeObj updateFloatType( IYCFBamFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatType( IYCFBamFloatTypeObj Obj );

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
	void deleteFloatTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
	 *	Move the YCFBamFloatTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamFloatTypeObj refreshed cache instance.
	 */
	IYCFBamFloatTypeObj moveUpFloatType( IYCFBamFloatTypeObj Obj );

	/**
	 *	Move the YCFBamFloatTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamFloatTypeObj refreshed cache instance.
	 */
	IYCFBamFloatTypeObj moveDownFloatType( IYCFBamFloatTypeObj Obj );
}
