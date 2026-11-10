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

public interface IYCFBamNmTokensTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NmTokensType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamNmTokensTypeObj newInstance();

	/**
	 *	Instantiate a new NmTokensType edition of the specified NmTokensType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamNmTokensTypeEditObj newEditInstance( IYCFBamNmTokensTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokensTypeObj realiseNmTokensType( IYCFBamNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokensTypeObj createNmTokensType( IYCFBamNmTokensTypeObj Obj );

	/**
	 *	Read a NmTokensType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokensTypeObj readNmTokensType( YCFBamValuePKey pkey );

	/**
	 *	Read a NmTokensType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokensTypeObj readNmTokensType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamNmTokensTypeObj readCachedNmTokensType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeNmTokensType( IYCFBamNmTokensTypeObj obj );

	void deepDisposeNmTokensType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokensTypeObj lockNmTokensType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NmTokensType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokensTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readAllNmTokensType();

	/**
	 *	Return a sorted map of all the NmTokensType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokensTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readAllNmTokensType( boolean forceRead );

	List<IYCFBamNmTokensTypeObj> readCachedAllNmTokensType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokensTypeObj readNmTokensTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokensTypeObj readNmTokensTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokensTypeObj readNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokensTypeObj readNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamNmTokensTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensTypeObj> readNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamNmTokensTypeObj readCachedNmTokensTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamNmTokensTypeObj readCachedNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByValTentIdx( long TenantId );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeBySchemaIdx( long TenantId,
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

	void deepDisposeNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokensTypeObj updateNmTokensType( IYCFBamNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensType( IYCFBamNmTokensTypeObj Obj );

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
	void deleteNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
	 *	Move the YCFBamNmTokensTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokensTypeObj refreshed cache instance.
	 */
	IYCFBamNmTokensTypeObj moveUpNmTokensType( IYCFBamNmTokensTypeObj Obj );

	/**
	 *	Move the YCFBamNmTokensTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokensTypeObj refreshed cache instance.
	 */
	IYCFBamNmTokensTypeObj moveDownNmTokensType( IYCFBamNmTokensTypeObj Obj );
}
