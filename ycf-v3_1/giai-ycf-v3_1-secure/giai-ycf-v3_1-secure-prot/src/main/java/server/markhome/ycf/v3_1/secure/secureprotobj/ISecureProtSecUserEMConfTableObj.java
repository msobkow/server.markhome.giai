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

public interface ISecureProtSecUserEMConfTableObj
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
	 *	Instantiate a new SecUserEMConf instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecUserEMConfObj newInstance();

	/**
	 *	Instantiate a new SecUserEMConf edition of the specified SecUserEMConf instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecUserEMConfEditObj newEditInstance( ISecureProtSecUserEMConfObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecUserEMConfEditObj instance, which may be a subclass of a SecUserEMConf instance.
	 */
	ISecureProtSecUserEMConfObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserEMConfObj realiseSecUserEMConf( ISecureProtSecUserEMConfObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserEMConfObj createSecUserEMConf( ISecureProtSecUserEMConfObj Obj );

	/**
	 *	Read a SecUserEMConf-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserEMConf-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecUserEMConfObj readSecUserEMConf( CFDbKeyHash256 pkey );

	/**
	 *	Read a SecUserEMConf-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserEMConf-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecUserEMConfObj readSecUserEMConf( CFDbKeyHash256 pkey,
		boolean forceRead );

	ISecureProtSecUserEMConfObj readCachedSecUserEMConf( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeSecUserEMConf( ISecureProtSecUserEMConfObj obj );

	void deepDisposeSecUserEMConf( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserEMConfObj lockSecUserEMConf( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecUserEMConf-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecUserEMConfObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecUserEMConfObj> readAllSecUserEMConf();

	/**
	 *	Return a sorted map of all the SecUserEMConf-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecUserEMConfObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecUserEMConfObj> readAllSecUserEMConf( boolean forceRead );

	List<ISecureProtSecUserEMConfObj> readCachedAllSecUserEMConf();

	/**
	 *	Get the ISecureProtSecUserEMConfObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserEMConfObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserEMConfObj readSecUserEMConfByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Get the ISecureProtSecUserEMConfObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserEMConfObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserEMConfObj readSecUserEMConfByIdIdx( ICFKeyHash256 SecUserId,
		boolean forceRead );

	/**
	 *	Get the ISecureProtSecUserEMConfObj instance for the unique UUuid6Idx key.
	 *
	 *	@param	EMConfirmationUuid6	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserEMConfObj cached instance for the unique UUuid6Idx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserEMConfObj readSecUserEMConfByUUuid6Idx(ICFUuid6 EMConfirmationUuid6 );

	/**
	 *	Get the ISecureProtSecUserEMConfObj instance for the unique UUuid6Idx key.
	 *
	 *	@param	EMConfirmationUuid6	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecUserEMConfObj refreshed instance for the unique UUuid6Idx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecUserEMConfObj readSecUserEMConfByUUuid6Idx(ICFUuid6 EMConfirmationUuid6,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecUserEMConfObj> instances sorted by their primary keys for the duplicate ConfEMAddrIdx key.
	 *
	 *	@param	ConfirmEMailAddr	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserEMConfObj> cached instances sorted by their primary keys for the duplicate ConfEMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserEMConfObj> readSecUserEMConfByConfEMAddrIdx( String ConfirmEMailAddr );

	/**
	 *	Get the map of List<ISecureProtSecUserEMConfObj> instances sorted by their primary keys for the duplicate ConfEMAddrIdx key.
	 *
	 *	@param	ConfirmEMailAddr	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserEMConfObj> cached instances sorted by their primary keys for the duplicate ConfEMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserEMConfObj> readSecUserEMConfByConfEMAddrIdx( String ConfirmEMailAddr,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecUserEMConfObj> instances sorted by their primary keys for the duplicate SentStampIdx key.
	 *
	 *	@param	EMailSentStamp	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserEMConfObj> cached instances sorted by their primary keys for the duplicate SentStampIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserEMConfObj> readSecUserEMConfBySentStampIdx( LocalDateTime EMailSentStamp );

	/**
	 *	Get the map of List<ISecureProtSecUserEMConfObj> instances sorted by their primary keys for the duplicate SentStampIdx key.
	 *
	 *	@param	EMailSentStamp	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserEMConfObj> cached instances sorted by their primary keys for the duplicate SentStampIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserEMConfObj> readSecUserEMConfBySentStampIdx( LocalDateTime EMailSentStamp,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecUserEMConfObj> instances sorted by their primary keys for the duplicate NewAcctIdx key.
	 *
	 *	@param	NewAccount	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserEMConfObj> cached instances sorted by their primary keys for the duplicate NewAcctIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserEMConfObj> readSecUserEMConfByNewAcctIdx( boolean NewAccount );

	/**
	 *	Get the map of List<ISecureProtSecUserEMConfObj> instances sorted by their primary keys for the duplicate NewAcctIdx key.
	 *
	 *	@param	NewAccount	The SecUserEMConf key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecUserEMConfObj> cached instances sorted by their primary keys for the duplicate NewAcctIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecUserEMConfObj> readSecUserEMConfByNewAcctIdx( boolean NewAccount,
		boolean forceRead );

	ISecureProtSecUserEMConfObj readCachedSecUserEMConfByIdIdx( ICFKeyHash256 SecUserId );

	ISecureProtSecUserEMConfObj readCachedSecUserEMConfByUUuid6Idx( ICFUuid6 EMConfirmationUuid6 );

	List<List<ISecureProtSecUserEMConfObj>> readCachedSecUserEMConfByConfEMAddrIdx( String ConfirmEMailAddr );

	List<List<ISecureProtSecUserEMConfObj>> readCachedSecUserEMConfBySentStampIdx( LocalDateTime EMailSentStamp );

	List<List<ISecureProtSecUserEMConfObj>> readCachedSecUserEMConfByNewAcctIdx( boolean NewAccount );

	void deepDisposeSecUserEMConfByIdIdx( ICFKeyHash256 SecUserId );

	void deepDisposeSecUserEMConfByUUuid6Idx( ICFUuid6 EMConfirmationUuid6 );

	void deepDisposeSecUserEMConfByConfEMAddrIdx( String ConfirmEMailAddr );

	void deepDisposeSecUserEMConfBySentStampIdx( LocalDateTime EMailSentStamp );

	void deepDisposeSecUserEMConfByNewAcctIdx( boolean NewAccount );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecUserEMConfObj updateSecUserEMConf( ISecureProtSecUserEMConfObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUserEMConf( ISecureProtSecUserEMConfObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecUserEMConf key attribute of the instance generating the id.
	 */
	void deleteSecUserEMConfByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	EMConfirmationUuid6	The SecUserEMConf key attribute of the instance generating the id.
	 */
	void deleteSecUserEMConfByUUuid6Idx(ICFUuid6 EMConfirmationUuid6 );

	/**
	 *	Internal use only.
	 *
	 *	@param	ConfirmEMailAddr	The SecUserEMConf key attribute of the instance generating the id.
	 */
	void deleteSecUserEMConfByConfEMAddrIdx( String ConfirmEMailAddr );

	/**
	 *	Internal use only.
	 *
	 *	@param	EMailSentStamp	The SecUserEMConf key attribute of the instance generating the id.
	 */
	void deleteSecUserEMConfBySentStampIdx( LocalDateTime EMailSentStamp );

	/**
	 *	Internal use only.
	 *
	 *	@param	NewAccount	The SecUserEMConf key attribute of the instance generating the id.
	 */
	void deleteSecUserEMConfByNewAcctIdx( boolean NewAccount );
}
