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

public interface IBusModelPubNmTokensColTableObj
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
	 *	Instantiate a new NmTokensCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubNmTokensColObj newInstance();

	/**
	 *	Instantiate a new NmTokensCol edition of the specified NmTokensCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubNmTokensColEditObj newEditInstance( IBusModelPubNmTokensColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokensColObj realiseNmTokensCol( IBusModelPubNmTokensColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokensColObj createNmTokensCol( IBusModelPubNmTokensColObj Obj );

	/**
	 *	Read a NmTokensCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubNmTokensColObj readNmTokensCol( ICFKeyHash256 pkey );

	/**
	 *	Read a NmTokensCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubNmTokensColObj readNmTokensCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubNmTokensColObj readCachedNmTokensCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeNmTokensCol( IBusModelPubNmTokensColObj obj );

	void deepDisposeNmTokensCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokensColObj lockNmTokensCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the NmTokensCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubNmTokensColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readAllNmTokensCol();

	/**
	 *	Return a sorted map of all the NmTokensCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubNmTokensColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readAllNmTokensCol( boolean forceRead );

	List<IBusModelPubNmTokensColObj> readCachedAllNmTokensCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokensColObj readNmTokensColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokensColObj readNmTokensColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokensColObj readNmTokensColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokensColObj readNmTokensColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubNmTokensColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubNmTokensColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubNmTokensColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubNmTokensColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubNmTokensColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubNmTokensColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubNmTokensColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubNmTokensColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensColObj> readNmTokensColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubNmTokensColObj readCachedNmTokensColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubNmTokensColObj readCachedNmTokensColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubNmTokensColObj> readCachedNmTokensColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubNmTokensColObj> readCachedNmTokensColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubNmTokensColObj> readCachedNmTokensColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubNmTokensColObj> readCachedNmTokensColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubNmTokensColObj> readCachedNmTokensColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubNmTokensColObj> readCachedNmTokensColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubNmTokensColObj> readCachedNmTokensColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeNmTokensColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeNmTokensColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeNmTokensColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeNmTokensColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeNmTokensColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeNmTokensColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeNmTokensColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeNmTokensColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeNmTokensColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokensColObj updateNmTokensCol( IBusModelPubNmTokensColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensCol( IBusModelPubNmTokensColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubNmTokensColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubNmTokensColObj refreshed cache instance.
	 */
	IBusModelPubNmTokensColObj moveUpNmTokensCol( IBusModelPubNmTokensColObj Obj );

	/**
	 *	Move the BusModelPubNmTokensColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubNmTokensColObj refreshed cache instance.
	 */
	IBusModelPubNmTokensColObj moveDownNmTokensCol( IBusModelPubNmTokensColObj Obj );
}
