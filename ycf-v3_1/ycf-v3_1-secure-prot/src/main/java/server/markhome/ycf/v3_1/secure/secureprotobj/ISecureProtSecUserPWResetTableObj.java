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

public interface ISecureProtSecUserPWResetTableObj
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
	 *	Instantiate a new SecUserPWReset instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecUserPWResetObj newInstance();

	/**
	 *	Instantiate a new SecUserPWReset edition of the specified SecUserPWReset instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecUserPWResetEditObj newEditInstance( ISecureProtSecUserPWResetObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecUserPWResetEditObj instance, which may be a subclass of a SecUserPWReset instance.
	 */
	ISecureProtSecUserPWResetObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserPWResetObj realiseSecUserPWReset( ISecureProtSecUserPWResetObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserPWResetObj createSecUserPWReset( ISecureProtSecUserPWResetObj Obj );

	/**
	 *	Read a SecUserPWReset-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserPWReset-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecUserPWResetObj readSecUserPWReset( CFDbKeyHash256 pkey );

	/**
	 *	Read a SecUserPWReset-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserPWReset-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecUserPWResetObj readSecUserPWReset( CFDbKeyHash256 pkey,
		boolean forceRead );

	ISecureProtSecUserPWResetObj readCachedSecUserPWReset( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeSecUserPWReset( ISecureProtSecUserPWResetObj obj );

	void deepDisposeSecUserPWReset( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserPWResetObj lockSecUserPWReset( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecUserPWReset-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecUserPWResetObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecUserPWResetObj> readAllSecUserPWReset();

	/**
	 *	Return a sorted map of all the SecUserPWReset-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecUserPWResetObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecUserPWResetObj> readAllSecUserPWReset( boolean forceRead );

	List<ISecureProtSecUserPWResetObj> readCachedAllSecUserPWReset();

	/**
	 *	Get the ISecureProtSecUserPWResetObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserPWResetObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserPWResetObj readSecUserPWResetByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Get the ISecureProtSecUserPWResetObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserPWResetObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserPWResetObj readSecUserPWResetByIdIdx( ICFKeyHash256 SecUserId,
		boolean forceRead );

	/**
	 *	Get the ISecureProtSecUserPWResetObj instance for the unique UUuid6Idx key.
	 *
	 *	@param	PasswordResetUuid6	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserPWResetObj cached instance for the unique UUuid6Idx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserPWResetObj readSecUserPWResetByUUuid6Idx(ICFUuid6 PasswordResetUuid6 );

	/**
	 *	Get the ISecureProtSecUserPWResetObj instance for the unique UUuid6Idx key.
	 *
	 *	@param	PasswordResetUuid6	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserPWResetObj refreshed instance for the unique UUuid6Idx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserPWResetObj readSecUserPWResetByUUuid6Idx(ICFUuid6 PasswordResetUuid6,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecUserPWResetObj> instances sorted by their primary keys for the duplicate SentEMAddrIdx key.
	 *
	 *	@param	SentToEMailAddr	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserPWResetObj> cached instances sorted by their primary keys for the duplicate SentEMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserPWResetObj> readSecUserPWResetBySentEMAddrIdx( String SentToEMailAddr );

	/**
	 *	Get the map of List<ISecureProtSecUserPWResetObj> instances sorted by their primary keys for the duplicate SentEMAddrIdx key.
	 *
	 *	@param	SentToEMailAddr	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserPWResetObj> cached instances sorted by their primary keys for the duplicate SentEMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserPWResetObj> readSecUserPWResetBySentEMAddrIdx( String SentToEMailAddr,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecUserPWResetObj> instances sorted by their primary keys for the duplicate NewAcctIdx key.
	 *
	 *	@param	NewAccount	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserPWResetObj> cached instances sorted by their primary keys for the duplicate NewAcctIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserPWResetObj> readSecUserPWResetByNewAcctIdx( boolean NewAccount );

	/**
	 *	Get the map of List<ISecureProtSecUserPWResetObj> instances sorted by their primary keys for the duplicate NewAcctIdx key.
	 *
	 *	@param	NewAccount	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserPWResetObj> cached instances sorted by their primary keys for the duplicate NewAcctIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserPWResetObj> readSecUserPWResetByNewAcctIdx( boolean NewAccount,
		boolean forceRead );

	ISecureProtSecUserPWResetObj readCachedSecUserPWResetByIdIdx( ICFKeyHash256 SecUserId );

	ISecureProtSecUserPWResetObj readCachedSecUserPWResetByUUuid6Idx( ICFUuid6 PasswordResetUuid6 );

	List<List<ISecureProtSecUserPWResetObj>> readCachedSecUserPWResetBySentEMAddrIdx( String SentToEMailAddr );

	List<List<ISecureProtSecUserPWResetObj>> readCachedSecUserPWResetByNewAcctIdx( boolean NewAccount );

	void deepDisposeSecUserPWResetByIdIdx( ICFKeyHash256 SecUserId );

	void deepDisposeSecUserPWResetByUUuid6Idx( ICFUuid6 PasswordResetUuid6 );

	void deepDisposeSecUserPWResetBySentEMAddrIdx( String SentToEMailAddr );

	void deepDisposeSecUserPWResetByNewAcctIdx( boolean NewAccount );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserPWResetObj updateSecUserPWReset( ISecureProtSecUserPWResetObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUserPWReset( ISecureProtSecUserPWResetObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecUserPWReset key attribute of the instance generating the id.
	 */
	void deleteSecUserPWResetByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PasswordResetUuid6	The SecUserPWReset key attribute of the instance generating the id.
	 */
	void deleteSecUserPWResetByUUuid6Idx(ICFUuid6 PasswordResetUuid6 );

	/**
	 *	Internal use only.
	 *
	 *	@param	SentToEMailAddr	The SecUserPWReset key attribute of the instance generating the id.
	 */
	void deleteSecUserPWResetBySentEMAddrIdx( String SentToEMailAddr );

	/**
	 *	Internal use only.
	 *
	 *	@param	NewAccount	The SecUserPWReset key attribute of the instance generating the id.
	 */
	void deleteSecUserPWResetByNewAcctIdx( boolean NewAccount );
}
