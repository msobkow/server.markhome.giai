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

package server.markhome.ycf.v3_1.busmodel.busmodelprotobj;

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

public interface IBusModelProtUuidDefTableObj
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
	 *	Instantiate a new UuidDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtUuidDefObj newInstance();

	/**
	 *	Instantiate a new UuidDef edition of the specified UuidDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtUuidDefEditObj newEditInstance( IBusModelProtUuidDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuidDefObj realiseUuidDef( IBusModelProtUuidDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuidDefObj createUuidDef( IBusModelProtUuidDefObj Obj );

	/**
	 *	Read a UuidDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtUuidDefObj readUuidDef( CFDbKeyHash256 pkey );

	/**
	 *	Read a UuidDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtUuidDefObj readUuidDef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtUuidDefObj readCachedUuidDef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeUuidDef( IBusModelProtUuidDefObj obj );

	void deepDisposeUuidDef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuidDefObj lockUuidDef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the UuidDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtUuidDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtUuidDefObj> readAllUuidDef();

	/**
	 *	Return a sorted map of all the UuidDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtUuidDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtUuidDefObj> readAllUuidDef( boolean forceRead );

	List<IBusModelProtUuidDefObj> readCachedAllUuidDef();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuidDefObj readUuidDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuidDefObj readUuidDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuidDefObj readUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuidDefObj readUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtUuidDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidDefObj> readUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtValueObj readCachedUuidDefByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedUuidDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedUuidDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedUuidDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedUuidDefByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUuidDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuidDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeUuidDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUuidDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUuidDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuidDefObj updateUuidDef( IBusModelProtUuidDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidDef( IBusModelProtUuidDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtUuidDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtUuidDefObj refreshed cache instance.
	 */
	IBusModelProtUuidDefObj moveUpUuidDef( IBusModelProtUuidDefObj Obj );

	/**
	 *	Move the IBusModelProtUuidDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtUuidDefObj refreshed cache instance.
	 */
	IBusModelProtUuidDefObj moveDownUuidDef( IBusModelProtUuidDefObj Obj );
}
