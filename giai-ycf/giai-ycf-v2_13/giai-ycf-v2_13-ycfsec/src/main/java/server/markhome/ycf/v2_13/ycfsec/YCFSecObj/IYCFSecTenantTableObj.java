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

public interface IYCFSecTenantTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Tenant instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecTenantObj newInstance();

	/**
	 *	Instantiate a new Tenant edition of the specified Tenant instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecTenantEditObj newEditInstance( IYCFSecTenantObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecTenantObj realiseTenant( IYCFSecTenantObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecTenantObj createTenant( IYCFSecTenantObj Obj );

	/**
	 *	Read a Tenant-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tenant-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecTenantObj readTenant( YCFSecTenantPKey pkey );

	/**
	 *	Read a Tenant-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tenant-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecTenantObj readTenant( YCFSecTenantPKey pkey,
		boolean forceRead );

	IYCFSecTenantObj readCachedTenant( YCFSecTenantPKey pkey );

	public void reallyDeepDisposeTenant( IYCFSecTenantObj obj );

	void deepDisposeTenant( YCFSecTenantPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecTenantObj lockTenant( YCFSecTenantPKey pkey );

	/**
	 *	Return a sorted list of all the Tenant-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTenantObj> readAllTenant();

	/**
	 *	Return a sorted map of all the Tenant-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTenantObj> readAllTenant( boolean forceRead );

	List<IYCFSecTenantObj> readCachedAllTenant();

	/**
	 *	Return a sorted map of a page of the Tenant-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTenantObj> pageAllTenant(Long priorId );

	/**
	 *	Get the YCFSecTenantObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTenantObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTenantObj readTenantByIdIdx( long Id );

	/**
	 *	Get the YCFSecTenantObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTenantObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTenantObj readTenantByIdIdx( long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecTenantObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTenantObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTenantObj> readTenantByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecTenantObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTenantObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTenantObj> readTenantByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the YCFSecTenantObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	argTenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTenantObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTenantObj readTenantByUNameIdx(long ClusterId,
		String TenantName );

	/**
	 *	Get the YCFSecTenantObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	argTenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTenantObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTenantObj readTenantByUNameIdx(long ClusterId,
		String TenantName,
		boolean forceRead );

	IYCFSecTenantObj readCachedTenantByIdIdx( long Id );

	List<IYCFSecTenantObj> readCachedTenantByClusterIdx( long ClusterId );

	IYCFSecTenantObj readCachedTenantByUNameIdx( long ClusterId,
		String TenantName );

	void deepDisposeTenantByIdIdx( long Id );

	void deepDisposeTenantByClusterIdx( long ClusterId );

	void deepDisposeTenantByUNameIdx( long ClusterId,
		String TenantName );

	/**
	 *	Read a page of data as a List of Tenant-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	A List of Tenant-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecTenantObj> pageTenantByClusterIdx( long ClusterId,
		Long priorId );

	/**
	 *	Internal use only.
	 */
	IYCFSecTenantObj updateTenant( IYCFSecTenantObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTenant( IYCFSecTenantObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The Tenant key attribute of the instance generating the id.
	 */
	void deleteTenantByIdIdx( long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 */
	void deleteTenantByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	argTenantName	The Tenant key attribute of the instance generating the id.
	 */
	void deleteTenantByUNameIdx(long ClusterId,
		String TenantName );

	IYCFSecTenantObj getSystemTenant();
}
