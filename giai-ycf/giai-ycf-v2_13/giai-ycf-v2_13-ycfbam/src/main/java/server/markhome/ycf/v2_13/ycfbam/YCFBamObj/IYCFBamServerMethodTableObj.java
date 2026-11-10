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

public interface IYCFBamServerMethodTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ServerMethod instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamServerMethodObj newInstance();

	/**
	 *	Instantiate a new ServerMethod edition of the specified ServerMethod instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamServerMethodEditObj newEditInstance( IYCFBamServerMethodObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamServerMethodObj realiseServerMethod( IYCFBamServerMethodObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamServerMethodObj createServerMethod( IYCFBamServerMethodObj Obj );

	/**
	 *	Read a ServerMethod-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerMethod-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamServerMethodObj readServerMethod( YCFBamScopePKey pkey );

	/**
	 *	Read a ServerMethod-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerMethod-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamServerMethodObj readServerMethod( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamServerMethodObj readCachedServerMethod( YCFBamScopePKey pkey );

	public void reallyDeepDisposeServerMethod( IYCFBamServerMethodObj obj );

	void deepDisposeServerMethod( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamServerMethodObj lockServerMethod( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ServerMethod-derived instances in the database.
	 *
	 *	@return	List of IYCFBamServerMethodObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamServerMethodObj> readAllServerMethod();

	/**
	 *	Return a sorted map of all the ServerMethod-derived instances in the database.
	 *
	 *	@return	List of IYCFBamServerMethodObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamServerMethodObj> readAllServerMethod( boolean forceRead );

	List<IYCFBamServerMethodObj> readCachedAllServerMethod();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamServerMethodObj readServerMethodByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamServerMethodObj readServerMethodByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the YCFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamServerMethodObj readServerMethodByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the YCFBamServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamServerMethodObj readServerMethodByUNameIdx(long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByMethTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamServerMethodObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamServerMethodObj> readServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	IYCFBamServerMethodObj readCachedServerMethodByIdIdx( long TenantId,
		long Id );

	List<IYCFBamServerMethodObj> readCachedServerMethodByTenantIdx( long TenantId );

	IYCFBamServerMethodObj readCachedServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<IYCFBamServerMethodObj> readCachedServerMethodByMethTableIdx( long TenantId,
		long TableId );

	List<IYCFBamServerMethodObj> readCachedServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamServerMethodObj> readCachedServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamServerMethodObj> readCachedServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	IYCFBamServerMethodObj updateServerMethod( IYCFBamServerMethodObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerMethod( IYCFBamServerMethodObj Obj );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
