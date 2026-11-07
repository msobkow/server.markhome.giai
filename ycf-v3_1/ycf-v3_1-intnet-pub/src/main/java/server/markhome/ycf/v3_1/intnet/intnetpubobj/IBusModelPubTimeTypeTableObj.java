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

public interface IBusModelPubTimeTypeTableObj
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
	 *	Instantiate a new TimeType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTimeTypeObj newInstance();

	/**
	 *	Instantiate a new TimeType edition of the specified TimeType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTimeTypeEditObj newEditInstance( IBusModelPubTimeTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeTypeObj realiseTimeType( IBusModelPubTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeTypeObj createTimeType( IBusModelPubTimeTypeObj Obj );

	/**
	 *	Read a TimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimeTypeObj readTimeType( ICFKeyHash256 pkey );

	/**
	 *	Read a TimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimeTypeObj readTimeType( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTimeTypeObj readCachedTimeType( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTimeType( IBusModelPubTimeTypeObj obj );

	void deepDisposeTimeType( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeTypeObj lockTimeType( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimeType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readAllTimeType();

	/**
	 *	Return a sorted map of all the TimeType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readAllTimeType( boolean forceRead );

	List<IBusModelPubTimeTypeObj> readCachedAllTimeType();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeTypeObj readTimeTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeTypeObj readTimeTypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeTypeObj readTimeTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeTypeObj readTimeTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTimeTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTimeTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimeTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimeTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimeTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimeTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTimeTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubTimeTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeTypeObj> readTimeTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubTimeTypeObj readCachedTimeTypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTimeTypeObj readCachedTimeTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTimeTypeObj> readCachedTimeTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTimeTypeObj> readCachedTimeTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTimeTypeObj> readCachedTimeTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTimeTypeObj> readCachedTimeTypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTimeTypeObj> readCachedTimeTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTimeTypeObj> readCachedTimeTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTimeTypeObj> readCachedTimeTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeTimeTypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTimeTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimeTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTimeTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTimeTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTimeTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTimeTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTimeTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTimeTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeTypeObj updateTimeType( IBusModelPubTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeType( IBusModelPubTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubTimeTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimeTypeObj refreshed cache instance.
	 */
	IBusModelPubTimeTypeObj moveUpTimeType( IBusModelPubTimeTypeObj Obj );

	/**
	 *	Move the BusModelPubTimeTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimeTypeObj refreshed cache instance.
	 */
	IBusModelPubTimeTypeObj moveDownTimeType( IBusModelPubTimeTypeObj Obj );
}
