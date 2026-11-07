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

public interface ISecurePubISOCtryLangTableObj
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
	 *	Instantiate a new ISOCtryLang instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubISOCtryLangObj newInstance();

	/**
	 *	Instantiate a new ISOCtryLang edition of the specified ISOCtryLang instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubISOCtryLangEditObj newEditInstance( ISecurePubISOCtryLangObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubISOCtryLangObj instance, which may be a subclass of a ISOCtryLang instance.
	 */
	ISecurePubISOCtryLangObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryLangObj realiseISOCtryLang( ISecurePubISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryLangObj createISOCtryLang( ISecurePubISOCtryLangObj Obj );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryLangObj readISOCtryLang( ISecurePubISOCtryLangPKey pkey );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryLangObj readISOCtryLang( ISecurePubISOCtryLangPKey pkey,
		boolean forceRead );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryLangObj readISOCtryLang( short ISOCtryId,
		short ISOLangId );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryLangObj readISOCtryLang( short ISOCtryId,
		short ISOLangId,
		boolean forceRead );

	ISecurePubISOCtryLangObj readCachedISOCtryLang( ISecurePubISOCtryLangPKey pkey );

	public void reallyDeepDisposeISOCtryLang( ISecurePubISOCtryLangObj obj );

	void deepDisposeISOCtryLang( ISecurePubISOCtryLangPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryLangObj lockISOCtryLang( ISecurePubISOCtryLangPKey pkey );

	/**
	 *	Return a sorted list of all the ISOCtryLang-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOCtryLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOCtryLangObj> readAllISOCtryLang();

	/**
	 *	Return a sorted map of all the ISOCtryLang-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOCtryLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOCtryLangObj> readAllISOCtryLang( boolean forceRead );

	List<ISecurePubISOCtryLangObj> readCachedAllISOCtryLang();

	/**
	 *	Get the SecurePubISOCtryLangObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryLangObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	/**
	 *	Get the SecurePubISOCtryLangObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryLangObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId,
		boolean forceRead );

	/**
	 *	Get the map of SecurePubISOCtryLangObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOCtryLangObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId );

	/**
	 *	Get the map of SecurePubISOCtryLangObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	ISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOCtryLangObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId,
		boolean forceRead );

	/**
	 *	Get the map of SecurePubISOCtryLangObj instances sorted by their primary keys for the duplicate LangIdx key.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOCtryLangObj cached instances sorted by their primary keys for the duplicate LangIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId );

	/**
	 *	Get the map of SecurePubISOCtryLangObj instances sorted by their primary keys for the duplicate LangIdx key.
	 *
	 *	@param	ISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOCtryLangObj cached instances sorted by their primary keys for the duplicate LangIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId,
		boolean forceRead );

	ISecurePubISOCtryLangObj readCachedISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	List<ISecurePubISOCtryLangObj> readCachedISOCtryLangByCtryIdx( short ISOCtryId );

	List<ISecurePubISOCtryLangObj> readCachedISOCtryLangByLangIdx( short ISOLangId );

	void deepDisposeISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	void deepDisposeISOCtryLangByCtryIdx( short ISOCtryId );

	void deepDisposeISOCtryLangByLangIdx( short ISOLangId );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryLangObj updateISOCtryLang( ISecurePubISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCtryLang( ISecurePubISOCtryLangObj Obj );

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
