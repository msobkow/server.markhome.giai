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

public interface IBusModelPubTimestampTypeTableObj
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
	 *	Instantiate a new TimestampType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTimestampTypeObj newInstance();

	/**
	 *	Instantiate a new TimestampType edition of the specified TimestampType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTimestampTypeEditObj newEditInstance( IBusModelPubTimestampTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimestampTypeObj realiseTimestampType( IBusModelPubTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimestampTypeObj createTimestampType( IBusModelPubTimestampTypeObj Obj );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimestampTypeObj readTimestampType( ICFKeyHash256 pkey );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimestampTypeObj readTimestampType( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTimestampTypeObj readCachedTimestampType( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTimestampType( IBusModelPubTimestampTypeObj obj );

	void deepDisposeTimestampType( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimestampTypeObj lockTimestampType( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readAllTimestampType();

	/**
	 *	Return a sorted map of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readAllTimestampType( boolean forceRead );

	List<IBusModelPubTimestampTypeObj> readCachedAllTimestampType();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimestampTypeObj readTimestampTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimestampTypeObj readTimestampTypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimestampTypeObj readTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimestampTypeObj readTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTimestampTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimestampTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimestampTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimestampTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimestampTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampTypeObj> readTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubTimestampTypeObj readCachedTimestampTypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTimestampTypeObj readCachedTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTimestampTypeObj> readCachedTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTimestampTypeObj> readCachedTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTimestampTypeObj> readCachedTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTimestampTypeObj> readCachedTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTimestampTypeObj> readCachedTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTimestampTypeObj> readCachedTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTimestampTypeObj> readCachedTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeTimestampTypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimestampTypeObj updateTimestampType( IBusModelPubTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampType( IBusModelPubTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId );

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
	void deleteTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubTimestampTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimestampTypeObj refreshed cache instance.
	 */
	IBusModelPubTimestampTypeObj moveUpTimestampType( IBusModelPubTimestampTypeObj Obj );

	/**
	 *	Move the BusModelPubTimestampTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimestampTypeObj refreshed cache instance.
	 */
	IBusModelPubTimestampTypeObj moveDownTimestampType( IBusModelPubTimestampTypeObj Obj );
}
