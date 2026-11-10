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

public interface IYCFBamClearSubDep2TableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ClearSubDep2 instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamClearSubDep2Obj newInstance();

	/**
	 *	Instantiate a new ClearSubDep2 edition of the specified ClearSubDep2 instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamClearSubDep2EditObj newEditInstance( IYCFBamClearSubDep2Obj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearSubDep2Obj realiseClearSubDep2( IYCFBamClearSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearSubDep2Obj createClearSubDep2( IYCFBamClearSubDep2Obj Obj );

	/**
	 *	Read a ClearSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamClearSubDep2Obj readClearSubDep2( YCFBamScopePKey pkey );

	/**
	 *	Read a ClearSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamClearSubDep2Obj readClearSubDep2( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamClearSubDep2Obj readCachedClearSubDep2( YCFBamScopePKey pkey );

	public void reallyDeepDisposeClearSubDep2( IYCFBamClearSubDep2Obj obj );

	void deepDisposeClearSubDep2( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearSubDep2Obj lockClearSubDep2( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ClearSubDep2-derived instances in the database.
	 *
	 *	@return	List of IYCFBamClearSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readAllClearSubDep2();

	/**
	 *	Return a sorted map of all the ClearSubDep2-derived instances in the database.
	 *
	 *	@return	List of IYCFBamClearSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readAllClearSubDep2( boolean forceRead );

	List<IYCFBamClearSubDep2Obj> readCachedAllClearSubDep2();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearSubDep2Obj readClearSubDep2ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearSubDep2Obj readClearSubDep2ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readClearSubDep2ByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamClearSubDep2Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readClearSubDep2ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep2Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Get the map of YCFBamClearSubDep2Obj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep2Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamClearSubDep2Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearSubDep2Obj instances sorted by their primary keys for the duplicate ClearSubDep1Idx key.
	 *
	 *	@param	argClearSubDep1TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep2Obj cached instances sorted by their primary keys for the duplicate ClearSubDep1Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id );

	/**
	 *	Get the map of YCFBamClearSubDep2Obj instances sorted by their primary keys for the duplicate ClearSubDep1Idx key.
	 *
	 *	@param	argClearSubDep1TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep2Obj cached instances sorted by their primary keys for the duplicate ClearSubDep1Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep2Obj> readClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamClearSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argClearSubDep1TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamClearSubDep2Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearSubDep2Obj readClearSubDep2ByUNameIdx(long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name );

	/**
	 *	Get the YCFBamClearSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argClearSubDep1TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamClearSubDep2Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearSubDep2Obj readClearSubDep2ByUNameIdx(long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name,
		boolean forceRead );

	IYCFBamClearSubDep2Obj readCachedClearSubDep2ByIdIdx( long TenantId,
		long Id );

	List<IYCFBamClearSubDep2Obj> readCachedClearSubDep2ByTenantIdx( long TenantId );

	List<IYCFBamClearSubDep2Obj> readCachedClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId );

	List<IYCFBamClearSubDep2Obj> readCachedClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamClearSubDep2Obj> readCachedClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id );

	IYCFBamClearSubDep2Obj readCachedClearSubDep2ByUNameIdx( long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name );

	void deepDisposeClearSubDep2ByIdIdx( long TenantId,
		long Id );

	void deepDisposeClearSubDep2ByTenantIdx( long TenantId );

	void deepDisposeClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId );

	void deepDisposeClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id );

	void deepDisposeClearSubDep2ByUNameIdx( long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearSubDep2Obj updateClearSubDep2( IYCFBamClearSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearSubDep2( IYCFBamClearSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClearSubDep1TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClearSubDep1TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByUNameIdx(long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name );
}
