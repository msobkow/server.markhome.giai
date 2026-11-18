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

package server.markhome.ycf.v3_1.busmodel.busmodelprotobj;

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

public interface IBusModelProtSchemaRefTableObj
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
	 *	Instantiate a new SchemaRef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtSchemaRefObj newInstance();

	/**
	 *	Instantiate a new SchemaRef edition of the specified SchemaRef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtSchemaRefEditObj newEditInstance( IBusModelProtSchemaRefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtSchemaRefObj realiseSchemaRef( IBusModelProtSchemaRefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtSchemaRefObj createSchemaRef( IBusModelProtSchemaRefObj Obj );

	/**
	 *	Read a SchemaRef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtSchemaRefObj readSchemaRef( CFDbKeyHash256 pkey );

	/**
	 *	Read a SchemaRef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtSchemaRefObj readSchemaRef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtSchemaRefObj readCachedSchemaRef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeSchemaRef( IBusModelProtSchemaRefObj obj );

	void deepDisposeSchemaRef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtSchemaRefObj lockSchemaRef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SchemaRef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtSchemaRefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readAllSchemaRef();

	/**
	 *	Return a sorted map of all the SchemaRef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtSchemaRefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readAllSchemaRef( boolean forceRead );

	List<IBusModelProtSchemaRefObj> readCachedAllSchemaRef();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaRefObj readSchemaRefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaRefObj readSchemaRefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtSchemaRefObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtSchemaRefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtSchemaRefObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtSchemaRefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtSchemaRefObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaRefObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefBySchemaIdx( ICFKeyHash256 SchemaId );

	/**
	 *	Get the map of List<IBusModelProtSchemaRefObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaRefObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefBySchemaIdx( ICFKeyHash256 SchemaId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtSchemaRefObj instance for the unique UNameIdx key.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtSchemaRefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaRefObj readSchemaRefByUNameIdx(ICFKeyHash256 SchemaId,
		String Name );

	/**
	 *	Get the IBusModelProtSchemaRefObj instance for the unique UNameIdx key.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtSchemaRefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaRefObj readSchemaRefByUNameIdx(ICFKeyHash256 SchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtSchemaRefObj> instances sorted by their primary keys for the duplicate RefSchemaIdx key.
	 *
	 *	@param	RefSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaRefObj> cached instances sorted by their primary keys for the duplicate RefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefByRefSchemaIdx( CFDbKeyHash256 RefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtSchemaRefObj> instances sorted by their primary keys for the duplicate RefSchemaIdx key.
	 *
	 *	@param	RefSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaRefObj> cached instances sorted by their primary keys for the duplicate RefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefByRefSchemaIdx( CFDbKeyHash256 RefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtSchemaRefObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaRefObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<IBusModelProtSchemaRefObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaRefObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtSchemaRefObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaRefObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of List<IBusModelProtSchemaRefObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaRefObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaRefObj> readSchemaRefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtScopeObj readCachedSchemaRefByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedSchemaRefByTenantIdx( ICFKeyHash256 TenantId );

	List<List<IBusModelProtSchemaRefObj>> readCachedSchemaRefBySchemaIdx( ICFKeyHash256 SchemaId );

	IBusModelProtSchemaRefObj readCachedSchemaRefByUNameIdx( ICFKeyHash256 SchemaId,
		String Name );

	List<List<IBusModelProtSchemaRefObj>> readCachedSchemaRefByRefSchemaIdx( CFDbKeyHash256 RefSchemaId );

	List<List<IBusModelProtSchemaRefObj>> readCachedSchemaRefByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtSchemaRefObj>> readCachedSchemaRefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeSchemaRefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeSchemaRefByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeSchemaRefBySchemaIdx( ICFKeyHash256 SchemaId );

	void deepDisposeSchemaRefByUNameIdx( ICFKeyHash256 SchemaId,
		String Name );

	void deepDisposeSchemaRefByRefSchemaIdx( CFDbKeyHash256 RefSchemaId );

	void deepDisposeSchemaRefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeSchemaRefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtSchemaRefObj updateSchemaRef( IBusModelProtSchemaRefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaRef( IBusModelProtSchemaRefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefBySchemaIdx( ICFKeyHash256 SchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRef key attribute of the instance generating the id.
	 */
	void deleteSchemaRefByUNameIdx(ICFKeyHash256 SchemaId,
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
	 *	Move the IBusModelProtSchemaRefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtSchemaRefObj refreshed cache instance.
	 */
	IBusModelProtSchemaRefObj moveUpSchemaRef( IBusModelProtSchemaRefObj Obj );

	/**
	 *	Move the IBusModelProtSchemaRefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtSchemaRefObj refreshed cache instance.
	 */
	IBusModelProtSchemaRefObj moveDownSchemaRef( IBusModelProtSchemaRefObj Obj );
}
