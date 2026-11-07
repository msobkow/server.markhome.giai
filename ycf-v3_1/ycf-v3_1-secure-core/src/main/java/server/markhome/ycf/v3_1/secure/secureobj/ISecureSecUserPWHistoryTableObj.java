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

public interface ISecureSecUserPWHistoryTableObj
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
	 *	Instantiate a new SecUserPWHistory instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecUserPWHistoryObj newInstance();

	/**
	 *	Instantiate a new SecUserPWHistory edition of the specified SecUserPWHistory instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecUserPWHistoryEditObj newEditInstance( ISecureSecUserPWHistoryObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecUserPWHistoryObj instance, which may be a subclass of a SecUserPWHistory instance.
	 */
	ISecureSecUserPWHistoryObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPWHistoryObj realiseSecUserPWHistory( ISecureSecUserPWHistoryObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPWHistoryObj createSecUserPWHistory( ISecureSecUserPWHistoryObj Obj );

	/**
	 *	Read a SecUserPWHistory-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserPWHistory-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistory( ISecureSecUserPWHistoryPKey pkey );

	/**
	 *	Read a SecUserPWHistory-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserPWHistory-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistory( ISecureSecUserPWHistoryPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecUserPWHistory-derived instance by it's primary key.
	 *
	 *	@return	The SecUserPWHistory-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistory( ICFKeyHash256 SecUserId,
		LocalDateTime PWSetStamp );

	/**
	 *	Read a SecUserPWHistory-derived instance by it's primary key.
	 *
	 *	@return	The SecUserPWHistory-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistory( ICFKeyHash256 SecUserId,
		LocalDateTime PWSetStamp,
		boolean forceRead );

	ISecureSecUserPWHistoryObj readCachedSecUserPWHistory( ISecureSecUserPWHistoryPKey pkey );

	public void reallyDeepDisposeSecUserPWHistory( ISecureSecUserPWHistoryObj obj );

	void deepDisposeSecUserPWHistory( ISecureSecUserPWHistoryPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPWHistoryObj lockSecUserPWHistory( ISecureSecUserPWHistoryPKey pkey );

	/**
	 *	Return a sorted list of all the SecUserPWHistory-derived instances in the database.
	 *
	 *	@return	List of ISecureSecUserPWHistoryObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecUserPWHistoryObj> readAllSecUserPWHistory();

	/**
	 *	Return a sorted map of all the SecUserPWHistory-derived instances in the database.
	 *
	 *	@return	List of ISecureSecUserPWHistoryObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecUserPWHistoryObj> readAllSecUserPWHistory( boolean forceRead );

	List<ISecureSecUserPWHistoryObj> readCachedAllSecUserPWHistory();

	/**
	 *	Get the SecureSecUserPWHistoryObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWHistoryObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistoryByIdIdx( ICFKeyHash256 SecUserId,
		LocalDateTime PWSetStamp );

	/**
	 *	Get the SecureSecUserPWHistoryObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWHistoryObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistoryByIdIdx( ICFKeyHash256 SecUserId,
		LocalDateTime PWSetStamp,
		boolean forceRead );

	/**
	 *	Get the SecureSecUserPWHistoryObj instance for the unique UserIdx key.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWHistoryObj cached instance for the unique UserIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistoryByUserIdx(ICFKeyHash256 SecUserId );

	/**
	 *	Get the SecureSecUserPWHistoryObj instance for the unique UserIdx key.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWHistoryObj refreshed instance for the unique UserIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistoryByUserIdx(ICFKeyHash256 SecUserId,
		boolean forceRead );

	/**
	 *	Get the SecureSecUserPWHistoryObj instance for the unique SetStampIdx key.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWHistoryObj cached instance for the unique SetStampIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistoryBySetStampIdx(LocalDateTime PWSetStamp );

	/**
	 *	Get the SecureSecUserPWHistoryObj instance for the unique SetStampIdx key.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWHistoryObj refreshed instance for the unique SetStampIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistoryBySetStampIdx(LocalDateTime PWSetStamp,
		boolean forceRead );

	/**
	 *	Get the SecureSecUserPWHistoryObj instance for the unique ReplacedStampIdx key.
	 *
	 *	@param	PWReplacedStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWHistoryObj cached instance for the unique ReplacedStampIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistoryByReplacedStampIdx(LocalDateTime PWReplacedStamp );

	/**
	 *	Get the SecureSecUserPWHistoryObj instance for the unique ReplacedStampIdx key.
	 *
	 *	@param	PWReplacedStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPWHistoryObj refreshed instance for the unique ReplacedStampIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPWHistoryObj readSecUserPWHistoryByReplacedStampIdx(LocalDateTime PWReplacedStamp,
		boolean forceRead );

	ISecureSecUserPWHistoryObj readCachedSecUserPWHistoryByIdIdx( ICFKeyHash256 SecUserId,
		LocalDateTime PWSetStamp );

	ISecureSecUserPWHistoryObj readCachedSecUserPWHistoryByUserIdx( ICFKeyHash256 SecUserId );

	ISecureSecUserPWHistoryObj readCachedSecUserPWHistoryBySetStampIdx( LocalDateTime PWSetStamp );

	ISecureSecUserPWHistoryObj readCachedSecUserPWHistoryByReplacedStampIdx( LocalDateTime PWReplacedStamp );

	void deepDisposeSecUserPWHistoryByIdIdx( ICFKeyHash256 SecUserId,
		LocalDateTime PWSetStamp );

	void deepDisposeSecUserPWHistoryByUserIdx( ICFKeyHash256 SecUserId );

	void deepDisposeSecUserPWHistoryBySetStampIdx( LocalDateTime PWSetStamp );

	void deepDisposeSecUserPWHistoryByReplacedStampIdx( LocalDateTime PWReplacedStamp );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPWHistoryObj updateSecUserPWHistory( ISecureSecUserPWHistoryObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUserPWHistory( ISecureSecUserPWHistoryObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 */
	void deleteSecUserPWHistoryByIdIdx( ICFKeyHash256 SecUserId,
		LocalDateTime PWSetStamp );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecUserPWHistory key attribute of the instance generating the id.
	 */
	void deleteSecUserPWHistoryByUserIdx(ICFKeyHash256 SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PWSetStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 */
	void deleteSecUserPWHistoryBySetStampIdx(LocalDateTime PWSetStamp );

	/**
	 *	Internal use only.
	 *
	 *	@param	PWReplacedStamp	The SecUserPWHistory key attribute of the instance generating the id.
	 */
	void deleteSecUserPWHistoryByReplacedStampIdx(LocalDateTime PWReplacedStamp );
}
