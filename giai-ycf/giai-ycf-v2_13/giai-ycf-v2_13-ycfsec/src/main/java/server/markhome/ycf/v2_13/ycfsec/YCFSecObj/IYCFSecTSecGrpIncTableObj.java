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

public interface IYCFSecTSecGrpIncTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TSecGrpInc instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecTSecGrpIncObj newInstance();

	/**
	 *	Instantiate a new TSecGrpInc edition of the specified TSecGrpInc instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecTSecGrpIncEditObj newEditInstance( IYCFSecTSecGrpIncObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGrpIncObj realiseTSecGrpInc( IYCFSecTSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGrpIncObj createTSecGrpInc( IYCFSecTSecGrpIncObj Obj );

	/**
	 *	Read a TSecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecTSecGrpIncObj readTSecGrpInc( YCFSecTSecGrpIncPKey pkey );

	/**
	 *	Read a TSecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecTSecGrpIncObj readTSecGrpInc( YCFSecTSecGrpIncPKey pkey,
		boolean forceRead );

	IYCFSecTSecGrpIncObj readCachedTSecGrpInc( YCFSecTSecGrpIncPKey pkey );

	public void reallyDeepDisposeTSecGrpInc( IYCFSecTSecGrpIncObj obj );

	void deepDisposeTSecGrpInc( YCFSecTSecGrpIncPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGrpIncObj lockTSecGrpInc( YCFSecTSecGrpIncPKey pkey );

	/**
	 *	Return a sorted list of all the TSecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> readAllTSecGrpInc();

	/**
	 *	Return a sorted map of all the TSecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> readAllTSecGrpInc( boolean forceRead );

	List<IYCFSecTSecGrpIncObj> readCachedAllTSecGrpInc();

	/**
	 *	Return a sorted map of a page of the TSecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> pageAllTSecGrpInc(Long priorTenantId,
		Long priorTSecGrpIncId );

	/**
	 *	Get the YCFSecTSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpIncId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGrpIncObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId );

	/**
	 *	Get the YCFSecTSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpIncId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGrpIncObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecTSecGrpIncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpIncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFSecTSecGrpIncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpIncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecTSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Get the map of YCFSecTSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecTSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId );

	/**
	 *	Get the map of YCFSecTSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		boolean forceRead );

	/**
	 *	Get the YCFSecTSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGrpIncObj cached instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGrpIncObj readTSecGrpIncByUIncludeIdx(long TenantId,
		int TSecGroupId,
		int IncludeGroupId );

	/**
	 *	Get the YCFSecTSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGrpIncObj refreshed instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGrpIncObj readTSecGrpIncByUIncludeIdx(long TenantId,
		int TSecGroupId,
		int IncludeGroupId,
		boolean forceRead );

	IYCFSecTSecGrpIncObj readCachedTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId );

	List<IYCFSecTSecGrpIncObj> readCachedTSecGrpIncByTenantIdx( long TenantId );

	List<IYCFSecTSecGrpIncObj> readCachedTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId );

	List<IYCFSecTSecGrpIncObj> readCachedTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId );

	IYCFSecTSecGrpIncObj readCachedTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId );

	void deepDisposeTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId );

	void deepDisposeTSecGrpIncByTenantIdx( long TenantId );

	void deepDisposeTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId );

	void deepDisposeTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId );

	void deepDisposeTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId );

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate TenantIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> pageTSecGrpIncByTenantIdx( long TenantId,
		Long priorTenantId,
		Long priorTSecGrpIncId );

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> pageTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId );

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate IncludeIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecTSecGrpIncObj> pageTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGrpIncObj updateTSecGrpInc( IYCFSecTSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTSecGrpInc( IYCFSecTSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpIncId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByUIncludeIdx(long TenantId,
		int TSecGroupId,
		int IncludeGroupId );
}
