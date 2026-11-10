
// Description: Java 11 DbIO interface for DelSubDep1.

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
 *	YCFBamDelSubDep1Table database interface for DelSubDep1
 */
public interface IYCFBamDelSubDep1Table
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createDelSubDep1( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1Buff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateDelSubDep1( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1Buff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteDelSubDep1( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1Buff Buff );
	/**
	 *	Delete the DelSubDep1 instances identified by the key DelTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByDelTopDepIdx( YCFSecAuthorization Authorization,
		long argDelTopDepTenantId,
		long argDelTopDepId );

	/**
	 *	Delete the DelSubDep1 instances identified by the key DelTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep1ByDelTopDepIdx( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1ByDelTopDepIdxKey argKey );
	/**
	 *	Delete the DelSubDep1 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByUNameIdx( YCFSecAuthorization Authorization,
		long argDelTopDepTenantId,
		long argDelTopDepId,
		String argName );

	/**
	 *	Delete the DelSubDep1 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep1ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1ByUNameIdxKey argKey );
	/**
	 *	Delete the DelSubDep1 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the DelSubDep1 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep1ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDefSchemaIdxKey argKey );
	/**
	 *	Delete the DelSubDep1 instances identified by the key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByDelDepIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId );

	/**
	 *	Delete the DelSubDep1 instances identified by the key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep1ByDelDepIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDelDepIdxKey argKey );
	/**
	 *	Delete the DelSubDep1 instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the DelSubDep1 instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteDelSubDep1ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey );
	/**
	 *	Delete the DelSubDep1 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the DelSubDep1 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep1ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey );


	/**
	 *	Read the derived DelSubDep1 buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep1 instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamDelSubDep1Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Lock the derived DelSubDep1 buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep1 instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamDelSubDep1Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Read all DelSubDep1 instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamDelSubDep1Buff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived DelSubDep1 buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamDelSubDep1Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived DelSubDep1 buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamDelSubDep1Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived DelSubDep1 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamDelSubDep1Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived DelSubDep1 buffer instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamDelSubDep1Buff[] readDerivedByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId );

	/**
	 *	Read an array of the derived DelSubDep1 buffer instances identified by the duplicate key DelTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamDelSubDep1Buff[] readDerivedByDelTopDepIdx( YCFSecAuthorization Authorization,
		long DelTopDepTenantId,
		long DelTopDepId );

	/**
	 *	Read the derived DelSubDep1 buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamDelSubDep1Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long DelTopDepTenantId,
		long DelTopDepId,
		String Name );

	/**
	 *	Read the specific DelSubDep1 buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep1 instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamDelSubDep1Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Lock the specific DelSubDep1 buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep1 instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamDelSubDep1Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Read all the specific DelSubDep1 buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific DelSubDep1 instances in the database accessible for the Authorization.
	 */
	YCFBamDelSubDep1Buff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific DelSubDep1 buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamDelSubDep1Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific DelSubDep1 buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamDelSubDep1Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific DelSubDep1 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamDelSubDep1Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific DelSubDep1 buffer instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamDelSubDep1Buff[] readBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId );

	/**
	 *	Read an array of the specific DelSubDep1 buffer instances identified by the duplicate key DelTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamDelSubDep1Buff[] readBuffByDelTopDepIdx( YCFSecAuthorization Authorization,
		long DelTopDepTenantId,
		long DelTopDepId );

	/**
	 *	Read the specific DelSubDep1 buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamDelSubDep1Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long DelTopDepTenantId,
		long DelTopDepId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
