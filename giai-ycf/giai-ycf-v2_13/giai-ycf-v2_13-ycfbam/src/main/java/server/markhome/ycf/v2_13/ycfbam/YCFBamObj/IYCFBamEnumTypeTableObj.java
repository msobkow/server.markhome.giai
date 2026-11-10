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

public interface IYCFBamEnumTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new EnumType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamEnumTypeObj newInstance();

	/**
	 *	Instantiate a new EnumType edition of the specified EnumType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamEnumTypeEditObj newEditInstance( IYCFBamEnumTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumTypeObj realiseEnumType( IYCFBamEnumTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumTypeObj createEnumType( IYCFBamEnumTypeObj Obj );

	/**
	 *	Read a EnumType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamEnumTypeObj readEnumType( YCFBamValuePKey pkey );

	/**
	 *	Read a EnumType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamEnumTypeObj readEnumType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamEnumTypeObj readCachedEnumType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeEnumType( IYCFBamEnumTypeObj obj );

	void deepDisposeEnumType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumTypeObj lockEnumType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the EnumType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamEnumTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamEnumTypeObj> readAllEnumType();

	/**
	 *	Return a sorted map of all the EnumType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamEnumTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamEnumTypeObj> readAllEnumType( boolean forceRead );

	List<IYCFBamEnumTypeObj> readCachedAllEnumType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumTypeObj readEnumTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumTypeObj readEnumTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumTypeObj readEnumTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumTypeObj readEnumTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamEnumTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTypeObj> readEnumTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamEnumTypeObj readCachedEnumTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamEnumTypeObj readCachedEnumTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeByValTentIdx( long TenantId );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamEnumTypeObj> readCachedEnumTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeEnumTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeEnumTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeEnumTypeByValTentIdx( long TenantId );

	void deepDisposeEnumTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeEnumTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeEnumTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeEnumTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeEnumTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeEnumTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeEnumTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeEnumTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeEnumTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumTypeObj updateEnumType( IYCFBamEnumTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumType( IYCFBamEnumTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamEnumTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamEnumTypeObj refreshed cache instance.
	 */
	IYCFBamEnumTypeObj moveUpEnumType( IYCFBamEnumTypeObj Obj );

	/**
	 *	Move the YCFBamEnumTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamEnumTypeObj refreshed cache instance.
	 */
	IYCFBamEnumTypeObj moveDownEnumType( IYCFBamEnumTypeObj Obj );
}
