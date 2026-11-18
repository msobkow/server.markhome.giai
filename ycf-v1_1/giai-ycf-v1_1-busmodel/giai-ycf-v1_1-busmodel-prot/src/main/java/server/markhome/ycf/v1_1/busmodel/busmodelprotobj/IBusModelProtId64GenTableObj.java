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

public interface IBusModelProtId64GenTableObj
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
	 *	Instantiate a new Id64Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtId64GenObj newInstance();

	/**
	 *	Instantiate a new Id64Gen edition of the specified Id64Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtId64GenEditObj newEditInstance( IBusModelProtId64GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtId64GenObj realiseId64Gen( IBusModelProtId64GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtId64GenObj createId64Gen( IBusModelProtId64GenObj Obj );

	/**
	 *	Read a Id64Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id64Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtId64GenObj readId64Gen( CFDbKeyHash256 pkey );

	/**
	 *	Read a Id64Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id64Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtId64GenObj readId64Gen( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtId64GenObj readCachedId64Gen( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeId64Gen( IBusModelProtId64GenObj obj );

	void deepDisposeId64Gen( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtId64GenObj lockId64Gen( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Id64Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtId64GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtId64GenObj> readAllId64Gen();

	/**
	 *	Return a sorted map of all the Id64Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtId64GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtId64GenObj> readAllId64Gen( boolean forceRead );

	List<IBusModelProtId64GenObj> readCachedAllId64Gen();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtId64GenObj readId64GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtId64GenObj readId64GenByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtId64GenObj readId64GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtId64GenObj readId64GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of IBusModelProtId64GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtId64GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtId64GenObj> readId64GenBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedId64GenByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedId64GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedId64GenByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedId64GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedId64GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedId64GenByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedId64GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedId64GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtInt64TypeObj>> readCachedId64GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeId64GenByIdIdx( ICFKeyHash256 Id );

	void deepDisposeId64GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeId64GenByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeId64GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeId64GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeId64GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeId64GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeId64GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeId64GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtId64GenObj updateId64Gen( IBusModelProtId64GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteId64Gen( IBusModelProtId64GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtId64GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtId64GenObj refreshed cache instance.
	 */
	IBusModelProtId64GenObj moveUpId64Gen( IBusModelProtId64GenObj Obj );

	/**
	 *	Move the IBusModelProtId64GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtId64GenObj refreshed cache instance.
	 */
	IBusModelProtId64GenObj moveDownId64Gen( IBusModelProtId64GenObj Obj );
}
