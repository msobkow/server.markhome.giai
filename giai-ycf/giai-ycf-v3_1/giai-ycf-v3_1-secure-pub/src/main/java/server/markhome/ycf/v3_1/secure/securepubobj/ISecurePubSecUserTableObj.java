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

public interface ISecurePubSecUserTableObj
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
	 *	Instantiate a new SecUser instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubSecUserObj newInstance();

	/**
	 *	Instantiate a new SecUser edition of the specified SecUser instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubSecUserEditObj newEditInstance( ISecurePubSecUserObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubSecUserObj instance, which may be a subclass of a SecUser instance.
	 */
	ISecurePubSecUserObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecUserObj realiseSecUser( ISecurePubSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecUserObj createSecUser( ISecurePubSecUserObj Obj );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubSecUserObj readSecUser( ICFKeyHash256 pkey );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubSecUserObj readSecUser( ICFKeyHash256 pkey,
		boolean forceRead );

	ISecurePubSecUserObj readCachedSecUser( ICFKeyHash256 pkey );

	public void reallyDeepDisposeSecUser( ISecurePubSecUserObj obj );

	void deepDisposeSecUser( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecUserObj lockSecUser( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of ISecurePubSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubSecUserObj> readAllSecUser();

	/**
	 *	Return a sorted map of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of ISecurePubSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubSecUserObj> readAllSecUser( boolean forceRead );

	List<ISecurePubSecUserObj> readCachedAllSecUser();

	/**
	 *	Get the SecurePubSecUserObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecUserObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecUserObj readSecUserByIdIdx( CFDbKeyHash256 SecUserId );

	/**
	 *	Get the SecurePubSecUserObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecUserObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecUserObj readSecUserByIdIdx( CFDbKeyHash256 SecUserId,
		boolean forceRead );

	/**
	 *	Get the SecurePubSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	LoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecUserObj cached instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecUserObj readSecUserByULoginIdx(String LoginId );

	/**
	 *	Get the SecurePubSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	LoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubSecUserObj refreshed instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubSecUserObj readSecUserByULoginIdx(String LoginId,
		boolean forceRead );

	ISecurePubSecUserObj readCachedSecUserByIdIdx( CFDbKeyHash256 SecUserId );

	ISecurePubSecUserObj readCachedSecUserByULoginIdx( String LoginId );

	void deepDisposeSecUserByIdIdx( CFDbKeyHash256 SecUserId );

	void deepDisposeSecUserByULoginIdx( String LoginId );

	/**
	 *	Internal use only.
	 */
	ISecurePubSecUserObj updateSecUser( ISecurePubSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUser( ISecurePubSecUserObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByIdIdx( CFDbKeyHash256 SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LoginId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByULoginIdx(String LoginId );
}
