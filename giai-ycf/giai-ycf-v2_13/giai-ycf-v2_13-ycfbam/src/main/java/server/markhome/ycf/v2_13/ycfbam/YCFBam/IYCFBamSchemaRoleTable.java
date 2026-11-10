
// Description: Java 11 DbIO interface for SchemaRole.

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
 *	YCFBamSchemaRoleTable database interface for SchemaRole
 */
public interface IYCFBamSchemaRoleTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSchemaRole( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSchemaRole( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSchemaRole( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBuff Buff );
	/**
	 *	Delete the SchemaRole instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleBySchemaIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId );

	/**
	 *	Delete the SchemaRole instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleBySchemaIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBySchemaIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key RoleScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByRoleScopeIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.RoleScopeEnum argRoleScope );

	/**
	 *	Delete the SchemaRole instances identified by the key RoleScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByRoleScopeIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleByRoleScopeIdxKey argKey );
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
	void deleteSchemaRoleBySchRoleScpIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId,
		IYCFBamSchema.RoleScopeEnum argRoleScope );

	/**
	 *	Delete the SchemaRole instances identified by the key SchRoleScpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleBySchRoleScpIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBySchRoleScpIdxKey argKey );
	/**
	 *	Delete the SchemaRole instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the SchemaRole instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSchemaRoleByIdIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey argKey );
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
	void deleteSchemaRoleByUNameIdx( YCFSecAuthorization Authorization,
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
	void deleteSchemaRoleByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByUNameIdxKey argKey );
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
	void deleteSchemaRoleByUDefIdx( YCFSecAuthorization Authorization,
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
	void deleteSchemaRoleByUDefIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByUDefIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key RoleDefTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByRoleDefTentIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the SchemaRole instances identified by the key RoleDefTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByRoleDefTentIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByRoleDefTentIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId );

	/**
	 *	Delete the SchemaRole instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByScopeIdxKey argKey );
	/**
	 *	Delete the SchemaRole instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the SchemaRole instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaRoleByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByDefSchemaIdxKey argKey );


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
	YCFBamSchemaRoleBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey );

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
	YCFBamSchemaRoleBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey );

	/**
	 *	Read all SchemaRole instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamSchemaRoleBuff[] readAllDerived( YCFSecAuthorization Authorization );

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
	YCFBamSchemaRoleBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
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
	YCFBamSchemaRoleBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
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
	YCFBamSchemaRoleBuff readDerivedByUDefIdx( YCFSecAuthorization Authorization,
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
	YCFBamSchemaRoleBuff[] readDerivedByRoleDefTentIdx( YCFSecAuthorization Authorization,
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
	YCFBamSchemaRoleBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
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
	YCFBamSchemaRoleBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
	YCFBamSchemaRoleBuff[] readDerivedBySchemaIdx( YCFSecAuthorization Authorization,
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
	YCFBamSchemaRoleBuff[] readDerivedByRoleScopeIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.RoleScopeEnum RoleScope );

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
	YCFBamSchemaRoleBuff[] readDerivedBySchRoleScpIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope );

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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey );

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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey );

	/**
	 *	Read all the specific SchemaRole buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SchemaRole instances in the database accessible for the Authorization.
	 */
	YCFBamSchemaRoleBuff[] readAllBuff( YCFSecAuthorization Authorization );

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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff readBuffByUDefIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff[] readBuffByRoleDefTentIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff[] readBuffBySchemaIdx( YCFSecAuthorization Authorization,
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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff[] readBuffByRoleScopeIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.RoleScopeEnum RoleScope );

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
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamSchemaRoleBuff[] readBuffBySchRoleScpIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
