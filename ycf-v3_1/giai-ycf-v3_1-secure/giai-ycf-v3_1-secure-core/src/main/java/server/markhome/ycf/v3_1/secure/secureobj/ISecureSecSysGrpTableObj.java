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

public interface ISecureSecSysGrpTableObj
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
	 *	Instantiate a new SecSysGrp instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureSecSysGrpObj newInstance();

	/**
	 *	Instantiate a new SecSysGrp edition of the specified SecSysGrp instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureSecSysGrpEditObj newEditInstance( ISecureSecSysGrpObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureSecSysGrpObj instance, which may be a subclass of a SecSysGrp instance.
	 */
	ISecureSecSysGrpObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpObj realiseSecSysGrp( ISecureSecSysGrpObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpObj createSecSysGrp( ISecureSecSysGrpObj Obj );

	/**
	 *	Read a SecSysGrp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysGrp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpObj readSecSysGrp( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SecSysGrp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecSysGrp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureSecSysGrpObj readSecSysGrp( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureSecSysGrpObj readCachedSecSysGrp( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSecSysGrp( ISecureSecSysGrpObj obj );

	void deepDisposeSecSysGrp( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpObj lockSecSysGrp( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SecSysGrp-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysGrpObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysGrpObj> readAllSecSysGrp();

	/**
	 *	Return a sorted map of all the SecSysGrp-derived instances in the database.
	 *
	 *	@return	List of ISecureSecSysGrpObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureSecSysGrpObj> readAllSecSysGrp( boolean forceRead );

	List<ISecureSecSysGrpObj> readCachedAllSecSysGrp();

	/**
	 *	Get the SecureSecSysGrpObj instance for the primary key attributes.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysGrpObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysGrpObj readSecSysGrpByIdIdx( ICFKeyHash256 SecSysGrpId );

	/**
	 *	Get the SecureSecSysGrpObj instance for the primary key attributes.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysGrpObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysGrpObj readSecSysGrpByIdIdx( ICFKeyHash256 SecSysGrpId,
		boolean forceRead );

	/**
	 *	Get the SecureSecSysGrpObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysGrpObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysGrpObj readSecSysGrpByUNameIdx(String Name );

	/**
	 *	Get the SecureSecSysGrpObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	SecureSecSysGrpObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureSecSysGrpObj readSecSysGrpByUNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of SecureSecSysGrpObj instances sorted by their primary keys for the duplicate SecLevelIdx key.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpObj cached instances sorted by their primary keys for the duplicate SecLevelIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpObj> readSecSysGrpBySecLevelIdx( ISecurePubSchema.SecLevelEnum SecLevel );

	/**
	 *	Get the map of SecureSecSysGrpObj instances sorted by their primary keys for the duplicate SecLevelIdx key.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureSecSysGrpObj cached instances sorted by their primary keys for the duplicate SecLevelIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureSecSysGrpObj> readSecSysGrpBySecLevelIdx( ISecurePubSchema.SecLevelEnum SecLevel,
		boolean forceRead );

	ISecureSecSysGrpObj readCachedSecSysGrpByIdIdx( ICFKeyHash256 SecSysGrpId );

	ISecureSecSysGrpObj readCachedSecSysGrpByUNameIdx( String Name );

	List<ISecureSecSysGrpObj> readCachedSecSysGrpBySecLevelIdx( ISecurePubSchema.SecLevelEnum SecLevel );

	void deepDisposeSecSysGrpByIdIdx( ICFKeyHash256 SecSysGrpId );

	void deepDisposeSecSysGrpByUNameIdx( String Name );

	void deepDisposeSecSysGrpBySecLevelIdx( ISecurePubSchema.SecLevelEnum SecLevel );

	/**
	 *	Internal use only.
	 */
	ISecureSecSysGrpObj updateSecSysGrp( ISecureSecSysGrpObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecSysGrp( ISecureSecSysGrpObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpByIdIdx( ICFKeyHash256 SecSysGrpId );

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
