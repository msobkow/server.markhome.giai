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

public interface IYCFBamUInt16ColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UInt16Col instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamUInt16ColObj newInstance();

	/**
	 *	Instantiate a new UInt16Col edition of the specified UInt16Col instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamUInt16ColEditObj newEditInstance( IYCFBamUInt16ColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamUInt16ColObj realiseUInt16Col( IYCFBamUInt16ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamUInt16ColObj createUInt16Col( IYCFBamUInt16ColObj Obj );

	/**
	 *	Read a UInt16Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt16Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUInt16ColObj readUInt16Col( YCFBamValuePKey pkey );

	/**
	 *	Read a UInt16Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt16Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUInt16ColObj readUInt16Col( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamUInt16ColObj readCachedUInt16Col( YCFBamValuePKey pkey );

	public void reallyDeepDisposeUInt16Col( IYCFBamUInt16ColObj obj );

	void deepDisposeUInt16Col( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamUInt16ColObj lockUInt16Col( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UInt16Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUInt16ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUInt16ColObj> readAllUInt16Col();

	/**
	 *	Return a sorted map of all the UInt16Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUInt16ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUInt16ColObj> readAllUInt16Col( boolean forceRead );

	List<IYCFBamUInt16ColObj> readCachedAllUInt16Col();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUInt16ColObj readUInt16ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUInt16ColObj readUInt16ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUInt16ColObj readUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUInt16ColObj readUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamUInt16ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt16ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt16ColObj> readUInt16ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamUInt16ColObj readCachedUInt16ColByIdIdx( long TenantId,
		long Id );

	IYCFBamUInt16ColObj readCachedUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByValTentIdx( long TenantId );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUInt16ColObj> readCachedUInt16ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeUInt16ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUInt16ColByValTentIdx( long TenantId );

	void deepDisposeUInt16ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUInt16ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUInt16ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUInt16ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUInt16ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamUInt16ColObj updateUInt16Col( IYCFBamUInt16ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt16Col( IYCFBamUInt16ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt16Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UInt16Col key attribute of the instance generating the id.
	 */
	void deleteUInt16ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamUInt16ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUInt16ColObj refreshed cache instance.
	 */
	IYCFBamUInt16ColObj moveUpUInt16Col( IYCFBamUInt16ColObj Obj );

	/**
	 *	Move the YCFBamUInt16ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUInt16ColObj refreshed cache instance.
	 */
	IYCFBamUInt16ColObj moveDownUInt16Col( IYCFBamUInt16ColObj Obj );
}
