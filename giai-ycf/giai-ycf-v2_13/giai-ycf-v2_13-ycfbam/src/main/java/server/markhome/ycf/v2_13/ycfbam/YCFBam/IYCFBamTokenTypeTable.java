
// Description: Java 11 DbIO interface for TokenType.

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
 *	YCFBamTokenTypeTable database interface for TokenType
 */
public interface IYCFBamTokenTypeTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createTokenType( YCFSecAuthorization Authorization,
		YCFBamTokenTypeBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateTokenType( YCFSecAuthorization Authorization,
		YCFBamTokenTypeBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteTokenType( YCFSecAuthorization Authorization,
		YCFBamTokenTypeBuff Buff );
	/**
	 *	Delete the TokenType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeBySchemaIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId );

	/**
	 *	Delete the TokenType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeBySchemaIdx( YCFSecAuthorization Authorization,
		YCFBamTokenTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the TokenType instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the TokenType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTokenTypeByIdIdx( YCFSecAuthorization Authorization,
		YCFBamValuePKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName );

	/**
	 *	Delete the TokenType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamValueByUNameIdxKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the TokenType instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamValueByValTentIdxKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId );

	/**
	 *	Delete the TokenType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeIdxKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the TokenType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the TokenType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByPrevIdxKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the TokenType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByNextIdxKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByContPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argPrevId );

	/**
	 *	Delete the TokenType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByContPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByContNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argNextId );

	/**
	 *	Delete the TokenType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByContNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContNextIdxKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the TokenType instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByCodeVisIdxKey argKey );
	/**
	 *	Delete the TokenType instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the TokenType instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTokenTypeByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeCodeVisIdxKey argKey );


	/**
	 *	Read the derived TokenType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TokenType instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTokenTypeBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Lock the derived TokenType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TokenType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTokenTypeBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Read all TokenType instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived TokenType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTokenTypeBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived TokenType buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTokenTypeBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived TokenType buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTokenTypeBuff[] readDerivedBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Read the specific TokenType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TokenType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Lock the specific TokenType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TokenType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Read all the specific TokenType buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TokenType instances in the database accessible for the Authorization.
	 */
	YCFBamTokenTypeBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific TokenType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific TokenType buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific TokenType buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTokenTypeBuff[] readBuffBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamTokenTypeBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamTokenTypeBuff moveBuffDown( YCFSecAuthorization Authorization,
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
