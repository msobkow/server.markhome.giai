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

public interface IYCFGenKbSecGrpIncTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecGrpInc instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSecGrpIncObj newInstance();

	/**
	 *	Instantiate a new SecGrpInc edition of the specified SecGrpInc instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSecGrpIncEditObj newEditInstance( IYCFGenKbSecGrpIncObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGrpIncObj realiseSecGrpInc( IYCFGenKbSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGrpIncObj createSecGrpInc( IYCFGenKbSecGrpIncObj Obj );

	/**
	 *	Read a SecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecGrpIncObj readSecGrpInc( YCFGenKbSecGrpIncPKey pkey );

	/**
	 *	Read a SecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecGrpIncObj readSecGrpInc( YCFGenKbSecGrpIncPKey pkey,
		boolean forceRead );

	IYCFGenKbSecGrpIncObj readCachedSecGrpInc( YCFGenKbSecGrpIncPKey pkey );

	public void reallyDeepDisposeSecGrpInc( IYCFGenKbSecGrpIncObj obj );

	void deepDisposeSecGrpInc( YCFGenKbSecGrpIncPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGrpIncObj lockSecGrpInc( YCFGenKbSecGrpIncPKey pkey );

	/**
	 *	Return a sorted list of all the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGrpIncObj> readAllSecGrpInc();

	/**
	 *	Return a sorted map of all the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGrpIncObj> readAllSecGrpInc( boolean forceRead );

	List<IYCFGenKbSecGrpIncObj> readCachedAllSecGrpInc();

	/**
	 *	Return a sorted map of a page of the SecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGrpIncObj> pageAllSecGrpInc(Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Get the YCFGenKbSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGrpIncObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGrpIncObj readSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId );

	/**
	 *	Get the YCFGenKbSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGrpIncObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGrpIncObj readSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGrpIncObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpIncObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpIncObj> readSecGrpIncByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFGenKbSecGrpIncObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpIncObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpIncObj> readSecGrpIncByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpIncObj> readSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Get the map of YCFGenKbSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpIncObj> readSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpIncObj> readSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId );

	/**
	 *	Get the map of YCFGenKbSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGrpIncObj> readSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGrpIncObj cached instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGrpIncObj readSecGrpIncByUIncludeIdx(long ClusterId,
		int SecGroupId,
		int IncludeGroupId );

	/**
	 *	Get the YCFGenKbSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGrpIncObj refreshed instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGrpIncObj readSecGrpIncByUIncludeIdx(long ClusterId,
		int SecGroupId,
		int IncludeGroupId,
		boolean forceRead );

	IYCFGenKbSecGrpIncObj readCachedSecGrpIncByIdIdx( long ClusterId,
		long SecGrpIncId );

	List<IYCFGenKbSecGrpIncObj> readCachedSecGrpIncByClusterIdx( long ClusterId );

	List<IYCFGenKbSecGrpIncObj> readCachedSecGrpIncByGroupIdx( long ClusterId,
		int SecGroupId );

	List<IYCFGenKbSecGrpIncObj> readCachedSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId );

	IYCFGenKbSecGrpIncObj readCachedSecGrpIncByUIncludeIdx( long ClusterId,
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
	List<IYCFGenKbSecGrpIncObj> pageSecGrpIncByClusterIdx( long ClusterId,
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
	List<IYCFGenKbSecGrpIncObj> pageSecGrpIncByGroupIdx( long ClusterId,
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
	List<IYCFGenKbSecGrpIncObj> pageSecGrpIncByIncludeIdx( long ClusterId,
		int IncludeGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGrpIncObj updateSecGrpInc( IYCFGenKbSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGrpInc( IYCFGenKbSecGrpIncObj Obj );

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
