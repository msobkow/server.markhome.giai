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

public interface ISecurePubISOLangTableObj
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
	 *	Instantiate a new ISOLang instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubISOLangObj newInstance();

	/**
	 *	Instantiate a new ISOLang edition of the specified ISOLang instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubISOLangEditObj newEditInstance( ISecurePubISOLangObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubISOLangObj instance, which may be a subclass of a ISOLang instance.
	 */
	ISecurePubISOLangObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOLangObj realiseISOLang( ISecurePubISOLangObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOLangObj createISOLang( ISecurePubISOLangObj Obj );

	/**
	 *	Read a ISOLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOLangObj readISOLang( Short pkey );

	/**
	 *	Read a ISOLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOLangObj readISOLang( Short pkey,
		boolean forceRead );

	ISecurePubISOLangObj readCachedISOLang( Short pkey );

	public void reallyDeepDisposeISOLang( ISecurePubISOLangObj obj );

	void deepDisposeISOLang( Short pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOLangObj lockISOLang( Short pkey );

	/**
	 *	Return a sorted list of all the ISOLang-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOLangObj> readAllISOLang();

	/**
	 *	Return a sorted map of all the ISOLang-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOLangObj> readAllISOLang( boolean forceRead );

	List<ISecurePubISOLangObj> readCachedAllISOLang();

	/**
	 *	Get the SecurePubISOLangObj instance for the primary key attributes.
	 *
	 *	@param	ISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOLangObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOLangObj readISOLangByIdIdx( short ISOLangId );

	/**
	 *	Get the SecurePubISOLangObj instance for the primary key attributes.
	 *
	 *	@param	ISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOLangObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOLangObj readISOLangByIdIdx( short ISOLangId,
		boolean forceRead );

	/**
	 *	Get the SecurePubISOLangObj instance for the unique Code3Idx key.
	 *
	 *	@param	ISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOLangObj cached instance for the unique Code3Idx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOLangObj readISOLangByCode3Idx(String ISO6392Code );

	/**
	 *	Get the SecurePubISOLangObj instance for the unique Code3Idx key.
	 *
	 *	@param	ISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOLangObj refreshed instance for the unique Code3Idx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOLangObj readISOLangByCode3Idx(String ISO6392Code,
		boolean forceRead );

	/**
	 *	Get the map of SecurePubISOLangObj instances sorted by their primary keys for the duplicate Code2Idx key.
	 *
	 *	@param	ISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOLangObj cached instances sorted by their primary keys for the duplicate Code2Idx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOLangObj> readISOLangByCode2Idx( String ISO6391Code );

	/**
	 *	Get the map of SecurePubISOLangObj instances sorted by their primary keys for the duplicate Code2Idx key.
	 *
	 *	@param	ISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOLangObj cached instances sorted by their primary keys for the duplicate Code2Idx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOLangObj> readISOLangByCode2Idx( String ISO6391Code,
		boolean forceRead );

	ISecurePubISOLangObj readCachedISOLangByIdIdx( short ISOLangId );

	ISecurePubISOLangObj readCachedISOLangByCode3Idx( String ISO6392Code );

	List<ISecurePubISOLangObj> readCachedISOLangByCode2Idx( String ISO6391Code );

	void deepDisposeISOLangByIdIdx( short ISOLangId );

	void deepDisposeISOLangByCode3Idx( String ISO6392Code );

	void deepDisposeISOLangByCode2Idx( String ISO6391Code );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOLangObj updateISOLang( ISecurePubISOLangObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOLang( ISecurePubISOLangObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOLangId	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByIdIdx( short ISOLangId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISO6392Code	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByCode3Idx(String ISO6392Code );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISO6391Code	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByCode2Idx( String ISO6391Code );
}
