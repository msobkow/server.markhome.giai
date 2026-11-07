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

public interface IBusModelProtInt64ColTableObj
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
	 *	Instantiate a new Int64Col instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtInt64ColObj newInstance();

	/**
	 *	Instantiate a new Int64Col edition of the specified Int64Col instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtInt64ColEditObj newEditInstance( IBusModelProtInt64ColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtInt64ColObj realiseInt64Col( IBusModelProtInt64ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtInt64ColObj createInt64Col( IBusModelProtInt64ColObj Obj );

	/**
	 *	Read a Int64Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtInt64ColObj readInt64Col( CFDbKeyHash256 pkey );

	/**
	 *	Read a Int64Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int64Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtInt64ColObj readInt64Col( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtInt64ColObj readCachedInt64Col( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeInt64Col( IBusModelProtInt64ColObj obj );

	void deepDisposeInt64Col( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtInt64ColObj lockInt64Col( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Int64Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtInt64ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtInt64ColObj> readAllInt64Col();

	/**
	 *	Return a sorted map of all the Int64Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtInt64ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtInt64ColObj> readAllInt64Col( boolean forceRead );

	List<IBusModelProtInt64ColObj> readCachedAllInt64Col();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtInt64ColObj readInt64ColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtInt64ColObj readInt64ColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtInt64ColObj readInt64ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtInt64ColObj readInt64ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtInt64ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtInt64ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtInt64ColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtInt64ColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtInt64ColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtInt64ColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtInt64ColObj> readInt64ColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelProtValueObj readCachedInt64ColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedInt64ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedInt64ColByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedInt64ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedInt64ColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedInt64ColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedInt64ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedInt64ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtInt64ColObj>> readCachedInt64ColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeInt64ColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeInt64ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeInt64ColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeInt64ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeInt64ColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeInt64ColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeInt64ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeInt64ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeInt64ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtInt64ColObj updateInt64Col( IBusModelProtInt64ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt64Col( IBusModelProtInt64ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int64Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Int64Col key attribute of the instance generating the id.
	 */
	void deleteInt64ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the IBusModelProtInt64ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtInt64ColObj refreshed cache instance.
	 */
	IBusModelProtInt64ColObj moveUpInt64Col( IBusModelProtInt64ColObj Obj );

	/**
	 *	Move the IBusModelProtInt64ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtInt64ColObj refreshed cache instance.
	 */
	IBusModelProtInt64ColObj moveDownInt64Col( IBusModelProtInt64ColObj Obj );
}
