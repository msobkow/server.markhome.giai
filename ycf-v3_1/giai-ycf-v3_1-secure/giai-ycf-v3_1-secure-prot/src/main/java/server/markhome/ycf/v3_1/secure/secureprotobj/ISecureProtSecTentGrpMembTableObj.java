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

public interface ISecureProtSecTentGrpMembTableObj
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
	 *	Instantiate a new SecTentGrpMemb instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtSecTentGrpMembObj newInstance();

	/**
	 *	Instantiate a new SecTentGrpMemb edition of the specified SecTentGrpMemb instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtSecTentGrpMembEditObj newEditInstance( ISecureProtSecTentGrpMembObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtSecTentGrpMembEditObj instance, which may be a subclass of a SecTentGrpMemb instance.
	 */
	ISecureProtSecTentGrpMembObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecTentGrpMembObj realiseSecTentGrpMemb( ISecureProtSecTentGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecTentGrpMembObj createSecTentGrpMemb( ISecureProtSecTentGrpMembObj Obj );

	/**
	 *	Read a SecTentGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecTentGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecTentGrpMembObj readSecTentGrpMemb( ISecureProtSecTentGrpMembPKey pkey );

	/**
	 *	Read a SecTentGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecTentGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecTentGrpMembObj readSecTentGrpMemb( ISecureProtSecTentGrpMembPKey pkey,
		boolean forceRead );

	/**
	 *	Read a SecTentGrpMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecTentGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecTentGrpMembObj readSecTentGrpMemb( ICFKeyHash256 SecTentGrpId,
		String LoginId );

	/**
	 *	Read a SecTentGrpMemb-derived instance by it's primary key.
	 *
	 *	@return	The SecTentGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtSecTentGrpMembObj readSecTentGrpMemb( ICFKeyHash256 SecTentGrpId,
		String LoginId,
		boolean forceRead );

	ISecureProtSecTentGrpMembObj readCachedSecTentGrpMemb( ISecureProtSecTentGrpMembPKey pkey );

	public void reallyDeepDisposeSecTentGrpMemb( ISecureProtSecTentGrpMembObj obj );

	void deepDisposeSecTentGrpMemb( ISecureProtSecTentGrpMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecTentGrpMembObj lockSecTentGrpMemb( ISecureProtSecTentGrpMembPKey pkey );

	/**
	 *	Return a sorted list of all the SecTentGrpMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecTentGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecTentGrpMembObj> readAllSecTentGrpMemb();

	/**
	 *	Return a sorted map of all the SecTentGrpMemb-derived instances in the database.
	 *
	 *	@return	List of ISecureProtSecTentGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtSecTentGrpMembObj> readAllSecTentGrpMemb( boolean forceRead );

	List<ISecureProtSecTentGrpMembObj> readCachedAllSecTentGrpMemb();

	/**
	 *	Get the ISecureProtSecTentGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	SecTentGrpId	The SecTentGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecTentGrpMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecTentGrpMembObj readSecTentGrpMembByIdIdx( ICFKeyHash256 SecTentGrpId,
		String LoginId );

	/**
	 *	Get the ISecureProtSecTentGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	SecTentGrpId	The SecTentGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtSecTentGrpMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtSecTentGrpMembObj readSecTentGrpMembByIdIdx( ICFKeyHash256 SecTentGrpId,
		String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecTentGrpMembObj> instances sorted by their primary keys for the duplicate TentGrpIdx key.
	 *
	 *	@param	SecTentGrpId	The SecTentGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecTentGrpMembObj> cached instances sorted by their primary keys for the duplicate TentGrpIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecTentGrpMembObj> readSecTentGrpMembByTentGrpIdx( ICFKeyHash256 SecTentGrpId );

	/**
	 *	Get the map of List<ISecureProtSecTentGrpMembObj> instances sorted by their primary keys for the duplicate TentGrpIdx key.
	 *
	 *	@param	SecTentGrpId	The SecTentGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecTentGrpMembObj> cached instances sorted by their primary keys for the duplicate TentGrpIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecTentGrpMembObj> readSecTentGrpMembByTentGrpIdx( ICFKeyHash256 SecTentGrpId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtSecTentGrpMembObj> instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	LoginId	The SecTentGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecTentGrpMembObj> cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecTentGrpMembObj> readSecTentGrpMembByUserIdx( String LoginId );

	/**
	 *	Get the map of List<ISecureProtSecTentGrpMembObj> instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	LoginId	The SecTentGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtSecTentGrpMembObj> cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtSecTentGrpMembObj> readSecTentGrpMembByUserIdx( String LoginId,
		boolean forceRead );

	ISecureProtSecTentGrpMembObj readCachedSecTentGrpMembByIdIdx( ICFKeyHash256 SecTentGrpId,
		String LoginId );

	List<List<ISecureProtSecTentGrpMembObj>> readCachedSecTentGrpMembByTentGrpIdx( ICFKeyHash256 SecTentGrpId );

	List<List<ISecureProtSecTentGrpMembObj>> readCachedSecTentGrpMembByUserIdx( String LoginId );

	void deepDisposeSecTentGrpMembByIdIdx( ICFKeyHash256 SecTentGrpId,
		String LoginId );

	void deepDisposeSecTentGrpMembByTentGrpIdx( ICFKeyHash256 SecTentGrpId );

	void deepDisposeSecTentGrpMembByUserIdx( String LoginId );

	/**
	 *	Internal use only.
	 */
	ISecureProtSecTentGrpMembObj updateSecTentGrpMemb( ISecureProtSecTentGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecTentGrpMemb( ISecureProtSecTentGrpMembObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecTentGrpId	The SecTentGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecTentGrpMembByIdIdx( ICFKeyHash256 SecTentGrpId,
		String LoginId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecTentGrpId	The SecTentGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecTentGrpMembByTentGrpIdx( ICFKeyHash256 SecTentGrpId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LoginId	The SecTentGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecTentGrpMembByUserIdx( String LoginId );
}
