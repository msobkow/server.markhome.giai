
// Description: Java 11 DbIO interface for IndexTweak.

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
 *	CFBamIndexTweakTable database interface for IndexTweak
 */
public interface ICFBamIndexTweakTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createIndexTweak( CFSecAuthorization Authorization,
		CFBamIndexTweakBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateIndexTweak( CFSecAuthorization Authorization,
		CFBamIndexTweakBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteIndexTweak( CFSecAuthorization Authorization,
		CFBamIndexTweakBuff Buff );
	/**
	 *	Delete the IndexTweak instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByIndexIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId );

	/**
	 *	Delete the IndexTweak instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexTweakByIndexIdx( CFSecAuthorization Authorization,
		CFBamIndexTweakByIndexIdxKey argKey );
	/**
	 *	Delete the IndexTweak instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the IndexTweak instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteIndexTweakByIdIdx( CFSecAuthorization Authorization,
		CFBamTweakPKey argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByUNameIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName );

	/**
	 *	Delete the IndexTweak instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexTweakByUNameIdx( CFSecAuthorization Authorization,
		CFBamTweakByUNameIdxKey argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByUDefIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argDefSchemaTenantId,
		Long argDefSchemaId,
		String argName );

	/**
	 *	Delete the IndexTweak instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexTweakByUDefIdx( CFSecAuthorization Authorization,
		CFBamTweakByUDefIdxKey argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByValTentIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the IndexTweak instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexTweakByValTentIdx( CFSecAuthorization Authorization,
		CFBamTweakByValTentIdxKey argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByScopeIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId );

	/**
	 *	Delete the IndexTweak instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexTweakByScopeIdx( CFSecAuthorization Authorization,
		CFBamTweakByScopeIdxKey argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByDefSchemaIdx( CFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the IndexTweak instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexTweakByDefSchemaIdx( CFSecAuthorization Authorization,
		CFBamTweakByDefSchemaIdxKey argKey );


	/**
	 *	Read the derived IndexTweak buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexTweak instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexTweakBuff readDerived( CFSecAuthorization Authorization,
		CFBamTweakPKey PKey );

	/**
	 *	Lock the derived IndexTweak buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexTweak instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexTweakBuff lockDerived( CFSecAuthorization Authorization,
		CFBamTweakPKey PKey );

	/**
	 *	Read all IndexTweak instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFBamIndexTweakBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived IndexTweak buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexTweakBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived IndexTweak buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexTweakBuff readDerivedByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read the derived IndexTweak buffer instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexTweakBuff readDerivedByUDefIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Read an array of the derived IndexTweak buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexTweakBuff[] readDerivedByValTentIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived IndexTweak buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexTweakBuff[] readDerivedByScopeIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the derived IndexTweak buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexTweakBuff[] readDerivedByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived IndexTweak buffer instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexTweakBuff[] readDerivedByIndexIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId );

	/**
	 *	Read the specific IndexTweak buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexTweak instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexTweakBuff readBuff( CFSecAuthorization Authorization,
		CFBamTweakPKey PKey );

	/**
	 *	Lock the specific IndexTweak buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexTweak instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexTweakBuff lockBuff( CFSecAuthorization Authorization,
		CFBamTweakPKey PKey );

	/**
	 *	Read all the specific IndexTweak buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific IndexTweak instances in the database accessible for the Authorization.
	 */
	CFBamIndexTweakBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific IndexTweak buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexTweakBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific IndexTweak buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexTweakBuff readBuffByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read the specific IndexTweak buffer instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexTweakBuff readBuffByUDefIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Read an array of the specific IndexTweak buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexTweakBuff[] readBuffByValTentIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific IndexTweak buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexTweakBuff[] readBuffByScopeIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the specific IndexTweak buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexTweakBuff[] readBuffByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific IndexTweak buffer instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexTweakBuff[] readBuffByIndexIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
