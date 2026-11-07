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

public interface ISecureSecUserTableObj
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
	 *	Instantiate a new SecUser instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecUserObj newInstance();

	/**
	 *	Instantiate a new SecUser edition of the specified SecUser instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecUserEditObj newEditInstance( ISecureSecUserObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecUserObj instance, which may be a subclass of a SecUser instance.
	 */
	ISecureSecUserObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserObj realiseSecUser( ISecureSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserObj createSecUser( ISecureSecUserObj Obj );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserObj readSecUser( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecUserObj readSecUser( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureSecUserObj readCachedSecUser( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSecUser( ISecureSecUserObj obj );

	void deepDisposeSecUser( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserObj lockSecUser( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of ISecureSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecUserObj> readAllSecUser();

	/**
	 *	Return a sorted map of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of ISecureSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecUserObj> readAllSecUser( boolean forceRead );

	List<ISecureSecUserObj> readCachedAllSecUser();

	/**
	 *	Get the SecureSecUserObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserObj readSecUserByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Get the SecureSecUserObj instance for the primary key attributes.
	 *
	 *	@param	SecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserObj readSecUserByIdIdx( ICFKeyHash256 SecUserId,
		boolean forceRead );

	/**
	 *	Get the SecureSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	LoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserObj cached instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserObj readSecUserByULoginIdx(String LoginId );

	/**
	 *	Get the SecureSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	LoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecUserObj refreshed instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecUserObj readSecUserByULoginIdx(String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecUserObj instances sorted by their primary keys for the duplicate EMAddrIdx key.
	 *
	 *	@param	EMailAddress	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecUserObj cached instances sorted by their primary keys for the duplicate EMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecUserObj> readSecUserByEMAddrIdx( String EMailAddress );

	/**
	 *	Get the map of SecureSecUserObj instances sorted by their primary keys for the duplicate EMAddrIdx key.
	 *
	 *	@param	EMailAddress	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecUserObj cached instances sorted by their primary keys for the duplicate EMAddrIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecUserObj> readSecUserByEMAddrIdx( String EMailAddress,
		boolean forceRead );

	ISecureSecUserObj readCachedSecUserByIdIdx( ICFKeyHash256 SecUserId );

	ISecureSecUserObj readCachedSecUserByULoginIdx( String LoginId );

	List<ISecureSecUserObj> readCachedSecUserByEMAddrIdx( String EMailAddress );

	void deepDisposeSecUserByIdIdx( ICFKeyHash256 SecUserId );

	void deepDisposeSecUserByULoginIdx( String LoginId );

	void deepDisposeSecUserByEMAddrIdx( String EMailAddress );

	/**
	 *	Internal use only.
	 */
	ISecureSecUserObj updateSecUser( ISecureSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUser( ISecureSecUserObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecUserId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByIdIdx( ICFKeyHash256 SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LoginId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByULoginIdx(String LoginId );

	/**
	 *	Internal use only.
	 *
	 *	@param	EMailAddress	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByEMAddrIdx( String EMailAddress );
}
