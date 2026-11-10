// Description: Java 11 Table Object interface for YCFGenKb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public interface IYCFGenKbSecSessionTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecSession instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSecSessionObj newInstance();

	/**
	 *	Instantiate a new SecSession edition of the specified SecSession instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSecSessionEditObj newEditInstance( IYCFGenKbSecSessionObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecSessionObj realiseSecSession( IYCFGenKbSecSessionObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecSessionObj createSecSession( IYCFGenKbSecSessionObj Obj );

	/**
	 *	Read a SecSession-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSession-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecSessionObj readSecSession( YCFGenKbSecSessionPKey pkey );

	/**
	 *	Read a SecSession-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSession-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecSessionObj readSecSession( YCFGenKbSecSessionPKey pkey,
		boolean forceRead );

	IYCFGenKbSecSessionObj readCachedSecSession( YCFGenKbSecSessionPKey pkey );

	public void reallyDeepDisposeSecSession( IYCFGenKbSecSessionObj obj );

	void deepDisposeSecSession( YCFGenKbSecSessionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecSessionObj lockSecSession( YCFGenKbSecSessionPKey pkey );

	/**
	 *	Return a sorted list of all the SecSession-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readAllSecSession();

	/**
	 *	Return a sorted map of all the SecSession-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readAllSecSession( boolean forceRead );

	List<IYCFGenKbSecSessionObj> readCachedAllSecSession();

	/**
	 *	Return a sorted map of a page of the SecSession-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecSessionObj> pageAllSecSession(UUID priorSecSessionId );

	/**
	 *	Get the YCFGenKbSecSessionObj instance for the primary key attributes.
	 *
	 *	@param	argSecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecSessionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecSessionObj readSecSessionByIdIdx( UUID SecSessionId );

	/**
	 *	Get the YCFGenKbSecSessionObj instance for the primary key attributes.
	 *
	 *	@param	argSecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecSessionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecSessionObj readSecSessionByIdIdx( UUID SecSessionId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecSessionObj instances sorted by their primary keys for the duplicate SecUserIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecSessionObj cached instances sorted by their primary keys for the duplicate SecUserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId );

	/**
	 *	Get the map of YCFGenKbSecSessionObj instances sorted by their primary keys for the duplicate SecUserIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecSessionObj cached instances sorted by their primary keys for the duplicate SecUserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecSessionObj instances sorted by their primary keys for the duplicate SecDevIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecSessionObj cached instances sorted by their primary keys for the duplicate SecDevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName );

	/**
	 *	Get the map of YCFGenKbSecSessionObj instances sorted by their primary keys for the duplicate SecDevIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecSessionObj cached instances sorted by their primary keys for the duplicate SecDevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbSecSessionObj instance for the unique StartIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argStart	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecSessionObj cached instance for the unique StartIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecSessionObj readSecSessionByStartIdx(UUID SecUserId,
		Calendar Start );

	/**
	 *	Get the YCFGenKbSecSessionObj instance for the unique StartIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argStart	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecSessionObj refreshed instance for the unique StartIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecSessionObj readSecSessionByStartIdx(UUID SecUserId,
		Calendar Start,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecSessionObj instances sorted by their primary keys for the duplicate FinishIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecSessionObj cached instances sorted by their primary keys for the duplicate FinishIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish );

	/**
	 *	Get the map of YCFGenKbSecSessionObj instances sorted by their primary keys for the duplicate FinishIdx key.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecSessionObj cached instances sorted by their primary keys for the duplicate FinishIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecSessionObj instances sorted by their primary keys for the duplicate SecProxyIdx key.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecSessionObj cached instances sorted by their primary keys for the duplicate SecProxyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId );

	/**
	 *	Get the map of YCFGenKbSecSessionObj instances sorted by their primary keys for the duplicate SecProxyIdx key.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecSessionObj cached instances sorted by their primary keys for the duplicate SecProxyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId,
		boolean forceRead );

	IYCFGenKbSecSessionObj readCachedSecSessionByIdIdx( UUID SecSessionId );

	List<IYCFGenKbSecSessionObj> readCachedSecSessionBySecUserIdx( UUID SecUserId );

	List<IYCFGenKbSecSessionObj> readCachedSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName );

	IYCFGenKbSecSessionObj readCachedSecSessionByStartIdx( UUID SecUserId,
		Calendar Start );

	List<IYCFGenKbSecSessionObj> readCachedSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish );

	List<IYCFGenKbSecSessionObj> readCachedSecSessionBySecProxyIdx( UUID SecProxyId );

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
	List<IYCFGenKbSecSessionObj> pageSecSessionBySecUserIdx( UUID SecUserId,
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
	List<IYCFGenKbSecSessionObj> pageSecSessionBySecDevIdx( UUID SecUserId,
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
	List<IYCFGenKbSecSessionObj> pageSecSessionByFinishIdx( UUID SecUserId,
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
	List<IYCFGenKbSecSessionObj> pageSecSessionBySecProxyIdx( UUID SecProxyId,
		UUID priorSecSessionId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecSessionObj updateSecSession( IYCFGenKbSecSessionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSession( IYCFGenKbSecSessionObj Obj );

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

	IYCFGenKbSecSessionObj getSystemSession();
}
