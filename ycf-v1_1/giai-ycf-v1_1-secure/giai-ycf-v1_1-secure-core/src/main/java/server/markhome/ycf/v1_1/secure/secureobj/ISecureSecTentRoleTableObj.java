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

public interface ISecureSecTentRoleTableObj
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
	 *	Instantiate a new SecTentRole instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecTentRoleObj newInstance();

	/**
	 *	Instantiate a new SecTentRole edition of the specified SecTentRole instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecTentRoleEditObj newEditInstance( ISecureSecTentRoleObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecTentRoleObj instance, which may be a subclass of a SecTentRole instance.
	 */
	ISecureSecTentRoleObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecTentRoleObj realiseSecTentRole( ISecureSecTentRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecTentRoleObj createSecTentRole( ISecureSecTentRoleObj Obj );

	/**
	 *	Read a SecTentRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecTentRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecTentRoleObj readSecTentRole( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SecTentRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecTentRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecTentRoleObj readSecTentRole( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureSecTentRoleObj readCachedSecTentRole( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSecTentRole( ISecureSecTentRoleObj obj );

	void deepDisposeSecTentRole( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecTentRoleObj lockSecTentRole( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SecTentRole-derived instances in the database.
	 *
	 *	@return	List of ISecureSecTentRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecTentRoleObj> readAllSecTentRole();

	/**
	 *	Return a sorted map of all the SecTentRole-derived instances in the database.
	 *
	 *	@return	List of ISecureSecTentRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecTentRoleObj> readAllSecTentRole( boolean forceRead );

	List<ISecureSecTentRoleObj> readCachedAllSecTentRole();

	/**
	 *	Get the SecureSecTentRoleObj instance for the primary key attributes.
	 *
	 *	@param	SecTentRoleId	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecTentRoleObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecTentRoleObj readSecTentRoleByIdIdx( ICFKeyHash256 SecTentRoleId );

	/**
	 *	Get the SecureSecTentRoleObj instance for the primary key attributes.
	 *
	 *	@param	SecTentRoleId	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecTentRoleObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecTentRoleObj readSecTentRoleByIdIdx( ICFKeyHash256 SecTentRoleId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecTentRoleObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecTentRoleObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecTentRoleObj> readSecTentRoleByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of SecureSecTentRoleObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecTentRoleObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecTentRoleObj> readSecTentRoleByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecTentRoleObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	Name	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecTentRoleObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecTentRoleObj> readSecTentRoleByNameIdx( String Name );

	/**
	 *	Get the map of SecureSecTentRoleObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	Name	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecTentRoleObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecTentRoleObj> readSecTentRoleByNameIdx( String Name,
		boolean forceRead );

	/**
	 *	Get the SecureSecTentRoleObj instance for the unique UNameIdx key.
	 *
	 *	@param	TenantId	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecTentRoleObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecTentRoleObj readSecTentRoleByUNameIdx(ICFKeyHash256 TenantId,
		String Name );

	/**
	 *	Get the SecureSecTentRoleObj instance for the unique UNameIdx key.
	 *
	 *	@param	TenantId	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecTentRoleObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecTentRoleObj readSecTentRoleByUNameIdx(ICFKeyHash256 TenantId,
		String Name,
		boolean forceRead );

	ISecureSecTentRoleObj readCachedSecTentRoleByIdIdx( ICFKeyHash256 SecTentRoleId );

	List<ISecureSecTentRoleObj> readCachedSecTentRoleByTenantIdx( ICFKeyHash256 TenantId );

	List<ISecureSecTentRoleObj> readCachedSecTentRoleByNameIdx( String Name );

	ISecureSecTentRoleObj readCachedSecTentRoleByUNameIdx( ICFKeyHash256 TenantId,
		String Name );

	void deepDisposeSecTentRoleByIdIdx( ICFKeyHash256 SecTentRoleId );

	void deepDisposeSecTentRoleByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeSecTentRoleByNameIdx( String Name );

	void deepDisposeSecTentRoleByUNameIdx( ICFKeyHash256 TenantId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ISecureSecTentRoleObj updateSecTentRole( ISecureSecTentRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecTentRole( ISecureSecTentRoleObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecTentRoleId	The SecTentRole key attribute of the instance generating the id.
	 */
	void deleteSecTentRoleByIdIdx( ICFKeyHash256 SecTentRoleId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SecTentRole key attribute of the instance generating the id.
	 */
	void deleteSecTentRoleByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The SecTentRole key attribute of the instance generating the id.
	 */
	void deleteSecTentRoleByNameIdx( String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SecTentRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecTentRole key attribute of the instance generating the id.
	 */
	void deleteSecTentRoleByUNameIdx(ICFKeyHash256 TenantId,
		String Name );
}
