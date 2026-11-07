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

package server.markhome.ycf.v3_1.intnet.intnetpubobj;

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

public interface IBusModelPubInt16ColTableObj
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
	 *	Instantiate a new Int16Col instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubInt16ColObj newInstance();

	/**
	 *	Instantiate a new Int16Col edition of the specified Int16Col instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubInt16ColEditObj newEditInstance( IBusModelPubInt16ColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubInt16ColObj realiseInt16Col( IBusModelPubInt16ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubInt16ColObj createInt16Col( IBusModelPubInt16ColObj Obj );

	/**
	 *	Read a Int16Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubInt16ColObj readInt16Col( ICFKeyHash256 pkey );

	/**
	 *	Read a Int16Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubInt16ColObj readInt16Col( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubInt16ColObj readCachedInt16Col( ICFKeyHash256 pkey );

	public void reallyDeepDisposeInt16Col( IBusModelPubInt16ColObj obj );

	void deepDisposeInt16Col( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubInt16ColObj lockInt16Col( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Int16Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubInt16ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubInt16ColObj> readAllInt16Col();

	/**
	 *	Return a sorted map of all the Int16Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubInt16ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubInt16ColObj> readAllInt16Col( boolean forceRead );

	List<IBusModelPubInt16ColObj> readCachedAllInt16Col();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubInt16ColObj readInt16ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubInt16ColObj readInt16ColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubInt16ColObj readInt16ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubInt16ColObj readInt16ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubInt16ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubInt16ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubInt16ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubInt16ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubInt16ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubInt16ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubInt16ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubInt16ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubInt16ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubInt16ColObj> readInt16ColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubInt16ColObj readCachedInt16ColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubInt16ColObj readCachedInt16ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubInt16ColObj> readCachedInt16ColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubInt16ColObj> readCachedInt16ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubInt16ColObj> readCachedInt16ColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubInt16ColObj> readCachedInt16ColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubInt16ColObj> readCachedInt16ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubInt16ColObj> readCachedInt16ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubInt16ColObj> readCachedInt16ColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeInt16ColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeInt16ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeInt16ColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeInt16ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeInt16ColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeInt16ColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeInt16ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeInt16ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeInt16ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubInt16ColObj updateInt16Col( IBusModelPubInt16ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt16Col( IBusModelPubInt16ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Int16Col key attribute of the instance generating the id.
	 */
	void deleteInt16ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int16Col key attribute of the instance generating the id.
	 */
	void deleteInt16ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 */
	void deleteInt16ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Int16Col key attribute of the instance generating the id.
	 */
	void deleteInt16ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Int16Col key attribute of the instance generating the id.
	 */
	void deleteInt16ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Int16Col key attribute of the instance generating the id.
	 */
	void deleteInt16ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int16Col key attribute of the instance generating the id.
	 */
	void deleteInt16ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int16Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int16Col key attribute of the instance generating the id.
	 */
	void deleteInt16ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Int16Col key attribute of the instance generating the id.
	 */
	void deleteInt16ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubInt16ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubInt16ColObj refreshed cache instance.
	 */
	IBusModelPubInt16ColObj moveUpInt16Col( IBusModelPubInt16ColObj Obj );

	/**
	 *	Move the BusModelPubInt16ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubInt16ColObj refreshed cache instance.
	 */
	IBusModelPubInt16ColObj moveDownInt16Col( IBusModelPubInt16ColObj Obj );
}
