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

package server.markhome.ycf.v3_1.busmodel.busmodelpubobj;

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

public interface IBusModelPubDbKeyHash224GenTableObj
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
	 *	Instantiate a new DbKeyHash224Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDbKeyHash224GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash224Gen edition of the specified DbKeyHash224Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDbKeyHash224GenEditObj newEditInstance( IBusModelPubDbKeyHash224GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash224GenObj realiseDbKeyHash224Gen( IBusModelPubDbKeyHash224GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash224GenObj createDbKeyHash224Gen( IBusModelPubDbKeyHash224GenObj Obj );

	/**
	 *	Read a DbKeyHash224Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash224GenObj readDbKeyHash224Gen( ICFKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash224Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDbKeyHash224GenObj readDbKeyHash224Gen( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDbKeyHash224GenObj readCachedDbKeyHash224Gen( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash224Gen( IBusModelPubDbKeyHash224GenObj obj );

	void deepDisposeDbKeyHash224Gen( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash224GenObj lockDbKeyHash224Gen( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash224Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash224GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readAllDbKeyHash224Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash224Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDbKeyHash224GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readAllDbKeyHash224Gen( boolean forceRead );

	List<IBusModelPubDbKeyHash224GenObj> readCachedAllDbKeyHash224Gen();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash224GenObj readDbKeyHash224GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash224GenObj readDbKeyHash224GenByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash224GenObj readDbKeyHash224GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDbKeyHash224GenObj readDbKeyHash224GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubDbKeyHash224GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDbKeyHash224GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDbKeyHash224GenObj> readDbKeyHash224GenBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubDbKeyHash224GenObj readCachedDbKeyHash224GenByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDbKeyHash224GenObj readCachedDbKeyHash224GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDbKeyHash224GenObj> readCachedDbKeyHash224GenByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDbKeyHash224GenObj> readCachedDbKeyHash224GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDbKeyHash224GenObj> readCachedDbKeyHash224GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash224GenObj> readCachedDbKeyHash224GenByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash224GenObj> readCachedDbKeyHash224GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDbKeyHash224GenObj> readCachedDbKeyHash224GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubDbKeyHash224GenObj> readCachedDbKeyHash224GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeDbKeyHash224GenByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDbKeyHash224GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash224GenByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDbKeyHash224GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash224GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash224GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash224GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash224GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash224GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDbKeyHash224GenObj updateDbKeyHash224Gen( IBusModelPubDbKeyHash224GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash224Gen( IBusModelPubDbKeyHash224GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The DbKeyHash224Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224GenBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubDbKeyHash224GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash224GenObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash224GenObj moveUpDbKeyHash224Gen( IBusModelPubDbKeyHash224GenObj Obj );

	/**
	 *	Move the BusModelPubDbKeyHash224GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDbKeyHash224GenObj refreshed cache instance.
	 */
	IBusModelPubDbKeyHash224GenObj moveDownDbKeyHash224Gen( IBusModelPubDbKeyHash224GenObj Obj );
}
