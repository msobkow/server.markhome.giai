// Description: Java 11 Table Object interface for YCFInt.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFIntTopProjectTableObj
{
	IYCFIntSchemaObj getSchema();
	void setSchema( IYCFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TopProject instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFIntTopProjectObj newInstance();

	/**
	 *	Instantiate a new TopProject edition of the specified TopProject instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFIntTopProjectEditObj newEditInstance( IYCFIntTopProjectObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFIntTopProjectObj realiseTopProject( IYCFIntTopProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFIntTopProjectObj createTopProject( IYCFIntTopProjectObj Obj );

	/**
	 *	Read a TopProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntTopProjectObj readTopProject( YCFIntTopProjectPKey pkey );

	/**
	 *	Read a TopProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntTopProjectObj readTopProject( YCFIntTopProjectPKey pkey,
		boolean forceRead );

	IYCFIntTopProjectObj readCachedTopProject( YCFIntTopProjectPKey pkey );

	public void reallyDeepDisposeTopProject( IYCFIntTopProjectObj obj );

	void deepDisposeTopProject( YCFIntTopProjectPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFIntTopProjectObj lockTopProject( YCFIntTopProjectPKey pkey );

	/**
	 *	Return a sorted list of all the TopProject-derived instances in the database.
	 *
	 *	@return	List of IYCFIntTopProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntTopProjectObj> readAllTopProject();

	/**
	 *	Return a sorted map of all the TopProject-derived instances in the database.
	 *
	 *	@return	List of IYCFIntTopProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntTopProjectObj> readAllTopProject( boolean forceRead );

	List<IYCFIntTopProjectObj> readCachedAllTopProject();

	/**
	 *	Get the YCFIntTopProjectObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTopProjectObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTopProjectObj readTopProjectByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFIntTopProjectObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTopProjectObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTopProjectObj readTopProjectByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntTopProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTopProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTopProjectObj> readTopProjectByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFIntTopProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTopProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTopProjectObj> readTopProjectByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntTopProjectObj instances sorted by their primary keys for the duplicate TopDomainIdx key.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTopProjectObj cached instances sorted by their primary keys for the duplicate TopDomainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTopProjectObj> readTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId );

	/**
	 *	Get the map of YCFIntTopProjectObj instances sorted by their primary keys for the duplicate TopDomainIdx key.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTopProjectObj cached instances sorted by their primary keys for the duplicate TopDomainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTopProjectObj> readTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId,
		boolean forceRead );

	/**
	 *	Get the YCFIntTopProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTopProjectObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTopProjectObj readTopProjectByNameIdx(long TenantId,
		long TopDomainId,
		String Name );

	/**
	 *	Get the YCFIntTopProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTopProjectObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTopProjectObj readTopProjectByNameIdx(long TenantId,
		long TopDomainId,
		String Name,
		boolean forceRead );

	IYCFIntTopProjectObj readCachedTopProjectByIdIdx( long TenantId,
		long Id );

	List<IYCFIntTopProjectObj> readCachedTopProjectByTenantIdx( long TenantId );

	List<IYCFIntTopProjectObj> readCachedTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId );

	IYCFIntTopProjectObj readCachedTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name );

	void deepDisposeTopProjectByIdIdx( long TenantId,
		long Id );

	void deepDisposeTopProjectByTenantIdx( long TenantId );

	void deepDisposeTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId );

	void deepDisposeTopProjectByNameIdx( long TenantId,
		long TopDomainId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFIntTopProjectObj updateTopProject( IYCFIntTopProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopProject( IYCFIntTopProjectObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByTopDomainIdx( long TenantId,
		long TopDomainId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByNameIdx(long TenantId,
		long TopDomainId,
		String Name );
}
