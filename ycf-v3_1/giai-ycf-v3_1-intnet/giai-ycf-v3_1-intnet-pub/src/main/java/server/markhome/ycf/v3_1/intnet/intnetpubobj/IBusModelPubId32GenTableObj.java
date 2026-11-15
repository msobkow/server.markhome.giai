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

public interface IBusModelPubId32GenTableObj
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
	 *	Instantiate a new Id32Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubId32GenObj newInstance();

	/**
	 *	Instantiate a new Id32Gen edition of the specified Id32Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubId32GenEditObj newEditInstance( IBusModelPubId32GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubId32GenObj realiseId32Gen( IBusModelPubId32GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubId32GenObj createId32Gen( IBusModelPubId32GenObj Obj );

	/**
	 *	Read a Id32Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id32Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubId32GenObj readId32Gen( ICFKeyHash256 pkey );

	/**
	 *	Read a Id32Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id32Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubId32GenObj readId32Gen( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubId32GenObj readCachedId32Gen( ICFKeyHash256 pkey );

	public void reallyDeepDisposeId32Gen( IBusModelPubId32GenObj obj );

	void deepDisposeId32Gen( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubId32GenObj lockId32Gen( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Id32Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubId32GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubId32GenObj> readAllId32Gen();

	/**
	 *	Return a sorted map of all the Id32Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubId32GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubId32GenObj> readAllId32Gen( boolean forceRead );

	List<IBusModelPubId32GenObj> readCachedAllId32Gen();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubId32GenObj readId32GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubId32GenObj readId32GenByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubId32GenObj readId32GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubId32GenObj readId32GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubId32GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubId32GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubId32GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubId32GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubId32GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubId32GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubInt32TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubId32GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId32GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId32GenObj> readId32GenBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubId32GenObj readCachedId32GenByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubId32GenObj readCachedId32GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubId32GenObj> readCachedId32GenByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubId32GenObj> readCachedId32GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubId32GenObj> readCachedId32GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubId32GenObj> readCachedId32GenByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubId32GenObj> readCachedId32GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubId32GenObj> readCachedId32GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubId32GenObj> readCachedId32GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeId32GenByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeId32GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeId32GenByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeId32GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeId32GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeId32GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeId32GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeId32GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeId32GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubId32GenObj updateId32Gen( IBusModelPubId32GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteId32Gen( IBusModelPubId32GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubId32GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubId32GenObj refreshed cache instance.
	 */
	IBusModelPubId32GenObj moveUpId32Gen( IBusModelPubId32GenObj Obj );

	/**
	 *	Move the BusModelPubId32GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubId32GenObj refreshed cache instance.
	 */
	IBusModelPubId32GenObj moveDownId32Gen( IBusModelPubId32GenObj Obj );
}
