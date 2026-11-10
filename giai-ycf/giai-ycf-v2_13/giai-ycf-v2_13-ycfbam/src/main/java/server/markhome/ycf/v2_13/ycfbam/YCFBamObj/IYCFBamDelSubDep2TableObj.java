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

public interface IYCFBamDelSubDep2TableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DelSubDep2 instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDelSubDep2Obj newInstance();

	/**
	 *	Instantiate a new DelSubDep2 edition of the specified DelSubDep2 instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDelSubDep2EditObj newEditInstance( IYCFBamDelSubDep2Obj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelSubDep2Obj realiseDelSubDep2( IYCFBamDelSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelSubDep2Obj createDelSubDep2( IYCFBamDelSubDep2Obj Obj );

	/**
	 *	Read a DelSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDelSubDep2Obj readDelSubDep2( YCFBamScopePKey pkey );

	/**
	 *	Read a DelSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDelSubDep2Obj readDelSubDep2( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamDelSubDep2Obj readCachedDelSubDep2( YCFBamScopePKey pkey );

	public void reallyDeepDisposeDelSubDep2( IYCFBamDelSubDep2Obj obj );

	void deepDisposeDelSubDep2( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelSubDep2Obj lockDelSubDep2( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the DelSubDep2-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDelSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readAllDelSubDep2();

	/**
	 *	Return a sorted map of all the DelSubDep2-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDelSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readAllDelSubDep2( boolean forceRead );

	List<IYCFBamDelSubDep2Obj> readCachedAllDelSubDep2();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelSubDep2Obj readDelSubDep2ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelSubDep2Obj readDelSubDep2ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readDelSubDep2ByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDelSubDep2Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readDelSubDep2ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDelSubDep2Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep2Obj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of YCFBamDelSubDep2Obj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	argRelationTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep2Obj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDelSubDep2Obj instances sorted by their primary keys for the duplicate ContDelDep1Idx key.
	 *
	 *	@param	argDelSubDep1TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep2Obj cached instances sorted by their primary keys for the duplicate ContDelDep1Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id );

	/**
	 *	Get the map of YCFBamDelSubDep2Obj instances sorted by their primary keys for the duplicate ContDelDep1Idx key.
	 *
	 *	@param	argDelSubDep1TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDelSubDep2Obj cached instances sorted by their primary keys for the duplicate ContDelDep1Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDelSubDep2Obj> readDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamDelSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argDelSubDep1TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamDelSubDep2Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelSubDep2Obj readDelSubDep2ByUNameIdx(long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name );

	/**
	 *	Get the YCFBamDelSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argDelSubDep1TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamDelSubDep2Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDelSubDep2Obj readDelSubDep2ByUNameIdx(long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name,
		boolean forceRead );

	IYCFBamDelSubDep2Obj readCachedDelSubDep2ByIdIdx( long TenantId,
		long Id );

	List<IYCFBamDelSubDep2Obj> readCachedDelSubDep2ByTenantIdx( long TenantId );

	List<IYCFBamDelSubDep2Obj> readCachedDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDelSubDep2Obj> readCachedDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId );

	List<IYCFBamDelSubDep2Obj> readCachedDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id );

	IYCFBamDelSubDep2Obj readCachedDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name );

	void deepDisposeDelSubDep2ByIdIdx( long TenantId,
		long Id );

	void deepDisposeDelSubDep2ByTenantIdx( long TenantId );

	void deepDisposeDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId );

	void deepDisposeDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id );

	void deepDisposeDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFBamDelSubDep2Obj updateDelSubDep2( IYCFBamDelSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelSubDep2( IYCFBamDelSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DelSubDep2 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep2ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep2ByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep2 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep2 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDelSubDep1TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDelSubDep1TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DelSubDep2 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep2ByUNameIdx(long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name );
}
