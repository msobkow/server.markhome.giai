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

public interface ISecureSecSysGrpMembTableObj
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
	 *	Instantiate a new SecSysGrpMemb instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecSysGrpMembObj newInstance();

	/**
	 *	Instantiate a new SecSysGrpMemb edition of the specified SecSysGrpMemb instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecSysGrpMembEditObj newEditInstance( ISecureSecSysGrpMembObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecSysGrpMembObj instance, which may be a subclass of a SecSysGrpMemb instance.
	 */
	ISecureSecSysGrpMembObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpMembObj realiseSecSysGrpMemb( ISecureSecSysGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpMembObj createSecSysGrpMemb( ISecureSecSysGrpMembObj Obj );

	/**
	 *	Read a SecSysGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpMembObj readSecSysGrpMemb( ISecureSecSysGrpMembPKey pkey );

	/**
	 *	Read a SecSysGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpMembObj readSecSysGrpMemb( ISecureSecSysGrpMembPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecSysGrpMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecSysGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpMembObj readSecSysGrpMemb( ICFKeyHash256 SecSysGrpId,
		String LoginId );

	/**
	 *	Read a SecSysGrpMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecSysGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpMembObj readSecSysGrpMemb( ICFKeyHash256 SecSysGrpId,
		String LoginId,
		boolean forceRead );

	ISecureSecSysGrpMembObj readCachedSecSysGrpMemb( ISecureSecSysGrpMembPKey pkey );

	public void reallyDeepDisposeSecSysGrpMemb( ISecureSecSysGrpMembObj obj );

	void deepDisposeSecSysGrpMemb( ISecureSecSysGrpMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpMembObj lockSecSysGrpMemb( ISecureSecSysGrpMembPKey pkey );

	/**
	 *	Return a sorted list of all the SecSysGrpMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysGrpMembObj> readAllSecSysGrpMemb();

	/**
	 *	Return a sorted map of all the SecSysGrpMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysGrpMembObj> readAllSecSysGrpMemb( boolean forceRead );

	List<ISecureSecSysGrpMembObj> readCachedAllSecSysGrpMemb();

	/**
	 *	Get the SecureSecSysGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysGrpMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysGrpMembObj readSecSysGrpMembByIdIdx( ICFKeyHash256 SecSysGrpId,
		String LoginId );

	/**
	 *	Get the SecureSecSysGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysGrpMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysGrpMembObj readSecSysGrpMembByIdIdx( ICFKeyHash256 SecSysGrpId,
		String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecSysGrpMembObj instances sorted by their primary keys for the duplicate SysGrpIdx key.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpMembObj cached instances sorted by their primary keys for the duplicate SysGrpIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpMembObj> readSecSysGrpMembBySysGrpIdx( ICFKeyHash256 SecSysGrpId );

	/**
	 *	Get the map of SecureSecSysGrpMembObj instances sorted by their primary keys for the duplicate SysGrpIdx key.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpMembObj cached instances sorted by their primary keys for the duplicate SysGrpIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpMembObj> readSecSysGrpMembBySysGrpIdx( ICFKeyHash256 SecSysGrpId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecSysGrpMembObj instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpMembObj cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpMembObj> readSecSysGrpMembByLoginIdx( String LoginId );

	/**
	 *	Get the map of SecureSecSysGrpMembObj instances sorted by their primary keys for the duplicate LoginIdx key.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpMembObj cached instances sorted by their primary keys for the duplicate LoginIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpMembObj> readSecSysGrpMembByLoginIdx( String LoginId,
		boolean forceRead );

	ISecureSecSysGrpMembObj readCachedSecSysGrpMembByIdIdx( ICFKeyHash256 SecSysGrpId,
		String LoginId );

	List<ISecureSecSysGrpMembObj> readCachedSecSysGrpMembBySysGrpIdx( ICFKeyHash256 SecSysGrpId );

	List<ISecureSecSysGrpMembObj> readCachedSecSysGrpMembByLoginIdx( String LoginId );

	void deepDisposeSecSysGrpMembByIdIdx( ICFKeyHash256 SecSysGrpId,
		String LoginId );

	void deepDisposeSecSysGrpMembBySysGrpIdx( ICFKeyHash256 SecSysGrpId );

	void deepDisposeSecSysGrpMembByLoginIdx( String LoginId );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpMembObj updateSecSysGrpMemb( ISecureSecSysGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSysGrpMemb( ISecureSecSysGrpMembObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpMembByIdIdx( ICFKeyHash256 SecSysGrpId,
		String LoginId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpMembBySysGrpIdx( ICFKeyHash256 SecSysGrpId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpMembByLoginIdx( String LoginId );
}
