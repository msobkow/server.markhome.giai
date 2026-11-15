// Description: Java 25 Table Object interface for IntNet.

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

package server.markhome.ycf.v3_1.intnet.intnetobj;

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
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

public interface IIntNetURLProtocolTableObj
{
	public IIntNetSchemaObj getSchema();
	public void setSchema( IIntNetSchemaObj value );

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
	 *	Instantiate a new URLProtocol instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetURLProtocolObj newInstance();

	/**
	 *	Instantiate a new URLProtocol edition of the specified URLProtocol instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetURLProtocolEditObj newEditInstance( IIntNetURLProtocolObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetURLProtocolObj instance, which may be a subclass of a URLProtocol instance.
	 */
	IIntNetURLProtocolObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetURLProtocolObj realiseURLProtocol( IIntNetURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetURLProtocolObj createURLProtocol( IIntNetURLProtocolObj Obj );

	/**
	 *	Read a URLProtocol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The URLProtocol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetURLProtocolObj readURLProtocol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a URLProtocol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The URLProtocol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetURLProtocolObj readURLProtocol( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IIntNetURLProtocolObj readCachedURLProtocol( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeURLProtocol( IIntNetURLProtocolObj obj );

	void deepDisposeURLProtocol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetURLProtocolObj lockURLProtocol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the URLProtocol-derived instances in the database.
	 *
	 *	@return	List of IIntNetURLProtocolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetURLProtocolObj> readAllURLProtocol();

	/**
	 *	Return a sorted map of all the URLProtocol-derived instances in the database.
	 *
	 *	@return	List of IIntNetURLProtocolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetURLProtocolObj> readAllURLProtocol( boolean forceRead );

	List<IIntNetURLProtocolObj> readCachedAllURLProtocol();

	/**
	 *	Get the IntNetURLProtocolObj instance for the primary key attributes.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	IntNetURLProtocolObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId );

	/**
	 *	Get the IntNetURLProtocolObj instance for the primary key attributes.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	IntNetURLProtocolObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId,
		boolean forceRead );

	/**
	 *	Get the IntNetURLProtocolObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	IntNetURLProtocolObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetURLProtocolObj readURLProtocolByUNameIdx(String Name );

	/**
	 *	Get the IntNetURLProtocolObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	IntNetURLProtocolObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetURLProtocolObj readURLProtocolByUNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of IntNetURLProtocolObj instances sorted by their primary keys for the duplicate IsSecureIdx key.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetURLProtocolObj cached instances sorted by their primary keys for the duplicate IsSecureIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure );

	/**
	 *	Get the map of IntNetURLProtocolObj instances sorted by their primary keys for the duplicate IsSecureIdx key.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetURLProtocolObj cached instances sorted by their primary keys for the duplicate IsSecureIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure,
		boolean forceRead );

	IIntNetURLProtocolObj readCachedURLProtocolByIdIdx( int URLProtocolId );

	IIntNetURLProtocolObj readCachedURLProtocolByUNameIdx( String Name );

	List<IIntNetURLProtocolObj> readCachedURLProtocolByIsSecureIdx( boolean IsSecure );

	void deepDisposeURLProtocolByIdIdx( int URLProtocolId );

	void deepDisposeURLProtocolByUNameIdx( String Name );

	void deepDisposeURLProtocolByIsSecureIdx( boolean IsSecure );

	/**
	 *	Internal use only.
	 */
	IIntNetURLProtocolObj updateURLProtocol( IIntNetURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteURLProtocol( IIntNetURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByIdIdx( int URLProtocolId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByUNameIdx(String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByIsSecureIdx( boolean IsSecure );
}
