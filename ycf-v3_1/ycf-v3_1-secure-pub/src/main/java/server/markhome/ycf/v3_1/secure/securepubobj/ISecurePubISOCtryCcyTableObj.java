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

public interface ISecurePubISOCtryCcyTableObj
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
	 *	Instantiate a new ISOCtryCcy instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubISOCtryCcyObj newInstance();

	/**
	 *	Instantiate a new ISOCtryCcy edition of the specified ISOCtryCcy instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubISOCtryCcyEditObj newEditInstance( ISecurePubISOCtryCcyObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubISOCtryCcyObj instance, which may be a subclass of a ISOCtryCcy instance.
	 */
	ISecurePubISOCtryCcyObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryCcyObj realiseISOCtryCcy( ISecurePubISOCtryCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryCcyObj createISOCtryCcy( ISecurePubISOCtryCcyObj Obj );

	/**
	 *	Read a ISOCtryCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryCcyObj readISOCtryCcy( ISecurePubISOCtryCcyPKey pkey );

	/**
	 *	Read a ISOCtryCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryCcyObj readISOCtryCcy( ISecurePubISOCtryCcyPKey pkey,
		boolean forceRead );

	/**
	 *	Read a ISOCtryCcy-derived instance by it's primary key.
	 *
	 *	@return	The ISOCtryCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryCcyObj readISOCtryCcy( short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Read a ISOCtryCcy-derived instance by it's primary key.
	 *
	 *	@return	The ISOCtryCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCtryCcyObj readISOCtryCcy( short ISOCtryId,
		short ISOCcyId,
		boolean forceRead );

	ISecurePubISOCtryCcyObj readCachedISOCtryCcy( ISecurePubISOCtryCcyPKey pkey );

	public void reallyDeepDisposeISOCtryCcy( ISecurePubISOCtryCcyObj obj );

	void deepDisposeISOCtryCcy( ISecurePubISOCtryCcyPKey pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryCcyObj lockISOCtryCcy( ISecurePubISOCtryCcyPKey pkey );

	/**
	 *	Return a sorted list of all the ISOCtryCcy-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOCtryCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOCtryCcyObj> readAllISOCtryCcy();

	/**
	 *	Return a sorted map of all the ISOCtryCcy-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOCtryCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOCtryCcyObj> readAllISOCtryCcy( boolean forceRead );

	List<ISecurePubISOCtryCcyObj> readCachedAllISOCtryCcy();

	/**
	 *	Get the SecurePubISOCtryCcyObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryCcyObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryCcyObj readISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Get the SecurePubISOCtryCcyObj instance for the primary key attributes.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCtryCcyObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCtryCcyObj readISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId,
		boolean forceRead );

	/**
	 *	Get the map of SecurePubISOCtryCcyObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOCtryCcyObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOCtryCcyObj> readISOCtryCcyByCtryIdx( short ISOCtryId );

	/**
	 *	Get the map of SecurePubISOCtryCcyObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOCtryCcyObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOCtryCcyObj> readISOCtryCcyByCtryIdx( short ISOCtryId,
		boolean forceRead );

	/**
	 *	Get the map of SecurePubISOCtryCcyObj instances sorted by their primary keys for the duplicate CcyIdx key.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOCtryCcyObj cached instances sorted by their primary keys for the duplicate CcyIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOCtryCcyObj> readISOCtryCcyByCcyIdx( short ISOCcyId );

	/**
	 *	Get the map of SecurePubISOCtryCcyObj instances sorted by their primary keys for the duplicate CcyIdx key.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubISOCtryCcyObj cached instances sorted by their primary keys for the duplicate CcyIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubISOCtryCcyObj> readISOCtryCcyByCcyIdx( short ISOCcyId,
		boolean forceRead );

	ISecurePubISOCtryCcyObj readCachedISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId );

	List<ISecurePubISOCtryCcyObj> readCachedISOCtryCcyByCtryIdx( short ISOCtryId );

	List<ISecurePubISOCtryCcyObj> readCachedISOCtryCcyByCcyIdx( short ISOCcyId );

	void deepDisposeISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId );

	void deepDisposeISOCtryCcyByCtryIdx( short ISOCtryId );

	void deepDisposeISOCtryCcyByCcyIdx( short ISOCcyId );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCtryCcyObj updateISOCtryCcy( ISecurePubISOCtryCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCtryCcy( ISecurePubISOCtryCcyObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	void deleteISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	void deleteISOCtryCcyByCtryIdx( short ISOCtryId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	void deleteISOCtryCcyByCcyIdx( short ISOCcyId );
}
