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

public interface IBusModelPubNmTokenColTableObj
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
	 *	Instantiate a new NmTokenCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubNmTokenColObj newInstance();

	/**
	 *	Instantiate a new NmTokenCol edition of the specified NmTokenCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubNmTokenColEditObj newEditInstance( IBusModelPubNmTokenColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokenColObj realiseNmTokenCol( IBusModelPubNmTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokenColObj createNmTokenCol( IBusModelPubNmTokenColObj Obj );

	/**
	 *	Read a NmTokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubNmTokenColObj readNmTokenCol( ICFKeyHash256 pkey );

	/**
	 *	Read a NmTokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubNmTokenColObj readNmTokenCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubNmTokenColObj readCachedNmTokenCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeNmTokenCol( IBusModelPubNmTokenColObj obj );

	void deepDisposeNmTokenCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokenColObj lockNmTokenCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the NmTokenCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubNmTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readAllNmTokenCol();

	/**
	 *	Return a sorted map of all the NmTokenCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubNmTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readAllNmTokenCol( boolean forceRead );

	List<IBusModelPubNmTokenColObj> readCachedAllNmTokenCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokenColObj readNmTokenColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokenColObj readNmTokenColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokenColObj readNmTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokenColObj readNmTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubNmTokenColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubNmTokenColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubNmTokenColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubNmTokenColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubNmTokenColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubNmTokenColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubNmTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubNmTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokenColObj> readNmTokenColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubNmTokenColObj readCachedNmTokenColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubNmTokenColObj readCachedNmTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubNmTokenColObj> readCachedNmTokenColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubNmTokenColObj> readCachedNmTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubNmTokenColObj> readCachedNmTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubNmTokenColObj> readCachedNmTokenColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubNmTokenColObj> readCachedNmTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubNmTokenColObj> readCachedNmTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubNmTokenColObj> readCachedNmTokenColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeNmTokenColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeNmTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeNmTokenColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeNmTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeNmTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeNmTokenColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeNmTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeNmTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeNmTokenColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokenColObj updateNmTokenCol( IBusModelPubNmTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokenCol( IBusModelPubNmTokenColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The NmTokenCol key attribute of the instance generating the id.
	 */
	void deleteNmTokenColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubNmTokenColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubNmTokenColObj refreshed cache instance.
	 */
	IBusModelPubNmTokenColObj moveUpNmTokenCol( IBusModelPubNmTokenColObj Obj );

	/**
	 *	Move the BusModelPubNmTokenColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubNmTokenColObj refreshed cache instance.
	 */
	IBusModelPubNmTokenColObj moveDownNmTokenCol( IBusModelPubNmTokenColObj Obj );
}
