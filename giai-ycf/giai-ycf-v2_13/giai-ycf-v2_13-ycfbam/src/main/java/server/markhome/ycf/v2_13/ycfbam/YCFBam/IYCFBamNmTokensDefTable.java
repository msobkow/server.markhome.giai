
// Description: Java 11 DbIO interface for NmTokensDef.

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
 *	YCFBamNmTokensDefTable database interface for NmTokensDef
 */
public interface IYCFBamNmTokensDefTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createNmTokensDef( YCFSecAuthorization Authorization,
		YCFBamNmTokensDefBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateNmTokensDef( YCFSecAuthorization Authorization,
		YCFBamNmTokensDefBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteNmTokensDef( YCFSecAuthorization Authorization,
		YCFBamNmTokensDefBuff Buff );
	/**
	 *	Delete the NmTokensDef instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the NmTokensDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteNmTokensDefByIdIdx( YCFSecAuthorization Authorization,
		YCFBamValuePKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName );

	/**
	 *	Delete the NmTokensDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamValueByUNameIdxKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the NmTokensDef instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamValueByValTentIdxKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId );

	/**
	 *	Delete the NmTokensDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeIdxKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the NmTokensDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the NmTokensDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByPrevIdxKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the NmTokensDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByNextIdxKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argPrevId );

	/**
	 *	Delete the NmTokensDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByContPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContPrevIdxKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argNextId );

	/**
	 *	Delete the NmTokensDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByContNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContNextIdxKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the NmTokensDef instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByCodeVisIdxKey argKey );
	/**
	 *	Delete the NmTokensDef instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the NmTokensDef instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteNmTokensDefByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeCodeVisIdxKey argKey );


	/**
	 *	Read the derived NmTokensDef buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the NmTokensDef instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamNmTokensDefBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Lock the derived NmTokensDef buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the NmTokensDef instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamNmTokensDefBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Read all NmTokensDef instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived NmTokensDef buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamNmTokensDefBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived NmTokensDef buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamNmTokensDefBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the derived NmTokensDef buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived NmTokensDef buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the derived NmTokensDef buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived NmTokensDef buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived NmTokensDef buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the derived NmTokensDef buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readDerivedByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the derived NmTokensDef buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readDerivedByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the derived NmTokensDef buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived NmTokensDef buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamNmTokensDefBuff[] readDerivedByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read the specific NmTokensDef buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the NmTokensDef instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Lock the specific NmTokensDef buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the NmTokensDef instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Read all the specific NmTokensDef buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific NmTokensDef instances in the database accessible for the Authorization.
	 */
	YCFBamNmTokensDefBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific NmTokensDef buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific NmTokensDef buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the specific NmTokensDef buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific NmTokensDef buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the specific NmTokensDef buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific NmTokensDef buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific NmTokensDef buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the specific NmTokensDef buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff[] readBuffByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the specific NmTokensDef buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff[] readBuffByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the specific NmTokensDef buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific NmTokensDef buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamNmTokensDefBuff[] readBuffByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamNmTokensDefBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamNmTokensDefBuff moveBuffDown( YCFSecAuthorization Authorization,
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
