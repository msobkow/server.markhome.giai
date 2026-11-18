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

public interface IBusModelPubDbKeyHash128GenTableObj
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
	 *	Instantiate a new DbKeyHash128Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDbKeyHash128GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash128Gen edition of the specified DbKeyHash128Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDbKeyHash128GenEditObj newEditInstance( IBusModelPubDbKeyHash128GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash128GenObj realiseDbKeyHash128Gen( IBusModelPubDbKeyHash128GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash128GenObj createDbKeyHash128Gen( IBusModelPubDbKeyHash128GenObj Obj );

	/**
	 *	Read a DbKeyHash128Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash128GenObj readDbKeyHash128Gen( ICFKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash128Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash128GenObj readDbKeyHash128Gen( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDbKeyHash128GenObj readCachedDbKeyHash128Gen( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash128Gen( IBusModelPubDbKeyHash128GenObj obj );

	void deepDisposeDbKeyHash128Gen( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash128GenObj lockDbKeyHash128Gen( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash128Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash128GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readAllDbKeyHash128Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash128Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash128GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readAllDbKeyHash128Gen( boolean forceRead );

	List<IBusModelPubDbKeyHash128GenObj> readCachedAllDbKeyHash128Gen();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash128GenObj readDbKeyHash128GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash128GenObj readDbKeyHash128GenByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash128GenObj readDbKeyHash128GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash128GenObj readDbKeyHash128GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDbKeyHash128TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubDbKeyHash128GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash128GenObj> readDbKeyHash128GenBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubDbKeyHash128GenObj readCachedDbKeyHash128GenByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDbKeyHash128GenObj readCachedDbKeyHash128GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDbKeyHash128GenObj> readCachedDbKeyHash128GenByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDbKeyHash128GenObj> readCachedDbKeyHash128GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDbKeyHash128GenObj> readCachedDbKeyHash128GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash128GenObj> readCachedDbKeyHash128GenByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash128GenObj> readCachedDbKeyHash128GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash128GenObj> readCachedDbKeyHash128GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash128GenObj> readCachedDbKeyHash128GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeDbKeyHash128GenByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDbKeyHash128GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash128GenByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDbKeyHash128GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash128GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash128GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash128GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash128GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash128GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash128GenObj updateDbKeyHash128Gen( IBusModelPubDbKeyHash128GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash128Gen( IBusModelPubDbKeyHash128GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubDbKeyHash128GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash128GenObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash128GenObj moveUpDbKeyHash128Gen( IBusModelPubDbKeyHash128GenObj Obj );

	/**
	 *	Move the BusModelPubDbKeyHash128GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash128GenObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash128GenObj moveDownDbKeyHash128Gen( IBusModelPubDbKeyHash128GenObj Obj );
}
