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

public interface ISecureISOLangTableObj
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
	 *	Instantiate a new ISOLang instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureISOLangObj newInstance();

	/**
	 *	Instantiate a new ISOLang edition of the specified ISOLang instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureISOLangEditObj newEditInstance( ISecureISOLangObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureISOLangObj instance, which may be a subclass of a ISOLang instance.
	 */
	ISecureISOLangObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureISOLangObj realiseISOLang( ISecureISOLangObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureISOLangObj createISOLang( ISecureISOLangObj Obj );

	/**
	 *	Read a ISOLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureISOLangObj readISOLang( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a ISOLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureISOLangObj readISOLang( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ISecureISOLangObj readCachedISOLang( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeISOLang( ISecureISOLangObj obj );

	void deepDisposeISOLang( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ISecureISOLangObj lockISOLang( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the ISOLang-derived instances in the database.
	 *
	 *	@return	List of ISecureISOLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureISOLangObj> readAllISOLang();

	/**
	 *	Return a sorted map of all the ISOLang-derived instances in the database.
	 *
	 *	@return	List of ISecureISOLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureISOLangObj> readAllISOLang( boolean forceRead );

	List<ISecureISOLangObj> readCachedAllISOLang();

	/**
	 *	Get the SecureISOLangObj instance for the primary key attributes.
	 *
	 *	@param	ISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	SecureISOLangObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureISOLangObj readISOLangByIdIdx( short ISOLangId );

	/**
	 *	Get the SecureISOLangObj instance for the primary key attributes.
	 *
	 *	@param	ISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	SecureISOLangObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureISOLangObj readISOLangByIdIdx( short ISOLangId,
		boolean forceRead );

	/**
	 *	Get the SecureISOLangObj instance for the unique Code3Idx key.
	 *
	 *	@param	ISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	SecureISOLangObj cached instance for the unique Code3Idx key, or
	 *		null if no such instance exists.
	 */
	ISecureISOLangObj readISOLangByCode3Idx(String ISO6392Code );

	/**
	 *	Get the SecureISOLangObj instance for the unique Code3Idx key.
	 *
	 *	@param	ISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	SecureISOLangObj refreshed instance for the unique Code3Idx key, or
	 *		null if no such instance exists.
	 */
	ISecureISOLangObj readISOLangByCode3Idx(String ISO6392Code,
		boolean forceRead );

	/**
	 *	Get the map of SecureISOLangObj instances sorted by their primary keys for the duplicate Code2Idx key.
	 *
	 *	@param	ISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureISOLangObj cached instances sorted by their primary keys for the duplicate Code2Idx key,
	 *		which may be an empty set.
	 */
	List<ISecureISOLangObj> readISOLangByCode2Idx( String ISO6391Code );

	/**
	 *	Get the map of SecureISOLangObj instances sorted by their primary keys for the duplicate Code2Idx key.
	 *
	 *	@param	ISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	List of SecureISOLangObj cached instances sorted by their primary keys for the duplicate Code2Idx key,
	 *		which may be an empty set.
	 */
	List<ISecureISOLangObj> readISOLangByCode2Idx( String ISO6391Code,
		boolean forceRead );

	ISecureISOLangObj readCachedISOLangByIdIdx( short ISOLangId );

	ISecureISOLangObj readCachedISOLangByCode3Idx( String ISO6392Code );

	List<ISecureISOLangObj> readCachedISOLangByCode2Idx( String ISO6391Code );

	void deepDisposeISOLangByIdIdx( short ISOLangId );

	void deepDisposeISOLangByCode3Idx( String ISO6392Code );

	void deepDisposeISOLangByCode2Idx( String ISO6391Code );

	/**
	 *	Internal use only.
	 */
	ISecureISOLangObj updateISOLang( ISecureISOLangObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOLang( ISecureISOLangObj Obj );

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
