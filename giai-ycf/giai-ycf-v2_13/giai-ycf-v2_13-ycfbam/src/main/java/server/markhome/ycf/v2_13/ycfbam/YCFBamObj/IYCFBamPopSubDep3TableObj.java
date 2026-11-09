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

public interface ICFBamPopSubDep3TableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new PopSubDep3 instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPopSubDep3Obj newInstance();

	/**
	 *	Instantiate a new PopSubDep3 edition of the specified PopSubDep3 instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPopSubDep3EditObj newEditInstance( ICFBamPopSubDep3Obj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep3Obj realisePopSubDep3( ICFBamPopSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep3Obj createPopSubDep3( ICFBamPopSubDep3Obj Obj );

	/**
	 *	Read a PopSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPopSubDep3Obj readPopSubDep3( CFBamScopePKey pkey );

	/**
	 *	Read a PopSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPopSubDep3Obj readPopSubDep3( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamPopSubDep3Obj readCachedPopSubDep3( CFBamScopePKey pkey );

	public void reallyDeepDisposePopSubDep3( ICFBamPopSubDep3Obj obj );

	void deepDisposePopSubDep3( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep3Obj lockPopSubDep3( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the PopSubDep3-derived instances in the database.
	 *
	 *	@return	List of ICFBamPopSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readAllPopSubDep3();

	/**
	 *	Return a sorted map of all the PopSubDep3-derived instances in the database.
	 *
	 *	@return	List of ICFBamPopSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readAllPopSubDep3( boolean forceRead );

	List<ICFBamPopSubDep3Obj> readCachedAllPopSubDep3();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep3Obj readPopSubDep3ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep3Obj readPopSubDep3ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readPopSubDep3ByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamPopSubDep3Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readPopSubDep3ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep3Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readPopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamPopSubDep3Obj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep3Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readPopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readPopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamPopSubDep3Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readPopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopSubDep3Obj instances sorted by their primary keys for the duplicate PopSubDep2Idx key.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep3Obj cached instances sorted by their primary keys for the duplicate PopSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readPopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id );

	/**
	 *	Get the map of CFBamPopSubDep3Obj instances sorted by their primary keys for the duplicate PopSubDep2Idx key.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep3Obj cached instances sorted by their primary keys for the duplicate PopSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep3Obj> readPopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		boolean forceRead );

	/**
	 *	Get the CFBamPopSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPopSubDep3Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep3Obj readPopSubDep3ByUNameIdx(long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name );

	/**
	 *	Get the CFBamPopSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPopSubDep3Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep3Obj readPopSubDep3ByUNameIdx(long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name,
		boolean forceRead );

	ICFBamPopSubDep3Obj readCachedPopSubDep3ByIdIdx( long TenantId,
		long Id );

	List<ICFBamPopSubDep3Obj> readCachedPopSubDep3ByTenantIdx( long TenantId );

	List<ICFBamPopSubDep3Obj> readCachedPopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId );

	List<ICFBamPopSubDep3Obj> readCachedPopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamPopSubDep3Obj> readCachedPopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id );

	ICFBamPopSubDep3Obj readCachedPopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name );

	void deepDisposePopSubDep3ByIdIdx( long TenantId,
		long Id );

	void deepDisposePopSubDep3ByTenantIdx( long TenantId );

	void deepDisposePopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId );

	void deepDisposePopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposePopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id );

	void deepDisposePopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep3Obj updatePopSubDep3( ICFBamPopSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopSubDep3( ICFBamPopSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByUNameIdx(long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name );
}
