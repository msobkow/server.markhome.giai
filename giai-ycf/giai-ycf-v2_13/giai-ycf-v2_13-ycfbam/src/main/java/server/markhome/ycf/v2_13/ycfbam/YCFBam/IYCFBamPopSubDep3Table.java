
// Description: Java 11 DbIO interface for PopSubDep3.

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
 *	YCFBamPopSubDep3Table database interface for PopSubDep3
 */
public interface IYCFBamPopSubDep3Table
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createPopSubDep3( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3Buff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updatePopSubDep3( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3Buff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deletePopSubDep3( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3Buff Buff );
	/**
	 *	Delete the PopSubDep3 instances identified by the key PopSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByPopSubDep2Idx( YCFSecAuthorization Authorization,
		long argPopSubDep2TenantId,
		long argPopSubDep2Id );

	/**
	 *	Delete the PopSubDep3 instances identified by the key PopSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deletePopSubDep3ByPopSubDep2Idx( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3ByPopSubDep2IdxKey argKey );
	/**
	 *	Delete the PopSubDep3 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByUNameIdx( YCFSecAuthorization Authorization,
		long argPopSubDep2TenantId,
		long argPopSubDep2Id,
		String argName );

	/**
	 *	Delete the PopSubDep3 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deletePopSubDep3ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3ByUNameIdxKey argKey );
	/**
	 *	Delete the PopSubDep3 instances identified by the key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByRelationIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId );

	/**
	 *	Delete the PopSubDep3 instances identified by the key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deletePopSubDep3ByRelationIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByRelationIdxKey argKey );
	/**
	 *	Delete the PopSubDep3 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the PopSubDep3 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deletePopSubDep3ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByDefSchemaIdxKey argKey );
	/**
	 *	Delete the PopSubDep3 instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the PopSubDep3 instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deletePopSubDep3ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey );
	/**
	 *	Delete the PopSubDep3 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the PopSubDep3 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deletePopSubDep3ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey );


	/**
	 *	Read the derived PopSubDep3 buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the PopSubDep3 instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamPopSubDep3Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Lock the derived PopSubDep3 buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the PopSubDep3 instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamPopSubDep3Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Read all PopSubDep3 instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamPopSubDep3Buff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived PopSubDep3 buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamPopSubDep3Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived PopSubDep3 buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamPopSubDep3Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived PopSubDep3 buffer instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamPopSubDep3Buff[] readDerivedByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId );

	/**
	 *	Read an array of the derived PopSubDep3 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamPopSubDep3Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived PopSubDep3 buffer instances identified by the duplicate key PopSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamPopSubDep3Buff[] readDerivedByPopSubDep2Idx( YCFSecAuthorization Authorization,
		long PopSubDep2TenantId,
		long PopSubDep2Id );

	/**
	 *	Read the derived PopSubDep3 buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamPopSubDep3Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name );

	/**
	 *	Read the specific PopSubDep3 buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the PopSubDep3 instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamPopSubDep3Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Lock the specific PopSubDep3 buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the PopSubDep3 instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamPopSubDep3Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Read all the specific PopSubDep3 buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific PopSubDep3 instances in the database accessible for the Authorization.
	 */
	YCFBamPopSubDep3Buff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific PopSubDep3 buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamPopSubDep3Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific PopSubDep3 buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamPopSubDep3Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific PopSubDep3 buffer instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamPopSubDep3Buff[] readBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId );

	/**
	 *	Read an array of the specific PopSubDep3 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamPopSubDep3Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific PopSubDep3 buffer instances identified by the duplicate key PopSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamPopSubDep3Buff[] readBuffByPopSubDep2Idx( YCFSecAuthorization Authorization,
		long PopSubDep2TenantId,
		long PopSubDep2Id );

	/**
	 *	Read the specific PopSubDep3 buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamPopSubDep3Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
