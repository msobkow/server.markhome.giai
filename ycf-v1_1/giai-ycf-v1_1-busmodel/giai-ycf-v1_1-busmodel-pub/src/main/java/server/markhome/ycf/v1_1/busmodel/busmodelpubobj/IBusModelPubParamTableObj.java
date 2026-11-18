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

public interface IBusModelPubParamTableObj
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
	 *	Instantiate a new Param instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubParamObj newInstance();

	/**
	 *	Instantiate a new Param edition of the specified Param instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubParamEditObj newEditInstance( IBusModelPubParamObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelPubParamObj instance, which may be a subclass of a Param instance.
	 */
	IBusModelPubParamObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelPubParamObj realiseParam( IBusModelPubParamObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubParamObj createParam( IBusModelPubParamObj Obj );

	/**
	 *	Read a Param-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Param-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubParamObj readParam( ICFKeyHash256 pkey );

	/**
	 *	Read a Param-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Param-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubParamObj readParam( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubParamObj readCachedParam( ICFKeyHash256 pkey );

	public void reallyDeepDisposeParam( IBusModelPubParamObj obj );

	void deepDisposeParam( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubParamObj lockParam( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Param-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubParamObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubParamObj> readAllParam();

	/**
	 *	Return a sorted map of all the Param-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubParamObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubParamObj> readAllParam( boolean forceRead );

	List<IBusModelPubParamObj> readCachedAllParam();

	/**
	 *	Get the BusModelPubParamObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Param key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubParamObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubParamObj readParamByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubParamObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Param key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubParamObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubParamObj readParamByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubParamObj instance for the unique UNameIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Param key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubParamObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubParamObj readParamByUNameIdx(CFDbKeyHash256 ServerMethodId,
		String Name );

	/**
	 *	Get the BusModelPubParamObj instance for the unique UNameIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Param key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubParamObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubParamObj readParamByUNameIdx(CFDbKeyHash256 ServerMethodId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate ServerMethodIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate ServerMethodIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByServerMethodIdx( CFDbKeyHash256 ServerMethodId );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate ServerMethodIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate ServerMethodIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByServerMethodIdx( CFDbKeyHash256 ServerMethodId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate ServerTypeIdx key.
	 *
	 *	@param	TypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate ServerTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByServerTypeIdx( CFDbKeyHash256 TypeId );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate ServerTypeIdx key.
	 *
	 *	@param	TypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate ServerTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByServerTypeIdx( CFDbKeyHash256 TypeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByContPrevIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByContPrevIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByContNextIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubParamObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubParamObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubParamObj> readParamByContNextIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubParamObj readCachedParamByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubParamObj readCachedParamByUNameIdx( CFDbKeyHash256 ServerMethodId,
		String Name );

	List<IBusModelPubParamObj> readCachedParamByServerMethodIdx( CFDbKeyHash256 ServerMethodId );

	List<IBusModelPubParamObj> readCachedParamByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubParamObj> readCachedParamByServerTypeIdx( CFDbKeyHash256 TypeId );

	List<IBusModelPubParamObj> readCachedParamByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubParamObj> readCachedParamByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubParamObj> readCachedParamByContPrevIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubParamObj> readCachedParamByContNextIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId );

	void deepDisposeParamByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeParamByUNameIdx( CFDbKeyHash256 ServerMethodId,
		String Name );

	void deepDisposeParamByServerMethodIdx( CFDbKeyHash256 ServerMethodId );

	void deepDisposeParamByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeParamByServerTypeIdx( CFDbKeyHash256 TypeId );

	void deepDisposeParamByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeParamByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeParamByContPrevIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId );

	void deepDisposeParamByContNextIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubParamObj updateParam( IBusModelPubParamObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteParam( IBusModelPubParamObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByUNameIdx(CFDbKeyHash256 ServerMethodId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByServerMethodIdx( CFDbKeyHash256 ServerMethodId );

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
	void deleteParamByContPrevIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByContNextIdx( CFDbKeyHash256 ServerMethodId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubParamObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubParamObj refreshed cache instance.
	 */
	IBusModelPubParamObj moveUpParam( IBusModelPubParamObj Obj );

	/**
	 *	Move the BusModelPubParamObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubParamObj refreshed cache instance.
	 */
	IBusModelPubParamObj moveDownParam( IBusModelPubParamObj Obj );
}
