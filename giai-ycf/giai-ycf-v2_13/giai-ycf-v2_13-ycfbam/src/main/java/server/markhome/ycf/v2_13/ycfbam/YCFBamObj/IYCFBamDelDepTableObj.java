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

public interface ICFBamDelDepTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DelDep instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDelDepObj newInstance();

	/**
	 *	Instantiate a new DelDep edition of the specified DelDep instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDelDepEditObj newEditInstance( ICFBamDelDepObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDelDepObj realiseDelDep( ICFBamDelDepObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDelDepObj createDelDep( ICFBamDelDepObj Obj );

	/**
	 *	Read a DelDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDelDepObj readDelDep( CFBamScopePKey pkey );

	/**
	 *	Read a DelDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDelDepObj readDelDep( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamDelDepObj readCachedDelDep( CFBamScopePKey pkey );

	public void reallyDeepDisposeDelDep( ICFBamDelDepObj obj );

	void deepDisposeDelDep( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDelDepObj lockDelDep( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the DelDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamDelDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDelDepObj> readAllDelDep();

	/**
	 *	Return a sorted map of all the DelDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamDelDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDelDepObj> readAllDelDep( boolean forceRead );

	List<ICFBamDelDepObj> readCachedAllDelDep();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelDepObj readDelDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDelDepObj readDelDepByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDelDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDelDepObj> readDelDepByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	ICFBamDelDepObj readCachedDelDepByIdIdx( long TenantId,
		long Id );

	List<ICFBamDelDepObj> readCachedDelDepByTenantIdx( long TenantId );

	List<ICFBamDelDepObj> readCachedDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDelDepObj> readCachedDelDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	void deepDisposeDelDepByIdIdx( long TenantId,
		long Id );

	void deepDisposeDelDepByTenantIdx( long TenantId );

	void deepDisposeDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDelDepByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 */
	ICFBamDelDepObj updateDelDep( ICFBamDelDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelDep( ICFBamDelDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelDep key attribute of the instance generating the id.
	 */
	void deleteDelDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelDep key attribute of the instance generating the id.
	 */
	void deleteDelDepByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelDep key attribute of the instance generating the id.
	 */
	void deleteDelDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelDep key attribute of the instance generating the id.
	 */
	void deleteDelDepByDelDepIdx( long RelationTenantId,
		long RelationId );
}
