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

public interface ISecureSecSysRoleMembTableObj
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
	 *	Instantiate a new SecSysRoleMemb instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecSysRoleMembObj newInstance();

	/**
	 *	Instantiate a new SecSysRoleMemb edition of the specified SecSysRoleMemb instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecSysRoleMembEditObj newEditInstance( ISecureSecSysRoleMembObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecSysRoleMembObj instance, which may be a subclass of a SecSysRoleMemb instance.
	 */
	ISecureSecSysRoleMembObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysRoleMembObj realiseSecSysRoleMemb( ISecureSecSysRoleMembObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysRoleMembObj createSecSysRoleMemb( ISecureSecSysRoleMembObj Obj );

	/**
	 *	Read a SecSysRoleMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysRoleMembObj readSecSysRoleMemb( ISecureSecSysRoleMembPKey pkey );

	/**
	 *	Read a SecSysRoleMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysRoleMembObj readSecSysRoleMemb( ISecureSecSysRoleMembPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecSysRoleMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecSysRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysRoleMembObj readSecSysRoleMemb( ICFKeyHash256 SecSysRoleId,
		String LoginId );

	/**
	 *	Read a SecSysRoleMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecSysRoleMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysRoleMembObj readSecSysRoleMemb( ICFKeyHash256 SecSysRoleId,
		String LoginId,
		boolean forceRead );

	ISecureSecSysRoleMembObj readCachedSecSysRoleMemb( ISecureSecSysRoleMembPKey pkey );

	public void reallyDeepDisposeSecSysRoleMemb( ISecureSecSysRoleMembObj obj );

	void deepDisposeSecSysRoleMemb( ISecureSecSysRoleMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysRoleMembObj lockSecSysRoleMemb( ISecureSecSysRoleMembPKey pkey );

	/**
	 *	Return a sorted list of all the SecSysRoleMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysRoleMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysRoleMembObj> readAllSecSysRoleMemb();

	/**
	 *	Return a sorted map of all the SecSysRoleMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysRoleMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysRoleMembObj> readAllSecSysRoleMemb( boolean forceRead );

	List<ISecureSecSysRoleMembObj> readCachedAllSecSysRoleMemb();

	/**
	 *	Get the SecureSecSysRoleMembObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysRoleMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysRoleMembObj readSecSysRoleMembByIdIdx( ICFKeyHash256 SecSysRoleId,
		String LoginId );

	/**
	 *	Get the SecureSecSysRoleMembObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysRoleMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysRoleMembObj readSecSysRoleMembByIdIdx( ICFKeyHash256 SecSysRoleId,
		String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecSysRoleMembObj instances sorted by their primary keys for the duplicate SysRoleIdx key.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysRoleMembObj cached instances sorted by their primary keys for the duplicate SysRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysRoleMembObj> readSecSysRoleMembBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	/**
	 *	Get the map of SecureSecSysRoleMembObj instances sorted by their primary keys for the duplicate SysRoleIdx key.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysRoleMembObj cached instances sorted by their primary keys for the duplicate SysRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysRoleMembObj> readSecSysRoleMembBySysRoleIdx( ICFKeyHash256 SecSysRoleId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecSysRoleMembObj instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysRoleMembObj cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysRoleMembObj> readSecSysRoleMembByLoginIdx( String LoginId );

	/**
	 *	Get the map of SecureSecSysRoleMembObj instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecSysRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysRoleMembObj cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysRoleMembObj> readSecSysRoleMembByLoginIdx( String LoginId,
		boolean forceRead );

	ISecureSecSysRoleMembObj readCachedSecSysRoleMembByIdIdx( ICFKeyHash256 SecSysRoleId,
		String LoginId );

	List<ISecureSecSysRoleMembObj> readCachedSecSysRoleMembBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	List<ISecureSecSysRoleMembObj> readCachedSecSysRoleMembByLoginIdx( String LoginId );

	void deepDisposeSecSysRoleMembByIdIdx( ICFKeyHash256 SecSysRoleId,
		String LoginId );

	void deepDisposeSecSysRoleMembBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	void deepDisposeSecSysRoleMembByLoginIdx( String LoginId );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysRoleMembObj updateSecSysRoleMemb( ISecureSecSysRoleMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSysRoleMemb( ISecureSecSysRoleMembObj Obj );

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
