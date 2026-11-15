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

public interface ISecureSecUserPWResetTableObj
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
	 *	Instantiate a new SecUserPWReset instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecUserPWResetObj newInstance();

	/**
	 *	Instantiate a new SecUserPWReset edition of the specified SecUserPWReset instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecUserPWResetEditObj newEditInstance( ISecureSecUserPWResetObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecUserPWResetObj instance, which may be a subclass of a SecUserPWReset instance.
	 */
	ISecureSecUserPWResetObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPWResetObj realiseSecUserPWReset( ISecureSecUserPWResetObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPWResetObj createSecUserPWReset( ISecureSecUserPWResetObj Obj );

	/**
	 *	Read a SecUserPWReset-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserPWReset-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserPWResetObj readSecUserPWReset( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SecUserPWReset-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserPWReset-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserPWResetObj readSecUserPWReset( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureSecUserPWResetObj readCachedSecUserPWReset( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSecUserPWReset( ISecureSecUserPWResetObj obj );

	void deepDisposeSecUserPWReset( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPWResetObj lockSecUserPWReset( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SecUserPWReset-derived instances in the database.
	 *
	 *	@return	List of ISecureSecUserPWResetObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecUserPWResetObj> readAllSecUserPWReset();

	/**
	 *	Return a sorted map of all the SecUserPWReset-derived instances in the database.
	 *
	 *	@return	List of ISecureSecUserPWResetObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecUserPWResetObj> readAllSecUserPWReset( boolean forceRead );

	List<ISecureSecUserPWResetObj> readCachedAllSecUserPWReset();

	/**
	 *	Get the SecureSecUserPWResetObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWResetObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWResetObj readSecUserPWResetByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Get the SecureSecUserPWResetObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWResetObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWResetObj readSecUserPWResetByIdIdx( ICFKeyHash256 SecUserId,
		boolean forceRead );

	/**
	 *	Get the SecureSecUserPWResetObj instance for the unique UUuid6Idx key.
	 *
	 *	@param	PasswordResetUuid6	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWResetObj cached instance for the unique UUuid6Idx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWResetObj readSecUserPWResetByUUuid6Idx(ICFUuid6 PasswordResetUuid6 );

	/**
	 *	Get the SecureSecUserPWResetObj instance for the unique UUuid6Idx key.
	 *
	 *	@param	PasswordResetUuid6	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWResetObj refreshed instance for the unique UUuid6Idx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWResetObj readSecUserPWResetByUUuid6Idx(ICFUuid6 PasswordResetUuid6,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecUserPWResetObj instances sorted by their primary keys for the duplicate SentEMAddrIdx key.
	 *
	 *	@param	SentToEMailAddr	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecUserPWResetObj cached instances sorted by their primary keys for the duplicate SentEMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecUserPWResetObj> readSecUserPWResetBySentEMAddrIdx( String SentToEMailAddr );

	/**
	 *	Get the map of SecureSecUserPWResetObj instances sorted by their primary keys for the duplicate SentEMAddrIdx key.
	 *
	 *	@param	SentToEMailAddr	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecUserPWResetObj cached instances sorted by their primary keys for the duplicate SentEMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecUserPWResetObj> readSecUserPWResetBySentEMAddrIdx( String SentToEMailAddr,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecUserPWResetObj instances sorted by their primary keys for the duplicate NewAcctIdx key.
	 *
	 *	@param	NewAccount	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecUserPWResetObj cached instances sorted by their primary keys for the duplicate NewAcctIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecUserPWResetObj> readSecUserPWResetByNewAcctIdx( boolean NewAccount );

	/**
	 *	Get the map of SecureSecUserPWResetObj instances sorted by their primary keys for the duplicate NewAcctIdx key.
	 *
	 *	@param	NewAccount	The SecUserPWReset key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecUserPWResetObj cached instances sorted by their primary keys for the duplicate NewAcctIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecUserPWResetObj> readSecUserPWResetByNewAcctIdx( boolean NewAccount,
		boolean forceRead );

	ISecureSecUserPWResetObj readCachedSecUserPWResetByIdIdx( ICFKeyHash256 SecUserId );

	ISecureSecUserPWResetObj readCachedSecUserPWResetByUUuid6Idx( ICFUuid6 PasswordResetUuid6 );

	List<ISecureSecUserPWResetObj> readCachedSecUserPWResetBySentEMAddrIdx( String SentToEMailAddr );

	List<ISecureSecUserPWResetObj> readCachedSecUserPWResetByNewAcctIdx( boolean NewAccount );

	void deepDisposeSecUserPWResetByIdIdx( ICFKeyHash256 SecUserId );

	void deepDisposeSecUserPWResetByUUuid6Idx( ICFUuid6 PasswordResetUuid6 );

	void deepDisposeSecUserPWResetBySentEMAddrIdx( String SentToEMailAddr );

	void deepDisposeSecUserPWResetByNewAcctIdx( boolean NewAccount );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPWResetObj updateSecUserPWReset( ISecureSecUserPWResetObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUserPWReset( ISecureSecUserPWResetObj Obj );

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
