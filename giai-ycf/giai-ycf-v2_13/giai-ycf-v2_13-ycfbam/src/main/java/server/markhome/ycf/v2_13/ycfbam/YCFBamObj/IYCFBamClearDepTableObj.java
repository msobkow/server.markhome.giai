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

public interface ICFBamClearDepTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ClearDep instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamClearDepObj newInstance();

	/**
	 *	Instantiate a new ClearDep edition of the specified ClearDep instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamClearDepEditObj newEditInstance( ICFBamClearDepObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamClearDepObj realiseClearDep( ICFBamClearDepObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamClearDepObj createClearDep( ICFBamClearDepObj Obj );

	/**
	 *	Read a ClearDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamClearDepObj readClearDep( CFBamScopePKey pkey );

	/**
	 *	Read a ClearDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamClearDepObj readClearDep( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamClearDepObj readCachedClearDep( CFBamScopePKey pkey );

	public void reallyDeepDisposeClearDep( ICFBamClearDepObj obj );

	void deepDisposeClearDep( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamClearDepObj lockClearDep( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the ClearDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamClearDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamClearDepObj> readAllClearDep();

	/**
	 *	Return a sorted map of all the ClearDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamClearDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamClearDepObj> readAllClearDep( boolean forceRead );

	List<ICFBamClearDepObj> readCachedAllClearDep();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearDepObj readClearDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamClearDepObj readClearDepByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamClearDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamClearDepObj> readClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	ICFBamClearDepObj readCachedClearDepByIdIdx( long TenantId,
		long Id );

	List<ICFBamClearDepObj> readCachedClearDepByTenantIdx( long TenantId );

	List<ICFBamClearDepObj> readCachedClearDepByClearDepIdx( long TenantId,
		long RelationId );

	List<ICFBamClearDepObj> readCachedClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeClearDepByIdIdx( long TenantId,
		long Id );

	void deepDisposeClearDepByTenantIdx( long TenantId );

	void deepDisposeClearDepByClearDepIdx( long TenantId,
		long RelationId );

	void deepDisposeClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamClearDepObj updateClearDep( ICFBamClearDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearDep( ICFBamClearDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByClearDepIdx( long TenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );
}
