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

public interface IYCFIntMinorVersionTableObj
{
	IYCFIntSchemaObj getSchema();
	void setSchema( IYCFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new MinorVersion instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFIntMinorVersionObj newInstance();

	/**
	 *	Instantiate a new MinorVersion edition of the specified MinorVersion instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFIntMinorVersionEditObj newEditInstance( IYCFIntMinorVersionObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFIntMinorVersionObj realiseMinorVersion( IYCFIntMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFIntMinorVersionObj createMinorVersion( IYCFIntMinorVersionObj Obj );

	/**
	 *	Read a MinorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MinorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntMinorVersionObj readMinorVersion( YCFIntMinorVersionPKey pkey );

	/**
	 *	Read a MinorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MinorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntMinorVersionObj readMinorVersion( YCFIntMinorVersionPKey pkey,
		boolean forceRead );

	IYCFIntMinorVersionObj readCachedMinorVersion( YCFIntMinorVersionPKey pkey );

	public void reallyDeepDisposeMinorVersion( IYCFIntMinorVersionObj obj );

	void deepDisposeMinorVersion( YCFIntMinorVersionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFIntMinorVersionObj lockMinorVersion( YCFIntMinorVersionPKey pkey );

	/**
	 *	Return a sorted list of all the MinorVersion-derived instances in the database.
	 *
	 *	@return	List of IYCFIntMinorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntMinorVersionObj> readAllMinorVersion();

	/**
	 *	Return a sorted map of all the MinorVersion-derived instances in the database.
	 *
	 *	@return	List of IYCFIntMinorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntMinorVersionObj> readAllMinorVersion( boolean forceRead );

	List<IYCFIntMinorVersionObj> readCachedAllMinorVersion();

	/**
	 *	Get the YCFIntMinorVersionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMinorVersionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMinorVersionObj readMinorVersionByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFIntMinorVersionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMinorVersionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMinorVersionObj readMinorVersionByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntMinorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntMinorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntMinorVersionObj> readMinorVersionByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFIntMinorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntMinorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntMinorVersionObj> readMinorVersionByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntMinorVersionObj instances sorted by their primary keys for the duplicate MajorVerIdx key.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntMinorVersionObj cached instances sorted by their primary keys for the duplicate MajorVerIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntMinorVersionObj> readMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId );

	/**
	 *	Get the map of YCFIntMinorVersionObj instances sorted by their primary keys for the duplicate MajorVerIdx key.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntMinorVersionObj cached instances sorted by their primary keys for the duplicate MajorVerIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntMinorVersionObj> readMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId,
		boolean forceRead );

	/**
	 *	Get the YCFIntMinorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMinorVersionObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMinorVersionObj readMinorVersionByNameIdx(long TenantId,
		long MajorVersionId,
		String Name );

	/**
	 *	Get the YCFIntMinorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMinorVersionObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMinorVersionObj readMinorVersionByNameIdx(long TenantId,
		long MajorVersionId,
		String Name,
		boolean forceRead );

	IYCFIntMinorVersionObj readCachedMinorVersionByIdIdx( long TenantId,
		long Id );

	List<IYCFIntMinorVersionObj> readCachedMinorVersionByTenantIdx( long TenantId );

	List<IYCFIntMinorVersionObj> readCachedMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId );

	IYCFIntMinorVersionObj readCachedMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name );

	void deepDisposeMinorVersionByIdIdx( long TenantId,
		long Id );

	void deepDisposeMinorVersionByTenantIdx( long TenantId );

	void deepDisposeMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId );

	void deepDisposeMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFIntMinorVersionObj updateMinorVersion( IYCFIntMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMinorVersion( IYCFIntMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByNameIdx(long TenantId,
		long MajorVersionId,
		String Name );
}
