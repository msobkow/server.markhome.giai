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

public interface IBusModelPubUInt32ColTableObj
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
	 *	Instantiate a new UInt32Col instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubUInt32ColObj newInstance();

	/**
	 *	Instantiate a new UInt32Col edition of the specified UInt32Col instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubUInt32ColEditObj newEditInstance( IBusModelPubUInt32ColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32ColObj realiseUInt32Col( IBusModelPubUInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32ColObj createUInt32Col( IBusModelPubUInt32ColObj Obj );

	/**
	 *	Read a UInt32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUInt32ColObj readUInt32Col( ICFKeyHash256 pkey );

	/**
	 *	Read a UInt32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubUInt32ColObj readUInt32Col( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubUInt32ColObj readCachedUInt32Col( ICFKeyHash256 pkey );

	public void reallyDeepDisposeUInt32Col( IBusModelPubUInt32ColObj obj );

	void deepDisposeUInt32Col( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32ColObj lockUInt32Col( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the UInt32Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readAllUInt32Col();

	/**
	 *	Return a sorted map of all the UInt32Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubUInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readAllUInt32Col( boolean forceRead );

	List<IBusModelPubUInt32ColObj> readCachedAllUInt32Col();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32ColObj readUInt32ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32ColObj readUInt32ColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32ColObj readUInt32ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubUInt32ColObj readUInt32ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubUInt32ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubUInt32ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUInt32ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUInt32ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubUInt32ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubUInt32ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubUInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubUInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubUInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubUInt32ColObj> readUInt32ColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubUInt32ColObj readCachedUInt32ColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubUInt32ColObj readCachedUInt32ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubUInt32ColObj> readCachedUInt32ColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubUInt32ColObj> readCachedUInt32ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubUInt32ColObj> readCachedUInt32ColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubUInt32ColObj> readCachedUInt32ColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubUInt32ColObj> readCachedUInt32ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubUInt32ColObj> readCachedUInt32ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubUInt32ColObj> readCachedUInt32ColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeUInt32ColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeUInt32ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeUInt32ColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeUInt32ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUInt32ColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUInt32ColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUInt32ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUInt32ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUInt32ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubUInt32ColObj updateUInt32Col( IBusModelPubUInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt32Col( IBusModelPubUInt32ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubUInt32ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUInt32ColObj refreshed cache instance.
	 */
	IBusModelPubUInt32ColObj moveUpUInt32Col( IBusModelPubUInt32ColObj Obj );

	/**
	 *	Move the BusModelPubUInt32ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubUInt32ColObj refreshed cache instance.
	 */
	IBusModelPubUInt32ColObj moveDownUInt32Col( IBusModelPubUInt32ColObj Obj );
}
