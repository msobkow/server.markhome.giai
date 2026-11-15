// Description: Java 25 Table Object interface for Secure.

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

package server.markhome.ycf.v3_1.secure.secureobj;

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
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

public interface ISecureSysClusterTableObj
{
	public ISecureSchemaObj getSchema();
	public void setSchema( ISecureSchemaObj value );

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
	ISecureSysClusterObj newInstance();

	/**
	 *	Instantiate a new SysCluster edition of the specified SysCluster instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSysClusterEditObj newEditInstance( ISecureSysClusterObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSysClusterObj instance, which may be a subclass of a SysCluster instance.
	 */
	ISecureSysClusterObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSysClusterObj realiseSysCluster( ISecureSysClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSysClusterObj createSysCluster( ISecureSysClusterObj Obj );

	/**
	 *	Read a SysCluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SysCluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSysClusterObj readSysCluster( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SysCluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SysCluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSysClusterObj readSysCluster( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureSysClusterObj readCachedSysCluster( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSysCluster( ISecureSysClusterObj obj );

	void deepDisposeSysCluster( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSysClusterObj lockSysCluster( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SysCluster-derived instances in the database.
	 *
	 *	@return	List of ISecureSysClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSysClusterObj> readAllSysCluster();

	/**
	 *	Return a sorted map of all the SysCluster-derived instances in the database.
	 *
	 *	@return	List of ISecureSysClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSysClusterObj> readAllSysCluster( boolean forceRead );

	List<ISecureSysClusterObj> readCachedAllSysCluster();

	/**
	 *	Get the SecureSysClusterObj instance for the primary key attributes.
	 *
	 *	@param	SingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	SecureSysClusterObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSysClusterObj readSysClusterByIdIdx( int SingletonId );

	/**
	 *	Get the SecureSysClusterObj instance for the primary key attributes.
	 *
	 *	@param	SingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	SecureSysClusterObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSysClusterObj readSysClusterByIdIdx( int SingletonId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSysClusterObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSysClusterObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSysClusterObj> readSysClusterByClusterIdx( ICFKeyHash256 ClusterId );

	/**
	 *	Get the map of SecureSysClusterObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSysClusterObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSysClusterObj> readSysClusterByClusterIdx( ICFKeyHash256 ClusterId,
		boolean forceRead );

	ISecureSysClusterObj readCachedSysClusterByIdIdx( int SingletonId );

	List<ISecureSysClusterObj> readCachedSysClusterByClusterIdx( ICFKeyHash256 ClusterId );

	void deepDisposeSysClusterByIdIdx( int SingletonId );

	void deepDisposeSysClusterByClusterIdx( ICFKeyHash256 ClusterId );

	/**
	 *	Internal use only.
	 */
	ISecureSysClusterObj updateSysCluster( ISecureSysClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSysCluster( ISecureSysClusterObj Obj );

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
	void deleteSysClusterByClusterIdx( ICFKeyHash256 ClusterId );
}
