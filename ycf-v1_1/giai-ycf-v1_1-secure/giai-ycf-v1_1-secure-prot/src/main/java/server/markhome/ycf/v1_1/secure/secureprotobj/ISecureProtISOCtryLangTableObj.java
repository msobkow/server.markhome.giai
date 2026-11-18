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

public interface ISecureProtISOCtryLangTableObj
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
	 *	Instantiate a new ISOCtryLang instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtISOCtryLangObj newInstance();

	/**
	 *	Instantiate a new ISOCtryLang edition of the specified ISOCtryLang instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtISOCtryLangEditObj newEditInstance( ISecureProtISOCtryLangObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtISOCtryLangEditObj instance, which may be a subclass of a ISOCtryLang instance.
	 */
	ISecureProtISOCtryLangObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCtryLangObj realiseISOCtryLang( ISecureProtISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCtryLangObj createISOCtryLang( ISecureProtISOCtryLangObj Obj );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOCtryLangObj readISOCtryLang( ISecureProtISOCtryLangPKey pkey );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOCtryLangObj readISOCtryLang( ISecureProtISOCtryLangPKey pkey,
		boolean forceRead );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOCtryLangObj readISOCtryLang( short ISOCtryId,
		short ISOLangId );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOCtryLangObj readISOCtryLang( short ISOCtryId,
		short ISOLangId,
		boolean forceRead );

	ISecureProtISOCtryLangObj readCachedISOCtryLang( ISecureProtISOCtryLangPKey pkey );

	public void reallyDeepDisposeISOCtryLang( ISecureProtISOCtryLangObj obj );

	void deepDisposeISOCtryLang( ISecureProtISOCtryLangPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCtryLangObj lockISOCtryLang( ISecureProtISOCtryLangPKey pkey );

	/**
	 *	Return a sorted list of all the ISOCtryLang-derived instances in the database.
	 *
	 *	@return	List of ISecureProtISOCtryLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtISOCtryLangObj> readAllISOCtryLang();

	/**
	 *	Return a sorted map of all the ISOCtryLang-derived instances in the database.
	 *
	 *	@return	List of ISecureProtISOCtryLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtISOCtryLangObj> readAllISOCtryLang( boolean forceRead );

	List<ISecureProtISOCtryLangObj> readCachedAllISOCtryLang();

	/**
	 *	Get the ISecureProtISOCtryLangObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCtryLangObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	/**
	 *	Get the ISecureProtISOCtryLangObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOCtryLangObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtISOCtryLangObj> instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtISOCtryLangObj> cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId );

	/**
	 *	Get the map of List<ISecureProtISOCtryLangObj> instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtISOCtryLangObj> cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtISOCtryLangObj> instances sorted by their primary keys for the duplicate LangIdx key.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtISOCtryLangObj> cached instances sorted by their primary keys for the duplicate LangIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId );

	/**
	 *	Get the map of List<ISecureProtISOCtryLangObj> instances sorted by their primary keys for the duplicate LangIdx key.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtISOCtryLangObj> cached instances sorted by their primary keys for the duplicate LangIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId,
		boolean forceRead );

	ISecureProtISOCtryLangObj readCachedISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	List<List<ISecureProtISOCtryLangObj>> readCachedISOCtryLangByCtryIdx( short ISOCtryId );

	List<List<ISecureProtISOCtryLangObj>> readCachedISOCtryLangByLangIdx( short ISOLangId );

	void deepDisposeISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	void deepDisposeISOCtryLangByCtryIdx( short ISOCtryId );

	void deepDisposeISOCtryLangByLangIdx( short ISOLangId );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOCtryLangObj updateISOCtryLang( ISecureProtISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCtryLang( ISecureProtISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByCtryIdx( short ISOCtryId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByLangIdx( short ISOLangId );
}
