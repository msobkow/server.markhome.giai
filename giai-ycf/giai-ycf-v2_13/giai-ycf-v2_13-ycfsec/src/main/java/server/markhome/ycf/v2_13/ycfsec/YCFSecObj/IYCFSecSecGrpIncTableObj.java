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

public interface IYCFSecSecGrpIncTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecGrpInc instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSecGrpIncObj newInstance();

	/**
	 *	Instantiate a new SecGrpInc edition of the specified SecGrpInc instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSecGrpIncEditObj newEditInstance( IYCFSecSecGrpIncObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGrpIncObj realiseSecGrpInc( IYCFSecSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGrpIncObj createSecGrpInc( IYCFSecSecGrpIncObj Obj );

	/**
	 *	Read a SecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecGrpIncObj readSecGrpInc( YCFSecSecGrpIncPKey pkey );

	/**
	 *	Read a SecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecGrpIncObj readSecGrpInc( YCFSecSecGrpIncPKey pkey,
		boolean forceRead );

	IYCFSecSecGrpIncObj readCachedSecGrpInc( YCFSecSecGrpIncPKey pkey );

	public void reallyDeepDisposeSecGrpInc( IYCFSecSecGrpIncObj obj );

	void deepDisposeSecGrpInc( YCFSecSecGrpIncPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGrpIncObj lockSecGrpInc( YCFSecSecGrpIncPKey pkey );

	/**
	 *	Return a sorted list of all the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGrpIncObj> readAllSecGrpInc();

	/**
	 *	Return a sorted map of all the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGrpIncObj> readAllSecGrpInc( boolean forceRead );

	List<IYCFSecSecGrpIncObj> readCachedAllSecGrpInc();

	/**
	 *	Return a sorted map of a page of the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGrpIncObj> pageAllSecGrpInc(Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Get the YCFSecSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGrpIncObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGrpIncObj readSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId );

	/**
	 *	Get the YCFSecSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGrpIncObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGrpIncObj readSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGrpIncObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpIncObj> readSecGrpIncByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecSecGrpIncObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpIncObj> readSecGrpIncByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpIncObj> readSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Get the map of YCFSecSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpIncObj> readSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpIncObj> readSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId );

	/**
	 *	Get the map of YCFSecSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGrpIncObj> readSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId,
		boolean forceRead );

	/**
	 *	Get the YCFSecSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGrpIncObj cached instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGrpIncObj readSecGrpIncByUIncludeIdx(long ClusterId,
		int SecGroupId,
		int IncludeGroupId );

	/**
	 *	Get the YCFSecSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGrpIncObj refreshed instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGrpIncObj readSecGrpIncByUIncludeIdx(long ClusterId,
		int SecGroupId,
		int IncludeGroupId,
		boolean forceRead );

	IYCFSecSecGrpIncObj readCachedSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId );

	List<IYCFSecSecGrpIncObj> readCachedSecGrpIncByClusterIdx( long ClusterId );

	List<IYCFSecSecGrpIncObj> readCachedSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId );

	List<IYCFSecSecGrpIncObj> readCachedSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId );

	IYCFSecSecGrpIncObj readCachedSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId );

	void deepDisposeSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId );

	void deepDisposeSecGrpIncByClusterIdx( long ClusterId );

	void deepDisposeSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId );

	void deepDisposeSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId );

	void deepDisposeSecGrpIncByUIncludeIdx( long ClusterId,
		int SecGroupId,
		int IncludeGroupId );

	/**
	 *	Read a page of data as a List of SecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGrpIncObj> pageSecGrpIncByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Read a page of data as a List of SecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGrpIncObj> pageSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Read a page of data as a List of SecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate IncludeIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGrpIncObj> pageSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGrpIncObj updateSecGrpInc( IYCFSecSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGrpInc( IYCFSecSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByUIncludeIdx(long ClusterId,
		int SecGroupId,
		int IncludeGroupId );
}
