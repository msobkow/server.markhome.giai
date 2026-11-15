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

public interface IBusModelPubTimestampColTableObj
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
	 *	Instantiate a new TimestampCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTimestampColObj newInstance();

	/**
	 *	Instantiate a new TimestampCol edition of the specified TimestampCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTimestampColEditObj newEditInstance( IBusModelPubTimestampColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimestampColObj realiseTimestampCol( IBusModelPubTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimestampColObj createTimestampCol( IBusModelPubTimestampColObj Obj );

	/**
	 *	Read a TimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimestampColObj readTimestampCol( ICFKeyHash256 pkey );

	/**
	 *	Read a TimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimestampColObj readTimestampCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTimestampColObj readCachedTimestampCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTimestampCol( IBusModelPubTimestampColObj obj );

	void deepDisposeTimestampCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimestampColObj lockTimestampCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimestampCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimestampColObj> readAllTimestampCol();

	/**
	 *	Return a sorted map of all the TimestampCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimestampColObj> readAllTimestampCol( boolean forceRead );

	List<IBusModelPubTimestampColObj> readCachedAllTimestampCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimestampColObj readTimestampColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimestampColObj readTimestampColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimestampColObj readTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimestampColObj readTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTimestampColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTimestampColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimestampColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimestampColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimestampColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimestampColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimestampColObj> readTimestampColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubTimestampColObj readCachedTimestampColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTimestampColObj readCachedTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTimestampColObj> readCachedTimestampColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTimestampColObj> readCachedTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTimestampColObj> readCachedTimestampColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTimestampColObj> readCachedTimestampColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTimestampColObj> readCachedTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTimestampColObj> readCachedTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTimestampColObj> readCachedTimestampColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeTimestampColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimestampColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTimestampColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTimestampColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTimestampColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimestampColObj updateTimestampCol( IBusModelPubTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampCol( IBusModelPubTimestampColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TimestampCol key attribute of the instance generating the id.
	 */
	void deleteTimestampColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubTimestampColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimestampColObj refreshed cache instance.
	 */
	IBusModelPubTimestampColObj moveUpTimestampCol( IBusModelPubTimestampColObj Obj );

	/**
	 *	Move the BusModelPubTimestampColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimestampColObj refreshed cache instance.
	 */
	IBusModelPubTimestampColObj moveDownTimestampCol( IBusModelPubTimestampColObj Obj );
}
