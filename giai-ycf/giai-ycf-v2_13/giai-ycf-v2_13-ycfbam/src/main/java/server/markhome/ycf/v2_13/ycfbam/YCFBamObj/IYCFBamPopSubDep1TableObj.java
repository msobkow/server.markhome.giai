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

public interface ICFBamPopSubDep1TableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new PopSubDep1 instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPopSubDep1Obj newInstance();

	/**
	 *	Instantiate a new PopSubDep1 edition of the specified PopSubDep1 instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPopSubDep1EditObj newEditInstance( ICFBamPopSubDep1Obj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep1Obj realisePopSubDep1( ICFBamPopSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep1Obj createPopSubDep1( ICFBamPopSubDep1Obj Obj );

	/**
	 *	Read a PopSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPopSubDep1Obj readPopSubDep1( CFBamScopePKey pkey );

	/**
	 *	Read a PopSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPopSubDep1Obj readPopSubDep1( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamPopSubDep1Obj readCachedPopSubDep1( CFBamScopePKey pkey );

	public void reallyDeepDisposePopSubDep1( ICFBamPopSubDep1Obj obj );

	void deepDisposePopSubDep1( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep1Obj lockPopSubDep1( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the PopSubDep1-derived instances in the database.
	 *
	 *	@return	List of ICFBamPopSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readAllPopSubDep1();

	/**
	 *	Return a sorted map of all the PopSubDep1-derived instances in the database.
	 *
	 *	@return	List of ICFBamPopSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readAllPopSubDep1( boolean forceRead );

	List<ICFBamPopSubDep1Obj> readCachedAllPopSubDep1();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep1Obj readPopSubDep1ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep1Obj readPopSubDep1ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readPopSubDep1ByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamPopSubDep1Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readPopSubDep1ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep1Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readPopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamPopSubDep1Obj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep1Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readPopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readPopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamPopSubDep1Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readPopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopSubDep1Obj instances sorted by their primary keys for the duplicate PopTopDepIdx key.
	 *
	 *	@param	argPopTopDepTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argPopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep1Obj cached instances sorted by their primary keys for the duplicate PopTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readPopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId );

	/**
	 *	Get the map of CFBamPopSubDep1Obj instances sorted by their primary keys for the duplicate PopTopDepIdx key.
	 *
	 *	@param	argPopTopDepTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argPopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep1Obj cached instances sorted by their primary keys for the duplicate PopTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep1Obj> readPopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId,
		boolean forceRead );

	/**
	 *	Get the CFBamPopSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argPopTopDepTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argPopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPopSubDep1Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep1Obj readPopSubDep1ByUNameIdx(long PopTopDepTenantId,
		long PopTopDepId,
		String Name );

	/**
	 *	Get the CFBamPopSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argPopTopDepTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argPopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPopSubDep1Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep1Obj readPopSubDep1ByUNameIdx(long PopTopDepTenantId,
		long PopTopDepId,
		String Name,
		boolean forceRead );

	ICFBamPopSubDep1Obj readCachedPopSubDep1ByIdIdx( long TenantId,
		long Id );

	List<ICFBamPopSubDep1Obj> readCachedPopSubDep1ByTenantIdx( long TenantId );

	List<ICFBamPopSubDep1Obj> readCachedPopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId );

	List<ICFBamPopSubDep1Obj> readCachedPopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamPopSubDep1Obj> readCachedPopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId );

	ICFBamPopSubDep1Obj readCachedPopSubDep1ByUNameIdx( long PopTopDepTenantId,
		long PopTopDepId,
		String Name );

	void deepDisposePopSubDep1ByIdIdx( long TenantId,
		long Id );

	void deepDisposePopSubDep1ByTenantIdx( long TenantId );

	void deepDisposePopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId );

	void deepDisposePopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposePopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId );

	void deepDisposePopSubDep1ByUNameIdx( long PopTopDepTenantId,
		long PopTopDepId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep1Obj updatePopSubDep1( ICFBamPopSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopSubDep1( ICFBamPopSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPopTopDepTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argPopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPopTopDepTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argPopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByUNameIdx(long PopTopDepTenantId,
		long PopTopDepId,
		String Name );
}
