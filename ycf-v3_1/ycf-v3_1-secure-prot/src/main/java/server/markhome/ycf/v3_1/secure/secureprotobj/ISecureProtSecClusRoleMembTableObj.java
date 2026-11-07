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

public interface ISecureProtSecClusRoleMembTableObj
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
	 *	Instantiate a new SecClusRoleMemb instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecClusRoleMembObj newInstance();

	/**
	 *	Instantiate a new SecClusRoleMemb edition of the specified SecClusRoleMemb instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecClusRoleMembEditObj newEditInstance( ISecureProtSecClusRoleMembObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecClusRoleMembEditObj instance, which may be a subclass of a SecClusRoleMemb instance.
	 */
	ISecureProtSecClusRoleMembObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusRoleMembObj realiseSecClusRoleMemb( ISecureProtSecClusRoleMembObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusRoleMembObj createSecClusRoleMemb( ISecureProtSecClusRoleMembObj Obj );

	/**
	 *	Read a SecClusRoleMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecClusRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusRoleMembObj readSecClusRoleMemb( ISecureProtSecClusRoleMembPKey pkey );

	/**
	 *	Read a SecClusRoleMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecClusRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusRoleMembObj readSecClusRoleMemb( ISecureProtSecClusRoleMembPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecClusRoleMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecClusRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusRoleMembObj readSecClusRoleMemb( ICFKeyHash256 SecClusRoleId,
		String LoginId );

	/**
	 *	Read a SecClusRoleMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecClusRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecClusRoleMembObj readSecClusRoleMemb( ICFKeyHash256 SecClusRoleId,
		String LoginId,
		boolean forceRead );

	ISecureProtSecClusRoleMembObj readCachedSecClusRoleMemb( ISecureProtSecClusRoleMembPKey pkey );

	public void reallyDeepDisposeSecClusRoleMemb( ISecureProtSecClusRoleMembObj obj );

	void deepDisposeSecClusRoleMemb( ISecureProtSecClusRoleMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusRoleMembObj lockSecClusRoleMemb( ISecureProtSecClusRoleMembPKey pkey );

	/**
	 *	Return a sorted list of all the SecClusRoleMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecClusRoleMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecClusRoleMembObj> readAllSecClusRoleMemb();

	/**
	 *	Return a sorted map of all the SecClusRoleMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecClusRoleMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecClusRoleMembObj> readAllSecClusRoleMemb( boolean forceRead );

	List<ISecureProtSecClusRoleMembObj> readCachedAllSecClusRoleMemb();

	/**
	 *	Get the ISecureProtSecClusRoleMembObj instance for the primary key attributes.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecClusRoleMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecClusRoleMembObj readSecClusRoleMembByIdIdx( ICFKeyHash256 SecClusRoleId,
		String LoginId );

	/**
	 *	Get the ISecureProtSecClusRoleMembObj instance for the primary key attributes.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecClusRoleMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecClusRoleMembObj readSecClusRoleMembByIdIdx( ICFKeyHash256 SecClusRoleId,
		String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecClusRoleMembObj> instances sorted by their primary keys for the duplicate ClusRoleIdx key.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusRoleMembObj> cached instances sorted by their primary keys for the duplicate ClusRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusRoleMembObj> readSecClusRoleMembByClusRoleIdx( ICFKeyHash256 SecClusRoleId );

	/**
	 *	Get the map of List<ISecureProtSecClusRoleMembObj> instances sorted by their primary keys for the duplicate ClusRoleIdx key.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusRoleMembObj> cached instances sorted by their primary keys for the duplicate ClusRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusRoleMembObj> readSecClusRoleMembByClusRoleIdx( ICFKeyHash256 SecClusRoleId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecClusRoleMembObj> instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusRoleMembObj> cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusRoleMembObj> readSecClusRoleMembByLoginIdx( String LoginId );

	/**
	 *	Get the map of List<ISecureProtSecClusRoleMembObj> instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecClusRoleMembObj> cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecClusRoleMembObj> readSecClusRoleMembByLoginIdx( String LoginId,
		boolean forceRead );

	ISecureProtSecClusRoleMembObj readCachedSecClusRoleMembByIdIdx( ICFKeyHash256 SecClusRoleId,
		String LoginId );

	List<List<ISecureProtSecClusRoleMembObj>> readCachedSecClusRoleMembByClusRoleIdx( ICFKeyHash256 SecClusRoleId );

	List<List<ISecureProtSecClusRoleMembObj>> readCachedSecClusRoleMembByLoginIdx( String LoginId );

	void deepDisposeSecClusRoleMembByIdIdx( ICFKeyHash256 SecClusRoleId,
		String LoginId );

	void deepDisposeSecClusRoleMembByClusRoleIdx( ICFKeyHash256 SecClusRoleId );

	void deepDisposeSecClusRoleMembByLoginIdx( String LoginId );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecClusRoleMembObj updateSecClusRoleMemb( ISecureProtSecClusRoleMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecClusRoleMemb( ISecureProtSecClusRoleMembObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleMembByIdIdx( ICFKeyHash256 SecClusRoleId,
		String LoginId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecClusRoleId	The SecClusRoleMemb key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleMembByClusRoleIdx( ICFKeyHash256 SecClusRoleId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LoginId	The SecClusRoleMemb key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleMembByLoginIdx( String LoginId );
}
