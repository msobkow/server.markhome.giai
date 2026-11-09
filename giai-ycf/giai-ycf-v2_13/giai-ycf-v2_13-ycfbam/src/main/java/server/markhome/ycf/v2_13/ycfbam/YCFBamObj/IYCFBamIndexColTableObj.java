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

public interface ICFBamIndexColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new IndexCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamIndexColObj newInstance();

	/**
	 *	Instantiate a new IndexCol edition of the specified IndexCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamIndexColEditObj newEditInstance( ICFBamIndexColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexColObj realiseIndexCol( ICFBamIndexColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexColObj createIndexCol( ICFBamIndexColObj Obj );

	/**
	 *	Read a IndexCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamIndexColObj readIndexCol( CFBamIndexColPKey pkey );

	/**
	 *	Read a IndexCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamIndexColObj readIndexCol( CFBamIndexColPKey pkey,
		boolean forceRead );

	ICFBamIndexColObj readCachedIndexCol( CFBamIndexColPKey pkey );

	public void reallyDeepDisposeIndexCol( ICFBamIndexColObj obj );

	void deepDisposeIndexCol( CFBamIndexColPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexColObj lockIndexCol( CFBamIndexColPKey pkey );

	/**
	 *	Return a sorted list of all the IndexCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamIndexColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamIndexColObj> readAllIndexCol();

	/**
	 *	Return a sorted map of all the IndexCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamIndexColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamIndexColObj> readAllIndexCol( boolean forceRead );

	List<ICFBamIndexColObj> readCachedAllIndexCol();

	/**
	 *	Get the CFBamIndexColObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamIndexColObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexColObj readIndexColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamIndexColObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamIndexColObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexColObj readIndexColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamIndexColObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamIndexColObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexColObj readIndexColByUNameIdx(long TenantId,
		long IndexId,
		String Name );

	/**
	 *	Get the CFBamIndexColObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamIndexColObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexColObj readIndexColByUNameIdx(long TenantId,
		long IndexId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate IdxColTenantIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxColTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByIdxColTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate IdxColTenantIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxColTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByIdxColTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByIndexIdx( long TenantId,
		long IndexId );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByIndexIdx( long TenantId,
		long IndexId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate ColIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate ColIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByColIdx( long TenantId,
		long ColumnId );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate ColIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate ColIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByColIdx( long TenantId,
		long ColumnId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate IdxPrevIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate IdxPrevIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate IdxNextIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId );

	/**
	 *	Get the map of CFBamIndexColObj instances sorted by their primary keys for the duplicate IdxNextIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexColObj> readIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId,
		boolean forceRead );

	ICFBamIndexColObj readCachedIndexColByIdIdx( long TenantId,
		long Id );

	ICFBamIndexColObj readCachedIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name );

	List<ICFBamIndexColObj> readCachedIndexColByIdxColTenantIdx( long TenantId );

	List<ICFBamIndexColObj> readCachedIndexColByIndexIdx( long TenantId,
		long IndexId );

	List<ICFBamIndexColObj> readCachedIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamIndexColObj> readCachedIndexColByColIdx( long TenantId,
		long ColumnId );

	List<ICFBamIndexColObj> readCachedIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamIndexColObj> readCachedIndexColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamIndexColObj> readCachedIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId );

	List<ICFBamIndexColObj> readCachedIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId );

	void deepDisposeIndexColByIdIdx( long TenantId,
		long Id );

	void deepDisposeIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name );

	void deepDisposeIndexColByIdxColTenantIdx( long TenantId );

	void deepDisposeIndexColByIndexIdx( long TenantId,
		long IndexId );

	void deepDisposeIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeIndexColByColIdx( long TenantId,
		long ColumnId );

	void deepDisposeIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeIndexColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId );

	void deepDisposeIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexColObj updateIndexCol( ICFBamIndexColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndexCol( ICFBamIndexColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByUNameIdx(long TenantId,
		long IndexId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxColTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIndexIdx( long TenantId,
		long IndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByColIdx( long TenantId,
		long ColumnId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId );

	/**
	 *	Move the CFBamIndexColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamIndexColObj refreshed cache instance.
	 */
	ICFBamIndexColObj moveUpIndexCol( ICFBamIndexColObj Obj );

	/**
	 *	Move the CFBamIndexColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamIndexColObj refreshed cache instance.
	 */
	ICFBamIndexColObj moveDownIndexCol( ICFBamIndexColObj Obj );
}
