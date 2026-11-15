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

public interface IBusModelPubTimeDefTableObj
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
	 *	Instantiate a new TimeDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTimeDefObj newInstance();

	/**
	 *	Instantiate a new TimeDef edition of the specified TimeDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTimeDefEditObj newEditInstance( IBusModelPubTimeDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeDefObj realiseTimeDef( IBusModelPubTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeDefObj createTimeDef( IBusModelPubTimeDefObj Obj );

	/**
	 *	Read a TimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimeDefObj readTimeDef( ICFKeyHash256 pkey );

	/**
	 *	Read a TimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimeDefObj readTimeDef( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTimeDefObj readCachedTimeDef( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTimeDef( IBusModelPubTimeDefObj obj );

	void deepDisposeTimeDef( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeDefObj lockTimeDef( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimeDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimeDefObj> readAllTimeDef();

	/**
	 *	Return a sorted map of all the TimeDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimeDefObj> readAllTimeDef( boolean forceRead );

	List<IBusModelPubTimeDefObj> readCachedAllTimeDef();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeDefObj readTimeDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeDefObj readTimeDefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeDefObj readTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeDefObj readTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTimeDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTimeDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimeDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimeDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimeDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimeDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeDefObj> readTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubTimeDefObj readCachedTimeDefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTimeDefObj readCachedTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTimeDefObj> readCachedTimeDefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTimeDefObj> readCachedTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTimeDefObj> readCachedTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTimeDefObj> readCachedTimeDefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTimeDefObj> readCachedTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTimeDefObj> readCachedTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTimeDefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimeDefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTimeDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeDefObj updateTimeDef( IBusModelPubTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeDef( IBusModelPubTimeDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubTimeDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimeDefObj refreshed cache instance.
	 */
	IBusModelPubTimeDefObj moveUpTimeDef( IBusModelPubTimeDefObj Obj );

	/**
	 *	Move the BusModelPubTimeDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimeDefObj refreshed cache instance.
	 */
	IBusModelPubTimeDefObj moveDownTimeDef( IBusModelPubTimeDefObj Obj );
}
