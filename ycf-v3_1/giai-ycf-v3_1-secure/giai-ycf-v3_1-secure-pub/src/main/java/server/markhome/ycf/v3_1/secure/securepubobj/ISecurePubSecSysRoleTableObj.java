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

public interface ISecurePubSecSysRoleTableObj
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
	 *	Instantiate a new SecSysRole instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubSecSysRoleObj newInstance();

	/**
	 *	Instantiate a new SecSysRole edition of the specified SecSysRole instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubSecSysRoleEditObj newEditInstance( ISecurePubSecSysRoleObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubSecSysRoleObj instance, which may be a subclass of a SecSysRole instance.
	 */
	ISecurePubSecSysRoleObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecSysRoleObj realiseSecSysRole( ISecurePubSecSysRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecSysRoleObj createSecSysRole( ISecurePubSecSysRoleObj Obj );

	/**
	 *	Read a SecSysRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubSecSysRoleObj readSecSysRole( ICFKeyHash256 pkey );

	/**
	 *	Read a SecSysRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubSecSysRoleObj readSecSysRole( ICFKeyHash256 pkey,
		boolean forceRead );

	ISecurePubSecSysRoleObj readCachedSecSysRole( ICFKeyHash256 pkey );

	public void reallyDeepDisposeSecSysRole( ISecurePubSecSysRoleObj obj );

	void deepDisposeSecSysRole( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecSysRoleObj lockSecSysRole( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecSysRole-derived instances in the database.
	 *
	 *	@return	List of ISecurePubSecSysRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubSecSysRoleObj> readAllSecSysRole();

	/**
	 *	Return a sorted map of all the SecSysRole-derived instances in the database.
	 *
	 *	@return	List of ISecurePubSecSysRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubSecSysRoleObj> readAllSecSysRole( boolean forceRead );

	List<ISecurePubSecSysRoleObj> readCachedAllSecSysRole();

	/**
	 *	Get the SecurePubSecSysRoleObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRole key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecSysRoleObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecSysRoleObj readSecSysRoleByIdIdx( CFDbKeyHash256 SecSysRoleId );

	/**
	 *	Get the SecurePubSecSysRoleObj instance for the primary key attributes.
	 *
	 *	@param	SecSysRoleId	The SecSysRole key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecSysRoleObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecSysRoleObj readSecSysRoleByIdIdx( CFDbKeyHash256 SecSysRoleId,
		boolean forceRead );

	/**
	 *	Get the SecurePubSecSysRoleObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The SecSysRole key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecSysRoleObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecSysRoleObj readSecSysRoleByUNameIdx(String Name );

	/**
	 *	Get the SecurePubSecSysRoleObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The SecSysRole key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecSysRoleObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecSysRoleObj readSecSysRoleByUNameIdx(String Name,
		boolean forceRead );

	ISecurePubSecSysRoleObj readCachedSecSysRoleByIdIdx( CFDbKeyHash256 SecSysRoleId );

	ISecurePubSecSysRoleObj readCachedSecSysRoleByUNameIdx( String Name );

	void deepDisposeSecSysRoleByIdIdx( CFDbKeyHash256 SecSysRoleId );

	void deepDisposeSecSysRoleByUNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecSysRoleObj updateSecSysRole( ISecurePubSecSysRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSysRole( ISecurePubSecSysRoleObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysRoleId	The SecSysRole key attribute of the instance generating the id.
	 */
	void deleteSecSysRoleByIdIdx( CFDbKeyHash256 SecSysRoleId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The SecSysRole key attribute of the instance generating the id.
	 */
	void deleteSecSysRoleByUNameIdx(String Name );
}
