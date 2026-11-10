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

public interface IYCFBamClearTopDepTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ClearTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamClearTopDepObj newInstance();

	/**
	 *	Instantiate a new ClearTopDep edition of the specified ClearTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamClearTopDepEditObj newEditInstance( IYCFBamClearTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearTopDepObj realiseClearTopDep( IYCFBamClearTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearTopDepObj createClearTopDep( IYCFBamClearTopDepObj Obj );

	/**
	 *	Read a ClearTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamClearTopDepObj readClearTopDep( YCFBamScopePKey pkey );

	/**
	 *	Read a ClearTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamClearTopDepObj readClearTopDep( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamClearTopDepObj readCachedClearTopDep( YCFBamScopePKey pkey );

	public void reallyDeepDisposeClearTopDep( IYCFBamClearTopDepObj obj );

	void deepDisposeClearTopDep( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearTopDepObj lockClearTopDep( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ClearTopDep-derived instances in the database.
	 *
	 *	@return	List of IYCFBamClearTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamClearTopDepObj> readAllClearTopDep();

	/**
	 *	Return a sorted map of all the ClearTopDep-derived instances in the database.
	 *
	 *	@return	List of IYCFBamClearTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamClearTopDepObj> readAllClearTopDep( boolean forceRead );

	List<IYCFBamClearTopDepObj> readCachedAllClearTopDep();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearTopDepObj readClearTopDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearTopDepObj readClearTopDepByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamClearTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Get the map of YCFBamClearTopDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamClearTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearTopDepObj instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key.
	 *
	 *	@param	argTableTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamClearTopDepObj instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key.
	 *
	 *	@param	argTableTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the YCFBamClearTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTableTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamClearTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearTopDepObj readClearTopDepByUNameIdx(long TableTenantId,
		long TableId,
		String Name );

	/**
	 *	Get the YCFBamClearTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTableTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamClearTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearTopDepObj readClearTopDepByUNameIdx(long TableTenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamClearTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamClearTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearTopDepObj> readClearTopDepByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	IYCFBamClearTopDepObj readCachedClearTopDepByIdIdx( long TenantId,
		long Id );

	List<IYCFBamClearTopDepObj> readCachedClearTopDepByTenantIdx( long TenantId );

	List<IYCFBamClearTopDepObj> readCachedClearTopDepByClearDepIdx( long TenantId,
		long RelationId );

	List<IYCFBamClearTopDepObj> readCachedClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamClearTopDepObj> readCachedClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId );

	IYCFBamClearTopDepObj readCachedClearTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name );

	List<IYCFBamClearTopDepObj> readCachedClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamClearTopDepObj> readCachedClearTopDepByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeClearTopDepByIdIdx( long TenantId,
		long Id );

	void deepDisposeClearTopDepByTenantIdx( long TenantId );

	void deepDisposeClearTopDepByClearDepIdx( long TenantId,
		long RelationId );

	void deepDisposeClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId );

	void deepDisposeClearTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name );

	void deepDisposeClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeClearTopDepByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearTopDepObj updateClearTopDep( IYCFBamClearTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearTopDep( IYCFBamClearTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTableTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTableTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByUNameIdx(long TableTenantId,
		long TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Move the YCFBamClearTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamClearTopDepObj refreshed cache instance.
	 */
	IYCFBamClearTopDepObj moveUpClearTopDep( IYCFBamClearTopDepObj Obj );

	/**
	 *	Move the YCFBamClearTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamClearTopDepObj refreshed cache instance.
	 */
	IYCFBamClearTopDepObj moveDownClearTopDep( IYCFBamClearTopDepObj Obj );
}
