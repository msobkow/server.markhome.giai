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

public interface IBusModelPubUuidColTableObj
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
	 *	Instantiate a new UuidCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubUuidColObj newInstance();

	/**
	 *	Instantiate a new UuidCol edition of the specified UuidCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubUuidColEditObj newEditInstance( IBusModelPubUuidColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuidColObj realiseUuidCol( IBusModelPubUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuidColObj createUuidCol( IBusModelPubUuidColObj Obj );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUuidColObj readUuidCol( ICFKeyHash256 pkey );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUuidColObj readUuidCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubUuidColObj readCachedUuidCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeUuidCol( IBusModelPubUuidColObj obj );

	void deepDisposeUuidCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuidColObj lockUuidCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUuidColObj> readAllUuidCol();

	/**
	 *	Return a sorted map of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUuidColObj> readAllUuidCol( boolean forceRead );

	List<IBusModelPubUuidColObj> readCachedAllUuidCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuidColObj readUuidColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuidColObj readUuidColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuidColObj readUuidColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuidColObj readUuidColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubUuidColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubUuidColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUuidColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUuidColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUuidColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUuidColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubUuidColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubUuidColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuidColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuidColObj> readUuidColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubUuidColObj readCachedUuidColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubUuidColObj readCachedUuidColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubUuidColObj> readCachedUuidColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubUuidColObj> readCachedUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubUuidColObj> readCachedUuidColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubUuidColObj> readCachedUuidColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubUuidColObj> readCachedUuidColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubUuidColObj> readCachedUuidColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubUuidColObj> readCachedUuidColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeUuidColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeUuidColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuidColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUuidColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUuidColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUuidColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUuidColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUuidColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuidColObj updateUuidCol( IBusModelPubUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidCol( IBusModelPubUuidColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubUuidColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUuidColObj refreshed cache instance.
	 */
	IBusModelPubUuidColObj moveUpUuidCol( IBusModelPubUuidColObj Obj );

	/**
	 *	Move the BusModelPubUuidColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUuidColObj refreshed cache instance.
	 */
	IBusModelPubUuidColObj moveDownUuidCol( IBusModelPubUuidColObj Obj );
}
