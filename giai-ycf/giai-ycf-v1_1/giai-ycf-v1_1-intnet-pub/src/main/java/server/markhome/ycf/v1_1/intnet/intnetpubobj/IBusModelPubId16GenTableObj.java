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

public interface IBusModelPubId16GenTableObj
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
	 *	Instantiate a new Id16Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubId16GenObj newInstance();

	/**
	 *	Instantiate a new Id16Gen edition of the specified Id16Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubId16GenEditObj newEditInstance( IBusModelPubId16GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubId16GenObj realiseId16Gen( IBusModelPubId16GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubId16GenObj createId16Gen( IBusModelPubId16GenObj Obj );

	/**
	 *	Read a Id16Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id16Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubId16GenObj readId16Gen( ICFKeyHash256 pkey );

	/**
	 *	Read a Id16Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id16Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubId16GenObj readId16Gen( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubId16GenObj readCachedId16Gen( ICFKeyHash256 pkey );

	public void reallyDeepDisposeId16Gen( IBusModelPubId16GenObj obj );

	void deepDisposeId16Gen( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubId16GenObj lockId16Gen( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Id16Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubId16GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubId16GenObj> readAllId16Gen();

	/**
	 *	Return a sorted map of all the Id16Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubId16GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubId16GenObj> readAllId16Gen( boolean forceRead );

	List<IBusModelPubId16GenObj> readCachedAllId16Gen();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubId16GenObj readId16GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubId16GenObj readId16GenByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubId16GenObj readId16GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubId16GenObj readId16GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubId16GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubId16GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubId16GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubId16GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubId16GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubId16GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubId16GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubId16GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubId16GenObj> readId16GenBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubId16GenObj readCachedId16GenByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubId16GenObj readCachedId16GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubId16GenObj> readCachedId16GenByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubId16GenObj> readCachedId16GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubId16GenObj> readCachedId16GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubId16GenObj> readCachedId16GenByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubId16GenObj> readCachedId16GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubId16GenObj> readCachedId16GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubId16GenObj> readCachedId16GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeId16GenByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeId16GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeId16GenByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeId16GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeId16GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeId16GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeId16GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeId16GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeId16GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubId16GenObj updateId16Gen( IBusModelPubId16GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteId16Gen( IBusModelPubId16GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubId16GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubId16GenObj refreshed cache instance.
	 */
	IBusModelPubId16GenObj moveUpId16Gen( IBusModelPubId16GenObj Obj );

	/**
	 *	Move the BusModelPubId16GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubId16GenObj refreshed cache instance.
	 */
	IBusModelPubId16GenObj moveDownId16Gen( IBusModelPubId16GenObj Obj );
}
