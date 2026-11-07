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

public interface IBusModelProtDbKeyHash384GenTableObj
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
	 *	Instantiate a new DbKeyHash384Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtDbKeyHash384GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash384Gen edition of the specified DbKeyHash384Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtDbKeyHash384GenEditObj newEditInstance( IBusModelProtDbKeyHash384GenObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash384GenObj realiseDbKeyHash384Gen( IBusModelProtDbKeyHash384GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash384GenObj createDbKeyHash384Gen( IBusModelProtDbKeyHash384GenObj Obj );

	/**
	 *	Read a DbKeyHash384Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash384Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash384GenObj readDbKeyHash384Gen( CFDbKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash384Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash384Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash384GenObj readDbKeyHash384Gen( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtDbKeyHash384GenObj readCachedDbKeyHash384Gen( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash384Gen( IBusModelProtDbKeyHash384GenObj obj );

	void deepDisposeDbKeyHash384Gen( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash384GenObj lockDbKeyHash384Gen( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash384Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readAllDbKeyHash384Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash384Gen-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readAllDbKeyHash384Gen( boolean forceRead );

	List<IBusModelProtDbKeyHash384GenObj> readCachedAllDbKeyHash384Gen();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash384GenObj readDbKeyHash384GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash384GenObj readDbKeyHash384GenByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash384GenObj readDbKeyHash384GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash384GenObj readDbKeyHash384GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash384GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash384GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash384GenObj> readDbKeyHash384GenBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedDbKeyHash384GenByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedDbKeyHash384GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash384GenByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash384GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash384GenByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash384GenByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash384GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash384GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtDbKeyHash384TypeObj>> readCachedDbKeyHash384GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeDbKeyHash384GenByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDbKeyHash384GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash384GenByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDbKeyHash384GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash384GenByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash384GenByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash384GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash384GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash384GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash384GenObj updateDbKeyHash384Gen( IBusModelProtDbKeyHash384GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash384Gen( IBusModelProtDbKeyHash384GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The DbKeyHash384Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash384GenBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtDbKeyHash384GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash384GenObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash384GenObj moveUpDbKeyHash384Gen( IBusModelProtDbKeyHash384GenObj Obj );

	/**
	 *	Move the IBusModelProtDbKeyHash384GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash384GenObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash384GenObj moveDownDbKeyHash384Gen( IBusModelProtDbKeyHash384GenObj Obj );
}
