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

public interface IYCFGenKbSysClusterTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SysCluster instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSysClusterObj newInstance();

	/**
	 *	Instantiate a new SysCluster edition of the specified SysCluster instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSysClusterEditObj newEditInstance( IYCFGenKbSysClusterObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSysClusterObj realiseSysCluster( IYCFGenKbSysClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSysClusterObj createSysCluster( IYCFGenKbSysClusterObj Obj );

	/**
	 *	Read a SysCluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SysCluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSysClusterObj readSysCluster( YCFGenKbSysClusterPKey pkey );

	/**
	 *	Read a SysCluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SysCluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSysClusterObj readSysCluster( YCFGenKbSysClusterPKey pkey,
		boolean forceRead );

	IYCFGenKbSysClusterObj readCachedSysCluster( YCFGenKbSysClusterPKey pkey );

	public void reallyDeepDisposeSysCluster( IYCFGenKbSysClusterObj obj );

	void deepDisposeSysCluster( YCFGenKbSysClusterPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSysClusterObj lockSysCluster( YCFGenKbSysClusterPKey pkey );

	/**
	 *	Return a sorted list of all the SysCluster-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSysClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSysClusterObj> readAllSysCluster();

	/**
	 *	Return a sorted map of all the SysCluster-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSysClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSysClusterObj> readAllSysCluster( boolean forceRead );

	List<IYCFGenKbSysClusterObj> readCachedAllSysCluster();

	/**
	 *	Get the YCFGenKbSysClusterObj instance for the primary key attributes.
	 *
	 *	@param	argSingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSysClusterObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSysClusterObj readSysClusterByIdIdx( int SingletonId );

	/**
	 *	Get the YCFGenKbSysClusterObj instance for the primary key attributes.
	 *
	 *	@param	argSingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSysClusterObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSysClusterObj readSysClusterByIdIdx( int SingletonId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSysClusterObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSysClusterObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSysClusterObj> readSysClusterByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFGenKbSysClusterObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSysClusterObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSysClusterObj> readSysClusterByClusterIdx( long ClusterId,
		boolean forceRead );

	IYCFGenKbSysClusterObj readCachedSysClusterByIdIdx( int SingletonId );

	List<IYCFGenKbSysClusterObj> readCachedSysClusterByClusterIdx( long ClusterId );

	void deepDisposeSysClusterByIdIdx( int SingletonId );

	void deepDisposeSysClusterByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSysClusterObj updateSysCluster( IYCFGenKbSysClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSysCluster( IYCFGenKbSysClusterObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSingletonId	The SysCluster key attribute of the instance generating the id.
	 */
	void deleteSysClusterByIdIdx( int SingletonId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SysCluster key attribute of the instance generating the id.
	 */
	void deleteSysClusterByClusterIdx( long ClusterId );
}
