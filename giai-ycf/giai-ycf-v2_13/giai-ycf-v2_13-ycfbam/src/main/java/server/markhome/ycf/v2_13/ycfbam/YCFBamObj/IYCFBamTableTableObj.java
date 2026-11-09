// Description: Java 11 Table Object interface for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamTableTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Table instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTableObj newInstance();

	/**
	 *	Instantiate a new Table edition of the specified Table instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTableEditObj newEditInstance( ICFBamTableObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTableObj realiseTable( ICFBamTableObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTableObj createTable( ICFBamTableObj Obj );

	/**
	 *	Read a Table-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Table-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTableObj readTable( CFBamScopePKey pkey );

	/**
	 *	Read a Table-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Table-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTableObj readTable( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamTableObj readCachedTable( CFBamScopePKey pkey );

	public void reallyDeepDisposeTable( ICFBamTableObj obj );

	void deepDisposeTable( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTableObj lockTable( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the Table-derived instances in the database.
	 *
	 *	@return	List of ICFBamTableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTableObj> readAllTable();

	/**
	 *	Return a sorted map of all the Table-derived instances in the database.
	 *
	 *	@return	List of ICFBamTableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTableObj> readAllTable( boolean forceRead );

	List<ICFBamTableObj> readCachedAllTable();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableObj readTableByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableObj readTableByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate SchemaDefIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate SchemaDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableBySchemaDefIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate SchemaDefIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate SchemaDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableBySchemaDefIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the CFBamTableObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTableObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableObj readTableByUNameIdx(long TenantId,
		long SchemaDefId,
		String Name );

	/**
	 *	Get the CFBamTableObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTableObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableObj readTableByUNameIdx(long TenantId,
		long SchemaDefId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the CFBamTableObj instance for the unique SchemaCdIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argTableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTableObj cached instance for the unique SchemaCdIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableObj readTableBySchemaCdIdx(long TenantId,
		long SchemaDefId,
		String TableClassCode );

	/**
	 *	Get the CFBamTableObj instance for the unique SchemaCdIdx key.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argTableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTableObj refreshed instance for the unique SchemaCdIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableObj readTableBySchemaCdIdx(long TenantId,
		long SchemaDefId,
		String TableClassCode,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate PrimaryIndexIdx key.
	 *
	 *	@param	argPrimaryIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argPrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate PrimaryIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate PrimaryIndexIdx key.
	 *
	 *	@param	argPrimaryIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argPrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate PrimaryIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate LookupIndexIdx key.
	 *
	 *	@param	argLookupIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argLookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate LookupIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate LookupIndexIdx key.
	 *
	 *	@param	argLookupIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argLookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate LookupIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate AltIndexIdx key.
	 *
	 *	@param	argAltIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argAltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate AltIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate AltIndexIdx key.
	 *
	 *	@param	argAltIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argAltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate AltIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate QualTableIdx key.
	 *
	 *	@param	argQualifyingTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argQualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate QualTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId );

	/**
	 *	Get the map of CFBamTableObj instances sorted by their primary keys for the duplicate QualTableIdx key.
	 *
	 *	@param	argQualifyingTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argQualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableObj cached instances sorted by their primary keys for the duplicate QualTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableObj> readTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId,
		boolean forceRead );

	ICFBamTableObj readCachedTableByIdIdx( long TenantId,
		long Id );

	List<ICFBamTableObj> readCachedTableByTenantIdx( long TenantId );

	List<ICFBamTableObj> readCachedTableBySchemaDefIdx( long TenantId,
		long SchemaDefId );

	List<ICFBamTableObj> readCachedTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTableObj> readCachedTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTableObj> readCachedTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	ICFBamTableObj readCachedTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name );

	ICFBamTableObj readCachedTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode );

	List<ICFBamTableObj> readCachedTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId );

	List<ICFBamTableObj> readCachedTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId );

	List<ICFBamTableObj> readCachedTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId );

	List<ICFBamTableObj> readCachedTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId );

	void deepDisposeTableByIdIdx( long TenantId,
		long Id );

	void deepDisposeTableByTenantIdx( long TenantId );

	void deepDisposeTableBySchemaDefIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
	ICFBamTableObj updateTable( ICFBamTableObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTable( ICFBamTableObj Obj );

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
	void deleteTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

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
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
