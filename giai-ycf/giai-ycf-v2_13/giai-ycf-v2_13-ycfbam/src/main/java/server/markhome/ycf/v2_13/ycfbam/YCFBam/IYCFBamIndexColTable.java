
// Description: Java 11 DbIO interface for IndexCol.

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
 *	YCFBamIndexColTable database interface for IndexCol
 */
public interface IYCFBamIndexColTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createIndexCol( YCFSecAuthorization Authorization,
		YCFBamIndexColBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateIndexCol( YCFSecAuthorization Authorization,
		YCFBamIndexColBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteIndexCol( YCFSecAuthorization Authorization,
		YCFBamIndexColBuff Buff );
	/**
	 *	Delete the IndexCol instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the IndexCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteIndexColByIdIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey argKey );
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
	void deleteIndexColByUNameIdx( YCFSecAuthorization Authorization,
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
	void deleteIndexColByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByUNameIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxColTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the IndexCol instances identified by the key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIdxColTenantIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByIdxColTenantIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIndexIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId );

	/**
	 *	Delete the IndexCol instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIndexIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByIndexIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the IndexCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByDefSchemaIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByColIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argColumnId );

	/**
	 *	Delete the IndexCol instances identified by the key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByColIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByColIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the IndexCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByPrevIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the IndexCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByNextIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByNextIdxKey argKey );
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
	void deleteIndexColByIdxPrevIdx( YCFSecAuthorization Authorization,
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
	void deleteIndexColByIdxPrevIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByIdxPrevIdxKey argKey );
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
	void deleteIndexColByIdxNextIdx( YCFSecAuthorization Authorization,
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
	void deleteIndexColByIdxNextIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByIdxNextIdxKey argKey );


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
	YCFBamIndexColBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey PKey );

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
	YCFBamIndexColBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey PKey );

	/**
	 *	Read all IndexCol instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamIndexColBuff[] readAllDerived( YCFSecAuthorization Authorization );

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
	YCFBamIndexColBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
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
	YCFBamIndexColBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
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
	YCFBamIndexColBuff[] readDerivedByIdxColTenantIdx( YCFSecAuthorization Authorization,
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
	YCFBamIndexColBuff[] readDerivedByIndexIdx( YCFSecAuthorization Authorization,
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
	YCFBamIndexColBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
	YCFBamIndexColBuff[] readDerivedByColIdx( YCFSecAuthorization Authorization,
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
	YCFBamIndexColBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
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
	YCFBamIndexColBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
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
	YCFBamIndexColBuff[] readDerivedByIdxPrevIdx( YCFSecAuthorization Authorization,
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
	YCFBamIndexColBuff[] readDerivedByIdxNextIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey PKey );

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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey PKey );

	/**
	 *	Read all the specific IndexCol buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific IndexCol instances in the database accessible for the Authorization.
	 */
	YCFBamIndexColBuff[] readAllBuff( YCFSecAuthorization Authorization );

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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff[] readBuffByIdxColTenantIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff[] readBuffByIndexIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff[] readBuffByColIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff[] readBuffByIdxPrevIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamIndexColBuff[] readBuffByIdxNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long NextId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamIndexColBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamIndexColBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
