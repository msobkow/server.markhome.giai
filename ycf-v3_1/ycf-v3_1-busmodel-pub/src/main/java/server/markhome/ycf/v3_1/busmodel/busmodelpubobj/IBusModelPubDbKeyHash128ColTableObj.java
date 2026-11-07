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

public interface IBusModelPubDbKeyHash128ColTableObj
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
	 *	Instantiate a new DbKeyHash128Col instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDbKeyHash128ColObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash128Col edition of the specified DbKeyHash128Col instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDbKeyHash128ColEditObj newEditInstance( IBusModelPubDbKeyHash128ColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash128ColObj realiseDbKeyHash128Col( IBusModelPubDbKeyHash128ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash128ColObj createDbKeyHash128Col( IBusModelPubDbKeyHash128ColObj Obj );

	/**
	 *	Read a DbKeyHash128Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash128ColObj readDbKeyHash128Col( ICFKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash128Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash128ColObj readDbKeyHash128Col( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDbKeyHash128ColObj readCachedDbKeyHash128Col( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash128Col( IBusModelPubDbKeyHash128ColObj obj );

	void deepDisposeDbKeyHash128Col( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash128ColObj lockDbKeyHash128Col( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash128Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash128ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readAllDbKeyHash128Col();

	/**
	 *	Return a sorted map of all the DbKeyHash128Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash128ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readAllDbKeyHash128Col( boolean forceRead );

	List<IBusModelPubDbKeyHash128ColObj> readCachedAllDbKeyHash128Col();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash128ColObj readDbKeyHash128ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash128ColObj readDbKeyHash128ColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash128ColObj readDbKeyHash128ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash128ColObj readDbKeyHash128ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDbKeyHash128ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128ColObj> readDbKeyHash128ColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubDbKeyHash128ColObj readCachedDbKeyHash128ColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDbKeyHash128ColObj readCachedDbKeyHash128ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDbKeyHash128ColObj> readCachedDbKeyHash128ColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDbKeyHash128ColObj> readCachedDbKeyHash128ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDbKeyHash128ColObj> readCachedDbKeyHash128ColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash128ColObj> readCachedDbKeyHash128ColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash128ColObj> readCachedDbKeyHash128ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash128ColObj> readCachedDbKeyHash128ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash128ColObj> readCachedDbKeyHash128ColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeDbKeyHash128ColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDbKeyHash128ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash128ColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDbKeyHash128ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash128ColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash128ColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash128ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash128ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash128ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash128ColObj updateDbKeyHash128Col( IBusModelPubDbKeyHash128ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash128Col( IBusModelPubDbKeyHash128ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DbKeyHash128Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubDbKeyHash128ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash128ColObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash128ColObj moveUpDbKeyHash128Col( IBusModelPubDbKeyHash128ColObj Obj );

	/**
	 *	Move the BusModelPubDbKeyHash128ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash128ColObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash128ColObj moveDownDbKeyHash128Col( IBusModelPubDbKeyHash128ColObj Obj );
}
