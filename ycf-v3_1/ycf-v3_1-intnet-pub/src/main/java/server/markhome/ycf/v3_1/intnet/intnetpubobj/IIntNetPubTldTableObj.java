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

public interface IIntNetPubTldTableObj
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
	 *	Instantiate a new Tld instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetPubTldObj newInstance();

	/**
	 *	Instantiate a new Tld edition of the specified Tld instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetPubTldEditObj newEditInstance( IIntNetPubTldObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetPubTldObj instance, which may be a subclass of a Tld instance.
	 */
	IIntNetPubTldObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTldObj realiseTld( IIntNetPubTldObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTldObj createTld( IIntNetPubTldObj Obj );

	/**
	 *	Read a Tld-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tld-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubTldObj readTld( ICFKeyHash256 pkey );

	/**
	 *	Read a Tld-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tld-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubTldObj readTld( ICFKeyHash256 pkey,
		boolean forceRead );

	IIntNetPubTldObj readCachedTld( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTld( IIntNetPubTldObj obj );

	void deepDisposeTld( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTldObj lockTld( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Tld-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubTldObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubTldObj> readAllTld();

	/**
	 *	Return a sorted map of all the Tld-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubTldObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubTldObj> readAllTld( boolean forceRead );

	List<IIntNetPubTldObj> readCachedAllTld();

	/**
	 *	Get the IntNetPubTldObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTldObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTldObj readTldByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the IntNetPubTldObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTldObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTldObj readTldByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubTldObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTldObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTldObj> readTldByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of IntNetPubTldObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTldObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTldObj> readTldByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the IntNetPubTldObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTldObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTldObj readTldByNameIdx(String Name );

	/**
	 *	Get the IntNetPubTldObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTldObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTldObj readTldByNameIdx(String Name,
		boolean forceRead );

	IIntNetPubTldObj readCachedTldByIdIdx( CFDbKeyHash256 Id );

	List<IIntNetPubTldObj> readCachedTldByTenantIdx( CFDbKeyHash256 TenantId );

	IIntNetPubTldObj readCachedTldByNameIdx( String Name );

	void deepDisposeTldByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTldByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeTldByNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTldObj updateTld( IIntNetPubTldObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTld( IIntNetPubTldObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByNameIdx(String Name );
}
