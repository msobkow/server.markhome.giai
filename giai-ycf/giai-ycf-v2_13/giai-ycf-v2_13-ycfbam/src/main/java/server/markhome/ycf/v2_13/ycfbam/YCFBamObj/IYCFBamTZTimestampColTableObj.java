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

public interface IYCFBamTZTimestampColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZTimestampCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTZTimestampColObj newInstance();

	/**
	 *	Instantiate a new TZTimestampCol edition of the specified TZTimestampCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTZTimestampColEditObj newEditInstance( IYCFBamTZTimestampColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimestampColObj realiseTZTimestampCol( IYCFBamTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimestampColObj createTZTimestampCol( IYCFBamTZTimestampColObj Obj );

	/**
	 *	Read a TZTimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZTimestampColObj readTZTimestampCol( YCFBamValuePKey pkey );

	/**
	 *	Read a TZTimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZTimestampColObj readTZTimestampCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTZTimestampColObj readCachedTZTimestampCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTZTimestampCol( IYCFBamTZTimestampColObj obj );

	void deepDisposeTZTimestampCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimestampColObj lockTZTimestampCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZTimestampCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readAllTZTimestampCol();

	/**
	 *	Return a sorted map of all the TZTimestampCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readAllTZTimestampCol( boolean forceRead );

	List<IYCFBamTZTimestampColObj> readCachedAllTZTimestampCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimestampColObj readTZTimestampColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimestampColObj readTZTimestampColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimestampColObj readTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimestampColObj readTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamTZTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimestampColObj> readTZTimestampColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamTZTimestampColObj readCachedTZTimestampColByIdIdx( long TenantId,
		long Id );

	IYCFBamTZTimestampColObj readCachedTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByValTentIdx( long TenantId );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZTimestampColObj> readCachedTZTimestampColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTZTimestampColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZTimestampColByValTentIdx( long TenantId );

	void deepDisposeTZTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZTimestampColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimestampColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimestampColObj updateTZTimestampCol( IYCFBamTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimestampCol( IYCFBamTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamTZTimestampColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimestampColObj refreshed cache instance.
	 */
	IYCFBamTZTimestampColObj moveUpTZTimestampCol( IYCFBamTZTimestampColObj Obj );

	/**
	 *	Move the YCFBamTZTimestampColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimestampColObj refreshed cache instance.
	 */
	IYCFBamTZTimestampColObj moveDownTZTimestampCol( IYCFBamTZTimestampColObj Obj );
}
