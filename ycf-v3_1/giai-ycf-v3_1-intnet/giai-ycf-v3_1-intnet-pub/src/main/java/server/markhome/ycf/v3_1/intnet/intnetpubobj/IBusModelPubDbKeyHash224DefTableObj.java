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

public interface IBusModelPubDbKeyHash224DefTableObj
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
	 *	Instantiate a new DbKeyHash224Def instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDbKeyHash224DefObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash224Def edition of the specified DbKeyHash224Def instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDbKeyHash224DefEditObj newEditInstance( IBusModelPubDbKeyHash224DefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash224DefObj realiseDbKeyHash224Def( IBusModelPubDbKeyHash224DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash224DefObj createDbKeyHash224Def( IBusModelPubDbKeyHash224DefObj Obj );

	/**
	 *	Read a DbKeyHash224Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash224DefObj readDbKeyHash224Def( ICFKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash224Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash224DefObj readDbKeyHash224Def( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDbKeyHash224DefObj readCachedDbKeyHash224Def( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash224Def( IBusModelPubDbKeyHash224DefObj obj );

	void deepDisposeDbKeyHash224Def( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash224DefObj lockDbKeyHash224Def( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash224Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash224DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readAllDbKeyHash224Def();

	/**
	 *	Return a sorted map of all the DbKeyHash224Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash224DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readAllDbKeyHash224Def( boolean forceRead );

	List<IBusModelPubDbKeyHash224DefObj> readCachedAllDbKeyHash224Def();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash224DefObj readDbKeyHash224DefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash224DefObj readDbKeyHash224DefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash224DefObj readDbKeyHash224DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash224DefObj readDbKeyHash224DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224DefObj> readDbKeyHash224DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubDbKeyHash224DefObj readCachedDbKeyHash224DefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDbKeyHash224DefObj readCachedDbKeyHash224DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDbKeyHash224DefObj> readCachedDbKeyHash224DefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDbKeyHash224DefObj> readCachedDbKeyHash224DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDbKeyHash224DefObj> readCachedDbKeyHash224DefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash224DefObj> readCachedDbKeyHash224DefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash224DefObj> readCachedDbKeyHash224DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash224DefObj> readCachedDbKeyHash224DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash224DefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDbKeyHash224DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash224DefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDbKeyHash224DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash224DefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash224DefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash224DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash224DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash224DefObj updateDbKeyHash224Def( IBusModelPubDbKeyHash224DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash224Def( IBusModelPubDbKeyHash224DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash224Def key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubDbKeyHash224DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash224DefObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash224DefObj moveUpDbKeyHash224Def( IBusModelPubDbKeyHash224DefObj Obj );

	/**
	 *	Move the BusModelPubDbKeyHash224DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash224DefObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash224DefObj moveDownDbKeyHash224Def( IBusModelPubDbKeyHash224DefObj Obj );
}
