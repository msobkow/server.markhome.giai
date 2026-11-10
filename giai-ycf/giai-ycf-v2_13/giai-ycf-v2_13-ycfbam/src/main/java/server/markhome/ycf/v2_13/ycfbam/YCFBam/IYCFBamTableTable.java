
// Description: Java 11 DbIO interface for Table.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

/*
 *	YCFBamTableTable database interface for Table
 */
public interface IYCFBamTableTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createTable( YCFSecAuthorization Authorization,
		YCFBamTableBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateTable( YCFSecAuthorization Authorization,
		YCFBamTableBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteTable( YCFSecAuthorization Authorization,
		YCFBamTableBuff Buff );
	/**
	 *	Delete the Table instances identified by the key SchemaDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaDefIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId );

	/**
	 *	Delete the Table instances identified by the key SchemaDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableBySchemaDefIdx( YCFSecAuthorization Authorization,
		YCFBamTableBySchemaDefIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the Table instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamTableByCodeVisIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key SchemaCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the Table instances identified by the key SchemaCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableBySchemaCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamTableBySchemaCodeVisIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the Table instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamTableByDefSchemaIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId,
		String argName );

	/**
	 *	Delete the Table instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamTableByUNameIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key SchemaCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argTableClassCode	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaCdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId,
		String argTableClassCode );

	/**
	 *	Delete the Table instances identified by the key SchemaCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableBySchemaCdIdx( YCFSecAuthorization Authorization,
		YCFBamTableBySchemaCdIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key PrimaryIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrimaryIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argPrimaryIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByPrimaryIndexIdx( YCFSecAuthorization Authorization,
		Long argPrimaryIndexTenantId,
		Long argPrimaryIndexId );

	/**
	 *	Delete the Table instances identified by the key PrimaryIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableByPrimaryIndexIdx( YCFSecAuthorization Authorization,
		YCFBamTableByPrimaryIndexIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key LookupIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLookupIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argLookupIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByLookupIndexIdx( YCFSecAuthorization Authorization,
		Long argLookupIndexTenantId,
		Long argLookupIndexId );

	/**
	 *	Delete the Table instances identified by the key LookupIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableByLookupIndexIdx( YCFSecAuthorization Authorization,
		YCFBamTableByLookupIndexIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key AltIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argAltIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argAltIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByAltIndexIdx( YCFSecAuthorization Authorization,
		Long argAltIndexTenantId,
		Long argAltIndexId );

	/**
	 *	Delete the Table instances identified by the key AltIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableByAltIndexIdx( YCFSecAuthorization Authorization,
		YCFBamTableByAltIndexIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key QualTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argQualifyingTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argQualifyingTableId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByQualTableIdx( YCFSecAuthorization Authorization,
		Long argQualifyingTenantId,
		Long argQualifyingTableId );

	/**
	 *	Delete the Table instances identified by the key QualTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableByQualTableIdx( YCFSecAuthorization Authorization,
		YCFBamTableByQualTableIdxKey argKey );
	/**
	 *	Delete the Table instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the Table instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTableByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey );
	/**
	 *	Delete the Table instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the Table instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey );


	/**
	 *	Read the derived Table buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Table instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Lock the derived Table buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Table instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Read all Table instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived Table buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Table key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived Table buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived Table buffer instances identified by the duplicate key SchemaDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readDerivedBySchemaDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Read an array of the derived Table buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived Table buffer instances identified by the duplicate key SchemaCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readDerivedBySchemaCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived Table buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read the derived Table buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Table key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		String Name );

	/**
	 *	Read the derived Table buffer instance identified by the unique key SchemaCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argTableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableBuff readDerivedBySchemaCdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		String TableClassCode );

	/**
	 *	Read an array of the derived Table buffer instances identified by the duplicate key PrimaryIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrimaryIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argPrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readDerivedByPrimaryIndexIdx( YCFSecAuthorization Authorization,
		Long PrimaryIndexTenantId,
		Long PrimaryIndexId );

	/**
	 *	Read an array of the derived Table buffer instances identified by the duplicate key LookupIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLookupIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argLookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readDerivedByLookupIndexIdx( YCFSecAuthorization Authorization,
		Long LookupIndexTenantId,
		Long LookupIndexId );

	/**
	 *	Read an array of the derived Table buffer instances identified by the duplicate key AltIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argAltIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argAltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readDerivedByAltIndexIdx( YCFSecAuthorization Authorization,
		Long AltIndexTenantId,
		Long AltIndexId );

	/**
	 *	Read an array of the derived Table buffer instances identified by the duplicate key QualTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argQualifyingTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argQualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableBuff[] readDerivedByQualTableIdx( YCFSecAuthorization Authorization,
		Long QualifyingTenantId,
		Long QualifyingTableId );

	/**
	 *	Read the specific Table buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Table instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Lock the specific Table buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Table instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Read all the specific Table buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Table instances in the database accessible for the Authorization.
	 */
	YCFBamTableBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific Table buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Table key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific Table buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific Table buffer instances identified by the duplicate key SchemaDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff[] readBuffBySchemaDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Read an array of the specific Table buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific Table buffer instances identified by the duplicate key SchemaCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff[] readBuffBySchemaCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific Table buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read the specific Table buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Table key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		String Name );

	/**
	 *	Read the specific Table buffer instance identified by the unique key SchemaCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argTableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff readBuffBySchemaCdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		String TableClassCode );

	/**
	 *	Read an array of the specific Table buffer instances identified by the duplicate key PrimaryIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrimaryIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argPrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff[] readBuffByPrimaryIndexIdx( YCFSecAuthorization Authorization,
		Long PrimaryIndexTenantId,
		Long PrimaryIndexId );

	/**
	 *	Read an array of the specific Table buffer instances identified by the duplicate key LookupIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLookupIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argLookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff[] readBuffByLookupIndexIdx( YCFSecAuthorization Authorization,
		Long LookupIndexTenantId,
		Long LookupIndexId );

	/**
	 *	Read an array of the specific Table buffer instances identified by the duplicate key AltIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argAltIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argAltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff[] readBuffByAltIndexIdx( YCFSecAuthorization Authorization,
		Long AltIndexTenantId,
		Long AltIndexId );

	/**
	 *	Read an array of the specific Table buffer instances identified by the duplicate key QualTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argQualifyingTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argQualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableBuff[] readBuffByQualTableIdx( YCFSecAuthorization Authorization,
		Long QualifyingTenantId,
		Long QualifyingTableId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
