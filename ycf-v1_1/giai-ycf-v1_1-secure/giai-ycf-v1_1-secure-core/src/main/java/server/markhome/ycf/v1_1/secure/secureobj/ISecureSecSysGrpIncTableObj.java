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

public interface ISecureSecSysGrpIncTableObj
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
	 *	Instantiate a new SecSysGrpInc instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecSysGrpIncObj newInstance();

	/**
	 *	Instantiate a new SecSysGrpInc edition of the specified SecSysGrpInc instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecSysGrpIncEditObj newEditInstance( ISecureSecSysGrpIncObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecSysGrpIncObj instance, which may be a subclass of a SecSysGrpInc instance.
	 */
	ISecureSecSysGrpIncObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpIncObj realiseSecSysGrpInc( ISecureSecSysGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpIncObj createSecSysGrpInc( ISecureSecSysGrpIncObj Obj );

	/**
	 *	Read a SecSysGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpIncObj readSecSysGrpInc( ISecureSecSysGrpIncPKey pkey );

	/**
	 *	Read a SecSysGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpIncObj readSecSysGrpInc( ISecureSecSysGrpIncPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecSysGrpInc-derived instance by it's primary key.
	 *
	 *	@return	The SecSysGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpIncObj readSecSysGrpInc( ICFKeyHash256 SecSysGrpId,
		String InclName );

	/**
	 *	Read a SecSysGrpInc-derived instance by it's primary key.
	 *
	 *	@return	The SecSysGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpIncObj readSecSysGrpInc( ICFKeyHash256 SecSysGrpId,
		String InclName,
		boolean forceRead );

	ISecureSecSysGrpIncObj readCachedSecSysGrpInc( ISecureSecSysGrpIncPKey pkey );

	public void reallyDeepDisposeSecSysGrpInc( ISecureSecSysGrpIncObj obj );

	void deepDisposeSecSysGrpInc( ISecureSecSysGrpIncPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpIncObj lockSecSysGrpInc( ISecureSecSysGrpIncPKey pkey );

	/**
	 *	Return a sorted list of all the SecSysGrpInc-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysGrpIncObj> readAllSecSysGrpInc();

	/**
	 *	Return a sorted map of all the SecSysGrpInc-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysGrpIncObj> readAllSecSysGrpInc( boolean forceRead );

	List<ISecureSecSysGrpIncObj> readCachedAllSecSysGrpInc();

	/**
	 *	Get the SecureSecSysGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysGrpIncObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysGrpIncObj readSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName );

	/**
	 *	Get the SecureSecSysGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysGrpIncObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysGrpIncObj readSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecSysGrpIncObj instances sorted by their primary keys for the duplicate SysGrpIdx key.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpIncObj cached instances sorted by their primary keys for the duplicate SysGrpIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpIncObj> readSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId );

	/**
	 *	Get the map of SecureSecSysGrpIncObj instances sorted by their primary keys for the duplicate SysGrpIdx key.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpIncObj cached instances sorted by their primary keys for the duplicate SysGrpIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpIncObj> readSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecSysGrpIncObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpIncObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpIncObj> readSecSysGrpIncByNameIdx( String InclName );

	/**
	 *	Get the map of SecureSecSysGrpIncObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpIncObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpIncObj> readSecSysGrpIncByNameIdx( String InclName,
		boolean forceRead );

	ISecureSecSysGrpIncObj readCachedSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName );

	List<ISecureSecSysGrpIncObj> readCachedSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId );

	List<ISecureSecSysGrpIncObj> readCachedSecSysGrpIncByNameIdx( String InclName );

	void deepDisposeSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName );

	void deepDisposeSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId );

	void deepDisposeSecSysGrpIncByNameIdx( String InclName );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpIncObj updateSecSysGrpInc( ISecureSecSysGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSysGrpInc( ISecureSecSysGrpIncObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId );

	/**
	 *	Internal use only.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpIncByNameIdx( String InclName );
}
