// Description: Java 25 Public Table Object interface for SecurePub.

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

package server.markhome.ycf.v3_1.secure.securepubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface ISecurePubSecSysGrpTableObj
{
	public ISecurePubSchemaObj getSchema();
	public void setSchema( ISecurePubSchemaObj value );

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
	 *	Instantiate a new SecSysGrp instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubSecSysGrpObj newInstance();

	/**
	 *	Instantiate a new SecSysGrp edition of the specified SecSysGrp instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubSecSysGrpEditObj newEditInstance( ISecurePubSecSysGrpObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubSecSysGrpObj instance, which may be a subclass of a SecSysGrp instance.
	 */
	ISecurePubSecSysGrpObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecSysGrpObj realiseSecSysGrp( ISecurePubSecSysGrpObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecSysGrpObj createSecSysGrp( ISecurePubSecSysGrpObj Obj );

	/**
	 *	Read a SecSysGrp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysGrp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubSecSysGrpObj readSecSysGrp( ICFKeyHash256 pkey );

	/**
	 *	Read a SecSysGrp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysGrp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubSecSysGrpObj readSecSysGrp( ICFKeyHash256 pkey,
		boolean forceRead );

	ISecurePubSecSysGrpObj readCachedSecSysGrp( ICFKeyHash256 pkey );

	public void reallyDeepDisposeSecSysGrp( ISecurePubSecSysGrpObj obj );

	void deepDisposeSecSysGrp( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecSysGrpObj lockSecSysGrp( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecSysGrp-derived instances in the database.
	 *
	 *	@return	List of ISecurePubSecSysGrpObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubSecSysGrpObj> readAllSecSysGrp();

	/**
	 *	Return a sorted map of all the SecSysGrp-derived instances in the database.
	 *
	 *	@return	List of ISecurePubSecSysGrpObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubSecSysGrpObj> readAllSecSysGrp( boolean forceRead );

	List<ISecurePubSecSysGrpObj> readCachedAllSecSysGrp();

	/**
	 *	Get the SecurePubSecSysGrpObj instance for the primary key attributes.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecSysGrpObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecSysGrpObj readSecSysGrpByIdIdx( CFDbKeyHash256 SecSysGrpId );

	/**
	 *	Get the SecurePubSecSysGrpObj instance for the primary key attributes.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecSysGrpObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecSysGrpObj readSecSysGrpByIdIdx( CFDbKeyHash256 SecSysGrpId,
		boolean forceRead );

	/**
	 *	Get the SecurePubSecSysGrpObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecSysGrpObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecSysGrpObj readSecSysGrpByUNameIdx(String Name );

	/**
	 *	Get the SecurePubSecSysGrpObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecSysGrpObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecSysGrpObj readSecSysGrpByUNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of SecurePubSecSysGrpObj instances sorted by their primary keys for the duplicate SecLevelIdx key.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubSecSysGrpObj cached instances sorted by their primary keys for the duplicate SecLevelIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubSecSysGrpObj> readSecSysGrpBySecLevelIdx( ISecurePubSchema.SecLevelEnum SecLevel );

	/**
	 *	Get the map of SecurePubSecSysGrpObj instances sorted by their primary keys for the duplicate SecLevelIdx key.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubSecSysGrpObj cached instances sorted by their primary keys for the duplicate SecLevelIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubSecSysGrpObj> readSecSysGrpBySecLevelIdx( ISecurePubSchema.SecLevelEnum SecLevel,
		boolean forceRead );

	ISecurePubSecSysGrpObj readCachedSecSysGrpByIdIdx( CFDbKeyHash256 SecSysGrpId );

	ISecurePubSecSysGrpObj readCachedSecSysGrpByUNameIdx( String Name );

	List<ISecurePubSecSysGrpObj> readCachedSecSysGrpBySecLevelIdx( ISecurePubSchema.SecLevelEnum SecLevel );

	void deepDisposeSecSysGrpByIdIdx( CFDbKeyHash256 SecSysGrpId );

	void deepDisposeSecSysGrpByUNameIdx( String Name );

	void deepDisposeSecSysGrpBySecLevelIdx( ISecurePubSchema.SecLevelEnum SecLevel );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecSysGrpObj updateSecSysGrp( ISecurePubSecSysGrpObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSysGrp( ISecurePubSecSysGrpObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpByIdIdx( CFDbKeyHash256 SecSysGrpId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpByUNameIdx(String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpBySecLevelIdx( ISecurePubSchema.SecLevelEnum SecLevel );
}
