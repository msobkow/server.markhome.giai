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

public interface IYCFBamDelTopDepTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DelTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDelTopDepObj newInstance();

	/**
	 *	Instantiate a new DelTopDep edition of the specified DelTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDelTopDepEditObj newEditInstance( IYCFBamDelTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelTopDepObj realiseDelTopDep( IYCFBamDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelTopDepObj createDelTopDep( IYCFBamDelTopDepObj Obj );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDelTopDepObj readDelTopDep( YCFBamScopePKey pkey );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDelTopDepObj readDelTopDep( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamDelTopDepObj readCachedDelTopDep( YCFBamScopePKey pkey );

	public void reallyDeepDisposeDelTopDep( IYCFBamDelTopDepObj obj );

	void deepDisposeDelTopDep( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelTopDepObj lockDelTopDep( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDelTopDepObj> readAllDelTopDep();

	/**
	 *	Return a sorted map of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDelTopDepObj> readAllDelTopDep( boolean forceRead );

	List<IYCFBamDelTopDepObj> readCachedAllDelTopDep();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelTopDepObj readDelTopDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelTopDepObj readDelTopDepByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDelTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDelTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of YCFBamDelTopDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelTopDepObj instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamDelTopDepObj instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the YCFBamDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamDelTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelTopDepObj readDelTopDepByUNameIdx(long TableTenantId,
		long TableId,
		String Name );

	/**
	 *	Get the YCFBamDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamDelTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelTopDepObj readDelTopDepByUNameIdx(long TableTenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDelTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDelTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelTopDepObj> readDelTopDepByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	IYCFBamDelTopDepObj readCachedDelTopDepByIdIdx( long TenantId,
		long Id );

	List<IYCFBamDelTopDepObj> readCachedDelTopDepByTenantIdx( long TenantId );

	List<IYCFBamDelTopDepObj> readCachedDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDelTopDepObj> readCachedDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	List<IYCFBamDelTopDepObj> readCachedDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId );

	IYCFBamDelTopDepObj readCachedDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name );

	List<IYCFBamDelTopDepObj> readCachedDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDelTopDepObj> readCachedDelTopDepByNextIdx( Long NextTenantId,
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
	IYCFBamDelTopDepObj updateDelTopDep( IYCFBamDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelTopDep( IYCFBamDelTopDepObj Obj );

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
	 *	Move the YCFBamDelTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDelTopDepObj refreshed cache instance.
	 */
	IYCFBamDelTopDepObj moveUpDelTopDep( IYCFBamDelTopDepObj Obj );

	/**
	 *	Move the YCFBamDelTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDelTopDepObj refreshed cache instance.
	 */
	IYCFBamDelTopDepObj moveDownDelTopDep( IYCFBamDelTopDepObj Obj );
}
