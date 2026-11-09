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

public interface ICFBamClearSubDep1TableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ClearSubDep1 instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamClearSubDep1Obj newInstance();

	/**
	 *	Instantiate a new ClearSubDep1 edition of the specified ClearSubDep1 instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamClearSubDep1EditObj newEditInstance( ICFBamClearSubDep1Obj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamClearSubDep1Obj realiseClearSubDep1( ICFBamClearSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamClearSubDep1Obj createClearSubDep1( ICFBamClearSubDep1Obj Obj );

	/**
	 *	Read a ClearSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamClearSubDep1Obj readClearSubDep1( CFBamScopePKey pkey );

	/**
	 *	Read a ClearSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamClearSubDep1Obj readClearSubDep1( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamClearSubDep1Obj readCachedClearSubDep1( CFBamScopePKey pkey );

	public void reallyDeepDisposeClearSubDep1( ICFBamClearSubDep1Obj obj );

	void deepDisposeClearSubDep1( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamClearSubDep1Obj lockClearSubDep1( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ClearSubDep1-derived instances in the database.
	 *
	 *	@return	List of ICFBamClearSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readAllClearSubDep1();

	/**
	 *	Return a sorted map of all the ClearSubDep1-derived instances in the database.
	 *
	 *	@return	List of ICFBamClearSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readAllClearSubDep1( boolean forceRead );

	List<ICFBamClearSubDep1Obj> readCachedAllClearSubDep1();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearSubDep1Obj readClearSubDep1ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearSubDep1Obj readClearSubDep1ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readClearSubDep1ByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readClearSubDep1ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate ClearTopDepIdx key.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId );

	/**
	 *	Get the map of CFBamClearSubDep1Obj instances sorted by their primary keys for the duplicate ClearTopDepIdx key.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearSubDep1Obj> readClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		boolean forceRead );

	/**
	 *	Get the CFBamClearSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamClearSubDep1Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearSubDep1Obj readClearSubDep1ByUNameIdx(long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name );

	/**
	 *	Get the CFBamClearSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamClearSubDep1Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearSubDep1Obj readClearSubDep1ByUNameIdx(long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name,
		boolean forceRead );

	ICFBamClearSubDep1Obj readCachedClearSubDep1ByIdIdx( long TenantId,
		long Id );

	List<ICFBamClearSubDep1Obj> readCachedClearSubDep1ByTenantIdx( long TenantId );

	List<ICFBamClearSubDep1Obj> readCachedClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId );

	List<ICFBamClearSubDep1Obj> readCachedClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamClearSubDep1Obj> readCachedClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId );

	ICFBamClearSubDep1Obj readCachedClearSubDep1ByUNameIdx( long ClearTopDepTenantId,
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
	ICFBamClearSubDep1Obj updateClearSubDep1( ICFBamClearSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearSubDep1( ICFBamClearSubDep1Obj Obj );

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
