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

public interface IYCFBamUuidColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UuidCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamUuidColObj newInstance();

	/**
	 *	Instantiate a new UuidCol edition of the specified UuidCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamUuidColEditObj newEditInstance( IYCFBamUuidColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidColObj realiseUuidCol( IYCFBamUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidColObj createUuidCol( IYCFBamUuidColObj Obj );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuidColObj readUuidCol( YCFBamValuePKey pkey );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuidColObj readUuidCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamUuidColObj readCachedUuidCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeUuidCol( IYCFBamUuidColObj obj );

	void deepDisposeUuidCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidColObj lockUuidCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuidColObj> readAllUuidCol();

	/**
	 *	Return a sorted map of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuidColObj> readAllUuidCol( boolean forceRead );

	List<IYCFBamUuidColObj> readCachedAllUuidCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidColObj readUuidColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidColObj readUuidColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidColObj readUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidColObj readUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamUuidColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidColObj> readUuidColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamUuidColObj readCachedUuidColByIdIdx( long TenantId,
		long Id );

	IYCFBamUuidColObj readCachedUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamUuidColObj> readCachedUuidColByValTentIdx( long TenantId );

	List<IYCFBamUuidColObj> readCachedUuidColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamUuidColObj> readCachedUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamUuidColObj> readCachedUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamUuidColObj> readCachedUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamUuidColObj> readCachedUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamUuidColObj> readCachedUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamUuidColObj> readCachedUuidColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuidColObj> readCachedUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuidColObj> readCachedUuidColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeUuidColByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuidColByValTentIdx( long TenantId );

	void deepDisposeUuidColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuidColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidColObj updateUuidCol( IYCFBamUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidCol( IYCFBamUuidColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamUuidColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuidColObj refreshed cache instance.
	 */
	IYCFBamUuidColObj moveUpUuidCol( IYCFBamUuidColObj Obj );

	/**
	 *	Move the YCFBamUuidColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuidColObj refreshed cache instance.
	 */
	IYCFBamUuidColObj moveDownUuidCol( IYCFBamUuidColObj Obj );
}
