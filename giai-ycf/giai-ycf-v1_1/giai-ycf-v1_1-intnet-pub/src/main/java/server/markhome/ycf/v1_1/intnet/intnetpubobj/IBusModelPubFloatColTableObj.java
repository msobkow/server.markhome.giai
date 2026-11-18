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

public interface IBusModelPubFloatColTableObj
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
	 *	Instantiate a new FloatCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubFloatColObj newInstance();

	/**
	 *	Instantiate a new FloatCol edition of the specified FloatCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubFloatColEditObj newEditInstance( IBusModelPubFloatColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubFloatColObj realiseFloatCol( IBusModelPubFloatColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubFloatColObj createFloatCol( IBusModelPubFloatColObj Obj );

	/**
	 *	Read a FloatCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubFloatColObj readFloatCol( ICFKeyHash256 pkey );

	/**
	 *	Read a FloatCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubFloatColObj readFloatCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubFloatColObj readCachedFloatCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeFloatCol( IBusModelPubFloatColObj obj );

	void deepDisposeFloatCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubFloatColObj lockFloatCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the FloatCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubFloatColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubFloatColObj> readAllFloatCol();

	/**
	 *	Return a sorted map of all the FloatCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubFloatColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubFloatColObj> readAllFloatCol( boolean forceRead );

	List<IBusModelPubFloatColObj> readCachedAllFloatCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubFloatColObj readFloatColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubFloatColObj readFloatColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubFloatColObj readFloatColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubFloatColObj readFloatColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubFloatColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubFloatColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubFloatColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubFloatColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubFloatColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubFloatColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubFloatColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubFloatColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubFloatColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubFloatColObj> readFloatColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubFloatColObj readCachedFloatColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubFloatColObj readCachedFloatColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubFloatColObj> readCachedFloatColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubFloatColObj> readCachedFloatColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubFloatColObj> readCachedFloatColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubFloatColObj> readCachedFloatColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubFloatColObj> readCachedFloatColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubFloatColObj> readCachedFloatColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubFloatColObj> readCachedFloatColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeFloatColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeFloatColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeFloatColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeFloatColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeFloatColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeFloatColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeFloatColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeFloatColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeFloatColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubFloatColObj updateFloatCol( IBusModelPubFloatColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatCol( IBusModelPubFloatColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubFloatColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubFloatColObj refreshed cache instance.
	 */
	IBusModelPubFloatColObj moveUpFloatCol( IBusModelPubFloatColObj Obj );

	/**
	 *	Move the BusModelPubFloatColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubFloatColObj refreshed cache instance.
	 */
	IBusModelPubFloatColObj moveDownFloatCol( IBusModelPubFloatColObj Obj );
}
