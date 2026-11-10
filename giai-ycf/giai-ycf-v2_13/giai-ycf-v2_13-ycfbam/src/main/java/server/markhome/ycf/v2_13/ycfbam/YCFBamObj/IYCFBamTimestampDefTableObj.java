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

public interface IYCFBamTimestampDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TimestampDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTimestampDefObj newInstance();

	/**
	 *	Instantiate a new TimestampDef edition of the specified TimestampDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTimestampDefEditObj newEditInstance( IYCFBamTimestampDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimestampDefObj realiseTimestampDef( IYCFBamTimestampDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimestampDefObj createTimestampDef( IYCFBamTimestampDefObj Obj );

	/**
	 *	Read a TimestampDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimestampDefObj readTimestampDef( YCFBamValuePKey pkey );

	/**
	 *	Read a TimestampDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimestampDefObj readTimestampDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTimestampDefObj readCachedTimestampDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTimestampDef( IYCFBamTimestampDefObj obj );

	void deepDisposeTimestampDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimestampDefObj lockTimestampDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TimestampDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimestampDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimestampDefObj> readAllTimestampDef();

	/**
	 *	Return a sorted map of all the TimestampDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimestampDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimestampDefObj> readAllTimestampDef( boolean forceRead );

	List<IYCFBamTimestampDefObj> readCachedAllTimestampDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimestampDefObj readTimestampDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimestampDefObj readTimestampDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimestampDefObj readTimestampDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimestampDefObj readTimestampDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTimestampDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTimestampDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTimestampDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimestampDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimestampDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimestampDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimestampDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimestampDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimestampDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimestampDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimestampDefObj> readTimestampDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamTimestampDefObj readCachedTimestampDefByIdIdx( long TenantId,
		long Id );

	IYCFBamTimestampDefObj readCachedTimestampDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTimestampDefObj> readCachedTimestampDefByValTentIdx( long TenantId );

	List<IYCFBamTimestampDefObj> readCachedTimestampDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTimestampDefObj> readCachedTimestampDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTimestampDefObj> readCachedTimestampDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTimestampDefObj> readCachedTimestampDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTimestampDefObj> readCachedTimestampDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTimestampDefObj> readCachedTimestampDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTimestampDefObj> readCachedTimestampDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTimestampDefObj> readCachedTimestampDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimestampDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeTimestampDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTimestampDefByValTentIdx( long TenantId );

	void deepDisposeTimestampDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTimestampDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTimestampDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTimestampDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTimestampDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTimestampDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTimestampDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimestampDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimestampDefObj updateTimestampDef( IYCFBamTimestampDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampDef( IYCFBamTimestampDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamTimestampDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimestampDefObj refreshed cache instance.
	 */
	IYCFBamTimestampDefObj moveUpTimestampDef( IYCFBamTimestampDefObj Obj );

	/**
	 *	Move the YCFBamTimestampDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimestampDefObj refreshed cache instance.
	 */
	IYCFBamTimestampDefObj moveDownTimestampDef( IYCFBamTimestampDefObj Obj );
}
