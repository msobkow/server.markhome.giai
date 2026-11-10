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

public interface IYCFBamDbKeyHash128ColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash128Col instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDbKeyHash128ColObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash128Col edition of the specified DbKeyHash128Col instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDbKeyHash128ColEditObj newEditInstance( IYCFBamDbKeyHash128ColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash128ColObj realiseDbKeyHash128Col( IYCFBamDbKeyHash128ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash128ColObj createDbKeyHash128Col( IYCFBamDbKeyHash128ColObj Obj );

	/**
	 *	Read a DbKeyHash128Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash128ColObj readDbKeyHash128Col( YCFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash128Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash128ColObj readDbKeyHash128Col( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDbKeyHash128ColObj readCachedDbKeyHash128Col( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash128Col( IYCFBamDbKeyHash128ColObj obj );

	void deepDisposeDbKeyHash128Col( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash128ColObj lockDbKeyHash128Col( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash128Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash128ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readAllDbKeyHash128Col();

	/**
	 *	Return a sorted map of all the DbKeyHash128Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash128ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readAllDbKeyHash128Col( boolean forceRead );

	List<IYCFBamDbKeyHash128ColObj> readCachedAllDbKeyHash128Col();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash128ColObj readDbKeyHash128ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash128ColObj readDbKeyHash128ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash128ColObj readDbKeyHash128ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash128ColObj readDbKeyHash128ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamDbKeyHash128ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash128ColObj> readDbKeyHash128ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamDbKeyHash128ColObj readCachedDbKeyHash128ColByIdIdx( long TenantId,
		long Id );

	IYCFBamDbKeyHash128ColObj readCachedDbKeyHash128ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByValTentIdx( long TenantId );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash128ColObj> readCachedDbKeyHash128ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeDbKeyHash128ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash128ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash128ColByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash128ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash128ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash128ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash128ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash128ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash128ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash128ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash128ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash128ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash128ColObj updateDbKeyHash128Col( IYCFBamDbKeyHash128ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash128Col( IYCFBamDbKeyHash128ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamDbKeyHash128ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash128ColObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash128ColObj moveUpDbKeyHash128Col( IYCFBamDbKeyHash128ColObj Obj );

	/**
	 *	Move the YCFBamDbKeyHash128ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash128ColObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash128ColObj moveDownDbKeyHash128Col( IYCFBamDbKeyHash128ColObj Obj );
}
