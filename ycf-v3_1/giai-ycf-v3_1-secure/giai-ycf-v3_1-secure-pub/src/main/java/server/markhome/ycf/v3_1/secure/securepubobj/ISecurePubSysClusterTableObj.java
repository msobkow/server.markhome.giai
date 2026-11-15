// Description: Java 25 Public Table Object interface for SecurePub.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.secure.securepubobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface ISecurePubSysClusterTableObj
{
	public ISecurePubSchemaObj getSchema();
	public void setSchema( ISecurePubSchemaObj value );

	public void minimizeMemory();

	public String getTableName();
	public String getTableDbName();

	/**
	 *	Get class code always returns the runtime class code for the objects, which is not stable until the application is done initializing and registering its objects.
	 *
	 *	@return runtime classcode
	 */ 
	public int getClassCode();

	/**
	 *	Get the backing store schema's class code, which is hard-coded into the object hierarchy.
	 *
	 *	@return The hardcoded backing store class code for this object, which is only valid in that schema.
	 */
	// public static int getBackingClassCode();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SysCluster instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubSysClusterObj newInstance();

	/**
	 *	Instantiate a new SysCluster edition of the specified SysCluster instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubSysClusterEditObj newEditInstance( ISecurePubSysClusterObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubSysClusterObj instance, which may be a subclass of a SysCluster instance.
	 */
	ISecurePubSysClusterObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubSysClusterObj realiseSysCluster( ISecurePubSysClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubSysClusterObj createSysCluster( ISecurePubSysClusterObj Obj );

	/**
	 *	Read a SysCluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SysCluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubSysClusterObj readSysCluster( Integer pkey );

	/**
	 *	Read a SysCluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SysCluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubSysClusterObj readSysCluster( Integer pkey,
		boolean forceRead );

	ISecurePubSysClusterObj readCachedSysCluster( Integer pkey );

	public void reallyDeepDisposeSysCluster( ISecurePubSysClusterObj obj );

	void deepDisposeSysCluster( Integer pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubSysClusterObj lockSysCluster( Integer pkey );

	/**
	 *	Return a sorted list of all the SysCluster-derived instances in the database.
	 *
	 *	@return	List of ISecurePubSysClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubSysClusterObj> readAllSysCluster();

	/**
	 *	Return a sorted map of all the SysCluster-derived instances in the database.
	 *
	 *	@return	List of ISecurePubSysClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubSysClusterObj> readAllSysCluster( boolean forceRead );

	List<ISecurePubSysClusterObj> readCachedAllSysCluster();

	/**
	 *	Get the SecurePubSysClusterObj instance for the primary key attributes.
	 *
	 *	@param	SingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSysClusterObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSysClusterObj readSysClusterByIdIdx( int SingletonId );

	/**
	 *	Get the SecurePubSysClusterObj instance for the primary key attributes.
	 *
	 *	@param	SingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSysClusterObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSysClusterObj readSysClusterByIdIdx( int SingletonId,
		boolean forceRead );

	/**
	 *	Get the map of SecurePubSysClusterObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubSysClusterObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubSysClusterObj> readSysClusterByClusterIdx( CFDbKeyHash256 ClusterId );

	/**
	 *	Get the map of SecurePubSysClusterObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubSysClusterObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubSysClusterObj> readSysClusterByClusterIdx( CFDbKeyHash256 ClusterId,
		boolean forceRead );

	ISecurePubSysClusterObj readCachedSysClusterByIdIdx( int SingletonId );

	List<ISecurePubSysClusterObj> readCachedSysClusterByClusterIdx( CFDbKeyHash256 ClusterId );

	void deepDisposeSysClusterByIdIdx( int SingletonId );

	void deepDisposeSysClusterByClusterIdx( CFDbKeyHash256 ClusterId );

	/**
	 *	Internal use only.
	 */
	ISecurePubSysClusterObj updateSysCluster( ISecurePubSysClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSysCluster( ISecurePubSysClusterObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SingletonId	The SysCluster key attribute of the instance generating the id.
	 */
	void deleteSysClusterByIdIdx( int SingletonId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SysCluster key attribute of the instance generating the id.
	 */
	void deleteSysClusterByClusterIdx( CFDbKeyHash256 ClusterId );
}
