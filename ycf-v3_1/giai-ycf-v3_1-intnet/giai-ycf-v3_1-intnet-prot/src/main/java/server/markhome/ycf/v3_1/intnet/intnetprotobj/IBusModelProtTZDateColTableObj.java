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

public interface IBusModelProtTZDateColTableObj
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
	 *	Instantiate a new TZDateCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTZDateColObj newInstance();

	/**
	 *	Instantiate a new TZDateCol edition of the specified TZDateCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTZDateColEditObj newEditInstance( IBusModelProtTZDateColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTZDateColObj realiseTZDateCol( IBusModelProtTZDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTZDateColObj createTZDateCol( IBusModelProtTZDateColObj Obj );

	/**
	 *	Read a TZDateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTZDateColObj readTZDateCol( CFDbKeyHash256 pkey );

	/**
	 *	Read a TZDateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTZDateColObj readTZDateCol( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTZDateColObj readCachedTZDateCol( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTZDateCol( IBusModelProtTZDateColObj obj );

	void deepDisposeTZDateCol( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTZDateColObj lockTZDateCol( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TZDateCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTZDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTZDateColObj> readAllTZDateCol();

	/**
	 *	Return a sorted map of all the TZDateCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTZDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTZDateColObj> readAllTZDateCol( boolean forceRead );

	List<IBusModelProtTZDateColObj> readCachedAllTZDateCol();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTZDateColObj readTZDateColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTZDateColObj readTZDateColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTZDateColObj readTZDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTZDateColObj readTZDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTZDateColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTZDateColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTZDateColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtTZDateColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTZDateColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZDateColObj> readTZDateColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelProtValueObj readCachedTZDateColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedTZDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedTZDateColByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedTZDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedTZDateColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTZDateColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedTZDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTZDateColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtTZDateColObj>> readCachedTZDateColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeTZDateColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTZDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTZDateColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTZDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTZDateColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTZDateColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTZDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTZDateColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTZDateColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTZDateColObj updateTZDateCol( IBusModelProtTZDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZDateCol( IBusModelProtTZDateColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZDateCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TZDateCol key attribute of the instance generating the id.
	 */
	void deleteTZDateColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the IBusModelProtTZDateColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTZDateColObj refreshed cache instance.
	 */
	IBusModelProtTZDateColObj moveUpTZDateCol( IBusModelProtTZDateColObj Obj );

	/**
	 *	Move the IBusModelProtTZDateColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTZDateColObj refreshed cache instance.
	 */
	IBusModelProtTZDateColObj moveDownTZDateCol( IBusModelProtTZDateColObj Obj );
}
