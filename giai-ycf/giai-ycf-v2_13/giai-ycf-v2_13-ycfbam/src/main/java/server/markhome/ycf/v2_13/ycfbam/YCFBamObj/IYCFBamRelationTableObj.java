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

public interface ICFBamRelationTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Relation instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamRelationObj newInstance();

	/**
	 *	Instantiate a new Relation edition of the specified Relation instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamRelationEditObj newEditInstance( ICFBamRelationObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamRelationObj realiseRelation( ICFBamRelationObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamRelationObj createRelation( ICFBamRelationObj Obj );

	/**
	 *	Read a Relation-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Relation-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamRelationObj readRelation( CFBamScopePKey pkey );

	/**
	 *	Read a Relation-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Relation-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamRelationObj readRelation( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamRelationObj readCachedRelation( CFBamScopePKey pkey );

	public void reallyDeepDisposeRelation( ICFBamRelationObj obj );

	void deepDisposeRelation( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamRelationObj lockRelation( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the Relation-derived instances in the database.
	 *
	 *	@return	List of ICFBamRelationObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamRelationObj> readAllRelation();

	/**
	 *	Return a sorted map of all the Relation-derived instances in the database.
	 *
	 *	@return	List of ICFBamRelationObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamRelationObj> readAllRelation( boolean forceRead );

	List<ICFBamRelationObj> readCachedAllRelation();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamRelationObj readRelationByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamRelationObj readRelationByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the CFBamRelationObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRelationObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamRelationObj readRelationByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the CFBamRelationObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRelationObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamRelationObj readRelationByUNameIdx(long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate RelnTenantIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate RelnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByRelnTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate RelnTenantIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate RelnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByRelnTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate RelTableIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate RelTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByRelTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate RelTableIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate RelTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByRelTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate TableCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate TableCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate TableCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate TableCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate FromKeyIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate FromKeyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByFromKeyIdx( long TenantId,
		long FromIndexId );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate FromKeyIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate FromKeyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByFromKeyIdx( long TenantId,
		long FromIndexId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate ToTblIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate ToTblIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByToTblIdx( long TenantId,
		long ToTableId );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate ToTblIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate ToTblIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByToTblIdx( long TenantId,
		long ToTableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate ToKeyIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate ToKeyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByToKeyIdx( long TenantId,
		long ToIndexId );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate ToKeyIdx key.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate ToKeyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByToKeyIdx( long TenantId,
		long ToIndexId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate NarrowedIdx key.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate NarrowedIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId );

	/**
	 *	Get the map of CFBamRelationObj instances sorted by their primary keys for the duplicate NarrowedIdx key.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationObj cached instances sorted by their primary keys for the duplicate NarrowedIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationObj> readRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId,
		boolean forceRead );

	ICFBamRelationObj readCachedRelationByIdIdx( long TenantId,
		long Id );

	List<ICFBamRelationObj> readCachedRelationByTenantIdx( long TenantId );

	ICFBamRelationObj readCachedRelationByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<ICFBamRelationObj> readCachedRelationByRelnTenantIdx( long TenantId );

	List<ICFBamRelationObj> readCachedRelationByRelTableIdx( long TenantId,
		long TableId );

	List<ICFBamRelationObj> readCachedRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamRelationObj> readCachedRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamRelationObj> readCachedRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamRelationObj> readCachedRelationByFromKeyIdx( long TenantId,
		long FromIndexId );

	List<ICFBamRelationObj> readCachedRelationByToTblIdx( long TenantId,
		long ToTableId );

	List<ICFBamRelationObj> readCachedRelationByToKeyIdx( long TenantId,
		long ToIndexId );

	List<ICFBamRelationObj> readCachedRelationByNarrowedIdx( Long NarrowedTenantId,
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

	void deepDisposeRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
	ICFBamRelationObj updateRelation( ICFBamRelationObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRelation( ICFBamRelationObj Obj );

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
	void deleteRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

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
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
