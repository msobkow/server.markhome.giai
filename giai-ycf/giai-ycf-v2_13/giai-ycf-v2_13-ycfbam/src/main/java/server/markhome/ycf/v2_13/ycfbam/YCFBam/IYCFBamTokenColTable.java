
// Description: Java 11 DbIO interface for TokenCol.

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
 *	YCFBamTokenColTable database interface for TokenCol
 */
public interface IYCFBamTokenColTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createTokenCol( YCFSecAuthorization Authorization,
		YCFBamTokenColBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateTokenCol( YCFSecAuthorization Authorization,
		YCFBamTokenColBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteTokenCol( YCFSecAuthorization Authorization,
		YCFBamTokenColBuff Buff );
	/**
	 *	Delete the TokenCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId );

	/**
	 *	Delete the TokenCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByTableIdx( YCFSecAuthorization Authorization,
		YCFBamTokenColByTableIdxKey argKey );
	/**
	 *	Delete the TokenCol instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the TokenCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTokenColByIdIdx( YCFSecAuthorization Authorization,
		YCFBamValuePKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName );

	/**
	 *	Delete the TokenCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamValueByUNameIdxKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the TokenCol instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamValueByValTentIdxKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId );

	/**
	 *	Delete the TokenCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeIdxKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the TokenCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the TokenCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByPrevIdxKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the TokenCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByNextIdxKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByContPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argPrevId );

	/**
	 *	Delete the TokenCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByContPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByContNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argNextId );

	/**
	 *	Delete the TokenCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByContNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContNextIdxKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the TokenCol instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByCodeVisIdxKey argKey );
	/**
	 *	Delete the TokenCol instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the TokenCol instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenColByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeCodeVisIdxKey argKey );


	/**
	 *	Read the derived TokenCol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TokenCol instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTokenColBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Lock the derived TokenCol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TokenCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTokenColBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Read all TokenCol instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived TokenCol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTokenColBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived TokenCol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTokenColBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived TokenCol buffer instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenColBuff[] readDerivedByTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId );

	/**
	 *	Read the specific TokenCol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TokenCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Lock the specific TokenCol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TokenCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Read all the specific TokenCol buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TokenCol instances in the database accessible for the Authorization.
	 */
	YCFBamTokenColBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific TokenCol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific TokenCol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific TokenCol buffer instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenColBuff[] readBuffByTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamTokenColBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamTokenColBuff moveBuffDown( YCFSecAuthorization Authorization,
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
