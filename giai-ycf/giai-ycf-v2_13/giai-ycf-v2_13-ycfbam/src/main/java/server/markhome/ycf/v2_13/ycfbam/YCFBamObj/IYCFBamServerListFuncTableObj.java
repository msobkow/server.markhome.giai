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

public interface IYCFBamServerListFuncTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ServerListFunc instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamServerListFuncObj newInstance();

	/**
	 *	Instantiate a new ServerListFunc edition of the specified ServerListFunc instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamServerListFuncEditObj newEditInstance( IYCFBamServerListFuncObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamServerListFuncObj realiseServerListFunc( IYCFBamServerListFuncObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamServerListFuncObj createServerListFunc( IYCFBamServerListFuncObj Obj );

	/**
	 *	Read a ServerListFunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerListFunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamServerListFuncObj readServerListFunc( YCFBamScopePKey pkey );

	/**
	 *	Read a ServerListFunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerListFunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamServerListFuncObj readServerListFunc( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamServerListFuncObj readCachedServerListFunc( YCFBamScopePKey pkey );

	public void reallyDeepDisposeServerListFunc( IYCFBamServerListFuncObj obj );

	void deepDisposeServerListFunc( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamServerListFuncObj lockServerListFunc( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ServerListFunc-derived instances in the database.
	 *
	 *	@return	List of IYCFBamServerListFuncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamServerListFuncObj> readAllServerListFunc();

	/**
	 *	Return a sorted map of all the ServerListFunc-derived instances in the database.
	 *
	 *	@return	List of IYCFBamServerListFuncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamServerListFuncObj> readAllServerListFunc( boolean forceRead );

	List<IYCFBamServerListFuncObj> readCachedAllServerListFunc();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamServerListFuncObj readServerListFuncByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamServerListFuncObj readServerListFuncByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamServerListFuncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the YCFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamServerListFuncObj readServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the YCFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamServerListFuncObj readServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByMethTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamServerListFuncObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamServerListFuncObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamServerListFuncObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamServerListFuncObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamServerListFuncObj instances sorted by their primary keys for the duplicate RetTblIdx key.
	 *
	 *	@param	argRetTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argRetTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate RetTblIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId );

	/**
	 *	Get the map of YCFBamServerListFuncObj instances sorted by their primary keys for the duplicate RetTblIdx key.
	 *
	 *	@param	argRetTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argRetTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate RetTblIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerListFuncObj> readServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId,
		boolean forceRead );

	IYCFBamServerListFuncObj readCachedServerListFuncByIdIdx( long TenantId,
		long Id );

	List<IYCFBamServerListFuncObj> readCachedServerListFuncByTenantIdx( long TenantId );

	IYCFBamServerListFuncObj readCachedServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<IYCFBamServerListFuncObj> readCachedServerListFuncByMethTableIdx( long TenantId,
		long TableId );

	List<IYCFBamServerListFuncObj> readCachedServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamServerListFuncObj> readCachedServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamServerListFuncObj> readCachedServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamServerListFuncObj> readCachedServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId );

	void deepDisposeServerListFuncByIdIdx( long TenantId,
		long Id );

	void deepDisposeServerListFuncByTenantIdx( long TenantId );

	void deepDisposeServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name );

	void deepDisposeServerListFuncByMethTableIdx( long TenantId,
		long TableId );

	void deepDisposeServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamServerListFuncObj updateServerListFunc( IYCFBamServerListFuncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerListFunc( IYCFBamServerListFuncObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByMethTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRetTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argRetTableId	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId );
}
