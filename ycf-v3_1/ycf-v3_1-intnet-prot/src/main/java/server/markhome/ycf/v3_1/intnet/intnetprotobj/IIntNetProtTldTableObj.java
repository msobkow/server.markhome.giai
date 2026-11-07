// Description: Java 25 Protected Table Object interface for IntNetProt.

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

package server.markhome.ycf.v3_1.intnet.intnetprotobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IIntNetProtTldTableObj
{
	public IIntNetProtSchemaObj getSchema();
	public void setSchema( IIntNetProtSchemaObj value );

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
	IIntNetProtTldObj newInstance();

	/**
	 *	Instantiate a new Tld edition of the specified Tld instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetProtTldEditObj newEditInstance( IIntNetProtTldObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetProtTldEditObj instance, which may be a subclass of a Tld instance.
	 */
	IIntNetProtTldObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetProtTldObj realiseTld( IIntNetProtTldObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetProtTldObj createTld( IIntNetProtTldObj Obj );

	/**
	 *	Read a Tld-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tld-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetProtTldObj readTld( CFDbKeyHash256 pkey );

	/**
	 *	Read a Tld-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tld-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetProtTldObj readTld( CFDbKeyHash256 pkey,
		boolean forceRead );

	IIntNetProtTldObj readCachedTld( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTld( IIntNetProtTldObj obj );

	void deepDisposeTld( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetProtTldObj lockTld( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Tld-derived instances in the database.
	 *
	 *	@return	List of IIntNetProtTldObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetProtTldObj> readAllTld();

	/**
	 *	Return a sorted map of all the Tld-derived instances in the database.
	 *
	 *	@return	List of IIntNetProtTldObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetProtTldObj> readAllTld( boolean forceRead );

	List<IIntNetProtTldObj> readCachedAllTld();

	/**
	 *	Get the IIntNetProtTldObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtTldObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtTldObj readTldByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IIntNetProtTldObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtTldObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtTldObj readTldByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of List<IIntNetProtTldObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtTldObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtTldObj> readTldByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of List<IIntNetProtTldObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtTldObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtTldObj> readTldByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the IIntNetProtTldObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtTldObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtTldObj readTldByNameIdx(String Name );

	/**
	 *	Get the IIntNetProtTldObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtTldObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtTldObj readTldByNameIdx(String Name,
		boolean forceRead );

	IIntNetProtTldObj readCachedTldByIdIdx( ICFKeyHash256 Id );

	List<List<IIntNetProtTldObj>> readCachedTldByTenantIdx( ICFKeyHash256 TenantId );

	IIntNetProtTldObj readCachedTldByNameIdx( String Name );

	void deepDisposeTldByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTldByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeTldByNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetProtTldObj updateTld( IIntNetProtTldObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTld( IIntNetProtTldObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByNameIdx(String Name );
}
