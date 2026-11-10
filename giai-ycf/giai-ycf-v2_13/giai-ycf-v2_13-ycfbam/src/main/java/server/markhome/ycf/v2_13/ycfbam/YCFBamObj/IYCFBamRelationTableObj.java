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

public interface IYCFBamRelationTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Relation instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamRelationObj newInstance();

	/**
	 *	Instantiate a new Relation edition of the specified Relation instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamRelationEditObj newEditInstance( IYCFBamRelationObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamRelationObj realiseRelation( IYCFBamRelationObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamRelationObj createRelation( IYCFBamRelationObj Obj );

	/**
	 *	Read a Relation-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Relation-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamRelationObj readRelation( YCFBamScopePKey pkey );

	/**
	 *	Read a Relation-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Relation-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamRelationObj readRelation( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamRelationObj readCachedRelation( YCFBamScopePKey pkey );

	public void reallyDeepDisposeRelation( IYCFBamRelationObj obj );

	void deepDisposeRelation( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamRelationObj lockRelation( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the Relation-derived instances in the database.
	 *
	 *	@return	List of IYCFBamRelationObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamRelationObj> readAllRelation();

	/**
	 *	Return a sorted map of all the Relation-derived instances in the database.
	 *
	 *	@return	List of IYCFBamRelationObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamRelationObj> readAllRelation( boolean forceRead );

	List<IYCFBamRelationObj> readCachedAllRelation();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRelationObj readRelationByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRelationObj readRelationByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the YCFBamRelationObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamRelationObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRelationObj readRelationByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the YCFBamRelationObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamRelationObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamRelationObj readRelationByUNameIdx(long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate RelnTenantIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate RelnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByRelnTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate RelnTenantIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate RelnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByRelnTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate RelTableIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate RelTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByRelTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate RelTableIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate RelTableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByRelTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate TableCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate TableCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate TableCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate TableCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate FromKeyIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate FromKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByFromKeyIdx( long TenantId,
		long FromIndexId );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate FromKeyIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate FromKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByFromKeyIdx( long TenantId,
		long FromIndexId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate ToTblIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate ToTblIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByToTblIdx( long TenantId,
		long ToTableId );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate ToTblIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate ToTblIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByToTblIdx( long TenantId,
		long ToTableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate ToKeyIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate ToKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByToKeyIdx( long TenantId,
		long ToIndexId );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate ToKeyIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate ToKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByToKeyIdx( long TenantId,
		long ToIndexId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate NarrowedIdx key.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate NarrowedIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId );

	/**
	 *	Get the map of YCFBamRelationObj instances sorted by their primary keys for the duplicate NarrowedIdx key.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamRelationObj cached instances sorted by their primary keys for the duplicate NarrowedIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamRelationObj> readRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId,
		boolean forceRead );

	IYCFBamRelationObj readCachedRelationByIdIdx( long TenantId,
		long Id );

	List<IYCFBamRelationObj> readCachedRelationByTenantIdx( long TenantId );

	IYCFBamRelationObj readCachedRelationByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<IYCFBamRelationObj> readCachedRelationByRelnTenantIdx( long TenantId );

	List<IYCFBamRelationObj> readCachedRelationByRelTableIdx( long TenantId,
		long TableId );

	List<IYCFBamRelationObj> readCachedRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamRelationObj> readCachedRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamRelationObj> readCachedRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamRelationObj> readCachedRelationByFromKeyIdx( long TenantId,
		long FromIndexId );

	List<IYCFBamRelationObj> readCachedRelationByToTblIdx( long TenantId,
		long ToTableId );

	List<IYCFBamRelationObj> readCachedRelationByToKeyIdx( long TenantId,
		long ToIndexId );

	List<IYCFBamRelationObj> readCachedRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId );

	void deepDisposeRelationByIdIdx( long TenantId,
		long Id );

	void deepDisposeRelationByTenantIdx( long TenantId );

	void deepDisposeRelationByUNameIdx( long TenantId,
		long TableId,
		String Name );

	void deepDisposeRelationByRelnTenantIdx( long TenantId );

	void deepDisposeRelationByRelTableIdx( long TenantId,
		long TableId );

	void deepDisposeRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeRelationByFromKeyIdx( long TenantId,
		long FromIndexId );

	void deepDisposeRelationByToTblIdx( long TenantId,
		long ToTableId );

	void deepDisposeRelationByToKeyIdx( long TenantId,
		long ToIndexId );

	void deepDisposeRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId );

	/**
	 *	Internal use only.
	 */
	IYCFBamRelationObj updateRelation( IYCFBamRelationObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRelation( IYCFBamRelationObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelnTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByFromKeyIdx( long TenantId,
		long FromIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToTblIdx( long TenantId,
		long ToTableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToKeyIdx( long TenantId,
		long ToIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId );
}
