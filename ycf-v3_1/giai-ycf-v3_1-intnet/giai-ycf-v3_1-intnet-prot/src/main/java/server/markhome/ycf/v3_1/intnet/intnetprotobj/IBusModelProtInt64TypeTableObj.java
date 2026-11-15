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

public interface IBusModelProtInt64TypeTableObj
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
	 *	Instantiate a new Int64Type instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtInt64TypeObj newInstance();

	/**
	 *	Instantiate a new Int64Type edition of the specified Int64Type instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtInt64TypeEditObj newEditInstance( IBusModelProtInt64TypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtInt64TypeObj realiseInt64Type( IBusModelProtInt64TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtInt64TypeObj createInt64Type( IBusModelProtInt64TypeObj Obj );

	/**
	 *	Read a Int64Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtInt64TypeObj readInt64Type( CFDbKeyHash256 pkey );

	/**
	 *	Read a Int64Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtInt64TypeObj readInt64Type( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtInt64TypeObj readCachedInt64Type( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeInt64Type( IBusModelProtInt64TypeObj obj );

	void deepDisposeInt64Type( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtInt64TypeObj lockInt64Type( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Int64Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readAllInt64Type();

	/**
	 *	Return a sorted map of all the Int64Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readAllInt64Type( boolean forceRead );

	List<IBusModelProtInt64TypeObj> readCachedAllInt64Type();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtInt64TypeObj readInt64TypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtInt64TypeObj readInt64TypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtInt64TypeObj readInt64TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtInt64TypeObj readInt64TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtInt64TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtInt64TypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtInt64TypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<IBusModelProtInt64TypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtInt64TypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64TypeObj> readInt64TypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedInt64TypeByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedInt64TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedInt64TypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedInt64TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedInt64TypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedInt64TypeByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedInt64TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedInt64TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtInt64TypeObj>> readCachedInt64TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeInt64TypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeInt64TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeInt64TypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeInt64TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeInt64TypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeInt64TypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeInt64TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeInt64TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeInt64TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtInt64TypeObj updateInt64Type( IBusModelProtInt64TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt64Type( IBusModelProtInt64TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByScopeIdx( ICFKeyHash256 ScopeId );

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
	void deleteInt64TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Int64Type key attribute of the instance generating the id.
	 */
	void deleteInt64TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtInt64TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtInt64TypeObj refreshed cache instance.
	 */
	IBusModelProtInt64TypeObj moveUpInt64Type( IBusModelProtInt64TypeObj Obj );

	/**
	 *	Move the IBusModelProtInt64TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtInt64TypeObj refreshed cache instance.
	 */
	IBusModelProtInt64TypeObj moveDownInt64Type( IBusModelProtInt64TypeObj Obj );
}
