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

public interface IYCFBamInt64ColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int64Col instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamInt64ColObj newInstance();

	/**
	 *	Instantiate a new Int64Col edition of the specified Int64Col instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamInt64ColEditObj newEditInstance( IYCFBamInt64ColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt64ColObj realiseInt64Col( IYCFBamInt64ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt64ColObj createInt64Col( IYCFBamInt64ColObj Obj );

	/**
	 *	Read a Int64Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamInt64ColObj readInt64Col( YCFBamValuePKey pkey );

	/**
	 *	Read a Int64Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamInt64ColObj readInt64Col( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamInt64ColObj readCachedInt64Col( YCFBamValuePKey pkey );

	public void reallyDeepDisposeInt64Col( IYCFBamInt64ColObj obj );

	void deepDisposeInt64Col( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt64ColObj lockInt64Col( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int64Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamInt64ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamInt64ColObj> readAllInt64Col();

	/**
	 *	Return a sorted map of all the Int64Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamInt64ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamInt64ColObj> readAllInt64Col( boolean forceRead );

	List<IYCFBamInt64ColObj> readCachedAllInt64Col();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt64ColObj readInt64ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt64ColObj readInt64ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt64ColObj readInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamInt64ColObj readInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamInt64ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamInt64ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamInt64ColObj> readInt64ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamInt64ColObj readCachedInt64ColByIdIdx( long TenantId,
		long Id );

	IYCFBamInt64ColObj readCachedInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamInt64ColObj> readCachedInt64ColByValTentIdx( long TenantId );

	List<IYCFBamInt64ColObj> readCachedInt64ColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamInt64ColObj> readCachedInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamInt64ColObj> readCachedInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamInt64ColObj> readCachedInt64ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamInt64ColObj> readCachedInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamInt64ColObj> readCachedInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamInt64ColObj> readCachedInt64ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamInt64ColObj> readCachedInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamInt64ColObj> readCachedInt64ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeInt64ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt64ColByValTentIdx( long TenantId );

	void deepDisposeInt64ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt64ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt64ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeInt64ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamInt64ColObj updateInt64Col( IYCFBamInt64ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt64Col( IYCFBamInt64ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamInt64ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamInt64ColObj refreshed cache instance.
	 */
	IYCFBamInt64ColObj moveUpInt64Col( IYCFBamInt64ColObj Obj );

	/**
	 *	Move the YCFBamInt64ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamInt64ColObj refreshed cache instance.
	 */
	IYCFBamInt64ColObj moveDownInt64Col( IYCFBamInt64ColObj Obj );
}
