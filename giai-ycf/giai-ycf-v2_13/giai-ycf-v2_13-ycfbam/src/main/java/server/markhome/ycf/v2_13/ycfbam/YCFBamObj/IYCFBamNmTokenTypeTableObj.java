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

public interface IYCFBamNmTokenTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NmTokenType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamNmTokenTypeObj newInstance();

	/**
	 *	Instantiate a new NmTokenType edition of the specified NmTokenType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamNmTokenTypeEditObj newEditInstance( IYCFBamNmTokenTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenTypeObj realiseNmTokenType( IYCFBamNmTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenTypeObj createNmTokenType( IYCFBamNmTokenTypeObj Obj );

	/**
	 *	Read a NmTokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokenTypeObj readNmTokenType( YCFBamValuePKey pkey );

	/**
	 *	Read a NmTokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokenTypeObj readNmTokenType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamNmTokenTypeObj readCachedNmTokenType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeNmTokenType( IYCFBamNmTokenTypeObj obj );

	void deepDisposeNmTokenType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenTypeObj lockNmTokenType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NmTokenType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readAllNmTokenType();

	/**
	 *	Return a sorted map of all the NmTokenType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readAllNmTokenType( boolean forceRead );

	List<IYCFBamNmTokenTypeObj> readCachedAllNmTokenType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenTypeObj readNmTokenTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenTypeObj readNmTokenTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenTypeObj readNmTokenTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenTypeObj readNmTokenTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamNmTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenTypeObj> readNmTokenTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamNmTokenTypeObj readCachedNmTokenTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamNmTokenTypeObj readCachedNmTokenTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeByValTentIdx( long TenantId );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNmTokenTypeObj> readCachedNmTokenTypeBySchemaIdx( long TenantId,
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

	void deepDisposeNmTokenTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokenTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokenTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenTypeObj updateNmTokenType( IYCFBamNmTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokenType( IYCFBamNmTokenTypeObj Obj );

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
	void deleteNmTokenTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
	 *	Move the YCFBamNmTokenTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokenTypeObj refreshed cache instance.
	 */
	IYCFBamNmTokenTypeObj moveUpNmTokenType( IYCFBamNmTokenTypeObj Obj );

	/**
	 *	Move the YCFBamNmTokenTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokenTypeObj refreshed cache instance.
	 */
	IYCFBamNmTokenTypeObj moveDownNmTokenType( IYCFBamNmTokenTypeObj Obj );
}
