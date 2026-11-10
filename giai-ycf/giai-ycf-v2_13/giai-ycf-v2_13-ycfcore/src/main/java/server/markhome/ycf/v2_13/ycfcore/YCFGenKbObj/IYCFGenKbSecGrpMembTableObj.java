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

public interface IYCFGenKbSecGrpMembTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecGrpMemb instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSecGrpMembObj newInstance();

	/**
	 *	Instantiate a new SecGrpMemb edition of the specified SecGrpMemb instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSecGrpMembEditObj newEditInstance( IYCFGenKbSecGrpMembObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGrpMembObj realiseSecGrpMemb( IYCFGenKbSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGrpMembObj createSecGrpMemb( IYCFGenKbSecGrpMembObj Obj );

	/**
	 *	Read a SecGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecGrpMembObj readSecGrpMemb( YCFGenKbSecGrpMembPKey pkey );

	/**
	 *	Read a SecGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecGrpMembObj readSecGrpMemb( YCFGenKbSecGrpMembPKey pkey,
		boolean forceRead );

	IYCFGenKbSecGrpMembObj readCachedSecGrpMemb( YCFGenKbSecGrpMembPKey pkey );

	public void reallyDeepDisposeSecGrpMemb( IYCFGenKbSecGrpMembObj obj );

	void deepDisposeSecGrpMemb( YCFGenKbSecGrpMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGrpMembObj lockSecGrpMemb( YCFGenKbSecGrpMembPKey pkey );

	/**
	 *	Return a sorted list of all the SecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGrpMembObj> readAllSecGrpMemb();

	/**
	 *	Return a sorted map of all the SecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGrpMembObj> readAllSecGrpMemb( boolean forceRead );

	List<IYCFGenKbSecGrpMembObj> readCachedAllSecGrpMemb();

	/**
	 *	Return a sorted map of a page of the SecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGrpMembObj> pageAllSecGrpMemb(Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Get the YCFGenKbSecGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpMembId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGrpMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId );

	/**
	 *	Get the YCFGenKbSecGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpMembId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGrpMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGrpMembObj readSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGrpMembObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpMembObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFGenKbSecGrpMembObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpMembObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpMembObj> readSecGrpMembByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGrpMembObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpMembObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Get the map of YCFGenKbSecGrpMembObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpMembObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpMembObj> readSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGrpMembObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpMembObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId );

	/**
	 *	Get the map of YCFGenKbSecGrpMembObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpMembObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpMembObj> readSecGrpMembByUserIdx( UUID SecUserId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbSecGrpMembObj instance for the unique UUserIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGrpMembObj cached instance for the unique UUserIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGrpMembObj readSecGrpMembByUUserIdx(long ClusterId,
		int SecGroupId,
		UUID SecUserId );

	/**
	 *	Get the YCFGenKbSecGrpMembObj instance for the unique UUserIdx key.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGrpMembObj refreshed instance for the unique UUserIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGrpMembObj readSecGrpMembByUUserIdx(long ClusterId,
		int SecGroupId,
		UUID SecUserId,
		boolean forceRead );

	IYCFGenKbSecGrpMembObj readCachedSecGrpMembByIdIdx( long ClusterId,
		long SecGrpMembId );

	List<IYCFGenKbSecGrpMembObj> readCachedSecGrpMembByClusterIdx( long ClusterId );

	List<IYCFGenKbSecGrpMembObj> readCachedSecGrpMembByGroupIdx( long ClusterId,
		int SecGroupId );

	List<IYCFGenKbSecGrpMembObj> readCachedSecGrpMembByUserIdx( UUID SecUserId );

	IYCFGenKbSecGrpMembObj readCachedSecGrpMembByUUserIdx( long ClusterId,
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
	List<IYCFGenKbSecGrpMembObj> pageSecGrpMembByClusterIdx( long ClusterId,
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
	List<IYCFGenKbSecGrpMembObj> pageSecGrpMembByGroupIdx( long ClusterId,
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
	List<IYCFGenKbSecGrpMembObj> pageSecGrpMembByUserIdx( UUID SecUserId,
		Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGrpMembObj updateSecGrpMemb( IYCFGenKbSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGrpMemb( IYCFGenKbSecGrpMembObj Obj );

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
