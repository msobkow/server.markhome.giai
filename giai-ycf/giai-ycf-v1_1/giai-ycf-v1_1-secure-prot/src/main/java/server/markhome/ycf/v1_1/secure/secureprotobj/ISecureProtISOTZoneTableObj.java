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

public interface ISecureProtISOTZoneTableObj
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
	 *	Instantiate a new ISOTZone instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtISOTZoneObj newInstance();

	/**
	 *	Instantiate a new ISOTZone edition of the specified ISOTZone instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtISOTZoneEditObj newEditInstance( ISecureProtISOTZoneObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtISOTZoneEditObj instance, which may be a subclass of a ISOTZone instance.
	 */
	ISecureProtISOTZoneObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOTZoneObj realiseISOTZone( ISecureProtISOTZoneObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOTZoneObj createISOTZone( ISecureProtISOTZoneObj Obj );

	/**
	 *	Read a ISOTZone-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOTZone-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOTZoneObj readISOTZone( Short pkey );

	/**
	 *	Read a ISOTZone-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOTZone-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtISOTZoneObj readISOTZone( Short pkey,
		boolean forceRead );

	ISecureProtISOTZoneObj readCachedISOTZone( Short pkey );

	public void reallyDeepDisposeISOTZone( ISecureProtISOTZoneObj obj );

	void deepDisposeISOTZone( Short pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOTZoneObj lockISOTZone( Short pkey );

	/**
	 *	Return a sorted list of all the ISOTZone-derived instances in the database.
	 *
	 *	@return	List of ISecureProtISOTZoneObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtISOTZoneObj> readAllISOTZone();

	/**
	 *	Return a sorted map of all the ISOTZone-derived instances in the database.
	 *
	 *	@return	List of ISecureProtISOTZoneObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtISOTZoneObj> readAllISOTZone( boolean forceRead );

	List<ISecureProtISOTZoneObj> readCachedAllISOTZone();

	/**
	 *	Get the ISecureProtISOTZoneObj instance for the primary key attributes.
	 *
	 *	@param	ISOTZoneId	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOTZoneObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOTZoneObj readISOTZoneByIdIdx( short ISOTZoneId );

	/**
	 *	Get the ISecureProtISOTZoneObj instance for the primary key attributes.
	 *
	 *	@param	ISOTZoneId	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOTZoneObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOTZoneObj readISOTZoneByIdIdx( short ISOTZoneId,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtISOTZoneObj> instances sorted by their primary keys for the duplicate OffsetIdx key.
	 *
	 *	@param	TZHourOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@param	TZMinOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtISOTZoneObj> cached instances sorted by their primary keys for the duplicate OffsetIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtISOTZoneObj> readISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset );

	/**
	 *	Get the map of List<ISecureProtISOTZoneObj> instances sorted by their primary keys for the duplicate OffsetIdx key.
	 *
	 *	@param	TZHourOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@param	TZMinOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtISOTZoneObj> cached instances sorted by their primary keys for the duplicate OffsetIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtISOTZoneObj> readISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset,
		boolean forceRead );

	/**
	 *	Get the ISecureProtISOTZoneObj instance for the unique UTZNameIdx key.
	 *
	 *	@param	TZName	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOTZoneObj cached instance for the unique UTZNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOTZoneObj readISOTZoneByUTZNameIdx(String TZName );

	/**
	 *	Get the ISecureProtISOTZoneObj instance for the unique UTZNameIdx key.
	 *
	 *	@param	TZName	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtISOTZoneObj refreshed instance for the unique UTZNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtISOTZoneObj readISOTZoneByUTZNameIdx(String TZName,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtISOTZoneObj> instances sorted by their primary keys for the duplicate Iso8601Idx key.
	 *
	 *	@param	Iso8601	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtISOTZoneObj> cached instances sorted by their primary keys for the duplicate Iso8601Idx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtISOTZoneObj> readISOTZoneByIso8601Idx( String Iso8601 );

	/**
	 *	Get the map of List<ISecureProtISOTZoneObj> instances sorted by their primary keys for the duplicate Iso8601Idx key.
	 *
	 *	@param	Iso8601	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtISOTZoneObj> cached instances sorted by their primary keys for the duplicate Iso8601Idx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtISOTZoneObj> readISOTZoneByIso8601Idx( String Iso8601,
		boolean forceRead );

	ISecureProtISOTZoneObj readCachedISOTZoneByIdIdx( short ISOTZoneId );

	List<List<ISecureProtISOTZoneObj>> readCachedISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset );

	ISecureProtISOTZoneObj readCachedISOTZoneByUTZNameIdx( String TZName );

	List<List<ISecureProtISOTZoneObj>> readCachedISOTZoneByIso8601Idx( String Iso8601 );

	void deepDisposeISOTZoneByIdIdx( short ISOTZoneId );

	void deepDisposeISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset );

	void deepDisposeISOTZoneByUTZNameIdx( String TZName );

	void deepDisposeISOTZoneByIso8601Idx( String Iso8601 );

	/**
	 *	Internal use only.
	 */
	ISecureProtISOTZoneObj updateISOTZone( ISecureProtISOTZoneObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOTZone( ISecureProtISOTZoneObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOTZoneId	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByIdIdx( short ISOTZoneId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TZHourOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@param	TZMinOffset	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset );

	/**
	 *	Internal use only.
	 *
	 *	@param	TZName	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByUTZNameIdx(String TZName );

	/**
	 *	Internal use only.
	 *
	 *	@param	Iso8601	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByIso8601Idx( String Iso8601 );
}
