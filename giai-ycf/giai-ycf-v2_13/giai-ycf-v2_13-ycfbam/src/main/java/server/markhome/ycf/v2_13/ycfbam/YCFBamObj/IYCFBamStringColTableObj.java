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

public interface IYCFBamStringColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new StringCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamStringColObj newInstance();

	/**
	 *	Instantiate a new StringCol edition of the specified StringCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamStringColEditObj newEditInstance( IYCFBamStringColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamStringColObj realiseStringCol( IYCFBamStringColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamStringColObj createStringCol( IYCFBamStringColObj Obj );

	/**
	 *	Read a StringCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamStringColObj readStringCol( YCFBamValuePKey pkey );

	/**
	 *	Read a StringCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamStringColObj readStringCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamStringColObj readCachedStringCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeStringCol( IYCFBamStringColObj obj );

	void deepDisposeStringCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamStringColObj lockStringCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the StringCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamStringColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamStringColObj> readAllStringCol();

	/**
	 *	Return a sorted map of all the StringCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamStringColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamStringColObj> readAllStringCol( boolean forceRead );

	List<IYCFBamStringColObj> readCachedAllStringCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamStringColObj readStringColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamStringColObj readStringColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamStringColObj readStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamStringColObj readStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamStringColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringColObj> readStringColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamStringColObj readCachedStringColByIdIdx( long TenantId,
		long Id );

	IYCFBamStringColObj readCachedStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamStringColObj> readCachedStringColByValTentIdx( long TenantId );

	List<IYCFBamStringColObj> readCachedStringColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamStringColObj> readCachedStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamStringColObj> readCachedStringColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamStringColObj> readCachedStringColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamStringColObj> readCachedStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamStringColObj> readCachedStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamStringColObj> readCachedStringColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamStringColObj> readCachedStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamStringColObj> readCachedStringColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeStringColByIdIdx( long TenantId,
		long Id );

	void deepDisposeStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeStringColByValTentIdx( long TenantId );

	void deepDisposeStringColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeStringColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeStringColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeStringColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeStringColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamStringColObj updateStringCol( IYCFBamStringColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteStringCol( IYCFBamStringColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamStringColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamStringColObj refreshed cache instance.
	 */
	IYCFBamStringColObj moveUpStringCol( IYCFBamStringColObj Obj );

	/**
	 *	Move the YCFBamStringColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamStringColObj refreshed cache instance.
	 */
	IYCFBamStringColObj moveDownStringCol( IYCFBamStringColObj Obj );
}
