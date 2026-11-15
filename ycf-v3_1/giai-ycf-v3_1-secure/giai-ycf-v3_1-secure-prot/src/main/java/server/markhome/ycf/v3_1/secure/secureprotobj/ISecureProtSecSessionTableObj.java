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

public interface ISecureProtSecSessionTableObj
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
	 *	Instantiate a new SecSession instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecSessionObj newInstance();

	/**
	 *	Instantiate a new SecSession edition of the specified SecSession instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecSessionEditObj newEditInstance( ISecureProtSecSessionObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecSessionEditObj instance, which may be a subclass of a SecSession instance.
	 */
	ISecureProtSecSessionObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSessionObj realiseSecSession( ISecureProtSecSessionObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSessionObj createSecSession( ISecureProtSecSessionObj Obj );

	/**
	 *	Read a SecSession-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSession-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSessionObj readSecSession( CFDbKeyHash256 pkey );

	/**
	 *	Read a SecSession-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSession-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecSessionObj readSecSession( CFDbKeyHash256 pkey,
		boolean forceRead );

	ISecureProtSecSessionObj readCachedSecSession( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeSecSession( ISecureProtSecSessionObj obj );

	void deepDisposeSecSession( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSessionObj lockSecSession( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecSession-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecSessionObj> readAllSecSession();

	/**
	 *	Return a sorted map of all the SecSession-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecSessionObj> readAllSecSession( boolean forceRead );

	List<ISecureProtSecSessionObj> readCachedAllSecSession();

	/**
	 *	Get the ISecureProtSecSessionObj instance for the primary key attributes.
	 *
	 *	@param	SecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecSessionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecSessionObj readSecSessionByIdIdx( ICFKeyHash256 SecSessionId );

	/**
	 *	Get the ISecureProtSecSessionObj instance for the primary key attributes.
	 *
	 *	@param	SecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecSessionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecSessionObj readSecSessionByIdIdx( ICFKeyHash256 SecSessionId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecSessionObj> instances sorted by their primary keys for the duplicate SecUserIdx key.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSessionObj> cached instances sorted by their primary keys for the duplicate SecUserIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSessionObj> readSecSessionBySecUserIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Get the map of List<ISecureProtSecSessionObj> instances sorted by their primary keys for the duplicate SecUserIdx key.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSessionObj> cached instances sorted by their primary keys for the duplicate SecUserIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSessionObj> readSecSessionBySecUserIdx( ICFKeyHash256 SecUserId,
		boolean forceRead );

	/**
	 *	Get the ISecureProtSecSessionObj instance for the unique StartIdx key.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Start	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecSessionObj cached instance for the unique StartIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecSessionObj readSecSessionByStartIdx(ICFKeyHash256 SecUserId,
		LocalDateTime Start );

	/**
	 *	Get the ISecureProtSecSessionObj instance for the unique StartIdx key.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Start	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecSessionObj refreshed instance for the unique StartIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecSessionObj readSecSessionByStartIdx(ICFKeyHash256 SecUserId,
		LocalDateTime Start,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecSessionObj> instances sorted by their primary keys for the duplicate FinishIdx key.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Finish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSessionObj> cached instances sorted by their primary keys for the duplicate FinishIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSessionObj> readSecSessionByFinishIdx( ICFKeyHash256 SecUserId,
		LocalDateTime Finish );

	/**
	 *	Get the map of List<ISecureProtSecSessionObj> instances sorted by their primary keys for the duplicate FinishIdx key.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Finish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSessionObj> cached instances sorted by their primary keys for the duplicate FinishIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSessionObj> readSecSessionByFinishIdx( ICFKeyHash256 SecUserId,
		LocalDateTime Finish,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecSessionObj> instances sorted by their primary keys for the duplicate SecProxyIdx key.
	 *
	 *	@param	SecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSessionObj> cached instances sorted by their primary keys for the duplicate SecProxyIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSessionObj> readSecSessionBySecProxyIdx( CFDbKeyHash256 SecProxyId );

	/**
	 *	Get the map of List<ISecureProtSecSessionObj> instances sorted by their primary keys for the duplicate SecProxyIdx key.
	 *
	 *	@param	SecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecSessionObj> cached instances sorted by their primary keys for the duplicate SecProxyIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecSessionObj> readSecSessionBySecProxyIdx( CFDbKeyHash256 SecProxyId,
		boolean forceRead );

	ISecureProtSecSessionObj readCachedSecSessionByIdIdx( ICFKeyHash256 SecSessionId );

	List<List<ISecureProtSecSessionObj>> readCachedSecSessionBySecUserIdx( ICFKeyHash256 SecUserId );

	ISecureProtSecSessionObj readCachedSecSessionByStartIdx( ICFKeyHash256 SecUserId,
		LocalDateTime Start );

	List<List<ISecureProtSecSessionObj>> readCachedSecSessionByFinishIdx( ICFKeyHash256 SecUserId,
		LocalDateTime Finish );

	List<List<ISecureProtSecSessionObj>> readCachedSecSessionBySecProxyIdx( CFDbKeyHash256 SecProxyId );

	void deepDisposeSecSessionByIdIdx( ICFKeyHash256 SecSessionId );

	void deepDisposeSecSessionBySecUserIdx( ICFKeyHash256 SecUserId );

	void deepDisposeSecSessionByStartIdx( ICFKeyHash256 SecUserId,
		LocalDateTime Start );

	void deepDisposeSecSessionByFinishIdx( ICFKeyHash256 SecUserId,
		LocalDateTime Finish );

	void deepDisposeSecSessionBySecProxyIdx( CFDbKeyHash256 SecProxyId );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecSessionObj updateSecSession( ISecureProtSecSessionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSession( ISecureProtSecSessionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSessionId	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionByIdIdx( ICFKeyHash256 SecSessionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionBySecUserIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Start	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionByStartIdx(ICFKeyHash256 SecUserId,
		LocalDateTime Start );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Finish	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionByFinishIdx( ICFKeyHash256 SecUserId,
		LocalDateTime Finish );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecProxyId	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionBySecProxyIdx( CFDbKeyHash256 SecProxyId );
}
