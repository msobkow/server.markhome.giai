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

public interface IBusModelProtDbKeyHash256ColTableObj
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
	 *	Instantiate a new DbKeyHash256Col instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtDbKeyHash256ColObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash256Col edition of the specified DbKeyHash256Col instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtDbKeyHash256ColEditObj newEditInstance( IBusModelProtDbKeyHash256ColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash256ColObj realiseDbKeyHash256Col( IBusModelProtDbKeyHash256ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash256ColObj createDbKeyHash256Col( IBusModelProtDbKeyHash256ColObj Obj );

	/**
	 *	Read a DbKeyHash256Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash256ColObj readDbKeyHash256Col( CFDbKeyHash256 pkey );

	/**
	 *	Read a DbKeyHash256Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash256Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDbKeyHash256ColObj readDbKeyHash256Col( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtDbKeyHash256ColObj readCachedDbKeyHash256Col( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeDbKeyHash256Col( IBusModelProtDbKeyHash256ColObj obj );

	void deepDisposeDbKeyHash256Col( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash256ColObj lockDbKeyHash256Col( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash256Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readAllDbKeyHash256Col();

	/**
	 *	Return a sorted map of all the DbKeyHash256Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readAllDbKeyHash256Col( boolean forceRead );

	List<IBusModelProtDbKeyHash256ColObj> readCachedAllDbKeyHash256Col();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash256ColObj readDbKeyHash256ColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash256ColObj readDbKeyHash256ColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash256ColObj readDbKeyHash256ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDbKeyHash256ColObj readDbKeyHash256ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDbKeyHash256ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDbKeyHash256ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtDbKeyHash256ColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtDbKeyHash256ColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtDbKeyHash256ColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtDbKeyHash256ColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDbKeyHash256ColObj> readDbKeyHash256ColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelProtValueObj readCachedDbKeyHash256ColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedDbKeyHash256ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash256ColByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash256ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDbKeyHash256ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtDbKeyHash256ColObj>> readCachedDbKeyHash256ColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeDbKeyHash256ColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDbKeyHash256ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDbKeyHash256ColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash256ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDbKeyHash256ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDbKeyHash256ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDbKeyHash256ColObj updateDbKeyHash256Col( IBusModelProtDbKeyHash256ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash256Col( IBusModelProtDbKeyHash256ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DbKeyHash256Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DbKeyHash256Col key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash256ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the IBusModelProtDbKeyHash256ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash256ColObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash256ColObj moveUpDbKeyHash256Col( IBusModelProtDbKeyHash256ColObj Obj );

	/**
	 *	Move the IBusModelProtDbKeyHash256ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDbKeyHash256ColObj refreshed cache instance.
	 */
	IBusModelProtDbKeyHash256ColObj moveDownDbKeyHash256Col( IBusModelProtDbKeyHash256ColObj Obj );
}
