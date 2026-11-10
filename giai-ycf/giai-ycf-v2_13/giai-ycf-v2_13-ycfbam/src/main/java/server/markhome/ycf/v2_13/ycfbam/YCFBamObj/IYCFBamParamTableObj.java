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

public interface IYCFBamParamTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Param instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamParamObj newInstance();

	/**
	 *	Instantiate a new Param edition of the specified Param instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamParamEditObj newEditInstance( IYCFBamParamObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamParamObj realiseParam( IYCFBamParamObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamParamObj createParam( IYCFBamParamObj Obj );

	/**
	 *	Read a Param-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Param-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamParamObj readParam( YCFBamParamPKey pkey );

	/**
	 *	Read a Param-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Param-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamParamObj readParam( YCFBamParamPKey pkey,
		boolean forceRead );

	IYCFBamParamObj readCachedParam( YCFBamParamPKey pkey );

	public void reallyDeepDisposeParam( IYCFBamParamObj obj );

	void deepDisposeParam( YCFBamParamPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamParamObj lockParam( YCFBamParamPKey pkey );

	/**
	 *	Return a sorted list of all the Param-derived instances in the database.
	 *
	 *	@return	List of IYCFBamParamObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamParamObj> readAllParam();

	/**
	 *	Return a sorted map of all the Param-derived instances in the database.
	 *
	 *	@return	List of IYCFBamParamObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamParamObj> readAllParam( boolean forceRead );

	List<IYCFBamParamObj> readCachedAllParam();

	/**
	 *	Get the YCFBamParamObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamParamObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamParamObj readParamByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamParamObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamParamObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamParamObj readParamByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamParamObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Param key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamParamObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamParamObj readParamByUNameIdx(long TenantId,
		long ServerMethodId,
		String Name );

	/**
	 *	Get the YCFBamParamObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Param key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamParamObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamParamObj readParamByUNameIdx(long TenantId,
		long ServerMethodId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ServerMethodIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ServerMethodIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByServerMethodIdx( long TenantId,
		long ServerMethodId );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ServerMethodIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ServerMethodIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByServerMethodIdx( long TenantId,
		long ServerMethodId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ServerTypeIdx key.
	 *
	 *	@param	argTypeTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argTypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ServerTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ServerTypeIdx key.
	 *
	 *	@param	argTypeTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argTypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ServerTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId );

	/**
	 *	Get the map of YCFBamParamObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamParamObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamParamObj> readParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId,
		boolean forceRead );

	IYCFBamParamObj readCachedParamByIdIdx( long TenantId,
		long Id );

	IYCFBamParamObj readCachedParamByUNameIdx( long TenantId,
		long ServerMethodId,
		String Name );

	List<IYCFBamParamObj> readCachedParamByValTentIdx( long TenantId );

	List<IYCFBamParamObj> readCachedParamByServerMethodIdx( long TenantId,
		long ServerMethodId );

	List<IYCFBamParamObj> readCachedParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamParamObj> readCachedParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId );

	List<IYCFBamParamObj> readCachedParamByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamParamObj> readCachedParamByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamParamObj> readCachedParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId );

	List<IYCFBamParamObj> readCachedParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId );

	void deepDisposeParamByIdIdx( long TenantId,
		long Id );

	void deepDisposeParamByUNameIdx( long TenantId,
		long ServerMethodId,
		String Name );

	void deepDisposeParamByValTentIdx( long TenantId );

	void deepDisposeParamByServerMethodIdx( long TenantId,
		long ServerMethodId );

	void deepDisposeParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId );

	void deepDisposeParamByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeParamByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId );

	void deepDisposeParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	IYCFBamParamObj updateParam( IYCFBamParamObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteParam( IYCFBamParamObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByUNameIdx(long TenantId,
		long ServerMethodId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByServerMethodIdx( long TenantId,
		long ServerMethodId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTypeTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argTypeId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByServerTypeIdx( Long TypeTenantId,
		Long TypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByContPrevIdx( long TenantId,
		long ServerMethodId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByContNextIdx( long TenantId,
		long ServerMethodId,
		Long NextId );

	/**
	 *	Move the YCFBamParamObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamParamObj refreshed cache instance.
	 */
	IYCFBamParamObj moveUpParam( IYCFBamParamObj Obj );

	/**
	 *	Move the YCFBamParamObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamParamObj refreshed cache instance.
	 */
	IYCFBamParamObj moveDownParam( IYCFBamParamObj Obj );
}
