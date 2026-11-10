
// Description: Java 11 DbIO interface for TableTweak.

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
 *	YCFBamTableTweakTable database interface for TableTweak
 */
public interface IYCFBamTableTweakTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createTableTweak( YCFSecAuthorization Authorization,
		YCFBamTableTweakBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateTableTweak( YCFSecAuthorization Authorization,
		YCFBamTableTweakBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteTableTweak( YCFSecAuthorization Authorization,
		YCFBamTableTweakBuff Buff );
	/**
	 *	Delete the TableTweak instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId );

	/**
	 *	Delete the TableTweak instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByTableIdx( YCFSecAuthorization Authorization,
		YCFBamTableTweakByTableIdxKey argKey );
	/**
	 *	Delete the TableTweak instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the TableTweak instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTableTweakByIdIdx( YCFSecAuthorization Authorization,
		YCFBamTweakPKey argKey );
	/**
	 *	Delete the TableTweak instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName );

	/**
	 *	Delete the TableTweak instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUNameIdxKey argKey );
	/**
	 *	Delete the TableTweak instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByUDefIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argDefSchemaTenantId,
		Long argDefSchemaId,
		String argName );

	/**
	 *	Delete the TableTweak instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByUDefIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUDefIdxKey argKey );
	/**
	 *	Delete the TableTweak instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the TableTweak instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByValTentIdxKey argKey );
	/**
	 *	Delete the TableTweak instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId );

	/**
	 *	Delete the TableTweak instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByScopeIdxKey argKey );
	/**
	 *	Delete the TableTweak instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the TableTweak instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByDefSchemaIdxKey argKey );


	/**
	 *	Read the derived TableTweak buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableTweak instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableTweakBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey );

	/**
	 *	Lock the derived TableTweak buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableTweak instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableTweakBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey );

	/**
	 *	Read all TableTweak instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamTableTweakBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived TableTweak buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableTweakBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived TableTweak buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableTweakBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read the derived TableTweak buffer instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTableTweakBuff readDerivedByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Read an array of the derived TableTweak buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableTweakBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived TableTweak buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableTweakBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the derived TableTweak buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableTweakBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived TableTweak buffer instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTableTweakBuff[] readDerivedByTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId );

	/**
	 *	Read the specific TableTweak buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableTweak instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableTweakBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey );

	/**
	 *	Lock the specific TableTweak buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableTweak instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableTweakBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey );

	/**
	 *	Read all the specific TableTweak buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TableTweak instances in the database accessible for the Authorization.
	 */
	YCFBamTableTweakBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific TableTweak buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableTweakBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific TableTweak buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableTweakBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read the specific TableTweak buffer instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableTweakBuff readBuffByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Read an array of the specific TableTweak buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableTweakBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific TableTweak buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableTweakBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the specific TableTweak buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableTweakBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific TableTweak buffer instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTableTweakBuff[] readBuffByTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
