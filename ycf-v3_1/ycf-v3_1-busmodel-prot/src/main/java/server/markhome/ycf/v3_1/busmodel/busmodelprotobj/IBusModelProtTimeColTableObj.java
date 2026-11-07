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

public interface IBusModelProtTimeColTableObj
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
	 *	Instantiate a new TimeCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTimeColObj newInstance();

	/**
	 *	Instantiate a new TimeCol edition of the specified TimeCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTimeColEditObj newEditInstance( IBusModelProtTimeColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimeColObj realiseTimeCol( IBusModelProtTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimeColObj createTimeCol( IBusModelProtTimeColObj Obj );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTimeColObj readTimeCol( CFDbKeyHash256 pkey );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTimeColObj readTimeCol( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTimeColObj readCachedTimeCol( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTimeCol( IBusModelProtTimeColObj obj );

	void deepDisposeTimeCol( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimeColObj lockTimeCol( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTimeColObj> readAllTimeCol();

	/**
	 *	Return a sorted map of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTimeColObj> readAllTimeCol( boolean forceRead );

	List<IBusModelProtTimeColObj> readCachedAllTimeCol();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimeColObj readTimeColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimeColObj readTimeColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimeColObj readTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTimeColObj readTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTimeColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTimeColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtTimeColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTimeColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTimeColObj> readTimeColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelProtValueObj readCachedTimeColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedTimeColByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedTimeColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedTimeColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTimeColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtTimeColObj>> readCachedTimeColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeTimeColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimeColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTimeColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTimeColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTimeColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTimeColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTimeColObj updateTimeCol( IBusModelProtTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeCol( IBusModelProtTimeColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the IBusModelProtTimeColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTimeColObj refreshed cache instance.
	 */
	IBusModelProtTimeColObj moveUpTimeCol( IBusModelProtTimeColObj Obj );

	/**
	 *	Move the IBusModelProtTimeColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTimeColObj refreshed cache instance.
	 */
	IBusModelProtTimeColObj moveDownTimeCol( IBusModelProtTimeColObj Obj );
}
