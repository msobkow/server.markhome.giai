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

public interface IBusModelProtTimestampTypeTableObj
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
	 *	Instantiate a new TimestampType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTimestampTypeObj newInstance();

	/**
	 *	Instantiate a new TimestampType edition of the specified TimestampType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTimestampTypeEditObj newEditInstance( IBusModelProtTimestampTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimestampTypeObj realiseTimestampType( IBusModelProtTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimestampTypeObj createTimestampType( IBusModelProtTimestampTypeObj Obj );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTimestampTypeObj readTimestampType( CFDbKeyHash256 pkey );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTimestampTypeObj readTimestampType( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTimestampTypeObj readCachedTimestampType( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTimestampType( IBusModelProtTimestampTypeObj obj );

	void deepDisposeTimestampType( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimestampTypeObj lockTimestampType( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readAllTimestampType();

	/**
	 *	Return a sorted map of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readAllTimestampType( boolean forceRead );

	List<IBusModelProtTimestampTypeObj> readCachedAllTimestampType();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimestampTypeObj readTimestampTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimestampTypeObj readTimestampTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimestampTypeObj readTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimestampTypeObj readTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTimestampTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTimestampTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTimestampTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<IBusModelProtTimestampTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTimestampTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampTypeObj> readTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedTimestampTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtTimestampTypeObj>> readCachedTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeTimestampTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimestampTypeObj updateTimestampType( IBusModelProtTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampType( IBusModelProtTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtTimestampTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTimestampTypeObj refreshed cache instance.
	 */
	IBusModelProtTimestampTypeObj moveUpTimestampType( IBusModelProtTimestampTypeObj Obj );

	/**
	 *	Move the IBusModelProtTimestampTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTimestampTypeObj refreshed cache instance.
	 */
	IBusModelProtTimestampTypeObj moveDownTimestampType( IBusModelProtTimestampTypeObj Obj );
}
