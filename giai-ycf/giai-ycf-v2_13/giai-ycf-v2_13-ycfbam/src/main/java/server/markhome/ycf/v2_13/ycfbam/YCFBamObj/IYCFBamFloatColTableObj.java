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

public interface IYCFBamFloatColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new FloatCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamFloatColObj newInstance();

	/**
	 *	Instantiate a new FloatCol edition of the specified FloatCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamFloatColEditObj newEditInstance( IYCFBamFloatColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatColObj realiseFloatCol( IYCFBamFloatColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatColObj createFloatCol( IYCFBamFloatColObj Obj );

	/**
	 *	Read a FloatCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamFloatColObj readFloatCol( YCFBamValuePKey pkey );

	/**
	 *	Read a FloatCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamFloatColObj readFloatCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamFloatColObj readCachedFloatCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeFloatCol( IYCFBamFloatColObj obj );

	void deepDisposeFloatCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatColObj lockFloatCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the FloatCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamFloatColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamFloatColObj> readAllFloatCol();

	/**
	 *	Return a sorted map of all the FloatCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamFloatColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamFloatColObj> readAllFloatCol( boolean forceRead );

	List<IYCFBamFloatColObj> readCachedAllFloatCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatColObj readFloatColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatColObj readFloatColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatColObj readFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatColObj readFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamFloatColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatColObj> readFloatColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamFloatColObj readCachedFloatColByIdIdx( long TenantId,
		long Id );

	IYCFBamFloatColObj readCachedFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamFloatColObj> readCachedFloatColByValTentIdx( long TenantId );

	List<IYCFBamFloatColObj> readCachedFloatColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamFloatColObj> readCachedFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamFloatColObj> readCachedFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamFloatColObj> readCachedFloatColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamFloatColObj> readCachedFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamFloatColObj> readCachedFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamFloatColObj> readCachedFloatColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamFloatColObj> readCachedFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamFloatColObj> readCachedFloatColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeFloatColByIdIdx( long TenantId,
		long Id );

	void deepDisposeFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeFloatColByValTentIdx( long TenantId );

	void deepDisposeFloatColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeFloatColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeFloatColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatColObj updateFloatCol( IYCFBamFloatColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatCol( IYCFBamFloatColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamFloatColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamFloatColObj refreshed cache instance.
	 */
	IYCFBamFloatColObj moveUpFloatCol( IYCFBamFloatColObj Obj );

	/**
	 *	Move the YCFBamFloatColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamFloatColObj refreshed cache instance.
	 */
	IYCFBamFloatColObj moveDownFloatCol( IYCFBamFloatColObj Obj );
}
