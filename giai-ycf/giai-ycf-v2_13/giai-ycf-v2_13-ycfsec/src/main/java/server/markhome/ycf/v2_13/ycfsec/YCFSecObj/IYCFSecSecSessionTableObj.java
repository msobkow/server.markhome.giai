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

public interface IYCFSecSecSessionTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecSession instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSecSessionObj newInstance();

	/**
	 *	Instantiate a new SecSession edition of the specified SecSession instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSecSessionEditObj newEditInstance( IYCFSecSecSessionObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecSessionObj realiseSecSession( IYCFSecSecSessionObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecSessionObj createSecSession( IYCFSecSecSessionObj Obj );

	/**
	 *	Read a SecSession-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSession-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecSessionObj readSecSession( YCFSecSecSessionPKey pkey );

	/**
	 *	Read a SecSession-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSession-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecSessionObj readSecSession( YCFSecSecSessionPKey pkey,
		boolean forceRead );

	IYCFSecSecSessionObj readCachedSecSession( YCFSecSecSessionPKey pkey );

	public void reallyDeepDisposeSecSession( IYCFSecSecSessionObj obj );

	void deepDisposeSecSession( YCFSecSecSessionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecSessionObj lockSecSession( YCFSecSecSessionPKey pkey );

	/**
	 *	Return a sorted list of all the SecSession-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecSessionObj> readAllSecSession();

	/**
	 *	Return a sorted map of all the SecSession-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecSessionObj> readAllSecSession( boolean forceRead );

	List<IYCFSecSecSessionObj> readCachedAllSecSession();

	/**
	 *	Return a sorted map of a page of the SecSession-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecSessionObj> pageAllSecSession(UUID priorSecSessionId );

	/**
	 *	Get the YCFSecSecSessionObj instance for the primary key attributes.
	 *
	 *	@param	argSecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecSessionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecSessionObj readSecSessionByIdIdx( UUID SecSessionId );

	/**
	 *	Get the YCFSecSecSessionObj instance for the primary key attributes.
	 *
	 *	@param	argSecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecSessionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecSessionObj readSecSessionByIdIdx( UUID SecSessionId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecSessionObj instances sorted by their primary keys for the duplicate SecUserIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecSessionObj cached instances sorted by their primary keys for the duplicate SecUserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId );

	/**
	 *	Get the map of YCFSecSecSessionObj instances sorted by their primary keys for the duplicate SecUserIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecSessionObj cached instances sorted by their primary keys for the duplicate SecUserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecSessionObj instances sorted by their primary keys for the duplicate SecDevIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecSessionObj cached instances sorted by their primary keys for the duplicate SecDevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName );

	/**
	 *	Get the map of YCFSecSecSessionObj instances sorted by their primary keys for the duplicate SecDevIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecSessionObj cached instances sorted by their primary keys for the duplicate SecDevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName,
		boolean forceRead );

	/**
	 *	Get the YCFSecSecSessionObj instance for the unique StartIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argStart	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecSessionObj cached instance for the unique StartIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecSessionObj readSecSessionByStartIdx(UUID SecUserId,
		Calendar Start );

	/**
	 *	Get the YCFSecSecSessionObj instance for the unique StartIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argStart	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecSessionObj refreshed instance for the unique StartIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecSessionObj readSecSessionByStartIdx(UUID SecUserId,
		Calendar Start,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecSessionObj instances sorted by their primary keys for the duplicate FinishIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecSessionObj cached instances sorted by their primary keys for the duplicate FinishIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish );

	/**
	 *	Get the map of YCFSecSecSessionObj instances sorted by their primary keys for the duplicate FinishIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecSessionObj cached instances sorted by their primary keys for the duplicate FinishIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecSessionObj instances sorted by their primary keys for the duplicate SecProxyIdx key.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecSessionObj cached instances sorted by their primary keys for the duplicate SecProxyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId );

	/**
	 *	Get the map of YCFSecSecSessionObj instances sorted by their primary keys for the duplicate SecProxyIdx key.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecSessionObj cached instances sorted by their primary keys for the duplicate SecProxyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId,
		boolean forceRead );

	IYCFSecSecSessionObj readCachedSecSessionByIdIdx( UUID SecSessionId );

	List<IYCFSecSecSessionObj> readCachedSecSessionBySecUserIdx( UUID SecUserId );

	List<IYCFSecSecSessionObj> readCachedSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName );

	IYCFSecSecSessionObj readCachedSecSessionByStartIdx( UUID SecUserId,
		Calendar Start );

	List<IYCFSecSecSessionObj> readCachedSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish );

	List<IYCFSecSecSessionObj> readCachedSecSessionBySecProxyIdx( UUID SecProxyId );

	void deepDisposeSecSessionByIdIdx( UUID SecSessionId );

	void deepDisposeSecSessionBySecUserIdx( UUID SecUserId );

	void deepDisposeSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName );

	void deepDisposeSecSessionByStartIdx( UUID SecUserId,
		Calendar Start );

	void deepDisposeSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish );

	void deepDisposeSecSessionBySecProxyIdx( UUID SecProxyId );

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecUserIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> pageSecSessionBySecUserIdx( UUID SecUserId,
		UUID priorSecSessionId );

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecDevIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> pageSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName,
		UUID priorSecSessionId );

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate FinishIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> pageSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish,
		UUID priorSecSessionId );

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecProxyIdx key attributes.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecSessionObj> pageSecSessionBySecProxyIdx( UUID SecProxyId,
		UUID priorSecSessionId );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecSessionObj updateSecSession( IYCFSecSecSessionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSession( IYCFSecSecSessionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecSessionId	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionByIdIdx( UUID SecSessionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionBySecUserIdx( UUID SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argStart	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionByStartIdx(UUID SecUserId,
		Calendar Start );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionBySecProxyIdx( UUID SecProxyId );

	IYCFSecSecSessionObj getSystemSession();
}
