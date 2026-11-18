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

public interface IBusModelProtNumberColTableObj
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
	 *	Instantiate a new NumberCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtNumberColObj newInstance();

	/**
	 *	Instantiate a new NumberCol edition of the specified NumberCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtNumberColEditObj newEditInstance( IBusModelProtNumberColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtNumberColObj realiseNumberCol( IBusModelProtNumberColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtNumberColObj createNumberCol( IBusModelProtNumberColObj Obj );

	/**
	 *	Read a NumberCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtNumberColObj readNumberCol( CFDbKeyHash256 pkey );

	/**
	 *	Read a NumberCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtNumberColObj readNumberCol( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtNumberColObj readCachedNumberCol( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeNumberCol( IBusModelProtNumberColObj obj );

	void deepDisposeNumberCol( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtNumberColObj lockNumberCol( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the NumberCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtNumberColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtNumberColObj> readAllNumberCol();

	/**
	 *	Return a sorted map of all the NumberCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtNumberColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtNumberColObj> readAllNumberCol( boolean forceRead );

	List<IBusModelProtNumberColObj> readCachedAllNumberCol();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtNumberColObj readNumberColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtNumberColObj readNumberColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtNumberColObj readNumberColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtNumberColObj readNumberColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtNumberColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNumberColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtNumberColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtNumberColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtNumberColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtNumberColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNumberColObj> readNumberColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelProtValueObj readCachedNumberColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedNumberColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedNumberColByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedNumberColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedNumberColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedNumberColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedNumberColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedNumberColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtNumberColObj>> readCachedNumberColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeNumberColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeNumberColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeNumberColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeNumberColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeNumberColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeNumberColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeNumberColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeNumberColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeNumberColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtNumberColObj updateNumberCol( IBusModelProtNumberColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberCol( IBusModelProtNumberColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the IBusModelProtNumberColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtNumberColObj refreshed cache instance.
	 */
	IBusModelProtNumberColObj moveUpNumberCol( IBusModelProtNumberColObj Obj );

	/**
	 *	Move the IBusModelProtNumberColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtNumberColObj refreshed cache instance.
	 */
	IBusModelProtNumberColObj moveDownNumberCol( IBusModelProtNumberColObj Obj );
}
