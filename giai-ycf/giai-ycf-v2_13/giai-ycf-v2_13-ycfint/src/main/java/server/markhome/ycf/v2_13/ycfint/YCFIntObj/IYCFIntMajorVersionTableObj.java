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

public interface IYCFIntMajorVersionTableObj
{
	IYCFIntSchemaObj getSchema();
	void setSchema( IYCFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new MajorVersion instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFIntMajorVersionObj newInstance();

	/**
	 *	Instantiate a new MajorVersion edition of the specified MajorVersion instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFIntMajorVersionEditObj newEditInstance( IYCFIntMajorVersionObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFIntMajorVersionObj realiseMajorVersion( IYCFIntMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFIntMajorVersionObj createMajorVersion( IYCFIntMajorVersionObj Obj );

	/**
	 *	Read a MajorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MajorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntMajorVersionObj readMajorVersion( YCFIntMajorVersionPKey pkey );

	/**
	 *	Read a MajorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MajorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntMajorVersionObj readMajorVersion( YCFIntMajorVersionPKey pkey,
		boolean forceRead );

	IYCFIntMajorVersionObj readCachedMajorVersion( YCFIntMajorVersionPKey pkey );

	public void reallyDeepDisposeMajorVersion( IYCFIntMajorVersionObj obj );

	void deepDisposeMajorVersion( YCFIntMajorVersionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFIntMajorVersionObj lockMajorVersion( YCFIntMajorVersionPKey pkey );

	/**
	 *	Return a sorted list of all the MajorVersion-derived instances in the database.
	 *
	 *	@return	List of IYCFIntMajorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntMajorVersionObj> readAllMajorVersion();

	/**
	 *	Return a sorted map of all the MajorVersion-derived instances in the database.
	 *
	 *	@return	List of IYCFIntMajorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntMajorVersionObj> readAllMajorVersion( boolean forceRead );

	List<IYCFIntMajorVersionObj> readCachedAllMajorVersion();

	/**
	 *	Get the YCFIntMajorVersionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMajorVersionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMajorVersionObj readMajorVersionByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFIntMajorVersionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMajorVersionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMajorVersionObj readMajorVersionByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntMajorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntMajorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntMajorVersionObj> readMajorVersionByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFIntMajorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntMajorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntMajorVersionObj> readMajorVersionByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntMajorVersionObj instances sorted by their primary keys for the duplicate SubProjectIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntMajorVersionObj cached instances sorted by their primary keys for the duplicate SubProjectIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntMajorVersionObj> readMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId );

	/**
	 *	Get the map of YCFIntMajorVersionObj instances sorted by their primary keys for the duplicate SubProjectIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntMajorVersionObj cached instances sorted by their primary keys for the duplicate SubProjectIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntMajorVersionObj> readMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId,
		boolean forceRead );

	/**
	 *	Get the YCFIntMajorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMajorVersionObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMajorVersionObj readMajorVersionByNameIdx(long TenantId,
		long SubProjectId,
		String Name );

	/**
	 *	Get the YCFIntMajorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMajorVersionObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMajorVersionObj readMajorVersionByNameIdx(long TenantId,
		long SubProjectId,
		String Name,
		boolean forceRead );

	IYCFIntMajorVersionObj readCachedMajorVersionByIdIdx( long TenantId,
		long Id );

	List<IYCFIntMajorVersionObj> readCachedMajorVersionByTenantIdx( long TenantId );

	List<IYCFIntMajorVersionObj> readCachedMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId );

	IYCFIntMajorVersionObj readCachedMajorVersionByNameIdx( long TenantId,
		long SubProjectId,
		String Name );

	void deepDisposeMajorVersionByIdIdx( long TenantId,
		long Id );

	void deepDisposeMajorVersionByTenantIdx( long TenantId );

	void deepDisposeMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId );

	void deepDisposeMajorVersionByNameIdx( long TenantId,
		long SubProjectId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFIntMajorVersionObj updateMajorVersion( IYCFIntMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMajorVersion( IYCFIntMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionBySubProjectIdx( long TenantId,
		long SubProjectId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argSubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByNameIdx(long TenantId,
		long SubProjectId,
		String Name );
}
