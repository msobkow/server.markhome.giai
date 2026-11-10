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

public interface IYCFBamTimeColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TimeCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTimeColObj newInstance();

	/**
	 *	Instantiate a new TimeCol edition of the specified TimeCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTimeColEditObj newEditInstance( IYCFBamTimeColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeColObj realiseTimeCol( IYCFBamTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeColObj createTimeCol( IYCFBamTimeColObj Obj );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimeColObj readTimeCol( YCFBamValuePKey pkey );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTimeColObj readTimeCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTimeColObj readCachedTimeCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTimeCol( IYCFBamTimeColObj obj );

	void deepDisposeTimeCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeColObj lockTimeCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimeColObj> readAllTimeCol();

	/**
	 *	Return a sorted map of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTimeColObj> readAllTimeCol( boolean forceRead );

	List<IYCFBamTimeColObj> readCachedAllTimeCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeColObj readTimeColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeColObj readTimeColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeColObj readTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTimeColObj readTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTimeColObj> readTimeColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamTimeColObj readCachedTimeColByIdIdx( long TenantId,
		long Id );

	IYCFBamTimeColObj readCachedTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTimeColObj> readCachedTimeColByValTentIdx( long TenantId );

	List<IYCFBamTimeColObj> readCachedTimeColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTimeColObj> readCachedTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTimeColObj> readCachedTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTimeColObj> readCachedTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTimeColObj> readCachedTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTimeColObj> readCachedTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTimeColObj> readCachedTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTimeColObj> readCachedTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTimeColObj> readCachedTimeColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTimeColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTimeColByValTentIdx( long TenantId );

	void deepDisposeTimeColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTimeColObj updateTimeCol( IYCFBamTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeCol( IYCFBamTimeColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamTimeColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimeColObj refreshed cache instance.
	 */
	IYCFBamTimeColObj moveUpTimeCol( IYCFBamTimeColObj Obj );

	/**
	 *	Move the YCFBamTimeColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTimeColObj refreshed cache instance.
	 */
	IYCFBamTimeColObj moveDownTimeCol( IYCFBamTimeColObj Obj );
}
