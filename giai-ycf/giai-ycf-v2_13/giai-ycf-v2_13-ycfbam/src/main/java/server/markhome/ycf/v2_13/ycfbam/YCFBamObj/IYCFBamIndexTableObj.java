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

public interface IYCFBamIndexTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Index instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamIndexObj newInstance();

	/**
	 *	Instantiate a new Index edition of the specified Index instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamIndexEditObj newEditInstance( IYCFBamIndexObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamIndexObj realiseIndex( IYCFBamIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamIndexObj createIndex( IYCFBamIndexObj Obj );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamIndexObj readIndex( YCFBamScopePKey pkey );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamIndexObj readIndex( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamIndexObj readCachedIndex( YCFBamScopePKey pkey );

	public void reallyDeepDisposeIndex( IYCFBamIndexObj obj );

	void deepDisposeIndex( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamIndexObj lockIndex( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the Index-derived instances in the database.
	 *
	 *	@return	List of IYCFBamIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamIndexObj> readAllIndex();

	/**
	 *	Return a sorted map of all the Index-derived instances in the database.
	 *
	 *	@return	List of IYCFBamIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamIndexObj> readAllIndex( boolean forceRead );

	List<IYCFBamIndexObj> readCachedAllIndex();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the YCFBamIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Index key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamIndexObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamIndexObj readIndexByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the YCFBamIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Index key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamIndexObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamIndexObj readIndexByUNameIdx(long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate IndexTenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate IndexTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByIndexTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate IndexTenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate IndexTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByIndexTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate TableCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate TableCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate TableCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate TableCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamIndexObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	IYCFBamIndexObj readCachedIndexByIdIdx( long TenantId,
		long Id );

	List<IYCFBamIndexObj> readCachedIndexByTenantIdx( long TenantId );

	IYCFBamIndexObj readCachedIndexByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<IYCFBamIndexObj> readCachedIndexByIndexTenantIdx( long TenantId );

	List<IYCFBamIndexObj> readCachedIndexByIdxTableIdx( long TenantId,
		long TableId );

	List<IYCFBamIndexObj> readCachedIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamIndexObj> readCachedIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamIndexObj> readCachedIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeIndexByIdIdx( long TenantId,
		long Id );

	void deepDisposeIndexByTenantIdx( long TenantId );

	void deepDisposeIndexByUNameIdx( long TenantId,
		long TableId,
		String Name );

	void deepDisposeIndexByIndexTenantIdx( long TenantId );

	void deepDisposeIndexByIdxTableIdx( long TenantId,
		long TableId );

	void deepDisposeIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	IYCFBamIndexObj updateIndex( IYCFBamIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndex( IYCFBamIndexObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIndexTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdxTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );
}
