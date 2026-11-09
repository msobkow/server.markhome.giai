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

public interface ICFBamServerMethodTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ServerMethod instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamServerMethodObj newInstance();

	/**
	 *	Instantiate a new ServerMethod edition of the specified ServerMethod instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamServerMethodEditObj newEditInstance( ICFBamServerMethodObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamServerMethodObj realiseServerMethod( ICFBamServerMethodObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamServerMethodObj createServerMethod( ICFBamServerMethodObj Obj );

	/**
	 *	Read a ServerMethod-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerMethod-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamServerMethodObj readServerMethod( CFBamScopePKey pkey );

	/**
	 *	Read a ServerMethod-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerMethod-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamServerMethodObj readServerMethod( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamServerMethodObj readCachedServerMethod( CFBamScopePKey pkey );

	public void reallyDeepDisposeServerMethod( ICFBamServerMethodObj obj );

	void deepDisposeServerMethod( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamServerMethodObj lockServerMethod( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ServerMethod-derived instances in the database.
	 *
	 *	@return	List of ICFBamServerMethodObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamServerMethodObj> readAllServerMethod();

	/**
	 *	Return a sorted map of all the ServerMethod-derived instances in the database.
	 *
	 *	@return	List of ICFBamServerMethodObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamServerMethodObj> readAllServerMethod( boolean forceRead );

	List<ICFBamServerMethodObj> readCachedAllServerMethod();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerMethodObj readServerMethodByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerMethodObj readServerMethodByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the CFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	CFBamServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerMethodObj readServerMethodByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the CFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	CFBamServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamServerMethodObj readServerMethodByUNameIdx(long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByMethTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamServerMethodObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamServerMethodObj> readServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	ICFBamServerMethodObj readCachedServerMethodByIdIdx( long TenantId,
		long Id );

	List<ICFBamServerMethodObj> readCachedServerMethodByTenantIdx( long TenantId );

	ICFBamServerMethodObj readCachedServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<ICFBamServerMethodObj> readCachedServerMethodByMethTableIdx( long TenantId,
		long TableId );

	List<ICFBamServerMethodObj> readCachedServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamServerMethodObj> readCachedServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamServerMethodObj> readCachedServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeServerMethodByIdIdx( long TenantId,
		long Id );

	void deepDisposeServerMethodByTenantIdx( long TenantId );

	void deepDisposeServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name );

	void deepDisposeServerMethodByMethTableIdx( long TenantId,
		long TableId );

	void deepDisposeServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamServerMethodObj updateServerMethod( ICFBamServerMethodObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerMethod( ICFBamServerMethodObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );
}
