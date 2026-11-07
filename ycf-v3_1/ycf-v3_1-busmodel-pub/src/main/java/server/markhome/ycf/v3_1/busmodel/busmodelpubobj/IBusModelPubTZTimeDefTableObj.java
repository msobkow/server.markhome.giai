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

public interface IBusModelPubTZTimeDefTableObj
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
	 *	Instantiate a new TZTimeDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTZTimeDefObj newInstance();

	/**
	 *	Instantiate a new TZTimeDef edition of the specified TZTimeDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTZTimeDefEditObj newEditInstance( IBusModelPubTZTimeDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimeDefObj realiseTZTimeDef( IBusModelPubTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimeDefObj createTZTimeDef( IBusModelPubTZTimeDefObj Obj );

	/**
	 *	Read a TZTimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTZTimeDefObj readTZTimeDef( ICFKeyHash256 pkey );

	/**
	 *	Read a TZTimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTZTimeDefObj readTZTimeDef( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTZTimeDefObj readCachedTZTimeDef( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTZTimeDef( IBusModelPubTZTimeDefObj obj );

	void deepDisposeTZTimeDef( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimeDefObj lockTZTimeDef( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TZTimeDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTZTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readAllTZTimeDef();

	/**
	 *	Return a sorted map of all the TZTimeDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTZTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readAllTZTimeDef( boolean forceRead );

	List<IBusModelPubTZTimeDefObj> readCachedAllTZTimeDef();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimeDefObj readTZTimeDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimeDefObj readTZTimeDefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimeDefObj readTZTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimeDefObj readTZTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTZTimeDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTZTimeDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTZTimeDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTZTimeDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTZTimeDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTZTimeDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimeDefObj> readTZTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubTZTimeDefObj readCachedTZTimeDefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTZTimeDefObj readCachedTZTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTZTimeDefObj> readCachedTZTimeDefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTZTimeDefObj> readCachedTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTZTimeDefObj> readCachedTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTZTimeDefObj> readCachedTZTimeDefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTZTimeDefObj> readCachedTZTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTZTimeDefObj> readCachedTZTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTZTimeDefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTZTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTZTimeDefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTZTimeDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTZTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTZTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimeDefObj updateTZTimeDef( IBusModelPubTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimeDef( IBusModelPubTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubTZTimeDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTZTimeDefObj refreshed cache instance.
	 */
	IBusModelPubTZTimeDefObj moveUpTZTimeDef( IBusModelPubTZTimeDefObj Obj );

	/**
	 *	Move the BusModelPubTZTimeDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTZTimeDefObj refreshed cache instance.
	 */
	IBusModelPubTZTimeDefObj moveDownTZTimeDef( IBusModelPubTZTimeDefObj Obj );
}
