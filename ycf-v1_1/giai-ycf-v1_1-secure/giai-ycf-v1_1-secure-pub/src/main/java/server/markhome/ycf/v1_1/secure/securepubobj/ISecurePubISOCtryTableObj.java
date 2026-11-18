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

public interface ISecurePubISOCtryTableObj
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
	 *	Instantiate a new ISOCtry instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubISOCtryObj newInstance();

	/**
	 *	Instantiate a new ISOCtry edition of the specified ISOCtry instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubISOCtryEditObj newEditInstance( ISecurePubISOCtryObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubISOCtryObj instance, which may be a subclass of a ISOCtry instance.
	 */
	ISecurePubISOCtryObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryObj realiseISOCtry( ISecurePubISOCtryObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryObj createISOCtry( ISecurePubISOCtryObj Obj );

	/**
	 *	Read a ISOCtry-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtry-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryObj readISOCtry( Short pkey );

	/**
	 *	Read a ISOCtry-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtry-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryObj readISOCtry( Short pkey,
		boolean forceRead );

	ISecurePubISOCtryObj readCachedISOCtry( Short pkey );

	public void reallyDeepDisposeISOCtry( ISecurePubISOCtryObj obj );

	void deepDisposeISOCtry( Short pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryObj lockISOCtry( Short pkey );

	/**
	 *	Return a sorted list of all the ISOCtry-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOCtryObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOCtryObj> readAllISOCtry();

	/**
	 *	Return a sorted map of all the ISOCtry-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOCtryObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOCtryObj> readAllISOCtry( boolean forceRead );

	List<ISecurePubISOCtryObj> readCachedAllISOCtry();

	/**
	 *	Get the SecurePubISOCtryObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryObj readISOCtryByIdIdx( short ISOCtryId );

	/**
	 *	Get the SecurePubISOCtryObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryObj readISOCtryByIdIdx( short ISOCtryId,
		boolean forceRead );

	/**
	 *	Get the SecurePubISOCtryObj instance for the unique ISOCodeIdx key.
	 *
	 *	@param	ISOCode	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryObj cached instance for the unique ISOCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryObj readISOCtryByISOCodeIdx(String ISOCode );

	/**
	 *	Get the SecurePubISOCtryObj instance for the unique ISOCodeIdx key.
	 *
	 *	@param	ISOCode	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryObj refreshed instance for the unique ISOCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryObj readISOCtryByISOCodeIdx(String ISOCode,
		boolean forceRead );

	/**
	 *	Get the SecurePubISOCtryObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryObj readISOCtryByNameIdx(String Name );

	/**
	 *	Get the SecurePubISOCtryObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryObj readISOCtryByNameIdx(String Name,
		boolean forceRead );

	ISecurePubISOCtryObj readCachedISOCtryByIdIdx( short ISOCtryId );

	ISecurePubISOCtryObj readCachedISOCtryByISOCodeIdx( String ISOCode );

	ISecurePubISOCtryObj readCachedISOCtryByNameIdx( String Name );

	void deepDisposeISOCtryByIdIdx( short ISOCtryId );

	void deepDisposeISOCtryByISOCodeIdx( String ISOCode );

	void deepDisposeISOCtryByNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryObj updateISOCtry( ISecurePubISOCtryObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCtry( ISecurePubISOCtryObj Obj );

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
