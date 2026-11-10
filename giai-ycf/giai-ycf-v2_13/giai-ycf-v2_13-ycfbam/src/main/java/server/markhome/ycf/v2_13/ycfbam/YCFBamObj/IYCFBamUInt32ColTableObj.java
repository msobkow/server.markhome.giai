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

public interface IYCFBamUInt32ColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UInt32Col instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamUInt32ColObj newInstance();

	/**
	 *	Instantiate a new UInt32Col edition of the specified UInt32Col instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamUInt32ColEditObj newEditInstance( IYCFBamUInt32ColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamUInt32ColObj realiseUInt32Col( IYCFBamUInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamUInt32ColObj createUInt32Col( IYCFBamUInt32ColObj Obj );

	/**
	 *	Read a UInt32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUInt32ColObj readUInt32Col( YCFBamValuePKey pkey );

	/**
	 *	Read a UInt32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUInt32ColObj readUInt32Col( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamUInt32ColObj readCachedUInt32Col( YCFBamValuePKey pkey );

	public void reallyDeepDisposeUInt32Col( IYCFBamUInt32ColObj obj );

	void deepDisposeUInt32Col( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamUInt32ColObj lockUInt32Col( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UInt32Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUInt32ColObj> readAllUInt32Col();

	/**
	 *	Return a sorted map of all the UInt32Col-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUInt32ColObj> readAllUInt32Col( boolean forceRead );

	List<IYCFBamUInt32ColObj> readCachedAllUInt32Col();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUInt32ColObj readUInt32ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUInt32ColObj readUInt32ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUInt32ColObj readUInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUInt32ColObj readUInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamUInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUInt32ColObj> readUInt32ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamUInt32ColObj readCachedUInt32ColByIdIdx( long TenantId,
		long Id );

	IYCFBamUInt32ColObj readCachedUInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByValTentIdx( long TenantId );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUInt32ColObj> readCachedUInt32ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeUInt32ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeUInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUInt32ColByValTentIdx( long TenantId );

	void deepDisposeUInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUInt32ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUInt32ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamUInt32ColObj updateUInt32Col( IYCFBamUInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt32Col( IYCFBamUInt32ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamUInt32ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUInt32ColObj refreshed cache instance.
	 */
	IYCFBamUInt32ColObj moveUpUInt32Col( IYCFBamUInt32ColObj Obj );

	/**
	 *	Move the YCFBamUInt32ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUInt32ColObj refreshed cache instance.
	 */
	IYCFBamUInt32ColObj moveDownUInt32Col( IYCFBamUInt32ColObj Obj );
}
