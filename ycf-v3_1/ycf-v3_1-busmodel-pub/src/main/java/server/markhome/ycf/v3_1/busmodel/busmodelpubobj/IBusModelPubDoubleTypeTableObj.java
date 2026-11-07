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

public interface IBusModelPubDoubleTypeTableObj
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
	 *	Instantiate a new DoubleType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDoubleTypeObj newInstance();

	/**
	 *	Instantiate a new DoubleType edition of the specified DoubleType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDoubleTypeEditObj newEditInstance( IBusModelPubDoubleTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDoubleTypeObj realiseDoubleType( IBusModelPubDoubleTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDoubleTypeObj createDoubleType( IBusModelPubDoubleTypeObj Obj );

	/**
	 *	Read a DoubleType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDoubleTypeObj readDoubleType( ICFKeyHash256 pkey );

	/**
	 *	Read a DoubleType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDoubleTypeObj readDoubleType( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDoubleTypeObj readCachedDoubleType( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDoubleType( IBusModelPubDoubleTypeObj obj );

	void deepDisposeDoubleType( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDoubleTypeObj lockDoubleType( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DoubleType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDoubleTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readAllDoubleType();

	/**
	 *	Return a sorted map of all the DoubleType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDoubleTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readAllDoubleType( boolean forceRead );

	List<IBusModelPubDoubleTypeObj> readCachedAllDoubleType();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDoubleTypeObj readDoubleTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDoubleTypeObj readDoubleTypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDoubleTypeObj readDoubleTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDoubleTypeObj readDoubleTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDoubleTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDoubleTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDoubleTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDoubleTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDoubleTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDoubleTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDoubleTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubDoubleTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDoubleTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDoubleTypeObj> readDoubleTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubDoubleTypeObj readCachedDoubleTypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDoubleTypeObj readCachedDoubleTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDoubleTypeObj> readCachedDoubleTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDoubleTypeObj> readCachedDoubleTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDoubleTypeObj> readCachedDoubleTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDoubleTypeObj> readCachedDoubleTypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDoubleTypeObj> readCachedDoubleTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDoubleTypeObj> readCachedDoubleTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubDoubleTypeObj> readCachedDoubleTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeDoubleTypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDoubleTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDoubleTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDoubleTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDoubleTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDoubleTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDoubleTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDoubleTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDoubleTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDoubleTypeObj updateDoubleType( IBusModelPubDoubleTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDoubleType( IBusModelPubDoubleTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The DoubleType key attribute of the instance generating the id.
	 */
	void deleteDoubleTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubDoubleTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDoubleTypeObj refreshed cache instance.
	 */
	IBusModelPubDoubleTypeObj moveUpDoubleType( IBusModelPubDoubleTypeObj Obj );

	/**
	 *	Move the BusModelPubDoubleTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDoubleTypeObj refreshed cache instance.
	 */
	IBusModelPubDoubleTypeObj moveDownDoubleType( IBusModelPubDoubleTypeObj Obj );
}
