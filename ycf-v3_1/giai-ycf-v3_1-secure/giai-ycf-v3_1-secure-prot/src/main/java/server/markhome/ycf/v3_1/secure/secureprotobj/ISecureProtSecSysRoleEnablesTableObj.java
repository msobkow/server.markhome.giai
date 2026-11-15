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

public interface ISecureProtSecSysRoleEnablesTableObj
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
	 *	Instantiate a new SecSysRoleEnables instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecSysRoleEnablesObj newInstance();

	/**
	 *	Instantiate a new SecSysRoleEnables edition of the specified SecSysRoleEnables instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecSysRoleEnablesEditObj newEditInstance( ISecureProtSecSysRoleEnablesObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecSysRoleEnablesEditObj instance, which may be a subclass of a SecSysRoleEnables instance.
	 */
	ISecureProtSecSysRoleEnablesObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSysRoleEnablesObj realiseSecSysRoleEnables( ISecureProtSecSysRoleEnablesObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSysRoleEnablesObj createSecSysRoleEnables( ISecureProtSecSysRoleEnablesObj Obj );

	/**
	 *	Read a SecSysRoleEnables-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRoleEnables-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSysRoleEnablesObj readSecSysRoleEnables( ISecureProtSecSysRoleEnablesPKey pkey );

	/**
	 *	Read a SecSysRoleEnables-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRoleEnables-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSysRoleEnablesObj readSecSysRoleEnables( ISecureProtSecSysRoleEnablesPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecSysRoleEnables-derived instance by it's primary key.
	 *
	 *	@return	The SecSysRoleEnables-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSysRoleEnablesObj readSecSysRoleEnables( ICFKeyHash256 SecSysRoleId,
		String EnableName );

	/**
	 *	Read a SecSysRoleEnables-derived instance by it's primary key.
	 *
	 *	@return	The SecSysRoleEnables-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSysRoleEnablesObj readSecSysRoleEnables( ICFKeyHash256 SecSysRoleId,
		String EnableName,
		boolean forceRead );

	ISecureProtSecSysRoleEnablesObj readCachedSecSysRoleEnables( ISecureProtSecSysRoleEnablesPKey pkey );

	public void reallyDeepDisposeSecSysRoleEnables( ISecureProtSecSysRoleEnablesObj obj );

	void deepDisposeSecSysRoleEnables( ISecureProtSecSysRoleEnablesPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSysRoleEnablesObj lockSecSysRoleEnables( ISecureProtSecSysRoleEnablesPKey pkey );

	/**
	 *	Return a sorted list of all the SecSysRoleEnables-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecSysRoleEnablesObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecSysRoleEnablesObj> readAllSecSysRoleEnables();

	/**
	 *	Return a sorted map of all the SecSysRoleEnables-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecSysRoleEnablesObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecSysRoleEnablesObj> readAllSecSysRoleEnables( boolean forceRead );

	List<ISecureProtSecSysRoleEnablesObj> readCachedAllSecSysRoleEnables();

	/**
	 *	Get the ISecureProtSecSysRoleEnablesObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecSysRoleEnablesObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecSysRoleEnablesObj readSecSysRoleEnablesByIdIdx( ICFKeyHash256 SecSysRoleId,
		String EnableName );

	/**
	 *	Get the ISecureProtSecSysRoleEnablesObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecSysRoleEnablesObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecSysRoleEnablesObj readSecSysRoleEnablesByIdIdx( ICFKeyHash256 SecSysRoleId,
		String EnableName,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecSysRoleEnablesObj> instances sorted by their primary keys for the duplicate SysRoleIdx key.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSysRoleEnablesObj> cached instances sorted by their primary keys for the duplicate SysRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSysRoleEnablesObj> readSecSysRoleEnablesBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	/**
	 *	Get the map of List<ISecureProtSecSysRoleEnablesObj> instances sorted by their primary keys for the duplicate SysRoleIdx key.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSysRoleEnablesObj> cached instances sorted by their primary keys for the duplicate SysRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSysRoleEnablesObj> readSecSysRoleEnablesBySysRoleIdx( ICFKeyHash256 SecSysRoleId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecSysRoleEnablesObj> instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSysRoleEnablesObj> cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSysRoleEnablesObj> readSecSysRoleEnablesByNameIdx( String EnableName );

	/**
	 *	Get the map of List<ISecureProtSecSysRoleEnablesObj> instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSysRoleEnablesObj> cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSysRoleEnablesObj> readSecSysRoleEnablesByNameIdx( String EnableName,
		boolean forceRead );

	ISecureProtSecSysRoleEnablesObj readCachedSecSysRoleEnablesByIdIdx( ICFKeyHash256 SecSysRoleId,
		String EnableName );

	List<List<ISecureProtSecSysRoleEnablesObj>> readCachedSecSysRoleEnablesBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	List<List<ISecureProtSecSysRoleEnablesObj>> readCachedSecSysRoleEnablesByNameIdx( String EnableName );

	void deepDisposeSecSysRoleEnablesByIdIdx( ICFKeyHash256 SecSysRoleId,
		String EnableName );

	void deepDisposeSecSysRoleEnablesBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	void deepDisposeSecSysRoleEnablesByNameIdx( String EnableName );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSysRoleEnablesObj updateSecSysRoleEnables( ISecureProtSecSysRoleEnablesObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSysRoleEnables( ISecureProtSecSysRoleEnablesObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 */
	void deleteSecSysRoleEnablesByIdIdx( ICFKeyHash256 SecSysRoleId,
		String EnableName );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 */
	void deleteSecSysRoleEnablesBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	/**
	 *	Internal use only.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 */
	void deleteSecSysRoleEnablesByNameIdx( String EnableName );
}
