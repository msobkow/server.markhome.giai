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

public interface IYCFBamDelSubDep3TableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DelSubDep3 instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDelSubDep3Obj newInstance();

	/**
	 *	Instantiate a new DelSubDep3 edition of the specified DelSubDep3 instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDelSubDep3EditObj newEditInstance( IYCFBamDelSubDep3Obj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelSubDep3Obj realiseDelSubDep3( IYCFBamDelSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelSubDep3Obj createDelSubDep3( IYCFBamDelSubDep3Obj Obj );

	/**
	 *	Read a DelSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDelSubDep3Obj readDelSubDep3( YCFBamScopePKey pkey );

	/**
	 *	Read a DelSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDelSubDep3Obj readDelSubDep3( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamDelSubDep3Obj readCachedDelSubDep3( YCFBamScopePKey pkey );

	public void reallyDeepDisposeDelSubDep3( IYCFBamDelSubDep3Obj obj );

	void deepDisposeDelSubDep3( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelSubDep3Obj lockDelSubDep3( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the DelSubDep3-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDelSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readAllDelSubDep3();

	/**
	 *	Return a sorted map of all the DelSubDep3-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDelSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readAllDelSubDep3( boolean forceRead );

	List<IYCFBamDelSubDep3Obj> readCachedAllDelSubDep3();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelSubDep3Obj readDelSubDep3ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelSubDep3Obj readDelSubDep3ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readDelSubDep3ByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDelSubDep3Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readDelSubDep3ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDelSubDep3Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of YCFBamDelSubDep3Obj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelSubDep3Obj instances sorted by their primary keys for the duplicate DelSubDep2Idx key.
	 *
	 *	@param	argDelSubDep2TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DelSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id );

	/**
	 *	Get the map of YCFBamDelSubDep3Obj instances sorted by their primary keys for the duplicate DelSubDep2Idx key.
	 *
	 *	@param	argDelSubDep2TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DelSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamDelSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argDelSubDep2TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamDelSubDep3Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelSubDep3Obj readDelSubDep3ByUNameIdx(long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name );

	/**
	 *	Get the YCFBamDelSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argDelSubDep2TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamDelSubDep3Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelSubDep3Obj readDelSubDep3ByUNameIdx(long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name,
		boolean forceRead );

	IYCFBamDelSubDep3Obj readCachedDelSubDep3ByIdIdx( long TenantId,
		long Id );

	List<IYCFBamDelSubDep3Obj> readCachedDelSubDep3ByTenantIdx( long TenantId );

	List<IYCFBamDelSubDep3Obj> readCachedDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDelSubDep3Obj> readCachedDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId );

	List<IYCFBamDelSubDep3Obj> readCachedDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id );

	IYCFBamDelSubDep3Obj readCachedDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name );

	void deepDisposeDelSubDep3ByIdIdx( long TenantId,
		long Id );

	void deepDisposeDelSubDep3ByTenantIdx( long TenantId );

	void deepDisposeDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId );

	void deepDisposeDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id );

	void deepDisposeDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelSubDep3Obj updateDelSubDep3( IYCFBamDelSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelSubDep3( IYCFBamDelSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDelSubDep2TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDelSubDep2TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByUNameIdx(long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name );
}
