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

public interface IYCFGenKbSecAppTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecApp instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSecAppObj newInstance();

	/**
	 *	Instantiate a new SecApp edition of the specified SecApp instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSecAppEditObj newEditInstance( IYCFGenKbSecAppObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecAppObj realiseSecApp( IYCFGenKbSecAppObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecAppObj createSecApp( IYCFGenKbSecAppObj Obj );

	/**
	 *	Read a SecApp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecApp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecAppObj readSecApp( YCFGenKbSecAppPKey pkey );

	/**
	 *	Read a SecApp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecApp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecAppObj readSecApp( YCFGenKbSecAppPKey pkey,
		boolean forceRead );

	IYCFGenKbSecAppObj readCachedSecApp( YCFGenKbSecAppPKey pkey );

	public void reallyDeepDisposeSecApp( IYCFGenKbSecAppObj obj );

	void deepDisposeSecApp( YCFGenKbSecAppPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecAppObj lockSecApp( YCFGenKbSecAppPKey pkey );

	/**
	 *	Return a sorted list of all the SecApp-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecAppObj> readAllSecApp();

	/**
	 *	Return a sorted map of all the SecApp-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecAppObj> readAllSecApp( boolean forceRead );

	List<IYCFGenKbSecAppObj> readCachedAllSecApp();

	/**
	 *	Return a sorted map of a page of the SecApp-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecAppObj> pageAllSecApp(Long priorClusterId,
		Integer priorSecAppId );

	/**
	 *	Get the YCFGenKbSecAppObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecAppObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the YCFGenKbSecAppObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecAppObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecAppObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecAppObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecAppObj> readSecAppByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFGenKbSecAppObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecAppObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecAppObj> readSecAppByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbSecAppObj instance for the unique UJEEMountIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecAppObj cached instance for the unique UJEEMountIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecAppObj readSecAppByUJEEMountIdx(long ClusterId,
		String JEEMountName );

	/**
	 *	Get the YCFGenKbSecAppObj instance for the unique UJEEMountIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecAppObj refreshed instance for the unique UJEEMountIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecAppObj readSecAppByUJEEMountIdx(long ClusterId,
		String JEEMountName,
		boolean forceRead );

	IYCFGenKbSecAppObj readCachedSecAppByIdIdx( long ClusterId,
		int SecAppId );

	List<IYCFGenKbSecAppObj> readCachedSecAppByClusterIdx( long ClusterId );

	IYCFGenKbSecAppObj readCachedSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName );

	void deepDisposeSecAppByIdIdx( long ClusterId,
		int SecAppId );

	void deepDisposeSecAppByClusterIdx( long ClusterId );

	void deepDisposeSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName );

	/**
	 *	Read a page of data as a List of SecApp-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecApp-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFGenKbSecAppObj> pageSecAppByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecAppId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecAppObj updateSecApp( IYCFGenKbSecAppObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecApp( IYCFGenKbSecAppObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByIdIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByUJEEMountIdx(long ClusterId,
		String JEEMountName );
}
