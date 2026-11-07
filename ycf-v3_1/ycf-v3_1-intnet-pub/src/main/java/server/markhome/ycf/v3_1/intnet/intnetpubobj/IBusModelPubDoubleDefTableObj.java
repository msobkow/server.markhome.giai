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

public interface IBusModelPubDoubleDefTableObj
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
	 *	Instantiate a new DoubleDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDoubleDefObj newInstance();

	/**
	 *	Instantiate a new DoubleDef edition of the specified DoubleDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDoubleDefEditObj newEditInstance( IBusModelPubDoubleDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDoubleDefObj realiseDoubleDef( IBusModelPubDoubleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDoubleDefObj createDoubleDef( IBusModelPubDoubleDefObj Obj );

	/**
	 *	Read a DoubleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDoubleDefObj readDoubleDef( ICFKeyHash256 pkey );

	/**
	 *	Read a DoubleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDoubleDefObj readDoubleDef( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDoubleDefObj readCachedDoubleDef( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDoubleDef( IBusModelPubDoubleDefObj obj );

	void deepDisposeDoubleDef( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDoubleDefObj lockDoubleDef( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DoubleDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDoubleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readAllDoubleDef();

	/**
	 *	Return a sorted map of all the DoubleDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDoubleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readAllDoubleDef( boolean forceRead );

	List<IBusModelPubDoubleDefObj> readCachedAllDoubleDef();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDoubleDefObj readDoubleDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDoubleDefObj readDoubleDefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDoubleDefObj readDoubleDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDoubleDefObj readDoubleDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDoubleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDoubleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDoubleDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDoubleDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDoubleDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDoubleDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleDefObj> readDoubleDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubDoubleDefObj readCachedDoubleDefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDoubleDefObj readCachedDoubleDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDoubleDefObj> readCachedDoubleDefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDoubleDefObj> readCachedDoubleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDoubleDefObj> readCachedDoubleDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDoubleDefObj> readCachedDoubleDefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDoubleDefObj> readCachedDoubleDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDoubleDefObj> readCachedDoubleDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDoubleDefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDoubleDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDoubleDefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDoubleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDoubleDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDoubleDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDoubleDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDoubleDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDoubleDefObj updateDoubleDef( IBusModelPubDoubleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDoubleDef( IBusModelPubDoubleDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubDoubleDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDoubleDefObj refreshed cache instance.
	 */
	IBusModelPubDoubleDefObj moveUpDoubleDef( IBusModelPubDoubleDefObj Obj );

	/**
	 *	Move the BusModelPubDoubleDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDoubleDefObj refreshed cache instance.
	 */
	IBusModelPubDoubleDefObj moveDownDoubleDef( IBusModelPubDoubleDefObj Obj );
}
