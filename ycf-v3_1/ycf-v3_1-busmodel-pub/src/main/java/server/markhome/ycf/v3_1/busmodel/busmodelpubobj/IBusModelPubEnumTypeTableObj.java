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

public interface IBusModelPubEnumTypeTableObj
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
	 *	Instantiate a new EnumType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubEnumTypeObj newInstance();

	/**
	 *	Instantiate a new EnumType edition of the specified EnumType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubEnumTypeEditObj newEditInstance( IBusModelPubEnumTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubEnumTypeObj realiseEnumType( IBusModelPubEnumTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubEnumTypeObj createEnumType( IBusModelPubEnumTypeObj Obj );

	/**
	 *	Read a EnumType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubEnumTypeObj readEnumType( ICFKeyHash256 pkey );

	/**
	 *	Read a EnumType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubEnumTypeObj readEnumType( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubEnumTypeObj readCachedEnumType( ICFKeyHash256 pkey );

	public void reallyDeepDisposeEnumType( IBusModelPubEnumTypeObj obj );

	void deepDisposeEnumType( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubEnumTypeObj lockEnumType( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the EnumType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubEnumTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readAllEnumType();

	/**
	 *	Return a sorted map of all the EnumType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubEnumTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readAllEnumType( boolean forceRead );

	List<IBusModelPubEnumTypeObj> readCachedAllEnumType();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubEnumTypeObj readEnumTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubEnumTypeObj readEnumTypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubEnumTypeObj readEnumTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubEnumTypeObj readEnumTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubEnumTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubEnumTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubEnumTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubEnumTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubEnumTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubEnumTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubEnumTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubEnumTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumTypeObj> readEnumTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubEnumTypeObj readCachedEnumTypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubEnumTypeObj readCachedEnumTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubEnumTypeObj> readCachedEnumTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubEnumTypeObj> readCachedEnumTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubEnumTypeObj> readCachedEnumTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubEnumTypeObj> readCachedEnumTypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubEnumTypeObj> readCachedEnumTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubEnumTypeObj> readCachedEnumTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubEnumTypeObj> readCachedEnumTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeEnumTypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeEnumTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeEnumTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeEnumTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeEnumTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeEnumTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeEnumTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeEnumTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeEnumTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubEnumTypeObj updateEnumType( IBusModelPubEnumTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumType( IBusModelPubEnumTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubEnumTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubEnumTypeObj refreshed cache instance.
	 */
	IBusModelPubEnumTypeObj moveUpEnumType( IBusModelPubEnumTypeObj Obj );

	/**
	 *	Move the BusModelPubEnumTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubEnumTypeObj refreshed cache instance.
	 */
	IBusModelPubEnumTypeObj moveDownEnumType( IBusModelPubEnumTypeObj Obj );
}
