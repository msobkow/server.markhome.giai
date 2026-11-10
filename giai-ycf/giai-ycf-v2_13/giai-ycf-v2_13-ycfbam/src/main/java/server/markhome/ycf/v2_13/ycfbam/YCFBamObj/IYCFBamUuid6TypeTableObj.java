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

public interface IYCFBamUuid6TypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Uuid6Type instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamUuid6TypeObj newInstance();

	/**
	 *	Instantiate a new Uuid6Type edition of the specified Uuid6Type instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamUuid6TypeEditObj newEditInstance( IYCFBamUuid6TypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6TypeObj realiseUuid6Type( IYCFBamUuid6TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6TypeObj createUuid6Type( IYCFBamUuid6TypeObj Obj );

	/**
	 *	Read a Uuid6Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuid6TypeObj readUuid6Type( YCFBamValuePKey pkey );

	/**
	 *	Read a Uuid6Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuid6TypeObj readUuid6Type( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamUuid6TypeObj readCachedUuid6Type( YCFBamValuePKey pkey );

	public void reallyDeepDisposeUuid6Type( IYCFBamUuid6TypeObj obj );

	void deepDisposeUuid6Type( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6TypeObj lockUuid6Type( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Uuid6Type-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuid6TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readAllUuid6Type();

	/**
	 *	Return a sorted map of all the Uuid6Type-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuid6TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readAllUuid6Type( boolean forceRead );

	List<IYCFBamUuid6TypeObj> readCachedAllUuid6Type();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6TypeObj readUuid6TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6TypeObj readUuid6TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6TypeObj readUuid6TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6TypeObj readUuid6TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamUuid6TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6TypeObj> readUuid6TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamUuid6TypeObj readCachedUuid6TypeByIdIdx( long TenantId,
		long Id );

	IYCFBamUuid6TypeObj readCachedUuid6TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeByValTentIdx( long TenantId );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuid6TypeObj> readCachedUuid6TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeUuid6TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuid6TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuid6TypeByValTentIdx( long TenantId );

	void deepDisposeUuid6TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuid6TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuid6TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuid6TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuid6TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuid6TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuid6TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuid6TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuid6TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6TypeObj updateUuid6Type( IYCFBamUuid6TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuid6Type( IYCFBamUuid6TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Uuid6Type key attribute of the instance generating the id.
	 */
	void deleteUuid6TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the YCFBamUuid6TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuid6TypeObj refreshed cache instance.
	 */
	IYCFBamUuid6TypeObj moveUpUuid6Type( IYCFBamUuid6TypeObj Obj );

	/**
	 *	Move the YCFBamUuid6TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuid6TypeObj refreshed cache instance.
	 */
	IYCFBamUuid6TypeObj moveDownUuid6Type( IYCFBamUuid6TypeObj Obj );
}
