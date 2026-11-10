// Description: Java 11 Table Object interface for YCFBam.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamRoleDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new RoleDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamRoleDefObj newInstance();

	/**
	 *	Instantiate a new RoleDef edition of the specified RoleDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamRoleDefEditObj newEditInstance( IYCFBamRoleDefObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	argClassCode	The class code used to identify the proposed instance class.
	 *
	 *	@return	IYCFBamRoleDefObj instance, which may be a subclass of a RoleDef instance.
	 */
	IYCFBamRoleDefObj constructByClassCode( String argClassCode );

	/**
	 *	Internal use only.
	 */
	IYCFBamRoleDefObj realiseRoleDef( IYCFBamRoleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamRoleDefObj createRoleDef( IYCFBamRoleDefObj Obj );

	/**
	 *	Read a RoleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RoleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamRoleDefObj readRoleDef( YCFBamRoleDefPKey pkey );

	/**
	 *	Read a RoleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RoleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamRoleDefObj readRoleDef( YCFBamRoleDefPKey pkey,
		boolean forceRead );

	IYCFBamRoleDefObj readCachedRoleDef( YCFBamRoleDefPKey pkey );

	public void reallyDeepDisposeRoleDef( IYCFBamRoleDefObj obj );

	void deepDisposeRoleDef( YCFBamRoleDefPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamRoleDefObj lockRoleDef( YCFBamRoleDefPKey pkey );

	/**
	 *	Return a sorted list of all the RoleDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamRoleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamRoleDefObj> readAllRoleDef();

	/**
	 *	Return a sorted map of all the RoleDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamRoleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamRoleDefObj> readAllRoleDef( boolean forceRead );

	List<IYCFBamRoleDefObj> readCachedAllRoleDef();

	/**
	 *	Get the YCFBamRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamRoleDefObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRoleDefObj readRoleDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamRoleDefObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRoleDefObj readRoleDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamRoleDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRoleDefObj readRoleDefByUNameIdx(long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamRoleDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRoleDefObj readRoleDefByUNameIdx(long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the YCFBamRoleDefObj instance for the unique UDefIdx key.
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
	 *	@return	YCFBamRoleDefObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRoleDefObj readRoleDefByUDefIdx(long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Get the YCFBamRoleDefObj instance for the unique UDefIdx key.
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
	 *	@return	YCFBamRoleDefObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRoleDefObj readRoleDefByUDefIdx(long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRoleDefObj instances sorted by their primary keys for the duplicate RoleDefTentIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRoleDefObj cached instances sorted by their primary keys for the duplicate RoleDefTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRoleDefObj> readRoleDefByRoleDefTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamRoleDefObj instances sorted by their primary keys for the duplicate RoleDefTentIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRoleDefObj cached instances sorted by their primary keys for the duplicate RoleDefTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRoleDefObj> readRoleDefByRoleDefTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRoleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRoleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRoleDefObj> readRoleDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamRoleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRoleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRoleDefObj> readRoleDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRoleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRoleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRoleDefObj> readRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamRoleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRoleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRoleDefObj> readRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	IYCFBamRoleDefObj readCachedRoleDefByIdIdx( long TenantId,
		long Id );

	IYCFBamRoleDefObj readCachedRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	IYCFBamRoleDefObj readCachedRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	List<IYCFBamRoleDefObj> readCachedRoleDefByRoleDefTentIdx( long TenantId );

	List<IYCFBamRoleDefObj> readCachedRoleDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamRoleDefObj> readCachedRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
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
	IYCFBamRoleDefObj updateRoleDef( IYCFBamRoleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRoleDef( IYCFBamRoleDefObj Obj );

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
