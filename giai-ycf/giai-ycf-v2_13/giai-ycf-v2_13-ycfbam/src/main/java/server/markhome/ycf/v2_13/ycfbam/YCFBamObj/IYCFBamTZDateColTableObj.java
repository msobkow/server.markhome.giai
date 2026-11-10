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

public interface IYCFBamTZDateColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZDateCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTZDateColObj newInstance();

	/**
	 *	Instantiate a new TZDateCol edition of the specified TZDateCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTZDateColEditObj newEditInstance( IYCFBamTZDateColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZDateColObj realiseTZDateCol( IYCFBamTZDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZDateColObj createTZDateCol( IYCFBamTZDateColObj Obj );

	/**
	 *	Read a TZDateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZDateColObj readTZDateCol( YCFBamValuePKey pkey );

	/**
	 *	Read a TZDateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZDateColObj readTZDateCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTZDateColObj readCachedTZDateCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTZDateCol( IYCFBamTZDateColObj obj );

	void deepDisposeTZDateCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZDateColObj lockTZDateCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZDateCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZDateColObj> readAllTZDateCol();

	/**
	 *	Return a sorted map of all the TZDateCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZDateColObj> readAllTZDateCol( boolean forceRead );

	List<IYCFBamTZDateColObj> readCachedAllTZDateCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZDateColObj readTZDateColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZDateColObj readTZDateColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZDateColObj readTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZDateColObj readTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamTZDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZDateColObj> readTZDateColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamTZDateColObj readCachedTZDateColByIdIdx( long TenantId,
		long Id );

	IYCFBamTZDateColObj readCachedTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTZDateColObj> readCachedTZDateColByValTentIdx( long TenantId );

	List<IYCFBamTZDateColObj> readCachedTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTZDateColObj> readCachedTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTZDateColObj> readCachedTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTZDateColObj> readCachedTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTZDateColObj> readCachedTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTZDateColObj> readCachedTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTZDateColObj> readCachedTZDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZDateColObj> readCachedTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZDateColObj> readCachedTZDateColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTZDateColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZDateColByValTentIdx( long TenantId );

	void deepDisposeTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZDateColObj updateTZDateCol( IYCFBamTZDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZDateCol( IYCFBamTZDateColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamTZDateColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZDateColObj refreshed cache instance.
	 */
	IYCFBamTZDateColObj moveUpTZDateCol( IYCFBamTZDateColObj Obj );

	/**
	 *	Move the YCFBamTZDateColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZDateColObj refreshed cache instance.
	 */
	IYCFBamTZDateColObj moveDownTZDateCol( IYCFBamTZDateColObj Obj );
}
