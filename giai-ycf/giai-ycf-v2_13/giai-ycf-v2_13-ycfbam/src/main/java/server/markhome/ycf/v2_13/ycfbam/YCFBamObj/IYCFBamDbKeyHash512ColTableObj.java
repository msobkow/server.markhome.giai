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

public interface IYCFBamDbKeyHash512ColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash512Col instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDbKeyHash512ColObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash512Col edition of the specified DbKeyHash512Col instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDbKeyHash512ColEditObj newEditInstance( IYCFBamDbKeyHash512ColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash512ColObj realiseDbKeyHash512Col( IYCFBamDbKeyHash512ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash512ColObj createDbKeyHash512Col( IYCFBamDbKeyHash512ColObj Obj );

	/**
	 *	Read a DbKeyHash512Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash512Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash512ColObj readDbKeyHash512Col( YCFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash512Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash512Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDbKeyHash512ColObj readDbKeyHash512Col( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDbKeyHash512ColObj readCachedDbKeyHash512Col( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash512Col( IYCFBamDbKeyHash512ColObj obj );

	void deepDisposeDbKeyHash512Col( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash512ColObj lockDbKeyHash512Col( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash512Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash512ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readAllDbKeyHash512Col();

	/**
	 *	Return a sorted map of all the DbKeyHash512Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDbKeyHash512ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readAllDbKeyHash512Col( boolean forceRead );

	List<IYCFBamDbKeyHash512ColObj> readCachedAllDbKeyHash512Col();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash512ColObj readDbKeyHash512ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash512ColObj readDbKeyHash512ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash512ColObj readDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDbKeyHash512ColObj readDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamDbKeyHash512ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDbKeyHash512ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDbKeyHash512ColObj> readDbKeyHash512ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamDbKeyHash512ColObj readCachedDbKeyHash512ColByIdIdx( long TenantId,
		long Id );

	IYCFBamDbKeyHash512ColObj readCachedDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByValTentIdx( long TenantId );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDbKeyHash512ColObj> readCachedDbKeyHash512ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeDbKeyHash512ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash512ColByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash512ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDbKeyHash512ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamDbKeyHash512ColObj updateDbKeyHash512Col( IYCFBamDbKeyHash512ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash512Col( IYCFBamDbKeyHash512ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash512Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DbKeyHash512Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash512ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamDbKeyHash512ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash512ColObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash512ColObj moveUpDbKeyHash512Col( IYCFBamDbKeyHash512ColObj Obj );

	/**
	 *	Move the YCFBamDbKeyHash512ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash512ColObj refreshed cache instance.
	 */
	IYCFBamDbKeyHash512ColObj moveDownDbKeyHash512Col( IYCFBamDbKeyHash512ColObj Obj );
}
