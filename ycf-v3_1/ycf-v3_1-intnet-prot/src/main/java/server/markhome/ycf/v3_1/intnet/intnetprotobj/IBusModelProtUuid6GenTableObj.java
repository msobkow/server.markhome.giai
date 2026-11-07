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

public interface IBusModelProtUuid6GenTableObj
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
	 *	Instantiate a new Uuid6Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtUuid6GenObj newInstance();

	/**
	 *	Instantiate a new Uuid6Gen edition of the specified Uuid6Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtUuid6GenEditObj newEditInstance( IBusModelProtUuid6GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuid6GenObj realiseUuid6Gen( IBusModelProtUuid6GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuid6GenObj createUuid6Gen( IBusModelProtUuid6GenObj Obj );

	/**
	 *	Read a Uuid6Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtUuid6GenObj readUuid6Gen( CFDbKeyHash256 pkey );

	/**
	 *	Read a Uuid6Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtUuid6GenObj readUuid6Gen( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtUuid6GenObj readCachedUuid6Gen( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeUuid6Gen( IBusModelProtUuid6GenObj obj );

	void deepDisposeUuid6Gen( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuid6GenObj lockUuid6Gen( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Uuid6Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readAllUuid6Gen();

	/**
	 *	Return a sorted map of all the Uuid6Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readAllUuid6Gen( boolean forceRead );

	List<IBusModelProtUuid6GenObj> readCachedAllUuid6Gen();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuid6GenObj readUuid6GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuid6GenObj readUuid6GenByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuid6GenObj readUuid6GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuid6GenObj readUuid6GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of IBusModelProtUuid6GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuid6GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuid6GenObj> readUuid6GenBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedUuid6GenByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedUuid6GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedUuid6GenByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedUuid6GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedUuid6GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedUuid6GenByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedUuid6GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedUuid6GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtUuid6TypeObj>> readCachedUuid6GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeUuid6GenByIdIdx( ICFKeyHash256 Id );

	void deepDisposeUuid6GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuid6GenByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeUuid6GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUuid6GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUuid6GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUuid6GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUuid6GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUuid6GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuid6GenObj updateUuid6Gen( IBusModelProtUuid6GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuid6Gen( IBusModelProtUuid6GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtUuid6GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtUuid6GenObj refreshed cache instance.
	 */
	IBusModelProtUuid6GenObj moveUpUuid6Gen( IBusModelProtUuid6GenObj Obj );

	/**
	 *	Move the IBusModelProtUuid6GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtUuid6GenObj refreshed cache instance.
	 */
	IBusModelProtUuid6GenObj moveDownUuid6Gen( IBusModelProtUuid6GenObj Obj );
}
