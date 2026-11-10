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

public interface IYCFBamBoolTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new BoolType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamBoolTypeObj newInstance();

	/**
	 *	Instantiate a new BoolType edition of the specified BoolType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamBoolTypeEditObj newEditInstance( IYCFBamBoolTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamBoolTypeObj realiseBoolType( IYCFBamBoolTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamBoolTypeObj createBoolType( IYCFBamBoolTypeObj Obj );

	/**
	 *	Read a BoolType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamBoolTypeObj readBoolType( YCFBamValuePKey pkey );

	/**
	 *	Read a BoolType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamBoolTypeObj readBoolType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamBoolTypeObj readCachedBoolType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeBoolType( IYCFBamBoolTypeObj obj );

	void deepDisposeBoolType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamBoolTypeObj lockBoolType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the BoolType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamBoolTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamBoolTypeObj> readAllBoolType();

	/**
	 *	Return a sorted map of all the BoolType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamBoolTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamBoolTypeObj> readAllBoolType( boolean forceRead );

	List<IYCFBamBoolTypeObj> readCachedAllBoolType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBoolTypeObj readBoolTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBoolTypeObj readBoolTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBoolTypeObj readBoolTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBoolTypeObj readBoolTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamBoolTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolTypeObj> readBoolTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamBoolTypeObj readCachedBoolTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamBoolTypeObj readCachedBoolTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeByValTentIdx( long TenantId );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamBoolTypeObj> readCachedBoolTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeBoolTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeBoolTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeBoolTypeByValTentIdx( long TenantId );

	void deepDisposeBoolTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeBoolTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeBoolTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeBoolTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeBoolTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeBoolTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeBoolTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBoolTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBoolTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamBoolTypeObj updateBoolType( IYCFBamBoolTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBoolType( IYCFBamBoolTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamBoolTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamBoolTypeObj refreshed cache instance.
	 */
	IYCFBamBoolTypeObj moveUpBoolType( IYCFBamBoolTypeObj Obj );

	/**
	 *	Move the YCFBamBoolTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamBoolTypeObj refreshed cache instance.
	 */
	IYCFBamBoolTypeObj moveDownBoolType( IYCFBamBoolTypeObj Obj );
}
