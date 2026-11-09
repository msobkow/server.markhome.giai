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

public interface ICFBamRoleDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new RoleDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamRoleDefObj newInstance();

	/**
	 *	Instantiate a new RoleDef edition of the specified RoleDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamRoleDefEditObj newEditInstance( ICFBamRoleDefObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	argClassCode	The class code used to identify the proposed instance class.
	 *
	 *	@return	ICFBamRoleDefObj instance, which may be a subclass of a RoleDef instance.
	 */
	ICFBamRoleDefObj constructByClassCode( String argClassCode );

	/**
	 *	Internal use only.
	 */
	ICFBamRoleDefObj realiseRoleDef( ICFBamRoleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamRoleDefObj createRoleDef( ICFBamRoleDefObj Obj );

	/**
	 *	Read a RoleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RoleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamRoleDefObj readRoleDef( CFBamRoleDefPKey pkey );

	/**
	 *	Read a RoleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RoleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamRoleDefObj readRoleDef( CFBamRoleDefPKey pkey,
		boolean forceRead );

	ICFBamRoleDefObj readCachedRoleDef( CFBamRoleDefPKey pkey );

	public void reallyDeepDisposeRoleDef( ICFBamRoleDefObj obj );

	void deepDisposeRoleDef( CFBamRoleDefPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamRoleDefObj lockRoleDef( CFBamRoleDefPKey pkey );

	/**
	 *	Return a sorted list of all the RoleDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamRoleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamRoleDefObj> readAllRoleDef();

	/**
	 *	Return a sorted map of all the RoleDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamRoleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamRoleDefObj> readAllRoleDef( boolean forceRead );

	List<ICFBamRoleDefObj> readCachedAllRoleDef();

	/**
	 *	Get the CFBamRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamRoleDefObj readRoleDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamRoleDefObj readRoleDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamRoleDefObj readRoleDefByUNameIdx(long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamRoleDefObj readRoleDefByUNameIdx(long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the CFBamRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamRoleDefObj readRoleDefByUDefIdx(long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Get the CFBamRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRoleDefObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamRoleDefObj readRoleDefByUDefIdx(long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRoleDefObj instances sorted by their primary keys for the duplicate RoleDefTentIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRoleDefObj cached instances sorted by their primary keys for the duplicate RoleDefTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRoleDefObj> readRoleDefByRoleDefTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamRoleDefObj instances sorted by their primary keys for the duplicate RoleDefTentIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRoleDefObj cached instances sorted by their primary keys for the duplicate RoleDefTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRoleDefObj> readRoleDefByRoleDefTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRoleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRoleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRoleDefObj> readRoleDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamRoleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRoleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRoleDefObj> readRoleDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRoleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRoleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRoleDefObj> readRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamRoleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRoleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRoleDefObj> readRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	ICFBamRoleDefObj readCachedRoleDefByIdIdx( long TenantId,
		long Id );

	ICFBamRoleDefObj readCachedRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	ICFBamRoleDefObj readCachedRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	List<ICFBamRoleDefObj> readCachedRoleDefByRoleDefTentIdx( long TenantId );

	List<ICFBamRoleDefObj> readCachedRoleDefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamRoleDefObj> readCachedRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeRoleDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	void deepDisposeRoleDefByRoleDefTentIdx( long TenantId );

	void deepDisposeRoleDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamRoleDefObj updateRoleDef( ICFBamRoleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRoleDef( ICFBamRoleDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByUNameIdx(long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByUDefIdx(long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByRoleDefTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );
}
