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

public interface IBusModelPubTimeColTableObj
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
	 *	Instantiate a new TimeCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTimeColObj newInstance();

	/**
	 *	Instantiate a new TimeCol edition of the specified TimeCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTimeColEditObj newEditInstance( IBusModelPubTimeColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeColObj realiseTimeCol( IBusModelPubTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeColObj createTimeCol( IBusModelPubTimeColObj Obj );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimeColObj readTimeCol( ICFKeyHash256 pkey );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTimeColObj readTimeCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTimeColObj readCachedTimeCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTimeCol( IBusModelPubTimeColObj obj );

	void deepDisposeTimeCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeColObj lockTimeCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimeColObj> readAllTimeCol();

	/**
	 *	Return a sorted map of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTimeColObj> readAllTimeCol( boolean forceRead );

	List<IBusModelPubTimeColObj> readCachedAllTimeCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeColObj readTimeColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeColObj readTimeColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeColObj readTimeColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTimeColObj readTimeColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTimeColObj> readTimeColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubTimeColObj readCachedTimeColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTimeColObj readCachedTimeColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTimeColObj> readCachedTimeColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTimeColObj> readCachedTimeColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTimeColObj> readCachedTimeColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTimeColObj> readCachedTimeColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTimeColObj> readCachedTimeColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTimeColObj> readCachedTimeColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTimeColObj> readCachedTimeColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeTimeColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTimeColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimeColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTimeColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTimeColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTimeColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTimeColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTimeColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTimeColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTimeColObj updateTimeCol( IBusModelPubTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeCol( IBusModelPubTimeColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByScopeIdx( CFDbKeyHash256 ScopeId );

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
	void deleteTimeColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubTimeColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimeColObj refreshed cache instance.
	 */
	IBusModelPubTimeColObj moveUpTimeCol( IBusModelPubTimeColObj Obj );

	/**
	 *	Move the BusModelPubTimeColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTimeColObj refreshed cache instance.
	 */
	IBusModelPubTimeColObj moveDownTimeCol( IBusModelPubTimeColObj Obj );
}
