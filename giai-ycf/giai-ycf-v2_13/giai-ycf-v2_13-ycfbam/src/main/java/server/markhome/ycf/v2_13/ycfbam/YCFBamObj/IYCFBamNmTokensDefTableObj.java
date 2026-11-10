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

public interface IYCFBamNmTokensDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NmTokensDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamNmTokensDefObj newInstance();

	/**
	 *	Instantiate a new NmTokensDef edition of the specified NmTokensDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamNmTokensDefEditObj newEditInstance( IYCFBamNmTokensDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokensDefObj realiseNmTokensDef( IYCFBamNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokensDefObj createNmTokensDef( IYCFBamNmTokensDefObj Obj );

	/**
	 *	Read a NmTokensDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokensDefObj readNmTokensDef( YCFBamValuePKey pkey );

	/**
	 *	Read a NmTokensDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokensDefObj readNmTokensDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamNmTokensDefObj readCachedNmTokensDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeNmTokensDef( IYCFBamNmTokensDefObj obj );

	void deepDisposeNmTokensDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokensDefObj lockNmTokensDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NmTokensDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokensDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readAllNmTokensDef();

	/**
	 *	Return a sorted map of all the NmTokensDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokensDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readAllNmTokensDef( boolean forceRead );

	List<IYCFBamNmTokensDefObj> readCachedAllNmTokensDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokensDefObj readNmTokensDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokensDefObj readNmTokensDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokensDefObj readNmTokensDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokensDefObj readNmTokensDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamNmTokensDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamNmTokensDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamNmTokensDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokensDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokensDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokensDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokensDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokensDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokensDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokensDefObj> readNmTokensDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamNmTokensDefObj readCachedNmTokensDefByIdIdx( long TenantId,
		long Id );

	IYCFBamNmTokensDefObj readCachedNmTokensDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamNmTokensDefObj> readCachedNmTokensDefByValTentIdx( long TenantId );

	List<IYCFBamNmTokensDefObj> readCachedNmTokensDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamNmTokensDefObj> readCachedNmTokensDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamNmTokensDefObj> readCachedNmTokensDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamNmTokensDefObj> readCachedNmTokensDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamNmTokensDefObj> readCachedNmTokensDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamNmTokensDefObj> readCachedNmTokensDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamNmTokensDefObj> readCachedNmTokensDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNmTokensDefObj> readCachedNmTokensDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokensDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeNmTokensDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNmTokensDefByValTentIdx( long TenantId );

	void deepDisposeNmTokensDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNmTokensDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNmTokensDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNmTokensDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNmTokensDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNmTokensDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNmTokensDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokensDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokensDefObj updateNmTokensDef( IYCFBamNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensDef( IYCFBamNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamNmTokensDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokensDefObj refreshed cache instance.
	 */
	IYCFBamNmTokensDefObj moveUpNmTokensDef( IYCFBamNmTokensDefObj Obj );

	/**
	 *	Move the YCFBamNmTokensDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokensDefObj refreshed cache instance.
	 */
	IYCFBamNmTokensDefObj moveDownNmTokensDef( IYCFBamNmTokensDefObj Obj );
}
