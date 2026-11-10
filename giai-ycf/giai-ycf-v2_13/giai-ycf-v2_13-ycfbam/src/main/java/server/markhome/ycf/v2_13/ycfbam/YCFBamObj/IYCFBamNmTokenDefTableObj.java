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

public interface IYCFBamNmTokenDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NmTokenDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamNmTokenDefObj newInstance();

	/**
	 *	Instantiate a new NmTokenDef edition of the specified NmTokenDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamNmTokenDefEditObj newEditInstance( IYCFBamNmTokenDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenDefObj realiseNmTokenDef( IYCFBamNmTokenDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenDefObj createNmTokenDef( IYCFBamNmTokenDefObj Obj );

	/**
	 *	Read a NmTokenDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokenDefObj readNmTokenDef( YCFBamValuePKey pkey );

	/**
	 *	Read a NmTokenDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokenDefObj readNmTokenDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamNmTokenDefObj readCachedNmTokenDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeNmTokenDef( IYCFBamNmTokenDefObj obj );

	void deepDisposeNmTokenDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenDefObj lockNmTokenDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NmTokenDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokenDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readAllNmTokenDef();

	/**
	 *	Return a sorted map of all the NmTokenDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokenDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readAllNmTokenDef( boolean forceRead );

	List<IYCFBamNmTokenDefObj> readCachedAllNmTokenDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenDefObj readNmTokenDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenDefObj readNmTokenDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenDefObj readNmTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenDefObj readNmTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamNmTokenDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamNmTokenDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamNmTokenDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokenDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokenDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokenDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokenDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokenDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokenDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenDefObj> readNmTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamNmTokenDefObj readCachedNmTokenDefByIdIdx( long TenantId,
		long Id );

	IYCFBamNmTokenDefObj readCachedNmTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamNmTokenDefObj> readCachedNmTokenDefByValTentIdx( long TenantId );

	List<IYCFBamNmTokenDefObj> readCachedNmTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamNmTokenDefObj> readCachedNmTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamNmTokenDefObj> readCachedNmTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamNmTokenDefObj> readCachedNmTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamNmTokenDefObj> readCachedNmTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamNmTokenDefObj> readCachedNmTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamNmTokenDefObj> readCachedNmTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNmTokenDefObj> readCachedNmTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokenDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeNmTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNmTokenDefByValTentIdx( long TenantId );

	void deepDisposeNmTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNmTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNmTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNmTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNmTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNmTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNmTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenDefObj updateNmTokenDef( IYCFBamNmTokenDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokenDef( IYCFBamNmTokenDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenDef key attribute of the instance generating the id.
	 */
	void deleteNmTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamNmTokenDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokenDefObj refreshed cache instance.
	 */
	IYCFBamNmTokenDefObj moveUpNmTokenDef( IYCFBamNmTokenDefObj Obj );

	/**
	 *	Move the YCFBamNmTokenDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokenDefObj refreshed cache instance.
	 */
	IYCFBamNmTokenDefObj moveDownNmTokenDef( IYCFBamNmTokenDefObj Obj );
}
