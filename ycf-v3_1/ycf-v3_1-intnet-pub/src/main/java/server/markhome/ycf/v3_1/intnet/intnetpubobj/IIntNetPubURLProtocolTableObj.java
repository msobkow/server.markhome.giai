// Description: Java 25 Public Table Object interface for IntNetPub.

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

package server.markhome.ycf.v3_1.intnet.intnetpubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IIntNetPubURLProtocolTableObj
{
	public IIntNetPubSchemaObj getSchema();
	public void setSchema( IIntNetPubSchemaObj value );

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
	IIntNetPubURLProtocolObj newInstance();

	/**
	 *	Instantiate a new URLProtocol edition of the specified URLProtocol instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetPubURLProtocolEditObj newEditInstance( IIntNetPubURLProtocolObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetPubURLProtocolObj instance, which may be a subclass of a URLProtocol instance.
	 */
	IIntNetPubURLProtocolObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetPubURLProtocolObj realiseURLProtocol( IIntNetPubURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetPubURLProtocolObj createURLProtocol( IIntNetPubURLProtocolObj Obj );

	/**
	 *	Read a URLProtocol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The URLProtocol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubURLProtocolObj readURLProtocol( Integer pkey );

	/**
	 *	Read a URLProtocol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The URLProtocol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubURLProtocolObj readURLProtocol( Integer pkey,
		boolean forceRead );

	IIntNetPubURLProtocolObj readCachedURLProtocol( Integer pkey );

	public void reallyDeepDisposeURLProtocol( IIntNetPubURLProtocolObj obj );

	void deepDisposeURLProtocol( Integer pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetPubURLProtocolObj lockURLProtocol( Integer pkey );

	/**
	 *	Return a sorted list of all the URLProtocol-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubURLProtocolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubURLProtocolObj> readAllURLProtocol();

	/**
	 *	Return a sorted map of all the URLProtocol-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubURLProtocolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubURLProtocolObj> readAllURLProtocol( boolean forceRead );

	List<IIntNetPubURLProtocolObj> readCachedAllURLProtocol();

	/**
	 *	Get the IntNetPubURLProtocolObj instance for the primary key attributes.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubURLProtocolObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId );

	/**
	 *	Get the IntNetPubURLProtocolObj instance for the primary key attributes.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubURLProtocolObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId,
		boolean forceRead );

	/**
	 *	Get the IntNetPubURLProtocolObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubURLProtocolObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubURLProtocolObj readURLProtocolByUNameIdx(String Name );

	/**
	 *	Get the IntNetPubURLProtocolObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubURLProtocolObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubURLProtocolObj readURLProtocolByUNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubURLProtocolObj instances sorted by their primary keys for the duplicate IsSecureIdx key.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubURLProtocolObj cached instances sorted by their primary keys for the duplicate IsSecureIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure );

	/**
	 *	Get the map of IntNetPubURLProtocolObj instances sorted by their primary keys for the duplicate IsSecureIdx key.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubURLProtocolObj cached instances sorted by their primary keys for the duplicate IsSecureIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure,
		boolean forceRead );

	IIntNetPubURLProtocolObj readCachedURLProtocolByIdIdx( int URLProtocolId );

	IIntNetPubURLProtocolObj readCachedURLProtocolByUNameIdx( String Name );

	List<IIntNetPubURLProtocolObj> readCachedURLProtocolByIsSecureIdx( boolean IsSecure );

	void deepDisposeURLProtocolByIdIdx( int URLProtocolId );

	void deepDisposeURLProtocolByUNameIdx( String Name );

	void deepDisposeURLProtocolByIsSecureIdx( boolean IsSecure );

	/**
	 *	Internal use only.
	 */
	IIntNetPubURLProtocolObj updateURLProtocol( IIntNetPubURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteURLProtocol( IIntNetPubURLProtocolObj Obj );

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
