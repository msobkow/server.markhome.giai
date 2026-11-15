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

public interface IBusModelPubTZTimestampTypeTableObj
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
	 *	Instantiate a new TZTimestampType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTZTimestampTypeObj newInstance();

	/**
	 *	Instantiate a new TZTimestampType edition of the specified TZTimestampType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTZTimestampTypeEditObj newEditInstance( IBusModelPubTZTimestampTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimestampTypeObj realiseTZTimestampType( IBusModelPubTZTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimestampTypeObj createTZTimestampType( IBusModelPubTZTimestampTypeObj Obj );

	/**
	 *	Read a TZTimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTZTimestampTypeObj readTZTimestampType( ICFKeyHash256 pkey );

	/**
	 *	Read a TZTimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTZTimestampTypeObj readTZTimestampType( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTZTimestampTypeObj readCachedTZTimestampType( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTZTimestampType( IBusModelPubTZTimestampTypeObj obj );

	void deepDisposeTZTimestampType( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimestampTypeObj lockTZTimestampType( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TZTimestampType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTZTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readAllTZTimestampType();

	/**
	 *	Return a sorted map of all the TZTimestampType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTZTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readAllTZTimestampType( boolean forceRead );

	List<IBusModelPubTZTimestampTypeObj> readCachedAllTZTimestampType();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimestampTypeObj readTZTimestampTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimestampTypeObj readTZTimestampTypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimestampTypeObj readTZTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimestampTypeObj readTZTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTZTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTZTimestampTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTZTimestampTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTZTimestampTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTZTimestampTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTZTimestampTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTZTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubTZTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampTypeObj> readTZTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubTZTimestampTypeObj readCachedTZTimestampTypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTZTimestampTypeObj readCachedTZTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTZTimestampTypeObj> readCachedTZTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTZTimestampTypeObj> readCachedTZTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTZTimestampTypeObj> readCachedTZTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTZTimestampTypeObj> readCachedTZTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTZTimestampTypeObj> readCachedTZTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTZTimestampTypeObj> readCachedTZTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTZTimestampTypeObj> readCachedTZTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeTZTimestampTypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTZTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTZTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTZTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTZTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTZTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTZTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTZTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTZTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimestampTypeObj updateTZTimestampType( IBusModelPubTZTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimestampType( IBusModelPubTZTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TZTimestampType key attribute of the instance generating the id.
	 */
	void deleteTZTimestampTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubTZTimestampTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTZTimestampTypeObj refreshed cache instance.
	 */
	IBusModelPubTZTimestampTypeObj moveUpTZTimestampType( IBusModelPubTZTimestampTypeObj Obj );

	/**
	 *	Move the BusModelPubTZTimestampTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTZTimestampTypeObj refreshed cache instance.
	 */
	IBusModelPubTZTimestampTypeObj moveDownTZTimestampType( IBusModelPubTZTimestampTypeObj Obj );
}
