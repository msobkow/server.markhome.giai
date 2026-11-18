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

public interface ISecureSecSysRoleEnablesTableObj
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
	 *	Instantiate a new SecSysRoleEnables instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecSysRoleEnablesObj newInstance();

	/**
	 *	Instantiate a new SecSysRoleEnables edition of the specified SecSysRoleEnables instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecSysRoleEnablesEditObj newEditInstance( ISecureSecSysRoleEnablesObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecSysRoleEnablesObj instance, which may be a subclass of a SecSysRoleEnables instance.
	 */
	ISecureSecSysRoleEnablesObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysRoleEnablesObj realiseSecSysRoleEnables( ISecureSecSysRoleEnablesObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysRoleEnablesObj createSecSysRoleEnables( ISecureSecSysRoleEnablesObj Obj );

	/**
	 *	Read a SecSysRoleEnables-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRoleEnables-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysRoleEnablesObj readSecSysRoleEnables( ISecureSecSysRoleEnablesPKey pkey );

	/**
	 *	Read a SecSysRoleEnables-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRoleEnables-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysRoleEnablesObj readSecSysRoleEnables( ISecureSecSysRoleEnablesPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecSysRoleEnables-derived instance by it's primary key.
	 *
	 *	@return	The SecSysRoleEnables-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysRoleEnablesObj readSecSysRoleEnables( ICFKeyHash256 SecSysRoleId,
		String EnableName );

	/**
	 *	Read a SecSysRoleEnables-derived instance by it's primary key.
	 *
	 *	@return	The SecSysRoleEnables-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysRoleEnablesObj readSecSysRoleEnables( ICFKeyHash256 SecSysRoleId,
		String EnableName,
		boolean forceRead );

	ISecureSecSysRoleEnablesObj readCachedSecSysRoleEnables( ISecureSecSysRoleEnablesPKey pkey );

	public void reallyDeepDisposeSecSysRoleEnables( ISecureSecSysRoleEnablesObj obj );

	void deepDisposeSecSysRoleEnables( ISecureSecSysRoleEnablesPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysRoleEnablesObj lockSecSysRoleEnables( ISecureSecSysRoleEnablesPKey pkey );

	/**
	 *	Return a sorted list of all the SecSysRoleEnables-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysRoleEnablesObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysRoleEnablesObj> readAllSecSysRoleEnables();

	/**
	 *	Return a sorted map of all the SecSysRoleEnables-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysRoleEnablesObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysRoleEnablesObj> readAllSecSysRoleEnables( boolean forceRead );

	List<ISecureSecSysRoleEnablesObj> readCachedAllSecSysRoleEnables();

	/**
	 *	Get the SecureSecSysRoleEnablesObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysRoleEnablesObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysRoleEnablesObj readSecSysRoleEnablesByIdIdx( ICFKeyHash256 SecSysRoleId,
		String EnableName );

	/**
	 *	Get the SecureSecSysRoleEnablesObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysRoleEnablesObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysRoleEnablesObj readSecSysRoleEnablesByIdIdx( ICFKeyHash256 SecSysRoleId,
		String EnableName,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecSysRoleEnablesObj instances sorted by their primary keys for the duplicate SysRoleIdx key.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysRoleEnablesObj cached instances sorted by their primary keys for the duplicate SysRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysRoleEnablesObj> readSecSysRoleEnablesBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	/**
	 *	Get the map of SecureSecSysRoleEnablesObj instances sorted by their primary keys for the duplicate SysRoleIdx key.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysRoleEnablesObj cached instances sorted by their primary keys for the duplicate SysRoleIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysRoleEnablesObj> readSecSysRoleEnablesBySysRoleIdx( ICFKeyHash256 SecSysRoleId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecSysRoleEnablesObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysRoleEnablesObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysRoleEnablesObj> readSecSysRoleEnablesByNameIdx( String EnableName );

	/**
	 *	Get the map of SecureSecSysRoleEnablesObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysRoleEnablesObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysRoleEnablesObj> readSecSysRoleEnablesByNameIdx( String EnableName,
		boolean forceRead );

	ISecureSecSysRoleEnablesObj readCachedSecSysRoleEnablesByIdIdx( ICFKeyHash256 SecSysRoleId,
		String EnableName );

	List<ISecureSecSysRoleEnablesObj> readCachedSecSysRoleEnablesBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	List<ISecureSecSysRoleEnablesObj> readCachedSecSysRoleEnablesByNameIdx( String EnableName );

	void deepDisposeSecSysRoleEnablesByIdIdx( ICFKeyHash256 SecSysRoleId,
		String EnableName );

	void deepDisposeSecSysRoleEnablesBySysRoleIdx( ICFKeyHash256 SecSysRoleId );

	void deepDisposeSecSysRoleEnablesByNameIdx( String EnableName );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysRoleEnablesObj updateSecSysRoleEnables( ISecureSecSysRoleEnablesObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSysRoleEnables( ISecureSecSysRoleEnablesObj Obj );

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
