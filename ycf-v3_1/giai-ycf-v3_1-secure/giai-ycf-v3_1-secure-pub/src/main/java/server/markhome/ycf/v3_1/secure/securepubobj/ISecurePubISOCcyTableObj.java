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

public interface ISecurePubISOCcyTableObj
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
	 *	Instantiate a new ISOCcy instance.
	 *
	 *	@return	A new instance.
	 */
	ISecurePubISOCcyObj newInstance();

	/**
	 *	Instantiate a new ISOCcy edition of the specified ISOCcy instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubISOCcyEditObj newEditInstance( ISecurePubISOCcyObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubISOCcyObj instance, which may be a subclass of a ISOCcy instance.
	 */
	ISecurePubISOCcyObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCcyObj realiseISOCcy( ISecurePubISOCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCcyObj createISOCcy( ISecurePubISOCcyObj Obj );

	/**
	 *	Read a ISOCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCcyObj readISOCcy( Short pkey );

	/**
	 *	Read a ISOCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubISOCcyObj readISOCcy( Short pkey,
		boolean forceRead );

	ISecurePubISOCcyObj readCachedISOCcy( Short pkey );

	public void reallyDeepDisposeISOCcy( ISecurePubISOCcyObj obj );

	void deepDisposeISOCcy( Short pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCcyObj lockISOCcy( Short pkey );

	/**
	 *	Return a sorted list of all the ISOCcy-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOCcyObj> readAllISOCcy();

	/**
	 *	Return a sorted map of all the ISOCcy-derived instances in the database.
	 *
	 *	@return	List of ISecurePubISOCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubISOCcyObj> readAllISOCcy( boolean forceRead );

	List<ISecurePubISOCcyObj> readCachedAllISOCcy();

	/**
	 *	Get the SecurePubISOCcyObj instance for the primary key attributes.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCcyObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCcyObj readISOCcyByIdIdx( short ISOCcyId );

	/**
	 *	Get the SecurePubISOCcyObj instance for the primary key attributes.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCcyObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCcyObj readISOCcyByIdIdx( short ISOCcyId,
		boolean forceRead );

	/**
	 *	Get the SecurePubISOCcyObj instance for the unique CcyCdIdx key.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCcyObj cached instance for the unique CcyCdIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCcyObj readISOCcyByCcyCdIdx(String ISOCode );

	/**
	 *	Get the SecurePubISOCcyObj instance for the unique CcyCdIdx key.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCcyObj refreshed instance for the unique CcyCdIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCcyObj readISOCcyByCcyCdIdx(String ISOCode,
		boolean forceRead );

	/**
	 *	Get the SecurePubISOCcyObj instance for the unique CcyNmIdx key.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCcyObj cached instance for the unique CcyNmIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCcyObj readISOCcyByCcyNmIdx(String Name );

	/**
	 *	Get the SecurePubISOCcyObj instance for the unique CcyNmIdx key.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubISOCcyObj refreshed instance for the unique CcyNmIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubISOCcyObj readISOCcyByCcyNmIdx(String Name,
		boolean forceRead );

	ISecurePubISOCcyObj readCachedISOCcyByIdIdx( short ISOCcyId );

	ISecurePubISOCcyObj readCachedISOCcyByCcyCdIdx( String ISOCode );

	ISecurePubISOCcyObj readCachedISOCcyByCcyNmIdx( String Name );

	void deepDisposeISOCcyByIdIdx( short ISOCcyId );

	void deepDisposeISOCcyByCcyCdIdx( String ISOCode );

	void deepDisposeISOCcyByCcyNmIdx( String Name );

	/**
	 *	Internal use only.
	 */
	ISecurePubISOCcyObj updateISOCcy( ISecurePubISOCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCcy( ISecurePubISOCcyObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByIdIdx( short ISOCcyId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyCdIdx(String ISOCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyNmIdx(String Name );
}
