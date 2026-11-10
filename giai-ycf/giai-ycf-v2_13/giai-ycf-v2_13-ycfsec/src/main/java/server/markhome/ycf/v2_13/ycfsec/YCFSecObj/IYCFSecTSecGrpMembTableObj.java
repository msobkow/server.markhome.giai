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

public interface IYCFSecTSecGrpMembTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TSecGrpMemb instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecTSecGrpMembObj newInstance();

	/**
	 *	Instantiate a new TSecGrpMemb edition of the specified TSecGrpMemb instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecTSecGrpMembEditObj newEditInstance( IYCFSecTSecGrpMembObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGrpMembObj realiseTSecGrpMemb( IYCFSecTSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGrpMembObj createTSecGrpMemb( IYCFSecTSecGrpMembObj Obj );

	/**
	 *	Read a TSecGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecTSecGrpMembObj readTSecGrpMemb( YCFSecTSecGrpMembPKey pkey );

	/**
	 *	Read a TSecGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecTSecGrpMembObj readTSecGrpMemb( YCFSecTSecGrpMembPKey pkey,
		boolean forceRead );

	IYCFSecTSecGrpMembObj readCachedTSecGrpMemb( YCFSecTSecGrpMembPKey pkey );

	public void reallyDeepDisposeTSecGrpMemb( IYCFSecTSecGrpMembObj obj );

	void deepDisposeTSecGrpMemb( YCFSecTSecGrpMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGrpMembObj lockTSecGrpMemb( YCFSecTSecGrpMembPKey pkey );

	/**
	 *	Return a sorted list of all the TSecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> readAllTSecGrpMemb();

	/**
	 *	Return a sorted map of all the TSecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> readAllTSecGrpMemb( boolean forceRead );

	List<IYCFSecTSecGrpMembObj> readCachedAllTSecGrpMemb();

	/**
	 *	Return a sorted map of a page of the TSecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> pageAllTSecGrpMemb(Long priorTenantId,
		Long priorTSecGrpMembId );

	/**
	 *	Get the YCFSecTSecGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpMembId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGrpMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGrpMembObj readTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId );

	/**
	 *	Get the YCFSecTSecGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpMembId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGrpMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGrpMembObj readTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecTSecGrpMembObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpMembObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> readTSecGrpMembByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFSecTSecGrpMembObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpMembObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> readTSecGrpMembByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecTSecGrpMembObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpMembObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> readTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Get the map of YCFSecTSecGrpMembObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpMembObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> readTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecTSecGrpMembObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpMembObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> readTSecGrpMembByUserIdx( UUID SecUserId );

	/**
	 *	Get the map of YCFSecTSecGrpMembObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpMembObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> readTSecGrpMembByUserIdx( UUID SecUserId,
		boolean forceRead );

	/**
	 *	Get the YCFSecTSecGrpMembObj instance for the unique UUserIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGrpMembObj cached instance for the unique UUserIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGrpMembObj readTSecGrpMembByUUserIdx(long TenantId,
		int TSecGroupId,
		UUID SecUserId );

	/**
	 *	Get the YCFSecTSecGrpMembObj instance for the unique UUserIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGrpMembObj refreshed instance for the unique UUserIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGrpMembObj readTSecGrpMembByUUserIdx(long TenantId,
		int TSecGroupId,
		UUID SecUserId,
		boolean forceRead );

	IYCFSecTSecGrpMembObj readCachedTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId );

	List<IYCFSecTSecGrpMembObj> readCachedTSecGrpMembByTenantIdx( long TenantId );

	List<IYCFSecTSecGrpMembObj> readCachedTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId );

	List<IYCFSecTSecGrpMembObj> readCachedTSecGrpMembByUserIdx( UUID SecUserId );

	IYCFSecTSecGrpMembObj readCachedTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId );

	void deepDisposeTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId );

	void deepDisposeTSecGrpMembByTenantIdx( long TenantId );

	void deepDisposeTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId );

	void deepDisposeTSecGrpMembByUserIdx( UUID SecUserId );

	void deepDisposeTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId );

	/**
	 *	Read a page of data as a List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate TenantIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> pageTSecGrpMembByTenantIdx( long TenantId,
		Long priorTenantId,
		Long priorTSecGrpMembId );

	/**
	 *	Read a page of data as a List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> pageTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpMembId );

	/**
	 *	Read a page of data as a List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate UserIdx key attributes.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecTSecGrpMembObj> pageTSecGrpMembByUserIdx( UUID SecUserId,
		Long priorTenantId,
		Long priorTSecGrpMembId );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGrpMembObj updateTSecGrpMemb( IYCFSecTSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTSecGrpMemb( IYCFSecTSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpMembId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByUserIdx( UUID SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByUUserIdx(long TenantId,
		int TSecGroupId,
		UUID SecUserId );
}
