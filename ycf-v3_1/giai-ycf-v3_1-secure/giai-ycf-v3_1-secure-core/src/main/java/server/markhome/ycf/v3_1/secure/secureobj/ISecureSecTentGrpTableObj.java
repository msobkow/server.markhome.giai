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

public interface ISecureSecTentGrpTableObj
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
	 *	Instantiate a new SecTentGrp instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecTentGrpObj newInstance();

	/**
	 *	Instantiate a new SecTentGrp edition of the specified SecTentGrp instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecTentGrpEditObj newEditInstance( ISecureSecTentGrpObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecTentGrpObj instance, which may be a subclass of a SecTentGrp instance.
	 */
	ISecureSecTentGrpObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecTentGrpObj realiseSecTentGrp( ISecureSecTentGrpObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecTentGrpObj createSecTentGrp( ISecureSecTentGrpObj Obj );

	/**
	 *	Read a SecTentGrp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecTentGrp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecTentGrpObj readSecTentGrp( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SecTentGrp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecTentGrp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecTentGrpObj readSecTentGrp( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureSecTentGrpObj readCachedSecTentGrp( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSecTentGrp( ISecureSecTentGrpObj obj );

	void deepDisposeSecTentGrp( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecTentGrpObj lockSecTentGrp( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SecTentGrp-derived instances in the database.
	 *
	 *	@return	List of ISecureSecTentGrpObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecTentGrpObj> readAllSecTentGrp();

	/**
	 *	Return a sorted map of all the SecTentGrp-derived instances in the database.
	 *
	 *	@return	List of ISecureSecTentGrpObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecTentGrpObj> readAllSecTentGrp( boolean forceRead );

	List<ISecureSecTentGrpObj> readCachedAllSecTentGrp();

	/**
	 *	Get the SecureSecTentGrpObj instance for the primary key attributes.
	 *
	 *	@param	SecTentGrpId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecTentGrpObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecTentGrpObj readSecTentGrpByIdIdx( ICFKeyHash256 SecTentGrpId );

	/**
	 *	Get the SecureSecTentGrpObj instance for the primary key attributes.
	 *
	 *	@param	SecTentGrpId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecTentGrpObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecTentGrpObj readSecTentGrpByIdIdx( ICFKeyHash256 SecTentGrpId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecTentGrpObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecTentGrpObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecTentGrpObj> readSecTentGrpByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of SecureSecTentGrpObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecTentGrpObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecTentGrpObj> readSecTentGrpByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecTentGrpObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecTentGrpObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecTentGrpObj> readSecTentGrpByNameIdx( String Name );

	/**
	 *	Get the map of SecureSecTentGrpObj instances sorted by their primary keys for the duplicate NameIdx key.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecTentGrpObj cached instances sorted by their primary keys for the duplicate NameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecTentGrpObj> readSecTentGrpByNameIdx( String Name,
		boolean forceRead );

	/**
	 *	Get the SecureSecTentGrpObj instance for the unique UNameIdx key.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecTentGrpObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecTentGrpObj readSecTentGrpByUNameIdx(ICFKeyHash256 TenantId,
		String Name );

	/**
	 *	Get the SecureSecTentGrpObj instance for the unique UNameIdx key.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecTentGrpObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecTentGrpObj readSecTentGrpByUNameIdx(ICFKeyHash256 TenantId,
		String Name,
		boolean forceRead );

	ISecureSecTentGrpObj readCachedSecTentGrpByIdIdx( ICFKeyHash256 SecTentGrpId );

	List<ISecureSecTentGrpObj> readCachedSecTentGrpByTenantIdx( ICFKeyHash256 TenantId );

	List<ISecureSecTentGrpObj> readCachedSecTentGrpByNameIdx( String Name );

	ISecureSecTentGrpObj readCachedSecTentGrpByUNameIdx( ICFKeyHash256 TenantId,
		String Name );

	void deepDisposeSecTentGrpByIdIdx( ICFKeyHash256 SecTentGrpId );

	void deepDisposeSecTentGrpByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeSecTentGrpByNameIdx( String Name );

	void deepDisposeSecTentGrpByUNameIdx( ICFKeyHash256 TenantId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ISecureSecTentGrpObj updateSecTentGrp( ISecureSecTentGrpObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecTentGrp( ISecureSecTentGrpObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecTentGrpId	The SecTentGrp key attribute of the instance generating the id.
	 */
	void deleteSecTentGrpByIdIdx( ICFKeyHash256 SecTentGrpId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 */
	void deleteSecTentGrpByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 */
	void deleteSecTentGrpByNameIdx( String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 */
	void deleteSecTentGrpByUNameIdx(ICFKeyHash256 TenantId,
		String Name );
}
