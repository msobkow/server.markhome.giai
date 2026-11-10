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

public interface IYCFBamUuid6DefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Uuid6Def instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamUuid6DefObj newInstance();

	/**
	 *	Instantiate a new Uuid6Def edition of the specified Uuid6Def instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamUuid6DefEditObj newEditInstance( IYCFBamUuid6DefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6DefObj realiseUuid6Def( IYCFBamUuid6DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6DefObj createUuid6Def( IYCFBamUuid6DefObj Obj );

	/**
	 *	Read a Uuid6Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuid6DefObj readUuid6Def( YCFBamValuePKey pkey );

	/**
	 *	Read a Uuid6Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuid6DefObj readUuid6Def( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamUuid6DefObj readCachedUuid6Def( YCFBamValuePKey pkey );

	public void reallyDeepDisposeUuid6Def( IYCFBamUuid6DefObj obj );

	void deepDisposeUuid6Def( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6DefObj lockUuid6Def( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Uuid6Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuid6DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuid6DefObj> readAllUuid6Def();

	/**
	 *	Return a sorted map of all the Uuid6Def-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuid6DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuid6DefObj> readAllUuid6Def( boolean forceRead );

	List<IYCFBamUuid6DefObj> readCachedAllUuid6Def();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6DefObj readUuid6DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6DefObj readUuid6DefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6DefObj readUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6DefObj readUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamUuid6DefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamUuid6DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamUuid6DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuid6DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuid6DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuid6DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuid6DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuid6DefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuid6DefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6DefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6DefObj> readUuid6DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamUuid6DefObj readCachedUuid6DefByIdIdx( long TenantId,
		long Id );

	IYCFBamUuid6DefObj readCachedUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamUuid6DefObj> readCachedUuid6DefByValTentIdx( long TenantId );

	List<IYCFBamUuid6DefObj> readCachedUuid6DefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamUuid6DefObj> readCachedUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamUuid6DefObj> readCachedUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamUuid6DefObj> readCachedUuid6DefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamUuid6DefObj> readCachedUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamUuid6DefObj> readCachedUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamUuid6DefObj> readCachedUuid6DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuid6DefObj> readCachedUuid6DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuid6DefByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuid6DefByValTentIdx( long TenantId );

	void deepDisposeUuid6DefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuid6DefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuid6DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuid6DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6DefObj updateUuid6Def( IYCFBamUuid6DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuid6Def( IYCFBamUuid6DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Def key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Def key attribute of the instance generating the id.
	 */
	void deleteUuid6DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamUuid6DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuid6DefObj refreshed cache instance.
	 */
	IYCFBamUuid6DefObj moveUpUuid6Def( IYCFBamUuid6DefObj Obj );

	/**
	 *	Move the YCFBamUuid6DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuid6DefObj refreshed cache instance.
	 */
	IYCFBamUuid6DefObj moveDownUuid6Def( IYCFBamUuid6DefObj Obj );
}
