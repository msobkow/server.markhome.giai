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

public interface IYCFIntSubProjectTableObj
{
	IYCFIntSchemaObj getSchema();
	void setSchema( IYCFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SubProject instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFIntSubProjectObj newInstance();

	/**
	 *	Instantiate a new SubProject edition of the specified SubProject instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFIntSubProjectEditObj newEditInstance( IYCFIntSubProjectObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFIntSubProjectObj realiseSubProject( IYCFIntSubProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFIntSubProjectObj createSubProject( IYCFIntSubProjectObj Obj );

	/**
	 *	Read a SubProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SubProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntSubProjectObj readSubProject( YCFIntSubProjectPKey pkey );

	/**
	 *	Read a SubProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SubProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntSubProjectObj readSubProject( YCFIntSubProjectPKey pkey,
		boolean forceRead );

	IYCFIntSubProjectObj readCachedSubProject( YCFIntSubProjectPKey pkey );

	public void reallyDeepDisposeSubProject( IYCFIntSubProjectObj obj );

	void deepDisposeSubProject( YCFIntSubProjectPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFIntSubProjectObj lockSubProject( YCFIntSubProjectPKey pkey );

	/**
	 *	Return a sorted list of all the SubProject-derived instances in the database.
	 *
	 *	@return	List of IYCFIntSubProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntSubProjectObj> readAllSubProject();

	/**
	 *	Return a sorted map of all the SubProject-derived instances in the database.
	 *
	 *	@return	List of IYCFIntSubProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntSubProjectObj> readAllSubProject( boolean forceRead );

	List<IYCFIntSubProjectObj> readCachedAllSubProject();

	/**
	 *	Get the YCFIntSubProjectObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntSubProjectObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntSubProjectObj readSubProjectByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFIntSubProjectObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntSubProjectObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntSubProjectObj readSubProjectByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntSubProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntSubProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntSubProjectObj> readSubProjectByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFIntSubProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntSubProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntSubProjectObj> readSubProjectByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntSubProjectObj instances sorted by their primary keys for the duplicate TopProjectIdx key.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntSubProjectObj cached instances sorted by their primary keys for the duplicate TopProjectIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntSubProjectObj> readSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId );

	/**
	 *	Get the map of YCFIntSubProjectObj instances sorted by their primary keys for the duplicate TopProjectIdx key.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntSubProjectObj cached instances sorted by their primary keys for the duplicate TopProjectIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntSubProjectObj> readSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId,
		boolean forceRead );

	/**
	 *	Get the YCFIntSubProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntSubProjectObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntSubProjectObj readSubProjectByNameIdx(long TenantId,
		long TopProjectId,
		String Name );

	/**
	 *	Get the YCFIntSubProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntSubProjectObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntSubProjectObj readSubProjectByNameIdx(long TenantId,
		long TopProjectId,
		String Name,
		boolean forceRead );

	IYCFIntSubProjectObj readCachedSubProjectByIdIdx( long TenantId,
		long Id );

	List<IYCFIntSubProjectObj> readCachedSubProjectByTenantIdx( long TenantId );

	List<IYCFIntSubProjectObj> readCachedSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId );

	IYCFIntSubProjectObj readCachedSubProjectByNameIdx( long TenantId,
		long TopProjectId,
		String Name );

	void deepDisposeSubProjectByIdIdx( long TenantId,
		long Id );

	void deepDisposeSubProjectByTenantIdx( long TenantId );

	void deepDisposeSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId );

	void deepDisposeSubProjectByNameIdx( long TenantId,
		long TopProjectId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFIntSubProjectObj updateSubProject( IYCFIntSubProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSubProject( IYCFIntSubProjectObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByTopProjectIdx( long TenantId,
		long TopProjectId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByNameIdx(long TenantId,
		long TopProjectId,
		String Name );
}
