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

public interface IYCFBamUuid6ColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Uuid6Col instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamUuid6ColObj newInstance();

	/**
	 *	Instantiate a new Uuid6Col edition of the specified Uuid6Col instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamUuid6ColEditObj newEditInstance( IYCFBamUuid6ColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6ColObj realiseUuid6Col( IYCFBamUuid6ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6ColObj createUuid6Col( IYCFBamUuid6ColObj Obj );

	/**
	 *	Read a Uuid6Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuid6ColObj readUuid6Col( YCFBamValuePKey pkey );

	/**
	 *	Read a Uuid6Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuid6ColObj readUuid6Col( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamUuid6ColObj readCachedUuid6Col( YCFBamValuePKey pkey );

	public void reallyDeepDisposeUuid6Col( IYCFBamUuid6ColObj obj );

	void deepDisposeUuid6Col( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6ColObj lockUuid6Col( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Uuid6Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuid6ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuid6ColObj> readAllUuid6Col();

	/**
	 *	Return a sorted map of all the Uuid6Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuid6ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuid6ColObj> readAllUuid6Col( boolean forceRead );

	List<IYCFBamUuid6ColObj> readCachedAllUuid6Col();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6ColObj readUuid6ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6ColObj readUuid6ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6ColObj readUuid6ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuid6ColObj readUuid6ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamUuid6ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuid6ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuid6ColObj> readUuid6ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamUuid6ColObj readCachedUuid6ColByIdIdx( long TenantId,
		long Id );

	IYCFBamUuid6ColObj readCachedUuid6ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByValTentIdx( long TenantId );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuid6ColObj> readCachedUuid6ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeUuid6ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuid6ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuid6ColByValTentIdx( long TenantId );

	void deepDisposeUuid6ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuid6ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuid6ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuid6ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuid6ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuid6ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuid6ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuid6ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuid6ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuid6ColObj updateUuid6Col( IYCFBamUuid6ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuid6Col( IYCFBamUuid6ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamUuid6ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuid6ColObj refreshed cache instance.
	 */
	IYCFBamUuid6ColObj moveUpUuid6Col( IYCFBamUuid6ColObj Obj );

	/**
	 *	Move the YCFBamUuid6ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuid6ColObj refreshed cache instance.
	 */
	IYCFBamUuid6ColObj moveDownUuid6Col( IYCFBamUuid6ColObj Obj );
}
