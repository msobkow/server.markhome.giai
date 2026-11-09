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

public interface ICFBamServerProcTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ServerProc instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamServerProcObj newInstance();

	/**
	 *	Instantiate a new ServerProc edition of the specified ServerProc instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamServerProcEditObj newEditInstance( ICFBamServerProcObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamServerProcObj realiseServerProc( ICFBamServerProcObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamServerProcObj createServerProc( ICFBamServerProcObj Obj );

	/**
	 *	Read a ServerProc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerProc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamServerProcObj readServerProc( CFBamScopePKey pkey );

	/**
	 *	Read a ServerProc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerProc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamServerProcObj readServerProc( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamServerProcObj readCachedServerProc( CFBamScopePKey pkey );

	public void reallyDeepDisposeServerProc( ICFBamServerProcObj obj );

	void deepDisposeServerProc( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamServerProcObj lockServerProc( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ServerProc-derived instances in the database.
	 *
	 *	@return	List of ICFBamServerProcObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamServerProcObj> readAllServerProc();

	/**
	 *	Return a sorted map of all the ServerProc-derived instances in the database.
	 *
	 *	@return	List of ICFBamServerProcObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamServerProcObj> readAllServerProc( boolean forceRead );

	List<ICFBamServerProcObj> readCachedAllServerProc();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerProcObj readServerProcByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerProcObj readServerProcByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamServerProcObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the CFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerProcObj readServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the CFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerProcObj readServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByMethTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamServerProcObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamServerProcObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamServerProcObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamServerProcObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerProcObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerProcObj> readServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	ICFBamServerProcObj readCachedServerProcByIdIdx( long TenantId,
		long Id );

	List<ICFBamServerProcObj> readCachedServerProcByTenantIdx( long TenantId );

	ICFBamServerProcObj readCachedServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<ICFBamServerProcObj> readCachedServerProcByMethTableIdx( long TenantId,
		long TableId );

	List<ICFBamServerProcObj> readCachedServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamServerProcObj> readCachedServerProcByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamServerProcObj> readCachedServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeServerProcByIdIdx( long TenantId,
		long Id );

	void deepDisposeServerProcByTenantIdx( long TenantId );

	void deepDisposeServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name );

	void deepDisposeServerProcByMethTableIdx( long TenantId,
		long TableId );

	void deepDisposeServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerProcByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamServerProcObj updateServerProc( ICFBamServerProcObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerProc( ICFBamServerProcObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByMethTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );
}
