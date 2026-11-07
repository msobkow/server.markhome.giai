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

public interface ISecureProtSecClusGrpMembTableObj
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
	 *	Instantiate a new SecClusGrpMemb instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecClusGrpMembObj newInstance();

	/**
	 *	Instantiate a new SecClusGrpMemb edition of the specified SecClusGrpMemb instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecClusGrpMembEditObj newEditInstance( ISecureProtSecClusGrpMembObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecClusGrpMembEditObj instance, which may be a subclass of a SecClusGrpMemb instance.
	 */
	ISecureProtSecClusGrpMembObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusGrpMembObj realiseSecClusGrpMemb( ISecureProtSecClusGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusGrpMembObj createSecClusGrpMemb( ISecureProtSecClusGrpMembObj Obj );

	/**
	 *	Read a SecClusGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecClusGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusGrpMembObj readSecClusGrpMemb( ISecureProtSecClusGrpMembPKey pkey );

	/**
	 *	Read a SecClusGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecClusGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusGrpMembObj readSecClusGrpMemb( ISecureProtSecClusGrpMembPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecClusGrpMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecClusGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusGrpMembObj readSecClusGrpMemb( ICFKeyHash256 SecClusGrpId,
		String LoginId );

	/**
	 *	Read a SecClusGrpMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecClusGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusGrpMembObj readSecClusGrpMemb( ICFKeyHash256 SecClusGrpId,
		String LoginId,
		boolean forceRead );

	ISecureProtSecClusGrpMembObj readCachedSecClusGrpMemb( ISecureProtSecClusGrpMembPKey pkey );

	public void reallyDeepDisposeSecClusGrpMemb( ISecureProtSecClusGrpMembObj obj );

	void deepDisposeSecClusGrpMemb( ISecureProtSecClusGrpMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusGrpMembObj lockSecClusGrpMemb( ISecureProtSecClusGrpMembPKey pkey );

	/**
	 *	Return a sorted list of all the SecClusGrpMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecClusGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecClusGrpMembObj> readAllSecClusGrpMemb();

	/**
	 *	Return a sorted map of all the SecClusGrpMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecClusGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecClusGrpMembObj> readAllSecClusGrpMemb( boolean forceRead );

	List<ISecureProtSecClusGrpMembObj> readCachedAllSecClusGrpMemb();

	/**
	 *	Get the ISecureProtSecClusGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecClusGrpMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecClusGrpMembObj readSecClusGrpMembByIdIdx( ICFKeyHash256 SecClusGrpId,
		String LoginId );

	/**
	 *	Get the ISecureProtSecClusGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecClusGrpMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecClusGrpMembObj readSecClusGrpMembByIdIdx( ICFKeyHash256 SecClusGrpId,
		String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecClusGrpMembObj> instances sorted by their primary keys for the duplicate ClusGrpIdx key.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusGrpMembObj> cached instances sorted by their primary keys for the duplicate ClusGrpIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusGrpMembObj> readSecClusGrpMembByClusGrpIdx( ICFKeyHash256 SecClusGrpId );

	/**
	 *	Get the map of List<ISecureProtSecClusGrpMembObj> instances sorted by their primary keys for the duplicate ClusGrpIdx key.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusGrpMembObj> cached instances sorted by their primary keys for the duplicate ClusGrpIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusGrpMembObj> readSecClusGrpMembByClusGrpIdx( ICFKeyHash256 SecClusGrpId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecClusGrpMembObj> instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusGrpMembObj> cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusGrpMembObj> readSecClusGrpMembByLoginIdx( String LoginId );

	/**
	 *	Get the map of List<ISecureProtSecClusGrpMembObj> instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusGrpMembObj> cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusGrpMembObj> readSecClusGrpMembByLoginIdx( String LoginId,
		boolean forceRead );

	ISecureProtSecClusGrpMembObj readCachedSecClusGrpMembByIdIdx( ICFKeyHash256 SecClusGrpId,
		String LoginId );

	List<List<ISecureProtSecClusGrpMembObj>> readCachedSecClusGrpMembByClusGrpIdx( ICFKeyHash256 SecClusGrpId );

	List<List<ISecureProtSecClusGrpMembObj>> readCachedSecClusGrpMembByLoginIdx( String LoginId );

	void deepDisposeSecClusGrpMembByIdIdx( ICFKeyHash256 SecClusGrpId,
		String LoginId );

	void deepDisposeSecClusGrpMembByClusGrpIdx( ICFKeyHash256 SecClusGrpId );

	void deepDisposeSecClusGrpMembByLoginIdx( String LoginId );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusGrpMembObj updateSecClusGrpMemb( ISecureProtSecClusGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecClusGrpMemb( ISecureProtSecClusGrpMembObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecClusGrpMembByIdIdx( ICFKeyHash256 SecClusGrpId,
		String LoginId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecClusGrpId	The SecClusGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecClusGrpMembByClusGrpIdx( ICFKeyHash256 SecClusGrpId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LoginId	The SecClusGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecClusGrpMembByLoginIdx( String LoginId );
}
