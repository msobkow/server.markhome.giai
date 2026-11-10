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

public interface IYCFSecSysClusterTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SysCluster instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSysClusterObj newInstance();

	/**
	 *	Instantiate a new SysCluster edition of the specified SysCluster instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSysClusterEditObj newEditInstance( IYCFSecSysClusterObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSysClusterObj realiseSysCluster( IYCFSecSysClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSysClusterObj createSysCluster( IYCFSecSysClusterObj Obj );

	/**
	 *	Read a SysCluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SysCluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSysClusterObj readSysCluster( YCFSecSysClusterPKey pkey );

	/**
	 *	Read a SysCluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SysCluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSysClusterObj readSysCluster( YCFSecSysClusterPKey pkey,
		boolean forceRead );

	IYCFSecSysClusterObj readCachedSysCluster( YCFSecSysClusterPKey pkey );

	public void reallyDeepDisposeSysCluster( IYCFSecSysClusterObj obj );

	void deepDisposeSysCluster( YCFSecSysClusterPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSysClusterObj lockSysCluster( YCFSecSysClusterPKey pkey );

	/**
	 *	Return a sorted list of all the SysCluster-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSysClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSysClusterObj> readAllSysCluster();

	/**
	 *	Return a sorted map of all the SysCluster-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSysClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSysClusterObj> readAllSysCluster( boolean forceRead );

	List<IYCFSecSysClusterObj> readCachedAllSysCluster();

	/**
	 *	Get the YCFSecSysClusterObj instance for the primary key attributes.
	 *
	 *	@param	argSingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSysClusterObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSysClusterObj readSysClusterByIdIdx( int SingletonId );

	/**
	 *	Get the YCFSecSysClusterObj instance for the primary key attributes.
	 *
	 *	@param	argSingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSysClusterObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSysClusterObj readSysClusterByIdIdx( int SingletonId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSysClusterObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSysClusterObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSysClusterObj> readSysClusterByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecSysClusterObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSysClusterObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSysClusterObj> readSysClusterByClusterIdx( long ClusterId,
		boolean forceRead );

	IYCFSecSysClusterObj readCachedSysClusterByIdIdx( int SingletonId );

	List<IYCFSecSysClusterObj> readCachedSysClusterByClusterIdx( long ClusterId );

	void deepDisposeSysClusterByIdIdx( int SingletonId );

	void deepDisposeSysClusterByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 */
	IYCFSecSysClusterObj updateSysCluster( IYCFSecSysClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSysCluster( IYCFSecSysClusterObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSingletonId	The SysCluster key attribute of the instance generating the id.
	 */
	void deleteSysClusterByIdIdx( int SingletonId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SysCluster key attribute of the instance generating the id.
	 */
	void deleteSysClusterByClusterIdx( long ClusterId );
}
