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

public interface IYCFBamTZTimeColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZTimeCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTZTimeColObj newInstance();

	/**
	 *	Instantiate a new TZTimeCol edition of the specified TZTimeCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTZTimeColEditObj newEditInstance( IYCFBamTZTimeColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimeColObj realiseTZTimeCol( IYCFBamTZTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimeColObj createTZTimeCol( IYCFBamTZTimeColObj Obj );

	/**
	 *	Read a TZTimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZTimeColObj readTZTimeCol( YCFBamValuePKey pkey );

	/**
	 *	Read a TZTimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZTimeColObj readTZTimeCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTZTimeColObj readCachedTZTimeCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTZTimeCol( IYCFBamTZTimeColObj obj );

	void deepDisposeTZTimeCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimeColObj lockTZTimeCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZTimeCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZTimeColObj> readAllTZTimeCol();

	/**
	 *	Return a sorted map of all the TZTimeCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZTimeColObj> readAllTZTimeCol( boolean forceRead );

	List<IYCFBamTZTimeColObj> readCachedAllTZTimeCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimeColObj readTZTimeColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimeColObj readTZTimeColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimeColObj readTZTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimeColObj readTZTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamTZTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeColObj> readTZTimeColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamTZTimeColObj readCachedTZTimeColByIdIdx( long TenantId,
		long Id );

	IYCFBamTZTimeColObj readCachedTZTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByValTentIdx( long TenantId );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZTimeColObj> readCachedTZTimeColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTZTimeColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZTimeColByValTentIdx( long TenantId );

	void deepDisposeTZTimeColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimeColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimeColObj updateTZTimeCol( IYCFBamTZTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimeCol( IYCFBamTZTimeColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamTZTimeColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimeColObj refreshed cache instance.
	 */
	IYCFBamTZTimeColObj moveUpTZTimeCol( IYCFBamTZTimeColObj Obj );

	/**
	 *	Move the YCFBamTZTimeColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimeColObj refreshed cache instance.
	 */
	IYCFBamTZTimeColObj moveDownTZTimeCol( IYCFBamTZTimeColObj Obj );
}
