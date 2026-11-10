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

public interface IYCFBamTableTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Table instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTableObj newInstance();

	/**
	 *	Instantiate a new Table edition of the specified Table instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTableEditObj newEditInstance( IYCFBamTableObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTableObj realiseTable( IYCFBamTableObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTableObj createTable( IYCFBamTableObj Obj );

	/**
	 *	Read a Table-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Table-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTableObj readTable( YCFBamScopePKey pkey );

	/**
	 *	Read a Table-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Table-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTableObj readTable( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamTableObj readCachedTable( YCFBamScopePKey pkey );

	public void reallyDeepDisposeTable( IYCFBamTableObj obj );

	void deepDisposeTable( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTableObj lockTable( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the Table-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTableObj> readAllTable();

	/**
	 *	Return a sorted map of all the Table-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTableObj> readAllTable( boolean forceRead );

	List<IYCFBamTableObj> readCachedAllTable();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTableObj readTableByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTableObj readTableByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate SchemaDefIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate SchemaDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableBySchemaDefIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate SchemaDefIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate SchemaDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableBySchemaDefIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the YCFBamTableObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Table key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTableObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTableObj readTableByUNameIdx(long TenantId,
		long SchemaDefId,
		String Name );

	/**
	 *	Get the YCFBamTableObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Table key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTableObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTableObj readTableByUNameIdx(long TenantId,
		long SchemaDefId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the YCFBamTableObj instance for the unique SchemaCdIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argTableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTableObj cached instance for the unique SchemaCdIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTableObj readTableBySchemaCdIdx(long TenantId,
		long SchemaDefId,
		String TableClassCode );

	/**
	 *	Get the YCFBamTableObj instance for the unique SchemaCdIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argTableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTableObj refreshed instance for the unique SchemaCdIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTableObj readTableBySchemaCdIdx(long TenantId,
		long SchemaDefId,
		String TableClassCode,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate PrimaryIndexIdx key.
	 *
	 *	@param	argPrimaryIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argPrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate PrimaryIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate PrimaryIndexIdx key.
	 *
	 *	@param	argPrimaryIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argPrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate PrimaryIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate LookupIndexIdx key.
	 *
	 *	@param	argLookupIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argLookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate LookupIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate LookupIndexIdx key.
	 *
	 *	@param	argLookupIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argLookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate LookupIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate AltIndexIdx key.
	 *
	 *	@param	argAltIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argAltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate AltIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate AltIndexIdx key.
	 *
	 *	@param	argAltIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argAltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate AltIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate QualTableIdx key.
	 *
	 *	@param	argQualifyingTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argQualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate QualTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId );

	/**
	 *	Get the map of YCFBamTableObj instances sorted by their primary keys for the duplicate QualTableIdx key.
	 *
	 *	@param	argQualifyingTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argQualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTableObj cached instances sorted by their primary keys for the duplicate QualTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTableObj> readTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId,
		boolean forceRead );

	IYCFBamTableObj readCachedTableByIdIdx( long TenantId,
		long Id );

	List<IYCFBamTableObj> readCachedTableByTenantIdx( long TenantId );

	List<IYCFBamTableObj> readCachedTableBySchemaDefIdx( long TenantId,
		long SchemaDefId );

	List<IYCFBamTableObj> readCachedTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTableObj> readCachedTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTableObj> readCachedTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	IYCFBamTableObj readCachedTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name );

	IYCFBamTableObj readCachedTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode );

	List<IYCFBamTableObj> readCachedTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId );

	List<IYCFBamTableObj> readCachedTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId );

	List<IYCFBamTableObj> readCachedTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId );

	List<IYCFBamTableObj> readCachedTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId );

	void deepDisposeTableByIdIdx( long TenantId,
		long Id );

	void deepDisposeTableByTenantIdx( long TenantId );

	void deepDisposeTableBySchemaDefIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name );

	void deepDisposeTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode );

	void deepDisposeTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId );

	void deepDisposeTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId );

	void deepDisposeTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId );

	void deepDisposeTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTableObj updateTable( IYCFBamTableObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTable( IYCFBamTableObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaDefIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByUNameIdx(long TenantId,
		long SchemaDefId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argTableClassCode	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaCdIdx(long TenantId,
		long SchemaDefId,
		String TableClassCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrimaryIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argPrimaryIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argLookupIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argLookupIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argAltIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argAltIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argQualifyingTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argQualifyingTableId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId );
}
