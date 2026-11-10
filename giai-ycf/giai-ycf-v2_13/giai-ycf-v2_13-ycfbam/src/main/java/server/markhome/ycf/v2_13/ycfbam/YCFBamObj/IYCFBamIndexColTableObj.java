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

public interface IYCFBamIndexColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new IndexCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamIndexColObj newInstance();

	/**
	 *	Instantiate a new IndexCol edition of the specified IndexCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamIndexColEditObj newEditInstance( IYCFBamIndexColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamIndexColObj realiseIndexCol( IYCFBamIndexColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamIndexColObj createIndexCol( IYCFBamIndexColObj Obj );

	/**
	 *	Read a IndexCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamIndexColObj readIndexCol( YCFBamIndexColPKey pkey );

	/**
	 *	Read a IndexCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamIndexColObj readIndexCol( YCFBamIndexColPKey pkey,
		boolean forceRead );

	IYCFBamIndexColObj readCachedIndexCol( YCFBamIndexColPKey pkey );

	public void reallyDeepDisposeIndexCol( IYCFBamIndexColObj obj );

	void deepDisposeIndexCol( YCFBamIndexColPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamIndexColObj lockIndexCol( YCFBamIndexColPKey pkey );

	/**
	 *	Return a sorted list of all the IndexCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamIndexColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamIndexColObj> readAllIndexCol();

	/**
	 *	Return a sorted map of all the IndexCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamIndexColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamIndexColObj> readAllIndexCol( boolean forceRead );

	List<IYCFBamIndexColObj> readCachedAllIndexCol();

	/**
	 *	Get the YCFBamIndexColObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamIndexColObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamIndexColObj readIndexColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamIndexColObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamIndexColObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamIndexColObj readIndexColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamIndexColObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamIndexColObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamIndexColObj readIndexColByUNameIdx(long TenantId,
		long IndexId,
		String Name );

	/**
	 *	Get the YCFBamIndexColObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamIndexColObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamIndexColObj readIndexColByUNameIdx(long TenantId,
		long IndexId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate IdxColTenantIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxColTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByIdxColTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate IdxColTenantIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxColTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByIdxColTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByIndexIdx( long TenantId,
		long IndexId );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByIndexIdx( long TenantId,
		long IndexId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate ColIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate ColIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByColIdx( long TenantId,
		long ColumnId );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate ColIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate ColIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByColIdx( long TenantId,
		long ColumnId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate IdxPrevIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate IdxPrevIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate IdxNextIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId );

	/**
	 *	Get the map of YCFBamIndexColObj instances sorted by their primary keys for the duplicate IdxNextIdx key.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamIndexColObj cached instances sorted by their primary keys for the duplicate IdxNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamIndexColObj> readIndexColByIdxNextIdx( long TenantId,
		long IndexId,
		Long NextId,
		boolean forceRead );

	IYCFBamIndexColObj readCachedIndexColByIdIdx( long TenantId,
		long Id );

	IYCFBamIndexColObj readCachedIndexColByUNameIdx( long TenantId,
		long IndexId,
		String Name );

	List<IYCFBamIndexColObj> readCachedIndexColByIdxColTenantIdx( long TenantId );

	List<IYCFBamIndexColObj> readCachedIndexColByIndexIdx( long TenantId,
		long IndexId );

	List<IYCFBamIndexColObj> readCachedIndexColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamIndexColObj> readCachedIndexColByColIdx( long TenantId,
		long ColumnId );

	List<IYCFBamIndexColObj> readCachedIndexColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamIndexColObj> readCachedIndexColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamIndexColObj> readCachedIndexColByIdxPrevIdx( long TenantId,
		long IndexId,
		Long PrevId );

	List<IYCFBamIndexColObj> readCachedIndexColByIdxNextIdx( long TenantId,
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
	IYCFBamIndexColObj updateIndexCol( IYCFBamIndexColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndexCol( IYCFBamIndexColObj Obj );

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
	 *	Move the YCFBamIndexColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamIndexColObj refreshed cache instance.
	 */
	IYCFBamIndexColObj moveUpIndexCol( IYCFBamIndexColObj Obj );

	/**
	 *	Move the YCFBamIndexColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamIndexColObj refreshed cache instance.
	 */
	IYCFBamIndexColObj moveDownIndexCol( IYCFBamIndexColObj Obj );
}
