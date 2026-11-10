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

public interface IYCFSecHostNodeTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new HostNode instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecHostNodeObj newInstance();

	/**
	 *	Instantiate a new HostNode edition of the specified HostNode instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecHostNodeEditObj newEditInstance( IYCFSecHostNodeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecHostNodeObj realiseHostNode( IYCFSecHostNodeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecHostNodeObj createHostNode( IYCFSecHostNodeObj Obj );

	/**
	 *	Read a HostNode-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The HostNode-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecHostNodeObj readHostNode( YCFSecHostNodePKey pkey );

	/**
	 *	Read a HostNode-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The HostNode-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecHostNodeObj readHostNode( YCFSecHostNodePKey pkey,
		boolean forceRead );

	IYCFSecHostNodeObj readCachedHostNode( YCFSecHostNodePKey pkey );

	public void reallyDeepDisposeHostNode( IYCFSecHostNodeObj obj );

	void deepDisposeHostNode( YCFSecHostNodePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecHostNodeObj lockHostNode( YCFSecHostNodePKey pkey );

	/**
	 *	Return a sorted list of all the HostNode-derived instances in the database.
	 *
	 *	@return	List of IYCFSecHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecHostNodeObj> readAllHostNode();

	/**
	 *	Return a sorted map of all the HostNode-derived instances in the database.
	 *
	 *	@return	List of IYCFSecHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecHostNodeObj> readAllHostNode( boolean forceRead );

	List<IYCFSecHostNodeObj> readCachedAllHostNode();

	/**
	 *	Return a sorted map of a page of the HostNode-derived instances in the database.
	 *
	 *	@return	List of IYCFSecHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecHostNodeObj> pageAllHostNode(Long priorClusterId,
		Long priorHostNodeId );

	/**
	 *	Get the YCFSecHostNodeObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecHostNodeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	/**
	 *	Get the YCFSecHostNodeObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecHostNodeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecHostNodeObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecHostNodeObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecHostNodeObj> readHostNodeByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecHostNodeObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecHostNodeObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecHostNodeObj> readHostNodeByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the YCFSecHostNodeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecHostNodeObj cached instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecHostNodeObj readHostNodeByUDescrIdx(long ClusterId,
		String Description );

	/**
	 *	Get the YCFSecHostNodeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecHostNodeObj refreshed instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecHostNodeObj readHostNodeByUDescrIdx(long ClusterId,
		String Description,
		boolean forceRead );

	/**
	 *	Get the YCFSecHostNodeObj instance for the unique HostNameIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecHostNodeObj cached instance for the unique HostNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecHostNodeObj readHostNodeByHostNameIdx(long ClusterId,
		String HostName );

	/**
	 *	Get the YCFSecHostNodeObj instance for the unique HostNameIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecHostNodeObj refreshed instance for the unique HostNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecHostNodeObj readHostNodeByHostNameIdx(long ClusterId,
		String HostName,
		boolean forceRead );

	IYCFSecHostNodeObj readCachedHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	List<IYCFSecHostNodeObj> readCachedHostNodeByClusterIdx( long ClusterId );

	IYCFSecHostNodeObj readCachedHostNodeByUDescrIdx( long ClusterId,
		String Description );

	IYCFSecHostNodeObj readCachedHostNodeByHostNameIdx( long ClusterId,
		String HostName );

	void deepDisposeHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	void deepDisposeHostNodeByClusterIdx( long ClusterId );

	void deepDisposeHostNodeByUDescrIdx( long ClusterId,
		String Description );

	void deepDisposeHostNodeByHostNameIdx( long ClusterId,
		String HostName );

	/**
	 *	Read a page of data as a List of HostNode-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	A List of HostNode-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecHostNodeObj> pageHostNodeByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorHostNodeId );

	/**
	 *	Internal use only.
	 */
	IYCFSecHostNodeObj updateHostNode( IYCFSecHostNodeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteHostNode( IYCFSecHostNodeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByUDescrIdx(long ClusterId,
		String Description );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByHostNameIdx(long ClusterId,
		String HostName );
}
