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

public interface IYCFBamUuidDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UuidDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamUuidDefObj newInstance();

	/**
	 *	Instantiate a new UuidDef edition of the specified UuidDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamUuidDefEditObj newEditInstance( IYCFBamUuidDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidDefObj realiseUuidDef( IYCFBamUuidDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidDefObj createUuidDef( IYCFBamUuidDefObj Obj );

	/**
	 *	Read a UuidDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuidDefObj readUuidDef( YCFBamValuePKey pkey );

	/**
	 *	Read a UuidDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuidDefObj readUuidDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamUuidDefObj readCachedUuidDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeUuidDef( IYCFBamUuidDefObj obj );

	void deepDisposeUuidDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidDefObj lockUuidDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UuidDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuidDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuidDefObj> readAllUuidDef();

	/**
	 *	Return a sorted map of all the UuidDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuidDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuidDefObj> readAllUuidDef( boolean forceRead );

	List<IYCFBamUuidDefObj> readCachedAllUuidDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidDefObj readUuidDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidDefObj readUuidDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidDefObj readUuidDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidDefObj readUuidDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamUuidDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamUuidDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamUuidDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuidDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuidDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuidDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuidDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuidDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuidDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidDefObj> readUuidDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamUuidDefObj readCachedUuidDefByIdIdx( long TenantId,
		long Id );

	IYCFBamUuidDefObj readCachedUuidDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamUuidDefObj> readCachedUuidDefByValTentIdx( long TenantId );

	List<IYCFBamUuidDefObj> readCachedUuidDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamUuidDefObj> readCachedUuidDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamUuidDefObj> readCachedUuidDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamUuidDefObj> readCachedUuidDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamUuidDefObj> readCachedUuidDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamUuidDefObj> readCachedUuidDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamUuidDefObj> readCachedUuidDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuidDefObj> readCachedUuidDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuidDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuidDefByValTentIdx( long TenantId );

	void deepDisposeUuidDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuidDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuidDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuidDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuidDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuidDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuidDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidDefObj updateUuidDef( IYCFBamUuidDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidDef( IYCFBamUuidDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamUuidDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuidDefObj refreshed cache instance.
	 */
	IYCFBamUuidDefObj moveUpUuidDef( IYCFBamUuidDefObj Obj );

	/**
	 *	Move the YCFBamUuidDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuidDefObj refreshed cache instance.
	 */
	IYCFBamUuidDefObj moveDownUuidDef( IYCFBamUuidDefObj Obj );
}
