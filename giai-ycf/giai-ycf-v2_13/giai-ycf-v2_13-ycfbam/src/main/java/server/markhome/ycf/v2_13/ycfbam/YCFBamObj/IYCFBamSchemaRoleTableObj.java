// Description: Java 11 Table Object interface for CFBam.

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

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamSchemaRoleTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SchemaRole instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamSchemaRoleObj newInstance();

	/**
	 *	Instantiate a new SchemaRole edition of the specified SchemaRole instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamSchemaRoleEditObj newEditInstance( ICFBamSchemaRoleObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaRoleObj realiseSchemaRole( ICFBamSchemaRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaRoleObj createSchemaRole( ICFBamSchemaRoleObj Obj );

	/**
	 *	Read a SchemaRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamSchemaRoleObj readSchemaRole( CFBamRoleDefPKey pkey );

	/**
	 *	Read a SchemaRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamSchemaRoleObj readSchemaRole( CFBamRoleDefPKey pkey,
		boolean forceRead );

	ICFBamSchemaRoleObj readCachedSchemaRole( CFBamRoleDefPKey pkey );

	public void reallyDeepDisposeSchemaRole( ICFBamSchemaRoleObj obj );

	void deepDisposeSchemaRole( CFBamRoleDefPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaRoleObj lockSchemaRole( CFBamRoleDefPKey pkey );

	/**
	 *	Return a sorted list of all the SchemaRole-derived instances in the database.
	 *
	 *	@return	List of ICFBamSchemaRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamSchemaRoleObj> readAllSchemaRole();

	/**
	 *	Return a sorted map of all the SchemaRole-derived instances in the database.
	 *
	 *	@return	List of ICFBamSchemaRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamSchemaRoleObj> readAllSchemaRole( boolean forceRead );

	List<ICFBamSchemaRoleObj> readCachedAllSchemaRole();

	/**
	 *	Get the CFBamRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRoleObj readSchemaRoleByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRoleObj readSchemaRoleByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRoleObj readSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRoleObj readSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the CFBamRoleDefObj instance for the unique UDefIdx key.
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
	 *	@return	CFBamRoleDefObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRoleObj readSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Get the CFBamRoleDefObj instance for the unique UDefIdx key.
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
	 *	@return	CFBamRoleDefObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRoleObj readSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRoleDefObj instances sorted by their primary keys for the duplicate RoleDefTentIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate RoleDefTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleByRoleDefTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamSchemaRoleObj instances sorted by their primary keys for the duplicate RoleDefTentIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate RoleDefTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleByRoleDefTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRoleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamSchemaRoleObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRoleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamSchemaRoleObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaRoleObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamSchemaRoleObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaRoleObj instances sorted by their primary keys for the duplicate RoleScopeIdx key.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate RoleScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope );

	/**
	 *	Get the map of CFBamSchemaRoleObj instances sorted by their primary keys for the duplicate RoleScopeIdx key.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate RoleScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaRoleObj instances sorted by their primary keys for the duplicate SchRoleScpIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchRoleScpIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope );

	/**
	 *	Get the map of CFBamSchemaRoleObj instances sorted by their primary keys for the duplicate SchRoleScpIdx key.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchRoleScpIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope,
		boolean forceRead );

	ICFBamSchemaRoleObj readCachedSchemaRoleByIdIdx( long TenantId,
		long Id );

	ICFBamSchemaRoleObj readCachedSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	ICFBamSchemaRoleObj readCachedSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	List<ICFBamSchemaRoleObj> readCachedSchemaRoleByRoleDefTentIdx( long TenantId );

	List<ICFBamSchemaRoleObj> readCachedSchemaRoleByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamSchemaRoleObj> readCachedSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamSchemaRoleObj> readCachedSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<ICFBamSchemaRoleObj> readCachedSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope );

	List<ICFBamSchemaRoleObj> readCachedSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope );

	void deepDisposeSchemaRoleByIdIdx( long TenantId,
		long Id );

	void deepDisposeSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	void deepDisposeSchemaRoleByRoleDefTentIdx( long TenantId );

	void deepDisposeSchemaRoleByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope );

	void deepDisposeSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaRoleObj updateSchemaRole( ICFBamSchemaRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaRole( ICFBamSchemaRoleObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
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
	void deleteSchemaRoleByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByRoleDefTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByRoleScopeIdx( ICFBamSchema.RoleScopeEnum RoleScope );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleBySchRoleScpIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.RoleScopeEnum RoleScope );
}
