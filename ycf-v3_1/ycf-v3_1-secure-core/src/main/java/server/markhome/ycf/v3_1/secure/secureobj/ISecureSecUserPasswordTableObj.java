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

public interface ISecureSecUserPasswordTableObj
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
	 *	Instantiate a new SecUserPassword instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecUserPasswordObj newInstance();

	/**
	 *	Instantiate a new SecUserPassword edition of the specified SecUserPassword instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecUserPasswordEditObj newEditInstance( ISecureSecUserPasswordObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecUserPasswordObj instance, which may be a subclass of a SecUserPassword instance.
	 */
	ISecureSecUserPasswordObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPasswordObj realiseSecUserPassword( ISecureSecUserPasswordObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPasswordObj createSecUserPassword( ISecureSecUserPasswordObj Obj );

	/**
	 *	Read a SecUserPassword-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserPassword-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserPasswordObj readSecUserPassword( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SecUserPassword-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUserPassword-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserPasswordObj readSecUserPassword( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureSecUserPasswordObj readCachedSecUserPassword( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSecUserPassword( ISecureSecUserPasswordObj obj );

	void deepDisposeSecUserPassword( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPasswordObj lockSecUserPassword( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SecUserPassword-derived instances in the database.
	 *
	 *	@return	List of ISecureSecUserPasswordObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecUserPasswordObj> readAllSecUserPassword();

	/**
	 *	Return a sorted map of all the SecUserPassword-derived instances in the database.
	 *
	 *	@return	List of ISecureSecUserPasswordObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecUserPasswordObj> readAllSecUserPassword( boolean forceRead );

	List<ISecureSecUserPasswordObj> readCachedAllSecUserPassword();

	/**
	 *	Get the SecureSecUserPasswordObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserPassword key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPasswordObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPasswordObj readSecUserPasswordByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Get the SecureSecUserPasswordObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUserPassword key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserPasswordObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserPasswordObj readSecUserPasswordByIdIdx( ICFKeyHash256 SecUserId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecUserPasswordObj instances sorted by their primary keys for the duplicate SetStampIdx key.
	 *
	 *	@param	PWSetStamp	The SecUserPassword key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecUserPasswordObj cached instances sorted by their primary keys for the duplicate SetStampIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecUserPasswordObj> readSecUserPasswordBySetStampIdx( LocalDateTime PWSetStamp );

	/**
	 *	Get the map of SecureSecUserPasswordObj instances sorted by their primary keys for the duplicate SetStampIdx key.
	 *
	 *	@param	PWSetStamp	The SecUserPassword key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecUserPasswordObj cached instances sorted by their primary keys for the duplicate SetStampIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecUserPasswordObj> readSecUserPasswordBySetStampIdx( LocalDateTime PWSetStamp,
		boolean forceRead );

	ISecureSecUserPasswordObj readCachedSecUserPasswordByIdIdx( ICFKeyHash256 SecUserId );

	List<ISecureSecUserPasswordObj> readCachedSecUserPasswordBySetStampIdx( LocalDateTime PWSetStamp );

	void deepDisposeSecUserPasswordByIdIdx( ICFKeyHash256 SecUserId );

	void deepDisposeSecUserPasswordBySetStampIdx( LocalDateTime PWSetStamp );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserPasswordObj updateSecUserPassword( ISecureSecUserPasswordObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUserPassword( ISecureSecUserPasswordObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecUserPassword key attribute of the instance generating the id.
	 */
	void deleteSecUserPasswordByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PWSetStamp	The SecUserPassword key attribute of the instance generating the id.
	 */
	void deleteSecUserPasswordBySetStampIdx( LocalDateTime PWSetStamp );
}
