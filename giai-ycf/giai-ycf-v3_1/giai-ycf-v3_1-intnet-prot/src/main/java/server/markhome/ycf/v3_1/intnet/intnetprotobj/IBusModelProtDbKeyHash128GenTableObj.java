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

public interface IBusModelProtDbKeyHash128GenTableObj
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
	 *	Instantiate a new DbKeyHash128Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtDbKeyHash128GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash128Gen edition of the specified DbKeyHash128Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtDbKeyHash128GenEditObj newEditInstance( IBusModelProtDbKeyHash128GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash128GenObj realiseDbKeyHash128Gen( IBusModelProtDbKeyHash128GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash128GenObj createDbKeyHash128Gen( IBusModelProtDbKeyHash128GenObj Obj );

	/**
	 *	Read a DbKeyHash128Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash128GenObj readDbKeyHash128Gen( CFDbKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash128Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash128GenObj readDbKeyHash128Gen( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtDbKeyHash128GenObj readCachedDbKeyHash128Gen( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash128Gen( IBusModelProtDbKeyHash128GenObj obj );

	void deepDisposeDbKeyHash128Gen( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash128GenObj lockDbKeyHash128Gen( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash128Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readAllDbKeyHash128Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash128Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readAllDbKeyHash128Gen( boolean forceRead );

	List<IBusModelProtDbKeyHash128GenObj> readCachedAllDbKeyHash128Gen();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash128GenObj readDbKeyHash128GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash128GenObj readDbKeyHash128GenByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash128GenObj readDbKeyHash128GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash128GenObj readDbKeyHash128GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash128GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash128GenObj> readDbKeyHash128GenBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedDbKeyHash128GenByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedDbKeyHash128GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash128GenByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash128GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash128GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash128GenByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash128GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash128GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtDbKeyHash128TypeObj>> readCachedDbKeyHash128GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeDbKeyHash128GenByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDbKeyHash128GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash128GenByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDbKeyHash128GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash128GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash128GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash128GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash128GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash128GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash128GenObj updateDbKeyHash128Gen( IBusModelProtDbKeyHash128GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash128Gen( IBusModelProtDbKeyHash128GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByScopeIdx( ICFKeyHash256 ScopeId );

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
	void deleteDbKeyHash128GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtDbKeyHash128GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash128GenObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash128GenObj moveUpDbKeyHash128Gen( IBusModelProtDbKeyHash128GenObj Obj );

	/**
	 *	Move the IBusModelProtDbKeyHash128GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash128GenObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash128GenObj moveDownDbKeyHash128Gen( IBusModelProtDbKeyHash128GenObj Obj );
}
