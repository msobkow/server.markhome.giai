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

public interface IYCFBamInt16DefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int16Def instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamInt16DefObj newInstance();

	/**
	 *	Instantiate a new Int16Def edition of the specified Int16Def instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamInt16DefEditObj newEditInstance( IYCFBamInt16DefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt16DefObj realiseInt16Def( IYCFBamInt16DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt16DefObj createInt16Def( IYCFBamInt16DefObj Obj );

	/**
	 *	Read a Int16Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamInt16DefObj readInt16Def( YCFBamValuePKey pkey );

	/**
	 *	Read a Int16Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamInt16DefObj readInt16Def( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamInt16DefObj readCachedInt16Def( YCFBamValuePKey pkey );

	public void reallyDeepDisposeInt16Def( IYCFBamInt16DefObj obj );

	void deepDisposeInt16Def( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt16DefObj lockInt16Def( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int16Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamInt16DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamInt16DefObj> readAllInt16Def();

	/**
	 *	Return a sorted map of all the Int16Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamInt16DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamInt16DefObj> readAllInt16Def( boolean forceRead );

	List<IYCFBamInt16DefObj> readCachedAllInt16Def();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt16DefObj readInt16DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt16DefObj readInt16DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt16DefObj readInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt16DefObj readInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamInt16DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamInt16DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamInt16DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamInt16DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamInt16DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamInt16DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamInt16DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamInt16DefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamInt16DefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt16DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt16DefObj> readInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamInt16DefObj readCachedInt16DefByIdIdx( long TenantId,
		long Id );

	IYCFBamInt16DefObj readCachedInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamInt16DefObj> readCachedInt16DefByValTentIdx( long TenantId );

	List<IYCFBamInt16DefObj> readCachedInt16DefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamInt16DefObj> readCachedInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamInt16DefObj> readCachedInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamInt16DefObj> readCachedInt16DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamInt16DefObj> readCachedInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamInt16DefObj> readCachedInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamInt16DefObj> readCachedInt16DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamInt16DefObj> readCachedInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt16DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt16DefByValTentIdx( long TenantId );

	void deepDisposeInt16DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt16DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt16DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt16DefObj updateInt16Def( IYCFBamInt16DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt16Def( IYCFBamInt16DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int16Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int16Def key attribute of the instance generating the id.
	 */
	void deleteInt16DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamInt16DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamInt16DefObj refreshed cache instance.
	 */
	IYCFBamInt16DefObj moveUpInt16Def( IYCFBamInt16DefObj Obj );

	/**
	 *	Move the YCFBamInt16DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamInt16DefObj refreshed cache instance.
	 */
	IYCFBamInt16DefObj moveDownInt16Def( IYCFBamInt16DefObj Obj );
}
