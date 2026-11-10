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

public interface IYCFSecServiceTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Service instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecServiceObj newInstance();

	/**
	 *	Instantiate a new Service edition of the specified Service instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecServiceEditObj newEditInstance( IYCFSecServiceObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecServiceObj realiseService( IYCFSecServiceObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecServiceObj createService( IYCFSecServiceObj Obj );

	/**
	 *	Read a Service-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Service-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecServiceObj readService( YCFSecServicePKey pkey );

	/**
	 *	Read a Service-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Service-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecServiceObj readService( YCFSecServicePKey pkey,
		boolean forceRead );

	IYCFSecServiceObj readCachedService( YCFSecServicePKey pkey );

	public void reallyDeepDisposeService( IYCFSecServiceObj obj );

	void deepDisposeService( YCFSecServicePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecServiceObj lockService( YCFSecServicePKey pkey );

	/**
	 *	Return a sorted list of all the Service-derived instances in the database.
	 *
	 *	@return	List of IYCFSecServiceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecServiceObj> readAllService();

	/**
	 *	Return a sorted map of all the Service-derived instances in the database.
	 *
	 *	@return	List of IYCFSecServiceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecServiceObj> readAllService( boolean forceRead );

	List<IYCFSecServiceObj> readCachedAllService();

	/**
	 *	Return a sorted map of a page of the Service-derived instances in the database.
	 *
	 *	@return	List of IYCFSecServiceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecServiceObj> pageAllService(Long priorClusterId,
		Long priorServiceId );

	/**
	 *	Get the YCFSecServiceObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceObj readServiceByIdIdx( long ClusterId,
		long ServiceId );

	/**
	 *	Get the YCFSecServiceObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceObj readServiceByIdIdx( long ClusterId,
		long ServiceId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecServiceObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecServiceObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecServiceObj> readServiceByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecServiceObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecServiceObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecServiceObj> readServiceByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecServiceObj instances sorted by their primary keys for the duplicate HostIdx key.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecServiceObj cached instances sorted by their primary keys for the duplicate HostIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecServiceObj> readServiceByHostIdx( long ClusterId,
		long HostNodeId );

	/**
	 *	Get the map of YCFSecServiceObj instances sorted by their primary keys for the duplicate HostIdx key.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecServiceObj cached instances sorted by their primary keys for the duplicate HostIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecServiceObj> readServiceByHostIdx( long ClusterId,
		long HostNodeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecServiceObj instances sorted by their primary keys for the duplicate TypeIdx key.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecServiceObj cached instances sorted by their primary keys for the duplicate TypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecServiceObj> readServiceByTypeIdx( int ServiceTypeId );

	/**
	 *	Get the map of YCFSecServiceObj instances sorted by their primary keys for the duplicate TypeIdx key.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecServiceObj cached instances sorted by their primary keys for the duplicate TypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecServiceObj> readServiceByTypeIdx( int ServiceTypeId,
		boolean forceRead );

	/**
	 *	Get the YCFSecServiceObj instance for the unique UTypeIdx key.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceObj cached instance for the unique UTypeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceObj readServiceByUTypeIdx(long ClusterId,
		long HostNodeId,
		int ServiceTypeId );

	/**
	 *	Get the YCFSecServiceObj instance for the unique UTypeIdx key.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceObj refreshed instance for the unique UTypeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceObj readServiceByUTypeIdx(long ClusterId,
		long HostNodeId,
		int ServiceTypeId,
		boolean forceRead );

	/**
	 *	Get the YCFSecServiceObj instance for the unique UHostPortIdx key.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostPort	The Service key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceObj cached instance for the unique UHostPortIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceObj readServiceByUHostPortIdx(long ClusterId,
		long HostNodeId,
		short HostPort );

	/**
	 *	Get the YCFSecServiceObj instance for the unique UHostPortIdx key.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostPort	The Service key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceObj refreshed instance for the unique UHostPortIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceObj readServiceByUHostPortIdx(long ClusterId,
		long HostNodeId,
		short HostPort,
		boolean forceRead );

	IYCFSecServiceObj readCachedServiceByIdIdx( long ClusterId,
		long ServiceId );

	List<IYCFSecServiceObj> readCachedServiceByClusterIdx( long ClusterId );

	List<IYCFSecServiceObj> readCachedServiceByHostIdx( long ClusterId,
		long HostNodeId );

	List<IYCFSecServiceObj> readCachedServiceByTypeIdx( int ServiceTypeId );

	IYCFSecServiceObj readCachedServiceByUTypeIdx( long ClusterId,
		long HostNodeId,
		int ServiceTypeId );

	IYCFSecServiceObj readCachedServiceByUHostPortIdx( long ClusterId,
		long HostNodeId,
		short HostPort );

	void deepDisposeServiceByIdIdx( long ClusterId,
		long ServiceId );

	void deepDisposeServiceByClusterIdx( long ClusterId );

	void deepDisposeServiceByHostIdx( long ClusterId,
		long HostNodeId );

	void deepDisposeServiceByTypeIdx( int ServiceTypeId );

	void deepDisposeServiceByUTypeIdx( long ClusterId,
		long HostNodeId,
		int ServiceTypeId );

	void deepDisposeServiceByUHostPortIdx( long ClusterId,
		long HostNodeId,
		short HostPort );

	/**
	 *	Read a page of data as a List of Service-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	A List of Service-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecServiceObj> pageServiceByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorServiceId );

	/**
	 *	Read a page of data as a List of Service-derived instances sorted by their primary keys,
	 *	as identified by the duplicate HostIdx key attributes.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	A List of Service-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecServiceObj> pageServiceByHostIdx( long ClusterId,
		long HostNodeId,
		Long priorClusterId,
		Long priorServiceId );

	/**
	 *	Read a page of data as a List of Service-derived instances sorted by their primary keys,
	 *	as identified by the duplicate TypeIdx key attributes.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	A List of Service-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecServiceObj> pageServiceByTypeIdx( int ServiceTypeId,
		Long priorClusterId,
		Long priorServiceId );

	/**
	 *	Internal use only.
	 */
	IYCFSecServiceObj updateService( IYCFSecServiceObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteService( IYCFSecServiceObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByIdIdx( long ClusterId,
		long ServiceId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByHostIdx( long ClusterId,
		long HostNodeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByTypeIdx( int ServiceTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByUTypeIdx(long ClusterId,
		long HostNodeId,
		int ServiceTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostPort	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByUHostPortIdx(long ClusterId,
		long HostNodeId,
		short HostPort );
}
