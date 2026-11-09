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

public interface ICFBamDelTopDepTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DelTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDelTopDepObj newInstance();

	/**
	 *	Instantiate a new DelTopDep edition of the specified DelTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDelTopDepEditObj newEditInstance( ICFBamDelTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDelTopDepObj realiseDelTopDep( ICFBamDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDelTopDepObj createDelTopDep( ICFBamDelTopDepObj Obj );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDelTopDepObj readDelTopDep( CFBamScopePKey pkey );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDelTopDepObj readDelTopDep( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamDelTopDepObj readCachedDelTopDep( CFBamScopePKey pkey );

	public void reallyDeepDisposeDelTopDep( ICFBamDelTopDepObj obj );

	void deepDisposeDelTopDep( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDelTopDepObj lockDelTopDep( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDelTopDepObj> readAllDelTopDep();

	/**
	 *	Return a sorted map of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDelTopDepObj> readAllDelTopDep( boolean forceRead );

	List<ICFBamDelTopDepObj> readCachedAllDelTopDep();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelTopDepObj readDelTopDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelTopDepObj readDelTopDepByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamDelTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDelTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamDelTopDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelTopDepObj instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId );

	/**
	 *	Get the map of CFBamDelTopDepObj instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the CFBamDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamDelTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelTopDepObj readDelTopDepByUNameIdx(long TableTenantId,
		long TableId,
		String Name );

	/**
	 *	Get the CFBamDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamDelTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelTopDepObj readDelTopDepByUNameIdx(long TableTenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDelTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDelTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelTopDepObj> readDelTopDepByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	ICFBamDelTopDepObj readCachedDelTopDepByIdIdx( long TenantId,
		long Id );

	List<ICFBamDelTopDepObj> readCachedDelTopDepByTenantIdx( long TenantId );

	List<ICFBamDelTopDepObj> readCachedDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDelTopDepObj> readCachedDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	List<ICFBamDelTopDepObj> readCachedDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId );

	ICFBamDelTopDepObj readCachedDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name );

	List<ICFBamDelTopDepObj> readCachedDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDelTopDepObj> readCachedDelTopDepByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDelTopDepByIdIdx( long TenantId,
		long Id );

	void deepDisposeDelTopDepByTenantIdx( long TenantId );

	void deepDisposeDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	void deepDisposeDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId );

	void deepDisposeDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name );

	void deepDisposeDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDelTopDepByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamDelTopDepObj updateDelTopDep( ICFBamDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelTopDep( ICFBamDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByUNameIdx(long TableTenantId,
		long TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Move the CFBamDelTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDelTopDepObj refreshed cache instance.
	 */
	ICFBamDelTopDepObj moveUpDelTopDep( ICFBamDelTopDepObj Obj );

	/**
	 *	Move the CFBamDelTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDelTopDepObj refreshed cache instance.
	 */
	ICFBamDelTopDepObj moveDownDelTopDep( ICFBamDelTopDepObj Obj );
}
