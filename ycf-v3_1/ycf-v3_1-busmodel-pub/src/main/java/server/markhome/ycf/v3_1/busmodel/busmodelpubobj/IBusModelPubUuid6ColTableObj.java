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

public interface IBusModelPubUuid6ColTableObj
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
	 *	Instantiate a new Uuid6Col instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubUuid6ColObj newInstance();

	/**
	 *	Instantiate a new Uuid6Col edition of the specified Uuid6Col instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubUuid6ColEditObj newEditInstance( IBusModelPubUuid6ColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuid6ColObj realiseUuid6Col( IBusModelPubUuid6ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuid6ColObj createUuid6Col( IBusModelPubUuid6ColObj Obj );

	/**
	 *	Read a Uuid6Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUuid6ColObj readUuid6Col( ICFKeyHash256 pkey );

	/**
	 *	Read a Uuid6Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUuid6ColObj readUuid6Col( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubUuid6ColObj readCachedUuid6Col( ICFKeyHash256 pkey );

	public void reallyDeepDisposeUuid6Col( IBusModelPubUuid6ColObj obj );

	void deepDisposeUuid6Col( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuid6ColObj lockUuid6Col( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Uuid6Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUuid6ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readAllUuid6Col();

	/**
	 *	Return a sorted map of all the Uuid6Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUuid6ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readAllUuid6Col( boolean forceRead );

	List<IBusModelPubUuid6ColObj> readCachedAllUuid6Col();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuid6ColObj readUuid6ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuid6ColObj readUuid6ColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuid6ColObj readUuid6ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuid6ColObj readUuid6ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubUuid6ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubUuid6ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUuid6ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUuid6ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUuid6ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUuid6ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubUuid6ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubUuid6ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6ColObj> readUuid6ColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubUuid6ColObj readCachedUuid6ColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubUuid6ColObj readCachedUuid6ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubUuid6ColObj> readCachedUuid6ColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubUuid6ColObj> readCachedUuid6ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubUuid6ColObj> readCachedUuid6ColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubUuid6ColObj> readCachedUuid6ColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubUuid6ColObj> readCachedUuid6ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubUuid6ColObj> readCachedUuid6ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubUuid6ColObj> readCachedUuid6ColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeUuid6ColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeUuid6ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuid6ColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeUuid6ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUuid6ColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUuid6ColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUuid6ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUuid6ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUuid6ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuid6ColObj updateUuid6Col( IBusModelPubUuid6ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuid6Col( IBusModelPubUuid6ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubUuid6ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUuid6ColObj refreshed cache instance.
	 */
	IBusModelPubUuid6ColObj moveUpUuid6Col( IBusModelPubUuid6ColObj Obj );

	/**
	 *	Move the BusModelPubUuid6ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUuid6ColObj refreshed cache instance.
	 */
	IBusModelPubUuid6ColObj moveDownUuid6Col( IBusModelPubUuid6ColObj Obj );
}
