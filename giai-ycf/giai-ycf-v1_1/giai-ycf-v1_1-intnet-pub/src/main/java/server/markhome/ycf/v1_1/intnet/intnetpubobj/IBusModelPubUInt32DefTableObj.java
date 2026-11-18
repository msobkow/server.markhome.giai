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

public interface IBusModelPubUInt32DefTableObj
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
	 *	Instantiate a new UInt32Def instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubUInt32DefObj newInstance();

	/**
	 *	Instantiate a new UInt32Def edition of the specified UInt32Def instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubUInt32DefEditObj newEditInstance( IBusModelPubUInt32DefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32DefObj realiseUInt32Def( IBusModelPubUInt32DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32DefObj createUInt32Def( IBusModelPubUInt32DefObj Obj );

	/**
	 *	Read a UInt32Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUInt32DefObj readUInt32Def( ICFKeyHash256 pkey );

	/**
	 *	Read a UInt32Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUInt32DefObj readUInt32Def( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubUInt32DefObj readCachedUInt32Def( ICFKeyHash256 pkey );

	public void reallyDeepDisposeUInt32Def( IBusModelPubUInt32DefObj obj );

	void deepDisposeUInt32Def( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32DefObj lockUInt32Def( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the UInt32Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUInt32DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readAllUInt32Def();

	/**
	 *	Return a sorted map of all the UInt32Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUInt32DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readAllUInt32Def( boolean forceRead );

	List<IBusModelPubUInt32DefObj> readCachedAllUInt32Def();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32DefObj readUInt32DefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32DefObj readUInt32DefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32DefObj readUInt32DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32DefObj readUInt32DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubUInt32DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubUInt32DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUInt32DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUInt32DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUInt32DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUInt32DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32DefObj> readUInt32DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubUInt32DefObj readCachedUInt32DefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubUInt32DefObj readCachedUInt32DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubUInt32DefObj> readCachedUInt32DefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubUInt32DefObj> readCachedUInt32DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubUInt32DefObj> readCachedUInt32DefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubUInt32DefObj> readCachedUInt32DefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubUInt32DefObj> readCachedUInt32DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubUInt32DefObj> readCachedUInt32DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUInt32DefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeUInt32DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeUInt32DefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeUInt32DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUInt32DefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUInt32DefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUInt32DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUInt32DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32DefObj updateUInt32Def( IBusModelPubUInt32DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt32Def( IBusModelPubUInt32DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UInt32Def key attribute of the instance generating the id.
	 */
	void deleteUInt32DefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Def key attribute of the instance generating the id.
	 */
	void deleteUInt32DefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 */
	void deleteUInt32DefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UInt32Def key attribute of the instance generating the id.
	 */
	void deleteUInt32DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UInt32Def key attribute of the instance generating the id.
	 */
	void deleteUInt32DefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UInt32Def key attribute of the instance generating the id.
	 */
	void deleteUInt32DefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Def key attribute of the instance generating the id.
	 */
	void deleteUInt32DefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Def key attribute of the instance generating the id.
	 */
	void deleteUInt32DefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubUInt32DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUInt32DefObj refreshed cache instance.
	 */
	IBusModelPubUInt32DefObj moveUpUInt32Def( IBusModelPubUInt32DefObj Obj );

	/**
	 *	Move the BusModelPubUInt32DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUInt32DefObj refreshed cache instance.
	 */
	IBusModelPubUInt32DefObj moveDownUInt32Def( IBusModelPubUInt32DefObj Obj );
}
