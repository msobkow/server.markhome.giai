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

public interface ISecureProtISOCcyTableObj
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
	 *	Instantiate a new ISOCcy instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtISOCcyObj newInstance();

	/**
	 *	Instantiate a new ISOCcy edition of the specified ISOCcy instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtISOCcyEditObj newEditInstance( ISecureProtISOCcyObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtISOCcyEditObj instance, which may be a subclass of a ISOCcy instance.
	 */
	ISecureProtISOCcyObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCcyObj realiseISOCcy( ISecureProtISOCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCcyObj createISOCcy( ISecureProtISOCcyObj Obj );

	/**
	 *	Read a ISOCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOCcyObj readISOCcy( Short pkey );

	/**
	 *	Read a ISOCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOCcyObj readISOCcy( Short pkey,
		boolean forceRead );

	ISecureProtISOCcyObj readCachedISOCcy( Short pkey );

	public void reallyDeepDisposeISOCcy( ISecureProtISOCcyObj obj );

	void deepDisposeISOCcy( Short pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCcyObj lockISOCcy( Short pkey );

	/**
	 *	Return a sorted list of all the ISOCcy-derived instances in the database.
	 *
	 *	@return	List of ISecureProtISOCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtISOCcyObj> readAllISOCcy();

	/**
	 *	Return a sorted map of all the ISOCcy-derived instances in the database.
	 *
	 *	@return	List of ISecureProtISOCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtISOCcyObj> readAllISOCcy( boolean forceRead );

	List<ISecureProtISOCcyObj> readCachedAllISOCcy();

	/**
	 *	Get the ISecureProtISOCcyObj instance for the primary key attributes.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCcyObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCcyObj readISOCcyByIdIdx( short ISOCcyId );

	/**
	 *	Get the ISecureProtISOCcyObj instance for the primary key attributes.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCcyObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCcyObj readISOCcyByIdIdx( short ISOCcyId,
		boolean forceRead );

	/**
	 *	Get the ISecureProtISOCcyObj instance for the unique CcyCdIdx key.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCcyObj cached instance for the unique CcyCdIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCcyObj readISOCcyByCcyCdIdx(String ISOCode );

	/**
	 *	Get the ISecureProtISOCcyObj instance for the unique CcyCdIdx key.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCcyObj refreshed instance for the unique CcyCdIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCcyObj readISOCcyByCcyCdIdx(String ISOCode,
		boolean forceRead );

	/**
	 *	Get the ISecureProtISOCcyObj instance for the unique CcyNmIdx key.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCcyObj cached instance for the unique CcyNmIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCcyObj readISOCcyByCcyNmIdx(String Name );

	/**
	 *	Get the ISecureProtISOCcyObj instance for the unique CcyNmIdx key.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCcyObj refreshed instance for the unique CcyNmIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCcyObj readISOCcyByCcyNmIdx(String Name,
		boolean forceRead );

	ISecureProtISOCcyObj readCachedISOCcyByIdIdx( short ISOCcyId );

	ISecureProtISOCcyObj readCachedISOCcyByCcyCdIdx( String ISOCode );

	ISecureProtISOCcyObj readCachedISOCcyByCcyNmIdx( String Name );

	void deepDisposeISOCcyByIdIdx( short ISOCcyId );

	void deepDisposeISOCcyByCcyCdIdx( String ISOCode );

	void deepDisposeISOCcyByCcyNmIdx( String Name );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCcyObj updateISOCcy( ISecureProtISOCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCcy( ISecureProtISOCcyObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByIdIdx( short ISOCcyId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyCdIdx(String ISOCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyNmIdx(String Name );
}
