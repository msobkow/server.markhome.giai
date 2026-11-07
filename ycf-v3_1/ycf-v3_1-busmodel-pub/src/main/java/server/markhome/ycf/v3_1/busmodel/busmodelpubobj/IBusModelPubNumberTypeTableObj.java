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

public interface IBusModelPubNumberTypeTableObj
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
	 *	Instantiate a new NumberType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubNumberTypeObj newInstance();

	/**
	 *	Instantiate a new NumberType edition of the specified NumberType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubNumberTypeEditObj newEditInstance( IBusModelPubNumberTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNumberTypeObj realiseNumberType( IBusModelPubNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNumberTypeObj createNumberType( IBusModelPubNumberTypeObj Obj );

	/**
	 *	Read a NumberType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubNumberTypeObj readNumberType( ICFKeyHash256 pkey );

	/**
	 *	Read a NumberType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubNumberTypeObj readNumberType( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubNumberTypeObj readCachedNumberType( ICFKeyHash256 pkey );

	public void reallyDeepDisposeNumberType( IBusModelPubNumberTypeObj obj );

	void deepDisposeNumberType( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNumberTypeObj lockNumberType( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the NumberType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubNumberTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readAllNumberType();

	/**
	 *	Return a sorted map of all the NumberType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubNumberTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readAllNumberType( boolean forceRead );

	List<IBusModelPubNumberTypeObj> readCachedAllNumberType();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNumberTypeObj readNumberTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNumberTypeObj readNumberTypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNumberTypeObj readNumberTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubNumberTypeObj readNumberTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubNumberTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubNumberTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubNumberTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubNumberTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubNumberTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubNumberTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubNumberTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubNumberTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubNumberTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubNumberTypeObj> readNumberTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubNumberTypeObj readCachedNumberTypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubNumberTypeObj readCachedNumberTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubNumberTypeObj> readCachedNumberTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubNumberTypeObj> readCachedNumberTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubNumberTypeObj> readCachedNumberTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubNumberTypeObj> readCachedNumberTypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubNumberTypeObj> readCachedNumberTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubNumberTypeObj> readCachedNumberTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubNumberTypeObj> readCachedNumberTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeNumberTypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeNumberTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeNumberTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeNumberTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeNumberTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeNumberTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeNumberTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeNumberTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeNumberTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubNumberTypeObj updateNumberType( IBusModelPubNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberType( IBusModelPubNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubNumberTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubNumberTypeObj refreshed cache instance.
	 */
	IBusModelPubNumberTypeObj moveUpNumberType( IBusModelPubNumberTypeObj Obj );

	/**
	 *	Move the BusModelPubNumberTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubNumberTypeObj refreshed cache instance.
	 */
	IBusModelPubNumberTypeObj moveDownNumberType( IBusModelPubNumberTypeObj Obj );
}
