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

public interface IBusModelProtIndexColTableObj
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
	 *	Instantiate a new IndexCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtIndexColObj newInstance();

	/**
	 *	Instantiate a new IndexCol edition of the specified IndexCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtIndexColEditObj newEditInstance( IBusModelProtIndexColObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelProtIndexColEditObj instance, which may be a subclass of a IndexCol instance.
	 */
	IBusModelProtIndexColObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexColObj realiseIndexCol( IBusModelProtIndexColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexColObj createIndexCol( IBusModelProtIndexColObj Obj );

	/**
	 *	Read a IndexCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtIndexColObj readIndexCol( CFDbKeyHash256 pkey );

	/**
	 *	Read a IndexCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtIndexColObj readIndexCol( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtIndexColObj readCachedIndexCol( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeIndexCol( IBusModelProtIndexColObj obj );

	void deepDisposeIndexCol( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexColObj lockIndexCol( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the IndexCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtIndexColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtIndexColObj> readAllIndexCol();

	/**
	 *	Return a sorted map of all the IndexCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtIndexColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtIndexColObj> readAllIndexCol( boolean forceRead );

	List<IBusModelProtIndexColObj> readCachedAllIndexCol();

	/**
	 *	Get the IBusModelProtIndexColObj instance for the primary key attributes.
	 *
	 *	@param	Id	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtIndexColObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexColObj readIndexColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtIndexColObj instance for the primary key attributes.
	 *
	 *	@param	Id	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtIndexColObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexColObj readIndexColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtIndexColObj instance for the unique UNameIdx key.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtIndexColObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexColObj readIndexColByUNameIdx(ICFKeyHash256 IndexId,
		String Name );

	/**
	 *	Get the IBusModelProtIndexColObj instance for the unique UNameIdx key.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtIndexColObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexColObj readIndexColByUNameIdx(ICFKeyHash256 IndexId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByIndexIdx( ICFKeyHash256 IndexId );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByIndexIdx( ICFKeyHash256 IndexId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate ColIdx key.
	 *
	 *	@param	ColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate ColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByColIdx( ICFKeyHash256 ColumnId );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate ColIdx key.
	 *
	 *	@param	ColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate ColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByColIdx( ICFKeyHash256 ColumnId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate IdxPrevIdx key.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate IdxPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByIdxPrevIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate IdxPrevIdx key.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate IdxPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByIdxPrevIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate IdxNextIdx key.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate IdxNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByIdxNextIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of List<IBusModelProtIndexColObj> instances sorted by their primary keys for the duplicate IdxNextIdx key.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexColObj> cached instances sorted by their primary keys for the duplicate IdxNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexColObj> readIndexColByIdxNextIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtIndexColObj readCachedIndexColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtIndexColObj readCachedIndexColByUNameIdx( ICFKeyHash256 IndexId,
		String Name );

	List<List<IBusModelProtIndexColObj>> readCachedIndexColByIndexIdx( ICFKeyHash256 IndexId );

	List<List<IBusModelProtIndexColObj>> readCachedIndexColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtIndexColObj>> readCachedIndexColByColIdx( ICFKeyHash256 ColumnId );

	List<List<IBusModelProtIndexColObj>> readCachedIndexColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtIndexColObj>> readCachedIndexColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtIndexColObj>> readCachedIndexColByIdxPrevIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtIndexColObj>> readCachedIndexColByIdxNextIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 NextId );

	void deepDisposeIndexColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeIndexColByUNameIdx( ICFKeyHash256 IndexId,
		String Name );

	void deepDisposeIndexColByIndexIdx( ICFKeyHash256 IndexId );

	void deepDisposeIndexColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeIndexColByColIdx( ICFKeyHash256 ColumnId );

	void deepDisposeIndexColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeIndexColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeIndexColByIdxPrevIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 PrevId );

	void deepDisposeIndexColByIdxNextIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexColObj updateIndexCol( IBusModelProtIndexColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndexCol( IBusModelProtIndexColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByUNameIdx(ICFKeyHash256 IndexId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIndexIdx( ICFKeyHash256 IndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ColumnId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByColIdx( ICFKeyHash256 ColumnId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxPrevIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxNextIdx( ICFKeyHash256 IndexId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtIndexColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtIndexColObj refreshed cache instance.
	 */
	IBusModelProtIndexColObj moveUpIndexCol( IBusModelProtIndexColObj Obj );

	/**
	 *	Move the IBusModelProtIndexColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtIndexColObj refreshed cache instance.
	 */
	IBusModelProtIndexColObj moveDownIndexCol( IBusModelProtIndexColObj Obj );
}
