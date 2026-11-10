
// Description: Java 11 DbIO interface for RelationCol.

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
 *	YCFBamRelationColTable database interface for RelationCol
 */
public interface IYCFBamRelationColTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createRelationCol( YCFSecAuthorization Authorization,
		YCFBamRelationColBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateRelationCol( YCFSecAuthorization Authorization,
		YCFBamRelationColBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteRelationCol( YCFSecAuthorization Authorization,
		YCFBamRelationColBuff Buff );
	/**
	 *	Delete the RelationCol instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the RelationCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteRelationColByIdIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId,
		String argName );

	/**
	 *	Delete the RelationCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByUNameIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key RelColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelColTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the RelationCol instances identified by the key RelColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByRelColTenantIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByRelColTenantIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelationIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId );

	/**
	 *	Delete the RelationCol instances identified by the key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByRelationIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByRelationIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the RelationCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByDefSchemaIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key FromColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argFromColId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByFromColIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argFromColId );

	/**
	 *	Delete the RelationCol instances identified by the key FromColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByFromColIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByFromColIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key ToColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argToColId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByToColIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argToColId );

	/**
	 *	Delete the RelationCol instances identified by the key ToColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByToColIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByToColIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the RelationCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByPrevIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the RelationCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByNextIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByNextIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key RelPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId,
		Long argPrevId );

	/**
	 *	Delete the RelationCol instances identified by the key RelPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByRelPrevIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByRelPrevIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key RelNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId,
		Long argNextId );

	/**
	 *	Delete the RelationCol instances identified by the key RelNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationColByRelNextIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByRelNextIdxKey argKey );


	/**
	 *	Read the derived RelationCol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RelationCol instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamRelationColBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey PKey );

	/**
	 *	Lock the derived RelationCol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RelationCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamRelationColBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey PKey );

	/**
	 *	Read all RelationCol instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived RelationCol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamRelationColBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived RelationCol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamRelationColBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		String Name );

	/**
	 *	Read an array of the derived RelationCol buffer instances identified by the duplicate key RelColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readDerivedByRelColTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived RelationCol buffer instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readDerivedByRelationIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId );

	/**
	 *	Read an array of the derived RelationCol buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived RelationCol buffer instances identified by the duplicate key FromColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argFromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readDerivedByFromColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long FromColId );

	/**
	 *	Read an array of the derived RelationCol buffer instances identified by the duplicate key ToColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readDerivedByToColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToColId );

	/**
	 *	Read an array of the derived RelationCol buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived RelationCol buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the derived RelationCol buffer instances identified by the duplicate key RelPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readDerivedByRelPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long PrevId );

	/**
	 *	Read an array of the derived RelationCol buffer instances identified by the duplicate key RelNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationColBuff[] readDerivedByRelNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long NextId );

	/**
	 *	Read the specific RelationCol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RelationCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey PKey );

	/**
	 *	Lock the specific RelationCol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RelationCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey PKey );

	/**
	 *	Read all the specific RelationCol buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific RelationCol instances in the database accessible for the Authorization.
	 */
	YCFBamRelationColBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific RelationCol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific RelationCol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		String Name );

	/**
	 *	Read an array of the specific RelationCol buffer instances identified by the duplicate key RelColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff[] readBuffByRelColTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific RelationCol buffer instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff[] readBuffByRelationIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId );

	/**
	 *	Read an array of the specific RelationCol buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific RelationCol buffer instances identified by the duplicate key FromColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argFromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff[] readBuffByFromColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long FromColId );

	/**
	 *	Read an array of the specific RelationCol buffer instances identified by the duplicate key ToColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff[] readBuffByToColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToColId );

	/**
	 *	Read an array of the specific RelationCol buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific RelationCol buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the specific RelationCol buffer instances identified by the duplicate key RelPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff[] readBuffByRelPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long PrevId );

	/**
	 *	Read an array of the specific RelationCol buffer instances identified by the duplicate key RelNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationColBuff[] readBuffByRelNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long NextId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamRelationColBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamRelationColBuff moveBuffDown( YCFSecAuthorization Authorization,
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
