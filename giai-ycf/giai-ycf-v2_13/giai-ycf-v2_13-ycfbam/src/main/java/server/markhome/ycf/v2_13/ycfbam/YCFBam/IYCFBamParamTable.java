
// Description: Java 11 DbIO interface for Param.

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
 *	YCFBamParamTable database interface for Param
 */
public interface IYCFBamParamTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createParam( YCFSecAuthorization Authorization,
		YCFBamParamBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateParam( YCFSecAuthorization Authorization,
		YCFBamParamBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteParam( YCFSecAuthorization Authorization,
		YCFBamParamBuff Buff );
	/**
	 *	Delete the Param instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the Param instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteParamByIdIdx( YCFSecAuthorization Authorization,
		YCFBamParamPKey argKey );
	/**
	 *	Delete the Param instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argServerMethodId,
		String argName );

	/**
	 *	Delete the Param instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamParamByUNameIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the Param instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamParamByValTentIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key ServerMethodIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByServerMethodIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argServerMethodId );

	/**
	 *	Delete the Param instances identified by the key ServerMethodIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByServerMethodIdx( YCFSecAuthorization Authorization,
		YCFBamParamByServerMethodIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the Param instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamParamByDefSchemaIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key ServerTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTypeTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argTypeId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByServerTypeIdx( YCFSecAuthorization Authorization,
		Long argTypeTenantId,
		Long argTypeId );

	/**
	 *	Delete the Param instances identified by the key ServerTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByServerTypeIdx( YCFSecAuthorization Authorization,
		YCFBamParamByServerTypeIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the Param instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamParamByPrevIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the Param instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByNextIdx( YCFSecAuthorization Authorization,
		YCFBamParamByNextIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByContPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argServerMethodId,
		Long argPrevId );

	/**
	 *	Delete the Param instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByContPrevIdx( YCFSecAuthorization Authorization,
		YCFBamParamByContPrevIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByContNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argServerMethodId,
		Long argNextId );

	/**
	 *	Delete the Param instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByContNextIdx( YCFSecAuthorization Authorization,
		YCFBamParamByContNextIdxKey argKey );


	/**
	 *	Read the derived Param buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Param instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamParamBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamParamPKey PKey );

	/**
	 *	Lock the derived Param buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Param instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamParamBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamParamPKey PKey );

	/**
	 *	Read all Param instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamParamBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived Param buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Param key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamParamBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived Param buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Param key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamParamBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		String Name );

	/**
	 *	Read an array of the derived Param buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamParamBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived Param buffer instances identified by the duplicate key ServerMethodIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamParamBuff[] readDerivedByServerMethodIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId );

	/**
	 *	Read an array of the derived Param buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamParamBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived Param buffer instances identified by the duplicate key ServerTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTypeTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argTypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamParamBuff[] readDerivedByServerTypeIdx( YCFSecAuthorization Authorization,
		Long TypeTenantId,
		Long TypeId );

	/**
	 *	Read an array of the derived Param buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamParamBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived Param buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamParamBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the derived Param buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamParamBuff[] readDerivedByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		Long PrevId );

	/**
	 *	Read an array of the derived Param buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamParamBuff[] readDerivedByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		Long NextId );

	/**
	 *	Read the specific Param buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Param instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamParamPKey PKey );

	/**
	 *	Lock the specific Param buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Param instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamParamPKey PKey );

	/**
	 *	Read all the specific Param buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Param instances in the database accessible for the Authorization.
	 */
	YCFBamParamBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific Param buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Param key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific Param buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Param key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		String Name );

	/**
	 *	Read an array of the specific Param buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific Param buffer instances identified by the duplicate key ServerMethodIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff[] readBuffByServerMethodIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId );

	/**
	 *	Read an array of the specific Param buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific Param buffer instances identified by the duplicate key ServerTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTypeTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argTypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff[] readBuffByServerTypeIdx( YCFSecAuthorization Authorization,
		Long TypeTenantId,
		Long TypeId );

	/**
	 *	Read an array of the specific Param buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific Param buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the specific Param buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff[] readBuffByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		Long PrevId );

	/**
	 *	Read an array of the specific Param buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamParamBuff[] readBuffByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		Long NextId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamParamBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamParamBuff moveBuffDown( YCFSecAuthorization Authorization,
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
