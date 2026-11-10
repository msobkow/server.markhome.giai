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

public interface IYCFBamTimeDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TimeDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTimeDefObj newInstance();

	/**
	 *	Instantiate a new TimeDef edition of the specified TimeDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTimeDefEditObj newEditInstance( IYCFBamTimeDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeDefObj realiseTimeDef( IYCFBamTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeDefObj createTimeDef( IYCFBamTimeDefObj Obj );

	/**
	 *	Read a TimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimeDefObj readTimeDef( YCFBamValuePKey pkey );

	/**
	 *	Read a TimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimeDefObj readTimeDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTimeDefObj readCachedTimeDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTimeDef( IYCFBamTimeDefObj obj );

	void deepDisposeTimeDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeDefObj lockTimeDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TimeDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimeDefObj> readAllTimeDef();

	/**
	 *	Return a sorted map of all the TimeDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimeDefObj> readAllTimeDef( boolean forceRead );

	List<IYCFBamTimeDefObj> readCachedAllTimeDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeDefObj readTimeDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeDefObj readTimeDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeDefObj readTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeDefObj readTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTimeDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTimeDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTimeDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimeDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimeDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimeDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimeDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimeDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimeDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeDefObj> readTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamTimeDefObj readCachedTimeDefByIdIdx( long TenantId,
		long Id );

	IYCFBamTimeDefObj readCachedTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTimeDefObj> readCachedTimeDefByValTentIdx( long TenantId );

	List<IYCFBamTimeDefObj> readCachedTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTimeDefObj> readCachedTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTimeDefObj> readCachedTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTimeDefObj> readCachedTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTimeDefObj> readCachedTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTimeDefObj> readCachedTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTimeDefObj> readCachedTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTimeDefObj> readCachedTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTimeDefByValTentIdx( long TenantId );

	void deepDisposeTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeDefObj updateTimeDef( IYCFBamTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeDef( IYCFBamTimeDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamTimeDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimeDefObj refreshed cache instance.
	 */
	IYCFBamTimeDefObj moveUpTimeDef( IYCFBamTimeDefObj Obj );

	/**
	 *	Move the YCFBamTimeDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimeDefObj refreshed cache instance.
	 */
	IYCFBamTimeDefObj moveDownTimeDef( IYCFBamTimeDefObj Obj );
}
