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

public interface ICFBamSchemaRefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SchemaRef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamSchemaRefObj newInstance();

	/**
	 *	Instantiate a new SchemaRef edition of the specified SchemaRef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamSchemaRefEditObj newEditInstance( ICFBamSchemaRefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaRefObj realiseSchemaRef( ICFBamSchemaRefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaRefObj createSchemaRef( ICFBamSchemaRefObj Obj );

	/**
	 *	Read a SchemaRef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamSchemaRefObj readSchemaRef( CFBamScopePKey pkey );

	/**
	 *	Read a SchemaRef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamSchemaRefObj readSchemaRef( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamSchemaRefObj readCachedSchemaRef( CFBamScopePKey pkey );

	public void reallyDeepDisposeSchemaRef( ICFBamSchemaRefObj obj );

	void deepDisposeSchemaRef( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaRefObj lockSchemaRef( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the SchemaRef-derived instances in the database.
	 *
	 *	@return	List of ICFBamSchemaRefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamSchemaRefObj> readAllSchemaRef();

	/**
	 *	Return a sorted map of all the SchemaRef-derived instances in the database.
	 *
	 *	@return	List of ICFBamSchemaRefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamSchemaRefObj> readAllSchemaRef( boolean forceRead );

	List<ICFBamSchemaRefObj> readCachedAllSchemaRef();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRefObj readSchemaRefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRefObj readSchemaRefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamSchemaRefObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaRefObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefBySchemaIdx( long TenantId,
		long SchemaId );

	/**
	 *	Get the map of CFBamSchemaRefObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefBySchemaIdx( long TenantId,
		long SchemaId,
		boolean forceRead );

	/**
	 *	Get the CFBamSchemaRefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamSchemaRefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRefObj readSchemaRefByUNameIdx(long TenantId,
		long SchemaId,
		String Name );

	/**
	 *	Get the CFBamSchemaRefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamSchemaRefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamSchemaRefObj readSchemaRefByUNameIdx(long TenantId,
		long SchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaRefObj instances sorted by their primary keys for the duplicate RefSchemaIdx key.
	 *
	 *	@param	argRefSchemaTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argRefSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate RefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId );

	/**
	 *	Get the map of CFBamSchemaRefObj instances sorted by their primary keys for the duplicate RefSchemaIdx key.
	 *
	 *	@param	argRefSchemaTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argRefSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate RefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaRefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamSchemaRefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamSchemaRefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamSchemaRefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamSchemaRefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamSchemaRefObj> readSchemaRefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	ICFBamSchemaRefObj readCachedSchemaRefByIdIdx( long TenantId,
		long Id );

	List<ICFBamSchemaRefObj> readCachedSchemaRefByTenantIdx( long TenantId );

	List<ICFBamSchemaRefObj> readCachedSchemaRefBySchemaIdx( long TenantId,
		long SchemaId );

	ICFBamSchemaRefObj readCachedSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name );

	List<ICFBamSchemaRefObj> readCachedSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId );

	List<ICFBamSchemaRefObj> readCachedSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamSchemaRefObj> readCachedSchemaRefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeSchemaRefByIdIdx( long TenantId,
		long Id );

	void deepDisposeSchemaRefByTenantIdx( long TenantId );

	void deepDisposeSchemaRefBySchemaIdx( long TenantId,
		long SchemaId );

	void deepDisposeSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name );

	void deepDisposeSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId );

	void deepDisposeSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeSchemaRefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamSchemaRefObj updateSchemaRef( ICFBamSchemaRefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaRef( ICFBamSchemaRefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefBySchemaIdx( long TenantId,
		long SchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByUNameIdx(long TenantId,
		long SchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRefSchemaTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argRefSchemaId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Move the CFBamSchemaRefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamSchemaRefObj refreshed cache instance.
	 */
	ICFBamSchemaRefObj moveUpSchemaRef( ICFBamSchemaRefObj Obj );

	/**
	 *	Move the CFBamSchemaRefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamSchemaRefObj refreshed cache instance.
	 */
	ICFBamSchemaRefObj moveDownSchemaRef( ICFBamSchemaRefObj Obj );
}
