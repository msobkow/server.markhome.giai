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
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IBusModelPubInt64TypeTableObj
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
	 *	Instantiate a new Int64Type instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubInt64TypeObj newInstance();

	/**
	 *	Instantiate a new Int64Type edition of the specified Int64Type instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubInt64TypeEditObj newEditInstance( IBusModelPubInt64TypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubInt64TypeObj realiseInt64Type( IBusModelPubInt64TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubInt64TypeObj createInt64Type( IBusModelPubInt64TypeObj Obj );

	/**
	 *	Read a Int64Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubInt64TypeObj readInt64Type( ICFKeyHash256 pkey );

	/**
	 *	Read a Int64Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubInt64TypeObj readInt64Type( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubInt64TypeObj readCachedInt64Type( ICFKeyHash256 pkey );

	public void reallyDeepDisposeInt64Type( IBusModelPubInt64TypeObj obj );

	void deepDisposeInt64Type( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubInt64TypeObj lockInt64Type( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Int64Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubInt64TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readAllInt64Type();

	/**
	 *	Return a sorted map of all the Int64Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubInt64TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readAllInt64Type( boolean forceRead );

	List<IBusModelPubInt64TypeObj> readCachedAllInt64Type();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubInt64TypeObj readInt64TypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubInt64TypeObj readInt64TypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubInt64TypeObj readInt64TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubInt64TypeObj readInt64TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubInt64TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubInt64TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubInt64TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubInt64TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubInt64TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubInt64TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubInt64TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubInt64TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt64TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt64TypeObj> readInt64TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubInt64TypeObj readCachedInt64TypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubInt64TypeObj readCachedInt64TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubInt64TypeObj> readCachedInt64TypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubInt64TypeObj> readCachedInt64TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubInt64TypeObj> readCachedInt64TypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubInt64TypeObj> readCachedInt64TypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubInt64TypeObj> readCachedInt64TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubInt64TypeObj> readCachedInt64TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubInt64TypeObj> readCachedInt64TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeInt64TypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeInt64TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeInt64TypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeInt64TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeInt64TypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeInt64TypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeInt64TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeInt64TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeInt64TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubInt64TypeObj updateInt64Type( IBusModelPubInt64TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt64Type( IBusModelPubInt64TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubInt64TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubInt64TypeObj refreshed cache instance.
	 */
	IBusModelPubInt64TypeObj moveUpInt64Type( IBusModelPubInt64TypeObj Obj );

	/**
	 *	Move the BusModelPubInt64TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubInt64TypeObj refreshed cache instance.
	 */
	IBusModelPubInt64TypeObj moveDownInt64Type( IBusModelPubInt64TypeObj Obj );
}
