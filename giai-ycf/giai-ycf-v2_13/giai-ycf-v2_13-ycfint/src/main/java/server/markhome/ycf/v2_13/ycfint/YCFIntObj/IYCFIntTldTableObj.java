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

public interface IYCFIntTldTableObj
{
	IYCFIntSchemaObj getSchema();
	void setSchema( IYCFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Tld instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFIntTldObj newInstance();

	/**
	 *	Instantiate a new Tld edition of the specified Tld instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFIntTldEditObj newEditInstance( IYCFIntTldObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFIntTldObj realiseTld( IYCFIntTldObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFIntTldObj createTld( IYCFIntTldObj Obj );

	/**
	 *	Read a Tld-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tld-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntTldObj readTld( YCFIntTldPKey pkey );

	/**
	 *	Read a Tld-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tld-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntTldObj readTld( YCFIntTldPKey pkey,
		boolean forceRead );

	IYCFIntTldObj readCachedTld( YCFIntTldPKey pkey );

	public void reallyDeepDisposeTld( IYCFIntTldObj obj );

	void deepDisposeTld( YCFIntTldPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFIntTldObj lockTld( YCFIntTldPKey pkey );

	/**
	 *	Return a sorted list of all the Tld-derived instances in the database.
	 *
	 *	@return	List of IYCFIntTldObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntTldObj> readAllTld();

	/**
	 *	Return a sorted map of all the Tld-derived instances in the database.
	 *
	 *	@return	List of IYCFIntTldObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntTldObj> readAllTld( boolean forceRead );

	List<IYCFIntTldObj> readCachedAllTld();

	/**
	 *	Get the YCFIntTldObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTldObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTldObj readTldByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFIntTldObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTldObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTldObj readTldByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntTldObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTldObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTldObj> readTldByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFIntTldObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntTldObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntTldObj> readTldByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the YCFIntTldObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTldObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTldObj readTldByNameIdx(long TenantId,
		String Name );

	/**
	 *	Get the YCFIntTldObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntTldObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntTldObj readTldByNameIdx(long TenantId,
		String Name,
		boolean forceRead );

	IYCFIntTldObj readCachedTldByIdIdx( long TenantId,
		long Id );

	List<IYCFIntTldObj> readCachedTldByTenantIdx( long TenantId );

	IYCFIntTldObj readCachedTldByNameIdx( long TenantId,
		String Name );

	void deepDisposeTldByIdIdx( long TenantId,
		long Id );

	void deepDisposeTldByTenantIdx( long TenantId );

	void deepDisposeTldByNameIdx( long TenantId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFIntTldObj updateTld( IYCFIntTldObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTld( IYCFIntTldObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByNameIdx(long TenantId,
		String Name );
}
