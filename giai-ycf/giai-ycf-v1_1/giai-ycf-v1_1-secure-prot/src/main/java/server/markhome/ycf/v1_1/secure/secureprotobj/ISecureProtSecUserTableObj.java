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

public interface ISecureProtSecUserTableObj
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
	 *	Instantiate a new SecUser instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecUserObj newInstance();

	/**
	 *	Instantiate a new SecUser edition of the specified SecUser instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecUserEditObj newEditInstance( ISecureProtSecUserObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecUserEditObj instance, which may be a subclass of a SecUser instance.
	 */
	ISecureProtSecUserObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserObj realiseSecUser( ISecureProtSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserObj createSecUser( ISecureProtSecUserObj Obj );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecUserObj readSecUser( CFDbKeyHash256 pkey );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecUserObj readSecUser( CFDbKeyHash256 pkey,
		boolean forceRead );

	ISecureProtSecUserObj readCachedSecUser( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeSecUser( ISecureProtSecUserObj obj );

	void deepDisposeSecUser( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserObj lockSecUser( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecUserObj> readAllSecUser();

	/**
	 *	Return a sorted map of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecUserObj> readAllSecUser( boolean forceRead );

	List<ISecureProtSecUserObj> readCachedAllSecUser();

	/**
	 *	Get the ISecureProtSecUserObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserObj readSecUserByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Get the ISecureProtSecUserObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserObj readSecUserByIdIdx( ICFKeyHash256 SecUserId,
		boolean forceRead );

	/**
	 *	Get the ISecureProtSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	LoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserObj cached instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserObj readSecUserByULoginIdx(String LoginId );

	/**
	 *	Get the ISecureProtSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	LoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserObj refreshed instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserObj readSecUserByULoginIdx(String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecUserObj> instances sorted by their primary keys for the duplicate EMAddrIdx key.
	 *
	 *	@param	EMailAddress	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserObj> cached instances sorted by their primary keys for the duplicate EMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserObj> readSecUserByEMAddrIdx( String EMailAddress );

	/**
	 *	Get the map of List<ISecureProtSecUserObj> instances sorted by their primary keys for the duplicate EMAddrIdx key.
	 *
	 *	@param	EMailAddress	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserObj> cached instances sorted by their primary keys for the duplicate EMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserObj> readSecUserByEMAddrIdx( String EMailAddress,
		boolean forceRead );

	ISecureProtSecUserObj readCachedSecUserByIdIdx( ICFKeyHash256 SecUserId );

	ISecureProtSecUserObj readCachedSecUserByULoginIdx( String LoginId );

	List<List<ISecureProtSecUserObj>> readCachedSecUserByEMAddrIdx( String EMailAddress );

	void deepDisposeSecUserByIdIdx( ICFKeyHash256 SecUserId );

	void deepDisposeSecUserByULoginIdx( String LoginId );

	void deepDisposeSecUserByEMAddrIdx( String EMailAddress );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserObj updateSecUser( ISecureProtSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUser( ISecureProtSecUserObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LoginId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByULoginIdx(String LoginId );

	/**
	 *	Internal use only.
	 *
	 *	@param	EMailAddress	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByEMAddrIdx( String EMailAddress );
}
