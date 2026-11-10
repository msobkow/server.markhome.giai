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

public interface IYCFSecSecGrpMembTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecGrpMemb instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSecGrpMembObj newInstance();

	/**
	 *	Instantiate a new SecGrpMemb edition of the specified SecGrpMemb instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSecGrpMembEditObj newEditInstance( IYCFSecSecGrpMembObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGrpMembObj realiseSecGrpMemb( IYCFSecSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGrpMembObj createSecGrpMemb( IYCFSecSecGrpMembObj Obj );

	/**
	 *	Read a SecGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecGrpMembObj readSecGrpMemb( YCFSecSecGrpMembPKey pkey );

	/**
	 *	Read a SecGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecGrpMembObj readSecGrpMemb( YCFSecSecGrpMembPKey pkey,
		boolean forceRead );

	IYCFSecSecGrpMembObj readCachedSecGrpMemb( YCFSecSecGrpMembPKey pkey );

	public void reallyDeepDisposeSecGrpMemb( IYCFSecSecGrpMembObj obj );

	void deepDisposeSecGrpMemb( YCFSecSecGrpMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGrpMembObj lockSecGrpMemb( YCFSecSecGrpMembPKey pkey );

	/**
	 *	Return a sorted list of all the SecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGrpMembObj> readAllSecGrpMemb();

	/**
	 *	Return a sorted map of all the SecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGrpMembObj> readAllSecGrpMemb( boolean forceRead );

	List<IYCFSecSecGrpMembObj> readCachedAllSecGrpMemb();

	/**
	 *	Return a sorted map of a page of the SecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGrpMembObj> pageAllSecGrpMemb(Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Get the YCFSecSecGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpMembId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGrpMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId );

	/**
	 *	Get the YCFSecSecGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpMembId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGrpMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGrpMembObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpMembObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecSecGrpMembObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpMembObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGrpMembObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpMembObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Get the map of YCFSecSecGrpMembObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpMembObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGrpMembObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpMembObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId );

	/**
	 *	Get the map of YCFSecSecGrpMembObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpMembObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId,
		boolean forceRead );

	/**
	 *	Get the YCFSecSecGrpMembObj instance for the unique UUserIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGrpMembObj cached instance for the unique UUserIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGrpMembObj readSecGrpMembByUUserIdx(long ClusterId,
		int SecGroupId,
		UUID SecUserId );

	/**
	 *	Get the YCFSecSecGrpMembObj instance for the unique UUserIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGrpMembObj refreshed instance for the unique UUserIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGrpMembObj readSecGrpMembByUUserIdx(long ClusterId,
		int SecGroupId,
		UUID SecUserId,
		boolean forceRead );

	IYCFSecSecGrpMembObj readCachedSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId );

	List<IYCFSecSecGrpMembObj> readCachedSecGrpMembByClusterIdx( long ClusterId );

	List<IYCFSecSecGrpMembObj> readCachedSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId );

	List<IYCFSecSecGrpMembObj> readCachedSecGrpMembByUserIdx( UUID SecUserId );

	IYCFSecSecGrpMembObj readCachedSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId );

	void deepDisposeSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId );

	void deepDisposeSecGrpMembByClusterIdx( long ClusterId );

	void deepDisposeSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId );

	void deepDisposeSecGrpMembByUserIdx( UUID SecUserId );

	void deepDisposeSecGrpMembByUUserIdx( long ClusterId,
		int SecGroupId,
		UUID SecUserId );

	/**
	 *	Read a page of data as a List of SecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGrpMembObj> pageSecGrpMembByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Read a page of data as a List of SecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGrpMembObj> pageSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Read a page of data as a List of SecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate UserIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGrpMembObj> pageSecGrpMembByUserIdx( UUID SecUserId,
		Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGrpMembObj updateSecGrpMemb( IYCFSecSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGrpMemb( IYCFSecSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpMembId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByUserIdx( UUID SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByUUserIdx(long ClusterId,
		int SecGroupId,
		UUID SecUserId );
}
