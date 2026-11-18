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

public interface IBusModelPubNmTokensDefTableObj
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
	 *	Instantiate a new NmTokensDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubNmTokensDefObj newInstance();

	/**
	 *	Instantiate a new NmTokensDef edition of the specified NmTokensDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubNmTokensDefEditObj newEditInstance( IBusModelPubNmTokensDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokensDefObj realiseNmTokensDef( IBusModelPubNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokensDefObj createNmTokensDef( IBusModelPubNmTokensDefObj Obj );

	/**
	 *	Read a NmTokensDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubNmTokensDefObj readNmTokensDef( ICFKeyHash256 pkey );

	/**
	 *	Read a NmTokensDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubNmTokensDefObj readNmTokensDef( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubNmTokensDefObj readCachedNmTokensDef( ICFKeyHash256 pkey );

	public void reallyDeepDisposeNmTokensDef( IBusModelPubNmTokensDefObj obj );

	void deepDisposeNmTokensDef( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokensDefObj lockNmTokensDef( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the NmTokensDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubNmTokensDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readAllNmTokensDef();

	/**
	 *	Return a sorted map of all the NmTokensDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubNmTokensDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readAllNmTokensDef( boolean forceRead );

	List<IBusModelPubNmTokensDefObj> readCachedAllNmTokensDef();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokensDefObj readNmTokensDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokensDefObj readNmTokensDefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokensDefObj readNmTokensDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNmTokensDefObj readNmTokensDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubNmTokensDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubNmTokensDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubNmTokensDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubNmTokensDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubNmTokensDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubNmTokensDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNmTokensDefObj> readNmTokensDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubNmTokensDefObj readCachedNmTokensDefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubNmTokensDefObj readCachedNmTokensDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubNmTokensDefObj> readCachedNmTokensDefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubNmTokensDefObj> readCachedNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubNmTokensDefObj> readCachedNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubNmTokensDefObj> readCachedNmTokensDefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubNmTokensDefObj> readCachedNmTokensDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubNmTokensDefObj> readCachedNmTokensDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeNmTokensDefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeNmTokensDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeNmTokensDefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeNmTokensDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeNmTokensDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeNmTokensDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNmTokensDefObj updateNmTokensDef( IBusModelPubNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensDef( IBusModelPubNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubNmTokensDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubNmTokensDefObj refreshed cache instance.
	 */
	IBusModelPubNmTokensDefObj moveUpNmTokensDef( IBusModelPubNmTokensDefObj Obj );

	/**
	 *	Move the BusModelPubNmTokensDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubNmTokensDefObj refreshed cache instance.
	 */
	IBusModelPubNmTokensDefObj moveDownNmTokensDef( IBusModelPubNmTokensDefObj Obj );
}
