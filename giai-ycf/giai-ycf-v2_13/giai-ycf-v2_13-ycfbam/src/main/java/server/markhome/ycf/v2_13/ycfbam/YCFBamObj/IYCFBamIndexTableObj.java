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

public interface ICFBamIndexTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Index instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamIndexObj newInstance();

	/**
	 *	Instantiate a new Index edition of the specified Index instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamIndexEditObj newEditInstance( ICFBamIndexObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexObj realiseIndex( ICFBamIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexObj createIndex( ICFBamIndexObj Obj );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamIndexObj readIndex( CFBamScopePKey pkey );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamIndexObj readIndex( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamIndexObj readCachedIndex( CFBamScopePKey pkey );

	public void reallyDeepDisposeIndex( ICFBamIndexObj obj );

	void deepDisposeIndex( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexObj lockIndex( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the Index-derived instances in the database.
	 *
	 *	@return	List of ICFBamIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamIndexObj> readAllIndex();

	/**
	 *	Return a sorted map of all the Index-derived instances in the database.
	 *
	 *	@return	List of ICFBamIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamIndexObj> readAllIndex( boolean forceRead );

	List<ICFBamIndexObj> readCachedAllIndex();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the CFBamIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamIndexObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexObj readIndexByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the CFBamIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamIndexObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexObj readIndexByUNameIdx(long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate IndexTenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate IndexTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByIndexTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate IndexTenantIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate IndexTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByIndexTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate TableCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate TableCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate TableCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate TableCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamIndexObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	ICFBamIndexObj readCachedIndexByIdIdx( long TenantId,
		long Id );

	List<ICFBamIndexObj> readCachedIndexByTenantIdx( long TenantId );

	ICFBamIndexObj readCachedIndexByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<ICFBamIndexObj> readCachedIndexByIndexTenantIdx( long TenantId );

	List<ICFBamIndexObj> readCachedIndexByIdxTableIdx( long TenantId,
		long TableId );

	List<ICFBamIndexObj> readCachedIndexByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamIndexObj> readCachedIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamIndexObj> readCachedIndexByDefSchemaIdx( Long DefSchemaTenantId,
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

	void deepDisposeIndexByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexObj updateIndex( ICFBamIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndex( ICFBamIndexObj Obj );

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
	void deleteIndexByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

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
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
