// Description: Java 25 Table Object interface for BusModel.

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

package server.markhome.ycf.v3_1.intnet.intnetobj;

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
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public interface IBusModelFloatTypeTableObj
{
	public IBusModelSchemaObj getSchema();
	public void setSchema( IBusModelSchemaObj value );

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
	 *	Instantiate a new FloatType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelFloatTypeObj newInstance();

	/**
	 *	Instantiate a new FloatType edition of the specified FloatType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelFloatTypeEditObj newEditInstance( IBusModelFloatTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelFloatTypeObj realiseFloatType( IBusModelFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelFloatTypeObj createFloatType( IBusModelFloatTypeObj Obj );

	/**
	 *	Read a FloatType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelFloatTypeObj readFloatType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a FloatType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelFloatTypeObj readFloatType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelFloatTypeObj readCachedFloatType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeFloatType( IBusModelFloatTypeObj obj );

	void deepDisposeFloatType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelFloatTypeObj lockFloatType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the FloatType-derived instances in the database.
	 *
	 *	@return	List of IBusModelFloatTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelFloatTypeObj> readAllFloatType();

	/**
	 *	Return a sorted map of all the FloatType-derived instances in the database.
	 *
	 *	@return	List of IBusModelFloatTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelFloatTypeObj> readAllFloatType( boolean forceRead );

	List<IBusModelFloatTypeObj> readCachedAllFloatType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelFloatTypeObj readFloatTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelFloatTypeObj readFloatTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelFloatTypeObj readFloatTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelFloatTypeObj readFloatTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelFloatTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelFloatTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelFloatTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelFloatTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelFloatTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelFloatTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelFloatTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelFloatTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatTypeObj> readFloatTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelFloatTypeObj readCachedFloatTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelFloatTypeObj readCachedFloatTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelFloatTypeObj> readCachedFloatTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelFloatTypeObj> readCachedFloatTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelFloatTypeObj> readCachedFloatTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelFloatTypeObj> readCachedFloatTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelFloatTypeObj> readCachedFloatTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelFloatTypeObj> readCachedFloatTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelFloatTypeObj> readCachedFloatTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeFloatTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeFloatTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeFloatTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeFloatTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeFloatTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeFloatTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeFloatTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeFloatTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeFloatTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelFloatTypeObj updateFloatType( IBusModelFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatType( IBusModelFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelFloatTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelFloatTypeObj refreshed cache instance.
	 */
	IBusModelFloatTypeObj moveUpFloatType( IBusModelFloatTypeObj Obj );

	/**
	 *	Move the BusModelFloatTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelFloatTypeObj refreshed cache instance.
	 */
	IBusModelFloatTypeObj moveDownFloatType( IBusModelFloatTypeObj Obj );
}
