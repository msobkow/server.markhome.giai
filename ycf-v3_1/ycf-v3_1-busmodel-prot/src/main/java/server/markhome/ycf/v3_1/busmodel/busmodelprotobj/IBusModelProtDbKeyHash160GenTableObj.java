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

public interface IBusModelProtDbKeyHash160GenTableObj
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
	 *	Instantiate a new DbKeyHash160Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtDbKeyHash160GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash160Gen edition of the specified DbKeyHash160Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtDbKeyHash160GenEditObj newEditInstance( IBusModelProtDbKeyHash160GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash160GenObj realiseDbKeyHash160Gen( IBusModelProtDbKeyHash160GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash160GenObj createDbKeyHash160Gen( IBusModelProtDbKeyHash160GenObj Obj );

	/**
	 *	Read a DbKeyHash160Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash160GenObj readDbKeyHash160Gen( CFDbKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash160Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash160Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash160GenObj readDbKeyHash160Gen( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtDbKeyHash160GenObj readCachedDbKeyHash160Gen( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash160Gen( IBusModelProtDbKeyHash160GenObj obj );

	void deepDisposeDbKeyHash160Gen( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash160GenObj lockDbKeyHash160Gen( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash160Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readAllDbKeyHash160Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash160Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readAllDbKeyHash160Gen( boolean forceRead );

	List<IBusModelProtDbKeyHash160GenObj> readCachedAllDbKeyHash160Gen();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash160GenObj readDbKeyHash160GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash160GenObj readDbKeyHash160GenByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash160GenObj readDbKeyHash160GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash160GenObj readDbKeyHash160GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash160GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash160GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash160GenObj> readDbKeyHash160GenBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedDbKeyHash160GenByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedDbKeyHash160GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash160GenByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash160GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash160GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash160GenByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash160GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash160GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtDbKeyHash160TypeObj>> readCachedDbKeyHash160GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeDbKeyHash160GenByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDbKeyHash160GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash160GenByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDbKeyHash160GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash160GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash160GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash160GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash160GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash160GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash160GenObj updateDbKeyHash160Gen( IBusModelProtDbKeyHash160GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash160Gen( IBusModelProtDbKeyHash160GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The DbKeyHash160Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash160GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtDbKeyHash160GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash160GenObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash160GenObj moveUpDbKeyHash160Gen( IBusModelProtDbKeyHash160GenObj Obj );

	/**
	 *	Move the IBusModelProtDbKeyHash160GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash160GenObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash160GenObj moveDownDbKeyHash160Gen( IBusModelProtDbKeyHash160GenObj Obj );
}
