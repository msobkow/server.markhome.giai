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

public interface ISecureSecClusRoleTableObj
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
	 *	Instantiate a new SecClusRole instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecClusRoleObj newInstance();

	/**
	 *	Instantiate a new SecClusRole edition of the specified SecClusRole instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecClusRoleEditObj newEditInstance( ISecureSecClusRoleObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecClusRoleObj instance, which may be a subclass of a SecClusRole instance.
	 */
	ISecureSecClusRoleObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecClusRoleObj realiseSecClusRole( ISecureSecClusRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecClusRoleObj createSecClusRole( ISecureSecClusRoleObj Obj );

	/**
	 *	Read a SecClusRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecClusRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecClusRoleObj readSecClusRole( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SecClusRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecClusRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecClusRoleObj readSecClusRole( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureSecClusRoleObj readCachedSecClusRole( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSecClusRole( ISecureSecClusRoleObj obj );

	void deepDisposeSecClusRole( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecClusRoleObj lockSecClusRole( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SecClusRole-derived instances in the database.
	 *
	 *	@return	List of ISecureSecClusRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecClusRoleObj> readAllSecClusRole();

	/**
	 *	Return a sorted map of all the SecClusRole-derived instances in the database.
	 *
	 *	@return	List of ISecureSecClusRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecClusRoleObj> readAllSecClusRole( boolean forceRead );

	List<ISecureSecClusRoleObj> readCachedAllSecClusRole();

	/**
	 *	Get the SecureSecClusRoleObj instance for the primary key attributes.
	 *
	 *	@param	SecClusRoleId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecClusRoleObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecClusRoleObj readSecClusRoleByIdIdx( ICFKeyHash256 SecClusRoleId );

	/**
	 *	Get the SecureSecClusRoleObj instance for the primary key attributes.
	 *
	 *	@param	SecClusRoleId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecClusRoleObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecClusRoleObj readSecClusRoleByIdIdx( ICFKeyHash256 SecClusRoleId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecClusRoleObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecClusRoleObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecClusRoleObj> readSecClusRoleByClusterIdx( ICFKeyHash256 ClusterId );

	/**
	 *	Get the map of SecureSecClusRoleObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecClusRoleObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecClusRoleObj> readSecClusRoleByClusterIdx( ICFKeyHash256 ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecClusRoleObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecClusRoleObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecClusRoleObj> readSecClusRoleByNameIdx( String Name );

	/**
	 *	Get the map of SecureSecClusRoleObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecClusRoleObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecClusRoleObj> readSecClusRoleByNameIdx( String Name,
		boolean forceRead );

	/**
	 *	Get the SecureSecClusRoleObj instance for the unique UNameIdx key.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecClusRoleObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecClusRoleObj readSecClusRoleByUNameIdx(ICFKeyHash256 ClusterId,
		String Name );

	/**
	 *	Get the SecureSecClusRoleObj instance for the unique UNameIdx key.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecClusRoleObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecClusRoleObj readSecClusRoleByUNameIdx(ICFKeyHash256 ClusterId,
		String Name,
		boolean forceRead );

	ISecureSecClusRoleObj readCachedSecClusRoleByIdIdx( ICFKeyHash256 SecClusRoleId );

	List<ISecureSecClusRoleObj> readCachedSecClusRoleByClusterIdx( ICFKeyHash256 ClusterId );

	List<ISecureSecClusRoleObj> readCachedSecClusRoleByNameIdx( String Name );

	ISecureSecClusRoleObj readCachedSecClusRoleByUNameIdx( ICFKeyHash256 ClusterId,
		String Name );

	void deepDisposeSecClusRoleByIdIdx( ICFKeyHash256 SecClusRoleId );

	void deepDisposeSecClusRoleByClusterIdx( ICFKeyHash256 ClusterId );

	void deepDisposeSecClusRoleByNameIdx( String Name );

	void deepDisposeSecClusRoleByUNameIdx( ICFKeyHash256 ClusterId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ISecureSecClusRoleObj updateSecClusRole( ISecureSecClusRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecClusRole( ISecureSecClusRoleObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecClusRoleId	The SecClusRole key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleByIdIdx( ICFKeyHash256 SecClusRoleId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleByClusterIdx( ICFKeyHash256 ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleByNameIdx( String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleByUNameIdx(ICFKeyHash256 ClusterId,
		String Name );
}
