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

public interface IBusModelProtDbKeyHash224TypeTableObj
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
	 *	Instantiate a new DbKeyHash224Type instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtDbKeyHash224TypeObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash224Type edition of the specified DbKeyHash224Type instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtDbKeyHash224TypeEditObj newEditInstance( IBusModelProtDbKeyHash224TypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash224TypeObj realiseDbKeyHash224Type( IBusModelProtDbKeyHash224TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash224TypeObj createDbKeyHash224Type( IBusModelProtDbKeyHash224TypeObj Obj );

	/**
	 *	Read a DbKeyHash224Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash224TypeObj readDbKeyHash224Type( CFDbKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash224Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash224TypeObj readDbKeyHash224Type( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtDbKeyHash224TypeObj readCachedDbKeyHash224Type( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash224Type( IBusModelProtDbKeyHash224TypeObj obj );

	void deepDisposeDbKeyHash224Type( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash224TypeObj lockDbKeyHash224Type( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash224Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readAllDbKeyHash224Type();

	/**
	 *	Return a sorted map of all the DbKeyHash224Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readAllDbKeyHash224Type( boolean forceRead );

	List<IBusModelProtDbKeyHash224TypeObj> readCachedAllDbKeyHash224Type();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash224TypeObj readDbKeyHash224TypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash224TypeObj readDbKeyHash224TypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash224TypeObj readDbKeyHash224TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash224TypeObj readDbKeyHash224TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtDbKeyHash224TypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtDbKeyHash224TypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<IBusModelProtDbKeyHash224TypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtDbKeyHash224TypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash224TypeObj> readDbKeyHash224TypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedDbKeyHash224TypeByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedDbKeyHash224TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash224TypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash224TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash224TypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash224TypeByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash224TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash224TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtDbKeyHash224TypeObj>> readCachedDbKeyHash224TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeDbKeyHash224TypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDbKeyHash224TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash224TypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDbKeyHash224TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash224TypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash224TypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash224TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash224TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash224TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash224TypeObj updateDbKeyHash224Type( IBusModelProtDbKeyHash224TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash224Type( IBusModelProtDbKeyHash224TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtDbKeyHash224TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash224TypeObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash224TypeObj moveUpDbKeyHash224Type( IBusModelProtDbKeyHash224TypeObj Obj );

	/**
	 *	Move the IBusModelProtDbKeyHash224TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash224TypeObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash224TypeObj moveDownDbKeyHash224Type( IBusModelProtDbKeyHash224TypeObj Obj );
}
