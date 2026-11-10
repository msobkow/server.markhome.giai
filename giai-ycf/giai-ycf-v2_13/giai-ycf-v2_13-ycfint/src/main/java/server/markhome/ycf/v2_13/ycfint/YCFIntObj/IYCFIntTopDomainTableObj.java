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

public interface IYCFIntTopDomainTableObj
{
	IYCFIntSchemaObj getSchema();
	void setSchema( IYCFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TopDomain instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFIntTopDomainObj newInstance();

	/**
	 *	Instantiate a new TopDomain edition of the specified TopDomain instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFIntTopDomainEditObj newEditInstance( IYCFIntTopDomainObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFIntTopDomainObj realiseTopDomain( IYCFIntTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFIntTopDomainObj createTopDomain( IYCFIntTopDomainObj Obj );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntTopDomainObj readTopDomain( YCFIntTopDomainPKey pkey );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntTopDomainObj readTopDomain( YCFIntTopDomainPKey pkey,
		boolean forceRead );

	IYCFIntTopDomainObj readCachedTopDomain( YCFIntTopDomainPKey pkey );

	public void reallyDeepDisposeTopDomain( IYCFIntTopDomainObj obj );

	void deepDisposeTopDomain( YCFIntTopDomainPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFIntTopDomainObj lockTopDomain( YCFIntTopDomainPKey pkey );

	/**
	 *	Return a sorted list of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of IYCFIntTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntTopDomainObj> readAllTopDomain();

	/**
	 *	Return a sorted map of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of IYCFIntTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntTopDomainObj> readAllTopDomain( boolean forceRead );

	List<IYCFIntTopDomainObj> readCachedAllTopDomain();

	/**
	 *	Get the YCFIntTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTopDomainObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTopDomainObj readTopDomainByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFIntTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTopDomainObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTopDomainObj readTopDomainByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTopDomainObj> readTopDomainByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFIntTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTopDomainObj> readTopDomainByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTopDomainObj> readTopDomainByTldIdx( long TenantId,
		long TldId );

	/**
	 *	Get the map of YCFIntTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTopDomainObj> readTopDomainByTldIdx( long TenantId,
		long TldId,
		boolean forceRead );

	/**
	 *	Get the YCFIntTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTopDomainObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTopDomainObj readTopDomainByNameIdx(long TenantId,
		long TldId,
		String Name );

	/**
	 *	Get the YCFIntTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTopDomainObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTopDomainObj readTopDomainByNameIdx(long TenantId,
		long TldId,
		String Name,
		boolean forceRead );

	IYCFIntTopDomainObj readCachedTopDomainByIdIdx( long TenantId,
		long Id );

	List<IYCFIntTopDomainObj> readCachedTopDomainByTenantIdx( long TenantId );

	List<IYCFIntTopDomainObj> readCachedTopDomainByTldIdx( long TenantId,
		long TldId );

	IYCFIntTopDomainObj readCachedTopDomainByNameIdx( long TenantId,
		long TldId,
		String Name );

	void deepDisposeTopDomainByIdIdx( long TenantId,
		long Id );

	void deepDisposeTopDomainByTenantIdx( long TenantId );

	void deepDisposeTopDomainByTldIdx( long TenantId,
		long TldId );

	void deepDisposeTopDomainByNameIdx( long TenantId,
		long TldId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFIntTopDomainObj updateTopDomain( IYCFIntTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopDomain( IYCFIntTopDomainObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTldIdx( long TenantId,
		long TldId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argTldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByNameIdx(long TenantId,
		long TldId,
		String Name );
}
