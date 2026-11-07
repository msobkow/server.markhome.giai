// Description: Java 25 Protected Table Object interface for BusModelProt.

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
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

public interface IBusModelProtScopeTableObj
{
	public IBusModelProtSchemaObj getSchema();
	public void setSchema( IBusModelProtSchemaObj value );

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
	 *	Instantiate a new Scope instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtScopeObj newInstance();

	/**
	 *	Instantiate a new Scope edition of the specified Scope instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtScopeEditObj newEditInstance( IBusModelProtScopeObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelProtScopeEditObj instance, which may be a subclass of a Scope instance.
	 */
	IBusModelProtScopeObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelProtScopeObj realiseScope( IBusModelProtScopeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtScopeObj createScope( IBusModelProtScopeObj Obj );

	/**
	 *	Read a Scope-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Scope-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtScopeObj readScope( CFDbKeyHash256 pkey );

	/**
	 *	Read a Scope-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Scope-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtScopeObj readScope( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtScopeObj readCachedScope( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeScope( IBusModelProtScopeObj obj );

	void deepDisposeScope( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtScopeObj lockScope( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Scope-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtScopeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtScopeObj> readAllScope();

	/**
	 *	Return a sorted map of all the Scope-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtScopeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtScopeObj> readAllScope( boolean forceRead );

	List<IBusModelProtScopeObj> readCachedAllScope();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtScopeObj readScopeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtScopeObj readScopeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtScopeObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtScopeObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtScopeObj> readScopeByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of List<IBusModelProtScopeObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtScopeObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtScopeObj> readScopeByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	IBusModelProtScopeObj readCachedScopeByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedScopeByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeScopeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeScopeByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtScopeObj updateScope( IBusModelProtScopeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteScope( IBusModelProtScopeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Scope key attribute of the instance generating the id.
	 */
	void deleteScopeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Scope key attribute of the instance generating the id.
	 */
	void deleteScopeByTenantIdx( ICFKeyHash256 TenantId );
}
