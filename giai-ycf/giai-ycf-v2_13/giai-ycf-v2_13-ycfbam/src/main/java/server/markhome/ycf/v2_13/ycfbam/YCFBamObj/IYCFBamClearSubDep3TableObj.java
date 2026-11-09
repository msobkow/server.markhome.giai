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

public interface ICFBamClearSubDep3TableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ClearSubDep3 instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamClearSubDep3Obj newInstance();

	/**
	 *	Instantiate a new ClearSubDep3 edition of the specified ClearSubDep3 instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamClearSubDep3EditObj newEditInstance( ICFBamClearSubDep3Obj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamClearSubDep3Obj realiseClearSubDep3( ICFBamClearSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamClearSubDep3Obj createClearSubDep3( ICFBamClearSubDep3Obj Obj );

	/**
	 *	Read a ClearSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamClearSubDep3Obj readClearSubDep3( CFBamScopePKey pkey );

	/**
	 *	Read a ClearSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamClearSubDep3Obj readClearSubDep3( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamClearSubDep3Obj readCachedClearSubDep3( CFBamScopePKey pkey );

	public void reallyDeepDisposeClearSubDep3( ICFBamClearSubDep3Obj obj );

	void deepDisposeClearSubDep3( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamClearSubDep3Obj lockClearSubDep3( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ClearSubDep3-derived instances in the database.
	 *
	 *	@return	List of ICFBamClearSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readAllClearSubDep3();

	/**
	 *	Return a sorted map of all the ClearSubDep3-derived instances in the database.
	 *
	 *	@return	List of ICFBamClearSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readAllClearSubDep3( boolean forceRead );

	List<ICFBamClearSubDep3Obj> readCachedAllClearSubDep3();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearSubDep3Obj readClearSubDep3ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearSubDep3Obj readClearSubDep3ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readClearSubDep3ByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamClearSubDep3Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readClearSubDep3ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep3Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamClearSubDep3Obj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep3Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamClearSubDep3Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearSubDep3Obj instances sorted by their primary keys for the duplicate ClearSubDep2Idx key.
	 *
	 *	@param	argClearSubDep2TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep3Obj cached instances sorted by their primary keys for the duplicate ClearSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id );

	/**
	 *	Get the map of CFBamClearSubDep3Obj instances sorted by their primary keys for the duplicate ClearSubDep2Idx key.
	 *
	 *	@param	argClearSubDep2TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep3Obj cached instances sorted by their primary keys for the duplicate ClearSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep3Obj> readClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		boolean forceRead );

	/**
	 *	Get the CFBamClearSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argClearSubDep2TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamClearSubDep3Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearSubDep3Obj readClearSubDep3ByUNameIdx(long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name );

	/**
	 *	Get the CFBamClearSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argClearSubDep2TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamClearSubDep3Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearSubDep3Obj readClearSubDep3ByUNameIdx(long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name,
		boolean forceRead );

	ICFBamClearSubDep3Obj readCachedClearSubDep3ByIdIdx( long TenantId,
		long Id );

	List<ICFBamClearSubDep3Obj> readCachedClearSubDep3ByTenantIdx( long TenantId );

	List<ICFBamClearSubDep3Obj> readCachedClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId );

	List<ICFBamClearSubDep3Obj> readCachedClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamClearSubDep3Obj> readCachedClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id );

	ICFBamClearSubDep3Obj readCachedClearSubDep3ByUNameIdx( long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name );

	void deepDisposeClearSubDep3ByIdIdx( long TenantId,
		long Id );

	void deepDisposeClearSubDep3ByTenantIdx( long TenantId );

	void deepDisposeClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId );

	void deepDisposeClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id );

	void deepDisposeClearSubDep3ByUNameIdx( long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFBamClearSubDep3Obj updateClearSubDep3( ICFBamClearSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearSubDep3( ICFBamClearSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClearSubDep2TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClearSubDep2TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByUNameIdx(long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name );
}
