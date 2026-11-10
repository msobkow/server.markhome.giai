// Description: Java 11 Table Object interface for YCFSec.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public interface IYCFSecSecAppTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecApp instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSecAppObj newInstance();

	/**
	 *	Instantiate a new SecApp edition of the specified SecApp instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSecAppEditObj newEditInstance( IYCFSecSecAppObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecAppObj realiseSecApp( IYCFSecSecAppObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecAppObj createSecApp( IYCFSecSecAppObj Obj );

	/**
	 *	Read a SecApp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecApp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecAppObj readSecApp( YCFSecSecAppPKey pkey );

	/**
	 *	Read a SecApp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecApp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecAppObj readSecApp( YCFSecSecAppPKey pkey,
		boolean forceRead );

	IYCFSecSecAppObj readCachedSecApp( YCFSecSecAppPKey pkey );

	public void reallyDeepDisposeSecApp( IYCFSecSecAppObj obj );

	void deepDisposeSecApp( YCFSecSecAppPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecAppObj lockSecApp( YCFSecSecAppPKey pkey );

	/**
	 *	Return a sorted list of all the SecApp-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecAppObj> readAllSecApp();

	/**
	 *	Return a sorted map of all the SecApp-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecAppObj> readAllSecApp( boolean forceRead );

	List<IYCFSecSecAppObj> readCachedAllSecApp();

	/**
	 *	Return a sorted map of a page of the SecApp-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecAppObj> pageAllSecApp(Long priorClusterId,
		Integer priorSecAppId );

	/**
	 *	Get the YCFSecSecAppObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecAppObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the YCFSecSecAppObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecAppObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecAppObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecAppObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecAppObj> readSecAppByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecSecAppObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecAppObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecAppObj> readSecAppByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the YCFSecSecAppObj instance for the unique UJEEMountIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecAppObj cached instance for the unique UJEEMountIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecAppObj readSecAppByUJEEMountIdx(long ClusterId,
		String JEEMountName );

	/**
	 *	Get the YCFSecSecAppObj instance for the unique UJEEMountIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecAppObj refreshed instance for the unique UJEEMountIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecAppObj readSecAppByUJEEMountIdx(long ClusterId,
		String JEEMountName,
		boolean forceRead );

	IYCFSecSecAppObj readCachedSecAppByIdIdx( long ClusterId,
		int SecAppId );

	List<IYCFSecSecAppObj> readCachedSecAppByClusterIdx( long ClusterId );

	IYCFSecSecAppObj readCachedSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName );

	void deepDisposeSecAppByIdIdx( long ClusterId,
		int SecAppId );

	void deepDisposeSecAppByClusterIdx( long ClusterId );

	void deepDisposeSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName );

	/**
	 *	Read a page of data as a List of SecApp-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecApp-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecAppObj> pageSecAppByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecAppId );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecAppObj updateSecApp( IYCFSecSecAppObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecApp( IYCFSecSecAppObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByIdIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByUJEEMountIdx(long ClusterId,
		String JEEMountName );
}
