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

public interface IBusModelPubDbKeyHash256ColTableObj
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
	 *	Instantiate a new DbKeyHash256Col instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDbKeyHash256ColObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash256Col edition of the specified DbKeyHash256Col instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDbKeyHash256ColEditObj newEditInstance( IBusModelPubDbKeyHash256ColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash256ColObj realiseDbKeyHash256Col( IBusModelPubDbKeyHash256ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash256ColObj createDbKeyHash256Col( IBusModelPubDbKeyHash256ColObj Obj );

	/**
	 *	Read a DbKeyHash256Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash256ColObj readDbKeyHash256Col( ICFKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash256Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash256ColObj readDbKeyHash256Col( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDbKeyHash256ColObj readCachedDbKeyHash256Col( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash256Col( IBusModelPubDbKeyHash256ColObj obj );

	void deepDisposeDbKeyHash256Col( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash256ColObj lockDbKeyHash256Col( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash256Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash256ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readAllDbKeyHash256Col();

	/**
	 *	Return a sorted map of all the DbKeyHash256Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash256ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readAllDbKeyHash256Col( boolean forceRead );

	List<IBusModelPubDbKeyHash256ColObj> readCachedAllDbKeyHash256Col();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash256ColObj readDbKeyHash256ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash256ColObj readDbKeyHash256ColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash256ColObj readDbKeyHash256ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash256ColObj readDbKeyHash256ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDbKeyHash256ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubDbKeyHash256ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash256ColObj> readDbKeyHash256ColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubDbKeyHash256ColObj readCachedDbKeyHash256ColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDbKeyHash256ColObj readCachedDbKeyHash256ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDbKeyHash256ColObj> readCachedDbKeyHash256ColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDbKeyHash256ColObj> readCachedDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDbKeyHash256ColObj> readCachedDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash256ColObj> readCachedDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash256ColObj> readCachedDbKeyHash256ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash256ColObj> readCachedDbKeyHash256ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash256ColObj> readCachedDbKeyHash256ColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeDbKeyHash256ColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDbKeyHash256ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash256ColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash256ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash256ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash256ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash256ColObj updateDbKeyHash256Col( IBusModelPubDbKeyHash256ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash256Col( IBusModelPubDbKeyHash256ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubDbKeyHash256ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash256ColObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash256ColObj moveUpDbKeyHash256Col( IBusModelPubDbKeyHash256ColObj Obj );

	/**
	 *	Move the BusModelPubDbKeyHash256ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash256ColObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash256ColObj moveDownDbKeyHash256Col( IBusModelPubDbKeyHash256ColObj Obj );
}
