
// Description: Java 11 DbIO interface for TZTimeType.

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
 *	YCFBamTZTimeTypeTable database interface for TZTimeType
 */
public interface IYCFBamTZTimeTypeTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createTZTimeType( YCFSecAuthorization Authorization,
		YCFBamTZTimeTypeBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateTZTimeType( YCFSecAuthorization Authorization,
		YCFBamTZTimeTypeBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteTZTimeType( YCFSecAuthorization Authorization,
		YCFBamTZTimeTypeBuff Buff );
	/**
	 *	Delete the TZTimeType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeBySchemaIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId );

	/**
	 *	Delete the TZTimeType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeBySchemaIdx( YCFSecAuthorization Authorization,
		YCFBamTZTimeTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the TZTimeType instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the TZTimeType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTZTimeTypeByIdIdx( YCFSecAuthorization Authorization,
		YCFBamValuePKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName );

	/**
	 *	Delete the TZTimeType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamValueByUNameIdxKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the TZTimeType instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamValueByValTentIdxKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId );

	/**
	 *	Delete the TZTimeType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeIdxKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the TZTimeType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the TZTimeType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByPrevIdxKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the TZTimeType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByNextIdxKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByContPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argPrevId );

	/**
	 *	Delete the TZTimeType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByContPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByContNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argNextId );

	/**
	 *	Delete the TZTimeType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByContNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContNextIdxKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the TZTimeType instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByCodeVisIdxKey argKey );
	/**
	 *	Delete the TZTimeType instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeType key attribute of the instance generating the id.
	 */
	void deleteTZTimeTypeByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the TZTimeType instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTZTimeTypeByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeCodeVisIdxKey argKey );


	/**
	 *	Read the derived TZTimeType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimeType instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTZTimeTypeBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Lock the derived TZTimeType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimeType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTZTimeTypeBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Read all TZTimeType instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived TZTimeType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTZTimeTypeBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived TZTimeType buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamTZTimeTypeBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived TZTimeType buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamTZTimeTypeBuff[] readDerivedBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Read the specific TZTimeType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimeType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Lock the specific TZTimeType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimeType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey );

	/**
	 *	Read all the specific TZTimeType buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TZTimeType instances in the database accessible for the Authorization.
	 */
	YCFBamTZTimeTypeBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific TZTimeType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific TZTimeType buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific TZTimeType buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The TZTimeType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamTZTimeTypeBuff[] readBuffBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamTZTimeTypeBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamTZTimeTypeBuff moveBuffDown( YCFSecAuthorization Authorization,
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
