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

public interface ICFBamDelSubDep1TableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DelSubDep1 instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDelSubDep1Obj newInstance();

	/**
	 *	Instantiate a new DelSubDep1 edition of the specified DelSubDep1 instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDelSubDep1EditObj newEditInstance( ICFBamDelSubDep1Obj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDelSubDep1Obj realiseDelSubDep1( ICFBamDelSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDelSubDep1Obj createDelSubDep1( ICFBamDelSubDep1Obj Obj );

	/**
	 *	Read a DelSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDelSubDep1Obj readDelSubDep1( CFBamScopePKey pkey );

	/**
	 *	Read a DelSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDelSubDep1Obj readDelSubDep1( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamDelSubDep1Obj readCachedDelSubDep1( CFBamScopePKey pkey );

	public void reallyDeepDisposeDelSubDep1( ICFBamDelSubDep1Obj obj );

	void deepDisposeDelSubDep1( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDelSubDep1Obj lockDelSubDep1( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the DelSubDep1-derived instances in the database.
	 *
	 *	@return	List of ICFBamDelSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readAllDelSubDep1();

	/**
	 *	Return a sorted map of all the DelSubDep1-derived instances in the database.
	 *
	 *	@return	List of ICFBamDelSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readAllDelSubDep1( boolean forceRead );

	List<ICFBamDelSubDep1Obj> readCachedAllDelSubDep1();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelSubDep1Obj readDelSubDep1ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelSubDep1Obj readDelSubDep1ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readDelSubDep1ByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamDelSubDep1Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readDelSubDep1ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDelSubDep1Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelSubDep1Obj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamDelSubDep1Obj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelSubDep1Obj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelSubDep1Obj instances sorted by their primary keys for the duplicate DelTopDepIdx key.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelSubDep1Obj cached instances sorted by their primary keys for the duplicate DelTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId );

	/**
	 *	Get the map of CFBamDelSubDep1Obj instances sorted by their primary keys for the duplicate DelTopDepIdx key.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelSubDep1Obj cached instances sorted by their primary keys for the duplicate DelTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelSubDep1Obj> readDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId,
		boolean forceRead );

	/**
	 *	Get the CFBamDelSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamDelSubDep1Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelSubDep1Obj readDelSubDep1ByUNameIdx(long DelTopDepTenantId,
		long DelTopDepId,
		String Name );

	/**
	 *	Get the CFBamDelSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamDelSubDep1Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelSubDep1Obj readDelSubDep1ByUNameIdx(long DelTopDepTenantId,
		long DelTopDepId,
		String Name,
		boolean forceRead );

	ICFBamDelSubDep1Obj readCachedDelSubDep1ByIdIdx( long TenantId,
		long Id );

	List<ICFBamDelSubDep1Obj> readCachedDelSubDep1ByTenantIdx( long TenantId );

	List<ICFBamDelSubDep1Obj> readCachedDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDelSubDep1Obj> readCachedDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId );

	List<ICFBamDelSubDep1Obj> readCachedDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId );

	ICFBamDelSubDep1Obj readCachedDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name );

	void deepDisposeDelSubDep1ByIdIdx( long TenantId,
		long Id );

	void deepDisposeDelSubDep1ByTenantIdx( long TenantId );

	void deepDisposeDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId );

	void deepDisposeDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId );

	void deepDisposeDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFBamDelSubDep1Obj updateDelSubDep1( ICFBamDelSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelSubDep1( ICFBamDelSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep1 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep1ByUNameIdx(long DelTopDepTenantId,
		long DelTopDepId,
		String Name );
}
