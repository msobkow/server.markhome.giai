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

public interface IYCFBamDbKeyHash256GenTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash256Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDbKeyHash256GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash256Gen edition of the specified DbKeyHash256Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDbKeyHash256GenEditObj newEditInstance( IYCFBamDbKeyHash256GenObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash256GenObj realiseDbKeyHash256Gen( IYCFBamDbKeyHash256GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash256GenObj createDbKeyHash256Gen( IYCFBamDbKeyHash256GenObj Obj );

	/**
	 *	Read a DbKeyHash256Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash256GenObj readDbKeyHash256Gen( YCFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash256Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash256GenObj readDbKeyHash256Gen( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDbKeyHash256GenObj readCachedDbKeyHash256Gen( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash256Gen( IYCFBamDbKeyHash256GenObj obj );

	void deepDisposeDbKeyHash256Gen( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash256GenObj lockDbKeyHash256Gen( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash256Gen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash256GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readAllDbKeyHash256Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash256Gen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash256GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readAllDbKeyHash256Gen( boolean forceRead );

	List<IYCFBamDbKeyHash256GenObj> readCachedAllDbKeyHash256Gen();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash256GenObj readDbKeyHash256GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash256GenObj readDbKeyHash256GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash256GenObj readDbKeyHash256GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash256GenObj readDbKeyHash256GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDbKeyHash256TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of YCFBamDbKeyHash256GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash256GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash256GenObj> readDbKeyHash256GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	IYCFBamDbKeyHash256GenObj readCachedDbKeyHash256GenByIdIdx( long TenantId,
		long Id );

	IYCFBamDbKeyHash256GenObj readCachedDbKeyHash256GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByValTentIdx( long TenantId );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<IYCFBamDbKeyHash256GenObj> readCachedDbKeyHash256GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeDbKeyHash256GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash256GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash256GenByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash256GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash256GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash256GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash256GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash256GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash256GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash256GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash256GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash256GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash256GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash256GenObj updateDbKeyHash256Gen( IYCFBamDbKeyHash256GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash256Gen( IYCFBamDbKeyHash256GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash256Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the YCFBamDbKeyHash256GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash256GenObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash256GenObj moveUpDbKeyHash256Gen( IYCFBamDbKeyHash256GenObj Obj );

	/**
	 *	Move the YCFBamDbKeyHash256GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash256GenObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash256GenObj moveDownDbKeyHash256Gen( IYCFBamDbKeyHash256GenObj Obj );
}
