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

public interface ISecureTenantTableObj
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
	 *	Instantiate a new Tenant instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureTenantObj newInstance();

	/**
	 *	Instantiate a new Tenant edition of the specified Tenant instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureTenantEditObj newEditInstance( ISecureTenantObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureTenantObj instance, which may be a subclass of a Tenant instance.
	 */
	ISecureTenantObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureTenantObj realiseTenant( ISecureTenantObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureTenantObj createTenant( ISecureTenantObj Obj );

	/**
	 *	Read a Tenant-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tenant-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureTenantObj readTenant( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a Tenant-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tenant-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureTenantObj readTenant( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureTenantObj readCachedTenant( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTenant( ISecureTenantObj obj );

	void deepDisposeTenant( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureTenantObj lockTenant( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the Tenant-derived instances in the database.
	 *
	 *	@return	List of ISecureTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureTenantObj> readAllTenant();

	/**
	 *	Return a sorted map of all the Tenant-derived instances in the database.
	 *
	 *	@return	List of ISecureTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureTenantObj> readAllTenant( boolean forceRead );

	List<ISecureTenantObj> readCachedAllTenant();

	/**
	 *	Get the SecureTenantObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	SecureTenantObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureTenantObj readTenantByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the SecureTenantObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	SecureTenantObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureTenantObj readTenantByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of SecureTenantObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureTenantObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureTenantObj> readTenantByClusterIdx( ICFKeyHash256 ClusterId );

	/**
	 *	Get the map of SecureTenantObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureTenantObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureTenantObj> readTenantByClusterIdx( ICFKeyHash256 ClusterId,
		boolean forceRead );

	/**
	 *	Get the SecureTenantObj instance for the unique UNameIdx key.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	TenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	SecureTenantObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureTenantObj readTenantByUNameIdx(ICFKeyHash256 ClusterId,
		String TenantName );

	/**
	 *	Get the SecureTenantObj instance for the unique UNameIdx key.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	TenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	SecureTenantObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureTenantObj readTenantByUNameIdx(ICFKeyHash256 ClusterId,
		String TenantName,
		boolean forceRead );

	ISecureTenantObj readCachedTenantByIdIdx( ICFKeyHash256 Id );

	List<ISecureTenantObj> readCachedTenantByClusterIdx( ICFKeyHash256 ClusterId );

	ISecureTenantObj readCachedTenantByUNameIdx( ICFKeyHash256 ClusterId,
		String TenantName );

	void deepDisposeTenantByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTenantByClusterIdx( ICFKeyHash256 ClusterId );

	void deepDisposeTenantByUNameIdx( ICFKeyHash256 ClusterId,
		String TenantName );

	/**
	 *	Internal use only.
	 */
	ISecureTenantObj updateTenant( ISecureTenantObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTenant( ISecureTenantObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Tenant key attribute of the instance generating the id.
	 */
	void deleteTenantByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 */
	void deleteTenantByClusterIdx( ICFKeyHash256 ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	TenantName	The Tenant key attribute of the instance generating the id.
	 */
	void deleteTenantByUNameIdx(ICFKeyHash256 ClusterId,
		String TenantName );
}
