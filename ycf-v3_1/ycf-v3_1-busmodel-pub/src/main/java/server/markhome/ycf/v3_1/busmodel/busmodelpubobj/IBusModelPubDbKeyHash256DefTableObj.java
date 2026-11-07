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

public interface IBusModelPubDbKeyHash256DefTableObj
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
	 *	Instantiate a new DbKeyHash256Def instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDbKeyHash256DefObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash256Def edition of the specified DbKeyHash256Def instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDbKeyHash256DefEditObj newEditInstance( IBusModelPubDbKeyHash256DefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash256DefObj realiseDbKeyHash256Def( IBusModelPubDbKeyHash256DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash256DefObj createDbKeyHash256Def( IBusModelPubDbKeyHash256DefObj Obj );

	/**
	 *	Read a DbKeyHash256Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash256DefObj readDbKeyHash256Def( ICFKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash256Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash256DefObj readDbKeyHash256Def( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDbKeyHash256DefObj readCachedDbKeyHash256Def( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash256Def( IBusModelPubDbKeyHash256DefObj obj );

	void deepDisposeDbKeyHash256Def( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash256DefObj lockDbKeyHash256Def( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash256Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash256DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readAllDbKeyHash256Def();

	/**
	 *	Return a sorted map of all the DbKeyHash256Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash256DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readAllDbKeyHash256Def( boolean forceRead );

	List<IBusModelPubDbKeyHash256DefObj> readCachedAllDbKeyHash256Def();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash256DefObj readDbKeyHash256DefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash256DefObj readDbKeyHash256DefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash256DefObj readDbKeyHash256DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash256DefObj readDbKeyHash256DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256DefObj> readDbKeyHash256DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubDbKeyHash256DefObj readCachedDbKeyHash256DefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDbKeyHash256DefObj readCachedDbKeyHash256DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDbKeyHash256DefObj> readCachedDbKeyHash256DefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDbKeyHash256DefObj> readCachedDbKeyHash256DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDbKeyHash256DefObj> readCachedDbKeyHash256DefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash256DefObj> readCachedDbKeyHash256DefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash256DefObj> readCachedDbKeyHash256DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash256DefObj> readCachedDbKeyHash256DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash256DefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDbKeyHash256DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash256DefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDbKeyHash256DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash256DefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash256DefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash256DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash256DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash256DefObj updateDbKeyHash256Def( IBusModelPubDbKeyHash256DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash256Def( IBusModelPubDbKeyHash256DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash256Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256DefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash256Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256DefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash256Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash256Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256DefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash256Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256DefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash256Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash256Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubDbKeyHash256DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash256DefObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash256DefObj moveUpDbKeyHash256Def( IBusModelPubDbKeyHash256DefObj Obj );

	/**
	 *	Move the BusModelPubDbKeyHash256DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash256DefObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash256DefObj moveDownDbKeyHash256Def( IBusModelPubDbKeyHash256DefObj Obj );
}
