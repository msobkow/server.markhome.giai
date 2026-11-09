
// Description: Java 11 DbIO interface for IndexCol.

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

package org.msscf.msscf.v2_13.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBamObj.*;

/*
 *	CFBamIndexColTable database interface for IndexCol
 */
public interface ICFBamIndexColTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createIndexCol( CFSecAuthorization Authorization,
		CFBamIndexColBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateIndexCol( CFSecAuthorization Authorization,
		CFBamIndexColBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteIndexCol( CFSecAuthorization Authorization,
		CFBamIndexColBuff Buff );
	/**
	 *	Delete the IndexCol instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the IndexCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteIndexColByIdIdx( CFSecAuthorization Authorization,
		CFBamIndexColPKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByUNameIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId,
		String argName );

	/**
	 *	Delete the IndexCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByUNameIdx( CFSecAuthorization Authorization,
		CFBamIndexColByUNameIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxColTenantIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the IndexCol instances identified by the key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIdxColTenantIdx( CFSecAuthorization Authorization,
		CFBamIndexColByIdxColTenantIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIndexIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId );

	/**
	 *	Delete the IndexCol instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIndexIdx( CFSecAuthorization Authorization,
		CFBamIndexColByIndexIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByDefSchemaIdx( CFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the IndexCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByDefSchemaIdx( CFSecAuthorization Authorization,
		CFBamIndexColByDefSchemaIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByColIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argColumnId );

	/**
	 *	Delete the IndexCol instances identified by the key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByColIdx( CFSecAuthorization Authorization,
		CFBamIndexColByColIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByPrevIdx( CFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the IndexCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByPrevIdx( CFSecAuthorization Authorization,
		CFBamIndexColByPrevIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByNextIdx( CFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the IndexCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByNextIdx( CFSecAuthorization Authorization,
		CFBamIndexColByNextIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxPrevIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId,
		Long argPrevId );

	/**
	 *	Delete the IndexCol instances identified by the key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIdxPrevIdx( CFSecAuthorization Authorization,
		CFBamIndexColByIdxPrevIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxNextIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId,
		Long argNextId );

	/**
	 *	Delete the IndexCol instances identified by the key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIdxNextIdx( CFSecAuthorization Authorization,
		CFBamIndexColByIdxNextIdxKey argKey );


	/**
	 *	Read the derived IndexCol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexColBuff readDerived( CFSecAuthorization Authorization,
		CFBamIndexColPKey PKey );

	/**
	 *	Lock the derived IndexCol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexColBuff lockDerived( CFSecAuthorization Authorization,
		CFBamIndexColPKey PKey );

	/**
	 *	Read all IndexCol instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived IndexCol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexColBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived IndexCol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexColBuff readDerivedByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		String Name );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByIdxColTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByIndexIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByColIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ColumnId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByPrevIdx( CFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByNextIdx( CFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByIdxPrevIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long PrevId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByIdxNextIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long NextId );

	/**
	 *	Read the specific IndexCol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff readBuff( CFSecAuthorization Authorization,
		CFBamIndexColPKey PKey );

	/**
	 *	Lock the specific IndexCol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff lockBuff( CFSecAuthorization Authorization,
		CFBamIndexColPKey PKey );

	/**
	 *	Read all the specific IndexCol buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific IndexCol instances in the database accessible for the Authorization.
	 */
	CFBamIndexColBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific IndexCol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific IndexCol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff readBuffByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		String Name );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByIdxColTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByIndexIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByColIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ColumnId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByPrevIdx( CFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByNextIdx( CFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByIdxPrevIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long PrevId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByIdxNextIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long NextId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	CFBamIndexColBuff moveBuffUp( CFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	CFBamIndexColBuff moveBuffDown( CFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
