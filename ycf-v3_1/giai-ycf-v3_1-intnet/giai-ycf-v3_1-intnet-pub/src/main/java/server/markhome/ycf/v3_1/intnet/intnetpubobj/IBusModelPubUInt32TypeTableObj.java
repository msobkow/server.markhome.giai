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

public interface IBusModelPubUInt32TypeTableObj
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
	 *	Instantiate a new UInt32Type instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubUInt32TypeObj newInstance();

	/**
	 *	Instantiate a new UInt32Type edition of the specified UInt32Type instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubUInt32TypeEditObj newEditInstance( IBusModelPubUInt32TypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32TypeObj realiseUInt32Type( IBusModelPubUInt32TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32TypeObj createUInt32Type( IBusModelPubUInt32TypeObj Obj );

	/**
	 *	Read a UInt32Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUInt32TypeObj readUInt32Type( ICFKeyHash256 pkey );

	/**
	 *	Read a UInt32Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUInt32TypeObj readUInt32Type( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubUInt32TypeObj readCachedUInt32Type( ICFKeyHash256 pkey );

	public void reallyDeepDisposeUInt32Type( IBusModelPubUInt32TypeObj obj );

	void deepDisposeUInt32Type( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32TypeObj lockUInt32Type( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the UInt32Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUInt32TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readAllUInt32Type();

	/**
	 *	Return a sorted map of all the UInt32Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUInt32TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readAllUInt32Type( boolean forceRead );

	List<IBusModelPubUInt32TypeObj> readCachedAllUInt32Type();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32TypeObj readUInt32TypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32TypeObj readUInt32TypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32TypeObj readUInt32TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32TypeObj readUInt32TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubUInt32TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubUInt32TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUInt32TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUInt32TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUInt32TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUInt32TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubUInt32TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubUInt32TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32TypeObj> readUInt32TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubUInt32TypeObj readCachedUInt32TypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubUInt32TypeObj readCachedUInt32TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubUInt32TypeObj> readCachedUInt32TypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubUInt32TypeObj> readCachedUInt32TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubUInt32TypeObj> readCachedUInt32TypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubUInt32TypeObj> readCachedUInt32TypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubUInt32TypeObj> readCachedUInt32TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubUInt32TypeObj> readCachedUInt32TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubUInt32TypeObj> readCachedUInt32TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeUInt32TypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeUInt32TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeUInt32TypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeUInt32TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUInt32TypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUInt32TypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUInt32TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUInt32TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUInt32TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32TypeObj updateUInt32Type( IBusModelPubUInt32TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt32Type( IBusModelPubUInt32TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UInt32Type key attribute of the instance generating the id.
	 */
	void deleteUInt32TypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Type key attribute of the instance generating the id.
	 */
	void deleteUInt32TypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 */
	void deleteUInt32TypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UInt32Type key attribute of the instance generating the id.
	 */
	void deleteUInt32TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UInt32Type key attribute of the instance generating the id.
	 */
	void deleteUInt32TypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UInt32Type key attribute of the instance generating the id.
	 */
	void deleteUInt32TypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Type key attribute of the instance generating the id.
	 */
	void deleteUInt32TypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Type key attribute of the instance generating the id.
	 */
	void deleteUInt32TypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The UInt32Type key attribute of the instance generating the id.
	 */
	void deleteUInt32TypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubUInt32TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUInt32TypeObj refreshed cache instance.
	 */
	IBusModelPubUInt32TypeObj moveUpUInt32Type( IBusModelPubUInt32TypeObj Obj );

	/**
	 *	Move the BusModelPubUInt32TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUInt32TypeObj refreshed cache instance.
	 */
	IBusModelPubUInt32TypeObj moveDownUInt32Type( IBusModelPubUInt32TypeObj Obj );
}
