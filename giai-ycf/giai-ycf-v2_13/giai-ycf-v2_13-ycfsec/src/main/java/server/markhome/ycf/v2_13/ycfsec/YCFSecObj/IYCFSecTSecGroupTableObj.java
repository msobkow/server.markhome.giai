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

public interface IYCFSecTSecGroupTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TSecGroup instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecTSecGroupObj newInstance();

	/**
	 *	Instantiate a new TSecGroup edition of the specified TSecGroup instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecTSecGroupEditObj newEditInstance( IYCFSecTSecGroupObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGroupObj realiseTSecGroup( IYCFSecTSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGroupObj createTSecGroup( IYCFSecTSecGroupObj Obj );

	/**
	 *	Read a TSecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecTSecGroupObj readTSecGroup( YCFSecTSecGroupPKey pkey );

	/**
	 *	Read a TSecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecTSecGroupObj readTSecGroup( YCFSecTSecGroupPKey pkey,
		boolean forceRead );

	IYCFSecTSecGroupObj readCachedTSecGroup( YCFSecTSecGroupPKey pkey );

	public void reallyDeepDisposeTSecGroup( IYCFSecTSecGroupObj obj );

	void deepDisposeTSecGroup( YCFSecTSecGroupPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGroupObj lockTSecGroup( YCFSecTSecGroupPKey pkey );

	/**
	 *	Return a sorted list of all the TSecGroup-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTSecGroupObj> readAllTSecGroup();

	/**
	 *	Return a sorted map of all the TSecGroup-derived instances in the database.
	 *
	 *	@return	List of IYCFSecTSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecTSecGroupObj> readAllTSecGroup( boolean forceRead );

	List<IYCFSecTSecGroupObj> readCachedAllTSecGroup();

	/**
	 *	Get the YCFSecTSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGroupObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Get the YCFSecTSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGroupObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecTSecGroupObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGroupObj> readTSecGroupByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFSecTSecGroupObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGroupObj> readTSecGroupByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecTSecGroupObj instances sorted by their primary keys for the duplicate TenantVisIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	/**
	 *	Get the map of YCFSecTSecGroupObj instances sorted by their primary keys for the duplicate TenantVisIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible,
		boolean forceRead );

	/**
	 *	Get the YCFSecTSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGroupObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGroupObj readTSecGroupByUNameIdx(long TenantId,
		String Name );

	/**
	 *	Get the YCFSecTSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecTSecGroupObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecTSecGroupObj readTSecGroupByUNameIdx(long TenantId,
		String Name,
		boolean forceRead );

	IYCFSecTSecGroupObj readCachedTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	List<IYCFSecTSecGroupObj> readCachedTSecGroupByTenantIdx( long TenantId );

	List<IYCFSecTSecGroupObj> readCachedTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	IYCFSecTSecGroupObj readCachedTSecGroupByUNameIdx( long TenantId,
		String Name );

	void deepDisposeTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	void deepDisposeTSecGroupByTenantIdx( long TenantId );

	void deepDisposeTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	void deepDisposeTSecGroupByUNameIdx( long TenantId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFSecTSecGroupObj updateTSecGroup( IYCFSecTSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTSecGroup( IYCFSecTSecGroupObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByUNameIdx(long TenantId,
		String Name );
}
