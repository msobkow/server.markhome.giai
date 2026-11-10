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

public interface IYCFBamNmTokenColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NmTokenCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamNmTokenColObj newInstance();

	/**
	 *	Instantiate a new NmTokenCol edition of the specified NmTokenCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamNmTokenColEditObj newEditInstance( IYCFBamNmTokenColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenColObj realiseNmTokenCol( IYCFBamNmTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenColObj createNmTokenCol( IYCFBamNmTokenColObj Obj );

	/**
	 *	Read a NmTokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokenColObj readNmTokenCol( YCFBamValuePKey pkey );

	/**
	 *	Read a NmTokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNmTokenColObj readNmTokenCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamNmTokenColObj readCachedNmTokenCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeNmTokenCol( IYCFBamNmTokenColObj obj );

	void deepDisposeNmTokenCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenColObj lockNmTokenCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NmTokenCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokenColObj> readAllNmTokenCol();

	/**
	 *	Return a sorted map of all the NmTokenCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNmTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNmTokenColObj> readAllNmTokenCol( boolean forceRead );

	List<IYCFBamNmTokenColObj> readCachedAllNmTokenCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenColObj readNmTokenColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenColObj readNmTokenColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenColObj readNmTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNmTokenColObj readNmTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamNmTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNmTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNmTokenColObj> readNmTokenColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamNmTokenColObj readCachedNmTokenColByIdIdx( long TenantId,
		long Id );

	IYCFBamNmTokenColObj readCachedNmTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByValTentIdx( long TenantId );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNmTokenColObj> readCachedNmTokenColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeNmTokenColByIdIdx( long TenantId,
		long Id );

	void deepDisposeNmTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNmTokenColByValTentIdx( long TenantId );

	void deepDisposeNmTokenColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNmTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNmTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNmTokenColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNmTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNmTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNmTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNmTokenColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamNmTokenColObj updateNmTokenCol( IYCFBamNmTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokenCol( IYCFBamNmTokenColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamNmTokenColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokenColObj refreshed cache instance.
	 */
	IYCFBamNmTokenColObj moveUpNmTokenCol( IYCFBamNmTokenColObj Obj );

	/**
	 *	Move the YCFBamNmTokenColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokenColObj refreshed cache instance.
	 */
	IYCFBamNmTokenColObj moveDownNmTokenCol( IYCFBamNmTokenColObj Obj );
}
