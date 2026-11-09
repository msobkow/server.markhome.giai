
// Description: Java 11 DbIO interface for DbKeyHash512Gen.

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
 *	CFBamDbKeyHash512GenTable database interface for DbKeyHash512Gen
 */
public interface ICFBamDbKeyHash512GenTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createDbKeyHash512Gen( CFSecAuthorization Authorization,
		CFBamDbKeyHash512GenBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateDbKeyHash512Gen( CFSecAuthorization Authorization,
		CFBamDbKeyHash512GenBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteDbKeyHash512Gen( CFSecAuthorization Authorization,
		CFBamDbKeyHash512GenBuff Buff );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key DispIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByDispIdx( CFSecAuthorization Authorization,
		Long argDispenserTenantId,
		Long argDispenserId );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key DispIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByDispIdx( CFSecAuthorization Authorization,
		CFBamDbKeyHash512GenByDispIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenBySchemaIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenBySchemaIdx( CFSecAuthorization Authorization,
		CFBamDbKeyHash512TypeBySchemaIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the DbKeyHash512Gen instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteDbKeyHash512GenByIdIdx( CFSecAuthorization Authorization,
		CFBamValuePKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByUNameIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByUNameIdx( CFSecAuthorization Authorization,
		CFBamValueByUNameIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByValTentIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByValTentIdx( CFSecAuthorization Authorization,
		CFBamValueByValTentIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByScopeIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByScopeIdx( CFSecAuthorization Authorization,
		CFBamValueByScopeIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByDefSchemaIdx( CFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByDefSchemaIdx( CFSecAuthorization Authorization,
		CFBamValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByPrevIdx( CFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByPrevIdx( CFSecAuthorization Authorization,
		CFBamValueByPrevIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByNextIdx( CFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByNextIdx( CFSecAuthorization Authorization,
		CFBamValueByNextIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByContPrevIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argPrevId );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByContPrevIdx( CFSecAuthorization Authorization,
		CFBamValueByContPrevIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByContNextIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argNextId );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByContNextIdx( CFSecAuthorization Authorization,
		CFBamValueByContNextIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByCodeVisIdx( CFSecAuthorization Authorization,
		ICFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByCodeVisIdx( CFSecAuthorization Authorization,
		CFBamValueByCodeVisIdxKey argKey );
	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512GenByScopeCodeVisIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		ICFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the DbKeyHash512Gen instances identified by the key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDbKeyHash512GenByScopeCodeVisIdx( CFSecAuthorization Authorization,
		CFBamValueByScopeCodeVisIdxKey argKey );


	/**
	 *	Read the derived DbKeyHash512Gen buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DbKeyHash512Gen instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamDbKeyHash512GenBuff readDerived( CFSecAuthorization Authorization,
		CFBamValuePKey PKey );

	/**
	 *	Lock the derived DbKeyHash512Gen buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DbKeyHash512Gen instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamDbKeyHash512GenBuff lockDerived( CFSecAuthorization Authorization,
		CFBamValuePKey PKey );

	/**
	 *	Read all DbKeyHash512Gen instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived DbKeyHash512Gen buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamDbKeyHash512GenBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived DbKeyHash512Gen buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamDbKeyHash512GenBuff readDerivedByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByValTentIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByScopeIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByPrevIdx( CFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByNextIdx( CFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByContPrevIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByContNextIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByCodeVisIdx( CFSecAuthorization Authorization,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByScopeCodeVisIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedBySchemaIdx( CFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Read an array of the derived DbKeyHash512Gen buffer instances identified by the duplicate key DispIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamDbKeyHash512GenBuff[] readDerivedByDispIdx( CFSecAuthorization Authorization,
		Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Read the specific DbKeyHash512Gen buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DbKeyHash512Gen instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff readBuff( CFSecAuthorization Authorization,
		CFBamValuePKey PKey );

	/**
	 *	Lock the specific DbKeyHash512Gen buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DbKeyHash512Gen instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff lockBuff( CFSecAuthorization Authorization,
		CFBamValuePKey PKey );

	/**
	 *	Read all the specific DbKeyHash512Gen buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific DbKeyHash512Gen instances in the database accessible for the Authorization.
	 */
	CFBamDbKeyHash512GenBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific DbKeyHash512Gen buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific DbKeyHash512Gen buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff readBuffByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByValTentIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByScopeIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByPrevIdx( CFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByNextIdx( CFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByContPrevIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByContNextIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByCodeVisIdx( CFSecAuthorization Authorization,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key ScopeCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByScopeCodeVisIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffBySchemaIdx( CFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Read an array of the specific DbKeyHash512Gen buffer instances identified by the duplicate key DispIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDispenserTenantId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The DbKeyHash512Gen key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamDbKeyHash512GenBuff[] readBuffByDispIdx( CFSecAuthorization Authorization,
		Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	CFBamDbKeyHash512GenBuff moveBuffUp( CFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	CFBamDbKeyHash512GenBuff moveBuffDown( CFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
