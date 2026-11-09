// Description: Java 11 Table Object interface for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamServerListFuncTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ServerListFunc instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamServerListFuncObj newInstance();

	/**
	 *	Instantiate a new ServerListFunc edition of the specified ServerListFunc instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamServerListFuncEditObj newEditInstance( ICFBamServerListFuncObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamServerListFuncObj realiseServerListFunc( ICFBamServerListFuncObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamServerListFuncObj createServerListFunc( ICFBamServerListFuncObj Obj );

	/**
	 *	Read a ServerListFunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerListFunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamServerListFuncObj readServerListFunc( CFBamScopePKey pkey );

	/**
	 *	Read a ServerListFunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerListFunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamServerListFuncObj readServerListFunc( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamServerListFuncObj readCachedServerListFunc( CFBamScopePKey pkey );

	public void reallyDeepDisposeServerListFunc( ICFBamServerListFuncObj obj );

	void deepDisposeServerListFunc( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamServerListFuncObj lockServerListFunc( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ServerListFunc-derived instances in the database.
	 *
	 *	@return	List of ICFBamServerListFuncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamServerListFuncObj> readAllServerListFunc();

	/**
	 *	Return a sorted map of all the ServerListFunc-derived instances in the database.
	 *
	 *	@return	List of ICFBamServerListFuncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamServerListFuncObj> readAllServerListFunc( boolean forceRead );

	List<ICFBamServerListFuncObj> readCachedAllServerListFunc();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerListFuncObj readServerListFuncByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerListFuncObj readServerListFuncByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamServerListFuncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the CFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerListFuncObj readServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the CFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerListFuncObj readServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByMethTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamServerListFuncObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamServerListFuncObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamServerListFuncObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamServerListFuncObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerListFuncObj instances sorted by their primary keys for the duplicate RetTblIdx key.
	 *
	 *	@param	argRetTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argRetTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate RetTblIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId );

	/**
	 *	Get the map of CFBamServerListFuncObj instances sorted by their primary keys for the duplicate RetTblIdx key.
	 *
	 *	@param	argRetTenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	argRetTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerListFuncObj cached instances sorted by their primary keys for the duplicate RetTblIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerListFuncObj> readServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId,
		boolean forceRead );

	ICFBamServerListFuncObj readCachedServerListFuncByIdIdx( long TenantId,
		long Id );

	List<ICFBamServerListFuncObj> readCachedServerListFuncByTenantIdx( long TenantId );

	ICFBamServerListFuncObj readCachedServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<ICFBamServerListFuncObj> readCachedServerListFuncByMethTableIdx( long TenantId,
		long TableId );

	List<ICFBamServerListFuncObj> readCachedServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamServerListFuncObj> readCachedServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamServerListFuncObj> readCachedServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamServerListFuncObj> readCachedServerListFuncByRetTblIdx( Long RetTenantId,
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
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId );

	/**
	 *	Internal use only.
	 */
	ICFBamServerListFuncObj updateServerListFunc( ICFBamServerListFuncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerListFunc( ICFBamServerListFuncObj Obj );

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
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

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
