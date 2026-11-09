
// Description: Java 11 DbIO interface for SchemaRole.

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
 *	CFBamSchemaRoleTable database interface for SchemaRole
 */
public interface ICFBamSchemaRoleTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSchemaRole( CFSecAuthorization Authorization,
		CFBamSchemaRoleBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSchemaRole( CFSecAuthorization Authorization,
		CFBamSchemaRoleBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSchemaRole( CFSecAuthorization Authorization,
		CFBamSchemaRoleBuff Buff );
	/**
	 *	Delete the SchemaRole instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleBySchemaIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId );

	/**
	 *	Delete the SchemaRole instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleBySchemaIdx( CFSecAuthorization Authorization,
		CFBamSchemaRoleBySchemaIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key RoleScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByRoleScopeIdx( CFSecAuthorization Authorization,
		ICFBamSchema.RoleScopeEnum argRoleScope );

	/**
	 *	Delete the SchemaRole instances identified by the key RoleScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByRoleScopeIdx( CFSecAuthorization Authorization,
		CFBamSchemaRoleByRoleScopeIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key SchRoleScpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleBySchRoleScpIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId,
		ICFBamSchema.RoleScopeEnum argRoleScope );

	/**
	 *	Delete the SchemaRole instances identified by the key SchRoleScpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleBySchRoleScpIdx( CFSecAuthorization Authorization,
		CFBamSchemaRoleBySchRoleScpIdxKey argKey );
	/**
	 *	Delete the SchemaRole instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the SchemaRole instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSchemaRoleByIdIdx( CFSecAuthorization Authorization,
		CFBamRoleDefPKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByUNameIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName );

	/**
	 *	Delete the SchemaRole instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByUNameIdx( CFSecAuthorization Authorization,
		CFBamRoleDefByUNameIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByUDefIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argDefSchemaTenantId,
		Long argDefSchemaId,
		String argName );

	/**
	 *	Delete the SchemaRole instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByUDefIdx( CFSecAuthorization Authorization,
		CFBamRoleDefByUDefIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key RoleDefTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByRoleDefTentIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the SchemaRole instances identified by the key RoleDefTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByRoleDefTentIdx( CFSecAuthorization Authorization,
		CFBamRoleDefByRoleDefTentIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByScopeIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId );

	/**
	 *	Delete the SchemaRole instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByScopeIdx( CFSecAuthorization Authorization,
		CFBamRoleDefByScopeIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByDefSchemaIdx( CFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the SchemaRole instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByDefSchemaIdx( CFSecAuthorization Authorization,
		CFBamRoleDefByDefSchemaIdxKey argKey );


	/**
	 *	Read the derived SchemaRole buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SchemaRole instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaRoleBuff readDerived( CFSecAuthorization Authorization,
		CFBamRoleDefPKey PKey );

	/**
	 *	Lock the derived SchemaRole buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SchemaRole instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaRoleBuff lockDerived( CFSecAuthorization Authorization,
		CFBamRoleDefPKey PKey );

	/**
	 *	Read all SchemaRole instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFBamSchemaRoleBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived SchemaRole buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaRoleBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived SchemaRole buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaRoleBuff readDerivedByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read the derived SchemaRole buffer instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaRoleBuff readDerivedByUDefIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Read an array of the derived SchemaRole buffer instances identified by the duplicate key RoleDefTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaRoleBuff[] readDerivedByRoleDefTentIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived SchemaRole buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaRoleBuff[] readDerivedByScopeIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the derived SchemaRole buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaRoleBuff[] readDerivedByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived SchemaRole buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaRoleBuff[] readDerivedBySchemaIdx( CFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Read an array of the derived SchemaRole buffer instances identified by the duplicate key RoleScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaRoleBuff[] readDerivedByRoleScopeIdx( CFSecAuthorization Authorization,
		ICFBamSchema.RoleScopeEnum RoleScope );

	/**
	 *	Read an array of the derived SchemaRole buffer instances identified by the duplicate key SchRoleScpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaRoleBuff[] readDerivedBySchRoleScpIdx( CFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope );

	/**
	 *	Read the specific SchemaRole buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SchemaRole instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff readBuff( CFSecAuthorization Authorization,
		CFBamRoleDefPKey PKey );

	/**
	 *	Lock the specific SchemaRole buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SchemaRole instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff lockBuff( CFSecAuthorization Authorization,
		CFBamRoleDefPKey PKey );

	/**
	 *	Read all the specific SchemaRole buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SchemaRole instances in the database accessible for the Authorization.
	 */
	CFBamSchemaRoleBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific SchemaRole buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific SchemaRole buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff readBuffByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Read the specific SchemaRole buffer instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff readBuffByUDefIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Read an array of the specific SchemaRole buffer instances identified by the duplicate key RoleDefTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff[] readBuffByRoleDefTentIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific SchemaRole buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff[] readBuffByScopeIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ScopeId );

	/**
	 *	Read an array of the specific SchemaRole buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff[] readBuffByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific SchemaRole buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff[] readBuffBySchemaIdx( CFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId );

	/**
	 *	Read an array of the specific SchemaRole buffer instances identified by the duplicate key RoleScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff[] readBuffByRoleScopeIdx( CFSecAuthorization Authorization,
		ICFBamSchema.RoleScopeEnum RoleScope );

	/**
	 *	Read an array of the specific SchemaRole buffer instances identified by the duplicate key SchRoleScpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaRoleBuff[] readBuffBySchRoleScpIdx( CFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
