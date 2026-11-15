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

public interface IBusModelPubUuid6GenTableObj
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
	 *	Instantiate a new Uuid6Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubUuid6GenObj newInstance();

	/**
	 *	Instantiate a new Uuid6Gen edition of the specified Uuid6Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubUuid6GenEditObj newEditInstance( IBusModelPubUuid6GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuid6GenObj realiseUuid6Gen( IBusModelPubUuid6GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuid6GenObj createUuid6Gen( IBusModelPubUuid6GenObj Obj );

	/**
	 *	Read a Uuid6Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUuid6GenObj readUuid6Gen( ICFKeyHash256 pkey );

	/**
	 *	Read a Uuid6Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUuid6GenObj readUuid6Gen( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubUuid6GenObj readCachedUuid6Gen( ICFKeyHash256 pkey );

	public void reallyDeepDisposeUuid6Gen( IBusModelPubUuid6GenObj obj );

	void deepDisposeUuid6Gen( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuid6GenObj lockUuid6Gen( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Uuid6Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUuid6GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readAllUuid6Gen();

	/**
	 *	Return a sorted map of all the Uuid6Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUuid6GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readAllUuid6Gen( boolean forceRead );

	List<IBusModelPubUuid6GenObj> readCachedAllUuid6Gen();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuid6GenObj readUuid6GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuid6GenObj readUuid6GenByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuid6GenObj readUuid6GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUuid6GenObj readUuid6GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubUuid6GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubUuid6GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUuid6GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUuid6GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUuid6GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUuid6GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubUuid6TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubUuid6GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUuid6GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUuid6GenObj> readUuid6GenBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubUuid6GenObj readCachedUuid6GenByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubUuid6GenObj readCachedUuid6GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubUuid6GenObj> readCachedUuid6GenByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubUuid6GenObj> readCachedUuid6GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubUuid6GenObj> readCachedUuid6GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubUuid6GenObj> readCachedUuid6GenByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubUuid6GenObj> readCachedUuid6GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubUuid6GenObj> readCachedUuid6GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubUuid6GenObj> readCachedUuid6GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeUuid6GenByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeUuid6GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuid6GenByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeUuid6GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUuid6GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUuid6GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUuid6GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUuid6GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUuid6GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUuid6GenObj updateUuid6Gen( IBusModelPubUuid6GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuid6Gen( IBusModelPubUuid6GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByScopeIdx( CFDbKeyHash256 ScopeId );

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
	void deleteUuid6GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Uuid6Gen key attribute of the instance generating the id.
	 */
	void deleteUuid6GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubUuid6GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUuid6GenObj refreshed cache instance.
	 */
	IBusModelPubUuid6GenObj moveUpUuid6Gen( IBusModelPubUuid6GenObj Obj );

	/**
	 *	Move the BusModelPubUuid6GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUuid6GenObj refreshed cache instance.
	 */
	IBusModelPubUuid6GenObj moveDownUuid6Gen( IBusModelPubUuid6GenObj Obj );
}
