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

public interface IYCFBamClearSubDep1TableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ClearSubDep1 instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamClearSubDep1Obj newInstance();

	/**
	 *	Instantiate a new ClearSubDep1 edition of the specified ClearSubDep1 instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamClearSubDep1EditObj newEditInstance( IYCFBamClearSubDep1Obj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearSubDep1Obj realiseClearSubDep1( IYCFBamClearSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearSubDep1Obj createClearSubDep1( IYCFBamClearSubDep1Obj Obj );

	/**
	 *	Read a ClearSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamClearSubDep1Obj readClearSubDep1( YCFBamScopePKey pkey );

	/**
	 *	Read a ClearSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamClearSubDep1Obj readClearSubDep1( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamClearSubDep1Obj readCachedClearSubDep1( YCFBamScopePKey pkey );

	public void reallyDeepDisposeClearSubDep1( IYCFBamClearSubDep1Obj obj );

	void deepDisposeClearSubDep1( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearSubDep1Obj lockClearSubDep1( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ClearSubDep1-derived instances in the database.
	 *
	 *	@return	List of IYCFBamClearSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readAllClearSubDep1();

	/**
	 *	Return a sorted map of all the ClearSubDep1-derived instances in the database.
	 *
	 *	@return	List of IYCFBamClearSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readAllClearSubDep1( boolean forceRead );

	List<IYCFBamClearSubDep1Obj> readCachedAllClearSubDep1();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearSubDep1Obj readClearSubDep1ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearSubDep1Obj readClearSubDep1ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readClearSubDep1ByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readClearSubDep1ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Get the map of YCFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate ClearTopDepIdx key.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId );

	/**
	 *	Get the map of YCFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate ClearTopDepIdx key.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamClearSubDep1Obj> readClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		boolean forceRead );

	/**
	 *	Get the YCFBamClearSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamClearSubDep1Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearSubDep1Obj readClearSubDep1ByUNameIdx(long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name );

	/**
	 *	Get the YCFBamClearSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamClearSubDep1Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamClearSubDep1Obj readClearSubDep1ByUNameIdx(long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name,
		boolean forceRead );

	IYCFBamClearSubDep1Obj readCachedClearSubDep1ByIdIdx( long TenantId,
		long Id );

	List<IYCFBamClearSubDep1Obj> readCachedClearSubDep1ByTenantIdx( long TenantId );

	List<IYCFBamClearSubDep1Obj> readCachedClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId );

	List<IYCFBamClearSubDep1Obj> readCachedClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamClearSubDep1Obj> readCachedClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId );

	IYCFBamClearSubDep1Obj readCachedClearSubDep1ByUNameIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name );

	void deepDisposeClearSubDep1ByIdIdx( long TenantId,
		long Id );

	void deepDisposeClearSubDep1ByTenantIdx( long TenantId );

	void deepDisposeClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId );

	void deepDisposeClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId );

	void deepDisposeClearSubDep1ByUNameIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFBamClearSubDep1Obj updateClearSubDep1( IYCFBamClearSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearSubDep1( IYCFBamClearSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByUNameIdx(long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name );
}
