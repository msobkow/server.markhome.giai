// Description: Java 25 Protected Table Object interface for SecureProt.

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

package server.markhome.ycf.v3_1.secure.secureprotobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;

public interface ISecureProtSecClusGrpTableObj
{
	public ISecureProtSchemaObj getSchema();
	public void setSchema( ISecureProtSchemaObj value );

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
	 *	Instantiate a new SecClusGrp instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecClusGrpObj newInstance();

	/**
	 *	Instantiate a new SecClusGrp edition of the specified SecClusGrp instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecClusGrpEditObj newEditInstance( ISecureProtSecClusGrpObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecClusGrpEditObj instance, which may be a subclass of a SecClusGrp instance.
	 */
	ISecureProtSecClusGrpObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusGrpObj realiseSecClusGrp( ISecureProtSecClusGrpObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusGrpObj createSecClusGrp( ISecureProtSecClusGrpObj Obj );

	/**
	 *	Read a SecClusGrp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecClusGrp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusGrpObj readSecClusGrp( CFDbKeyHash256 pkey );

	/**
	 *	Read a SecClusGrp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecClusGrp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusGrpObj readSecClusGrp( CFDbKeyHash256 pkey,
		boolean forceRead );

	ISecureProtSecClusGrpObj readCachedSecClusGrp( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeSecClusGrp( ISecureProtSecClusGrpObj obj );

	void deepDisposeSecClusGrp( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusGrpObj lockSecClusGrp( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecClusGrp-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecClusGrpObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecClusGrpObj> readAllSecClusGrp();

	/**
	 *	Return a sorted map of all the SecClusGrp-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecClusGrpObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecClusGrpObj> readAllSecClusGrp( boolean forceRead );

	List<ISecureProtSecClusGrpObj> readCachedAllSecClusGrp();

	/**
	 *	Get the ISecureProtSecClusGrpObj instance for the primary key attributes.
	 *
	 *	@param	SecClusGrpId	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecClusGrpObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecClusGrpObj readSecClusGrpByIdIdx( ICFKeyHash256 SecClusGrpId );

	/**
	 *	Get the ISecureProtSecClusGrpObj instance for the primary key attributes.
	 *
	 *	@param	SecClusGrpId	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecClusGrpObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecClusGrpObj readSecClusGrpByIdIdx( ICFKeyHash256 SecClusGrpId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecClusGrpObj> instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusGrpObj> cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusGrpObj> readSecClusGrpByClusterIdx( ICFKeyHash256 ClusterId );

	/**
	 *	Get the map of List<ISecureProtSecClusGrpObj> instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusGrpObj> cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusGrpObj> readSecClusGrpByClusterIdx( ICFKeyHash256 ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecClusGrpObj> instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	Name	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusGrpObj> cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusGrpObj> readSecClusGrpByNameIdx( String Name );

	/**
	 *	Get the map of List<ISecureProtSecClusGrpObj> instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	Name	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusGrpObj> cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusGrpObj> readSecClusGrpByNameIdx( String Name,
		boolean forceRead );

	/**
	 *	Get the ISecureProtSecClusGrpObj instance for the unique UNameIdx key.
	 *
	 *	@param	ClusterId	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecClusGrpObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecClusGrpObj readSecClusGrpByUNameIdx(ICFKeyHash256 ClusterId,
		String Name );

	/**
	 *	Get the ISecureProtSecClusGrpObj instance for the unique UNameIdx key.
	 *
	 *	@param	ClusterId	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecClusGrpObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecClusGrpObj readSecClusGrpByUNameIdx(ICFKeyHash256 ClusterId,
		String Name,
		boolean forceRead );

	ISecureProtSecClusGrpObj readCachedSecClusGrpByIdIdx( ICFKeyHash256 SecClusGrpId );

	List<List<ISecureProtSecClusGrpObj>> readCachedSecClusGrpByClusterIdx( ICFKeyHash256 ClusterId );

	List<List<ISecureProtSecClusGrpObj>> readCachedSecClusGrpByNameIdx( String Name );

	ISecureProtSecClusGrpObj readCachedSecClusGrpByUNameIdx( ICFKeyHash256 ClusterId,
		String Name );

	void deepDisposeSecClusGrpByIdIdx( ICFKeyHash256 SecClusGrpId );

	void deepDisposeSecClusGrpByClusterIdx( ICFKeyHash256 ClusterId );

	void deepDisposeSecClusGrpByNameIdx( String Name );

	void deepDisposeSecClusGrpByUNameIdx( ICFKeyHash256 ClusterId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusGrpObj updateSecClusGrp( ISecureProtSecClusGrpObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecClusGrp( ISecureProtSecClusGrpObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecClusGrpId	The SecClusGrp key attribute of the instance generating the id.
	 */
	void deleteSecClusGrpByIdIdx( ICFKeyHash256 SecClusGrpId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SecClusGrp key attribute of the instance generating the id.
	 */
	void deleteSecClusGrpByClusterIdx( ICFKeyHash256 ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The SecClusGrp key attribute of the instance generating the id.
	 */
	void deleteSecClusGrpByNameIdx( String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SecClusGrp key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusGrp key attribute of the instance generating the id.
	 */
	void deleteSecClusGrpByUNameIdx(ICFKeyHash256 ClusterId,
		String Name );
}
