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

public interface ISecurePubClusterTableObj
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
	 *	Instantiate a new Cluster instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubClusterObj newInstance();

	/**
	 *	Instantiate a new Cluster edition of the specified Cluster instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubClusterEditObj newEditInstance( ISecurePubClusterObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubClusterObj instance, which may be a subclass of a Cluster instance.
	 */
	ISecurePubClusterObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubClusterObj realiseCluster( ISecurePubClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubClusterObj createCluster( ISecurePubClusterObj Obj );

	/**
	 *	Read a Cluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Cluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubClusterObj readCluster( ICFKeyHash256 pkey );

	/**
	 *	Read a Cluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Cluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubClusterObj readCluster( ICFKeyHash256 pkey,
		boolean forceRead );

	ISecurePubClusterObj readCachedCluster( ICFKeyHash256 pkey );

	public void reallyDeepDisposeCluster( ISecurePubClusterObj obj );

	void deepDisposeCluster( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubClusterObj lockCluster( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Cluster-derived instances in the database.
	 *
	 *	@return	List of ISecurePubClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubClusterObj> readAllCluster();

	/**
	 *	Return a sorted map of all the Cluster-derived instances in the database.
	 *
	 *	@return	List of ISecurePubClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubClusterObj> readAllCluster( boolean forceRead );

	List<ISecurePubClusterObj> readCachedAllCluster();

	/**
	 *	Get the SecurePubClusterObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubClusterObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubClusterObj readClusterByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the SecurePubClusterObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubClusterObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubClusterObj readClusterByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the SecurePubClusterObj instance for the unique UDomNameIdx key.
	 *
	 *	@param	FullDomName	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubClusterObj cached instance for the unique UDomNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubClusterObj readClusterByUDomNameIdx(String FullDomName );

	/**
	 *	Get the SecurePubClusterObj instance for the unique UDomNameIdx key.
	 *
	 *	@param	FullDomName	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubClusterObj refreshed instance for the unique UDomNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubClusterObj readClusterByUDomNameIdx(String FullDomName,
		boolean forceRead );

	/**
	 *	Get the SecurePubClusterObj instance for the unique UDescrIdx key.
	 *
	 *	@param	Description	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubClusterObj cached instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubClusterObj readClusterByUDescrIdx(String Description );

	/**
	 *	Get the SecurePubClusterObj instance for the unique UDescrIdx key.
	 *
	 *	@param	Description	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubClusterObj refreshed instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubClusterObj readClusterByUDescrIdx(String Description,
		boolean forceRead );

	ISecurePubClusterObj readCachedClusterByIdIdx( CFDbKeyHash256 Id );

	ISecurePubClusterObj readCachedClusterByUDomNameIdx( String FullDomName );

	ISecurePubClusterObj readCachedClusterByUDescrIdx( String Description );

	void deepDisposeClusterByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeClusterByUDomNameIdx( String FullDomName );

	void deepDisposeClusterByUDescrIdx( String Description );

	/**
	 *	Internal use only.
	 */
	ISecurePubClusterObj updateCluster( ISecurePubClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteCluster( ISecurePubClusterObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Cluster key attribute of the instance generating the id.
	 */
	void deleteClusterByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	FullDomName	The Cluster key attribute of the instance generating the id.
	 */
	void deleteClusterByUDomNameIdx(String FullDomName );

	/**
	 *	Internal use only.
	 *
	 *	@param	Description	The Cluster key attribute of the instance generating the id.
	 */
	void deleteClusterByUDescrIdx(String Description );
}
