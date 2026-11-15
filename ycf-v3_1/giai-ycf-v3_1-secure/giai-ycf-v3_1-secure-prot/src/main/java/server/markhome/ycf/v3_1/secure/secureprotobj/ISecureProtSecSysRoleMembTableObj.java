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

public interface ISecureProtSecSysRoleMembTableObj
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
	 *	Instantiate a new SecSysRoleMemb instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecSysRoleMembObj newInstance();

	/**
	 *	Instantiate a new SecSysRoleMemb edition of the specified SecSysRoleMemb instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecSysRoleMembEditObj newEditInstance( ISecureProtSecSysRoleMembObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecSysRoleMembEditObj instance, which may be a subclass of a SecSysRoleMemb instance.
	 */
	ISecureProtSecSysRoleMembObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSysRoleMembObj realiseSecSysRoleMemb( ISecureProtSecSysRoleMembObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSysRoleMembObj createSecSysRoleMemb( ISecureProtSecSysRoleMembObj Obj );

	/**
	 *	Read a SecSysRoleMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSysRoleMembObj readSecSysRoleMemb( ISecureProtSecSysRoleMembPKey pkey );

	/**
	 *	Read a SecSysRoleMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSysRoleMembObj readSecSysRoleMemb( ISecureProtSecSysRoleMembPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecSysRoleMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecSysRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSysRoleMembObj readSecSysRoleMemb( ICFKeyHash256 SecSysRoleId,
		String LoginId );

	/**
	 *	Read a SecSysRoleMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecSysRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSysRoleMembObj readSecSysRoleMemb( ICFKeyHash256 SecSysRoleId,
		String LoginId,
		boolean forceRead );

	ISecureProtSecSysRoleMembObj readCachedSecSysRoleMemb( ISecureProtSecSysRoleMembPKey pkey );

	public void reallyDeepDisposeSecSysRoleMemb( ISecureProtSecSysRoleMembObj obj );

	void deepDisposeSecSysRoleMemb( ISecureProtSecSysRoleMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSysRoleMembObj lockSecSysRoleMemb( ISecureProtSecSysRoleMembPKey pkey );

	/**
	 *	Return a sorted list of all the SecSysRoleMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecSysRoleMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecSysRoleMembObj> readAllSecSysRoleMemb();

	/**
	 *	Return a sorted map of all the SecSysRoleMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecSysRoleMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecSysRoleMembObj> readAllSecSysRoleMemb( boolean forceRead );

	List<ISecureProtSecSysRoleMembObj> readCachedAllSecSysRoleMemb();

	/**
	 *	Get the ISecureProtSecSysRoleMembObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecSysRoleMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecSysRoleMembObj readSecSysRoleMembByIdIdx( ICFKeyHash256 SecSysRoleId,
		String LoginId );

	/**
	 *	Get the ISecureProtSecSysRoleMembObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecSysRoleMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecSysRoleMembObj readSecSysRoleMembByIdIdx( ICFKeyHash256 SecSysRoleId,
		String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecSysRoleMembObj> instances sorted by their primary keys for the duplicate SysRoleIdx key.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSysRoleMembObj> cached instances sorted by their primary keys for the duplicate SysRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSysRoleMembObj> readSecSysRoleMembBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	/**
	 *	Get the map of List<ISecureProtSecSysRoleMembObj> instances sorted by their primary keys for the duplicate SysRoleIdx key.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSysRoleMembObj> cached instances sorted by their primary keys for the duplicate SysRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSysRoleMembObj> readSecSysRoleMembBySysRoleIdx( ICFKeyHash256 SecSysRoleId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecSysRoleMembObj> instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSysRoleMembObj> cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSysRoleMembObj> readSecSysRoleMembByLoginIdx( String LoginId );

	/**
	 *	Get the map of List<ISecureProtSecSysRoleMembObj> instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSysRoleMembObj> cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSysRoleMembObj> readSecSysRoleMembByLoginIdx( String LoginId,
		boolean forceRead );

	ISecureProtSecSysRoleMembObj readCachedSecSysRoleMembByIdIdx( ICFKeyHash256 SecSysRoleId,
		String LoginId );

	List<List<ISecureProtSecSysRoleMembObj>> readCachedSecSysRoleMembBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	List<List<ISecureProtSecSysRoleMembObj>> readCachedSecSysRoleMembByLoginIdx( String LoginId );

	void deepDisposeSecSysRoleMembByIdIdx( ICFKeyHash256 SecSysRoleId,
		String LoginId );

	void deepDisposeSecSysRoleMembBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	void deepDisposeSecSysRoleMembByLoginIdx( String LoginId );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSysRoleMembObj updateSecSysRoleMemb( ISecureProtSecSysRoleMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSysRoleMemb( ISecureProtSecSysRoleMembObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 */
	void deleteSecSysRoleMembByIdIdx( ICFKeyHash256 SecSysRoleId,
		String LoginId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 */
	void deleteSecSysRoleMembBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 */
	void deleteSecSysRoleMembByLoginIdx( String LoginId );
}
