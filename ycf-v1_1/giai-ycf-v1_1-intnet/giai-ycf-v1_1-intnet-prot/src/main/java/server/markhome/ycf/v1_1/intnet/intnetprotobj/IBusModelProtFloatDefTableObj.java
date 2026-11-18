// Description: Java 25 Protected Table Object interface for BusModelProt.

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

package server.markhome.ycf.v3_1.intnet.intnetprotobj;

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
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

public interface IBusModelProtFloatDefTableObj
{
	public IBusModelProtSchemaObj getSchema();
	public void setSchema( IBusModelProtSchemaObj value );

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
	 *	Instantiate a new FloatDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtFloatDefObj newInstance();

	/**
	 *	Instantiate a new FloatDef edition of the specified FloatDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtFloatDefEditObj newEditInstance( IBusModelProtFloatDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtFloatDefObj realiseFloatDef( IBusModelProtFloatDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtFloatDefObj createFloatDef( IBusModelProtFloatDefObj Obj );

	/**
	 *	Read a FloatDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtFloatDefObj readFloatDef( CFDbKeyHash256 pkey );

	/**
	 *	Read a FloatDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtFloatDefObj readFloatDef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtFloatDefObj readCachedFloatDef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeFloatDef( IBusModelProtFloatDefObj obj );

	void deepDisposeFloatDef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtFloatDefObj lockFloatDef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the FloatDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtFloatDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtFloatDefObj> readAllFloatDef();

	/**
	 *	Return a sorted map of all the FloatDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtFloatDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtFloatDefObj> readAllFloatDef( boolean forceRead );

	List<IBusModelProtFloatDefObj> readCachedAllFloatDef();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtFloatDefObj readFloatDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtFloatDefObj readFloatDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtFloatDefObj readFloatDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtFloatDefObj readFloatDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtFloatDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtFloatDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtFloatDefObj> readFloatDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtValueObj readCachedFloatDefByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedFloatDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedFloatDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedFloatDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedFloatDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedFloatDefByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedFloatDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedFloatDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeFloatDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeFloatDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeFloatDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeFloatDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeFloatDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeFloatDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeFloatDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeFloatDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtFloatDefObj updateFloatDef( IBusModelProtFloatDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatDef( IBusModelProtFloatDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtFloatDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtFloatDefObj refreshed cache instance.
	 */
	IBusModelProtFloatDefObj moveUpFloatDef( IBusModelProtFloatDefObj Obj );

	/**
	 *	Move the IBusModelProtFloatDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtFloatDefObj refreshed cache instance.
	 */
	IBusModelProtFloatDefObj moveDownFloatDef( IBusModelProtFloatDefObj Obj );
}
