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

public interface IBusModelProtTimestampDefTableObj
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
	 *	Instantiate a new TimestampDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTimestampDefObj newInstance();

	/**
	 *	Instantiate a new TimestampDef edition of the specified TimestampDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTimestampDefEditObj newEditInstance( IBusModelProtTimestampDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimestampDefObj realiseTimestampDef( IBusModelProtTimestampDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimestampDefObj createTimestampDef( IBusModelProtTimestampDefObj Obj );

	/**
	 *	Read a TimestampDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTimestampDefObj readTimestampDef( CFDbKeyHash256 pkey );

	/**
	 *	Read a TimestampDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTimestampDefObj readTimestampDef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTimestampDefObj readCachedTimestampDef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTimestampDef( IBusModelProtTimestampDefObj obj );

	void deepDisposeTimestampDef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimestampDefObj lockTimestampDef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimestampDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readAllTimestampDef();

	/**
	 *	Return a sorted map of all the TimestampDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readAllTimestampDef( boolean forceRead );

	List<IBusModelProtTimestampDefObj> readCachedAllTimestampDef();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimestampDefObj readTimestampDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimestampDefObj readTimestampDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimestampDefObj readTimestampDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimestampDefObj readTimestampDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTimestampDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimestampDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimestampDefObj> readTimestampDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtValueObj readCachedTimestampDefByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedTimestampDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedTimestampDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedTimestampDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedTimestampDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTimestampDefByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedTimestampDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTimestampDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTimestampDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTimestampDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimestampDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTimestampDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTimestampDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTimestampDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTimestampDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTimestampDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimestampDefObj updateTimestampDef( IBusModelProtTimestampDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampDef( IBusModelProtTimestampDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtTimestampDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTimestampDefObj refreshed cache instance.
	 */
	IBusModelProtTimestampDefObj moveUpTimestampDef( IBusModelProtTimestampDefObj Obj );

	/**
	 *	Move the IBusModelProtTimestampDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTimestampDefObj refreshed cache instance.
	 */
	IBusModelProtTimestampDefObj moveDownTimestampDef( IBusModelProtTimestampDefObj Obj );
}
