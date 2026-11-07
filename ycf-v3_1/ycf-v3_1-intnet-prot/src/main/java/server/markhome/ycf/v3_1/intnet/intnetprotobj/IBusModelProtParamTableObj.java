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

public interface IBusModelProtParamTableObj
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
	 *	Instantiate a new Param instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtParamObj newInstance();

	/**
	 *	Instantiate a new Param edition of the specified Param instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtParamEditObj newEditInstance( IBusModelProtParamObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelProtParamEditObj instance, which may be a subclass of a Param instance.
	 */
	IBusModelProtParamObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelProtParamObj realiseParam( IBusModelProtParamObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtParamObj createParam( IBusModelProtParamObj Obj );

	/**
	 *	Read a Param-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Param-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtParamObj readParam( CFDbKeyHash256 pkey );

	/**
	 *	Read a Param-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Param-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtParamObj readParam( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtParamObj readCachedParam( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeParam( IBusModelProtParamObj obj );

	void deepDisposeParam( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtParamObj lockParam( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Param-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtParamObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtParamObj> readAllParam();

	/**
	 *	Return a sorted map of all the Param-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtParamObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtParamObj> readAllParam( boolean forceRead );

	List<IBusModelProtParamObj> readCachedAllParam();

	/**
	 *	Get the IBusModelProtParamObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Param key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtParamObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtParamObj readParamByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtParamObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Param key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtParamObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtParamObj readParamByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtParamObj instance for the unique UNameIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Param key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtParamObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtParamObj readParamByUNameIdx(ICFKeyHash256 ServerMethodId,
		String Name );

	/**
	 *	Get the IBusModelProtParamObj instance for the unique UNameIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Param key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtParamObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtParamObj readParamByUNameIdx(ICFKeyHash256 ServerMethodId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate ServerMethodIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate ServerMethodIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByServerMethodIdx( ICFKeyHash256 ServerMethodId );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate ServerMethodIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate ServerMethodIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByServerMethodIdx( ICFKeyHash256 ServerMethodId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate ServerTypeIdx key.
	 *
	 *	@param	TypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate ServerTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByServerTypeIdx( CFDbKeyHash256 TypeId );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate ServerTypeIdx key.
	 *
	 *	@param	TypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate ServerTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByServerTypeIdx( CFDbKeyHash256 TypeId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByContPrevIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByContPrevIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByContNextIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of List<IBusModelProtParamObj> instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtParamObj> cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtParamObj> readParamByContNextIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtParamObj readCachedParamByIdIdx( ICFKeyHash256 Id );

	IBusModelProtParamObj readCachedParamByUNameIdx( ICFKeyHash256 ServerMethodId,
		String Name );

	List<List<IBusModelProtParamObj>> readCachedParamByServerMethodIdx( ICFKeyHash256 ServerMethodId );

	List<List<IBusModelProtParamObj>> readCachedParamByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtParamObj>> readCachedParamByServerTypeIdx( CFDbKeyHash256 TypeId );

	List<List<IBusModelProtParamObj>> readCachedParamByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtParamObj>> readCachedParamByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtParamObj>> readCachedParamByContPrevIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtParamObj>> readCachedParamByContNextIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId );

	void deepDisposeParamByIdIdx( ICFKeyHash256 Id );

	void deepDisposeParamByUNameIdx( ICFKeyHash256 ServerMethodId,
		String Name );

	void deepDisposeParamByServerMethodIdx( ICFKeyHash256 ServerMethodId );

	void deepDisposeParamByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeParamByServerTypeIdx( CFDbKeyHash256 TypeId );

	void deepDisposeParamByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeParamByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeParamByContPrevIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId );

	void deepDisposeParamByContNextIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtParamObj updateParam( IBusModelProtParamObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteParam( IBusModelProtParamObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByUNameIdx(ICFKeyHash256 ServerMethodId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByServerMethodIdx( ICFKeyHash256 ServerMethodId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TypeId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByServerTypeIdx( CFDbKeyHash256 TypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByContPrevIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByContNextIdx( ICFKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtParamObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtParamObj refreshed cache instance.
	 */
	IBusModelProtParamObj moveUpParam( IBusModelProtParamObj Obj );

	/**
	 *	Move the IBusModelProtParamObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtParamObj refreshed cache instance.
	 */
	IBusModelProtParamObj moveDownParam( IBusModelProtParamObj Obj );
}
