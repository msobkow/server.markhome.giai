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

public interface IBusModelProtUuidColTableObj
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
	 *	Instantiate a new UuidCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtUuidColObj newInstance();

	/**
	 *	Instantiate a new UuidCol edition of the specified UuidCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtUuidColEditObj newEditInstance( IBusModelProtUuidColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuidColObj realiseUuidCol( IBusModelProtUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuidColObj createUuidCol( IBusModelProtUuidColObj Obj );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtUuidColObj readUuidCol( CFDbKeyHash256 pkey );

	/**
	 *	Read a UuidCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtUuidColObj readUuidCol( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtUuidColObj readCachedUuidCol( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeUuidCol( IBusModelProtUuidColObj obj );

	void deepDisposeUuidCol( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuidColObj lockUuidCol( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtUuidColObj> readAllUuidCol();

	/**
	 *	Return a sorted map of all the UuidCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtUuidColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtUuidColObj> readAllUuidCol( boolean forceRead );

	List<IBusModelProtUuidColObj> readCachedAllUuidCol();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuidColObj readUuidColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuidColObj readUuidColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuidColObj readUuidColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUuidColObj readUuidColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtUuidColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUuidColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtUuidColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtUuidColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtUuidColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtUuidColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUuidColObj> readUuidColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelProtValueObj readCachedUuidColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedUuidColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedUuidColByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedUuidColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedUuidColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedUuidColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedUuidColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtUuidColObj>> readCachedUuidColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeUuidColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeUuidColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuidColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUuidColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUuidColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUuidColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUuidColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUuidColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUuidColObj updateUuidCol( IBusModelProtUuidColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidCol( IBusModelProtUuidColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The UuidCol key attribute of the instance generating the id.
	 */
	void deleteUuidColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the IBusModelProtUuidColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtUuidColObj refreshed cache instance.
	 */
	IBusModelProtUuidColObj moveUpUuidCol( IBusModelProtUuidColObj Obj );

	/**
	 *	Move the IBusModelProtUuidColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtUuidColObj refreshed cache instance.
	 */
	IBusModelProtUuidColObj moveDownUuidCol( IBusModelProtUuidColObj Obj );
}
