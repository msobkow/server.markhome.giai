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

public interface IBusModelPubBoolTypeTableObj
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
	 *	Instantiate a new BoolType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubBoolTypeObj newInstance();

	/**
	 *	Instantiate a new BoolType edition of the specified BoolType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubBoolTypeEditObj newEditInstance( IBusModelPubBoolTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBoolTypeObj realiseBoolType( IBusModelPubBoolTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBoolTypeObj createBoolType( IBusModelPubBoolTypeObj Obj );

	/**
	 *	Read a BoolType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubBoolTypeObj readBoolType( ICFKeyHash256 pkey );

	/**
	 *	Read a BoolType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubBoolTypeObj readBoolType( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubBoolTypeObj readCachedBoolType( ICFKeyHash256 pkey );

	public void reallyDeepDisposeBoolType( IBusModelPubBoolTypeObj obj );

	void deepDisposeBoolType( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBoolTypeObj lockBoolType( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the BoolType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubBoolTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readAllBoolType();

	/**
	 *	Return a sorted map of all the BoolType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubBoolTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readAllBoolType( boolean forceRead );

	List<IBusModelPubBoolTypeObj> readCachedAllBoolType();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBoolTypeObj readBoolTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBoolTypeObj readBoolTypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBoolTypeObj readBoolTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBoolTypeObj readBoolTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubBoolTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubBoolTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubBoolTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubBoolTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubBoolTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubBoolTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubBoolTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubBoolTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolTypeObj> readBoolTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubBoolTypeObj readCachedBoolTypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubBoolTypeObj readCachedBoolTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubBoolTypeObj> readCachedBoolTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubBoolTypeObj> readCachedBoolTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubBoolTypeObj> readCachedBoolTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubBoolTypeObj> readCachedBoolTypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubBoolTypeObj> readCachedBoolTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubBoolTypeObj> readCachedBoolTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubBoolTypeObj> readCachedBoolTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeBoolTypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeBoolTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeBoolTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeBoolTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeBoolTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeBoolTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeBoolTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeBoolTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeBoolTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBoolTypeObj updateBoolType( IBusModelPubBoolTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBoolType( IBusModelPubBoolTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubBoolTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubBoolTypeObj refreshed cache instance.
	 */
	IBusModelPubBoolTypeObj moveUpBoolType( IBusModelPubBoolTypeObj Obj );

	/**
	 *	Move the BusModelPubBoolTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubBoolTypeObj refreshed cache instance.
	 */
	IBusModelPubBoolTypeObj moveDownBoolType( IBusModelPubBoolTypeObj Obj );
}
