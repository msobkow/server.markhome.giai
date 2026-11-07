// Description: Java 25 Public Table Object interface for BusModelPub.

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

package server.markhome.ycf.v3_1.busmodel.busmodelpubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IBusModelPubSchemaRefTableObj
{
	public IBusModelPubSchemaObj getSchema();
	public void setSchema( IBusModelPubSchemaObj value );

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
	 *	Instantiate a new SchemaRef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubSchemaRefObj newInstance();

	/**
	 *	Instantiate a new SchemaRef edition of the specified SchemaRef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubSchemaRefEditObj newEditInstance( IBusModelPubSchemaRefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaRefObj realiseSchemaRef( IBusModelPubSchemaRefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaRefObj createSchemaRef( IBusModelPubSchemaRefObj Obj );

	/**
	 *	Read a SchemaRef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubSchemaRefObj readSchemaRef( ICFKeyHash256 pkey );

	/**
	 *	Read a SchemaRef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubSchemaRefObj readSchemaRef( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubSchemaRefObj readCachedSchemaRef( ICFKeyHash256 pkey );

	public void reallyDeepDisposeSchemaRef( IBusModelPubSchemaRefObj obj );

	void deepDisposeSchemaRef( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaRefObj lockSchemaRef( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SchemaRef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubSchemaRefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readAllSchemaRef();

	/**
	 *	Return a sorted map of all the SchemaRef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubSchemaRefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readAllSchemaRef( boolean forceRead );

	List<IBusModelPubSchemaRefObj> readCachedAllSchemaRef();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRefObj readSchemaRefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRefObj readSchemaRefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubSchemaRefObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaRefObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefBySchemaIdx( CFDbKeyHash256 SchemaId );

	/**
	 *	Get the map of BusModelPubSchemaRefObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefBySchemaIdx( CFDbKeyHash256 SchemaId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubSchemaRefObj instance for the unique UNameIdx key.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubSchemaRefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRefObj readSchemaRefByUNameIdx(CFDbKeyHash256 SchemaId,
		String Name );

	/**
	 *	Get the BusModelPubSchemaRefObj instance for the unique UNameIdx key.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubSchemaRefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRefObj readSchemaRefByUNameIdx(CFDbKeyHash256 SchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaRefObj instances sorted by their primary keys for the duplicate RefSchemaIdx key.
	 *
	 *	@param	RefSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate RefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefByRefSchemaIdx( CFDbKeyHash256 RefSchemaId );

	/**
	 *	Get the map of BusModelPubSchemaRefObj instances sorted by their primary keys for the duplicate RefSchemaIdx key.
	 *
	 *	@param	RefSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate RefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefByRefSchemaIdx( CFDbKeyHash256 RefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaRefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubSchemaRefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaRefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubSchemaRefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRefObj> readSchemaRefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubSchemaRefObj readCachedSchemaRefByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubSchemaRefObj> readCachedSchemaRefByTenantIdx( CFDbKeyHash256 TenantId );

	List<IBusModelPubSchemaRefObj> readCachedSchemaRefBySchemaIdx( CFDbKeyHash256 SchemaId );

	IBusModelPubSchemaRefObj readCachedSchemaRefByUNameIdx( CFDbKeyHash256 SchemaId,
		String Name );

	List<IBusModelPubSchemaRefObj> readCachedSchemaRefByRefSchemaIdx( CFDbKeyHash256 RefSchemaId );

	List<IBusModelPubSchemaRefObj> readCachedSchemaRefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubSchemaRefObj> readCachedSchemaRefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeSchemaRefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeSchemaRefByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeSchemaRefBySchemaIdx( CFDbKeyHash256 SchemaId );

	void deepDisposeSchemaRefByUNameIdx( CFDbKeyHash256 SchemaId,
		String Name );

	void deepDisposeSchemaRefByRefSchemaIdx( CFDbKeyHash256 RefSchemaId );

	void deepDisposeSchemaRefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeSchemaRefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaRefObj updateSchemaRef( IBusModelPubSchemaRefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaRef( IBusModelPubSchemaRefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefBySchemaIdx( CFDbKeyHash256 SchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByUNameIdx(CFDbKeyHash256 SchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	RefSchemaId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByRefSchemaIdx( CFDbKeyHash256 RefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubSchemaRefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubSchemaRefObj refreshed cache instance.
	 */
	IBusModelPubSchemaRefObj moveUpSchemaRef( IBusModelPubSchemaRefObj Obj );

	/**
	 *	Move the BusModelPubSchemaRefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubSchemaRefObj refreshed cache instance.
	 */
	IBusModelPubSchemaRefObj moveDownSchemaRef( IBusModelPubSchemaRefObj Obj );
}
