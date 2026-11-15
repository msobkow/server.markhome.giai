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

public interface ISecureProtISOCtryTableObj
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
	 *	Instantiate a new ISOCtry instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtISOCtryObj newInstance();

	/**
	 *	Instantiate a new ISOCtry edition of the specified ISOCtry instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtISOCtryEditObj newEditInstance( ISecureProtISOCtryObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtISOCtryEditObj instance, which may be a subclass of a ISOCtry instance.
	 */
	ISecureProtISOCtryObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCtryObj realiseISOCtry( ISecureProtISOCtryObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCtryObj createISOCtry( ISecureProtISOCtryObj Obj );

	/**
	 *	Read a ISOCtry-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtry-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOCtryObj readISOCtry( Short pkey );

	/**
	 *	Read a ISOCtry-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtry-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOCtryObj readISOCtry( Short pkey,
		boolean forceRead );

	ISecureProtISOCtryObj readCachedISOCtry( Short pkey );

	public void reallyDeepDisposeISOCtry( ISecureProtISOCtryObj obj );

	void deepDisposeISOCtry( Short pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCtryObj lockISOCtry( Short pkey );

	/**
	 *	Return a sorted list of all the ISOCtry-derived instances in the database.
	 *
	 *	@return	List of ISecureProtISOCtryObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtISOCtryObj> readAllISOCtry();

	/**
	 *	Return a sorted map of all the ISOCtry-derived instances in the database.
	 *
	 *	@return	List of ISecureProtISOCtryObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtISOCtryObj> readAllISOCtry( boolean forceRead );

	List<ISecureProtISOCtryObj> readCachedAllISOCtry();

	/**
	 *	Get the ISecureProtISOCtryObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCtryObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCtryObj readISOCtryByIdIdx( short ISOCtryId );

	/**
	 *	Get the ISecureProtISOCtryObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCtryObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCtryObj readISOCtryByIdIdx( short ISOCtryId,
		boolean forceRead );

	/**
	 *	Get the ISecureProtISOCtryObj instance for the unique ISOCodeIdx key.
	 *
	 *	@param	ISOCode	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCtryObj cached instance for the unique ISOCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCtryObj readISOCtryByISOCodeIdx(String ISOCode );

	/**
	 *	Get the ISecureProtISOCtryObj instance for the unique ISOCodeIdx key.
	 *
	 *	@param	ISOCode	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCtryObj refreshed instance for the unique ISOCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCtryObj readISOCtryByISOCodeIdx(String ISOCode,
		boolean forceRead );

	/**
	 *	Get the ISecureProtISOCtryObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCtryObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCtryObj readISOCtryByNameIdx(String Name );

	/**
	 *	Get the ISecureProtISOCtryObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCtryObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCtryObj readISOCtryByNameIdx(String Name,
		boolean forceRead );

	ISecureProtISOCtryObj readCachedISOCtryByIdIdx( short ISOCtryId );

	ISecureProtISOCtryObj readCachedISOCtryByISOCodeIdx( String ISOCode );

	ISecureProtISOCtryObj readCachedISOCtryByNameIdx( String Name );

	void deepDisposeISOCtryByIdIdx( short ISOCtryId );

	void deepDisposeISOCtryByISOCodeIdx( String ISOCode );

	void deepDisposeISOCtryByNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCtryObj updateISOCtry( ISecureProtISOCtryObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCtry( ISecureProtISOCtryObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 */
	void deleteISOCtryByIdIdx( short ISOCtryId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCode	The ISOCtry key attribute of the instance generating the id.
	 */
	void deleteISOCtryByISOCodeIdx(String ISOCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The ISOCtry key attribute of the instance generating the id.
	 */
	void deleteISOCtryByNameIdx(String Name );
}
